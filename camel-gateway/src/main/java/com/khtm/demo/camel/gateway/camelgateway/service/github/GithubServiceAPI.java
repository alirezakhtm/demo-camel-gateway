package com.khtm.demo.camel.gateway.camelgateway.service.github;

import com.khtm.demo.camel.gateway.camelgateway.service.ServiceAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GithubServiceAPI extends ServiceAPI {

    private GithubRestAPI githubRestAPI;
    private Logger logger = LoggerFactory.getLogger("google.service.api.class");

    @Autowired
    public GithubServiceAPI(GithubRestAPI githubRestAPI){
        this.githubRestAPI = githubRestAPI;
    }

    @Override
    public void configure() throws Exception {
        logger.info("Start Github Service API");
        this.setRestAPI(githubRestAPI);
        super.configure();
    }
}
