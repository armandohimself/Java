package com.dojo.sandbox.CodingExercises.Inheritance.AnimalExample;

public class Main extends Object{

    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal", "Huge", 400);
        doAnimalStuff(animal, "slow");

        Dog genericDog = new Dog();
        doAnimalStuff(genericDog, "fast");

        Dog yorkie = new Dog("Yorkie", 15);
        doAnimalStuff(yorkie, "fast");

        Dog lab = new Dog("Labrador Retriever", 40, "floppy", "bushy");
        doAnimalStuff(lab, "slow");
    }

    //? Why did we use static here
    //! So that we can call it from the main method, it's shared amonst
    //! all instances of main now
    public static void doAnimalStuff(Animal animal, String speed) {
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_ _ _ _");
    }
}

/*
 * //! What's going on?
 * We can create a method in the main class that will take any animal object
 * and execute the 3 methods of move(), makeNoise(), and toString()
 */