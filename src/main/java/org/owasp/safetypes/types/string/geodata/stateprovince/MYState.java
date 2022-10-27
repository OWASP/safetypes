package org.owasp.safetypes.types.string.geodata.stateprovince;

import org.owasp.safetypes.exception.TypeValidationException;
import org.owasp.safetypes.types.string.AbstractSafeSetStringIgnoreCase;

import java.util.Set;

/**
 * The {@code MYState} class represents a special type of
 * {@code String} containing an MY state code.
 * <p>
 * Example:
 * <pre><code>
 *     //Spring REST example
 *     import org.owasp.safetypes.types.string.geodata.stateprovince.MYState;
 *     ...
 *     &#64;GetMapping("/stateprovince")
 *     public ResponseEntity&lt;String&gt; stateprovince(@RequestParam MYState stateprovince) {
 *         return new ResponseEntity&lt;&gt;(stateprovince.get(), HttpStatus.OK);
 *     }
 *     ...
 * </code></pre>
 * <p>
 *
 * @author todorolev
 */
public class MYState extends AbstractSafeSetStringIgnoreCase {

    /**
     * Initializes a newly created {@code MYState} object so that
     * it represents the same value as the argument.
     * <p>
     * The {@code String value} can be {@code null}.
     *
     * @param value A {@code String}.
     * @throws TypeValidationException if the validation fails.
     */
    public MYState(String value) throws TypeValidationException {
        super(value);
    }

    @Override
    protected Set<String> strings() {
        return Set.of(
                "JHR", "KDH", "KTN", "MLK", "NSN", "PHG", "PNG", "PRK", "PLS", "SBH", "SWK", "SGR",
                "TRG", "KUL", "LBN", "PJY");
    }
}
