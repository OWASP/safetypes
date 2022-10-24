package org.owasp.safetypes.types.integer;

import org.owasp.safetypes.exception.TypeValidationException;

/**
 * The {@code Integer0To200} class represents a special type of
 * {@code Integer} which is between 0 and 200.
 * <p>
 * Example:
 * <pre><code>
 *     //Spring REST example
 *     import org.owasp.safetypes.types.integer.Integer0To200;
 *     ...
 *     &#64;GetMapping("/number")
 *     public ResponseEntity&lt;Integer&gt; number(@RequestParam Integer0To200 number) {
 *         return new ResponseEntity&lt;&gt;(number.get(), HttpStatus.OK);
 *     }
 *     ...
 * </code></pre>
 * <p>
 *
 * @author todorolev
 */
public class Integer0To200 extends AbstractSafeLimitedInteger {

    /**
     * Initializes a newly created {@code Integer0To200} object so
     * that it represents the same value as the argument.
     *
     * @param value An {@code Integer}.
     * @throws TypeValidationException if the validation fails.
     */
    public Integer0To200(Integer value) throws TypeValidationException {
        super(value);
    }

    /**
     * Initializes a newly created {@code Integer0To200} object so
     * that it represents the same value as if
     * {@code Integer.parseInt(value)} was applied to the argument.
     *
     * @param value A {@code String}.
     * @throws TypeValidationException if the validation.
     */
    public Integer0To200(String value) throws TypeValidationException {
        super(value == null ? null : Integer.parseInt(value));
    }

    /**
     * Returns 0.
     *
     * @return 0.
     */
    @Override
    protected final Integer min() {
        return 0;
    }

    /**
     * Returns 200.
     *
     * @return 200.
     */
    @Override
    protected final Integer max() {
        return 200;
    }
}
