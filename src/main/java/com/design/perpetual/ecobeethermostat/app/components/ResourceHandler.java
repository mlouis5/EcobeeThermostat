package com.design.perpetual.ecobeethermostat.app.components;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;

import java.util.Optional;

/**
 * Created by maclo on 1/25/2016.
 */
public interface ResourceHandler<R> {

  Optional<R> get(R t);

  Optional<R> post(R t);

  Optional<R> exchange(HttpMethod method, R t, HttpEntity<String> headers);
}
