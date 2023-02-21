package org.owasp.safetypes.types.string;

import org.owasp.safetypes.SafeType;
import org.owasp.safetypes.exception.TypeValidationException;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * The {@code IPAddress} class represents a special type of
 * {@code String}, containing a valid IP address.
 * <p>
 * Example:
 * <pre><code>
 *     //Spring REST example
 *     import org.owasp.safetypes.types.string.IPAddress;
 *     ...
 *     &#64;GetMapping("/ip")
 *     public ResponseEntity&lt;String&gt; ipaddress(@RequestParam IPAddress ipaddress) {
 *         return new ResponseEntity&lt;&gt;(ipaddress.get(), HttpStatus.OK);
 *     }
 *     ...
 * </code></pre>
 * <p>
 * The class {@code IPAddress} is used instead of {@code String} and,
 * in the same time, {@code IPAddress} is constructed in such a way,
 * that it allows only for IP addresses and it throws an exception
 * for everything else.
 *
 * @author todorolev
 */
public class IPAddress extends SafeType<String> {
    /**
     * Initializes a newly created {@code IPAddress} object
     * so that it represents the same value as the argument.
     * <p>
     * The {@code String} argument can be {@code null}.
     *
     * @param value A {@code String}.
     * @throws TypeValidationException if the validation fails.
     */
    public IPAddress(String value) throws TypeValidationException {
        super(value);
    }

    /**
     * Validates that the {@code String value} contains an IP address.
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
            InetAddress.getByName(value);
        } catch (UnknownHostException e) {
            throw new TypeValidationException();
        }
    }
}
