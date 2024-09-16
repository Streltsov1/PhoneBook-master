package org.example.exceptions;


public class ProductException extends RuntimeException{
    public ProductException() {
        super();
    }
    public ProductException(String customMessage) {
        super(customMessage);
    }
}
