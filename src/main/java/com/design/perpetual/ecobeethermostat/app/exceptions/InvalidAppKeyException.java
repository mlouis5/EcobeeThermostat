package com.design.perpetual.ecobeethermostat.app.exceptions;

/**
 * Created by maclo on 1/23/2016.
 */
public class InvalidAppKeyException extends RuntimeException {

  public InvalidAppKeyException() {
    super();
  }

  public InvalidAppKeyException(String message) {
    super(message);
  }

  public InvalidAppKeyException(String message, Throwable cause) {
    super(message, cause);
  }

  public InvalidAppKeyException(Throwable cause) {
    super(cause);
  }

  public InvalidAppKeyException(String message, Throwable cause, boolean enableSuppression, boolean
      writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }
}
