package pl.javastart.exception;

public class TemperatureLimitException extends RuntimeException {
    public TemperatureLimitException(String message) {
        super(message);
    }
}
