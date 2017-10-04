package com.bookings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * Created by randika on 9/20/17.
 */
@SpringBootApplication
@RibbonClient(name="RegionAPI-microservice",configuration = RegionConfiguration.class)
public class SpringClientSideRibbonApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringClientSideRibbonApplication.class,args);
    }

}
