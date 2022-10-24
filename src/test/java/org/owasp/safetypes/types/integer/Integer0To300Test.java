package org.owasp.safetypes.types.integer;

import org.junit.jupiter.api.Test;
import org.owasp.safetypes.exception.TypeValidationException;

import static org.junit.jupiter.api.Assertions.*;

class Integer0To300Test {

    @Test
    void accept() {
        assertDoesNotThrow(() -> new Integer0To300(0));
        assertDoesNotThrow(() -> new Integer0To300(12));
        assertDoesNotThrow(() -> new Integer0To300(300));
        assertDoesNotThrow(() -> new Integer0To300("12"));
        assertDoesNotThrow(() -> new Integer0To300((Integer) null));
        assertDoesNotThrow(() -> new Integer0To300((String) null));
        assertThrows(TypeValidationException.class, () -> new Integer0To300(-1));
        assertThrows(TypeValidationException.class, () -> new Integer0To300(301));
        assertThrows(TypeValidationException.class, () -> new Integer0To300("301"));
    }
}