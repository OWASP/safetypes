package org.owasp.safetypes.types.integer;

import org.junit.jupiter.api.Test;
import org.owasp.safetypes.exception.TypeValidationException;

import static org.junit.jupiter.api.Assertions.*;

class Integer0To30Test {

    @Test
    void accept() {
        assertDoesNotThrow(() -> new Integer0To30(0));
        assertDoesNotThrow(() -> new Integer0To30(30));
        assertDoesNotThrow(() -> new Integer0To30("30"));
        assertDoesNotThrow(() -> new Integer0To30((Integer) null));
        assertDoesNotThrow(() -> new Integer0To30((String) null));
        assertThrows(TypeValidationException.class, () -> new Integer0To30(-1));
        assertThrows(TypeValidationException.class, () -> new Integer0To30(31));
        assertThrows(TypeValidationException.class, () -> new Integer0To30("31"));
    }
}