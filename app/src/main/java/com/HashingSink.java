package com;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.annotation.Nullable;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class HashingSink extends ForwardingSink {

    @Nullable
    private final Mac mac;

    @Nullable
    private final MessageDigest messageDigest;

    private HashingSink(Sink sink, ByteString byteString, String str) {
        super(sink);
        try {
            this.mac = Mac.getInstance(str);
            this.mac.init(new SecretKeySpec(byteString.toByteArray(), str));
            this.messageDigest = null;
        } catch (InvalidKeyException e2) {
            throw new IllegalArgumentException(e2);
        } catch (NoSuchAlgorithmException e3) {
            throw new AssertionError();
        }
    }

    private HashingSink(Sink sink, String str) {
        super(sink);
        try {
            this.messageDigest = MessageDigest.getInstance(str);
            this.mac = null;
        } catch (NoSuchAlgorithmException e2) {
            throw new AssertionError();
        }
    }

    public static HashingSink hmacSha1(Sink sink, ByteString byteString) {
        return new HashingSink(sink, byteString, "HmacSHA1");
    }

    public static HashingSink hmacSha256(Sink sink, ByteString byteString) {
        return new HashingSink(sink, byteString, "HmacSHA256");
    }

    public static HashingSink hmacSha512(Sink sink, ByteString byteString) {
        return new HashingSink(sink, byteString, "HmacSHA512");
    }

    public static HashingSink md5(Sink sink) {
        return new HashingSink(sink, "MD5");
    }

    public static HashingSink sha1(Sink sink) {
        return new HashingSink(sink, "SHA-1");
    }

    public static HashingSink sha256(Sink sink) {
        return new HashingSink(sink, "SHA-256");
    }

    public static HashingSink sha512(Sink sink) {
        return new HashingSink(sink, "SHA-512");
    }

    public final ByteString hash() {
        return ByteString.of(this.messageDigest != null ? this.messageDigest.digest() : this.mac.doFinal());
    }

    @Override // com.ForwardingSink, com.Sink
    public void write(Buffer buffer, long j2) throws IOException {
        long j3 = 0;
        Util.checkOffsetAndCount(buffer.size, 0L, j2);
        Segment segment = buffer.head;
        while (j3 < j2) {
            int min = (int) Math.min(j2 - j3, segment.limit - segment.pos);
            if (this.messageDigest != null) {
                this.messageDigest.update(segment.data, segment.pos, min);
            } else {
                this.mac.update(segment.data, segment.pos, min);
            }
            j3 += min;
            segment = segment.next;
        }
        super.write(buffer, j2);
    }
}
