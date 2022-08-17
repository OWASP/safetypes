package org.owasp.safetypes.types.string;

import org.junit.jupiter.api.Test;
import org.owasp.safetypes.exception.TypeValidationException;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

class AlphanumTest {

    @Test
    void accept() {
        assertDoesNotThrow(() -> new Alphanum("W1o2r3d4"));
        assertDoesNotThrow(() -> new Alphanum(null));
        assertThrows(TypeValidationException.class, () -> new Alphanum("Wor d"));
        assertThrows(TypeValidationException.class, () -> new Alphanum("W'ord"));
        assertThrows(TypeValidationException.class, () -> new Alphanum("Word$"));
        assertThrows(TypeValidationException.class, () -> new Alphanum("W-o-r-d"));
        assertThrows(TypeValidationException.class, () -> new Alphanum("Word_"));
        assertThrows(TypeValidationException.class, () -> new Alphanum("Word>"));
    }
}