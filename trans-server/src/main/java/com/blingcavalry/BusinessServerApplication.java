package com.blingcavalry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
public class BusinessServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BusinessServerApplication.class);
    }
}
