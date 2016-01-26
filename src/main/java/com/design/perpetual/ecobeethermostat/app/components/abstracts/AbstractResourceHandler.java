package com.design.perpetual.ecobeethermostat.app.components.abstracts;

import com.design.perpetual.ecobeethermostat.app.authorization.utils.TokenStore;
import com.design.perpetual.ecobeethermostat.app.components.Resource;
import com.design.perpetual.ecobeethermostat.app.components.ResourceHandler;
import com.design.perpetual.ecobeethermostat.app.requests.GenericRequestor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;

import java.util.Objects;
import java.util.Optional;

/**
 * Created by maclo on 1/25/2016.
 */
@Component
public abstract class AbstractResourceHandler<R extends Resource> implements ResourceHandler<R> {

  @Autowired
  private GenericRequestor genericRequestor;
  @Autowired
  private TokenStore tokenStore;

  @Override
  public Optional<R> get(R t) {
    HttpEntity<String> request = new HttpEntity(GenericRequestor.setAuthorizationHeader(tokenStore
        .getAccessRefreshTokens()));
    return exchange(HttpMethod.GET, t, request);
  }

  @Override
  public Optional<R> post(R t) {
    HttpEntity<String> request = new HttpEntity(GenericRequestor.setAuthorizationHeader(tokenStore
        .getAccessRefreshTokens()));
    return exchange(HttpMethod.POST, t, request);
  }

  @Override
  public Optional<R> exchange(HttpMethod method, R t, HttpEntity<String> headers) {
    if (Objects.nonNull(method) && Objects.nonNull(t)) {
      String url = String.format("%s%s", t.getBase(), t.getUri());
      if (!url.isEmpty()) {
        return (Optional<R>) genericRequestor.request(url, method, t.getClass(), headers);
      }
    }
    return Optional.empty();
  }
}
