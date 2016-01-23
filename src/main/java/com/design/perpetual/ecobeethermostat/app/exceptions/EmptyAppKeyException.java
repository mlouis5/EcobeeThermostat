/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.design.perpetual.ecobeethermostat.app.exceptions;

import com.design.perpetual.ecobeethermostat.app.components.Runtime;

/**
 *
 * @author MacDerson
 */
public class EmptyAppKeyException extends RuntimeException {
    
    public EmptyAppKeyException(){
	super("AppKey is empty");
    }
    
    public EmptyAppKeyException(String msg){
	super(msg);
    }
}
