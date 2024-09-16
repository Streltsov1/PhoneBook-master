package org.example.exceptions;




public class InvoiceNotFoundException extends RuntimeException {


    public InvoiceNotFoundException() {
        super();
    }

    public InvoiceNotFoundException(String customMessage) {
        super(customMessage);
    }
}
