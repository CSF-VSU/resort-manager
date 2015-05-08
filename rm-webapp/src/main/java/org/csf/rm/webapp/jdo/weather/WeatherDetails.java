package org.csf.rm.webapp.jdo.weather;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by andreypopikov on 06/05/15.
 * "main": "Clear",
 "description": "ясно",
 "icon": "01d"
 */
public class WeatherDetails {

    private String main;
    private String description;
    private String iconId;

    @JsonProperty("main")
    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("icon")
    public String getIconId() {
        return iconId;
    }

    public void setIconId(String iconId) {
        this.iconId = iconId;
    }
}
