package org.owasp.safetypes.types.string;

import org.owasp.safetypes.AbstractSafeDataType;
import org.owasp.safetypes.exception.TypeValidationException;

import java.util.UUID;

/**
 * The {@code UUIDString} class represents a special type of
 * {@code String}, containing only UUIDs.
 * <p>
 * Example:
 * <pre><code>
 *     //Spring REST example
 *     import org.owasp.safetypes.types.string.UUIDString;
 *     ...
 *     &#64;GetMapping("/uuid")
 *     public ResponseEntity&lt;String&gt; uuid(@RequestParam UUIDString uuid) {
 *         return new ResponseEntity&lt;&gt;(uuid.get(), HttpStatus.OK);
 *     }
 *     ...
 * </code></pre>
 * <p>
 * The class {@code UUIDString} is used instead of {@code String}
 * and in the same time {@code UUIDString} is constructed in such
 * a way, that it allows only for UUID values, e.g. "5c87e45e-1327-11ed-861d-0242ac120002",
 * and it throws an exception for everything else, e.g. "5c87e45e-1327-11ed-861d0242ac120002".
 *
 * @author todorolev
 */
public class UUIDString extends AbstractSafeDataType<String> {

    /**
     * Initializes a newly created {@code UUIDString} object so that it
     * represents the same value as the argument.
     *
     * @param value A {@code String}.
     * @throws TypeValidationException if the validation fails.
     */
    public UUIDString(String value) throws TypeValidationException {
        super(value);
    }

    /**
     * Validates that the {@code String value} contains UUID.
     * <p>
     * The {@code String value} can be {@code null}.
     *
     * @param value A {@code String}.
     * @throws TypeValidationException if the validation fails.
     */
    @Override
    protected void accept(String value) throws TypeValidationException {
        if(value == null)
            return;

        try {
            UUID.fromString(value);
        } catch (IllegalArgumentException e) {
            throw new TypeValidationException();
        }
    }
}
