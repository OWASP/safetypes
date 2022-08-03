package org.owasp.safetypes.types.string;

import org.owasp.safetypes.AbstractSafeDataType;
import org.owasp.safetypes.exception.TypeValidationException;

import java.util.Set;

public abstract class AbstractSafeEnumString extends AbstractSafeDataType<String> {

    protected AbstractSafeEnumString(String value) throws TypeValidationException {
        super(value);
    }

    @Override
    protected void accept(String value) throws TypeValidationException {
        final Set<String> strings = setStrings();

        if (strings.contains(value))
            return;

        throw new TypeValidationException();
    }

    protected abstract Set<String> setStrings();
}
