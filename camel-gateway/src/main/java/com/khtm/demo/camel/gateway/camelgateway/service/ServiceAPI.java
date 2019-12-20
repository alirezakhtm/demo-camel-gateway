package com.khtm.demo.camel.gateway.camelgateway.service;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.OnExceptionDefinition;

public abstract class ServiceAPI extends RouteBuilder {

    private RestAPI restAPI;

    protected abstract void callService();

    protected void setRestAPI(RestAPI restAPI){
        this.restAPI = restAPI;
    }

    @Override
    public void configure() throws Exception {

        rest().get(restAPI.GetRestAPI().getUrl()).to("direct:get-rest-processor");
        rest().get(restAPI.PutRestAPI().getUrl()).to("direct:put-rest-processor");

        // default home page
        rest().get(restAPI.GetRestAPI().getUrl() + "-status").to("direct:home");


        from("direct:get-rest-processor").process(restAPI.GetRestAPI().getProcessor());//.marshal().json();
        from("direct:put-rest-processor").process(restAPI.PutRestAPI().getProcessor());//.marshal().json();

        from("direct:home").transform().constant("{\"stauts\":\"Up\"}");


    }
}
