package com.design.perpetual.ecobeethermostat.app.authorization.impl;

import com.design.perpetual.ecobeethermostat.app.AppLogger;
import com.design.perpetual.ecobeethermostat.app.authorization.Token;
import com.design.perpetual.ecobeethermostat.app.authorization.utils.TokenValidator;
import com.design.perpetual.ecobeethermostat.app.exceptions.EmptyAppKeyException;
import com.design.perpetual.ecobeethermostat.app.exceptions.InvalidAppKeyException;
import com.design.perpetual.ecobeethermostat.app.exceptions.NullAppKeyException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Objects;

/**
 * Created by maclo on 1/23/2016.
 */
@Component
public class AppKey implements Token {

  private static final int KEY_LEN = 32;
  @Autowired
  private TokenValidator tokenValidator;
  @Value( "${appKey}" )
  private String key;
  private boolean isValid;

  public AppKey(){
    this.isValid = false;
  }

  public AppKey(String key) {
    this.key = key;
    tokenValidator.isValidToken(this.key);
  }

  public String getToken(){
    tokenValidator.isValidToken(this.key);
    return this.key;
  }

  @Override
  public boolean isValidToken() {
    try{
      tokenValidator.isValidToken(this.key);
      return true;
    }catch (Exception e){
      return false;
    }
  }
}
