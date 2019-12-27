package com.khtm.demo.camel.gateway.lib;

import org.apache.camel.builder.RouteBuilder;

import java.util.UUID;

public abstract class ServiceAPI extends RouteBuilder {

    private RestAPI restAPI;

    protected void setRestAPI(RestAPI restAPI){
        this.restAPI = restAPI;
    }

    @Override
    public void configure() throws Exception {

        String routeName = UUID.randomUUID().toString();

        rest().get(restAPI.GetRestAPI().getUrl()).toD("direct:get-rest-processor-" + routeName);
        rest().get(restAPI.PostRestAPI().getUrl()).toD("direct:post-rest-processor-" + routeName);

        rest().get(restAPI.GetRestAPI().getUrl() + "-status").toD("direct:home-" + routeName);

        from("direct:get-rest-processor-" + routeName).process(restAPI.GetRestAPI().getProcessor());
        from("direct:post-rest-processor-" + routeName).process(restAPI.PostRestAPI().getProcessor());

        from("direct:home-" + routeName).transform().constant("{\"status\":\"Up\"}");

    }
}
