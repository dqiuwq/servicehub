package com.servicehub.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceHubImpl implements ServiceHub {

    @GetMapping("/greetings")
    @Override
    public String sendGreeting(String message) {
        return "Hello, World";
    }
}
