package org.owasp.safetypes.types.string.numbers;

import org.owasp.safetypes.exception.TypeValidationException;

/**
 * The {@code NumString8} class represents a special type of {@code String},
 * containing only digits and having length set to 8.
 *<p>
 * Example:
 * <pre><code>
 *     //Spring REST example
 *     import org.owasp.safetypes.types.string.numbers.NumString8;
 *     ...
 *     &#64;GetMapping("/numbers")
 *     public ResponseEntity&lt;String&gt; numbers(@RequestParam NumString8 numbers) {
 *         return new ResponseEntity&lt;&gt;(numbers.get(), HttpStatus.OK);
 *     }
 *     ...
 * </code></pre>
 * <p>
 * The class {@code NumString8} is used instead of {@code String} and in the
 * same time {@code NumString8} is constructed in such a way, that
 * it allows only for 6 digits, e.g. "12345678", "00000000", "00000007", etc.
 * and it throws an exception for everything else,
 * e.g. "1234567", "123456789", "abcdefgh", "a1234567", etc.
 */
public class NumString8 extends BoundedNumString {
    /**
     * Initializes a newly created {@code NumString8} object so that it
     * represents the same value as the argument.
     *
     * @param value A {@code String}.
     * @throws TypeValidationException if the validation fails.
     */
    public NumString8(String value) throws TypeValidationException {
        super(value);
    }

    /**
     * Returns 8.
     *
     * @return 8.
     */
    @Override
    protected Integer min() {
        return 8;
    }

    /**
     * Returns 8.
     *
     * @return 8.
     */
    @Override
    protected Integer max() {
        return 8;
    }
}
