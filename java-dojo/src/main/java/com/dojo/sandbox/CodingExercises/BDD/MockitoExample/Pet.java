package com.dojo.sandbox.CodingExercises.BDD.MockitoExample;

public class Pet {
    
    private int id;
    private String name;
    private int age;
    private String species;
    private int vetId;

    // ... constructors, getters/setters omitted

    public String talk() {
        return "animal noise";
    }

    public String bow() {
        return "the pet bows";
    }
    
    public void doTrick() {
        talk();
        bow();
        talk();
    }
}