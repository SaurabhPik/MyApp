package com.saurabh.mystarterapp.usingJpa.entity;

import org.springframework.context.annotation.Primary;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
public class EmpEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int empId;
    @Column(nullable = false)
    private String name;
    private int age;

    public EmpEntity() {
        System.out.println("im here");
    }

    public EmpEntity(String name, int age) {
        System.out.println("im here 2");
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "EmpEntity{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
