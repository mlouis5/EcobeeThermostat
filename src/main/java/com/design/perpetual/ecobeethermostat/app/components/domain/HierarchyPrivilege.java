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
public class HierarchyPrivilege {

    private String setPath;
    private String setName;
    private String userName;
    private Boolean allowAll;
    private Boolean allowNone;
    private Boolean allowView;
    private Boolean allowProgram;
    private Boolean allowVacation;
    private Boolean allowSettings;
    private Boolean allowDetails;
    private Boolean allowReport;
    private Boolean allowSecurity;
    private Boolean allowHierarchy;
    private Boolean allowAlerts;
    private Boolean allowManageAccount;

    public String getSetPath() {
        return setPath;
    }

    public void setSetPath(String setPath) {
        this.setPath = setPath;
    }

    public String getSetName() {
        return setName;
    }

    public void setSetName(String setName) {
        this.setName = setName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Boolean getAllowAll() {
        return allowAll;
    }

    public void setAllowAll(Boolean allowAll) {
        this.allowAll = allowAll;
    }

    public Boolean getAllowNone() {
        return allowNone;
    }

    public void setAllowNone(Boolean allowNone) {
        this.allowNone = allowNone;
    }

    public Boolean getAllowView() {
        return allowView;
    }

    public void setAllowView(Boolean allowView) {
        this.allowView = allowView;
    }

    public Boolean getAllowProgram() {
        return allowProgram;
    }

    public void setAllowProgram(Boolean allowProgram) {
        this.allowProgram = allowProgram;
    }

    public Boolean getAllowVacation() {
        return allowVacation;
    }

    public void setAllowVacation(Boolean allowVacation) {
        this.allowVacation = allowVacation;
    }

    public Boolean getAllowSettings() {
        return allowSettings;
    }

    public void setAllowSettings(Boolean allowSettings) {
        this.allowSettings = allowSettings;
    }

    public Boolean getAllowDetails() {
        return allowDetails;
    }

    public void setAllowDetails(Boolean allowDetails) {
        this.allowDetails = allowDetails;
    }

    public Boolean getAllowReport() {
        return allowReport;
    }

    public void setAllowReport(Boolean allowReport) {
        this.allowReport = allowReport;
    }

    public Boolean getAllowSecurity() {
        return allowSecurity;
    }

    public void setAllowSecurity(Boolean allowSecurity) {
        this.allowSecurity = allowSecurity;
    }

    public Boolean getAllowHierarchy() {
        return allowHierarchy;
    }

    public void setAllowHierarchy(Boolean allowHierarchy) {
        this.allowHierarchy = allowHierarchy;
    }

    public Boolean getAllowAlerts() {
        return allowAlerts;
    }

    public void setAllowAlerts(Boolean allowAlerts) {
        this.allowAlerts = allowAlerts;
    }

    public Boolean getAllowManageAccount() {
        return allowManageAccount;
    }

    public void setAllowManageAccount(Boolean allowManageAccount) {
        this.allowManageAccount = allowManageAccount;
    }
    
}
