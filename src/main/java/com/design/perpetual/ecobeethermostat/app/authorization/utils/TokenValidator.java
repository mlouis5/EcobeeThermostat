package com.design.perpetual.ecobeethermostat.app.authorization.utils;

import com.design.perpetual.ecobeethermostat.app.AppLogger;
import com.design.perpetual.ecobeethermostat.app.exceptions.EmptyAppKeyException;
import com.design.perpetual.ecobeethermostat.app.exceptions.InvalidAppKeyException;
import com.design.perpetual.ecobeethermostat.app.exceptions.NullAppKeyException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Objects;

/**
 * Created by maclo on 1/25/2016.
 */
@Component
public class TokenValidator {

  private static final int KEY_LEN = 32;

  @Autowired
  private AppLogger logger;

  public void isValidToken(String token) {
    logger.println(token);
    basicCheck(token);
    int pos = 0;
    for (char ch : token.toCharArray()) {
      if (!Character.isLetterOrDigit(ch)) {
        logger.error(String.format("Application token contained an invalid " +
            "character: %C, at " +
            "position:" + " %d", ch, pos));
      }
      pos++;
    }
  }

  private void basicCheck(String token) {
    if (Objects.isNull(token)) {
      throw new NullAppKeyException();
    } else if (token.isEmpty()) {
      throw new EmptyAppKeyException();
    } else if (token.length() != KEY_LEN) {
      throw new InvalidAppKeyException("The Application key must be 32 bytes long");
    }
  }
}
