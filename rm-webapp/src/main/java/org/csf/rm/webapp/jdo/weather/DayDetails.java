package org.csf.rm.webapp.jdo.weather;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.List;

/**
 * Created by andreypopikov on 06/05/15.
 */
public class DayDetails {

    private Date dateTime;
    private TemperatureDetails temperatureDetails;
    private WeatherDetails weatherDetails;
    private Float pressure;
    private Float humidity;
    private Float speed;

    @JsonProperty("dt")
    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    @JsonProperty("temp")
    public TemperatureDetails getTemperatureDetails() {
        return temperatureDetails;
    }

    public void setTemperatureDetails(TemperatureDetails temperatureDetails) {
        this.temperatureDetails = temperatureDetails;
    }

    @JsonProperty("weather")
    public WeatherDetails getWeatherDetails() {
        return weatherDetails;
    }

    public void setWeatherDetails(WeatherDetails weatherDetails) {
        this.weatherDetails = weatherDetails;
    }

    @JsonProperty("pressure")
    public Float getPressure() {
        return pressure;
    }

    public void setPressure(Float pressure) {
        this.pressure = pressure;
    }

    @JsonProperty("humidity")
    public Float getHumidity() {
        return humidity;
    }

    public void setHumidity(Float humidity) {
        this.humidity = humidity;
    }

    @JsonProperty("speed")
    public Float getSpeed() {
        return speed;
    }

    public void setSpeed(Float speed) {
        this.speed = speed;
    }
}
