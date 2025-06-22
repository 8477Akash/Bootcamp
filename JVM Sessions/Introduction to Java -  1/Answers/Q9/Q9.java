package Module_1;

class NoStackTraceException extends RuntimeException {
    public NoStackTraceException(String message) {
        super(message);
    }

    @Override
    public synchronized Throwable fillInStackTrace() {
        return null;
    }
}

public class Q9 {
    public static void NoTrace() {
        try {
            throw new NoStackTraceException("Something went wrong!");
        } catch (NoStackTraceException e) {
            System.out.println("Caught custom exception: " + e.getMessage());
            // Stack trace won't print anything if called
            e.printStackTrace();
        }
    }
}