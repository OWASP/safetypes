package org.owasp.safetypes.types.string.numbers;

import org.owasp.safetypes.exception.TypeValidationException;

/**
 * The {@code NumString6} class represents a special type of {@code String},
 * containing only digits and having length set to 6.
 *<p>
 * Example:
 * <pre><code>
 *     //Spring REST example
 *     import org.owasp.safetypes.types.string.numbers.NumString6;
 *     ...
 *     &#64;GetMapping("/numbers")
 *     public ResponseEntity&lt;String&gt; numbers(@RequestParam NumString6 numbers) {
 *         return new ResponseEntity&lt;&gt;(numbers.get(), HttpStatus.OK);
 *     }
 *     ...
 * </code></pre>
 * <p>
 * The class {@code NumString6} is used instead of {@code String} and in the
 * same time {@code NumString6} is constructed in such a way, that
 * it allows only for 6 digits, e.g. "123456", "000000", "000007", etc. and it throws
 * an exception for everything else, e.g. "12345", "1234567", "abcdef", "a12345", etc.
 */
public class NumString6 extends AbstractSafeNumString {
    /**
     * Initializes a newly created {@code NumString6} object so that it
     * represents the same value as the argument.
     *
     * @param value A {@code String}.
     * @throws TypeValidationException if the validation fails.
     */
    public NumString6(String value) throws TypeValidationException {
        super(value);
    }

    /**
     * Returns 6.
     *
     * @return 6.
     */
    @Override
    protected Integer min() {
        return 6;
    }

    /**
     * Returns 6.
     *
     * @return 6.
     */
    @Override
    protected Integer max() {
        return 6;
    }
}
