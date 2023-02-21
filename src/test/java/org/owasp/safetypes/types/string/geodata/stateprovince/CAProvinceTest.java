package org.owasp.safetypes.types.string.geodata.stateprovince;

import org.junit.jupiter.api.Test;
import org.owasp.safetypes.exception.TypeValidationException;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CAProvinceTest {

    @Test
    void accept() {
        assertDoesNotThrow(() -> new CAProvince("ON"));
        assertDoesNotThrow(() -> new CAProvince("QC"));
        assertDoesNotThrow(() -> new CAProvince("qc"));
        assertDoesNotThrow(() -> new CAProvince(null));
        assertThrows(TypeValidationException.class, () -> new USState("XY"));
        assertThrows(TypeValidationException.class, () -> new USState(" "));
        assertThrows(TypeValidationException.class, () -> new USState(">"));
        assertThrows(TypeValidationException.class, () -> new USState("_"));
        assertThrows(TypeValidationException.class, () -> new USState("'"));
        assertThrows(TypeValidationException.class, () -> new USState("-"));
        assertThrows(TypeValidationException.class, () -> new USState("-"));
    }
}