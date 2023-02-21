package org.owasp.safetypes.types.string.numbers;

import org.junit.jupiter.api.Test;
import org.owasp.safetypes.exception.TypeValidationException;

import static org.junit.jupiter.api.Assertions.*;

class NumString0To10Test {

    @Test
    void accept() {
        assertDoesNotThrow(() -> new NumString0To10("0"));
        assertDoesNotThrow(() -> new NumString0To10("0123456789"));
        assertDoesNotThrow(() -> new NumString0To10(null));
        assertThrows(TypeValidationException.class, () -> new NumString0To10("01234567890"));
        assertThrows(TypeValidationException.class, () -> new NumString0To10("abcdefghij"));
    }
}