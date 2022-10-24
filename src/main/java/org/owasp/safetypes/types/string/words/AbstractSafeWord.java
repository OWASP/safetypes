package org.owasp.safetypes.types.string.words;

import org.owasp.safetypes.exception.TypeValidationException;
import org.owasp.safetypes.types.string.AbstractSafeBoundedString;

/**
 * The {@code AbstractSafeWord} class represents
 * a special type of {@code String}, containing
 * only letters and with bounded length.
 * <p>
 * Example:
 * <pre><code>
 *     //Spring REST example
 *     import org.owasp.safetypes.types.string.Word;
 *     ...
 *     &#64;GetMapping("/word")
 *     public ResponseEntity&lt;String&gt; word(@RequestParam Word word) {
 *         return new ResponseEntity&lt;&gt;(word.get(), HttpStatus.OK);
 *     }
 *     ...
 * </code></pre>
 * <p>
 * The class {@code Word} is used instead of {@code String} and in
 * the same time {@code Word} is constructed in such a way, that it
 * allows only for letters, e.g. "abcd", "test", "Something", etc.
 * and it throws an exception for everything else, e.g. "this is a test", "number1", "T3st".
 *
 * @author todorolev
 */
public abstract class AbstractSafeWord extends AbstractSafeBoundedString {

    /**
     * Initializes a newly created {@code AbstractSafeWord} object
     * so that it represents the same value as the argument.
     *
     * @param value A {@code String}.
     * @throws TypeValidationException if the validation fails.
     */
    protected AbstractSafeWord(String value) throws TypeValidationException {
        super(value);
    }

    /**
     * Validates that the {@code String value} contains only letters.
     * <p>
     * The {@code String value} can be {@code null}.
     *
     * @param value A {@code String}.
     * @throws TypeValidationException if the validation fails.
     */
    @Override
    protected final void validate(String value) throws TypeValidationException {
        if(value == null)
            return;

        for (int i=0; i<value.length(); i++) {
            char c = value.charAt(i);
            if (Character.isLetter(c))
                continue;
            throw new TypeValidationException();
        }
    }
}
