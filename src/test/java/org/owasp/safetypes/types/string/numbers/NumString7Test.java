package org.owasp.safetypes.types.string.numbers;

import org.junit.jupiter.api.Test;
import org.owasp.safetypes.exception.TypeValidationException;

import static org.junit.jupiter.api.Assertions.*;

class NumString7Test {

    @Test
    void accept() {
        assertDoesNotThrow(() -> new NumString7("0123456"));
        assertDoesNotThrow(() -> new NumString7(null));
        assertThrows(TypeValidationException.class, () -> new NumString7("123456"));
        assertThrows(TypeValidationException.class, () -> new NumString7("12345678"));
        assertThrows(TypeValidationException.class, () -> new NumString7("abcdefg"));
    }
}