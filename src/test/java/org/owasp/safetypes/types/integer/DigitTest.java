package org.owasp.safetypes.types.integer;

import org.junit.jupiter.api.Test;
import org.owasp.safetypes.exception.TypeValidationException;

import static org.junit.jupiter.api.Assertions.*;

class DigitTest {

    @Test
    void accept() {
        assertDoesNotThrow(() -> new Digit(0));
        assertDoesNotThrow(() -> new Digit(9));
        assertDoesNotThrow(() -> new Digit("9"));
        assertThrows(TypeValidationException.class, () -> new Digit(10));
        assertThrows(TypeValidationException.class, () -> new Digit(-1));
        assertThrows(TypeValidationException.class, () -> new Digit("10"));
    }
}