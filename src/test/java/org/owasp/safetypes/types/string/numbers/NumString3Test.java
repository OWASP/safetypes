package org.owasp.safetypes.types.string.numbers;

import org.junit.jupiter.api.Test;
import org.owasp.safetypes.exception.TypeValidationException;

import static org.junit.jupiter.api.Assertions.*;

class NumString3Test {

    @Test
    void accept() {
        assertDoesNotThrow(() -> new NumString3("123"));
        assertDoesNotThrow(() -> new NumString3(null));
        assertThrows(TypeValidationException.class, () -> new NumString3("12"));
        assertThrows(TypeValidationException.class, () -> new NumString3("1234"));
        assertThrows(TypeValidationException.class, () -> new NumString3("abc"));
    }
}