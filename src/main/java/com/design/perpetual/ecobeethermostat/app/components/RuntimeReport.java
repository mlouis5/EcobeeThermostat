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
public class RuntimeReport {

    private String thermostatIdentifier;
    private Integer rowCount;
    private String[] rowList;

    public String getThermostatIdentifier() {
        return thermostatIdentifier;
    }

    public void setThermostatIdentifier(String thermostatIdentifier) {
        this.thermostatIdentifier = thermostatIdentifier;
    }

    public Integer getRowCount() {
        return rowCount;
    }

    public void setRowCount(Integer rowCount) {
        this.rowCount = rowCount;
    }

    public String[] getRowList() {
        return rowList;
    }

    public void setRowList(String[] rowList) {
        this.rowList = rowList;
    }
    
}
