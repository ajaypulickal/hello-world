package com.example.entity;

import org.springframework.stereotype.Component;

@Component
public class Config {
    private String name="config";

    public String getName(){
        return name;
    }
}
