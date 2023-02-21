package org.owasp.safetypes.types.integer;

import org.junit.jupiter.api.Test;
import org.owasp.safetypes.exception.TypeValidationException;

import static org.junit.jupiter.api.Assertions.*;

class Integer0To5Test {

    @Test
    void accept() {
        assertDoesNotThrow(() -> new Integer0To5(0));
        assertDoesNotThrow(() -> new Integer0To5(5));
        assertDoesNotThrow(() -> new Integer0To5("2"));
        assertDoesNotThrow(() -> new Integer0To5((Integer) null));
        assertDoesNotThrow(() -> new Integer0To5((String) null));
        assertThrows(TypeValidationException.class, () -> new Integer0To5(-1));
        assertThrows(TypeValidationException.class, () -> new Integer0To5(6));
        assertThrows(TypeValidationException.class, () -> new Integer0To5("6"));
    }
}