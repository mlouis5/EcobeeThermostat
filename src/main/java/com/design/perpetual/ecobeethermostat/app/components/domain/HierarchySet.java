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
public class HierarchySet {

    private String setName;
    private String setPath;
    private HierarchySet[] children;
    private HierarchyPrivilege[] privileges;
    private String[] thermostats;

    public String getSetName() {
        return setName;
    }

    public void setSetName(String setName) {
        this.setName = setName;
    }

    public String getSetPath() {
        return setPath;
    }

    public void setSetPath(String setPath) {
        this.setPath = setPath;
    }

    public HierarchySet[] getChildren() {
        return children;
    }

    public void setChildren(HierarchySet[] children) {
        this.children = children;
    }

    public HierarchyPrivilege[] getPrivileges() {
        return privileges;
    }

    public void setPrivileges(HierarchyPrivilege[] privileges) {
        this.privileges = privileges;
    }

    public String[] getThermostats() {
        return thermostats;
    }

    public void setThermostats(String[] thermostats) {
        this.thermostats = thermostats;
    }
    
}
