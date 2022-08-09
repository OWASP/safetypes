package org.owasp.safetypes.types.string;

import org.junit.jupiter.api.Test;
import org.owasp.safetypes.exception.TypeValidationException;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

class LetterTest {

    @Test
    void accept() {
        assertDoesNotThrow(() -> new Letter("W"));
        assertThrows(TypeValidationException.class, () -> new Letter("Wo"));
        assertThrows(TypeValidationException.class, () -> new Letter(" "));
        assertThrows(TypeValidationException.class, () -> new Letter(">"));
        assertThrows(TypeValidationException.class, () -> new Letter("_"));
        assertThrows(TypeValidationException.class, () -> new Letter("'"));
        assertThrows(TypeValidationException.class, () -> new Letter("-"));
    }
}