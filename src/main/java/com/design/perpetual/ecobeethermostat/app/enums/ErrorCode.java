/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.design.perpetual.ecobeethermostat.app.enums;

import org.springframework.http.HttpStatus;

/**
 * @author MacDerson
 */
public enum ErrorCode {

  ACCESS_DENIED("access_denied", 302, "found", "Authorization has been denied by the user. This is only used in the "
      + "Authorization Code authorization browser redirect"),

  INVALID_REQUEST("invalid_request", 400, "Bad Request", "The request is malformed. Check parameters."),

  INVALID_CLIENT("invalid_client", 401, "Unauthorized", "Authentication error, invalid authentication method, lack " +
      "of" + " credentials, etc."),

  INVALID_GRANT("invalid_grant", 400, "Bad Request", "The authorization grant, token or credentials are expired or "
      + "invalid."),

  UNAUTHORIZED_CLIENT("unauthorized_client", 400, "Bad Request", "The authenticated client is not authorized to " +
      "use this authorization grant type."),

  UNSUPPORTED_GRANT_TYPE("unsupported_grant_type", 400, "Bad Request", "The authorization grant type is not " +
      "supported by the authorization server."),

  INVALID_SCOPE("invalid_scope", 400, "Bad Request", "The requested scope is invalid, unknown, malformed, or " +
      "exceeds the scope granted by the resource owner."),

  NOT_SUPPORTED("not_supported", 400, "Bad Request", "HTTP method not supported for this request."),

  ACCOUNT_LOCKED("account_locked", 401, "Unauthorized", "Account is temporarily locked."),

  ACCOUNT_DISABLED("account_disabled", 401, "Unauthorized", "Account is disabled."),

  AUTHORIZATION_PENDING("authorization_pending", 401, "Unauthorized", "Waiting for user to authorize application."),

  AUTHORIZATION_EXPIRED("authorization_expired", 401, "Unauthorized", "The authorization has expired waiting for " +
      "user" + " to authorize."),

  SLOW_DOWN("slow_down", 401, "Unauthorized", "Slow down polling to the requested interval");

  private String errorType;
  private int errorCode;
  private String codeDescription;
  private String errorDescription;

  ErrorCode(String errorType, int httpErrorCode, String codeDescription, String errorDescription) {
    this.errorType = errorType;
    this.errorCode = httpErrorCode;
    this.codeDescription = codeDescription;
    this.errorDescription = errorDescription;
  }

  public static boolean hasError(HttpStatus status) {
    ErrorCode[] enums = ErrorCode.class.getEnumConstants();
    for (ErrorCode code : enums) {
      if (code.getErrorCode() == status.value()) {
        return true;
      }
    }
    return false;
  }

  public String getErrorType() {
    return errorType;
  }

  public int getErrorCode() {
    return errorCode;
  }

  public String getCodeDescription() {
    return codeDescription;
  }

  public String getErrorDescription() {
    return errorDescription;
  }
}
