package org.owasp.safetypes.types.string.words;

import org.junit.jupiter.api.Test;
import org.owasp.safetypes.exception.TypeValidationException;

import static org.junit.jupiter.api.Assertions.*;

class Word0To50Test {

    @Test
    void accept() {
        assertDoesNotThrow(() -> new Word0To50(""));
        assertDoesNotThrow(() -> new Word0To50("Word"));
        assertDoesNotThrow(() -> new Word0To50("abcdefghijabcdefghijabcdefghijabcdefghijabcdefghij"));
        assertDoesNotThrow(() -> new Word0To50(null));
        assertThrows(TypeValidationException.class, () -> new Word0To50("abcdefghijabcdefghijabcdefghijabcdefghijabcdefghijk"));
        assertThrows(TypeValidationException.class, () -> new Word0To50("Wor d"));
        assertThrows(TypeValidationException.class, () -> new Word0To50("Word1"));
    }
}