/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.design.perpetual.ecobeethermostat.app.enums;

import org.springframework.http.HttpStatus;

/**
 *
 * @author MacDerson
 */
public enum ErrorCode {

    ACCESS_DENIED("access_denied", 302, "found", "Authorization has been denied by the user. This is only used in the Authorization Code authorization browser redirect");

    private String errorType;
    private int errorCode;
    private String codeDescription;
    private String errorDescription;
    
    ErrorCode(String errorType, int httpErrorCode, String codeDescription,
	String errorDescription) {
	this.errorType = errorType;
	this.errorCode = httpErrorCode;
	this.codeDescription = codeDescription;
	this.errorDescription = errorDescription;
    }

    public String getErrorType() {
	return errorType;
    }

    public int getErrorCode() {
	return errorCode;
    }

    public String getCodeDescription() {
	return codeDescription;
    }

    public String getErrorDescription() {
	return errorDescription;
    }
    
    public static boolean hasError(HttpStatus status){
	ErrorCode[] enums = ErrorCode.class.getEnumConstants();
	for(ErrorCode code : enums){
	    if(code.getErrorCode() == status.value()){
		return true;
	    }
	}
	return false;
    }
}
