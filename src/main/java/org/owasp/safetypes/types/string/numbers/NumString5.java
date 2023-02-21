package org.owasp.safetypes.types.string.numbers;

import org.owasp.safetypes.exception.TypeValidationException;

/**
 * The {@code NumString5} class represents a special type of {@code String},
 * containing only digits and having length set to 5.
 *<p>
 * Example:
 * <pre><code>
 *     //Spring REST example
 *     import org.owasp.safetypes.types.string.numbers.NumString5;
 *     ...
 *     &#64;GetMapping("/numbers")
 *     public ResponseEntity&lt;String&gt; numbers(@RequestParam NumString5 numbers) {
 *         return new ResponseEntity&lt;&gt;(numbers.get(), HttpStatus.OK);
 *     }
 *     ...
 * </code></pre>
 * <p>
 * The class {@code NumString5} is used instead of {@code String} and in the
 * same time {@code NumString5} is constructed in such a way, that
 * it allows only for 5 digits, e.g. "12345", "00000", "00007", etc. and it throws
 * an exception for everything else, e.g. "1234", "123456", "xyz", "a1", etc.
 */
public class NumString5 extends BoundedNumString {
    /**
     * Initializes a newly created {@code NumString5} object so that it
     * represents the same value as the argument.
     *
     * @param value A {@code String}.
     * @throws TypeValidationException if the validation fails.
     */
    public NumString5(String value) throws TypeValidationException {
        super(value);
    }

    /**
     * Returns 5.
     *
     * @return 5.
     */
    @Override
    protected Integer min() {
        return 5;
    }

    /**
     * Returns 5.
     *
     * @return 5.
     */
    @Override
    protected Integer max() {
        return 5;
    }
}
