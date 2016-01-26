/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.design.perpetual.ecobeethermostat.app.observables;

import com.design.perpetual.ecobeethermostat.app.authorization.impl.Tokens;
import com.design.perpetual.ecobeethermostat.app.observers.TokenObserver;

/**
 *
 * @author MacDerson
 */
public interface TokenObservable {
    
    void addTokenObserver(TokenObserver Observer);
    
    void notifyObservers(Tokens tokens);
    
    void clearObservers();
}
