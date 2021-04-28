package com.nhm.di.controller;

import com.nhm.di.service.GreetingService;
import com.nhm.di.service.ConstructorInjectedGreetingServiceImpl;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    public GreetingService greetingService;

    public ConstructorInjectedController(@Qualifier("constructorInjectedGreetingServiceImpl") GreetingService greetingService) {
        System.out.println("ConstructorInjectedController parameterised ctor(...)");
        this.greetingService = greetingService;

    }

    public String getGreetings(){
        return greetingService.sayGreetings();
    }

}
