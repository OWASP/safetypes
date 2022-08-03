package org.owasp.safetypes.types.integer;

import org.owasp.safetypes.AbstractSafeDataType;
import org.owasp.safetypes.exception.TypeValidationException;

public abstract class AbstractSafeLimitedInteger extends AbstractSafeDataType<Integer> {

    protected AbstractSafeLimitedInteger(Integer value) throws TypeValidationException {
        super(value);
    }

    @Override
    protected void accept(Integer value) throws TypeValidationException {
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

    protected abstract Integer low();
    protected abstract Integer high();
}
