package com;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public abstract class RequestBody {
    public static RequestBody create(final MediaType mediaType, final ByteString byteString) {
        return new RequestBody() { // from class: com.RequestBody.1
            @Override // com.RequestBody
            public long contentLength() throws IOException {
                return byteString.size();
            }

            @Override // com.RequestBody
            public MediaType contentType() {
                return MediaType.this;
            }

            @Override // com.RequestBody
            public void writeTo(BufferedSink bufferedSink) throws IOException {
                bufferedSink.write(byteString);
            }
        };
    }

    public static RequestBody create(final MediaType mediaType, final File file) {
        if (file == null) {
            throw new NullPointerException("content == null");
        }
        return new RequestBody() { // from class: com.RequestBody.3
            @Override // com.RequestBody
            public long contentLength() {
                return file.length();
            }

            @Override // com.RequestBody
            public MediaType contentType() {
                return MediaType.this;
            }

            @Override // com.RequestBody
            public void writeTo(BufferedSink bufferedSink) throws IOException {
                Source source = null;
                try {
                    source = Okio.source(file);
                    bufferedSink.writeAll(source);
                } finally {
                    com.tencent.Util.closeQuietly(source);
                }
            }
        };
    }

    public static RequestBody create(MediaType mediaType, String str) {
        Charset charset = com.tencent.Util.UTF_8;
        if (mediaType != null && (charset = mediaType.charset()) == null) {
            charset = com.tencent.Util.UTF_8;
            mediaType = MediaType.parse(mediaType + "; charset=utf-8");
        }
        return create(mediaType, str.getBytes(charset));
    }

    public static RequestBody create(MediaType mediaType, byte[] bArr) {
        return create(mediaType, bArr, 0, bArr.length);
    }

    public static RequestBody create(final MediaType mediaType, final byte[] bArr, final int i, final int i2) {
        if (bArr == null) {
            throw new NullPointerException("content == null");
        }
        com.tencent.Util.checkOffsetAndCount(bArr.length, i, i2);
        return new RequestBody() { // from class: com.RequestBody.2
            @Override // com.RequestBody
            public long contentLength() {
                return i2;
            }

            @Override // com.RequestBody
            public MediaType contentType() {
                return MediaType.this;
            }

            @Override // com.RequestBody
            public void writeTo(BufferedSink bufferedSink) throws IOException {
                bufferedSink.write(bArr, i, i2);
            }
        };
    }

    public long contentLength() throws IOException {
        return -1L;
    }

    public abstract MediaType contentType();

    public abstract void writeTo(BufferedSink bufferedSink) throws IOException;
}
