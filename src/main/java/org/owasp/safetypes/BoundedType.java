package org.owasp.safetypes;

import org.owasp.safetypes.exception.TypeValidationException;

/**
 * The {@code BoundedType} class determines
 * a unified way of setting min and max {@code Integer} boundaries,
 * where such are applicable.
 * <p>
 * Each subclass defines the boundaries by implementing the
 * abstract {@code min()} and {@code max()} methods.
 *
 * @param <T> The conventional Java type which this class can substitute where appropriate.
 *
 * @author todorolev
 */
public abstract class BoundedType<T> extends SafeType<T> {

    /**
     * Initializes a newly created {@code BoundedType} object
     * so that it represents the same value as the argument.
     *
     * @param value A value to be validated.
     * @throws TypeValidationException if the validation fails.
     */
    protected BoundedType(T value) throws TypeValidationException {
        super(value);
    }

    /**
     * Defines the minimum boundary.
     *
     * @return the minimum.
     */
    protected abstract Integer min();

    /**
     * Defines the maximum boundary.
     *
     * @return the maximum.
     */
    protected abstract Integer max();
}
