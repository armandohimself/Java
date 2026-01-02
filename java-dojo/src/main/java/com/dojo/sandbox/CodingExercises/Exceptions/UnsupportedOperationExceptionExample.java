package com.dojo.sandbox.CodingExercises.Exceptions;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class UnsupportedOperationExceptionExample {
    public static void main(String[] args) {
        // Create a modifiable list of data centers during the setup phase
        List<String> dataCenters = new ArrayList<>();
        dataCenters.add("New York");
        dataCenters.add("San Francisco");
        dataCenters.add("London");

        // Make the list unmodifiable to prevent accidental modifications
        List<String> immutableDataCenters = Collections.unmodifiableList(dataCenters);

        // Simulate different components of the system using the list
        System.out.println("Allowed Data Centers: " + immutableDataCenters);

        // Try to add a new data center (this should throw UnsupportedOperationException)
        try {
            immutableDataCenters.add("Tokyo");  // Attempt to modify the unmodifiable list
        } catch (UnsupportedOperationException e) {
            //System.out.println("Caught UnsupportedOperationException: You cannot modify the data centers list!");
            System.out.println(e);
        }
    }
}

/*
 * Here I have a real world example of setting up an immutable list. 
 * Reasons for an immutable list: scenarios like configurations or settings we don't want changed. 
 * 
 * 
Here’s a list of 10 practical examples where an UnsupportedOperationException might occur. These scenarios are common in real-world programming:

Immutable Configuration Settings:

A list of configuration values (like server URLs or data centers) is made unmodifiable after initialization, ensuring no accidental modifications occur later in the application’s lifecycle.
Read-Only Views of Collections:

You use Collections.unmodifiableList() to create a read-only view of a collection, preventing users or other parts of the system from modifying the collection.
Database Query Results:

The result of a database query, returned as an unmodifiable list to ensure that query results cannot be altered.
Shared Global Constants:

You have a collection of global constants (e.g., a list of supported currencies) that is shared across the application and made unmodifiable to prevent accidental changes.
Third-Party Library Integration:

Passing a collection to a third-party library as unmodifiable to prevent external code from modifying your data.
Unmodifiable Maps for Static Data:

When working with key-value maps that store static data (e.g., error codes and messages), making the map unmodifiable ensures the integrity of these mappings throughout the application.
GUI Frameworks:

In a GUI framework, once the list of menu items or toolbar buttons is initialized, making them unmodifiable ensures that no one can change the UI elements dynamically.
API Return Values:

An API returns a list or collection that is made unmodifiable to prevent the calling code from modifying the result.
Security Contexts:

In a security management system, a list of user roles is made unmodifiable to ensure that the access permissions cannot be altered during runtime.
Version-Controlled Data:

In a system that tracks document versions, once a document version is committed, its data is made unmodifiable to preserve the integrity of that version and prevent any modifications.
 */