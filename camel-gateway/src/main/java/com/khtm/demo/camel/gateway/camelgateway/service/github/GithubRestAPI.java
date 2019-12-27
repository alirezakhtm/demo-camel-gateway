package com.khtm.demo.camel.gateway.camelgateway.service.github;

import com.khtm.demo.camel.gateway.camelgateway.service.RestAPI;
import com.khtm.demo.camel.gateway.camelgateway.service.RestObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GithubRestAPI implements RestAPI {

    private GithubProcessor githubProcessor;

    @Autowired
    public GithubRestAPI(GithubProcessor githubProcessor) {
        this.githubProcessor = githubProcessor;
    }

    @Override
    public RestObject GetRestAPI() {
        RestObject restObject = new RestObject("/find-me", githubProcessor);
        return restObject;
    }

    @Override
    public RestObject PostRestAPI() {
        RestObject restObject = new RestObject("/find-me-de", githubProcessor);
        return restObject;
    }
}
