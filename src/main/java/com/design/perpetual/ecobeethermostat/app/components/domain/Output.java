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
public class Output {

    private String name;
    private Integer zone;
    private Integer outputId;
    private String type;
    private Boolean sendUpdate;
    private Boolean activeClosed;
    private Integer activationTime;
    private Integer deactivationTime;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getZone() {
        return zone;
    }

    public void setZone(Integer zone) {
        this.zone = zone;
    }

    public Integer getOutputId() {
        return outputId;
    }

    public void setOutputId(Integer outputId) {
        this.outputId = outputId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getSendUpdate() {
        return sendUpdate;
    }

    public void setSendUpdate(Boolean sendUpdate) {
        this.sendUpdate = sendUpdate;
    }

    public Boolean getActiveClosed() {
        return activeClosed;
    }

    public void setActiveClosed(Boolean activeClosed) {
        this.activeClosed = activeClosed;
    }

    public Integer getActivationTime() {
        return activationTime;
    }

    public void setActivationTime(Integer activationTime) {
        this.activationTime = activationTime;
    }

    public Integer getDeactivationTime() {
        return deactivationTime;
    }

    public void setDeactivationTime(Integer deactivationTime) {
        this.deactivationTime = deactivationTime;
    }
    
}
