package org.owasp.safetypes.types.string.numbers;

import org.junit.jupiter.api.Test;
import org.owasp.safetypes.exception.TypeValidationException;

import static org.junit.jupiter.api.Assertions.*;

class NumString5Test {

    @Test
    void accept() {
        assertDoesNotThrow(() -> new NumString5("01234"));
        assertDoesNotThrow(() -> new NumString5(null));
        assertThrows(TypeValidationException.class, () -> new NumString5("1234"));
        assertThrows(TypeValidationException.class, () -> new NumString5("123456"));
        assertThrows(TypeValidationException.class, () -> new NumString5("abcde"));
    }
}