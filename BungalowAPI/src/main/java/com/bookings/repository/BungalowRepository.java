package com.bookings.repository;

import com.bookings.model.Bungalow;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by RMPERERA on 9/14/2017.
 */
@Repository
public interface BungalowRepository extends MongoRepository<Bungalow,String>{

}
