package org.owasp.safetypes.types.string;

import org.owasp.safetypes.AbstractSafeDataType;
import org.owasp.safetypes.exception.TypeValidationException;

import java.util.Set;

public abstract class AbstractSafeEnumChar extends AbstractSafeDataType<String> {

    protected AbstractSafeEnumChar(String value) throws TypeValidationException {
        super(value);
    }

    @Override
    protected void accept(String value) throws TypeValidationException {
        final Set<Character> chars = setChars();

        if(value.length() == 1 && chars.contains(value.charAt(0)))
            return;

        throw new TypeValidationException();
    }

    protected abstract Set<Character> setChars();
}
