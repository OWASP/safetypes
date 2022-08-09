package org.owasp.safetypes.types.string.geodata.country;

import org.junit.jupiter.api.Test;
import org.owasp.safetypes.exception.TypeValidationException;

import static org.junit.jupiter.api.Assertions.*;

class CountryTest {

    @Test
    void accept() {
        assertDoesNotThrow(() -> new Country("BG"));
        assertDoesNotThrow(() -> new Country("BGR"));
        assertThrows(TypeValidationException.class, () -> new Country("BGX"));
        assertThrows(TypeValidationException.class, () -> new Country("BX"));
        assertThrows(TypeValidationException.class, () -> new Country("XY"));
        assertThrows(TypeValidationException.class, () -> new Country(" "));
        assertThrows(TypeValidationException.class, () -> new Country(">"));
        assertThrows(TypeValidationException.class, () -> new Country("-"));
    }
}