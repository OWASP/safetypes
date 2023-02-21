package org.owasp.safetypes.types.string;

import org.owasp.safetypes.BoundedType;
import org.owasp.safetypes.exception.TypeValidationException;

/**
 * The {@code BoundedString} class represents a special
 * type of {@code String} with bounded length.
 * <p>
 * Each subclass defines the length boundaries by implementing
 * the abstract {@code min()} and {@code max()} methods.
 * <p>
 * If {@code min()} returns {@code null},
 * the minimum length is 0.
 * If {@code max()} returns {@code null},
 * the maximum length is {@code Integer.MAX_VALUE}.
 *
 * @author todorolev
 */
public abstract class BoundedString extends BoundedType<String> {

    /**
     * Initializes a newly created {@code BoundedString}
     * object so that it represents the same value as the argument.
     *
     * @param value A {@code String}.
     * @throws TypeValidationException if the validation fails.
     */
    protected BoundedString(String value) throws TypeValidationException {
        super(value);
    }

    /**
     * Validates that the length of the {@code String} argument
     * is between {@code min()} and {@code max()} inclusive.
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

        final int min = min() != null ? min() : 0;
        final int max = max() != null ? max() : Integer.MAX_VALUE;

        if(value.length() >= min && value.length() <= max)
            return;

        throw new TypeValidationException();
    }
}
