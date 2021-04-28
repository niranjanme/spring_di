package com.nhm.di.service;

import org.springframework.stereotype.Service;

@Service
public class SetterInjectedGreetingServiceImpl implements GreetingService  {
    @Override
    public String sayGreetings() {
        return "Setter Injected service";
    }
}
