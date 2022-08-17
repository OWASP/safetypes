package org.owasp.safetypes.types.integer;

import org.junit.jupiter.api.Test;
import org.owasp.safetypes.exception.TypeValidationException;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

class Integer0To100Test {

    @Test
    void accept() {
        assertDoesNotThrow(() -> new Integer0To100(0));
        assertDoesNotThrow(() -> new Integer0To100(12));
        assertDoesNotThrow(() -> new Integer0To100(100));
        assertDoesNotThrow(() -> new Integer0To100("12"));
        assertDoesNotThrow(() -> new Integer0To100((Integer) null));
        assertDoesNotThrow(() -> new Integer0To100((String) null));
        assertThrows(TypeValidationException.class, () -> new Integer0To100(-1));
        assertThrows(TypeValidationException.class, () -> new Integer0To100(101));
        assertThrows(TypeValidationException.class, () -> new Integer0To100("101"));
    }
}