package org.owasp.safetypes.types.string.symbols.alphabet;

import org.owasp.safetypes.exception.TypeValidationException;
import org.owasp.safetypes.types.string.AbstractSafeEnumChar;

import java.util.Set;

public class Bulgarian extends AbstractSafeEnumChar {

    protected Bulgarian(String value) throws TypeValidationException {
        super(value);
    }

    @Override
    protected Set<Character> setChars() {
        return Set.of('А', 'а', 'Б', 'б', 'В', 'в', 'Г', 'г', 'Д', 'д', 'Е', 'е', 'Ж', 'ж', 'З', 'з', 'И', 'и', 'Й', 'й',
                'К', 'к', 'Л', 'л', 'М', 'м', 'Н', 'н', 'О', 'о', 'П', 'п', 'Р', 'р', 'С', 'с', 'Т', 'т', 'У', 'у', 'Ф',
                'ф', 'Х', 'х', 'Ц', 'ц', 'Ч', 'ч', 'Ш', 'ш', 'Щ', 'щ', 'Ъ', 'ъ', 'ь', 'Ю', 'ю', 'Я', 'я');
    }
}
