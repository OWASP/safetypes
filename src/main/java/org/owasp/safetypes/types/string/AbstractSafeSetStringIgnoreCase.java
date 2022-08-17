package org.owasp.safetypes.types.string;

import org.owasp.safetypes.AbstractSafeDataType;
import org.owasp.safetypes.exception.TypeValidationException;

import java.util.Set;

/**
 * The {@code AbstractSafeEnumStringIgnoreCase} class represents
 * a special type of {@code String} containing a well-defined and
 * case-insensitive set of values, like country codes, state codes,
 * language codes, etc.
 * <p>
 * Each subclass defines the set of acceptable
 * values by implementing the abstract {@code strings()} method.
 * <p>
 * If {@code strings()} returns {@code null}, every
 * {@code String} value is acceptable and passes the validation.
 *
 * @author todorolev
 */
public abstract class AbstractSafeSetStringIgnoreCase extends AbstractSafeDataType<String> {

    /**
     * Initializes a newly created {@code AbstractSafeEnumStringIgnoreCase}
     * object so that it represents the same value as the argument.
     * <p>
     * The {@code String value} can be {@code null}.
     *
     * @param value A {@code String}.
     * @throws TypeValidationException if the validation fails.
     */
    protected AbstractSafeSetStringIgnoreCase(String value) throws TypeValidationException {
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

        if(strings.stream().anyMatch(value::equalsIgnoreCase))
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

