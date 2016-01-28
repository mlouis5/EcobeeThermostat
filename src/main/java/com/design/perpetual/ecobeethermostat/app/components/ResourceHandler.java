package com.design.perpetual.ecobeethermostat.app.components;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;

import java.util.Optional;

/**
 * Created by maclo on 1/25/2016.
 */
public interface ResourceHandler<R> {

  Optional<R> get();

  Optional<R> post();

  Optional<R> exchange(HttpMethod method, HttpEntity<String> headers);
}
