package CodingExercises.Exceptions.CustomExceptionClassExample;

// Custom exception to abstract underlying exceptions
public class RepositoryException extends Exception {
    public RepositoryException(String message, Throwable cause) {
        super(message, cause);
    }
}
