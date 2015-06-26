/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.design.perpetual.ecobeethermostat.app.components;

import com.design.perpetual.ecobeethermostat.app.annotations.TypeInformation;
import java.util.Arrays;

/**
 *
 * @author Mac
 */
@TypeInformation(typeLink = "https://www.ecobee.com/home/developer/api/documentation/v1/objects/Electricity.shtml")
public class Electricity {
    
    private ElectricityDevice[] devices;  

    public ElectricityDevice[] getDevices() {
        return devices;
    }

    public void setDevices(ElectricityDevice[] devices) {
        this.devices = devices;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Arrays.deepHashCode(this.devices);
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
        final Electricity other = (Electricity) obj;
        if (!Arrays.deepEquals(this.devices, other.devices)) {
            return false;
        }
        return true;
    }
    
    
}
