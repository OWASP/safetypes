package org.owasp.safetypes;

import org.owasp.safetypes.exception.TypeValidationException;

import java.util.function.Supplier;

public abstract class AbstractSafeType<T> implements Supplier<T> {

    protected abstract void accept(T value) throws TypeValidationException;

    protected void validate(T value) throws TypeValidationException { }
}
