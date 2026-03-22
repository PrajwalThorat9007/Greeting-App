package com.SpringBoot.GreetingApp.service;

import com.SpringBoot.GreetingApp.model.Greeting;
import com.SpringBoot.GreetingApp.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GreetingService {

    @Autowired
    private GreetingRepository repository;

    public Greeting saveGreeting(String message) {
        Greeting greeting = new Greeting(message);
        return repository.save(greeting);
    }

    public Greeting findGreetingById(Long id) {

        Optional<Greeting> greeting = repository.findById(id);

        if (greeting.isPresent()) {
            return greeting.get();
        } else {
            throw new RuntimeException("Greeting not found");
        }
    }

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