package com.design.perpetual.ecobeethermostat.app.requests;

import com.design.perpetual.ecobeethermostat.app.authorization.impl.Tokens;
import com.design.perpetual.ecobeethermostat.app.authorization.utils.TokenStore;
import com.design.perpetual.ecobeethermostat.app.components.Resource;
import com.design.perpetual.ecobeethermostat.app.handlers.TemplateErrorHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Objects;
import java.util.Optional;

/**
 * Created by maclo on 1/24/2016.
 */
@Component
public class GenericRequestor {

  @Autowired
  private TokenStore tokenStore;
  @Autowired
  private TemplateErrorHandler templateErrorHandler;

  public Optional<?> request(String url, HttpMethod reqType, Class<?> type, HttpEntity<String>
      headers){
    if(Objects.nonNull(tokenStore)) {
      Tokens tokens = tokenStore.getAccessRefreshTokens();
      if(Objects.nonNull(tokens) && tokens.isValidToken()) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.setErrorHandler(templateErrorHandler);
        ResponseEntity<?> response = restTemplate.exchange(url, reqType, headers, type);
        return Optional.ofNullable(response.getBody());
      }
    }
    return Optional.empty();
  }

  public static HttpHeaders setAuthorizationHeader(Tokens tokens) {
    HttpHeaders headers = new HttpHeaders();
    headers.add("Content-Type", "application/json;charset=UTF-8");
    headers.add("Authorization", String.format("%s %s", tokens.getTokenType(), tokens.getAccessToken()));
    return headers;
  }

  public static HttpHeaders setContentTypeHeader() {
    HttpHeaders headers = new HttpHeaders();
    headers.add("Content-Type", "application/json;charset=UTF-8");
    return headers;
  }
}
