package com.bookings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by randika on 9/13/17.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class BungalowServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BungalowServiceApplication.class,args);
        System.out.println("Application Started");
    }
}
