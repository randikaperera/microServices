package com.bookings;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by randika on 9/18/17.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class RegionServiceApplication {
    public static void main(String[] args) {
SpringApplication.run(RegionServiceApplication.class,args);
    }
}
