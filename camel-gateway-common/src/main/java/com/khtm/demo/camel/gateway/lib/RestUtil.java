package com.khtm.demo.camel.gateway.lib;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;

public class RestUtil {

    /**
     * this function for calling GET method
     *
     * @param url desired url that we want to call it.
     * @return return result of calling the url.
     *
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
