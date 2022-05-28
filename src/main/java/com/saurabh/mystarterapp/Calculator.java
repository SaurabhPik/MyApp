package com.saurabh.mystarterapp;

import com.saurabh.mystarterapp.beans.CalService;

public class Calculator {

    CalService service;

    public static void main(String[] args) {

    }

    public int perform(int i, int j) {
        return service.add(i,j)*j;
    }
}
