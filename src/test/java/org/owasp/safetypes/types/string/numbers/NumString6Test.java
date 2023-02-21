package org.owasp.safetypes.types.string.numbers;

import org.junit.jupiter.api.Test;
import org.owasp.safetypes.exception.TypeValidationException;

import static org.junit.jupiter.api.Assertions.*;

class NumString6Test {

    @Test
    void accept() {
        assertDoesNotThrow(() -> new NumString6("012345"));
        assertDoesNotThrow(() -> new NumString6(null));
        assertThrows(TypeValidationException.class, () -> new NumString6("12345"));
        assertThrows(TypeValidationException.class, () -> new NumString6("1234567"));
        assertThrows(TypeValidationException.class, () -> new NumString6("abcdef"));
    }
}