package org.owasp.safetypes.types.integer;

import org.junit.jupiter.api.Test;
import org.owasp.safetypes.exception.TypeValidationException;

import static org.junit.jupiter.api.Assertions.*;

class Integer0ToNTest {

    @Test
    void accept() {
        assertDoesNotThrow(() -> new Integer0ToN(0));
        assertDoesNotThrow(() -> new Integer0ToN(123456));
        assertDoesNotThrow(() -> new Integer0ToN("123456"));
        assertDoesNotThrow(() -> new Integer0ToN((Integer) null));
        assertDoesNotThrow(() -> new Integer0ToN((String) null));
        assertThrows(TypeValidationException.class, () -> new Integer0ToN(-1));
        assertThrows(TypeValidationException.class, () -> new Integer0ToN("-1"));
    }
}