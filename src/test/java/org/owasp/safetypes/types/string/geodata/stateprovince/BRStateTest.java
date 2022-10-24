package org.owasp.safetypes.types.string.geodata.stateprovince;

import org.junit.jupiter.api.Test;
import org.owasp.safetypes.exception.TypeValidationException;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

class BRStateTest {

    @Test
    void accept() {
        assertDoesNotThrow(() -> new BRState("AC"));
        assertDoesNotThrow(() -> new BRState("AL"));
        assertDoesNotThrow(() -> new BRState("al"));
        assertDoesNotThrow(() -> new BRState(null));
        assertThrows(TypeValidationException.class, () -> new USState("XY"));
        assertThrows(TypeValidationException.class, () -> new USState(" "));
        assertThrows(TypeValidationException.class, () -> new USState(">"));
        assertThrows(TypeValidationException.class, () -> new USState("_"));
        assertThrows(TypeValidationException.class, () -> new USState("'"));
        assertThrows(TypeValidationException.class, () -> new USState("-"));
        assertThrows(TypeValidationException.class, () -> new USState("-"));
    }
}