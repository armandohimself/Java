package com.armando.sandbox.CodingExercises.Spring.JavaBasedConfig;

public class EmployeeService {
    private EmployeeRepository employeeRepository;

    // Setter Injection
    public void SetEmployeeRepository(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public void serve() {
        System.out.println("Service is working with " + employeeRepository);
    }
}