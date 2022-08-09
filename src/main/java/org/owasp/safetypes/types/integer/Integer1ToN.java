package org.owasp.safetypes.types.integer;

import org.owasp.safetypes.exception.TypeValidationException;

public class Integer1ToN extends AbstractSafeLimitedInteger {

    public Integer1ToN(Integer value) throws TypeValidationException {
        super(value);
    }

    public Integer1ToN(String value) throws TypeValidationException {
        super(Integer.parseInt(value));
    }

    @Override
    protected final Integer low() {
        return 1;
    }

    @Override
    protected final Integer high() {
        return null;
    }
}
