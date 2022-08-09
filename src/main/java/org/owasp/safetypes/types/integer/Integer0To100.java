package org.owasp.safetypes.types.integer;

import org.owasp.safetypes.exception.TypeValidationException;

public class Integer0To100 extends AbstractSafeLimitedInteger {

    public Integer0To100(Integer value) throws TypeValidationException {
        super(value);
    }

    public Integer0To100(String value) throws TypeValidationException {
        super(Integer.parseInt(value));
    }

    @Override
    protected final Integer low() {
        return 0;
    }

    @Override
    protected final Integer high() {
        return 100;
    }
}
