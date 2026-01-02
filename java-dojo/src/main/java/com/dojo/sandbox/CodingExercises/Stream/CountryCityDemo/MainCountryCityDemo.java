package com.dojo.sandbox.CodingExercises.Stream.CountryCityDemo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainCountryCityDemo {
    public static void main(String[] args) {      
        // Step 1: Populate data
        List<Country> countries = populateData();

        // Step 2: Solve Exercise 1 (highest populated city of each country)
        System.out.println("Exercise 1: Highest populated city of each country");
        findHighestPopulatedCityByCountry(countries);

        // Step 3: Solve Exercise 2 (highest populated city of each continent)
        System.out.println("\nExercise 2: Highest populated city of each continent");
        findHighestPopulatedCityByContinent(countries);
    }

    // Populate countries and cities
    private static List<Country> populateData() {
        // Create cities
        City city1 = new City(1, "New York", "USA", 8419000);
        City city2 = new City(2, "Los Angeles", "USA", 3980000);
        City city3 = new City(3, "London", "UK", 8982000);
        City city4 = new City(4, "Manchester", "UK", 553230);

        // Create countries and add cities
        Country usa = new Country("USA", "United States", "North America", 331000000, 9833517, 21427700, 1);
        usa.getCities().add(city1);
        usa.getCities().add(city2);

        Country uk = new Country("UK", "United Kingdom", "Europe", 67886000, 243610, 2827113, 3);
        uk.getCities().add(city3);
        uk.getCities().add(city4);

        // Add countries to a list
        List<Country> countries = new ArrayList<>();
        countries.add(usa);
        countries.add(uk);

        // Return a list of Country objects with associated City objects
        return countries; // Replace with actual population logic
    }

    // Find the highest populated city for each country
    private static void findHighestPopulatedCityByCountry(List<Country> countries) {
        // Start with one country and start to stream over each one
        countries.stream().forEach(country -> {

            // Stream over the cities in that country to find the max population
            int maxPopulation = country.getCities().stream()
                .mapToInt(City::getPopulation) // extract numeric values from objects
                .max()  // terminal operation for highest value
                .orElse(0); // ensures no exceptions are thrown if a coutry has no cities

            // Stream over the country again, this time find the city with the max population (by filtering)
            country.getCities().stream()
                .filter(city -> city.getPopulation() == maxPopulation) // keep only the city whose population was max
                .forEach(city -> System.out.println(country.getName() + ": " + city.getName() + " (" + city.getPopulation() + ")"));
        });
    }

    // Find the highest populated city for each continent
    private static void findHighestPopulatedCityByContinent(List<Country> countries) {
    // Step 1: Group cities by continent
    Map<String, List<City>> citiesByContinent = new HashMap<>();

    countries.forEach(country -> {
        String continent = country.getContinent(); // Get continent
        
        citiesByContinent
            .computeIfAbsent(continent, k -> new ArrayList<>()) // Initialize list if not present
            .addAll(country.getCities()); // Add all cities of the country
    });

    // Step 2: Find the highest populated city for each continent
    citiesByContinent.forEach((continent, cities) -> {
        // Find the city with the maximum population
        City maxCity = cities.stream()
            .max(Comparator.comparingInt(City::getPopulation)) // Find max population
            .orElse(null); // Handle empty lists

        // Step 3: Print the result
        if (maxCity != null) {
            System.out.println(continent + ": " + maxCity.getName() + " (" + maxCity.getPopulation() + ")");
        } else {
            System.out.println(continent + ": No cities available.");
        }
    });
}

}

/*
* EXERCISE 1:
Write a Java program to find the highest populated city of each country.

* EXERCISE 2:
Write a Java program to find the highest populated city of each continent.
 */