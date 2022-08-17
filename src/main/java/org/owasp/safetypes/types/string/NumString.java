package org.owasp.safetypes.types.string;

import org.owasp.safetypes.AbstractSafeDataType;
import org.owasp.safetypes.exception.TypeValidationException;

/**
 * The {@code NumString} class represents a special type of {@code String},
 * containing only digits.
 * <p>
 * Example:
 * <pre><code>
 *     //Spring REST example
 *     import org.owasp.safetypes.types.string.NumString;
 *     ...
 *     &#64;GetMapping("/numbers")
 *     public ResponseEntity&lt;String&gt; numbers(@RequestParam NumString numbers) {
 *         return new ResponseEntity&lt;&gt;(numbers.get(), HttpStatus.OK);
 *     }
 *     ...
 * </code></pre>
 * <p>
 * The class {@code NumString} is used instead of {@code String} and in the
 * same time {@code NumString} is constructed in such a way, that it
 * allows only for digits, e.g. "123", "007", etc. and it throws
 * an exception for everything else, e.g. "xyz", "a1", "1x2", etc.
 *
 * @author todorolev
 */
public class NumString extends AbstractSafeDataType<String> {

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
     * Validates that the {@code String value}contains only digits.
     * <p>
     * The {@code String value} can be {@code null}.
     *
     * @param value A {@code String}.
     * @throws TypeValidationException if the validation fails.
     */
    @Override
    protected final void accept(String value) throws TypeValidationException {
        if(value == null)
            return;

        for (int i=0; i<value.length(); i++) {
            char c = value.charAt(i);
            if (Character.isDigit(c))
                continue;
            throw new TypeValidationException();
        }
    }
}
