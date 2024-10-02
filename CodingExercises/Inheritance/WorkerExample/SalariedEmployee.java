package CodingExercises.Inheritance.WorkerExample;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class SalariedEmployee extends Employee {
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(
        String name, String birthDate, long employeeId, 
        String hireDate, double annualSalary, boolean isRetired) {
            super(name, birthDate, employeeId, hireDate);
            this.annualSalary = annualSalary;
            this.isRetired = isRetired;
    }

    public void retire() {
        terminate(todaysDate());
        isRetired = true;
    }

     public String todaysDate() {
        LocalDate todayDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate = todayDate.format(formatter);
        return formattedDate;
    }

    @Override
    public double collectPay() {
        //! Overriden by SalariedEmployee from Worker Class
        return (int) annualSalary / 26; 
    }
}