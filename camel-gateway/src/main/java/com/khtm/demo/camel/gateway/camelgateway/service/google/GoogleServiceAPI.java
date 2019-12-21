package com.khtm.demo.camel.gateway.camelgateway.service.google;

import com.khtm.demo.camel.gateway.camelgateway.service.ServiceAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoogleServiceAPI extends ServiceAPI {

    private GoogleRestAPI googleRestAPI;
    private Logger logger = LoggerFactory.getLogger("google.service.api.class");

    @Autowired
    public GoogleServiceAPI(GoogleRestAPI googleRestAPI){
        this.googleRestAPI = googleRestAPI;
    }

    @Override
    protected void callService() {
        logger.info("CallService function has been called ...");
    }

    @Override
    public void configure() throws Exception {
        this.setRestAPI(googleRestAPI);
        super.configure();
    }
}
