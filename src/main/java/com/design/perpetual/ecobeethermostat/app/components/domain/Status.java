package com.design.perpetual.ecobeethermostat.app.components.domain;

/**
 * Created by maclo on 1/25/2016.
 */
public class Status {
  private int code;
  private String message;

  public int getCode() {
    return code;
  }

  public void setCode(int code) {
    this.code = code;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  @Override
  public int hashCode() {
    return code;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Status)) return false;

    Status status = (Status) o;

    return code == status.code;

  }
}
