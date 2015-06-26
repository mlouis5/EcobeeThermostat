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
public class NullAuthorizationException extends Exception {
    
    public NullAuthorizationException(){
        super("Null Authorization provided");
    }
    
    public NullAuthorizationException(String msg){
        super(msg);
    }
}
