/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.design.perpetual.ecobeethermostat.app.requests;

import com.design.perpetual.ecobeethermostat.app.authorization.impl.AppKey;
import com.design.perpetual.ecobeethermostat.app.authorization.impl.AuthorizationToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * @author MacDerson
 */
@Component
public class AuthorizationTokenRequestor {

  private static final String URL = "https://api.ecobee" +
      ".com/authorize?response_type=ecobeePin&client_id=%s&scope=smartWrite";
  @Autowired
  private GenericRequestor genericRequestor;

  public Optional<AuthorizationToken> getAuthorization(AppKey appKey) {
    if (appKey.isValidToken()) {
      HttpEntity<String> request = new HttpEntity(GenericRequestor.setContentTypeHeader());
      String url = String.format(URL, appKey.getToken());

      return (Optional<AuthorizationToken>) genericRequestor.request(url, HttpMethod.POST, AuthorizationToken.class,
          request);
    }
    return Optional.empty();
  }
}
