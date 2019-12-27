package com.khtm.demo.camel.gateway.camelgateway.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {

    @Bean(name = "github-rest-service-find-me")
    public String getGithubRestService(){
        return "https://github.com/alirezakhtm";
    }


    @Bean(name = "yahoo-rest-service")
    public String getYahooRestService(){
        return "https://us.yahoo.com/?guccounter=1";
    }
}
