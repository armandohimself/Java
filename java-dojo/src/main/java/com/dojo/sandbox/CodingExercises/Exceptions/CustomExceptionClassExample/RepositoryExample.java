package com.dojo.sandbox.CodingExercises.Exceptions.CustomExceptionClassExample;

import java.nio.file.Path;
import java.sql.Connection;

public class RepositoryExample {
    public static void main(String[] args) {
        Repository databaseRepo = new DatabaseRepository(getDatabaseConnection());
        Repository fileSystemRepo = new FileSystemRepository(Path.of("data"));

        try {
            // Using database repository
            databaseRepo.save("user123", "Database User Data");
            System.out.println(databaseRepo.fetch("user123"));

            // Using filesystem repository
            fileSystemRepo.save("user123", "Filesystem User Data");
            System.out.println(fileSystemRepo.fetch("user123"));

        } catch (RepositoryException e) {
            System.err.println("Repository operation failed: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static Connection getDatabaseConnection() {
        // Simulate obtaining a database connection (actual implementation omitted)
        return null; // Replace with actual connection
    }
}
