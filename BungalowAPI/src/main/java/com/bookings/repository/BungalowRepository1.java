package com.bookings.repository;

import com.bookings.model.Bungalow;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RMPERERA on 9/14/2017.
 */
@Repository
public class BungalowRepository1 {

    public List<Bungalow> getBungalows(){
        List<Bungalow> bungalows=new ArrayList<>();
        Bungalow bungalow1=new Bungalow();
        bungalow1.setId("1");
        bungalow1.setAddress("Maharagama");
        bungalow1.setCode("100");
        bungalow1.setContactNumber("2126562554");
        bungalow1.setBungalowImageURL("http://image");

        Bungalow bungalow2=new Bungalow();
        bungalow2.setId("2");
        bungalow2.setAddress("Boralesgamuwa");
        bungalow2.setCode("200");
        bungalow2.setContactNumber("10000000");
        bungalow2.setBungalowImageURL("http://png");

        bungalows.add(bungalow1);
        bungalows.add(bungalow2);
        return bungalows;
    }

}
