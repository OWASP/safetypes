package org.owasp.safetypes.types.string;

import org.owasp.safetypes.AbstractSafeDataType;
import org.owasp.safetypes.exception.TypeValidationException;

import java.util.UUID;

public class UUIDString extends AbstractSafeDataType<String> {

    protected UUIDString(String value) throws TypeValidationException {
        super(value);
    }

    @Override
    protected void accept(String value) throws TypeValidationException {
        try {
            UUID.fromString(value);
        } catch (IllegalArgumentException e) {
            throw new TypeValidationException();
        }
    }
}
