package main.java.com.Scaler.EcomProductService.exception;

public class InvalidTitleException extends RuntimeException{
    public InvalidTitleException() {
    }

    public InvalidTitleException(String message) {
        super(message);
    }
}
