package com.dojo.sandbox.CodingExercises.Stream.CountryCityDemo;

public class City {
    private int id;
    private String name;
    private int population;
    private String countryCode;
 
    public City() {
    }
 
    public City(int id, String name, String countryCode, int population) {
       this.id = id;
       this.name = name;
       this.population = population;
       this.countryCode = countryCode;
    }
 
    public String getName() {
        return name;
    }
    
    public int getPopulation() {
        return population;
    }
    
    @Override   
    public String toString() {
       return "City [id=" + id + ", name=" + name + ", population=" + population + ", countryCode=" + countryCode + "]";
    };
 
 }