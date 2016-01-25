/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.design.perpetual.ecobeethermostat.app.authorization;

import com.design.perpetual.ecobeethermostat.app.enums.ErrorCode;
import com.design.perpetual.ecobeethermostat.app.exceptions.EmptyAppKeyException;
import com.design.perpetual.ecobeethermostat.app.exceptions.EmptyAuthorizationException;
import com.design.perpetual.ecobeethermostat.app.exceptions.NullAppKeyException;
import com.design.perpetual.ecobeethermostat.app.exceptions.NullAuthorizationException;
import com.design.perpetual.ecobeethermostat.app.exceptions.TemplateErrorHandler;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.net.URI;
import java.nio.charset.Charset;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @author MacDerson
 */
public class TokenRefresh implements Callable<Map<Class<?>, Object>> {

  private static final String BASE_URL = "https://api.ecobee.com/token?grant_type=ecobeePin&code=";
  private AuthorizationToken authorization;
  private String appKey;
  private long lastRequestTs;
  private ObjectMapper mapper;

  public TokenRefresh() {
    lastRequestTs = -1;
  }

  public TokenRefresh(AuthorizationToken autho, String appKey) throws
      EmptyAuthorizationException, NullAppKeyException,
      NullAuthorizationException, EmptyAppKeyException {
    lastRequestTs = -1;
    this.authorization = autho;
    this.appKey = appKey;

    validateAuthorization();
    validateAppKey();
  }

  public void setAuthorization(AuthorizationToken autho) throws
      EmptyAuthorizationException, NullAuthorizationException {
    this.authorization = autho;
    validateAuthorization();
  }

  public void setAppKey(String appKey) throws NullAppKeyException,
      EmptyAppKeyException {
    this.appKey = appKey;
    validateAppKey();
  }

  @Override
  public Map<Class<?>, Object> call() throws Exception {
    if (!isValidInterval()) {
      return null;
    }
    List<Charset> charsets = new ArrayList(1);
    charsets.add(Charset.forName("UTF-8"));
    List<MediaType> mediaTypes = new ArrayList(1);
    mediaTypes.add(MediaType.APPLICATION_JSON);

    HttpHeaders headers = new HttpHeaders();
    headers.setAcceptCharset(charsets);
    headers.setAccept(mediaTypes);

    String url = BASE_URL + authorization.
        getCode() + "&client_id=" + appKey;

    RestTemplate template = new RestTemplate();
    template.setErrorHandler(new TemplateErrorHandler());
    lastRequestTs = Instant.now().toEpochMilli();
    ResponseEntity<String> response = template.
        postForEntity(URI.create(url), new HttpEntity<String>(headers), String.class);

    String responseBody = response.getBody();

    Map<Class<?>, Object> mapping = new HashMap();
    if (ErrorCode.hasError(response.getStatusCode())) {
      Error error = mapper.readValue(responseBody, Error.class);
      mapping.put(Error.class, error);
    } else {
      Tokens tokens = mapper.readValue(responseBody, Tokens.class);
      mapping.put(Tokens.class, tokens);
    }
    return mapping;
  }

  private void validateAuthorization() throws EmptyAuthorizationException,
      NullAuthorizationException {
    if (Objects.isNull(authorization)) {
      throw new NullAuthorizationException();
    } else if (Objects.isNull(authorization.getCode()) || authorization.
        getCode().isEmpty()) {
      throw new EmptyAuthorizationException("Authorization code is null or is empty: " + authorization.
          getCode());
    }
  }

  private void validateAppKey() throws NullAppKeyException,
      EmptyAppKeyException {
    if (Objects.isNull(appKey)) {
      throw new NullAppKeyException();
    } else if (appKey.isEmpty()) {
      throw new EmptyAppKeyException();
    }
  }

  private boolean isValidInterval() {
    long currTs = Instant.now().toEpochMilli();

    long res = currTs - lastRequestTs;
    return res >= authorization.getInterval();
  }

}
