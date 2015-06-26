/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.design.perpetual.ecobeethermostat.app.components;

import com.design.perpetual.ecobeethermostat.app.annotations.TypeInformation;
import java.util.Objects;

/**
 *
 * @author Mac
 */
@TypeInformation(typeLink = "https://www.ecobee.com/home/developer/api/documentation/v1/objects/Alert.shtml")
public class Alert {

    private String acknowledgeRef;  
    private String date;  
    private String time;  
    private String severity;  
    private String text;  
    private Integer alertNumber;  
    private String alertType;  
    private Boolean isOperatorAlert;  
    private String reminder;  
    private Boolean showIdt;  
    private Boolean showWeb;  
    private Boolean sendEmail;  
    private String acknowledgement;  
    private Boolean remindMeLater;  
    private String thermostatIdentifier;  
    private String notificationType;  

    public String getAcknowledgeRef() {
        return acknowledgeRef;
    }

    public void setAcknowledgeRef(String acknowledgeRef) {
        this.acknowledgeRef = acknowledgeRef;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getAlertNumber() {
        return alertNumber;
    }

    public void setAlertNumber(Integer alertNumber) {
        this.alertNumber = alertNumber;
    }

    public String getAlertType() {
        return alertType;
    }

    public void setAlertType(String alertType) {
        this.alertType = alertType;
    }

    public Boolean getIsOperatorAlert() {
        return isOperatorAlert;
    }

    public void setIsOperatorAlert(Boolean isOperatorAlert) {
        this.isOperatorAlert = isOperatorAlert;
    }

    public String getReminder() {
        return reminder;
    }

    public void setReminder(String reminder) {
        this.reminder = reminder;
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

    public String getAcknowledgement() {
        return acknowledgement;
    }

    public void setAcknowledgement(String acknowledgement) {
        this.acknowledgement = acknowledgement;
    }

    public Boolean getRemindMeLater() {
        return remindMeLater;
    }

    public void setRemindMeLater(Boolean remindMeLater) {
        this.remindMeLater = remindMeLater;
    }

    public String getThermostatIdentifier() {
        return thermostatIdentifier;
    }

    public void setThermostatIdentifier(String thermostatIdentifier) {
        this.thermostatIdentifier = thermostatIdentifier;
    }

    public String getNotificationType() {
        return notificationType;
    }

    public void setNotificationType(String notificationType) {
        this.notificationType = notificationType;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.acknowledgeRef);
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
        final Alert other = (Alert) obj;
        if (!Objects.equals(this.acknowledgeRef, other.acknowledgeRef)) {
            return false;
        }
        return true;
    }
    
    
}
