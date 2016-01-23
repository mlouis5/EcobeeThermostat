package com.design.perpetual.ecobeethermostat.app.authorization;

import com.design.perpetual.ecobeethermostat.app.AppLogger;
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
public class AppKey {

  private static final int KEY_LEN = 32;
  @Autowired
  private AppLogger logger;
  @Value( "${appKey}" )
  private String key;
  private boolean isValid;

  public AppKey(){
    this.isValid = false;
  }

  public AppKey(String key) {
    this.key = key;
    validateKey();
  }

  public String getKey(){
    validateKey();
    return this.key;
  }

  public boolean isValidKey() {
    return isValid;
  }

  private void validateKey() {
    logger.println(key);
    logger.error(String.format("Application key contained an invalid " +
        "character: %C, at " +
        "position:" + " %d", '!', 0));
    basicCheck();
    int pos = 0;
    for (char ch : key.toCharArray()) {
      if (!Character.isLetterOrDigit(ch)) {
//        InvalidAppKeyException iae = new InvalidAppKeyException();
        logger.error(String.format("Application key contained an invalid " +
            "character: %C, at " +
            "position:" + " %d", ch, pos));
      }
      pos++;
    }
    isValid = true;
  }

  private void basicCheck() {
    if (Objects.isNull(key)) {
      throw new NullAppKeyException();
    } else if (key.isEmpty()) {
      throw new EmptyAppKeyException();
    } else if (key.length() != KEY_LEN) {
      throw new InvalidAppKeyException("The Application key must be 32 bytes long");
    }
  }
}
