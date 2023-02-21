package org.owasp.safetypes.types.string.numbers;

import org.junit.jupiter.api.Test;
import org.owasp.safetypes.exception.TypeValidationException;

import static org.junit.jupiter.api.Assertions.*;

class NumString10Test {

    @Test
    void accept() {
        assertDoesNotThrow(() -> new NumString10("0123456789"));
        assertDoesNotThrow(() -> new NumString10(null));
        assertThrows(TypeValidationException.class, () -> new NumString10("123456789"));
        assertThrows(TypeValidationException.class, () -> new NumString10("01234567890"));
        assertThrows(TypeValidationException.class, () -> new NumString10("abcdefghij"));
    }
}