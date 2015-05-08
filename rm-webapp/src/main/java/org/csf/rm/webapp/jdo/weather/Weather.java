package org.csf.rm.webapp.jdo.weather;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Created by andreypopikov on 06/05/15.
 */
public class Weather {

    private String code;
    private List<DayDetails> dayDetailses;

    @JsonProperty("cod")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @JsonProperty("list")
    public List<DayDetails> getDayDetailses() {
        return dayDetailses;
    }

    public void setDayDetailses(List<DayDetails> dayDetailses) {
        this.dayDetailses = dayDetailses;
    }
}
