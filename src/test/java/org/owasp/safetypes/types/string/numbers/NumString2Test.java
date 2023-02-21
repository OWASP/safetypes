package org.owasp.safetypes.types.string.numbers;

import org.junit.jupiter.api.Test;
import org.owasp.safetypes.exception.TypeValidationException;

import static org.junit.jupiter.api.Assertions.*;

class NumString2Test {

    @Test
    void accept() {
        assertDoesNotThrow(() -> new NumString2("12"));
        assertDoesNotThrow(() -> new NumString2(null));
        assertThrows(TypeValidationException.class, () -> new NumString2("1"));
        assertThrows(TypeValidationException.class, () -> new NumString2("123"));
        assertThrows(TypeValidationException.class, () -> new NumString2("ab"));
    }
}