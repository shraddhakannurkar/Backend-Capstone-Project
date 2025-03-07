package main.java.com.Scaler.EcomProductService.exception;

public class ProductNotFoundException extends Exception{
    public ProductNotFoundException() {
    }

    public ProductNotFoundException(String message) {
        super(message);
    }

    public ProductNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
