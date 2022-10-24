package org.owasp.safetypes.types.string.numbers;

import org.owasp.safetypes.exception.TypeValidationException;

/**
 * The {@code NumString} class represents a special type of {@code String},
 * containing only digits and having length limited to {@code Integer.MAX_VALUE}.
 *<p>
 * Example:
 * <pre><code>
 *     //Spring REST example
 *     import org.owasp.safetypes.types.string.numbers.NumString;
 *     ...
 *     &#64;GetMapping("/numbers")
 *     public ResponseEntity&lt;String&gt; numbers(@RequestParam NumString numbers) {
 *         return new ResponseEntity&lt;&gt;(numbers.get(), HttpStatus.OK);
 *     }
 *     ...
 * </code></pre>
 * <p>
 * The class {@code NumString} is used instead of {@code String}
 * and in the same time {@code NumString} is constructed in such a way,
 * that it allows only for digits, e.g. "123", "007", etc. and it throws
 * an exception for everything else, e.g. "xyz", "a1", "1x2", etc.
 */
public class NumString extends AbstractSafeNumString {
    /**
     * Initializes a newly created {@code NumString} object so that it
     * represents the same value as the argument.
     *
     * @param value A {@code String}.
     * @throws TypeValidationException if the validation fails.
     */
    public NumString(String value) throws TypeValidationException {
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
     * Returns null, which makes the max length equal to {@code Integer.MAX_VALUE}.
     *
     * @return null.
     */
    @Override
    protected Integer max() {
        return null;
    }
}
