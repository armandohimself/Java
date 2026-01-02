package com.armando.sandbox.CodingExercises.Spring.ComponentScanning.service;

import org.springframework.stereotype.Service;

@Service // Marks this class as a Spring managed bean. Spring will automatically detect this class during component scanning.
public class GreetingService {
    public String greet() {
        return "Hello, World!";
    }
}