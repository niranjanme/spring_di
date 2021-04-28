package com.nhm.di.controller;

import com.nhm.di.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Controller
public class SetterInjectedController {

    public GreetingService greetingService;

    @Autowired
    @Qualifier("setterInjectedGreetingServiceImpl")
    public void setGreetingService(GreetingService greetingService) {
        System.out.println("SetterInjectedController setter method");
        this.greetingService = greetingService;
    }

    public String getGreetings(){
        return greetingService.sayGreetings();
    }
}
