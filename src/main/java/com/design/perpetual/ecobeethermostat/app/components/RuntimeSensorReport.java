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
public class RuntimeSensorReport {

    private String thermostatIdentifier;
    private RuntimeSensorMetaData[] sensors;
    private String[] columns;
    private String[] data;

    public String getThermostatIdentifier() {
        return thermostatIdentifier;
    }

    public void setThermostatIdentifier(String thermostatIdentifier) {
        this.thermostatIdentifier = thermostatIdentifier;
    }

    public RuntimeSensorMetaData[] getSensors() {
        return sensors;
    }

    public void setSensors(RuntimeSensorMetaData[] sensors) {
        this.sensors = sensors;
    }

    public String[] getColumns() {
        return columns;
    }

    public void setColumns(String[] columns) {
        this.columns = columns;
    }

    public String[] getData() {
        return data;
    }

    public void setData(String[] data) {
        this.data = data;
    }
    
}
