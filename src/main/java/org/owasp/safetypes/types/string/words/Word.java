package org.owasp.safetypes.types.string.words;

import org.owasp.safetypes.exception.TypeValidationException;

/**
 * The {@code Word} class represents a special type of {@code String},
 * containing only letters and having length limited to {@code Integer.MAX_VALUE}.
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
public class Word extends AbstractSafeWord {

    /**
     * Initializes a newly created {@code Word} object
     * so that it represents the same value as the argument.
     *
     * @param value A {@code String}.
     * @throws TypeValidationException if the validation fails.
     */
    public Word(String value) throws TypeValidationException {
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
