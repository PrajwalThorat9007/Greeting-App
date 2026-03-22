package com.SpringBoot.GreetingApp.controller;

import com.SpringBoot.GreetingApp.model.Greeting;
import com.SpringBoot.GreetingApp.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/{id}")
    public Greeting getGreetingById(@PathVariable Long id) {
        return service.findGreetingById(id);
    }


    // UC4 SAVE
    @PostMapping("/save")
    public Greeting saveGreeting(@RequestParam String message) {
        return service.saveGreeting(message);
    }

    @GetMapping("/all")
    public List<Greeting> getAllGreetings() {
        return service.getAllGreetings();
    }

    @PutMapping("/update/{id}")
    public Object updateGreeting(
            @PathVariable Long id,
            @RequestParam String message) {

        Greeting greeting = service.updateGreeting(id, message);

        if (greeting == null) {
            return "Greeting not found";
        }

        return greeting;
    }

}