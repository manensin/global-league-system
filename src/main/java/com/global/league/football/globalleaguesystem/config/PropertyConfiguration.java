package com.global.league.football.globalleaguesystem.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:bootstrap.properties")
public class PropertyConfiguration {

    @Value("${football.league.api}")
    private String apiKey;

    public String getApiKey() {
        return apiKey;
    }
}
