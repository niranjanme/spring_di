package com.nhm.di.service;

import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedGreetingServiceImpl implements GreetingService  {
    @Override
    public String sayGreetings() {
        return "Property Injected service";
    }
}
