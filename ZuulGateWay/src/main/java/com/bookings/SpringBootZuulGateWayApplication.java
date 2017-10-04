package com.bookings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by RMPERERA on 9/19/2017.
 */
@SpringBootApplication
@EnableZuulProxy

public class SpringBootZuulGateWayApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootZuulGateWayApplication.class,args);
    }
}
