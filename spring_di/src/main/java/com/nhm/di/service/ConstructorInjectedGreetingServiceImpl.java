package com.nhm.di.service;

import org.springframework.stereotype.Service;

@Service
public class ConstructorInjectedGreetingServiceImpl implements GreetingService  {
    @Override
    public String sayGreetings() {
        return "Constructor Injected service";
    }
}
