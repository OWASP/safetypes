package org.owasp.safetypes.types.string;

import org.owasp.safetypes.AbstractSafeDataType;
import org.owasp.safetypes.exception.TypeValidationException;

import java.util.Set;

/**
 * The {@code AbstractSafeSetString} class represents
 * a special type of {@code String} containing a well-defined and
 * case-sensitive set of values, like Country names, State names, etc.
 * <p>
 * Each subclass defines the set of acceptable values by
 * implementing the abstract {@code strings()} method.
 * <p>
 * If {@code strings()} returns {@code null}, every
 * {@code String} value is acceptable.
 *
 * @author todorolev
 */
public abstract class AbstractSafeSetString extends AbstractSafeDataType<String> {

    /**
     * Initializes a newly created {@code AbstractSafeEnumString}
     * object so that it represents the same value as the argument.
     * <p>
     * The {@code String value} can be {@code null}.
     *
     * @param value A {@code String}.
     * @throws TypeValidationException if the validation fails.
     */
    protected AbstractSafeSetString(String value) throws TypeValidationException {
        super(value);
    }

    /**
     * Validates that the {@code String} argument is contained
     * in {@code strings()}.
     * <p>
     * The {@code String} argument can be {@code null}.
     *
     * @param value A {@code String}.
     * @throws TypeValidationException if the validation fails.
     */
    @Override
    protected void accept(String value) throws TypeValidationException {
        if(value == null)
            return;

        final Set<String> strings = strings();

        if (strings == null || strings.contains(value))
            return;

        throw new TypeValidationException();
    }

    /**
     * Defines the {@code Set} of acceptable values.
     * <p>
     * If {@code strings()} returns {@code null}, every
     * {@code String} value is acceptable and passes the validation.
     *
     * @return the {@code Set} of acceptable values.
     */
    protected abstract Set<String> strings();
}
