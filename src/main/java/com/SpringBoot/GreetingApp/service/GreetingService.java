package com.SpringBoot.GreetingApp.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public String getGreeting() {
        return "Hello World - GET";
    }

    public String postGreeting() {
        return "Hello World - POST";
    }

    public String putGreeting() {
        return "Hello World - PUT";
    }

    public String deleteGreeting() {
        return "Hello World - DELETE";
    }

}