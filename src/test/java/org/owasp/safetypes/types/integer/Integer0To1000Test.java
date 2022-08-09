package org.owasp.safetypes.types.integer;

import org.junit.jupiter.api.Test;
import org.owasp.safetypes.exception.TypeValidationException;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

class Integer0To1000Test {

    @Test
    void accept() {
        assertDoesNotThrow(() -> new Integer0To1000(0));
        assertDoesNotThrow(() -> new Integer0To1000(123));
        assertDoesNotThrow(() -> new Integer0To1000(1000));
        assertDoesNotThrow(() -> new Integer0To1000("123"));
        assertThrows(TypeValidationException.class, () -> new Integer0To1000(-1));
        assertThrows(TypeValidationException.class, () -> new Integer0To1000(1001));
        assertThrows(TypeValidationException.class, () -> new Integer0To1000("1001"));
    }
}