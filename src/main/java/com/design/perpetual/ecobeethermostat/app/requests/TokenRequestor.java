package com.design.perpetual.ecobeethermostat.app.requests;


import com.design.perpetual.ecobeethermostat.app.authorization.AppKey;
import com.design.perpetual.ecobeethermostat.app.authorization.AuthorizationToken;
import com.design.perpetual.ecobeethermostat.app.authorization.Tokens;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

/**
 * Created by maclo on 1/23/2016.
 */
public class TokenRequestor {

  private static final String URL = "https://api.ecobee.com/token?grant_type=ecobeePin&code=%s&client_id=%s";

  private AuthorizationToken authorizationToken;
  private AppKey appKey;

  public TokenRequestor(AuthorizationToken authorizationToken, AppKey appKey) {
    this.authorizationToken = authorizationToken;
    this.appKey = appKey;
  }

  public Optional<Tokens> getTokens() {
    if (appKey.isValidKey()) {
      HttpEntity<String> request = new HttpEntity(Requestor.setAuthorizationHeader());
      RestTemplate restTemplate = new RestTemplate();
      String url = String.format(URL, authorizationToken.getCode(), appKey.getKey());
      ResponseEntity<Tokens> response = restTemplate.exchange(url, HttpMethod.POST, request, Tokens.class);
      return Optional.ofNullable(response.getBody());
    }
    return Optional.empty();
  }

}
