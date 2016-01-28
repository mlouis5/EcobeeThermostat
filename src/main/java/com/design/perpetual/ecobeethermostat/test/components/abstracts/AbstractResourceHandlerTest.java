package com.design.perpetual.ecobeethermostat.test.components.abstracts;

import com.design.perpetual.ecobeethermostat.app.components.abstracts.AbstractResourceHandler;
import com.design.perpetual.ecobeethermostat.app.components.abstracts.concrete.ThermostatHandler;
import com.design.perpetual.ecobeethermostat.app.components.domain.Thermostat;

import static org.testng.Assert.*;

/**
 * Created by maclo on 1/27/2016.
 */
public class AbstractResourceHandlerTest {

  private AbstractResourceHandler<Thermostat> thermostatAbstractResourceHandler;
  private Thermostat thermostat;

  @org.testng.annotations.BeforeMethod
  public void setUp() throws Exception {
    thermostatAbstractResourceHandler = new ThermostatHandler();
    thermostat = new Thermostat();
  }

  @org.testng.annotations.AfterMethod
  public void tearDown() throws Exception {
    thermostatAbstractResourceHandler = null;
  }

  @org.testng.annotations.Test
  public void testGet() throws Exception {
    thermostatAbstractResourceHandler.get(thermostat);
  }

  @org.testng.annotations.Test
  public void testPost() throws Exception {

  }

  @org.testng.annotations.Test
  public void testExchange() throws Exception {

  }
}