package com.khtm.demo.camel.gateway.camelgateway.service.github;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GithubConfiguration {

    @Bean(name = "google-rest-service-find-me")
    public String getRestGoogleRestService(){
        return "https://github.com/alirezakhtm";
    }

}
