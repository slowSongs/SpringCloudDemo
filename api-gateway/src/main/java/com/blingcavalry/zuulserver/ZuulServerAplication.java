package com.blingcavalry.zuulserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @auhther Arvin
 * @date 2020/1/6 22:25
 * @description:
 */
@SpringBootApplication
@EnableZuulProxy
public class ZuulServerAplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulServerAplication.class);
    }
}
