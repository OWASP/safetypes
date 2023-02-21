package org.owasp.safetypes.types.string;

import org.junit.jupiter.api.Test;
import org.owasp.safetypes.exception.TypeValidationException;

import static org.junit.jupiter.api.Assertions.*;

class IPAddressTest {

    @Test
    void accept() {
        assertDoesNotThrow(() -> new IPAddress("127.0.0.1"));
        assertDoesNotThrow(() -> new IPAddress("2001:db8:3333:4444:5555:6666:7777:8888"));
        assertDoesNotThrow(() -> new IPAddress("2001:db8:3333:4444:5555:6666:7777::"));
        assertDoesNotThrow(() -> new IPAddress(null));
        assertDoesNotThrow(() -> new IPAddress("10"));
        assertThrows(TypeValidationException.class, () -> new IPAddress("127.0.0.x"));
        assertThrows(TypeValidationException.class, () -> new IPAddress("127.0.0."));
        assertThrows(TypeValidationException.class, () -> new IPAddress("not.an.ip.address"));
        assertThrows(TypeValidationException.class, () -> new IPAddress("not an ip address"));
        assertThrows(TypeValidationException.class, () -> new IPAddress("2001:db8:3333:4444:5555:6666:7777"));
    }
}