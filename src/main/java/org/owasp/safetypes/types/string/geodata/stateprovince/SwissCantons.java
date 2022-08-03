package org.owasp.safetypes.types.string.geodata.stateprovince;

import org.owasp.safetypes.exception.TypeValidationException;
import org.owasp.safetypes.types.string.AbstractSafeEnumStringIgnoreCase;

import java.util.Set;

public class SwissCantons extends AbstractSafeEnumStringIgnoreCase {

    protected SwissCantons(String value) throws TypeValidationException {
        super(value);
    }

    @Override
    protected Set<String> setStrings() {
        return Set.of("ZH", "BE", "LU", "UR", "SZ", "OW", "NW", "GL", "ZG", "FR", "SO", "BS", "BL", "SH", "AR", "AI",
                "SG", "GR", "AG", "TG", "TI", "VD", "VS", "NE", "GE", "JU");
    }
}
