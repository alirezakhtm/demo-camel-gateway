package com.khtm.demo.camel.gateway.lib;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;

public abstract class RestServiceProcess implements Processor {

    String urlDesired = null;

    public RestServiceProcess(String urlDesired){
        this.urlDesired = urlDesired;
    }

    @Override
    public void process(Exchange exchange) throws Exception {
        Message message = exchange.getIn();
        message.setBody(RestUtil.callRest(urlDesired));
        message.setHeader("Content-Type", "text/html; charset=UTF-8");
        exchange.setIn(message);
    }
}
