package org.csf.rm.webapp.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.csf.rm.webapp.exception.WeatherRetrieveException;
import org.csf.rm.webapp.jdo.weather.Weather;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import javax.annotation.PostConstruct;
import java.io.IOException;

/**
 * Created by andreypopikov on 03/05/15.
 */
@Service
public class WeatherService {

    private static final String WEATHER_API_URL = "";
    private static final Logger log = LoggerFactory.getLogger(WeatherService.class);

    private HttpClient httpClient;
    private ObjectMapper objectMapper;

    @PostConstruct
    public void init() {
        this.httpClient = HttpClientBuilder.create().build();
        this.objectMapper = new ObjectMapper();
    }

    public Weather getWeatherByCity(String city) throws WeatherRetrieveException {
        HttpGet getMethod = new HttpGet(WEATHER_API_URL);
        try {
            HttpResponse response = httpClient.execute(getMethod);
            if (response.getStatusLine().getStatusCode() != 200) {
                throw new WeatherRetrieveException("HTTP request return non 200 code.");
            }
            String content = EntityUtils.toString(response.getEntity());
            return objectMapper.readValue(content, Weather.class);
        } catch (IOException e) {
            throw new WeatherRetrieveException(e.getMessage(), e);
        }
    }

}
