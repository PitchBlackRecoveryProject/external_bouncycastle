/* GENERATED SOURCE. DO NOT MODIFY. */
package com.android.org.bouncycastle.asn1;

import java.io.IOException;

/**
 * A NULL object.
 */
public class DERNull
    extends ASN1Null
{
    public static final DERNull INSTANCE = new DERNull();

    private static final byte[]  zeroBytes = new byte[0];

    /**
     * @deprecated use DERNull.INSTANCE
     */
    // Android-changed: Reduce visibility to protected.
    protected DERNull()
    {
    }

    boolean isConstructed()
    {
        return false;
    }

    int encodedLength()
    {
        return 2;
    }

    void encode(
        ASN1OutputStream out)
        throws IOException
    {
        out.writeEncoded(BERTags.NULL, zeroBytes);
    }
}
