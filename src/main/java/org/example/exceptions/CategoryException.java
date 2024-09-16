package org.example.exceptions;

public class CategoryException extends RuntimeException{

    public CategoryException() {
        super();
    }

    public CategoryException(String customMessage) {
        super(customMessage);
    }
}
