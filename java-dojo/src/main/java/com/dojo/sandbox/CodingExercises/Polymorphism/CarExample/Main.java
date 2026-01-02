package com.armando.sandbox.CodingExercises.Polymorphism.CarExample;

public class Main {
    public static void main(String[] args) {
        
        Car car = new Car(8, "Base car");
        car.startEngine();
        car.accelerate();
        car.brake();

        Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");
        mitsubishi.startEngine();
        mitsubishi.accelerate();
        mitsubishi.brake();
    }
}