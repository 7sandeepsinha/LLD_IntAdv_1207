package oopsConcept.exception;

public class UserNameNotFoundException extends RuntimeException {
    public UserNameNotFoundException() {
    }

    public UserNameNotFoundException(String message) {
        super(message);
    }

    public UserNameNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public UserNameNotFoundException(Throwable cause) {
        super(cause);
    }

    public UserNameNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
