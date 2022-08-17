package org.owasp.safetypes.types.string;

import org.owasp.safetypes.AbstractSafeDataType;
import org.owasp.safetypes.exception.TypeValidationException;

/**
 * The {@code DigitString} class represents a special type of {@code String},
 * containing only a single digit.
 * <p>
 * Example:
 * <pre><code>
 *     //Spring REST example
 *     import org.owasp.safetypes.types.string.DigitString;
 *     ...
 *     &#64;GetMapping("/digit")
 *     public ResponseEntity&lt;String&gt; digit(@RequestParam DigitString digit) {
 *         return new ResponseEntity&lt;&gt;(digit.get(), HttpStatus.OK);
 *     }
 *     ...
 * </code></pre>
 * <p>
 * The class {@code DigitString} is used instead of {@code String} and in the
 * same time {@code DigitString} is constructed in such a way, that it
 * allows only for a single digit, e.g. "0", "1", "2", etc. and it throws
 * an exception for everything else, e.g. "10", "a", "+", etc.
 *
 * @author todorolev
 */
public class DigitString extends AbstractSafeDataType<String> {

    /**
     * Initializes a newly created {@code DigitString} object so that it
     * represents the same value as the argument.
     * <p>
     * The {@code String} argument can be {@code null}.
     *
     * @param value A {@code String}.
     * @throws TypeValidationException if the validation fails.
     */
    public DigitString(String value) throws TypeValidationException {
        super(value);
    }

    /**
     * Validates that the {@code String value} contains only a single digit.
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

        if(value.length() == 1 && Character.isDigit(value.charAt(0)))
            return;
        throw new TypeValidationException();
    }
}
