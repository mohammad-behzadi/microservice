package com.example.discoveryservic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DiscoveryservicApplication {

    public static void main(String[] args) {
        SpringApplication.run(DiscoveryservicApplication.class, args);
    }

}
