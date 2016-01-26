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
public class Group {

    private String groupRef;
    private String groupName;
    private Boolean synchronizeAlerts;
    private Boolean synchronizeSystemMode;
    private Boolean synchronizeSchedule;
    private Boolean synchronizeQuickSave;
    private Boolean synchronizeReminders;
    private Boolean synchronizeContractorInfo;
    private Boolean synchronizeUserPreferences;
    private Boolean synchronizeUtilityInfo;
    private Boolean synchronizeLocation;
    private Boolean synchronizeReset;
    private Boolean synchronizeVacation;
    private String[] thermostats;

    public String getGroupRef() {
        return groupRef;
    }

    public void setGroupRef(String groupRef) {
        this.groupRef = groupRef;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Boolean getSynchronizeAlerts() {
        return synchronizeAlerts;
    }

    public void setSynchronizeAlerts(Boolean synchronizeAlerts) {
        this.synchronizeAlerts = synchronizeAlerts;
    }

    public Boolean getSynchronizeSystemMode() {
        return synchronizeSystemMode;
    }

    public void setSynchronizeSystemMode(Boolean synchronizeSystemMode) {
        this.synchronizeSystemMode = synchronizeSystemMode;
    }

    public Boolean getSynchronizeSchedule() {
        return synchronizeSchedule;
    }

    public void setSynchronizeSchedule(Boolean synchronizeSchedule) {
        this.synchronizeSchedule = synchronizeSchedule;
    }

    public Boolean getSynchronizeQuickSave() {
        return synchronizeQuickSave;
    }

    public void setSynchronizeQuickSave(Boolean synchronizeQuickSave) {
        this.synchronizeQuickSave = synchronizeQuickSave;
    }

    public Boolean getSynchronizeReminders() {
        return synchronizeReminders;
    }

    public void setSynchronizeReminders(Boolean synchronizeReminders) {
        this.synchronizeReminders = synchronizeReminders;
    }

    public Boolean getSynchronizeContractorInfo() {
        return synchronizeContractorInfo;
    }

    public void setSynchronizeContractorInfo(Boolean synchronizeContractorInfo) {
        this.synchronizeContractorInfo = synchronizeContractorInfo;
    }

    public Boolean getSynchronizeUserPreferences() {
        return synchronizeUserPreferences;
    }

    public void setSynchronizeUserPreferences(Boolean synchronizeUserPreferences) {
        this.synchronizeUserPreferences = synchronizeUserPreferences;
    }

    public Boolean getSynchronizeUtilityInfo() {
        return synchronizeUtilityInfo;
    }

    public void setSynchronizeUtilityInfo(Boolean synchronizeUtilityInfo) {
        this.synchronizeUtilityInfo = synchronizeUtilityInfo;
    }

    public Boolean getSynchronizeLocation() {
        return synchronizeLocation;
    }

    public void setSynchronizeLocation(Boolean synchronizeLocation) {
        this.synchronizeLocation = synchronizeLocation;
    }

    public Boolean getSynchronizeReset() {
        return synchronizeReset;
    }

    public void setSynchronizeReset(Boolean synchronizeReset) {
        this.synchronizeReset = synchronizeReset;
    }

    public Boolean getSynchronizeVacation() {
        return synchronizeVacation;
    }

    public void setSynchronizeVacation(Boolean synchronizeVacation) {
        this.synchronizeVacation = synchronizeVacation;
    }

    public String[] getThermostats() {
        return thermostats;
    }

    public void setThermostats(String[] thermostats) {
        this.thermostats = thermostats;
    }
    
}
