package org.owasp.safetypes.types.string;

import org.owasp.safetypes.AbstractSafeDataType;
import org.owasp.safetypes.exception.TypeValidationException;

/**
 * The {@code AbstractSafeLimitedString} class represents a special
 * type of {@code String} with limited length.
 * <p>
 * Each subclass defines the length limit by implementing the
 * abstract {@code limit()} method.
 * <p>
 * If {@code limit()} returns {@code null},
 * the limit is {@code Integer.MAX_VALUE}.
 *
 * @author todorolev
 */
public abstract class AbstractSafeLimitedString extends AbstractSafeDataType<String> {

    /**
     * Initializes a newly created {@code AbstractSafeLimitedString}
     * object so that it represents the same value as the argument.
     *
     * @param value A {@code String}.
     * @throws TypeValidationException if the validation fails.
     */
    protected AbstractSafeLimitedString(String value) throws TypeValidationException {
        super(value);
    }

    /**
     * Validates that the length of the {@code String} argument
     * is less than or equal to {@code limit()}.
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

        Integer limit = limit();

        if(limit == null)
            limit = Integer.MAX_VALUE;

        if(value.length() <= limit)
            return;

        throw new TypeValidationException();
    }

    /**
     * Defines the length limit. If {@code limit()} returns
     * {@code null}, the limit is {@code Integer.MAX_VALUE}.
     *
     * @return the length limit.
     */
    protected abstract Integer limit();
}
