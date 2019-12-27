package com.khtm.demo.camel.gateway.camelgateway.service.github;

import com.khtm.demo.camel.gateway.lib.RestServiceProcess;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GithubProcessor extends RestServiceProcess {

    public GithubProcessor(@Qualifier("google-rest-service-find-me") String urlDesired) {
        super(urlDesired);
    }
}
