package org.owasp.safetypes.types.string.symbols.alphabet;

import org.owasp.safetypes.exception.TypeValidationException;
import org.owasp.safetypes.types.string.AbstractSafeSetChar;

import java.util.Set;

/**
 * The {@code Bulgarian} class represents a special type of
 * {@code String} containing a letter from the Bulgarian alphabet.
 * <p>
 * Example:
 * <pre><code>
 *     //Spring REST example
 *     import org.owasp.safetypes.types.string.symbols.alphabet.Bulgarian;
 *     ...
 *     &#64;GetMapping("/letter")
 *     public ResponseEntity&lt;String&gt; letter(@RequestParam Bulgarian letter) {
 *         return new ResponseEntity&lt;&gt;(letter.get(), HttpStatus.OK);
 *     }
 *     ...
 * </code></pre>
 * <p>
 *
 * @author todorolev
 */
public class Bulgarian extends AbstractSafeSetChar {

    /**
     * Initializes a newly created {@code Bulgarian} object so that
     * it represents the same value as the argument.
     *
     * @param value A {@code String}.
     * @throws TypeValidationException if the validation fails.
     */
    public Bulgarian(String value) throws TypeValidationException {
        super(value);
    }

    /**
     * Returns a {@code Set} of all letters in the Bulgarian alphabet.
     *
     * @return the {@code Set} of all letters in the Bulgarian alphabet.
     */
    @Override
    protected Set<Character> chars() {
        return Set.of('А', 'а', 'Б', 'б', 'В', 'в', 'Г', 'г', 'Д', 'д', 'Е', 'е', 'Ж', 'ж', 'З', 'з', 'И', 'и', 'Й', 'й',
                'К', 'к', 'Л', 'л', 'М', 'м', 'Н', 'н', 'О', 'о', 'П', 'п', 'Р', 'р', 'С', 'с', 'Т', 'т', 'У', 'у', 'Ф',
                'ф', 'Х', 'х', 'Ц', 'ц', 'Ч', 'ч', 'Ш', 'ш', 'Щ', 'щ', 'Ъ', 'ъ', 'ь', 'Ю', 'ю', 'Я', 'я');
    }
}
