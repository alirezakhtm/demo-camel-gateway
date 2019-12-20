package com.khtm.demo.camel.gateway.camelgateway.service.google;

import com.khtm.demo.camel.gateway.camelgateway.service.ServiceAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoogleServiceAPI extends ServiceAPI {

    @Autowired
    private GoogleRestAPI googleRestAPI;

    @Override
    protected void callService() {

    }

    @Override
    public void configure() throws Exception {
        this.setRestAPI(googleRestAPI);
        super.configure();
    }
}
