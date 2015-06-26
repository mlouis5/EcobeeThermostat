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
public class Selection {

    private Enum selectionType;
    private String selectionMatch;
    private boolean includeRuntime;
    private boolean includeExtendedRuntime;
    private boolean includeElectricity;
    private boolean includeSettings;
    private boolean includeLocation;
    private boolean includeProgram;
    private boolean includeEvents;
    private boolean includeDevice;
    private boolean includeTechnician;
    private boolean includeUtility;
    private boolean includeManagement;
    private boolean includeAlerts;
    private boolean includeWeather;
    private boolean includeHouseDetails;
    private boolean includeOemCfg;
    private boolean includeEquipmentStatus;
    private boolean includeNotificationSettings;
    private boolean includePrivacy;
    private boolean includeVersion;
    private boolean includeSecuritySettings;
    private boolean includeSensors; 

    public Enum getSelectionType() {
        return selectionType;
    }

    public void setSelectionType(Enum selectionType) {
        this.selectionType = selectionType;
    }

    public String getSelectionMatch() {
        return selectionMatch;
    }

    public void setSelectionMatch(String selectionMatch) {
        this.selectionMatch = selectionMatch;
    }

    public boolean isIncludeRuntime() {
        return includeRuntime;
    }

    public void setIncludeRuntime(boolean includeRuntime) {
        this.includeRuntime = includeRuntime;
    }

    public boolean isIncludeExtendedRuntime() {
        return includeExtendedRuntime;
    }

    public void setIncludeExtendedRuntime(boolean includeExtendedRuntime) {
        this.includeExtendedRuntime = includeExtendedRuntime;
    }

    public boolean isIncludeElectricity() {
        return includeElectricity;
    }

    public void setIncludeElectricity(boolean includeElectricity) {
        this.includeElectricity = includeElectricity;
    }

    public boolean isIncludeSettings() {
        return includeSettings;
    }

    public void setIncludeSettings(boolean includeSettings) {
        this.includeSettings = includeSettings;
    }

    public boolean isIncludeLocation() {
        return includeLocation;
    }

    public void setIncludeLocation(boolean includeLocation) {
        this.includeLocation = includeLocation;
    }

    public boolean isIncludeProgram() {
        return includeProgram;
    }

    public void setIncludeProgram(boolean includeProgram) {
        this.includeProgram = includeProgram;
    }

    public boolean isIncludeEvents() {
        return includeEvents;
    }

    public void setIncludeEvents(boolean includeEvents) {
        this.includeEvents = includeEvents;
    }

    public boolean isIncludeDevice() {
        return includeDevice;
    }

    public void setIncludeDevice(boolean includeDevice) {
        this.includeDevice = includeDevice;
    }

    public boolean isIncludeTechnician() {
        return includeTechnician;
    }

    public void setIncludeTechnician(boolean includeTechnician) {
        this.includeTechnician = includeTechnician;
    }

    public boolean isIncludeUtility() {
        return includeUtility;
    }

    public void setIncludeUtility(boolean includeUtility) {
        this.includeUtility = includeUtility;
    }

    public boolean isIncludeManagement() {
        return includeManagement;
    }

    public void setIncludeManagement(boolean includeManagement) {
        this.includeManagement = includeManagement;
    }

    public boolean isIncludeAlerts() {
        return includeAlerts;
    }

    public void setIncludeAlerts(boolean includeAlerts) {
        this.includeAlerts = includeAlerts;
    }

    public boolean isIncludeWeather() {
        return includeWeather;
    }

    public void setIncludeWeather(boolean includeWeather) {
        this.includeWeather = includeWeather;
    }

    public boolean isIncludeHouseDetails() {
        return includeHouseDetails;
    }

    public void setIncludeHouseDetails(boolean includeHouseDetails) {
        this.includeHouseDetails = includeHouseDetails;
    }

    public boolean isIncludeOemCfg() {
        return includeOemCfg;
    }

    public void setIncludeOemCfg(boolean includeOemCfg) {
        this.includeOemCfg = includeOemCfg;
    }

    public boolean isIncludeEquipmentStatus() {
        return includeEquipmentStatus;
    }

    public void setIncludeEquipmentStatus(boolean includeEquipmentStatus) {
        this.includeEquipmentStatus = includeEquipmentStatus;
    }

    public boolean isIncludeNotificationSettings() {
        return includeNotificationSettings;
    }

    public void setIncludeNotificationSettings(boolean includeNotificationSettings) {
        this.includeNotificationSettings = includeNotificationSettings;
    }

    public boolean isIncludePrivacy() {
        return includePrivacy;
    }

    public void setIncludePrivacy(boolean includePrivacy) {
        this.includePrivacy = includePrivacy;
    }

    public boolean isIncludeVersion() {
        return includeVersion;
    }

    public void setIncludeVersion(boolean includeVersion) {
        this.includeVersion = includeVersion;
    }

    public boolean isIncludeSecuritySettings() {
        return includeSecuritySettings;
    }

    public void setIncludeSecuritySettings(boolean includeSecuritySettings) {
        this.includeSecuritySettings = includeSecuritySettings;
    }

    public boolean isIncludeSensors() {
        return includeSensors;
    }

    public void setIncludeSensors(boolean includeSensors) {
        this.includeSensors = includeSensors;
    }
    
}
