package org.owasp.safetypes.types.string.numbers;

import org.owasp.safetypes.exception.TypeValidationException;

/**
 * The {@code NumString4} class represents a special type of {@code String},
 * containing only digits and having length set to 4.
 *<p>
 * Example:
 * <pre><code>
 *     //Spring REST example
 *     import org.owasp.safetypes.types.string.numbers.NumString4;
 *     ...
 *     &#64;GetMapping("/numbers")
 *     public ResponseEntity&lt;String&gt; numbers(@RequestParam NumString4 numbers) {
 *         return new ResponseEntity&lt;&gt;(numbers.get(), HttpStatus.OK);
 *     }
 *     ...
 * </code></pre>
 * <p>
 * The class {@code NumString4} is used instead of {@code String} and in the
 * same time {@code NumString4} is constructed in such a way, that
 * it allows only for 4 digits, e.g. "1234", "0000", "0007", etc. and it throws
 * an exception for everything else, e.g. "123", "12345", "xyz", "a1", etc.
 */
public class NumString4 extends AbstractSafeNumString {
    /**
     * Initializes a newly created {@code NumString4} object so that it
     * represents the same value as the argument.
     *
     * @param value A {@code String}.
     * @throws TypeValidationException if the validation fails.
     */
    public NumString4(String value) throws TypeValidationException {
        super(value);
    }

    /**
     * Returns 4.
     *
     * @return 4.
     */
    @Override
    protected Integer min() {
        return 4;
    }

    /**
     * Returns 4.
     *
     * @return 4.
     */
    @Override
    protected Integer max() {
        return 4;
    }
}
