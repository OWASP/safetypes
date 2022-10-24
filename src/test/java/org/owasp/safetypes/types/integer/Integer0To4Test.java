package org.owasp.safetypes.types.integer;

import org.junit.jupiter.api.Test;
import org.owasp.safetypes.exception.TypeValidationException;

import static org.junit.jupiter.api.Assertions.*;

class Integer0To4Test {

    @Test
    void accept() {
        assertDoesNotThrow(() -> new Integer0To4(0));
        assertDoesNotThrow(() -> new Integer0To4(1));
        assertDoesNotThrow(() -> new Integer0To4(2));
        assertDoesNotThrow(() -> new Integer0To4(3));
        assertDoesNotThrow(() -> new Integer0To4(4));
        assertDoesNotThrow(() -> new Integer0To4("2"));
        assertDoesNotThrow(() -> new Integer0To4((Integer) null));
        assertDoesNotThrow(() -> new Integer0To4((String) null));
        assertThrows(TypeValidationException.class, () -> new Integer0To4(-1));
        assertThrows(TypeValidationException.class, () -> new Integer0To4(5));
        assertThrows(TypeValidationException.class, () -> new Integer0To4("5"));
    }
}