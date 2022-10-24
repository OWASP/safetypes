package org.owasp.safetypes.types.integer;

import org.junit.jupiter.api.Test;
import org.owasp.safetypes.exception.TypeValidationException;

import static org.junit.jupiter.api.Assertions.*;

class Integer0To200Test {

    @Test
    void accept() {
        assertDoesNotThrow(() -> new Integer0To200(0));
        assertDoesNotThrow(() -> new Integer0To200(12));
        assertDoesNotThrow(() -> new Integer0To200(200));
        assertDoesNotThrow(() -> new Integer0To200("12"));
        assertDoesNotThrow(() -> new Integer0To200((Integer) null));
        assertDoesNotThrow(() -> new Integer0To200((String) null));
        assertThrows(TypeValidationException.class, () -> new Integer0To200(-1));
        assertThrows(TypeValidationException.class, () -> new Integer0To200(201));
        assertThrows(TypeValidationException.class, () -> new Integer0To200("201"));
    }
}