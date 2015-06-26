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
@TypeInformation(typeLink = "https://www.ecobee.com/home/developer/api/documentation/v1/objects/EquipmentSetting.shtml")
public class EquipmentSetting {

    private String filterLastChanged;  
    private Integer filterLife;  
    private String filterLifeUnits;  
    private String remindMeDate;  
    private Boolean enabled;  
    private String type;  
    private Boolean remindTechnician;  

    public String getFilterLastChanged() {
        return filterLastChanged;
    }

    public void setFilterLastChanged(String filterLastChanged) {
        this.filterLastChanged = filterLastChanged;
    }

    public Integer getFilterLife() {
        return filterLife;
    }

    public void setFilterLife(Integer filterLife) {
        this.filterLife = filterLife;
    }

    public String getFilterLifeUnits() {
        return filterLifeUnits;
    }

    public void setFilterLifeUnits(String filterLifeUnits) {
        this.filterLifeUnits = filterLifeUnits;
    }

    public String getRemindMeDate() {
        return remindMeDate;
    }

    public void setRemindMeDate(String remindMeDate) {
        this.remindMeDate = remindMeDate;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getRemindTechnician() {
        return remindTechnician;
    }

    public void setRemindTechnician(Boolean remindTechnician) {
        this.remindTechnician = remindTechnician;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.filterLastChanged);
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
        final EquipmentSetting other = (EquipmentSetting) obj;
        if (!Objects.equals(this.filterLastChanged, other.filterLastChanged)) {
            return false;
        }
        return true;
    }
    
    
}
