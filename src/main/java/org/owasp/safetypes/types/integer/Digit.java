package org.owasp.safetypes.types.integer;

import org.owasp.safetypes.exception.TypeValidationException;

/**
 * The {@code Digit} class represents a special type of
 * {@code Integer}, which is a digit.
 * <p>
 * Example:
 * <pre><code>
 *     //Spring REST example
 *     import org.owasp.safetypes.types.integer.Digit;
 *     ...
 *     &#64;GetMapping("/digit")
 *     public ResponseEntity&lt;Integer&gt; digit(@RequestParam Digit digit) {
 *         return new ResponseEntity&lt;&gt;(digit.get(), HttpStatus.OK);
 *     }
 *     ...
 * </code></pre>
 * <p>
 *
 * @author todorolev
 */
public class Digit extends AbstractSafeLimitedInteger {

    /**
     * Initializes a newly created {@code Digit} object so that it
     * represents the same value as the argument.
     * <p>
     * The {@code Integer value} can be {@code null}.
     *
     * @param value An {@code Integer}.
     * @throws TypeValidationException if the validation fails.
     */
    public Digit(Integer value) throws TypeValidationException {
        super(value);
    }

    /**
     * Initializes a newly created {@code Digit} object so that it
     * represents the same value as if {@code Integer.parseInt(value)}
     * was applied to the argument.
     * <p>
     * The {@code String value} can be {@code null}.
     *
     * @param value A {@code String}.
     * @throws TypeValidationException if the validation fails.
     */
    public Digit(String value) throws TypeValidationException {
        super(value == null ? null : Integer.parseInt(value));
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
     * Returns 9.
     *
     * @return 9.
     */
    @Override
    protected final Integer high() {
        return 9;
    }
}
