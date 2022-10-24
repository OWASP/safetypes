package org.owasp.safetypes.types.string.geodata.stateprovince;

import org.owasp.safetypes.exception.TypeValidationException;
import org.owasp.safetypes.types.string.AbstractSafeSetStringIgnoreCase;

import java.util.Set;

/**
 * The {@code BRState} class represents a special type of
 * {@code String} containing aa BR state code.
 * <p>
 * Example:
 * <pre><code>
 *     //Spring REST example
 *     import org.owasp.safetypes.types.string.geodata.stateprovince.BRState;
 *     ...
 *     &#64;GetMapping("/stateprovince")
 *     public ResponseEntity&lt;String&gt; stateprovince(@RequestParam BRState stateprovince) {
 *         return new ResponseEntity&lt;&gt;(stateprovince.get(), HttpStatus.OK);
 *     }
 *     ...
 * </code></pre>
 * <p>
 *
 * @author todorolev
 */
public class BRState extends AbstractSafeSetStringIgnoreCase {

    /**
     * Initializes a newly created {@code BRState} object so that
     * it represents the same value as the argument.
     *
     * @param value A {@code String}.
     * @throws TypeValidationException if the validation fails.
     */
    protected BRState(String value) throws TypeValidationException {
        super(value);
    }

    @Override
    protected Set<String> strings() {
        return Set.of(
                "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA",
                "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO");
    }
}
