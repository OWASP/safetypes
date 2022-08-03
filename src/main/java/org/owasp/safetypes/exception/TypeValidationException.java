package org.owasp.safetypes.exception;

public class TypeValidationException extends Exception {

    public TypeValidationException() {
        this("Validation error");
    }

    public TypeValidationException(String message) {
        super(message);
    }
}
