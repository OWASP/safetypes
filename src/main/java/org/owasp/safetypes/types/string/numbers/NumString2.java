package org.owasp.safetypes.types.string.numbers;

import org.owasp.safetypes.exception.TypeValidationException;

/**
 * The {@code NumString2} class represents a special type of {@code String},
 * containing only digits and having length set to 2.
 *<p>
 * Example:
 * <pre><code>
 *     //Spring REST example
 *     import org.owasp.safetypes.types.string.numbers.NumString2;
 *     ...
 *     &#64;GetMapping("/numbers")
 *     public ResponseEntity&lt;String&gt; numbers(@RequestParam NumString2 numbers) {
 *         return new ResponseEntity&lt;&gt;(numbers.get(), HttpStatus.OK);
 *     }
 *     ...
 * </code></pre>
 * <p>
 * The class {@code NumString2} is used instead of {@code String} and in the
 * same time {@code NumString2} is constructed in such a way, that
 * it allows only for 2 digits, e.g. "12", "00", "07", etc. and it throws
 * an exception for everything else, e.g. "123", "xyz", "a1", etc.
 */
public class NumString2 extends BoundedNumString {
    /**
     * Initializes a newly created {@code NumString2} object so that it
     * represents the same value as the argument.
     *
     * @param value A {@code String}.
     * @throws TypeValidationException if the validation fails.
     */
    public NumString2(String value) throws TypeValidationException {
        super(value);
    }

    /**
     * Returns 2.
     *
     * @return 2.
     */
    @Override
    protected Integer min() {
        return 2;
    }

    /**
     * Returns 2.
     *
     * @return 2.
     */
    @Override
    protected Integer max() {
        return 2;
    }
}
