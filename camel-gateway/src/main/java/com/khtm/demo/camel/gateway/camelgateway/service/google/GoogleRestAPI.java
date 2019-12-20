package com.khtm.demo.camel.gateway.camelgateway.service.google;

import com.khtm.demo.camel.gateway.camelgateway.service.RestAPI;
import com.khtm.demo.camel.gateway.camelgateway.service.RestObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GoogleRestAPI implements RestAPI {

    @Autowired
    GoogleProcessor googleProcessor;

    @Override
    public RestObject GetRestAPI() {
        RestObject restObject = new RestObject("/find-me", googleProcessor);
        return restObject;
    }

    @Override
    public RestObject PutRestAPI() {
        RestObject restObject = new RestObject("/find-me", googleProcessor);
        return restObject;
    }
}