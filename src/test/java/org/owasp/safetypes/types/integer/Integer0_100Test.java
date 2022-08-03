package org.owasp.safetypes.types.integer;

import org.junit.jupiter.api.Test;
import org.owasp.safetypes.exception.TypeValidationException;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

class Integer0_100Test {

    @Test
    void accept() {
        assertDoesNotThrow(() -> new Integer0_100(0));
        assertDoesNotThrow(() -> new Integer0_100(12));
        assertDoesNotThrow(() -> new Integer0_100(100));
        assertDoesNotThrow(() -> new Integer0_100("12"));
        assertThrows(TypeValidationException.class, () -> new Integer0_100(-1));
        assertThrows(TypeValidationException.class, () -> new Integer0_100(101));
        assertThrows(TypeValidationException.class, () -> new Integer0_100("101"));
    }
}