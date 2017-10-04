package com.bookings.repository;

import com.bookings.model.Region;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by randika on 9/19/17.
 */
@Repository
public interface RegionRepository extends MongoRepository<Region,String> {
}
