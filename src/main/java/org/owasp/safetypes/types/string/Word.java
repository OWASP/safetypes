package org.owasp.safetypes.types.string;

import org.owasp.safetypes.exception.TypeValidationException;

/**
 * Represents a string containing: [a-zA-Z]
 */
public class Word extends AbstractSafeLimitedString {

    public Word(String value) throws TypeValidationException {
        super(value);
    }

    @Override
    protected final void validate(String value) throws TypeValidationException {
        for (int i=0; i<value.length(); i++) {
            char c = value.charAt(i);
            if (Character.isLetter(c))
                continue;
            throw new TypeValidationException();
        }
    }

    @Override
    protected Integer limit() {
        return null;
    }
}
