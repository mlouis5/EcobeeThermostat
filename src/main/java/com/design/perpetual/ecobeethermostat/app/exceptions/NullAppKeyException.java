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
public class NullAppKeyException extends Exception {
    
    public NullAppKeyException(){
	super("AppKey is null");
    }
    
    public NullAppKeyException(String msg){
	super(msg);
    }
}
