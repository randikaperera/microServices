package com.bookings.service;

import com.bookings.model.Region;
import com.bookings.repository.RegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by randika on 9/19/17.
 */
@Service

public class RegionService {
    @Autowired
    RegionRepository regionRepository;

    public List<Region> getAllRegions(){
return regionRepository.findAll();
    }
    public Region getRegion(String id){
        System.out.println("Server IP 8052");
return regionRepository.findOne(id);
    }

    public void addRegion(Region region){
regionRepository.insert(region);
    }

    public void updateRegion(Region region){
regionRepository.save(region);
    }
    public void deleteRegion(String id){
regionRepository.delete(id);
    }
}
