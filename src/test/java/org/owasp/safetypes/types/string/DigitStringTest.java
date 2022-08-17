package org.owasp.safetypes.types.string;

import org.junit.jupiter.api.Test;
import org.owasp.safetypes.exception.TypeValidationException;

import static org.junit.jupiter.api.Assertions.*;

class DigitStringTest {

    @Test
    void accept() {
        assertDoesNotThrow(() -> new DigitString("0"));
        assertDoesNotThrow(() -> new DigitString("9"));
        assertDoesNotThrow(() -> new DigitString(null));
        assertThrows(TypeValidationException.class, () -> new DigitString("10"));
        assertThrows(TypeValidationException.class, () -> new DigitString("-1"));
    }
}