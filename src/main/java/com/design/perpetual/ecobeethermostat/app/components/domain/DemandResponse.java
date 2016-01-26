/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.design.perpetual.ecobeethermostat.app.components.domain;

import com.design.perpetual.ecobeethermostat.app.annotations.TypeInformation;
import java.util.Objects;

/**
 *
 * @author Mac
 */
@TypeInformation(typeLink = "https://www.ecobee.com/home/developer/api/documentation/v1/objects/DemandResponse.shtml")
public class DemandResponse {

    private String name;  
    private String demandResponseRef;  
    private String comments;  
    private String message;  
    private String deferredDate;  
    private String deferredTime;  
    private Boolean showIdt;  
    private Boolean showWeb;  
    private Boolean sendEmail;  
    private Boolean randomizeStartTime;  
    private Integer randomStartTimeSeconds;  
    private Boolean randomizeEndTime;  
    private Integer randomEndTimeSeconds;  
    private Event event;  
    private String[] thermostats;  
    private String externalRef;  
    private String externalRefType;  
    private Long priority;  

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDemandResponseRef() {
        return demandResponseRef;
    }

    public void setDemandResponseRef(String demandResponseRef) {
        this.demandResponseRef = demandResponseRef;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDeferredDate() {
        return deferredDate;
    }

    public void setDeferredDate(String deferredDate) {
        this.deferredDate = deferredDate;
    }

    public String getDeferredTime() {
        return deferredTime;
    }

    public void setDeferredTime(String deferredTime) {
        this.deferredTime = deferredTime;
    }

    public Boolean getShowIdt() {
        return showIdt;
    }

    public void setShowIdt(Boolean showIdt) {
        this.showIdt = showIdt;
    }

    public Boolean getShowWeb() {
        return showWeb;
    }

    public void setShowWeb(Boolean showWeb) {
        this.showWeb = showWeb;
    }

    public Boolean getSendEmail() {
        return sendEmail;
    }

    public void setSendEmail(Boolean sendEmail) {
        this.sendEmail = sendEmail;
    }

    public Boolean getRandomizeStartTime() {
        return randomizeStartTime;
    }

    public void setRandomizeStartTime(Boolean randomizeStartTime) {
        this.randomizeStartTime = randomizeStartTime;
    }

    public Integer getRandomStartTimeSeconds() {
        return randomStartTimeSeconds;
    }

    public void setRandomStartTimeSeconds(Integer randomStartTimeSeconds) {
        this.randomStartTimeSeconds = randomStartTimeSeconds;
    }

    public Boolean getRandomizeEndTime() {
        return randomizeEndTime;
    }

    public void setRandomizeEndTime(Boolean randomizeEndTime) {
        this.randomizeEndTime = randomizeEndTime;
    }

    public Integer getRandomEndTimeSeconds() {
        return randomEndTimeSeconds;
    }

    public void setRandomEndTimeSeconds(Integer randomEndTimeSeconds) {
        this.randomEndTimeSeconds = randomEndTimeSeconds;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public String[] getThermostats() {
        return thermostats;
    }

    public void setThermostats(String[] thermostats) {
        this.thermostats = thermostats;
    }

    public String getExternalRef() {
        return externalRef;
    }

    public void setExternalRef(String externalRef) {
        this.externalRef = externalRef;
    }

    public String getExternalRefType() {
        return externalRefType;
    }

    public void setExternalRefType(String externalRefType) {
        this.externalRefType = externalRefType;
    }

    public Long getPriority() {
        return priority;
    }

    public void setPriority(Long priority) {
        this.priority = priority;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.name);
        hash = 17 * hash + Objects.hashCode(this.demandResponseRef);
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
        final DemandResponse other = (DemandResponse) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.demandResponseRef, other.demandResponseRef)) {
            return false;
        }
        return true;
    }
    
    
}
