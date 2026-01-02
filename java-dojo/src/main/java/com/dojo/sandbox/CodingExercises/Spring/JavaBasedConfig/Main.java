package com.dojo.sandbox.CodingExercises.Spring.JavaBasedConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        // 1) Create IoC container & configure with a Java Config Class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfig.class);

        // 2) Get & Use the Beans
        String[] allBeans = context.getBeanDefinitionNames();

        System.out.println("\nBeans created involving Java-Based Config:");

        for(String beanName : allBeans) {
            System.out.println(beanName);
        }

        // 4) Close Container
        ((AnnotationConfigApplicationContext) context).close();
    }
}