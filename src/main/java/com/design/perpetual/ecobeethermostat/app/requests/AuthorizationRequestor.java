/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.design.perpetual.ecobeethermostat.app.requests;

import com.design.perpetual.ecobeethermostat.app.authorization.AppKey;
import com.design.perpetual.ecobeethermostat.app.authorization.AuthorizationToken;
import com.design.perpetual.ecobeethermostat.app.authorization.Tokens;
import com.design.perpetual.ecobeethermostat.app.exceptions.NullAppKeyException;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
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

  public Optional<AuthorizationToken> getAuthorization() {
    if(appKey.isValidKey()) {
      HttpEntity<String> request = new HttpEntity(Requestor.setAuthorizationHeader());
      RestTemplate restTemplate = new RestTemplate();
      String url = String.format(URL, appKey.getKey());
      ResponseEntity<AuthorizationToken> response = restTemplate.exchange(url, HttpMethod.POST, request, AuthorizationToken.class);
      return Optional.ofNullable(response.getBody());
    }
    return Optional.empty();
  }

  private void validateAppKey() {
    if (Objects.isNull(appKey)) {
      throw new NullAppKeyException();
    }
  }
}
