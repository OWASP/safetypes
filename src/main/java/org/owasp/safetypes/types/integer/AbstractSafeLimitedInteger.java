package org.owasp.safetypes.types.integer;

import org.owasp.safetypes.AbstractSafeDataType;
import org.owasp.safetypes.exception.TypeValidationException;

/**
 * The {@code AbstractSafeLimitedInteger} class represents a special
 * type of {@code Integer}, which has a value between a low limit
 * and a high limit.
 * <p>
 * Each subclass determines the low and high limits by implementing
 * the abstract {@code low()} and {@code high()} methods respectively.
 * <p>
 * If {@code low()} returns {@code null}, then the low limit is set
 * to {@code Integer.MIN_VALUE}.
 * <p>
 * If {@code high()} returns {@code null}, then the high limit is set
 * to {@code Integer.MAX_VALUE}.
 *
 * @author todorolev
 */
public abstract class AbstractSafeLimitedInteger extends AbstractSafeDataType<Integer> {

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
     * {@code low()} and {@code high()} methods respectively.
     *
     * @param value An {@code Integer}.
     * @throws TypeValidationException if the validation fails.
     */
    @Override
    protected void accept(Integer value) throws TypeValidationException {
        if(value == null)
            return;

        Integer low = low();
        Integer high = high();

        if(low == null)
            low = Integer.MIN_VALUE;
        if(high == null)
            high = Integer.MAX_VALUE;

        if(value >= low && value <= high)
            return;

        throw new TypeValidationException();
    }

    /**
     * Defines the value of the low limit.
     * <p>
     * If {@code low()} returns {@code null}, then
     * the low limit is set to {@code Integer.MIN_VALUE}.
     *
     * @return the low limit.
     */
    protected abstract Integer low();

    /**
     * Defines the value of the high limit.
     * <p>
     * If {@code high()} returns {@code null}, then
     * the high limit is set to {@code Integer.MAX_VALUE}.
     *
     * @return the high limit.
     */
    protected abstract Integer high();
}
