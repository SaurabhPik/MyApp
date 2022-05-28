package com.saurabh.mystarterapp;

import com.saurabh.mystarterapp.beans.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MyStarterAppApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(MyStarterAppApplication.class, args);

        /*User u = context.getBean(User.class);
        u.show();*/

    }
}
