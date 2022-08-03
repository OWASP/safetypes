package org.owasp.safetypes.types.string;

import org.owasp.safetypes.AbstractSafeDataType;
import org.owasp.safetypes.exception.TypeValidationException;

public abstract class AbstractSafeLimitedString extends AbstractSafeDataType<String> {

    protected AbstractSafeLimitedString(String value) throws TypeValidationException {
        super(value);
    }

    @Override
    protected void accept(String value) throws TypeValidationException {
        Integer limit = limit();

        if(limit == null)
            limit = Integer.MAX_VALUE;

        if(value.length() <= limit)
            return;

        throw new TypeValidationException();
    }

    protected abstract Integer limit();
}
