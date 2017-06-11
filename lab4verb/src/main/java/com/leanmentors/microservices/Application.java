package com.leanmentors.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by khurram on 08/06/2017.
 */
@EnableDiscoveryClient
@SpringBootApplication
public class Application {


    public static void main(String args[]){
        SpringApplication.run(Application.class, args);

    }
}
