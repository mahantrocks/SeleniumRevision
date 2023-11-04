package Exception;
// Custom exception class that extends Exception
class MyCustomException extends Exception {
    public MyCustomException() {
        super("This is a custom exception.");
    }

    public MyCustomException(String message) {
        super(message);
    }
}

public class CustomExceptionExample {
    public static void main(String[] args) {
        try {
            // Simulate a situation that triggers the custom exception
            throw new MyCustomException("Custom exception message");
        } catch (MyCustomException e) {
            System.err.println("Caught custom exception: " + e.getMessage());
        }
    }
}
