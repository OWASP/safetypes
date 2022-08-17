package org.owasp.safetypes;

import org.owasp.safetypes.exception.TypeValidationException;

import java.util.function.Supplier;

/**
 * This is the main class of the safetypes library. Every special
 * class in the library is in a hierarchy extending
 * {@code AbstractSafeType.java}. This abstract class has two methods:
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
 * either {@code AbstractSafeDataType<T>} or any of the existing
 * predefined special classes, e.g. {@code Word, Letter, Integer0ToN, etc.}.
 *
 * @param <T> the conventional Java type which this class can substitute where appropriate.
 *
 * @author todorolev
 */
public abstract class AbstractSafeType<T> implements Supplier<T> {

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
