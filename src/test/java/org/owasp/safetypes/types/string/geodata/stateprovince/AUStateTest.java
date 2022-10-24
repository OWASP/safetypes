package org.owasp.safetypes.types.string.geodata.stateprovince;

import org.junit.jupiter.api.Test;
import org.owasp.safetypes.exception.TypeValidationException;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

class AUStateTest {

    @Test
    void accept() {
        assertDoesNotThrow(() -> new AUState("NSW"));
        assertDoesNotThrow(() -> new AUState("VIC"));
        assertDoesNotThrow(() -> new AUState("vic"));
        assertDoesNotThrow(() -> new AUState(null));
        assertThrows(TypeValidationException.class, () -> new USState("XY"));
        assertThrows(TypeValidationException.class, () -> new USState(" "));
        assertThrows(TypeValidationException.class, () -> new USState(">"));
        assertThrows(TypeValidationException.class, () -> new USState("_"));
        assertThrows(TypeValidationException.class, () -> new USState("'"));
        assertThrows(TypeValidationException.class, () -> new USState("-"));
        assertThrows(TypeValidationException.class, () -> new USState("-"));
    }
}