/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.design.perpetual.ecobeethermostat;

import com.design.perpetual.ecobeethermostat.app.AppState;
import com.design.perpetual.ecobeethermostat.app.authorization.AppKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

/**
 * @author Mac
 */
@SpringBootApplication
@PropertySource("classpath:application.properties")
public class Application {

  @Autowired
  private Environment env;

  public static void main(String[] args) {
    ConfigurableApplicationContext cac = SpringApplication.run(Application.class, args);
    AppKey appKey = cac.getBean(AppKey.class);
    appKey.getKey();
  }

  @Bean
  public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
    return new PropertySourcesPlaceholderConfigurer();
  }

  @Bean
  public AppState appState() {
    return AppState.valueOf(env.getProperty("appState"));
  }
}
