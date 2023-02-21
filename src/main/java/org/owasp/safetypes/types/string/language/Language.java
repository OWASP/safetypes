package org.owasp.safetypes.types.string.language;

import org.owasp.safetypes.exception.TypeValidationException;
import org.owasp.safetypes.types.string.SetStringIgnoreCase;

import java.util.Set;

/**
 * The {@code Language} class represents a special type of
 * {@code String} containing a language code.
 * <p>
 * Example:
 * <pre><code>
 *     //Spring REST example
 *     import org.owasp.safetypes.types.string.language.Language;
 *     ...
 *     &#64;GetMapping("/language")
 *     public ResponseEntity&lt;String&gt; language(@RequestParam Language language) {
 *         return new ResponseEntity&lt;&gt;(language.get(), HttpStatus.OK);
 *     }
 *     ...
 * </code></pre>
 * <p>
 *
 * @author todorolev
 */
public class Language extends SetStringIgnoreCase {

    /**
     * Initializes a newly created {@code Language} object so that
     * it represents the same value as the argument.
     *
     * @param value A {@code String}.
     * @throws TypeValidationException if the validation fails.
     */
    public Language(String value) throws TypeValidationException {
        super(value);
    }

    /**
     * Returns a {@code Set} of all language codes.
     *
     * @return the {@code Set} of all language codes.
     */
    @Override
    protected Set<String> strings() {
        return Set.of("aa", "ab", "af", "am", "ar", "as", "ay", "az", "ba", "be", "bg", "bh", "bi", "bn", "bo", "br",
                "ca", "co", "cs", "cy", "da", "de", "dz", "el", "en", "eo", "es", "et", "eu", "fa", "fi", "fj", "fo",
                "fr", "fy", "ga", "gd", "gl", "gn", "gu", "ha", "hi", "he", "hr", "hu", "hy", "ia", "id", "ie", "ik",
                "in", "is", "it", "iu", "iw", "ja", "ji", "jw", "ka", "kk", "kl", "km", "kn", "ko", "ks", "ku", "ky",
                "la", "ln", "lo", "lt", "lv", "mg", "mi", "mk", "ml", "mn", "mo", "mr", "ms", "mt", "my", "na", "ne",
                "nl", "no", "oc", "om", "or", "pa", "pl", "ps", "pt", "qu", "rm", "rn", "ro", "ru", "rw", "sa", "sd",
                "sg", "sh", "si", "sk", "sl", "sm", "sn", "so", "sq", "sr", "ss", "st", "su", "sv", "sw", "ta", "te",
                "tg", "th", "ti", "tk", "tl", "tn", "to", "tr", "ts", "tt", "tw", "ug", "uk", "ur", "uz", "vi", "vo",
                "wo", "xh", "yi", "yo", "za", "zh", "zu");
    }
}
