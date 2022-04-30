package homework7;

public class ValidationFailedException extends Exception {

    private String message;

    public ValidationFailedException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}

