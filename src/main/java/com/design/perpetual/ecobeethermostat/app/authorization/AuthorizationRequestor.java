/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.design.perpetual.ecobeethermostat.app.authorization;

import com.design.perpetual.ecobeethermostat.app.exceptions.EmptyAppKeyException;
import com.design.perpetual.ecobeethermostat.app.exceptions.NullAppKeyException;
import org.springframework.web.client.RestTemplate;

import java.util.Objects;
import java.util.Optional;

/**
 * @author MacDerson
 */
public class AuthorizationRequestor {

  private static final String URL = "https://api.ecobee.com/authorize?response_type=ecobeePin&client_id=%s&scope=smartWrite";

  private AppKey appKey;

  public AuthorizationRequestor(AppKey appKey) {
    this.appKey = appKey;
    validateAppKey();
  }

  public Optional<PinAuthorization> getAuthorization() {
    if(appKey.isValidKey()) {
      RestTemplate template = new RestTemplate();

      String url = String.format(URL, appKey.getKey());
      return Optional.ofNullable(template.getForObject(url, PinAuthorization.class));
    }
    return Optional.empty();
  }

  private void validateAppKey() {
    if (Objects.isNull(appKey)) {
      throw new NullAppKeyException();
    }
  }
}
