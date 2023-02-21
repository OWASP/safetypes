package org.owasp.safetypes.types.integer;

import org.junit.jupiter.api.Test;
import org.owasp.safetypes.exception.TypeValidationException;

import static org.junit.jupiter.api.Assertions.*;

class Integer0To50Test {

    @Test
    void accept() {
        assertDoesNotThrow(() -> new Integer0To50(0));
        assertDoesNotThrow(() -> new Integer0To50(50));
        assertDoesNotThrow(() -> new Integer0To50("50"));
        assertDoesNotThrow(() -> new Integer0To50((Integer) null));
        assertDoesNotThrow(() -> new Integer0To50((String) null));
        assertThrows(TypeValidationException.class, () -> new Integer0To50(-1));
        assertThrows(TypeValidationException.class, () -> new Integer0To50(51));
        assertThrows(TypeValidationException.class, () -> new Integer0To50("51"));
    }
}