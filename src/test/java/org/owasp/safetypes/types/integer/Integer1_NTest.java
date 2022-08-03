package org.owasp.safetypes.types.integer;

import org.junit.jupiter.api.Test;
import org.owasp.safetypes.exception.TypeValidationException;

import static org.junit.jupiter.api.Assertions.*;

class Integer1_NTest {

    @Test
    void accept() {
        assertDoesNotThrow(() -> new Integer1_N(1));
        assertDoesNotThrow(() -> new Integer1_N(123456));
        assertDoesNotThrow(() -> new Integer1_N("123456"));
        assertThrows(TypeValidationException.class, () -> new Integer1_N(0));
        assertThrows(TypeValidationException.class, () -> new Integer1_N(-1));
        assertThrows(TypeValidationException.class, () -> new Integer1_N("-1"));
    }
}