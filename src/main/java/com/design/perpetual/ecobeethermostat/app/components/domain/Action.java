/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.design.perpetual.ecobeethermostat.app.components.domain;

import com.design.perpetual.ecobeethermostat.app.annotations.FieldInformation;
import com.design.perpetual.ecobeethermostat.app.annotations.TypeInformation;

import java.util.Objects;

/**
 *
 * @author Mac
 */
@TypeInformation(typeLink = "https://www.ecobee.com/home/developer/api/documentation/v1/objects/Action.shtml")
public class Action {

    @FieldInformation(defaultValues = {"activateRelay", "adjustTemp", "doNothing", "shutdownAC", "shutdownAuxHeat", "shutdownSystem", "shutdownCompression", "switchToOccupied", "switchToUnoccupied", "turnOffDehumidifer", "turnOffHumidifier", "turnOnCool", "turnOnDehumidifier", "turnOnFan", "turnOnHeat", "turnOnHumidifier"})
    private String type;
    
    @FieldInformation(description = "Flag to enable an alert to be generated when the state is triggered")
    private Boolean sendAlert;
    
    @FieldInformation(description = "Whether to send an update message.")
    private Boolean sendUpdate;
    
    @FieldInformation(description = "Delay in seconds before the action is triggered by the state change.")
    private Integer activationDelay;
    
    @FieldInformation(description = "The amount of time to wait before deactivating this state after the state has been cleared.")
    private Integer deactivationDelay;
    
    @FieldInformation(description = "The minimum length of time to maintain action after sensor has been deactivated.")
    private Integer minActionDuration;
    
    @FieldInformation(description = "The amount to increase/decrease current setpoint if the type = adjustTemp.")
    private Integer heatAdjustTemp;
    
    @FieldInformation(description = "The amount to increase/decrease current setpoint if the type = adjustTemp.")
    private Integer coolAdjustTemp;
    
    @FieldInformation(description = "The user defined relay to be activated, only used for type == activateRelay.")
    private String activateRelay;
    
    @FieldInformation(description = "Select if relay is to be open or closed when activated, only used for type == activateRelay.")
    private Boolean activateRelayOpen;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getSendAlert() {
        return sendAlert;
    }

    public void setSendAlert(Boolean sendAlert) {        
        this.sendAlert = sendAlert;
    }

    public Boolean getSendUpdate() {
        return sendUpdate;
    }

    public void setSendUpdate(Boolean sendUpdate) {
        this.sendUpdate = sendUpdate;
    }

    public Integer getActivationDelay() {
        return activationDelay;
    }

    public void setActivationDelay(Integer activationDelay) {
        this.activationDelay = activationDelay;
    }

    public Integer getDeactivationDelay() {
        return deactivationDelay;
    }

    public void setDeactivationDelay(Integer deactivationDelay) {
        this.deactivationDelay = deactivationDelay;
    }

    public Integer getMinActionDuration() {
        return minActionDuration;
    }

    public void setMinActionDuration(Integer minActionDuration) {
        this.minActionDuration = minActionDuration;
    }

    public Integer getHeatAdjustTemp() {
        return heatAdjustTemp;
    }

    public void setHeatAdjustTemp(Integer heatAdjustTemp) {
        this.heatAdjustTemp = heatAdjustTemp;
    }

    public Integer getCoolAdjustTemp() {
        return coolAdjustTemp;
    }

    public void setCoolAdjustTemp(Integer coolAdjustTemp) {
        this.coolAdjustTemp = coolAdjustTemp;
    }

    public String getActivateRelay() {
        return activateRelay;
    }

    public void setActivateRelay(String activateRelay) {
        this.activateRelay = activateRelay;
    }

    public Boolean getActivateRelayOpen() {
        return activateRelayOpen;
    }

    public void setActivateRelayOpen(Boolean activateRelayOpen) {
        this.activateRelayOpen = activateRelayOpen;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.type);
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
        final Action other = (Action) obj;
        return Objects.equals(this.type, other.type);
    }
    
    
}
