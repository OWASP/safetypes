package org.owasp.safetypes.types.string.geodata.stateprovince;

import org.junit.jupiter.api.Test;
import org.owasp.safetypes.exception.TypeValidationException;

import static org.junit.jupiter.api.Assertions.*;

class USAStatesTest {

    @Test
    void accept() {
        assertDoesNotThrow(() -> new USAStates("GA"));
        assertDoesNotThrow(() -> new USAStates("MI"));
        assertThrows(TypeValidationException.class, () -> new USAStates("XY"));
        assertThrows(TypeValidationException.class, () -> new USAStates(" "));
        assertThrows(TypeValidationException.class, () -> new USAStates(">"));
        assertThrows(TypeValidationException.class, () -> new USAStates("_"));
        assertThrows(TypeValidationException.class, () -> new USAStates("'"));
        assertThrows(TypeValidationException.class, () -> new USAStates("-"));
        assertThrows(TypeValidationException.class, () -> new USAStates("-"));
    }
}