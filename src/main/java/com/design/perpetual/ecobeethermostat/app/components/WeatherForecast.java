/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.design.perpetual.ecobeethermostat.app.components;

import com.design.perpetual.ecobeethermostat.app.annotations.TypeInformation;

/**
 *
 * @author Mac
 */
@TypeInformation(typeLink = "")
public class WeatherForecast {

    private Integer weatherSymbol;
    private String dateTime;
    private String condition;
    private Integer temperature;
    private Integer pressure;
    private Integer relativeHumidity;
    private Integer dewpoint;
    private Integer visibility;
    private Integer windSpeed;
    private Integer windGust;
    private String windDirection;
    private Integer windBearing;
    private Integer pop;
    private Integer tempHigh;
    private Integer tempLow;
    private Integer sky;

    public Integer getWeatherSymbol() {
        return weatherSymbol;
    }

    public void setWeatherSymbol(Integer weatherSymbol) {
        this.weatherSymbol = weatherSymbol;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public Integer getTemperature() {
        return temperature;
    }

    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }

    public Integer getPressure() {
        return pressure;
    }

    public void setPressure(Integer pressure) {
        this.pressure = pressure;
    }

    public Integer getRelativeHumidity() {
        return relativeHumidity;
    }

    public void setRelativeHumidity(Integer relativeHumidity) {
        this.relativeHumidity = relativeHumidity;
    }

    public Integer getDewpoint() {
        return dewpoint;
    }

    public void setDewpoint(Integer dewpoint) {
        this.dewpoint = dewpoint;
    }

    public Integer getVisibility() {
        return visibility;
    }

    public void setVisibility(Integer visibility) {
        this.visibility = visibility;
    }

    public Integer getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(Integer windSpeed) {
        this.windSpeed = windSpeed;
    }

    public Integer getWindGust() {
        return windGust;
    }

    public void setWindGust(Integer windGust) {
        this.windGust = windGust;
    }

    public String getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(String windDirection) {
        this.windDirection = windDirection;
    }

    public Integer getWindBearing() {
        return windBearing;
    }

    public void setWindBearing(Integer windBearing) {
        this.windBearing = windBearing;
    }

    public Integer getPop() {
        return pop;
    }

    public void setPop(Integer pop) {
        this.pop = pop;
    }

    public Integer getTempHigh() {
        return tempHigh;
    }

    public void setTempHigh(Integer tempHigh) {
        this.tempHigh = tempHigh;
    }

    public Integer getTempLow() {
        return tempLow;
    }

    public void setTempLow(Integer tempLow) {
        this.tempLow = tempLow;
    }

    public Integer getSky() {
        return sky;
    }

    public void setSky(Integer sky) {
        this.sky = sky;
    }
}
