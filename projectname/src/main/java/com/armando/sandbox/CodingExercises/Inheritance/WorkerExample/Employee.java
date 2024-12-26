package com.armando.sandbox.CodingExercises.Inheritance.WorkerExample;

public class Employee extends Worker {
    private long employeeId;
    private String hireDate;

    //! Another way I could have created IDs
    // private static int employeeNo = 1;

    public Employee() {}

    public Employee(String name, String birthDate, long employeeId, String hireDate) {
        super(name, birthDate);
        this.employeeId = employeeId;
        // this.employeeNo = Employee.employeeNo++;
        this.hireDate = hireDate;
    }

    public long getEmployeeId() {
        return employeeId;
    }
}