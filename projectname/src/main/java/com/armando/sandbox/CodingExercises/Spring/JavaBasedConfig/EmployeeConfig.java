package com.armando.sandbox.CodingExercises.Spring.JavaBasedConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // Marks a class to define that there are beans
public class EmployeeConfig {

    // Uses Constructor Injection
    @Bean
    public EmployeeController employeeController(EmployeeService employeeService) {
        return new EmployeeController(employeeService);
    }

    // Uses Setter Injection
    @Bean
    public EmployeeService employeeService(EmployeeRepository employeeRepository) {
        EmployeeService bean = new EmployeeService();
        bean.SetEmployeeRepository(employeeRepository);
        return bean;
    }

    @Bean // methods annotated with @Bean that will return instances of the beans
    public EmployeeRepository employeeRepository() {
        return new EmployeeRepository();
    }
}

/*
 * Some Other Annotations
 * @Autowired - Used to inject dependencies in Java-based DI
 * 
 */