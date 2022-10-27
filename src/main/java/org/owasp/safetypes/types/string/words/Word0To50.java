package org.owasp.safetypes.types.string.words;

import org.owasp.safetypes.exception.TypeValidationException;

/**
 * The {@code Word0To50} class represents a special type of {@code String},
 * containing only letters and having length limited to 50.
 * <p>
 * Example:
 * <pre><code>
 *     //Spring REST example
 *     import org.owasp.safetypes.types.string.Word0To50;
 *     ...
 *     &#64;GetMapping("/word")
 *     public ResponseEntity&lt;String&gt; word(@RequestParam Word0To50 word) {
 *         return new ResponseEntity&lt;&gt;(word.get(), HttpStatus.OK);
 *     }
 *     ...
 * </code></pre>
 * <p>
 * The class {@code Word0To50} is used instead of {@code String} and in
 * the same time {@code Word0To50} is constructed in such a way, that it
 * allows only for up to 50 letters, e.g. "abcd", "test", "Something", etc.
 * and it throws an exception for everything else, e.g. "this is a test", "number1", "T3st".
 *
 * @author todorolev
 */
public class Word0To50 extends AbstractSafeWord {

    /**
     * Initializes a newly created {@code Word0To50} object
     * so that it represents the same value as the argument.
     *
     * @param value A {@code String}.
     * @throws TypeValidationException if the validation fails.
     */
    public Word0To50(String value) throws TypeValidationException {
        super(value);
    }

    @Override
    protected Integer min() {
        return null;
    }

    @Override
    protected Integer max() {
        return 50;
    }
}
