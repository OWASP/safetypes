package org.owasp.safetypes.types.string.symbols.alphabet;

import org.owasp.safetypes.exception.TypeValidationException;
import org.owasp.safetypes.types.string.SetChar;

import java.util.Set;

/**
 * The {@code English} class represents a special type of
 * {@code String} containing a letter from the English alphabet.
 * <p>
 * Example:
 * <pre><code>
 *     //Spring REST example
 *     import org.owasp.safetypes.types.string.symbols.alphabet.English;
 *     ...
 *     &#64;GetMapping("/letter")
 *     public ResponseEntity&lt;String&gt; letter(@RequestParam English letter) {
 *         return new ResponseEntity&lt;&gt;(letter.get(), HttpStatus.OK);
 *     }
 *     ...
 * </code></pre>
 * <p>
 *
 * @author todorolev
 */
public class English extends SetChar {

    /**
     * Initializes a newly created {@code English} object so that
     * it represents the same value as the argument.
     *
     * @param value A {@code String}.
     * @throws TypeValidationException if the validation fails.
     */
    public English(String value) throws TypeValidationException {
        super(value);
    }

    /**
     * Returns a {@code Set} of all letters in the English alphabet.
     *
     * @return the {@code Set} of all letters in the English alphabet.
     */
    @Override
    protected Set<Character> chars() {
        return Set.of('A', 'a', 'B', 'b', 'C', 'c', 'D', 'd', 'E', 'e', 'F', 'f', 'G', 'g', 'H', 'h', 'I', 'i', 'J', 'j',
                'K', 'k', 'L', 'l', 'M', 'm', 'N', 'n', 'O', 'o', 'P', 'p', 'Q', 'q', 'R', 'r', 'S', 's', 'T', 't', 'U',
                'u', 'V', 'v', 'W', 'w', 'X', 'x', 'Y', 'y', 'Z', 'z');
    }
}
