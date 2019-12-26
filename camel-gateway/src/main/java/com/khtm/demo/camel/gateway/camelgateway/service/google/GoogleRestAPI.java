package com.khtm.demo.camel.gateway.camelgateway.service.google;

import com.khtm.demo.camel.gateway.camelgateway.service.RestAPI;
import com.khtm.demo.camel.gateway.camelgateway.service.RestObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GoogleRestAPI implements RestAPI {

    private GoogleProcessor googleProcessor;

    @Autowired
    public GoogleRestAPI(GoogleProcessor googleProcessor) {
        this.googleProcessor = googleProcessor;
    }

    @Override
    public RestObject GetRestAPI() {
        RestObject restObject = new RestObject("/find-me", googleProcessor);
        return restObject;
    }

    @Override
    public RestObject PostRestAPI() {
        RestObject restObject = new RestObject("/find-me-de", googleProcessor);
        return restObject;
    }
}
