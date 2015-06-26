/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.design.perpetual.ecobeethermostat.app.components;

import com.design.perpetual.ecobeethermostat.app.annotations.TypeInformation;

/**
 *
 * @author Mac
 */
@TypeInformation(typeLink = "")
public class MeterReport {

    private String thermostatIdentifier;
    private MeterReportData[] meterList;

    public String getThermostatIdentifier() {
        return thermostatIdentifier;
    }

    public void setThermostatIdentifier(String thermostatIdentifier) {
        this.thermostatIdentifier = thermostatIdentifier;
    }

    public MeterReportData[] getMeterList() {
        return meterList;
    }

    public void setMeterList(MeterReportData[] meterList) {
        this.meterList = meterList;
    }
    
}
