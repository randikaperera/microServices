package com.bookings.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by RMPERERA on 9/14/2017.
 */
@Document
public class Bungalow {
    @Id
    private String id;
    private String regionId;
    private String name;
    private String code;
    private String rate;
    private String address;
    private String contactNumber;
    private String bungalowImageURL;
    private String maximumOccupancy;
    private AdditionalDetails additionalDetails;

    public Bungalow() {
    }

    public Bungalow(String id, String regionId, String name, String code, String rate, String address, String contactNumber, String bungalowImageURL, String maximumOccupancy, AdditionalDetails additionalDetails) {
        this.id = id;
        this.regionId = regionId;
        this.name = name;
        this.code = code;
        this.rate = rate;
        this.address = address;
        this.contactNumber = contactNumber;
        this.bungalowImageURL = bungalowImageURL;
        this.maximumOccupancy = maximumOccupancy;
        this.additionalDetails = additionalDetails;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getBungalowImageURL() {
        return bungalowImageURL;
    }

    public void setBungalowImageURL(String bungalowImageURL) {
        this.bungalowImageURL = bungalowImageURL;
    }

    public String getMaximumOccupancy() {
        return maximumOccupancy;
    }

    public void setMaximumOccupancy(String maximumOccupancy) {
        this.maximumOccupancy = maximumOccupancy;
    }

    public AdditionalDetails getAdditionalDetails() {
        return additionalDetails;
    }

    public void setAdditionalDetails(AdditionalDetails additionalDetails) {
        this.additionalDetails = additionalDetails;
    }

    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }
}
