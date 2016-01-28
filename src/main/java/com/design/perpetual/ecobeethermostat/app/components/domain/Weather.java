/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.design.perpetual.ecobeethermostat.app.components.domain;

import com.design.perpetual.ecobeethermostat.app.annotations.TypeInformation;
import com.design.perpetual.ecobeethermostat.app.components.abstracts.AbstractResource;

/**
 *
 * @author Mac
 */
@TypeInformation(typeLink = "")
public class Weather  extends AbstractResource<Weather> {

    private static final String URI = "/weather";

    private String timestamp;
    private String weatherStation;
    private WeatherForecast[] forecasts;

    public Weather() {
        super(URI);
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getWeatherStation() {
        return weatherStation;
    }

    public void setWeatherStation(String weatherStation) {
        this.weatherStation = weatherStation;
    }

    public WeatherForecast[] getForecasts() {
        return forecasts;
    }

    public void setForecasts(WeatherForecast[] forecasts) {
        this.forecasts = forecasts;
    }
}
