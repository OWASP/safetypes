package org.owasp.safetypes.types.string.geodata.stateprovince;

import org.owasp.safetypes.exception.TypeValidationException;
import org.owasp.safetypes.types.string.AbstractSafeEnumStringIgnoreCase;

import java.util.Set;

public class USState extends AbstractSafeEnumStringIgnoreCase {

    protected USState(String value) throws TypeValidationException {
        super(value);
    }

    @Override
    protected Set<String> setStrings() {
        return Set.of(
                "AL", "AK", "AZ", "AR", "CA", "CZ", "CO", "CT", "DE", "DC", "FL", "GA", "GU", "HI", "ID",
                "IL", "IN", "IA", "KS", "KY", "LA", "ME", "MD", "MA", "MI", "MN", "MS", "MO", "MT", "NE",
                "NV", "NH", "NJ", "NM", "NY", "NC", "ND", "OH", "OK", "OR", "PA", "PR", "RI", "SC", "SD",
                "TN", "TX", "UT", "VT", "VI", "VA", "WA", "WV", "WI", "WY");
    }
}
