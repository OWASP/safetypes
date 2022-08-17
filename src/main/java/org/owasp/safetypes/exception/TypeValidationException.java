package org.owasp.safetypes.exception;

/**
 * Thrown to indicate that the argument validation has failed
 * against some constraints.
 *
 * @author todorolev
 */
public class TypeValidationException extends Exception {

    /**
     * Constructs a {@code TypeValidationException} with a
     * default message.
     */
    public TypeValidationException() {
        this("Validation error");
    }

    /**
     * Constructs a {@code TypeValidationException} with the
     * specified detail message.
     *
     * @param message the detail message.
     */
    public TypeValidationException(String message) {
        super(message);
    }
}
