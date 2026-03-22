package com.SpringBoot.GreetingApp.controller;

import com.SpringBoot.GreetingApp.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    @Autowired
    private GreetingService greetingService;

    // GET
    @GetMapping
    public String getGreeting() {
        return greetingService.getGreeting();
    }

    // POST
    @PostMapping
    public String postGreeting() {
        return greetingService.postGreeting();
    }

    // PUT
    @PutMapping
    public String putGreeting() {
        return greetingService.putGreeting();
    }

    // DELETE
    @DeleteMapping
    public String deleteGreeting() {
        return greetingService.deleteGreeting();
    }
}