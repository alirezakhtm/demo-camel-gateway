package com.khtm.demo.camel.gateway.camelgateway.service.yahoo;

import com.khtm.demo.camel.gateway.lib.RestServiceProcess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class YahooProcess extends RestServiceProcess {

    @Autowired
    public YahooProcess(@Qualifier("yahoo-rest-service") String urlDesired) {
        super(urlDesired);
    }
}
