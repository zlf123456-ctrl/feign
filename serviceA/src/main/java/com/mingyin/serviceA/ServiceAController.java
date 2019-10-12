package com.mingyin.serviceA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ServiceAController {
    public static void main(String[] args){
        SpringApplication.run(ServiceAApplication.class, args);
    }
}
