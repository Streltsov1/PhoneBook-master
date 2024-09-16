package org.example.exceptions;

import java.io.IOException;

public class StorageException extends RuntimeException {



    public StorageException() {
        super();
    }

    public StorageException(String customMessage) {
        super(customMessage);
    }

    public StorageException(String couldNotInitializeStorage, IOException e) {
    }
}
