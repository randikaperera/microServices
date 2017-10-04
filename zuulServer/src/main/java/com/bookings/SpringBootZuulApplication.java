package com.bookings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by randika on 9/19/17.
 */
@SpringBootApplication
@EnableZuulProxy
public class SpringBootZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootZuulApplication.class,args);
    }
}
