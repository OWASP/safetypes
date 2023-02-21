package org.owasp.safetypes.types.integer;

import org.junit.jupiter.api.Test;
import org.owasp.safetypes.exception.TypeValidationException;

import static org.junit.jupiter.api.Assertions.*;

class Integer0To3Test {

    @Test
    void accept() {
        assertDoesNotThrow(() -> new Integer0To3(0));
        assertDoesNotThrow(() -> new Integer0To3(1));
        assertDoesNotThrow(() -> new Integer0To3(2));
        assertDoesNotThrow(() -> new Integer0To3(3));
        assertDoesNotThrow(() -> new Integer0To3("2"));
        assertDoesNotThrow(() -> new Integer0To3((Integer) null));
        assertDoesNotThrow(() -> new Integer0To3((String) null));
        assertThrows(TypeValidationException.class, () -> new Integer0To3(-1));
        assertThrows(TypeValidationException.class, () -> new Integer0To3(4));
        assertThrows(TypeValidationException.class, () -> new Integer0To3("4"));
    }
}