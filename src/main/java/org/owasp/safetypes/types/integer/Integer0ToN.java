package org.owasp.safetypes.types.integer;

import org.owasp.safetypes.exception.TypeValidationException;

public class Integer0ToN extends AbstractSafeLimitedInteger {

    public Integer0ToN(Integer value) throws TypeValidationException {
        super(value);
    }

    public Integer0ToN(String value) throws TypeValidationException {
        super(Integer.parseInt(value));
    }

    @Override
    protected final Integer low() {
        return 0;
    }

    @Override
    protected final Integer high() {
        return null;
    }
}
