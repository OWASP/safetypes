package org.owasp.safetypes.types.string.numbers;

import org.owasp.safetypes.exception.TypeValidationException;

/**
 * The {@code NumString0To10} class represents a special type of {@code String},
 * containing only digits and having length limited to 10.
 *<p>
 * Example:
 * <pre><code>
 *     //Spring REST example
 *     import org.owasp.safetypes.types.string.numbers.NumString0To10;
 *     ...
 *     &#64;GetMapping("/numbers")
 *     public ResponseEntity&lt;String&gt; numbers(@RequestParam NumString0To10 numbers) {
 *         return new ResponseEntity&lt;&gt;(numbers.get(), HttpStatus.OK);
 *     }
 *     ...
 * </code></pre>
 * <p>
 * The class {@code NumString0To10} is used instead of {@code String}
 * and in the same time {@code NumString0To10} is constructed in such a way,
 * that it allows only for up to 10 digits, e.g. "123", "0123456789", etc.
 * and it throws an exception for everything else, e.g. "xyz", "a1", "12345678910", etc.
 */
public class NumString0To10 extends AbstractSafeNumString {

    /**
     * Initializes a newly created {@code NumString0To10} object so that it
     * represents the same value as the argument.
     *
     * @param value A {@code String}.
     * @throws TypeValidationException if the validation fails.
     */
    public NumString0To10(String value) throws TypeValidationException {
        super(value);
    }

    /**
     * Returns null, which makes the min length equal to 0.
     *
     * @return null.
     */
    @Override
    protected Integer min() {
        return null;
    }

    /**
     * Returns 10.
     *
     * @return 10.
     */
    @Override
    protected Integer max() {
        return 10;
    }
}
