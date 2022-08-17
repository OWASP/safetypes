package org.owasp.safetypes.types.string.geodata.stateprovince;

import org.owasp.safetypes.exception.TypeValidationException;
import org.owasp.safetypes.types.string.AbstractSafeSetStringIgnoreCase;

import java.util.Set;

/**
 * The {@code CHCanton} class represents a special type of
 * {@code String} containing a Swiss canton code.
 * <p>
 * Example:
 * <pre><code>
 *     //Spring REST example
 *     import org.owasp.safetypes.types.string.geodata.stateprovince.CHCanton;
 *     ...
 *     &#64;GetMapping("/stateprovince")
 *     public ResponseEntity&lt;String&gt; stateprovince(@RequestParam CHCanton stateprovince) {
 *         return new ResponseEntity&lt;&gt;(stateprovince.get(), HttpStatus.OK);
 *     }
 *     ...
 * </code></pre>
 * <p>
 *
 * @author todorolev
 */
public class CHCanton extends AbstractSafeSetStringIgnoreCase {

    /**
     * Initializes a newly created {@code CHCanton} object so that it
     * represents the same value as the argument.
     *
     * @param value A {@code String}.
     * @throws TypeValidationException if the validation fails.
     */
    public CHCanton(String value) throws TypeValidationException {
        super(value);
    }

    /**
     * Returns a {@code Set} of all Swiss canton codes.
     *
     * @return the {@code Set} of all Swiss canton codes.
     */
    @Override
    protected Set<String> strings() {
        return Set.of("ZH", "BE", "LU", "UR", "SZ", "OW", "NW", "GL", "ZG", "FR", "SO", "BS", "BL", "SH", "AR", "AI",
                "SG", "GR", "AG", "TG", "TI", "VD", "VS", "NE", "GE", "JU");
    }
}
