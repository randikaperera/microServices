package com.bookings.service;

import com.bookings.model.Bungalow;
import com.bookings.model.Region;
import com.bookings.repository.BungalowRepository;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Created by RMPERERA on 9/14/2017.
 */
@Service
@EnableCircuitBreaker
public class BungalowService {

    BungalowRepository bungalowRepository;

    public BungalowService(BungalowRepository bungalowRepository) {
        this.bungalowRepository = bungalowRepository;
    }


    @Bean
    public RestTemplate rest(RestTemplateBuilder builder) {
        return builder.build();
    }
//Rest Template start

    @LoadBalanced
    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Autowired
    RestTemplate restTemplate;


    ////Rest Template end

    public List<Bungalow> getAllBungalows() {
        // return bungalowRepository.getBungalows();
        return bungalowRepository.findAll();
    }

    public void addBungalow(Bungalow bungalow) {
        bungalowRepository.insert(bungalow);
    }

    public void deleteBungalow(String id) {
        bungalowRepository.delete(id);
    }

    public void updateBungalow(Bungalow bungalow) {
        bungalowRepository.save(bungalow);
    }

    @HystrixCommand(fallbackMethod = "reliable")
    public Bungalow getBungalow(String id) {

//return bungalowRepository.findOne(id);
        Bungalow bungalow = bungalowRepository.findOne(id);
        // Region region = restTemplate.exchange("http://RegionAPI-microservice/regions/"+bungalow.getRegionId(),Region.class).getBody();
        Region region = restTemplate.getForObject("http://RegionAPI-microservice/regions/" + bungalow.getRegionId(), Region.class);
        bungalow.setRegionId(region.getName());
        return bungalow;

    }

    public Bungalow reliable(String id) {
       // return bungalowRepository.findOne(id);

        Bungalow bungalow = bungalowRepository.findOne(id);
        // Region region = restTemplate.exchange("http://RegionAPI-microservice/regions/"+bungalow.getRegionId(),Region.class).getBody();
       // Region region = restTemplate.getForObject("http://RegionAPI-microservice/regions/" + bungalow.getRegionId(), Region.class);
        bungalow.setRegionId("ABC");
        return bungalow;    }
}
