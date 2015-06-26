/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.design.perpetual.ecobeethermostat.app.components;

import com.design.perpetual.ecobeethermostat.app.annotations.TypeInformation;
import java.rmi.Remote;
import java.util.Objects;

/**
 *
 * @author Mac
 */
@TypeInformation(typeLink = "https://www.ecobee.com/home/developer/api/documentation/v1/objects/Climate.shtml")
public class Climate {

    private String name;  
    private String climateRef;  
    private Boolean isOccupied;  
    private Boolean isOptimized;  
    private String coolFan;  
    private String heatFan;  
    private String vent;  
    private Integer ventilatorMinOnTime;  
    private String owner;  
    private String type;  
    private Integer colour;  
    private Integer coolTemp;  
    private Integer heatTemp;  
    private Remote sensors;  

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClimateRef() {
        return climateRef;
    }

    public void setClimateRef(String climateRef) {
        this.climateRef = climateRef;
    }

    public Boolean getIsOccupied() {
        return isOccupied;
    }

    public void setIsOccupied(Boolean isOccupied) {
        this.isOccupied = isOccupied;
    }

    public Boolean getIsOptimized() {
        return isOptimized;
    }

    public void setIsOptimized(Boolean isOptimized) {
        this.isOptimized = isOptimized;
    }

    public String getCoolFan() {
        return coolFan;
    }

    public void setCoolFan(String coolFan) {
        this.coolFan = coolFan;
    }

    public String getHeatFan() {
        return heatFan;
    }

    public void setHeatFan(String heatFan) {
        this.heatFan = heatFan;
    }

    public String getVent() {
        return vent;
    }

    public void setVent(String vent) {
        this.vent = vent;
    }

    public Integer getVentilatorMinOnTime() {
        return ventilatorMinOnTime;
    }

    public void setVentilatorMinOnTime(Integer ventilatorMinOnTime) {
        this.ventilatorMinOnTime = ventilatorMinOnTime;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getColour() {
        return colour;
    }

    public void setColour(Integer colour) {
        this.colour = colour;
    }

    public Integer getCoolTemp() {
        return coolTemp;
    }

    public void setCoolTemp(Integer coolTemp) {
        this.coolTemp = coolTemp;
    }

    public Integer getHeatTemp() {
        return heatTemp;
    }

    public void setHeatTemp(Integer heatTemp) {
        this.heatTemp = heatTemp;
    }

    public Remote getSensors() {
        return sensors;
    }

    public void setSensors(Remote sensors) {
        this.sensors = sensors;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.name);
        hash = 43 * hash + Objects.hashCode(this.climateRef);
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
        final Climate other = (Climate) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.climateRef, other.climateRef)) {
            return false;
        }
        return true;
    }
    
    
}
