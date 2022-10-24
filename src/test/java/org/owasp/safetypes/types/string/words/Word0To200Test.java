package org.owasp.safetypes.types.string.words;

import org.junit.jupiter.api.Test;
import org.owasp.safetypes.exception.TypeValidationException;

import static org.junit.jupiter.api.Assertions.*;

class Word0To200Test {

    @Test
    void accept() {
        assertDoesNotThrow(() -> new Word0To200(""));
        assertDoesNotThrow(() -> new Word0To200("Word"));
        assertDoesNotThrow(() -> new Word0To200("abcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghij"));
        assertDoesNotThrow(() -> new Word0To200(null));
        assertThrows(TypeValidationException.class, () -> new Word0To200("abcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijk"));
        assertThrows(TypeValidationException.class, () -> new Word0To200("Wor d"));
        assertThrows(TypeValidationException.class, () -> new Word0To200("Word1"));
    }
}