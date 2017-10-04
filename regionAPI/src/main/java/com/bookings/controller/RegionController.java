package com.bookings.controller;

import com.bookings.model.Region;
import com.bookings.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by randika on 9/19/17.
 */
@RestController
@CrossOrigin
@RequestMapping("/regions")
public class RegionController {
    @Autowired
RegionService regionService;



    @GetMapping
public List<Region> getAllRegions(){
return regionService.getAllRegions();
}
@GetMapping(value = "/{id}")
public Region getRegion(@PathVariable String id){
return regionService.getRegion(id);
}
@PostMapping
public void addRegion(@RequestBody Region region){
regionService.addRegion(region);

}
@PutMapping
public void updateRegion(@RequestBody Region region){
regionService.updateRegion(region);
}
@DeleteMapping(value = "/{id}")
public void deleteRegion(@PathVariable String id){
regionService.deleteRegion(id);
}
}
