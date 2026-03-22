package com.SpringBoot.GreetingApp.service;

import com.SpringBoot.GreetingApp.model.Greeting;
import com.SpringBoot.GreetingApp.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.List;

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



    public List<Greeting> getAllGreetings() {
        return repository.findAll();
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

    public Greeting updateGreeting(Long id, String message) {

        Greeting greeting = repository.findById(id).orElse(null);

        if (greeting != null) {
            greeting.setMessage(message);
            return repository.save(greeting);
        }

        return null;
    }

    public String deleteGreeting(Long id) {

        Greeting greeting = repository.findById(id).orElse(null);

        if (greeting != null) {
            repository.deleteById(id);
            return "Deleted successfully";
        }

        return "Greeting not found";
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