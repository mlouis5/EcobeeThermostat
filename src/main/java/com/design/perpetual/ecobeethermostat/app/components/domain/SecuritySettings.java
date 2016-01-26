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
public class SecuritySettings {

    private String userAccessCode;
    private Boolean allUserAccess;
    private Boolean programAccess;
    private Boolean detailsAccess;
    private Boolean quickSaveAccess;
    private Boolean vacationAccess;

    public String getUserAccessCode() {
        return userAccessCode;
    }

    public void setUserAccessCode(String userAccessCode) {
        this.userAccessCode = userAccessCode;
    }

    public Boolean getAllUserAccess() {
        return allUserAccess;
    }

    public void setAllUserAccess(Boolean allUserAccess) {
        this.allUserAccess = allUserAccess;
    }

    public Boolean getProgramAccess() {
        return programAccess;
    }

    public void setProgramAccess(Boolean programAccess) {
        this.programAccess = programAccess;
    }

    public Boolean getDetailsAccess() {
        return detailsAccess;
    }

    public void setDetailsAccess(Boolean detailsAccess) {
        this.detailsAccess = detailsAccess;
    }

    public Boolean getQuickSaveAccess() {
        return quickSaveAccess;
    }

    public void setQuickSaveAccess(Boolean quickSaveAccess) {
        this.quickSaveAccess = quickSaveAccess;
    }

    public Boolean getVacationAccess() {
        return vacationAccess;
    }

    public void setVacationAccess(Boolean vacationAccess) {
        this.vacationAccess = vacationAccess;
    }
    
}
