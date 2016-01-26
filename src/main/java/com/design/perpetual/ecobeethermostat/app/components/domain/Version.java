/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.design.perpetual.ecobeethermostat.app.components.domain;

import com.design.perpetual.ecobeethermostat.app.annotations.TypeInformation;

/**
 *
 * @author Mac
 */
@TypeInformation(typeLink = "")
public class Version {
    
    private String thermostatFirmwareVersion;

    public String getThermostatFirmwareVersion() {
        return thermostatFirmwareVersion;
    }

    public void setThermostatFirmwareVersion(String thermostatFirmwareVersion) {
        this.thermostatFirmwareVersion = thermostatFirmwareVersion;
    }
}
