package org.owasp.safetypes.types.integer;

import org.owasp.safetypes.exception.TypeValidationException;

/**
 * The {@code Integer1ToN} class represents a special type of
 * {@code Integer} which is between 1 and {@code Integer.MAX_VALUE}.
 * <p>
 * Example:
 * <pre><code>
 *     //Spring REST example
 *     import org.owasp.safetypes.types.integer.Integer1ToN;
 *     ...
 *     &#64;GetMapping("/number")
 *     public ResponseEntity&lt;Integer&gt; number(@RequestParam Integer1ToN number) {
 *         return new ResponseEntity&lt;&gt;(number.get(), HttpStatus.OK);
 *     }
 *     ...
 * </code></pre>
 *
 * @author todorolev
 */
public class Integer1ToN extends LimitedInteger {

    /**
     * Initializes a newly created {@code Integer1ToN} object so
     * that it represents the same value as the argument.
     *
     * @param value An {@code Integer}.
     * @throws TypeValidationException if the validation fails.
     */
    public Integer1ToN(Integer value) throws TypeValidationException {
        super(value);
    }

    /**
     * Initializes a newly created {@code Integer1ToN} object so
     * that it represents the same value as if
     * {@code Integer.parseInt(value)} was applied to the argument.
     *
     * @param value A {@code String}.
     * @throws TypeValidationException if the validation fails.
     */
    public Integer1ToN(String value) throws TypeValidationException {
        super(value == null ? null : Integer.parseInt(value));
    }

    /**
     * Returns 1.
     *
     * @return 1.
     */
    @Override
    protected final Integer min() {
        return 1;
    }

    /**
     * Returns null. This makes the high limit equal to {@code Integer.MAX_VALUE}
     *
     * @return null.
     */
    @Override
    protected final Integer max() {
        return null;
    }
}
