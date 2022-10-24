package org.owasp.safetypes.types.string.words;

import org.junit.jupiter.api.Test;
import org.owasp.safetypes.exception.TypeValidationException;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

class WordTest {

    @Test
    void accept() {
        assertDoesNotThrow(() -> new Word("Word"));
        assertDoesNotThrow(() -> new Word(null));
        assertThrows(TypeValidationException.class, () -> new Word("Wor d"));
        assertThrows(TypeValidationException.class, () -> new Word("Word1"));
        assertThrows(TypeValidationException.class, () -> new Word("W'ord"));
        assertThrows(TypeValidationException.class, () -> new Word("Word$"));
        assertThrows(TypeValidationException.class, () -> new Word("W-o-r-d"));
        assertThrows(TypeValidationException.class, () -> new Word("Word_"));
        assertThrows(TypeValidationException.class, () -> new Word("Word>"));
    }
}