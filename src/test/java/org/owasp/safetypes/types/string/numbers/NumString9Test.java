package org.owasp.safetypes.types.string.numbers;

import org.junit.jupiter.api.Test;
import org.owasp.safetypes.exception.TypeValidationException;

import static org.junit.jupiter.api.Assertions.*;

class NumString9Test {

    @Test
    void accept() {
        assertDoesNotThrow(() -> new NumString9("012345678"));
        assertDoesNotThrow(() -> new NumString9(null));
        assertThrows(TypeValidationException.class, () -> new NumString9("12345678"));
        assertThrows(TypeValidationException.class, () -> new NumString9("0123456789"));
        assertThrows(TypeValidationException.class, () -> new NumString9("abcdefghi"));
    }
}