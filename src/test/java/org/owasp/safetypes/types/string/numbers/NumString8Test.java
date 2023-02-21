package org.owasp.safetypes.types.string.numbers;

import org.junit.jupiter.api.Test;
import org.owasp.safetypes.exception.TypeValidationException;

import static org.junit.jupiter.api.Assertions.*;

class NumString8Test {

    @Test
    void accept() {
        assertDoesNotThrow(() -> new NumString8("01234567"));
        assertDoesNotThrow(() -> new NumString8(null));
        assertThrows(TypeValidationException.class, () -> new NumString8("1234567"));
        assertThrows(TypeValidationException.class, () -> new NumString8("123456789"));
        assertThrows(TypeValidationException.class, () -> new NumString8("abcdefgh"));
    }
}