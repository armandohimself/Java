package com.dojo.sandbox.CodingExercises.Spring.AnnotationBasedConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        // 1) Create IoC container & configure by specifying package to find beans
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.dojo.sandbox.CodingExercises.Spring.AnnotationBasedConfig");
        // The container we created is AnnotationBasedConfig because that's where all of our source files are within

        // 2) Get & Use Beans
        String[] allBeans = context.getBeanDefinitionNames();

        System.out.println("\nBeans created involving annotation-only config:");

        for (String beanName : allBeans) {
            System.out.println(beanName);
        }

        // 3) Close Container
        ((AnnotationConfigApplicationContext) context).close();
    }
}