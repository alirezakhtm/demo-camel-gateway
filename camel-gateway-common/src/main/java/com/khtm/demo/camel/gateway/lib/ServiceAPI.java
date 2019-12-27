package com.khtm.demo.camel.gateway.lib;

import org.apache.camel.builder.RouteBuilder;

public abstract class ServiceAPI extends RouteBuilder {

    private RestAPI restAPI;

    protected void setRestAPI(RestAPI restAPI){
        this.restAPI = restAPI;
    }

    @Override
    public void configure() throws Exception {

        rest().get(restAPI.GetRestAPI().getUrl()).to("direct:get-rest-processor");
        rest().get(restAPI.PostRestAPI().getUrl()).to("direct:post-rest-processor");

        // default home page
        rest().get(restAPI.GetRestAPI().getUrl() + "-status").to("direct:home");


        from("direct:get-rest-processor").process(restAPI.GetRestAPI().getProcessor());
        from("direct:post-rest-processor").process(restAPI.PostRestAPI().getProcessor());

        from("direct:home").transform().constant("{\"status\":\"Up\"}");

    }
}
