package com.armando.sandbox.CodingExercises.TDD.AccountExample;

public class Account {
    private double member;

    public Account() {
        this.member = 0.0;
    }

    public void deposit(double amount) {
        // Comment out bottom if to see test fail
        if (amount < 0) return;

        this.member += amount;
    }

    public double withdraw(double amount) {
        double deductedAmount = this.member -= amount;
        if(deductedAmount < 0) { 
            System.out.println("Amount you are trying to withdraw is too much and would leave a negative in your account.\nPlease withdraw a smaller amount.");
            return 0.0;
        }

        System.out.println("You have withdrawn $" + amount + " from your account.\nYour previous balance was: $" + this.member + "\nYour new balance is: $" + deductedAmount);
        System.out.println("Withdrawing $" + amount + " from your account now...");
        this.member = deductedAmount;
        return amount;
    }

    public double getBalance() {
        System.out.println("Your balance is: $" + this.member);
        return this.member;
    }
}

/*
 * Exercise: A Banking account
For this exercise, you will create two files: Account.java and AccountTest.java.

The objective of this assignment is to write a class to demonstrate bank account functionality, but then create a corresponding JUnit test case to ensure its correctness.
The Account.java class has to have the following methods and member variables.
[X] A double member variable to hold the current account balance.
[X] public Account() {...} The default constructor should initialize the balance to 0.0.
[X] public void deposit(double amount) {...} A deposit method to add money to the account.
[X] public double withdraw(double amount) {...} A withdraw method that withdraws the given amount from the account. If the amount given can be withdrawn, it should return that amount. If not, it should return 0.0.
[X] public double getBalance() {...} A method to get the current balance in the account.
 */