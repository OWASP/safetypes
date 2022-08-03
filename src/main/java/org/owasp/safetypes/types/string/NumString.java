package org.owasp.safetypes.types.string;

import org.owasp.safetypes.AbstractSafeDataType;
import org.owasp.safetypes.exception.TypeValidationException;

public class NumString extends AbstractSafeDataType<String> {

    public NumString(String value) throws TypeValidationException {
        super(value);
    }

    @Override
    protected final void accept(String value) throws TypeValidationException {
        for (int i=0; i<value.length(); i++) {
            char c = value.charAt(i);
            if (Character.isDigit(c))
                continue;
            throw new TypeValidationException();
        }
    }
}
