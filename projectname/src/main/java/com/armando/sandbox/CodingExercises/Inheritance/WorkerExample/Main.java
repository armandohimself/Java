package com.armando.sandbox.CodingExercises.Inheritance.WorkerExample;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Worker worker = new Worker("Armando", "1993-01-19", null);
        worker.getAge();
        worker.terminate("2023-08-16");
        System.out.println();
        
        Employee jesse = new Employee("Jesse", "1992-06-15", createId(), todaysDate());
        jesse.getAge();
        jesse.collectPay();
        System.out.println("Jesse's employee number is " + jesse.getEmployeeId());
        System.out.println();
        
        SalariedEmployee pavan = new SalariedEmployee("Pavan", "1991-09-25", createId(), todaysDate(), 123000, false);
        System.out.println("Pavan's employee number is " + pavan.getEmployeeId());
        pavan.terminate(todaysDate());
        System.out.println();

        HourlyEmployee mando = new HourlyEmployee("Mando", "1993-01-19", createId(), todaysDate(), 15.00);
        System.out.println("Mando's employee number is " + mando.getEmployeeId());
        System.out.println("Armando's double pay is " + mando.getDoublePay());
    }

    public static long createId() {
        Random randId = new Random();
        long employeeId = randId.nextLong(1000000000);
        return employeeId;
    }

    public static String todaysDate() {
        LocalDate todayDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate = todayDate.format(formatter);
        return formattedDate;
    }
}