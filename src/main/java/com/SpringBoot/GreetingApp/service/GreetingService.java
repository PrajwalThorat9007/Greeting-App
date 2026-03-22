package com.SpringBoot.GreetingApp.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public String getGreeting(String firstName, String lastName) {

        if (firstName != null && lastName != null) {
            return "Hello " + firstName + " " + lastName;
        }

        if (firstName != null) {
            return "Hello " + firstName;
        }

        if (lastName != null) {
            return "Hello " + lastName;
        }

        return "Hello World";
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