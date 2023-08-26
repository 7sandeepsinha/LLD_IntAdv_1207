package designPatterns.builder;

public class InvalidGradYearException extends RuntimeException {
    public InvalidGradYearException() {
    }

    public InvalidGradYearException(String message) {
        super(message);
    }

    public InvalidGradYearException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidGradYearException(Throwable cause) {
        super(cause);
    }

    public InvalidGradYearException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
