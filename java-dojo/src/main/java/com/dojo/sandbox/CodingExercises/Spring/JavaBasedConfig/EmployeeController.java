package com.armando.sandbox.CodingExercises.Spring.JavaBasedConfig;

public class EmployeeController {
    private EmployeeService employeeService;

    // Constructor Injection
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
}