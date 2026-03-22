package com.SpringBoot.GreetingApp.controller;

import com.SpringBoot.GreetingApp.model.Greeting;
import com.SpringBoot.GreetingApp.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    @Autowired
    private GreetingService service;


    @GetMapping
    public String getGreeting(
            @RequestParam(required = false) String firstName,
            @RequestParam(required = false) String lastName) {

        return service.getGreeting(firstName, lastName);
    }


    // UC4 SAVE
    @PostMapping("/save")
    public Greeting saveGreeting(@RequestParam String message) {
        return service.saveGreeting(message);
    }

}