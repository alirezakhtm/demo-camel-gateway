package com.khtm.demo.camel.gateway.camelgateway.service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;

public class RestUtil {

    /**
     * this function for calling GET method
     * */
    public static String callRest(String url){
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> rsp = null;
        try {
            rsp = restTemplate.getForEntity(new URI(url), String.class);
        } catch (URISyntaxException e) {
            e.printStackTrace();
            return null;
        }
        return rsp.getBody();
    }

}
