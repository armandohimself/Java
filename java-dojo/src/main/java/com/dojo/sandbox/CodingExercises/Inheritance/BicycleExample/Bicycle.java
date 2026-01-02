package com.dojo.sandbox.CodingExercises.Inheritance.BicycleExample;

public class Bicycle {
        
    // the Bicycle class has three fields
    public int cadence;
    public int gear;
    public int speed;
        
    // the Bicycle class has one constructor
    public Bicycle(int startCadence, int startSpeed, int startGear) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }
        
    // the Bicycle class has four methods
    public void setCadence(int newValue) {
        cadence = newValue;
        System.out.println("The bike's cadence is now " + cadence);
    }
        
    public void setGear(int newValue) {
        gear = newValue;
        System.out.println("The bike's gear is now " + gear);
    }
        
    public void applyBrake(int decrement) {
        speed -= decrement;
        System.out.println("The bike's speed is now " + speed);
    }
        
    public void speedUp(int increment) {
        speed += increment;
        System.out.println("The bike's speed is now " + speed);
    }
        
}