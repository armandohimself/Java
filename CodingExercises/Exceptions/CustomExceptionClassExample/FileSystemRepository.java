package CodingExercises.Exceptions.CustomExceptionClassExample;

import java.io.*;
import java.nio.file.*;

public class FileSystemRepository implements Repository {
    private Path baseDir;

    public FileSystemRepository(Path baseDir) {
        this.baseDir = baseDir;
    }

    @Override
    public void save(String key, String data) throws RepositoryException {
        try {
            Path filePath = baseDir.resolve(key);
            Files.writeString(filePath, data);
        } catch (IOException e) {
            throw new RepositoryException("Failed to save data in filesystem", e);
        }
    }

    @Override
    public String fetch(String key) throws RepositoryException {
        try {
            Path filePath = baseDir.resolve(key);
            return Files.readString(filePath);
        } catch (IOException e) {
            throw new RepositoryException("Failed to fetch data from filesystem", e);
        }
    }
}
