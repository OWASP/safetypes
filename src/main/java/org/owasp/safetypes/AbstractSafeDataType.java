package org.owasp.safetypes;

import org.owasp.safetypes.exception.TypeValidationException;

public abstract class AbstractSafeDataType<T> extends AbstractSafeType<T> {

    private final T value;

    protected AbstractSafeDataType(T value) throws TypeValidationException {
        accept(value);
        validate(value);
        this.value = value;
    }

    public final T get() {
        return this.value;
    }
}
