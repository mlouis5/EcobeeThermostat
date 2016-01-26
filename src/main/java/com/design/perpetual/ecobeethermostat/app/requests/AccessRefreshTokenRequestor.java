package com.design.perpetual.ecobeethermostat.app.requests;


import com.design.perpetual.ecobeethermostat.app.authorization.impl.AppKey;
import com.design.perpetual.ecobeethermostat.app.authorization.impl.AuthorizationToken;
import com.design.perpetual.ecobeethermostat.app.authorization.impl.Tokens;
import com.design.perpetual.ecobeethermostat.app.authorization.utils.TokenStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Objects;
import java.util.Optional;

/**
 * Created by maclo on 1/23/2016.
 */
@Component
public class AccessRefreshTokenRequestor {

  private static final String URL = "https://api.ecobee.com/token?grant_type=ecobeePin&code=%s&client_id=%s";

  @Autowired
  private TokenStore tokenStore;
  @Autowired
  private GenericRequestor genericRequestor;

  public void fetchTokens(AuthorizationToken authorizationToken, AppKey appKey) {
    if(Objects.nonNull(authorizationToken) && Objects.nonNull(appKey)) {
      if (authorizationToken.isValidToken() && appKey.isValidToken()) {
        HttpEntity<String> request = new HttpEntity(GenericRequestor.setContentTypeHeader());
        String url = String.format(URL, authorizationToken.getCode(), appKey.getToken());

        Optional<Tokens> optTokens = (Optional<Tokens>) genericRequestor.request(url, HttpMethod.POST, Tokens.class, request);
        if (optTokens.isPresent()) {
          tokenStore.setAuthorizationToken(authorizationToken);
          tokenStore.setAppKey(appKey);
          tokenStore.setAccessRefreshTokens(optTokens.get());
        }
      }
    }
  }

}
