package org.owasp.safetypes;

import org.owasp.safetypes.exception.TypeValidationException;

import java.util.function.Supplier;

/**
 * This is the main class of the safetypes library. Every special
 * class in the library is in a hierarchy extending
 * {@code SafeType.java}. This abstract class has two methods:
 * <pre><code>
 * protected abstract void accept(T value) throws TypeValidationException;
 * protected void validate(T value) throws TypeValidationException { }
 * </code></pre>
 * {@code accept()} must be implemented by any new special class,
 * which is not part of the library, while
 * <p>
 * {@code validate()} is intended to facilitate the customization
 * of existing predefined classes.
 * <p>
 * Classes that provide any custom validation logic should extend
 * either {@code DataType<T>} or any of the existing
 * predefined special classes, e.g. {@code Word, Letter, Integer0ToN, etc.}.
 *
 * @param <T> the conventional Java type which this class can substitute where appropriate.
 *
 * @author todorolev
 */
public abstract class SafeType<T> implements Supplier<T> {

    private final T value;

    /**
     * Initializes a newly created {@code SafeType} object
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
    protected SafeType(T value) throws TypeValidationException {
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

    /**
     * Validates the value of the {@code T} argument.
     * This method must be implemented by any new special class,
     * which is not part of the library.
     *
     * @param value A value to be validated.
     * @throws TypeValidationException if the validation fails.
     */
    protected abstract void accept(T value) throws TypeValidationException;

    /**
     * Contains additional custom validation logic, applied
     * on top of the main validation. This method could be
     * implemented in order to customize the existing predefined
     * validation logic.
     *
     * @param value A value to be validated.
     * @throws TypeValidationException if the validation fails.
     */
    protected void validate(T value) throws TypeValidationException { }
}
