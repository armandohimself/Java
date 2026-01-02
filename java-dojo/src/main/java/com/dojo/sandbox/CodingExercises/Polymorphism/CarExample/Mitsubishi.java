package com.dojo.sandbox.CodingExercises.Polymorphism.CarExample;

public class Mitsubishi extends Car {
    
    public Mitsubishi() {
        super(6, "Mitsubishi");
    }

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }
    
    @Override
    public void startEngine() {
        System.out.println(String.format(this.getClass().getSimpleName() + " -> startEngine()"));
    }
    
    @Override    
    public void accelerate() {
        System.out.println(String.format(this.getClass().getSimpleName() + " -> accelerate()"));
    }
    
    @Override
    public void brake() {
        System.out.println(String.format(this.getClass().getSimpleName() + " -> brake()"));
    }
}