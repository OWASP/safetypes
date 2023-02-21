package org.owasp.safetypes.types.string.geodata.stateprovince;

import org.owasp.safetypes.exception.TypeValidationException;
import org.owasp.safetypes.types.string.SetStringIgnoreCase;

import java.util.Set;

/**
 * The {@code USState} class represents a special type of
 * {@code String} containing a US state code.
 * <p>
 * Example:
 * <pre><code>
 *     //Spring REST example
 *     import org.owasp.safetypes.types.string.geodata.stateprovince.USState;
 *     ...
 *     &#64;GetMapping("/stateprovince")
 *     public ResponseEntity&lt;String&gt; stateprovince(@RequestParam USState stateprovince) {
 *         return new ResponseEntity&lt;&gt;(stateprovince.get(), HttpStatus.OK);
 *     }
 *     ...
 * </code></pre>
 * <p>
 *
 * @author todorolev
 */
public class USState extends SetStringIgnoreCase {

    /**
     * Initializes a newly created {@code USState} object so that it
     * represents the same value as the argument.
     *
     * @param value A {@code String}.
     * @throws TypeValidationException if the validation fails.
     */
    public USState(String value) throws TypeValidationException {
        super(value);
    }

    /**
     * Returns a {@code Set} of all US state codes.
     *
     * @return the {@code Set} of all US state codes.
     */
    @Override
    protected Set<String> strings() {
        return Set.of(
                "AL", "AK", "AZ", "AR", "CA", "CZ", "CO", "CT", "DE", "DC", "FL", "GA", "GU", "HI", "ID",
                "IL", "IN", "IA", "KS", "KY", "LA", "ME", "MD", "MA", "MI", "MN", "MS", "MO", "MT", "NE",
                "NV", "NH", "NJ", "NM", "NY", "NC", "ND", "OH", "OK", "OR", "PA", "PR", "RI", "SC", "SD",
                "TN", "TX", "UT", "VT", "VI", "VA", "WA", "WV", "WI", "WY");
    }
}
