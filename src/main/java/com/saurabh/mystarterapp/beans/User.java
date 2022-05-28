package com.saurabh.mystarterapp.beans;

import com.saurabh.mystarterapp.beans.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class User {
    private String name;
    private int age;
    @Autowired
    private Address add;

    public Address getAdd() {
        return add;
    }

    public void setAdd(Address add) {
        this.add = add;
    }

    public User() {
        System.out.println("object created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void show() {
        System.out.println("in show");
        add.show();
    }
}
