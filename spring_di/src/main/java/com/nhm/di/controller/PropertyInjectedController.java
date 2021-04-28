package com.nhm.di.controller;

import com.nhm.di.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {


    @Qualifier("propertyInjectedGreetingServiceImpl")
    @Autowired(required = true)
    public GreetingService greetingService;

    public String getGreetings(){
        return greetingService.sayGreetings();
    }
}
