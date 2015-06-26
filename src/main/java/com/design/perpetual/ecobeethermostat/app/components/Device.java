/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.design.perpetual.ecobeethermostat.app.components;

import com.design.perpetual.ecobeethermostat.app.annotations.TypeInformation;
import java.util.Objects;

/**
 *
 * @author Mac
 */
@TypeInformation(typeLink = "https://www.ecobee.com/home/developer/api/documentation/v1/objects/Device.shtml")
public class Device {

    private Integer deviceId;  
    private String name;  
    private Sensor[] sensors;  
    private Output[] outputs;  

    public Integer getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sensor[] getSensors() {
        return sensors;
    }

    public void setSensors(Sensor[] sensors) {
        this.sensors = sensors;
    }

    public Output[] getOutputs() {
        return outputs;
    }

    public void setOutputs(Output[] outputs) {
        this.outputs = outputs;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.deviceId);
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
        final Device other = (Device) obj;
        if (!Objects.equals(this.deviceId, other.deviceId)) {
            return false;
        }
        return true;
    }
    
    
}
