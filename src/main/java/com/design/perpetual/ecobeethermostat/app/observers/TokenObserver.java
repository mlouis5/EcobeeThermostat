/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.design.perpetual.ecobeethermostat.app.observers;

import com.design.perpetual.ecobeethermostat.app.authorization.Token;

/**
 *
 * @author MacDerson
 */
public interface TokenObserver {

    void tokenRefreshed(Token token);
}
