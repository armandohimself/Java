package com.dojo.sandbox.CodingExercises.Spring.JavaBasedConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // Marks a class to define that there are beans
public class EmployeeConfig {

    // Uses Constructor Injection
    @Bean (name="myBeanName")
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
 * Some Other Annotation(s):
 * @Autowired - Used to inject dependencies in Java-based DI
 * 
 * @Bean & Singleton in Springgit 
 * When a bean is defined (default singleton), Spring creates a single instance of the bean during container intitialization. 
 * Spring manages the instance, and every @Autowired injection or context.getBean() call retrieves the same instance.
 * 
 * Different Scopes You Can Define:
 * @Scope("singleton" || [ "prototype" || "request" || "session" || "application" ]) - changes the scope of the Bean
 * Default is "singleton" and you don't need to define it. 
 * Example:
 * @Scope("prototype")
 * 
 * 
 */