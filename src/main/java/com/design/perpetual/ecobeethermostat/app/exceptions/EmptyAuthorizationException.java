/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.design.perpetual.ecobeethermostat.app.exceptions;

/**
 *
 * @author MacDerson
 */
public class EmptyAuthorizationException extends Exception{
    
    public EmptyAuthorizationException(){
        super("Authorization did not contain required values");
    }
    
    public EmptyAuthorizationException(String msg){
        super(msg);
    }
}
