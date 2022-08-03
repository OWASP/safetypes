package org.owasp.safetypes.types.string;

import org.junit.jupiter.api.Test;
import org.owasp.safetypes.exception.TypeValidationException;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

class UUIDStringTest {
    @Test
    void accept() {
        assertDoesNotThrow(() -> new UUIDString("5c87e45e-1327-11ed-861d-0242ac120002"));
        assertDoesNotThrow(() -> new UUIDString("5C87E45E-1327-11ED-861D-0242AC120002"));
        assertDoesNotThrow(() -> new UUIDString("8d44be53-4689-4d30-9c48-d2e5f68acfc6"));
        assertDoesNotThrow(() -> new UUIDString("8D44BE53-4689-4D30-9C48-D2E5F68ACFC6"));
        assertThrows(TypeValidationException.class, () -> new UUIDString("W"));
        assertThrows(TypeValidationException.class, () -> new UUIDString(" "));
        assertThrows(TypeValidationException.class, () -> new UUIDString("w-o-r-d"));
        assertThrows(TypeValidationException.class, () -> new UUIDString("5c87e45e-1327-11ed-861d0242ac120002"));
        assertThrows(TypeValidationException.class, () -> new UUIDString("8D44BE534689-4D30-9C48-D2E5F68ACFC6"));
    }
}
