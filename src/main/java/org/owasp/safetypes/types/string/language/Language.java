package org.owasp.safetypes.types.string.language;

import org.owasp.safetypes.exception.TypeValidationException;
import org.owasp.safetypes.types.string.AbstractSafeEnumStringIgnoreCase;

import java.util.Set;

public class Language extends AbstractSafeEnumStringIgnoreCase {

    protected Language(String value) throws TypeValidationException {
        super(value);
    }

    @Override
    protected Set<String> setStrings() {
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
