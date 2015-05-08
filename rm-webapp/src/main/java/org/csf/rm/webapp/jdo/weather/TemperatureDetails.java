package org.csf.rm.webapp.jdo.weather;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by andreypopikov on 06/05/15.
 */
public class TemperatureDetails {

    private Float day;
    private Float night;
    private Float evening;
    private Float morning;

    @JsonProperty("day")
    public Float getDay() {
        return day;
    }

    public void setDay(Float day) {
        this.day = day;
    }

    @JsonProperty("night")
    public Float getNight() {
        return night;
    }

    public void setNight(Float night) {
        this.night = night;
    }

    @JsonProperty("eve")
    public Float getEvening() {
        return evening;
    }

    public void setEvening(Float evening) {
        this.evening = evening;
    }

    @JsonProperty("morn")
    public Float getMorning() {
        return morning;
    }

    public void setMorning(Float morning) {
        this.morning = morning;
    }
}
