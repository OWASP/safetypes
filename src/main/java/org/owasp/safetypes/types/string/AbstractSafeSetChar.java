package org.owasp.safetypes.types.string;

import org.owasp.safetypes.AbstractSafeDataType;
import org.owasp.safetypes.exception.TypeValidationException;

import java.util.Set;

/**
 * The {@code AbstractSafeSetChar} class represents a special
 * type of {@code String}, which contains a single character,
 * e.g. "a", "A", "X", etc., restricted to the values in the
 * {@code Set}, returned by the {@code chars()} method.
 * <p>
 * Each subclass defines the set of acceptable values by
 * implementing the abstract {@code chars()} method.
 * <p>
 * If {@code chars()} returns {@code null}, every
 * {@code String} value is acceptable.
 *
 * @author todorolev
 */
public abstract class AbstractSafeSetChar extends AbstractSafeDataType<String> {

    /**
     * Initializes a newly created {@code AbstractSafeEnumChar}
     * object so that it represents the same value
     * as the argument.
     * <p>
     * The {@code String value} can be {@code null}.
     *
     * @param value A {@code String}.
     * @throws TypeValidationException if the validation fails.
     */
    protected AbstractSafeSetChar(String value) throws TypeValidationException {
        super(value);
    }

    /**
     * Validates that the {@code String} argument contains only
     * one character and this single character is contained
     * in {@code chars()}.
     * <p>
     * The {@code String value} can be {@code null}.
     *
     * @param value A {@code String}.
     * @throws TypeValidationException if the validation fails.
     */
    @Override
    protected void accept(String value) throws TypeValidationException {
        if(value == null)
            return;

        final Set<Character> chars = chars();

        if(value.length() == 1 && (chars == null || chars.contains(value.charAt(0))))
            return;

        throw new TypeValidationException();
    }

    /**
     * Defines the {@code Set} of acceptable values.
     * <p>
     * If {@code chars()} returns {@code null}, every
     * {@code String} value is acceptable.
     *
     * @return the {@code Set} of acceptable values.
     */
    protected abstract Set<Character> chars();
}
