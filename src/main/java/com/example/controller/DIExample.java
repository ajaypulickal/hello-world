package com.example.controller;

import com.example.entity.Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DIExample {

    @Autowired
    Config config;

    @RequestMapping("/hello")
    public String hello(){
        return config.getName();
    }



}
