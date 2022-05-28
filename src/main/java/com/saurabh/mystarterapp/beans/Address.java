package com.saurabh.mystarterapp.beans;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.Mapping;

@Component
public class Address {
    private int streetno;
    private String streetName;

    public Address() {
        System.out.println("address object created");
    }

    public int getStreetno() {
        return streetno;
    }

    public void setStreetno(int streetno) {
        this.streetno = streetno;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public void show() {
        System.out.println("in address");
    }
}

