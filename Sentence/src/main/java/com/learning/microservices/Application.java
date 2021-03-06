package com.learning.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by khurram on 10/06/2017.
 */


@SpringBootApplication
@EnableDiscoveryClient
public class Application {

    public static void main(String args[]){
        SpringApplication.run(Application.class, args);

    }
}
