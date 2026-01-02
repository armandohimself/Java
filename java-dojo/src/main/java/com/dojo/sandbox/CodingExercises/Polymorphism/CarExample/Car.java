package com.dojo.sandbox.CodingExercises.Polymorphism.CarExample;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;
    
    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = this.getClass().getSimpleName();
    }
    
    public void startEngine() {
        System.out.println(String.format(this.getClass().getSimpleName() + " -> startEngine()"));
    }
    
    public void accelerate() {
        System.out.println(String.format(this.getClass().getSimpleName() + " -> accelerate()"));
    }
    
    public void brake() {
        System.out.println(String.format(this.getClass().getSimpleName() + " -> brake()"));
    }
    
    public int getCylinders() {
        return this.cylinders;
    }
    
    public String getName() {
        return this.name;
    }
}