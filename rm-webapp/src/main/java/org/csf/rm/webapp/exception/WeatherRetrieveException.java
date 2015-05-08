package org.csf.rm.webapp.exception;

/**
 * Created by andreypopikov on 06/05/15.
 */
public class WeatherRetrieveException extends Exception {

    public WeatherRetrieveException() {
    }

    public WeatherRetrieveException(String message) {
        super(message);
    }

    public WeatherRetrieveException(String message, Throwable cause) {
        super(message, cause);
    }

}
