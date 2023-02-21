package org.owasp.safetypes.types.string;

import org.owasp.safetypes.SafeType;
import org.owasp.safetypes.exception.TypeValidationException;

/**
 * The {@code Alphanum} class represents a special type of
 * {@code String}, containing only alphanumeric characters.
 * <p>
 * Example:
 * <pre><code>
 *     //Spring REST example
 *     import org.owasp.safetypes.types.string.Alphanum;
 *     ...
 *     &#64;GetMapping("/alphanum")
 *     public ResponseEntity&lt;String&gt; alphanum(@RequestParam Alphanum alphanum) {
 *         return new ResponseEntity&lt;&gt;(alphanum.get(), HttpStatus.OK);
 *     }
 *     ...
 * </code></pre>
 * <p>
 * The class {@code Alphanum} is used instead of {@code String} and in the
 * same time {@code Alphanum} is constructed in such a way, that it
 * allows only for alphanumeric characters, e.g. "W1o2r3d4" and it throws
 * an exception for everything else, e.g. "Wor d", "Word_", etc.
 *
 * @author todorolev
 */
public class Alphanum extends SafeType<String> {

    /**
     * Initializes a newly created {@code Alphanum} object
     * so that it represents the same value as the argument.
     * <p>
     * The {@code String} argument can be {@code null}.
     *
     * @param value A {@code String}.
     * @throws TypeValidationException if the validation fails.
     */
    public Alphanum(String value) throws TypeValidationException {
        super(value);
    }

    /**
     * Validates that the {@code String value} contains only
     * alphanumeric characters.
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
            if (Character.isLetterOrDigit(c))
                continue;
            throw new TypeValidationException();
        }
    }
}
