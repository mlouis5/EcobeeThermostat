/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.design.perpetual.ecobeethermostat.app.authorization.impl;

import com.design.perpetual.ecobeethermostat.app.authorization.Token;
import com.design.perpetual.ecobeethermostat.app.authorization.utils.TokenValidator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author MacDerson
 */
public class Tokens implements Token {
    
    @JsonProperty("access_token")
    private String accessToken;
    @JsonProperty("token_type")
    private String tokenType;
    @JsonProperty("expires_in")
    private int expiresIn;
    @JsonProperty("refresh_token")
    private String refreshToken;
    private String scope;

    private TokenValidator tokenValidator;

    public Tokens(){
        this.tokenValidator = new TokenValidator();
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getTokenType() {
        return tokenType;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    public int getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(int expiredIn) {
        this.expiresIn = expiredIn;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    @Override
    public boolean isValidToken() {
        try{
            tokenValidator.isValidToken(this.accessToken);
            tokenValidator.isValidToken(this.refreshToken);
            return true;
        }catch (Exception e){
            return false;
        }
    }

}
