package org.owasp.safetypes.types.string.words;

import org.junit.jupiter.api.Test;
import org.owasp.safetypes.exception.TypeValidationException;

import static org.junit.jupiter.api.Assertions.*;

class Word0To10Test {

    @Test
    void accept() {
        assertDoesNotThrow(() -> new Word0To10(""));
        assertDoesNotThrow(() -> new Word0To10("Word"));
        assertDoesNotThrow(() -> new Word0To10("abcdefghij"));
        assertDoesNotThrow(() -> new Word0To10(null));
        assertThrows(TypeValidationException.class, () -> new Word0To10("abcdefghijk"));
        assertThrows(TypeValidationException.class, () -> new Word0To10("Wor d"));
        assertThrows(TypeValidationException.class, () -> new Word0To10("Word1"));
    }
}