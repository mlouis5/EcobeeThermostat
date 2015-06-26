/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.design.perpetual.ecobeethermostat.app.authorization;

import com.design.perpetual.ecobeethermostat.app.exceptions.EmptyAppKeyException;
import com.design.perpetual.ecobeethermostat.app.exceptions.NullAppKeyException;
import java.util.Objects;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author MacDerson
 */
public class AuthorizationRequestor {

    private static final String BASE_URL = "https://api.ecobee.com/authorize?response_type=ecobeePin&client_id=";

    private String appKey;

    public AuthorizationRequestor() {
    }

    public AuthorizationRequestor(String appKey) throws NullAppKeyException,
	EmptyAppKeyException {
	this.appKey = appKey;
	validateAppKey();
    }

    public void setAppKey(String appKey) throws NullAppKeyException,
	EmptyAppKeyException {
	this.appKey = appKey;
	validateAppKey();
    }

    public PinAuthorization getAuthorization() {
	RestTemplate template = new RestTemplate();

	String url = BASE_URL + appKey + "&scope=smartWrite";
	return template.getForObject(url, PinAuthorization.class);
    }

    private void validateAppKey() throws NullAppKeyException,
	EmptyAppKeyException {
	if (Objects.isNull(appKey)) {
	    throw new NullAppKeyException();
	} else if (appKey.isEmpty()) {
	    throw new EmptyAppKeyException();
	}
    }
}
