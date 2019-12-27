package com.khtm.demo.camel.gateway.camelgateway.service.yahoo;

import com.khtm.demo.camel.gateway.lib.RestAPI;
import com.khtm.demo.camel.gateway.lib.RestObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class YahooRestAPI implements RestAPI {

    private final YahooProcess yahooProcess;

    @Autowired
    public YahooRestAPI(YahooProcess yahooProcess) {
        this.yahooProcess = yahooProcess;
    }

    @Override
    public RestObject GetRestAPI() {
        return new RestObject("/yahoo-test", yahooProcess);
    }

    @Override
    public RestObject PostRestAPI() {
        return new RestObject("/yahoo-test-de", yahooProcess);
    }
}
