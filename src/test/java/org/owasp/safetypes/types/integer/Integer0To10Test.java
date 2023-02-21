package org.owasp.safetypes.types.integer;

import org.junit.jupiter.api.Test;
import org.owasp.safetypes.exception.TypeValidationException;

import static org.junit.jupiter.api.Assertions.*;

class Integer0To10Test {

    @Test
    void accept() {
        assertDoesNotThrow(() -> new Integer0To10(0));
        assertDoesNotThrow(() -> new Integer0To10(10));
        assertDoesNotThrow(() -> new Integer0To10("2"));
        assertDoesNotThrow(() -> new Integer0To10((Integer) null));
        assertDoesNotThrow(() -> new Integer0To10((String) null));
        assertThrows(TypeValidationException.class, () -> new Integer0To10(-1));
        assertThrows(TypeValidationException.class, () -> new Integer0To10(11));
        assertThrows(TypeValidationException.class, () -> new Integer0To10("11"));
    }
}