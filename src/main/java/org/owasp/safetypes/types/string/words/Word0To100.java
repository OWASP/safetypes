package org.owasp.safetypes.types.string.words;

import org.owasp.safetypes.exception.TypeValidationException;

/**
 * The {@code Word0To100} class represents a special type of {@code String},
 * containing only letters and having length limited to 100.
 * <p>
 * Example:
 * <pre><code>
 *     //Spring REST example
 *     import org.owasp.safetypes.types.string.Word0To100;
 *     ...
 *     &#64;GetMapping("/word")
 *     public ResponseEntity&lt;String&gt; word(@RequestParam Word0To100 word) {
 *         return new ResponseEntity&lt;&gt;(word.get(), HttpStatus.OK);
 *     }
 *     ...
 * </code></pre>
 * <p>
 * The class {@code Word0To100} is used instead of {@code String} and in
 * the same time {@code Word0To100} is constructed in such a way, that it
 * allows only for up to 100 letters.
 *
 * @author todorolev
 */
public class Word0To100 extends AbstractSafeWord {

    /**
     * Initializes a newly created {@code Word0To100} object
     * so that it represents the same value as the argument.
     *
     * @param value A {@code String}.
     * @throws TypeValidationException if the validation fails.
     */
    public Word0To100(String value) throws TypeValidationException {
        super(value);
    }

    @Override
    protected Integer min() {
        return null;
    }

    @Override
    protected Integer max() {
        return 100;
    }
}
