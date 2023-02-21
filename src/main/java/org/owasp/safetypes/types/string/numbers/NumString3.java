package org.owasp.safetypes.types.string.numbers;

import org.owasp.safetypes.exception.TypeValidationException;

/**
 * The {@code NumString3} class represents a special type of {@code String},
 * containing only digits and having length set to 3.
 *<p>
 * Example:
 * <pre><code>
 *     //Spring REST example
 *     import org.owasp.safetypes.types.string.numbers.NumString3;
 *     ...
 *     &#64;GetMapping("/numbers")
 *     public ResponseEntity&lt;String&gt; numbers(@RequestParam NumString3 numbers) {
 *         return new ResponseEntity&lt;&gt;(numbers.get(), HttpStatus.OK);
 *     }
 *     ...
 * </code></pre>
 * <p>
 * The class {@code NumString3} is used instead of {@code String} and in the
 * same time {@code NumString3} is constructed in such a way, that
 * it allows only for 3 digits, e.g. "123", "000", "007", etc. and it throws
 * an exception for everything else, e.g. "12", "1234", "xyz", "a1", etc.
 */
public class NumString3 extends BoundedNumString {
    /**
     * Initializes a newly created {@code NumString3} object so that it
     * represents the same value as the argument.
     *
     * @param value A {@code String}.
     * @throws TypeValidationException if the validation fails.
     */
    public NumString3(String value) throws TypeValidationException {
        super(value);
    }

    /**
     * Returns 3.
     *
     * @return 3.
     */
    @Override
    protected Integer min() {
        return 3;
    }

    /**
     * Returns 3.
     *
     * @return 3.
     */
    @Override
    protected Integer max() {
        return 3;
    }
}
