package org.owasp.safetypes;

import org.owasp.safetypes.exception.TypeValidationException;

/**
 * The {@code AbstractSafeDataType} class determines the order of
 * validations applied to a value of type {@code T} as defined by
 * the safetypes library.
 * <p>
 * First, the validation logic in the {@code accept()} method is
 * executed and then, if the first validation passes successfully,
 * the validation logic in the {@code validate()} method, if implemented, is executed.
 * <p>
 * Classes that provide any custom validation logic should extend
 * either this class or any of the class hierarchies under this class,
 * e.g. {@code Word, Letter, Integer0ToN, etc.}.
 *
 * @param <T> The conventional Java type which this class can substitute where appropriate.
 *
 * @author todorolev
 */
public abstract class AbstractSafeDataType<T> extends AbstractSafeType<T> {

    private final T value;

    /**
     * Initializes a newly created {@code AbstractSafeDataType} object
     * so that it represents the same value as the argument.
     * <p>
     * This constructor determines the order of validations applied to
     * a value of type {@code T} as defined by the safetypes library.
     * <p>
     * First, the validation logic in the {@code accept()} method is
     * executed and then, if the first validation passes successfully,
     * the validation logic in the {@code validate()} method, if implemented, is executed.
     *
     * @param value A value to be validated.
     * @throws TypeValidationException if the validation fails.
     */
    protected AbstractSafeDataType(T value) throws TypeValidationException {
        accept(value);
        validate(value);
        this.value = value;
    }

    /**
     * Returns the successfully validated object.
     *
     * @return the successfully validated object of the Java type {@code T}.
     */
    public final T get() {
        return this.value;
    }
}
