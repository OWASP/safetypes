package org.owasp.safetypes.types.string.geodata.stateprovince;

import org.junit.jupiter.api.Test;
import org.owasp.safetypes.exception.TypeValidationException;

import static org.junit.jupiter.api.Assertions.*;

class USStateTest {

    @Test
    void accept() {
        assertDoesNotThrow(() -> new USState("GA"));
        assertDoesNotThrow(() -> new USState("MI"));
        assertDoesNotThrow(() -> new USState("mi"));
        assertDoesNotThrow(() -> new USState(null));
        assertThrows(TypeValidationException.class, () -> new USState("XY"));
        assertThrows(TypeValidationException.class, () -> new USState(" "));
        assertThrows(TypeValidationException.class, () -> new USState(">"));
        assertThrows(TypeValidationException.class, () -> new USState("_"));
        assertThrows(TypeValidationException.class, () -> new USState("'"));
        assertThrows(TypeValidationException.class, () -> new USState("-"));
        assertThrows(TypeValidationException.class, () -> new USState("-"));
    }
}