package com.bookings.controller;

import com.bookings.model.Bungalow;
import com.bookings.service.BungalowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;


import java.util.List;

/**
 * Created by RMPERERA on 9/14/2017.
 */
//@EnableCircuitBreaker
@RestController
@CrossOrigin
@RequestMapping("/bungalows")
public class BungalowController {

    BungalowService bungalowService;





    /*public BungalowController() {
    }*/

    public BungalowController(BungalowService bungalowService) {
        this.bungalowService = bungalowService;
    }

    @GetMapping
    public List<Bungalow> getAllBungalows() {

        return bungalowService.getAllBungalows();
    }

    @GetMapping(value = "/{id}")
    public Bungalow getBungalow(@PathVariable String id) {
        return bungalowService.getBungalow(id);

    }

    @PostMapping
    public void addBungalow(@RequestBody Bungalow bungalow) {
        bungalowService.addBungalow(bungalow);

    }

    @PutMapping
    public void updateBungalow(@RequestBody Bungalow bungalow) {
        bungalowService.updateBungalow(bungalow);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteBungalow(@PathVariable String id) {
        bungalowService.deleteBungalow(id);
    }


}
