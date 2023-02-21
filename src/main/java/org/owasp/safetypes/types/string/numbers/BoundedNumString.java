package org.owasp.safetypes.types.string.numbers;

import org.owasp.safetypes.exception.TypeValidationException;
import org.owasp.safetypes.types.string.BoundedString;

/**
 * The {@code BoundedNumString} class represents
 * a special type of {@code String}, containing only digits
 * and with bounded length.
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
public abstract class BoundedNumString extends BoundedString {

    /**
     * Initializes a newly created {@code BoundedNumString} object
     * so that it represents the same value as the argument.
     *
     * @param value A {@code String}.
     * @throws TypeValidationException if the validation fails.
     */
    protected BoundedNumString(String value) throws TypeValidationException {
        super(value);
    }

    /**
     * Validates that the {@code String value} contains only digits.
     * <p>
     * The {@code String value} can be {@code null}.
     *
     * @param value A {@code String}.
     * @throws TypeValidationException if the validation fails.
     */
    @Override
    protected final void validate(String value) throws TypeValidationException {
        if(value == null)
            return;

        for (int i=0; i<value.length(); i++) {
            char c = value.charAt(i);
            if (Character.isDigit(c))
                continue;
            throw new TypeValidationException();
        }
    }
}
