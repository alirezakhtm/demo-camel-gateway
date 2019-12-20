package com.khtm.demo.camel.gateway.camelgateway.service;

import org.apache.camel.Processor;

public class RestObject {

    private String url;
    private Processor processor;

    public RestObject() {
    }

    public RestObject(String url, Processor processor) {
        this.url = url;
        this.processor = processor;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }
}
