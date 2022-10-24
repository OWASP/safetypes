package org.owasp.safetypes.types.integer;

import org.owasp.safetypes.AbstractSafeBoundedDataType;
import org.owasp.safetypes.exception.TypeValidationException;

/**
 * The {@code AbstractSafeLimitedInteger} class represents a special
 * type of {@code Integer}, which has a value between a low limit
 * and a high limit.
 * <p>
 * Each subclass determines the low and high limits by implementing
 * the abstract {@code min()} and {@code max()} methods respectively.
 * <p>
 * If {@code min()} returns {@code null}, then the low limit is set
 * to {@code Integer.MIN_VALUE}.
 * <p>
 * If {@code max()} returns {@code null}, then the high limit is set
 * to {@code Integer.MAX_VALUE}.
 *
 * @author todorolev
 */
public abstract class AbstractSafeLimitedInteger extends AbstractSafeBoundedDataType<Integer> {

    /**
     * Initializes a newly created {@code AbstractSafeLimitedInteger}
     * object so that it represents the same value as the argument.
     * <p>
     * The {@code Integer value} can be {@code null}.
     *
     * @param value An {@code Integer}.
     * @throws TypeValidationException if the validation fails.
     */
    protected AbstractSafeLimitedInteger(Integer value) throws TypeValidationException {
        super(value);
    }

    /**
     * Validates that the {@code Integer value} is between
     * a low limit and a high limit.
     * <p>
     * The {@code Integer value} can be {@code null}.
     * <p>
     * The low and high limits are defined by the
     * {@code min()} and {@code max()} methods respectively.
     *
     * @param value An {@code Integer}.
     * @throws TypeValidationException if the validation fails.
     */
    @Override
    protected void accept(Integer value) throws TypeValidationException {
        if(value == null)
            return;

        final int low = min() != null ? min() : Integer.MIN_VALUE;
        final int high = max() != null ? max() : Integer.MAX_VALUE;

        if(value >= low && value <= high)
            return;

        throw new TypeValidationException();
    }
}
