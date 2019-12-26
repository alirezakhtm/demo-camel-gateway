package com.khtm.demo.camel.gateway.camelgateway.service.google;


import com.khtm.demo.camel.gateway.camelgateway.service.RestUtil;
import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

@Component
public class GoogleProcessor implements Processor {
    @Override
    public void process(Exchange exchange) throws Exception {
        /*
          You can do any process for this request
          */
        Message message = exchange.getIn();
//        message.setBody(RestUtil.callRest("https://www.google.com/search?q=alirezakhtm"));
        message.setBody(RestUtil.callRest("https://github.com/alirezakhtm"));
        message.setHeader("Content-Type", "text/html; charset=UTF-8");
//        message.setHeader("Content-Type", "multipart/form-data; boundary=something");
        exchange.setIn(message);
    }
}
