package com.javaIntro.SpringAppDatabase.database;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJPAApplication {
    public static void main(String[] args) {
        System.out.println("Started");
        SpringApplication.run(SpringJPAApplication.class, args);
    }

}
