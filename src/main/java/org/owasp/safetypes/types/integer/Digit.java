package org.owasp.safetypes.types.integer;

import org.owasp.safetypes.exception.TypeValidationException;

public class Digit extends AbstractSafeLimitedInteger {

    public Digit(Integer value) throws TypeValidationException {
        super(value);
    }

    public Digit(String value) throws TypeValidationException {
        super(Integer.parseInt(value));
    }

    @Override
    protected final Integer low() {
        return 0;
    }

    @Override
    protected final Integer high() {
        return 9;
    }
}
