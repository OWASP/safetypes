package org.owasp.safetypes.types.string.geodata.stateprovince;

import org.owasp.safetypes.exception.TypeValidationException;
import org.owasp.safetypes.types.string.AbstractSafeSetStringIgnoreCase;

import java.util.Set;

/**
 * The {@code AUState} class represents a special type of
 * {@code String} containing an AU state code.
 * <p>
 * Example:
 * <pre><code>
 *     //Spring REST example
 *     import org.owasp.safetypes.types.string.geodata.stateprovince.AUState;
 *     ...
 *     &#64;GetMapping("/stateprovince")
 *     public ResponseEntity&lt;String&gt; stateprovince(@RequestParam AUState stateprovince) {
 *         return new ResponseEntity&lt;&gt;(stateprovince.get(), HttpStatus.OK);
 *     }
 *     ...
 * </code></pre>
 * <p>
 *
 * @author todorolev
 */
public class AUState extends AbstractSafeSetStringIgnoreCase {

    /**
     * Initializes a newly created {@code AUState} object so that
     * it represents the same value as the argument.
     *
     * @param value A {@code String}.
     * @throws TypeValidationException if the validation fails.
     */
    public AUState(String value) throws TypeValidationException {
        super(value);
    }

    /**
     * Returns a {@code Set} of all AU state codes.
     *
     * @return the {@code Set} of all AU state codes.
     */
    @Override
    protected Set<String> strings() {
        return Set.of("NSW", "VIC", "QLD", "SA", "WA", "TAS", "NT", "ACT");
    }
}
