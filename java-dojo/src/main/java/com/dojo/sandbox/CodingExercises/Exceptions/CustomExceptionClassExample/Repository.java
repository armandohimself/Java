package com.armando.sandbox.CodingExercises.Exceptions.CustomExceptionClassExample;

public interface Repository {
    void save(String key, String data) throws RepositoryException;
    String fetch(String key) throws RepositoryException;
}
