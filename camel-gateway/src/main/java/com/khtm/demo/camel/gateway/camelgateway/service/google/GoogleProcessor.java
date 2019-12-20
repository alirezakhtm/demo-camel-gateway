package com.khtm.demo.camel.gateway.camelgateway.service.google;


import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

@Component
public class GoogleProcessor implements Processor {
    @Override
    public void process(Exchange exchange) throws Exception {
        /*
          You can do any process for this request
          */
    }
}
