package org.owasp.safetypes.types.string.symbols.alphabet;

import org.junit.jupiter.api.Test;
import org.owasp.safetypes.exception.TypeValidationException;

import static org.junit.jupiter.api.Assertions.*;

class AlphabetENTest {

    @Test
    void accept() {
        assertDoesNotThrow(() -> new English("W"));
        assertThrows(TypeValidationException.class, () -> new English("Wo"));
        assertThrows(TypeValidationException.class, () -> new English(" "));
        assertThrows(TypeValidationException.class, () -> new English(">"));
        assertThrows(TypeValidationException.class, () -> new English("_"));
        assertThrows(TypeValidationException.class, () -> new English("'"));
        assertThrows(TypeValidationException.class, () -> new English("-"));
        assertThrows(TypeValidationException.class, () -> new English("1"));
        assertThrows(TypeValidationException.class, () -> new English("В"));
    }
}