/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.design.perpetual.ecobeethermostat.app.authorization;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 *
 * @author MacDerson
 */
public class PinAuthorization {

    private String ecobeePin;
    private String code;
    private String scope;
    @JsonProperty("expires_in")
    private int expiresIn;
    private int interval;

    public String getEcobeePin() {
        return ecobeePin;
    }

    public void setEcobeePin(String ecobeePin) {
        this.ecobeePin = ecobeePin;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public int getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(int expiresIn) {
        this.expiresIn = expiresIn;
    }

    public int getInterval() {
        return interval;
    }

    public void setInterval(int interval) {
        this.interval = interval;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.ecobeePin);
        hash = 89 * hash + Objects.hashCode(this.code);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PinAuthorization other = (PinAuthorization) obj;
        return Objects.equals(this.ecobeePin, other.ecobeePin) && Objects.
                equals(this.code, other.code);
    }

}
