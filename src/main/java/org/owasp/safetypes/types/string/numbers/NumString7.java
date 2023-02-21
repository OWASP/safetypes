package org.owasp.safetypes.types.string.numbers;

import org.owasp.safetypes.exception.TypeValidationException;

/**
 * The {@code NumString7} class represents a special type of {@code String},
 * containing only digits and having length set to 7.
 *<p>
 * Example:
 * <pre><code>
 *     //Spring REST example
 *     import org.owasp.safetypes.types.string.numbers.NumString7;
 *     ...
 *     &#64;GetMapping("/numbers")
 *     public ResponseEntity&lt;String&gt; numbers(@RequestParam NumString7 numbers) {
 *         return new ResponseEntity&lt;&gt;(numbers.get(), HttpStatus.OK);
 *     }
 *     ...
 * </code></pre>
 * <p>
 * The class {@code NumString7} is used instead of {@code String} and in the
 * same time {@code NumString7} is constructed in such a way, that
 * it allows only for 6 digits, e.g. "1234567", "0000000", "0000007", etc. and it throws
 * an exception for everything else, e.g. "123456", "12345678", "abcdefg", "a123456", etc.
 */
public class NumString7 extends BoundedNumString {
    /**
     * Initializes a newly created {@code NumString7} object so that it
     * represents the same value as the argument.
     *
     * @param value A {@code String}.
     * @throws TypeValidationException if the validation fails.
     */
    public NumString7(String value) throws TypeValidationException {
        super(value);
    }

    /**
     * Returns 7.
     *
     * @return 7.
     */
    @Override
    protected Integer min() {
        return 7;
    }

    /**
     * Returns 7.
     *
     * @return 7.
     */
    @Override
    protected Integer max() {
        return 7;
    }
}
