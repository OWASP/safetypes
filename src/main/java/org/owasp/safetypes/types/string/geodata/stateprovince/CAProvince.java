package org.owasp.safetypes.types.string.geodata.stateprovince;

import org.owasp.safetypes.exception.TypeValidationException;
import org.owasp.safetypes.types.string.AbstractSafeSetStringIgnoreCase;

import java.util.Set;

/**
 * The {@code CAProvince} class represents a special type of
 * {@code String} containing a Canada province code.
 * <p>
 * Example:
 * <pre><code>
 *     //Spring REST example
 *     import org.owasp.safetypes.types.string.geodata.stateprovince.CAProvince;
 *     ...
 *     &#64;GetMapping("/stateprovince")
 *     public ResponseEntity&lt;String&gt; stateprovince(@RequestParam CAProvince stateprovince) {
 *         return new ResponseEntity&lt;&gt;(stateprovince.get(), HttpStatus.OK);
 *     }
 *     ...
 * </code></pre>
 * <p>
 *
 * @author todorolev
 */
public class CAProvince extends AbstractSafeSetStringIgnoreCase {

    /**
     * Initializes a newly created {@code CAProvince} object so that it
     * represents the same value as the argument.
     *
     * @param value A {@code String}.
     * @throws TypeValidationException if the validation fails.
     */
    public CAProvince(String value) throws TypeValidationException {
        super(value);
    }

    /**
     * Returns a {@code Set} of all Canada province codes.
     *
     * @return the {@code Set} of all Canada province codes.
     */
    @Override
    protected Set<String> strings() {
        return Set.of("ON", "QC", "NS", "NB", "MB", "BC", "PE", "SK", "AB", "NL");
    }
}
