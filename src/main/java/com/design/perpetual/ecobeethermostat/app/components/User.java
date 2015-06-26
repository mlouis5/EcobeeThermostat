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
public class User {

    private String userName;
    private String displayName;
    private String firstName;
    private String lastName;
    private String honorific;
    private String registerDate;
    private String registerTime;
    private String defaultThermostatIdentifier;
    private String managementRef;
    private String utilityRef;
    private String supportRef;
    private String phoneNumber;
    private Boolean isResidential;
    private Boolean isDeveloper;
    private Boolean isManagement;
    private Boolean isUtility;
    private Boolean isContractor;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getHonorific() {
        return honorific;
    }

    public void setHonorific(String honorific) {
        this.honorific = honorific;
    }

    public String getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(String registerDate) {
        this.registerDate = registerDate;
    }

    public String getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(String registerTime) {
        this.registerTime = registerTime;
    }

    public String getDefaultThermostatIdentifier() {
        return defaultThermostatIdentifier;
    }

    public void setDefaultThermostatIdentifier(String defaultThermostatIdentifier) {
        this.defaultThermostatIdentifier = defaultThermostatIdentifier;
    }

    public String getManagementRef() {
        return managementRef;
    }

    public void setManagementRef(String managementRef) {
        this.managementRef = managementRef;
    }

    public String getUtilityRef() {
        return utilityRef;
    }

    public void setUtilityRef(String utilityRef) {
        this.utilityRef = utilityRef;
    }

    public String getSupportRef() {
        return supportRef;
    }

    public void setSupportRef(String supportRef) {
        this.supportRef = supportRef;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Boolean getIsResidential() {
        return isResidential;
    }

    public void setIsResidential(Boolean isResidential) {
        this.isResidential = isResidential;
    }

    public Boolean getIsDeveloper() {
        return isDeveloper;
    }

    public void setIsDeveloper(Boolean isDeveloper) {
        this.isDeveloper = isDeveloper;
    }

    public Boolean getIsManagement() {
        return isManagement;
    }

    public void setIsManagement(Boolean isManagement) {
        this.isManagement = isManagement;
    }

    public Boolean getIsUtility() {
        return isUtility;
    }

    public void setIsUtility(Boolean isUtility) {
        this.isUtility = isUtility;
    }

    public Boolean getIsContractor() {
        return isContractor;
    }

    public void setIsContractor(Boolean isContractor) {
        this.isContractor = isContractor;
    }
}
