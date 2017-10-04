package com.bookings.model;

/**
 * Created by RMPERERA on 9/14/2017.
 */
public class AdditionalDetails {

private String numberOfACRooms;
    private String numberOfNonACRooms;

    public AdditionalDetails() {
    }

    public AdditionalDetails(String numberOfACRooms, String numberOfNonACRooms) {
        this.numberOfACRooms = numberOfACRooms;
        this.numberOfNonACRooms = numberOfNonACRooms;
    }

    public String getNumberOfNonACRooms() {
        return numberOfNonACRooms;
    }

    public void setNumberOfNonACRooms(String numberOfNonACRooms) {
        this.numberOfNonACRooms = numberOfNonACRooms;
    }

    public String getNumberOfACRooms() {
        return numberOfACRooms;
    }

    public void setNumberOfACRooms(String numberOfACRooms) {
        this.numberOfACRooms = numberOfACRooms;
    }



}
