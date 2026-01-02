package com.dojo.sandbox.CodingExercises.Inheritance.BicycleExample;

public class Main {
    public static void main(String[] args) {
        Bicycle bike = new Bicycle(0, 0, 0);
        KidsBicycle kidBike = new KidsBicycle(0, 0, 0, 0);

        kidBike.AddTrainingWheels();
        kidBike.RemoveTrainingWheels();

        kidBike.setCadence(12);
        kidBike.applyBrake(13);
    }
}