package com.example.association.mapping.assignment.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Address {

    @Column(name = "street_name")
    private String streetName;
    private String location;
    private String state;

    public Address() {
    }

    public Address(String streetName, String location, String state) {
        this.streetName = streetName;
        this.location = location;
        this.state = state;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
