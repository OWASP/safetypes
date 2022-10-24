package org.owasp.safetypes.types.string.words;

import org.junit.jupiter.api.Test;
import org.owasp.safetypes.exception.TypeValidationException;

import static org.junit.jupiter.api.Assertions.*;

class Word0To100Test {

    @Test
    void accept() {
        assertDoesNotThrow(() -> new Word0To100(""));
        assertDoesNotThrow(() -> new Word0To100("Word"));
        assertDoesNotThrow(() -> new Word0To100("abcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghij"));
        assertDoesNotThrow(() -> new Word0To100(null));
        assertThrows(TypeValidationException.class, () -> new Word0To100("abcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijk"));
        assertThrows(TypeValidationException.class, () -> new Word0To100("Wor d"));
        assertThrows(TypeValidationException.class, () -> new Word0To100("Word1"));
    }
}