package com.dojo.sandbox.CodingExercises.Spring.ComponentScanning;

import com.dojo.sandbox.CodingExercises.Spring.ComponentScanning.config.AppConfig;
import com.dojo.sandbox.CodingExercises.Spring.ComponentScanning.service.GreetingService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        GreetingService greetingService = context.getBean(GreetingService.class);
        System.out.println(greetingService.greet());  // Prints "Hello, World!"
    }
}