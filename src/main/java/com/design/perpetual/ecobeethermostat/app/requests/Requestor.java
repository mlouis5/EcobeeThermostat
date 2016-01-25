package com.design.perpetual.ecobeethermostat.app.requests;

import com.design.perpetual.ecobeethermostat.app.authorization.AuthorizationToken;
import com.design.perpetual.ecobeethermostat.app.authorization.Tokens;
import org.apache.tomcat.util.net.URL;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

/**
 * Created by maclo on 1/24/2016.
 */
public class Requestor {

  private <T> Optional<T> request(String url, HttpMethod reqType, Tokens tokens, Class<T> type){
    HttpEntity<String> request = new HttpEntity(setAuthorizationHeader(tokens));
    RestTemplate restTemplate = new RestTemplate();
    ResponseEntity<T> response = restTemplate.exchange(url, reqType, request, type);
    return Optional.ofNullable(response.getBody());
  }

  public static HttpHeaders setAuthorizationHeader(Tokens tokens) {
    HttpHeaders headers = new HttpHeaders();
    headers.add("Content-Type", "application/json;charset=UTF-8");
    headers.add("Authorization", String.format("%s %s", tokens.getTokenType(), tokens.getAccessToken()));
    return headers;
  }

  public static HttpHeaders setAuthorizationHeader() {
    HttpHeaders headers = new HttpHeaders();
    headers.add("Content-Type", "application/json;charset=UTF-8");
    return headers;
  }
}
