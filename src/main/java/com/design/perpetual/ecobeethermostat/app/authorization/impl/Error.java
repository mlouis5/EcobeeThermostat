/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.design.perpetual.ecobeethermostat.app.authorization.impl;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author MacDerson
 */
public class Error {

    private String error;
    @JsonProperty("error_description")
    private String errorDescription;
    @JsonProperty("error_uri")
    private String errorUri;

    public String getError() {
	return error;
    }

    public void setError(String error) {
	this.error = error;
    }

    public String getErrorDescription() {
	return errorDescription;
    }

    public void setErrorDescription(String errorDescription) {
	this.errorDescription = errorDescription;
    }

    public String getErrorUri() {
	return errorUri;
    }

    public void setErrorUri(String errorUri) {
	this.errorUri = errorUri;
    }

    @Override
    public String toString() {
	return "Error{" + "error=" + error + ", errorDescription=" + errorDescription + ", errorUri=" + errorUri + '}';
    }

}
