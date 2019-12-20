package com.khtm.demo.camel.gateway.camelgateway.service.google;

import com.khtm.demo.camel.gateway.camelgateway.service.ServiceAPI;
import org.springframework.stereotype.Service;

@Service
public class GoogleServiceAPI extends ServiceAPI {
    @Override
    protected void callService() {

    }

    @Override
    public void configure() throws Exception {
        this.setRestAPI(new GoogleRestAPI());
        super.configure();
    }
}
