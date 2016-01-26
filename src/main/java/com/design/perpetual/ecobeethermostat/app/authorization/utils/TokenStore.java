package com.design.perpetual.ecobeethermostat.app.authorization.utils;

import com.design.perpetual.ecobeethermostat.app.authorization.impl.AppKey;
import com.design.perpetual.ecobeethermostat.app.authorization.impl.AuthorizationToken;
import com.design.perpetual.ecobeethermostat.app.authorization.impl.Tokens;
import com.design.perpetual.ecobeethermostat.app.requests.GenericRequestor;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Objects;
import java.util.Optional;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by maclo on 1/25/2016.
 */
@Component
public class TokenStore {

  private static final String URL = "https://api.ecobee" + "" +
      ".com/token?grant_type=refresh_token&refresh_token=%s&client_id=%s";

  private static final int SECONDS_AHEAD = 1;

  private AppKey appKey;
  private AuthorizationToken authorizationToken;
  private Tokens accessRefreshTokens;

  private Timer refreshTimer;
  private RefreshTokenTask refreshTokenTask;

  public TokenStore() {
    refreshTokenTask = new RefreshTokenTask();
  }

  public AuthorizationToken getAuthorizationToken() {
    return authorizationToken;
  }

  public void setAuthorizationToken(AuthorizationToken authorizationToken) {
    this.authorizationToken = authorizationToken;
  }

  public Tokens getAccessRefreshTokens() {
    return accessRefreshTokens;
  }

  public void setAccessRefreshTokens(Tokens accessRefreshTokens) {
    this.accessRefreshTokens = accessRefreshTokens;
    initRefreshTokenTask();
  }

  public AppKey getAppKey() {
    return appKey;
  }

  public void setAppKey(AppKey appKey) {
    this.appKey = appKey;
  }

  private void initRefreshTokenTask() {
    if (Objects.nonNull(this.accessRefreshTokens) && Objects.nonNull(appKey)) {
      if (appKey.isValidToken() && this.accessRefreshTokens.isValidToken()) {
        long timeToExpiry = (accessRefreshTokens.getExpiresIn() - SECONDS_AHEAD);
        if (timeToExpiry > 0) {
          if (Objects.nonNull(this.refreshTimer)) {
            this.refreshTimer.cancel();
            this.refreshTimer.purge();
          }
          timeToExpiry *= 1000;
          refreshTimer = new Timer();
          refreshTimer.schedule(refreshTokenTask, timeToExpiry, timeToExpiry);
        }
      }
    }
  }

  private class RefreshTokenTask extends TimerTask {
    @Override
    public void run() {
      RestTemplate restTemplate = new RestTemplate();
      HttpEntity<String> request = new HttpEntity(GenericRequestor.setAuthorizationHeader(accessRefreshTokens));
      String url = String.format(URL, accessRefreshTokens.getRefreshToken(), appKey.getToken());
      ResponseEntity<Tokens> response = restTemplate.exchange(url, HttpMethod.POST, request, Tokens.class);
      Optional.ofNullable(response.getBody()).ifPresent(t -> accessRefreshTokens = t.isValidToken() ? t :
          accessRefreshTokens);
    }
  }
}
