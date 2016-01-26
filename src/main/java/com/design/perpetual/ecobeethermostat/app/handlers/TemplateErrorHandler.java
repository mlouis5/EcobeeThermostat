/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.design.perpetual.ecobeethermostat.app.handlers;

import com.design.perpetual.ecobeethermostat.app.enums.ErrorCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.client.ResponseErrorHandler;

import java.io.IOException;

/**
 * @author MacDerson
 */
@Component
public class TemplateErrorHandler implements ResponseErrorHandler {

  private static final Logger log = LoggerFactory.getLogger(TemplateErrorHandler.class);

  @Override
  public boolean hasError(ClientHttpResponse chr) throws IOException {
    return ErrorCode.hasError(chr.getStatusCode());
  }

  @Override
  public void handleError(ClientHttpResponse chr) throws IOException {
    log.error("Response error: {} {}", chr.getStatusCode(), chr.getStatusText());
  }

}
