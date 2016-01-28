package com.design.perpetual.ecobeethermostat.app.components.abstracts;

import com.design.perpetual.ecobeethermostat.app.authorization.utils.TokenStore;
import com.design.perpetual.ecobeethermostat.app.components.Resource;
import com.design.perpetual.ecobeethermostat.app.components.ResourceHandler;
import com.design.perpetual.ecobeethermostat.app.requests.GenericRequestor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;

import java.util.Objects;
import java.util.Optional;

/**
 * Created by maclo on 1/27/2016.
 */
public class AbstractResource<R> implements Resource, ResourceHandler<R> {

  @Value( "${url.current.base}" )
  private final String base = "";
  private final String uri;

  @Autowired
  private GenericRequestor genericRequestor;
  @Autowired
  private TokenStore tokenStore;

  public AbstractResource(String uri){
    this.uri = uri;
  }

  @Override
  public String getBase() {
    return this.base;
  }

  @Override
  public String getUri() {
    return this.uri;
  }

  @Override
  public Optional<R> get() {
    HttpEntity<String> request = new HttpEntity(GenericRequestor.setAuthorizationHeader(tokenStore
        .getAccessRefreshTokens()));
    return exchange(HttpMethod.GET, request);
  }

  @Override
  public Optional<R> post() {
    HttpEntity<String> request = new HttpEntity(GenericRequestor.setAuthorizationHeader(tokenStore
        .getAccessRefreshTokens()));
    return exchange(HttpMethod.POST, request);
  }

  @Override
  public Optional<R> exchange(HttpMethod method, HttpEntity<String> headers) {
    if (Objects.nonNull(method)) {
      String url = String.format("%s%s", getBase(), getUri());
      if (!url.isEmpty()) {
        return (Optional<R>) genericRequestor.request(url, method, getClass(), headers);
      }
    }
    return Optional.empty();
  }
}
