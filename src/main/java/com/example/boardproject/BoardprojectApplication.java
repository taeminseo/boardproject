package com.example.boardproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationPropertiesScan
@SpringBootApplication
public class BoardprojectApplication {

    public static void main(String[] args) {
        SpringApplication.run(BoardprojectApplication.class, args);
    }

}
