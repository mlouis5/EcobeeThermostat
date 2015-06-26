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
public class NotificationSettings {

    private String[] emailAddresses;
    private Boolean emailNotificationsEnabled;
    private EquipmentSetting[] equipment;
    private GeneralSetting[] general;
    private LimitSetting[] limit;

    public String[] getEmailAddresses() {
        return emailAddresses;
    }

    public void setEmailAddresses(String[] emailAddresses) {
        this.emailAddresses = emailAddresses;
    }

    public Boolean getEmailNotificationsEnabled() {
        return emailNotificationsEnabled;
    }

    public void setEmailNotificationsEnabled(Boolean emailNotificationsEnabled) {
        this.emailNotificationsEnabled = emailNotificationsEnabled;
    }

    public EquipmentSetting[] getEquipment() {
        return equipment;
    }

    public void setEquipment(EquipmentSetting[] equipment) {
        this.equipment = equipment;
    }

    public GeneralSetting[] getGeneral() {
        return general;
    }

    public void setGeneral(GeneralSetting[] general) {
        this.general = general;
    }

    public LimitSetting[] getLimit() {
        return limit;
    }

    public void setLimit(LimitSetting[] limit) {
        this.limit = limit;
    }
    
}
