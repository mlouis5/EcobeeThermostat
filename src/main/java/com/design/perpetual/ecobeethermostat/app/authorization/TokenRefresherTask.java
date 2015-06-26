/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.design.perpetual.ecobeethermostat.app.authorization;

import com.design.perpetual.ecobeethermostat.app.observables.TokenObservable;
import com.design.perpetual.ecobeethermostat.app.observers.TokenObserver;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TimerTask;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MacDerson
 */
public class TokenRefresherTask extends TimerTask implements TokenObservable {

    private final Set<TokenObserver> observers;
    private final ExecutorService pool = Executors.newSingleThreadExecutor();
    private final TokenRefresh tr;

    public TokenRefresherTask(TokenRefresh tr) {
	this.tr = tr;
	this.observers = Sets.newConcurrentHashSet();
    }

    @Override
    public void run() {
	Future<Map<Class<?>, Object>> future = pool.submit(tr);
	try {
	    Map<Class<?>, Object> mapping = future.get();
	    
	    if(mapping.containsKey(Error.class)){
		Error err = (Error) mapping.get(Error.class);
		
		Logger.getLogger(TokenRefresherTask.class.getName()).
		log(Level.SEVERE, null, err.toString());
	    }else{	    
		notifyObservers((Token) mapping.get(Token.class));
	    }
	} catch (InterruptedException | ExecutionException ex) {
	    Logger.getLogger(TokenRefresherTask.class.getName()).
		log(Level.SEVERE, null, ex);
	}
    }

    @Override
    public void addTokenObserver(TokenObserver observer) {
	if (Objects.nonNull(observer)) {
	    observers.add(observer);
	}
    }

    @Override
    public void notifyObservers(Token token) {
	if (Objects.nonNull(token)) {
	    observers.parallelStream().forEach(o -> {
		o.tokenRefreshed(token);
	    });
	}
    }

    @Override
    public void clearObservers() {
	observers.clear();
    }

}
