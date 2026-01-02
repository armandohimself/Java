package com.dojo.sandbox.CodingExercises.Exceptions.CustomExceptionClassExample;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseRepository implements Repository {
    private Connection connection;

    public DatabaseRepository(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void save(String key, String data) throws RepositoryException {
        try {
            PreparedStatement stmt = connection.prepareStatement("INSERT INTO repository (key, data) VALUES (?, ?)");
            stmt.setString(1, key);
            stmt.setString(2, data);
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RepositoryException("Failed to save data in database", e);
        }
    }

    @Override
    public String fetch(String key) throws RepositoryException {
        try {
            PreparedStatement stmt = connection.prepareStatement("SELECT data FROM repository WHERE key = ?");
            stmt.setString(1, key);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getString("data");
            } else {
                throw new RepositoryException("No data found for key: " + key, null);
            }
        } catch (SQLException e) {
            throw new RepositoryException("Failed to fetch data from database", e);
        }
    }
}
