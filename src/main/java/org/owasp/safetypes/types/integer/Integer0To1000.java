package org.owasp.safetypes.types.integer;

import org.owasp.safetypes.exception.TypeValidationException;

/**
 * The {@code Integer0To1000} class represents a special type of
 * {@code Integer} which is between 0 and 1000.
 * <p>
 * Example:
 * <pre><code>
 *     //Spring REST example
 *     import org.owasp.safetypes.types.integer.Integer0To1000;
 *     ...
 *     &#64;GetMapping("/number")
 *     public ResponseEntity&lt;Integer&gt; number(@RequestParam Integer0To1000 number) {
 *         return new ResponseEntity&lt;&gt;(number.get(), HttpStatus.OK);
 *     }
 *     ...
 * </code></pre>
 * <p>
 *
 * @author todorolev
 */
public class Integer0To1000 extends AbstractSafeLimitedInteger {

    /**
     * Initializes a newly created {@code Integer0To1000} object so
     * that it represents the same value as the argument.
     * <p>
     * The {@code Integer value} can be {@code null}.
     *
     * @param value An {@code Integer}.
     * @throws TypeValidationException if the validation fails.
     */
    public Integer0To1000(Integer value) throws TypeValidationException {
        super(value);
    }

    /**
     * Initializes a newly created {@code Integer0To1000} object so
     * that it represents the same value as if
     * {@code Integer.parseInt(value)} was applied to the argument.
     * <p>
     * The {@code String value} can be {@code null}.
     *
     * @param value A {@code String}.
     * @throws TypeValidationException if the validation fails.
     */
    public Integer0To1000(String value) throws TypeValidationException {
        super(Integer.parseInt(value));
    }

    /**
     * Returns 0.
     *
     * @return 0.
     */
    @Override
    protected final Integer low() {
        return 0;
    }

    /**
     * Returns 1000.
     *
     * @return 1000.
     */
    @Override
    protected final Integer high() {
        return 1000;
    }
}
