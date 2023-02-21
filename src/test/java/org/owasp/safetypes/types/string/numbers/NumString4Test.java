package org.owasp.safetypes.types.string.numbers;

import org.junit.jupiter.api.Test;
import org.owasp.safetypes.exception.TypeValidationException;

import static org.junit.jupiter.api.Assertions.*;

class NumString4Test {
    
    @Test
    void accept() {
        assertDoesNotThrow(() -> new NumString4("1234"));
        assertDoesNotThrow(() -> new NumString4(null));
        assertThrows(TypeValidationException.class, () -> new NumString4("123"));
        assertThrows(TypeValidationException.class, () -> new NumString4("12345"));
        assertThrows(TypeValidationException.class, () -> new NumString4("abcd"));
    }
}