package com.nhm.di.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    public GreetingServiceImpl() {
        System.out.println("Default GreetingServiceImpl ctor()");
    }

    @Override
    public String sayGreetings() {
        return "Hello from interface Greetings";
    }
}
