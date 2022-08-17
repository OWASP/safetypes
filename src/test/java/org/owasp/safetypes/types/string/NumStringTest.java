package org.owasp.safetypes.types.string;

import org.junit.jupiter.api.Test;
import org.owasp.safetypes.exception.TypeValidationException;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

class NumStringTest {

    @Test
    void accept() {
        assertDoesNotThrow(() -> new NumString("123"));
        assertDoesNotThrow(() -> new NumString("007"));
        assertDoesNotThrow(() -> new NumString(null));
        assertThrows(TypeValidationException.class, () -> new NumString("W"));
        assertThrows(TypeValidationException.class, () -> new NumString(" "));
        assertThrows(TypeValidationException.class, () -> new NumString(">"));
        assertThrows(TypeValidationException.class, () -> new NumString("_"));
        assertThrows(TypeValidationException.class, () -> new NumString("'"));
        assertThrows(TypeValidationException.class, () -> new NumString("-"));
        assertThrows(TypeValidationException.class, () -> new NumString("Word"));
    }
}