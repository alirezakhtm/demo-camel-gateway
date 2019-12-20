package com.khtm.demo.camel.gateway.camelgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class CamelGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(CamelGatewayApplication.class, args);
    }

}
