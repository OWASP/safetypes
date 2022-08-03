package org.owasp.safetypes.types.string.geodata.stateprovince;

import org.owasp.safetypes.exception.TypeValidationException;
import org.owasp.safetypes.types.string.AbstractSafeEnumStringIgnoreCase;

import java.util.Set;

public class CanadaProvinces extends AbstractSafeEnumStringIgnoreCase {

    protected CanadaProvinces(String value) throws TypeValidationException {
        super(value);
    }

    @Override
    protected Set<String> setStrings() {
        return Set.of("ON", "QC", "NS", "NB", "MB", "BC", "PE", "SK", "AB", "NL");
    }
}
