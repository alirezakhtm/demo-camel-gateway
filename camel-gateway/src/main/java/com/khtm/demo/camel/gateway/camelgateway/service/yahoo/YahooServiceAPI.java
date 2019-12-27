package com.khtm.demo.camel.gateway.camelgateway.service.yahoo;

import com.khtm.demo.camel.gateway.lib.ServiceAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class YahooServiceAPI extends ServiceAPI {

    private YahooRestAPI yahooRestAPI;
    private Logger logger = LoggerFactory.getLogger("yahoo.service.api.class");

    @Autowired
    public YahooServiceAPI(YahooRestAPI yahooRestAPI){
        this.yahooRestAPI = yahooRestAPI;
    }

    @Override
    public void configure() throws Exception {
        logger.info("Yahoo service API start.");
        this.setRestAPI(yahooRestAPI);
        super.configure();
    }
}
