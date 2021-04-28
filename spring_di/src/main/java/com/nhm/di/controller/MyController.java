package com.nhm.di.controller;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public String getGreetings(){
        return "My First Dependency Injection";
    }
}
