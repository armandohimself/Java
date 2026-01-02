package com.dojo.sandbox.CodingExercises.Inheritance.WorkerExample;

import java.time.LocalDate;
import java.time.Year;
import java.time.format.DateTimeFormatter;

public class Worker {
    protected String name;
    private String birthDate;
    protected String endDate;

    public Worker() {
        this.name = "Unknown Worker";
        this.birthDate = "1900-13-01";
        this.endDate = "1900-13-01";
    }

    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public Worker(String name, String birthDate, String endDate) {
        this.name = name;
        this.birthDate = birthDate;
        this.endDate = endDate;
    }

    public int getAge() {
        //! Format must be in 2000-07-13 YYYY-DD-MM
        LocalDate inputDate = LocalDate.parse(birthDate);
        int inputYear = inputDate.getYear();
        int currentYear = Year.now().getValue();

        System.out.println(this.name + " is currently " + (currentYear - inputYear) + " years old");
        return currentYear - inputYear;
    }

    /* //! Alternative method from course
     * public int getAge() {
     *  int currentYear = 2025;
     *  int birthYear = Integer.parseInt(birthDate.substring(6));
     * 
     *  return (currentYear - birthYear);
     * }
     */

    public double collectPay() {
        //! This will be an overriden by the other subclasses to determine pay collection
        return 0.0; 
    }

    public String terminate(String endDate) {
        LocalDate inputTerminatedDate = LocalDate.parse(endDate);
        DateTimeFormatter dateFormatterPattern = DateTimeFormatter.ofPattern("MMM dd, yyyy");
        String formattedDate = inputTerminatedDate.format(dateFormatterPattern);

        System.out.println(this.name + " has been terminated on " + formattedDate + " date");
        return formattedDate;
    }
}