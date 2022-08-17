package org.owasp.safetypes.types.integer;

import org.junit.jupiter.api.Test;
import org.owasp.safetypes.exception.TypeValidationException;

import static org.junit.jupiter.api.Assertions.*;

class Integer1ToNTest {

    @Test
    void accept() {
        assertDoesNotThrow(() -> new Integer1ToN(1));
        assertDoesNotThrow(() -> new Integer1ToN(123456));
        assertDoesNotThrow(() -> new Integer1ToN("123456"));
        assertDoesNotThrow(() -> new Integer1ToN((Integer) null));
        assertDoesNotThrow(() -> new Integer1ToN((String) null));
        assertThrows(TypeValidationException.class, () -> new Integer1ToN(0));
        assertThrows(TypeValidationException.class, () -> new Integer1ToN(-1));
        assertThrows(TypeValidationException.class, () -> new Integer1ToN("-1"));
    }
}