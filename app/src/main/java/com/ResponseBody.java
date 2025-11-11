package com;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public abstract class ResponseBody implements Closeable {
    private Reader reader;

    /* loaded from: classes.dex */
    static final class BomAwareReader extends Reader {
        private final Charset charset;
        private boolean closed;
        private Reader delegate;
        private final BufferedSource source;

        BomAwareReader(BufferedSource bufferedSource, Charset charset) {
            this.source = bufferedSource;
            this.charset = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.closed = true;
            if (this.delegate != null) {
                this.delegate.close();
            } else {
                this.source.close();
            }
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i, int i2) throws IOException {
            if (this.closed) {
                throw new IOException("Stream closed");
            }
            Reader reader = this.delegate;
            if (reader == null) {
                reader = new InputStreamReader(this.source.inputStream(), com.tencent.Util.bomAwareCharset(this.source, this.charset));
                this.delegate = reader;
            }
            return reader.read(cArr, i, i2);
        }
    }

    private Charset charset() {
        MediaType contentType = contentType();
        return contentType != null ? contentType.charset(com.tencent.Util.UTF_8) : com.tencent.Util.UTF_8;
    }

    public static ResponseBody create(final MediaType mediaType, final long j2, final BufferedSource bufferedSource) {
        if (bufferedSource == null) {
            throw new NullPointerException("source == null");
        }
        return new ResponseBody() { // from class: com.ResponseBody.1
            @Override // com.ResponseBody
            public long contentLength() {
                return j2;
            }

            @Override // com.ResponseBody
            public MediaType contentType() {
                return MediaType.this;
            }

            @Override // com.ResponseBody
            public BufferedSource source() {
                return bufferedSource;
            }
        };
    }

    public static ResponseBody create(MediaType mediaType, String str) {
        Charset charset = com.tencent.Util.UTF_8;
        if (mediaType != null && (charset = mediaType.charset()) == null) {
            charset = com.tencent.Util.UTF_8;
            mediaType = MediaType.parse(mediaType + "; charset=utf-8");
        }
        Buffer writeString = new Buffer().writeString(str, charset);
        return create(mediaType, writeString.size(), writeString);
    }

    public static ResponseBody create(MediaType mediaType, byte[] bArr) {
        return create(mediaType, bArr.length, new Buffer().write(bArr));
    }

    public final InputStream byteStream() {
        return source().inputStream();
    }

    public final byte[] bytes() throws IOException {
        long contentLength = contentLength();
        if (contentLength > 2147483647L) {
            throw new IOException("Cannot buffer entire body for content length: " + contentLength);
        }
        BufferedSource source = source();
        try {
            byte[] readByteArray = source.readByteArray();
            com.tencent.Util.closeQuietly(source);
            if (contentLength == -1 || contentLength == readByteArray.length) {
                return readByteArray;
            }
            throw new IOException("Content-Length (" + contentLength + ") and stream length (" + readByteArray.length + ") disagree");
        } catch (Throwable th) {
            com.tencent.Util.closeQuietly(source);
            throw th;
        }
    }

    public final Reader charStream() {
        Reader reader = this.reader;
        if (reader != null) {
            return reader;
        }
        BomAwareReader bomAwareReader = new BomAwareReader(source(), charset());
        this.reader = bomAwareReader;
        return bomAwareReader;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        com.tencent.Util.closeQuietly(source());
    }

    public abstract long contentLength();

    public abstract MediaType contentType();

    public abstract BufferedSource source();

    public final String string() throws IOException {
        BufferedSource source = source();
        try {
            return source.readString(com.tencent.Util.bomAwareCharset(source, charset()));
        } finally {
            com.tencent.Util.closeQuietly(source);
        }
    }
}
