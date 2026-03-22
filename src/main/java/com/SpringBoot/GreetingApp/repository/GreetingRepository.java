package com.SpringBoot.GreetingApp.repository;

import com.SpringBoot.GreetingApp.model.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GreetingRepository extends JpaRepository<Greeting, Long> {
}