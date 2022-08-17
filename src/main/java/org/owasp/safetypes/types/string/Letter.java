package org.owasp.safetypes.types.string;

import org.owasp.safetypes.AbstractSafeDataType;
import org.owasp.safetypes.exception.TypeValidationException;

/**
 * The {@code Letter} class represents a special type of
 * {@code String}, containing only a single letter.
 * <p>
 * Example:
 * <pre><code>
 *     //Spring REST example
 *     import org.owasp.safetypes.types.string.Letter;
 *     ...
 *     &#64;GetMapping("/letter")
 *     public ResponseEntity&lt;String&gt; letter(@RequestParam Letter letter) {
 *         return new ResponseEntity&lt;&gt;(letter.get(), HttpStatus.OK);
 *     }
 *     ...
 * </code></pre>
 * <p>
 * The class {@code Letter} is used instead of {@code String} and in the
 * same time {@code Letter} is constructed in such a way, that it
 * allows only for a single letter, e.g. "a", "B", etc. and it throws
 * an exception for everything else, e.g. "0", "a1b2", "+", etc.
 *
 * @author todorolev
 */
public class Letter extends AbstractSafeDataType<String> {

    /**
     * Initializes a newly created {@code Letter} object so that it
     * represents the same value as the argument.
     *
     * @param value A {@code String}.
     * @throws TypeValidationException if the validation fails.
     */
    public Letter(String value) throws TypeValidationException {
        super(value);
    }

    /**
     * Validates that the {@code String value} contains only a single letter.
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

        if(value.length() == 1 && Character.isLetter(value.charAt(0)))
            return;
        throw new TypeValidationException();
    }
}
