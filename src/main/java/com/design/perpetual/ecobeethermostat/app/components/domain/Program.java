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
public class Program {

    private String[][] schedule;
    private Climate[] climates;
    private String currentClimateRef;

    public String[][] getSchedule() {
        return schedule;
    }

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }

    public Climate[] getClimates() {
        return climates;
    }

    public void setClimates(Climate[] climates) {
        this.climates = climates;
    }

    public String getCurrentClimateRef() {
        return currentClimateRef;
    }

    public void setCurrentClimateRef(String currentClimateRef) {
        this.currentClimateRef = currentClimateRef;
    }
    
}
