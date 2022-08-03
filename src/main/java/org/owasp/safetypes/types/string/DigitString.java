package org.owasp.safetypes.types.string;

import org.owasp.safetypes.AbstractSafeDataType;
import org.owasp.safetypes.exception.TypeValidationException;

public class DigitString extends AbstractSafeDataType<String> {

    public DigitString(String value) throws TypeValidationException {
        super(value);
    }

    @Override
    protected final void accept(String value) throws TypeValidationException {
        if(value.length() == 1 && Character.isDigit(value.charAt(0)))
            return;
        throw new TypeValidationException();
    }
}
