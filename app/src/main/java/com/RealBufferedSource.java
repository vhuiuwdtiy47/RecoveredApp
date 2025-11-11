package com;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import javax.annotation.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class RealBufferedSource implements BufferedSource {
    public final Buffer buffer = new Buffer();
    boolean closed;
    public final Source source;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RealBufferedSource(Source source) {
        if (source == null) {
            throw new NullPointerException("source == null");
        }
        this.source = source;
    }

    @Override // com.BufferedSource, com.BufferedSink
    public Buffer buffer() {
        return this.buffer;
    }

    @Override // com.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.closed) {
            return;
        }
        this.closed = true;
        this.source.close();
        this.buffer.clear();
    }

    @Override // com.BufferedSource
    public boolean exhausted() throws IOException {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        return this.buffer.exhausted() && this.source.read(this.buffer, 8192L) == -1;
    }

    @Override // com.BufferedSource
    public long indexOf(byte b2) throws IOException {
        return indexOf(b2, 0L, Long.MAX_VALUE);
    }

    @Override // com.BufferedSource
    public long indexOf(byte b2, long j2) throws IOException {
        return indexOf(b2, j2, Long.MAX_VALUE);
    }

    @Override // com.BufferedSource
    public long indexOf(byte b2, long j2, long j3) throws IOException {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        if (j2 < 0 || j3 < j2) {
            throw new IllegalArgumentException(String.format("fromIndex=%s toIndex=%s", Long.valueOf(j2), Long.valueOf(j3)));
        }
        long j4 = j2;
        while (j4 < j3) {
            long indexOf = this.buffer.indexOf(b2, j4, j3);
            if (indexOf != -1) {
                return indexOf;
            }
            long j5 = this.buffer.size;
            if (j5 >= j3 || this.source.read(this.buffer, 8192L) == -1) {
                return -1L;
            }
            j4 = Math.max(j4, j5);
        }
        return -1L;
    }

    @Override // com.BufferedSource
    public long indexOf(ByteString byteString) throws IOException {
        return indexOf(byteString, 0L);
    }

    @Override // com.BufferedSource
    public long indexOf(ByteString byteString, long j2) throws IOException {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            long indexOf = this.buffer.indexOf(byteString, j2);
            if (indexOf != -1) {
                return indexOf;
            }
            long j3 = this.buffer.size;
            if (this.source.read(this.buffer, 8192L) == -1) {
                return -1L;
            }
            j2 = Math.max(j2, (j3 - byteString.size()) + 1);
        }
    }

    @Override // com.BufferedSource
    public long indexOfElement(ByteString byteString) throws IOException {
        return indexOfElement(byteString, 0L);
    }

    @Override // com.BufferedSource
    public long indexOfElement(ByteString byteString, long j2) throws IOException {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            long indexOfElement = this.buffer.indexOfElement(byteString, j2);
            if (indexOfElement != -1) {
                return indexOfElement;
            }
            long j3 = this.buffer.size;
            if (this.source.read(this.buffer, 8192L) == -1) {
                return -1L;
            }
            j2 = Math.max(j2, j3);
        }
    }

    @Override // com.BufferedSource
    public InputStream inputStream() {
        return new InputStream() { // from class: com.RealBufferedSource.1
            @Override // java.io.InputStream
            public int available() throws IOException {
                if (RealBufferedSource.this.closed) {
                    throw new IOException("closed");
                }
                return (int) Math.min(RealBufferedSource.this.buffer.size, 2147483647L);
            }

            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                RealBufferedSource.this.close();
            }

            @Override // java.io.InputStream
            public int read() throws IOException {
                if (RealBufferedSource.this.closed) {
                    throw new IOException("closed");
                }
                if (RealBufferedSource.this.buffer.size == 0 && RealBufferedSource.this.source.read(RealBufferedSource.this.buffer, 8192L) == -1) {
                    return -1;
                }
                return RealBufferedSource.this.buffer.readByte() & 255;
            }

            @Override // java.io.InputStream
            public int read(byte[] bArr, int i, int i2) throws IOException {
                if (RealBufferedSource.this.closed) {
                    throw new IOException("closed");
                }
                Util.checkOffsetAndCount(bArr.length, i, i2);
                if (RealBufferedSource.this.buffer.size == 0 && RealBufferedSource.this.source.read(RealBufferedSource.this.buffer, 8192L) == -1) {
                    return -1;
                }
                return RealBufferedSource.this.buffer.read(bArr, i, i2);
            }

            public String toString() {
                return RealBufferedSource.this + ".inputStream()";
            }
        };
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.closed;
    }

    @Override // com.BufferedSource
    public boolean rangeEquals(long j2, ByteString byteString) throws IOException {
        return rangeEquals(j2, byteString, 0, byteString.size());
    }

    @Override // com.BufferedSource
    public boolean rangeEquals(long j2, ByteString byteString, int i, int i2) throws IOException {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        if (j2 < 0 || i < 0 || i2 < 0 || byteString.size() - i < i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            long j3 = i3 + j2;
            if (!request(1 + j3) || this.buffer.getByte(j3) != byteString.getByte(i + i3)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        if (this.buffer.size == 0 && this.source.read(this.buffer, 8192L) == -1) {
            return -1;
        }
        return this.buffer.read(byteBuffer);
    }

    @Override // com.BufferedSource
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // com.BufferedSource
    public int read(byte[] bArr, int i, int i2) throws IOException {
        Util.checkOffsetAndCount(bArr.length, i, i2);
        if (this.buffer.size == 0 && this.source.read(this.buffer, 8192L) == -1) {
            return -1;
        }
        return this.buffer.read(bArr, i, (int) Math.min(i2, this.buffer.size));
    }

    @Override // com.Source
    public long read(Buffer buffer, long j2) throws IOException {
        if (buffer == null) {
            throw new IllegalArgumentException("sink == null");
        }
        if (j2 < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j2);
        }
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        if (this.buffer.size == 0 && this.source.read(this.buffer, 8192L) == -1) {
            return -1L;
        }
        return this.buffer.read(buffer, Math.min(j2, this.buffer.size));
    }

    @Override // com.BufferedSource
    public long readAll(Sink sink) throws IOException {
        if (sink == null) {
            throw new IllegalArgumentException("sink == null");
        }
        long j2 = 0;
        while (this.source.read(this.buffer, 8192L) != -1) {
            long completeSegmentByteCount = this.buffer.completeSegmentByteCount();
            if (completeSegmentByteCount > 0) {
                j2 += completeSegmentByteCount;
                sink.write(this.buffer, completeSegmentByteCount);
            }
        }
        if (this.buffer.size() <= 0) {
            return j2;
        }
        long size = j2 + this.buffer.size();
        sink.write(this.buffer, this.buffer.size());
        return size;
    }

    @Override // com.BufferedSource
    public byte readByte() throws IOException {
        require(1L);
        return this.buffer.readByte();
    }

    @Override // com.BufferedSource
    public byte[] readByteArray() throws IOException {
        this.buffer.writeAll(this.source);
        return this.buffer.readByteArray();
    }

    @Override // com.BufferedSource
    public byte[] readByteArray(long j2) throws IOException {
        require(j2);
        return this.buffer.readByteArray(j2);
    }

    @Override // com.BufferedSource
    public ByteString readByteString() throws IOException {
        this.buffer.writeAll(this.source);
        return this.buffer.readByteString();
    }

    @Override // com.BufferedSource
    public ByteString readByteString(long j2) throws IOException {
        require(j2);
        return this.buffer.readByteString(j2);
    }

    @Override // com.BufferedSource
    public long readDecimalLong() throws IOException {
        require(1L);
        for (int i = 0; request(i + 1); i++) {
            byte b2 = this.buffer.getByte(i);
            if ((b2 < 48 || b2 > 57) && !(i == 0 && b2 == 45)) {
                if (i == 0) {
                    throw new NumberFormatException(String.format("Expected leading [0-9] or '-' character but was %#x", Byte.valueOf(b2)));
                }
                return this.buffer.readDecimalLong();
            }
        }
        return this.buffer.readDecimalLong();
    }

    @Override // com.BufferedSource
    public void readFully(Buffer buffer, long j2) throws IOException {
        try {
            require(j2);
            this.buffer.readFully(buffer, j2);
        } catch (EOFException e2) {
            buffer.writeAll(this.buffer);
            throw e2;
        }
    }

    @Override // com.BufferedSource
    public void readFully(byte[] bArr) throws IOException {
        try {
            require(bArr.length);
            this.buffer.readFully(bArr);
        } catch (EOFException e2) {
            int i = 0;
            while (this.buffer.size > 0) {
                int read = this.buffer.read(bArr, i, (int) this.buffer.size);
                if (read == -1) {
                    throw new AssertionError();
                }
                i += read;
            }
            throw e2;
        }
    }

    @Override // com.BufferedSource
    public long readHexadecimalUnsignedLong() throws IOException {
        require(1L);
        for (int i = 0; request(i + 1); i++) {
            byte b2 = this.buffer.getByte(i);
            if ((b2 < 48 || b2 > 57) && ((b2 < 97 || b2 > 102) && (b2 < 65 || b2 > 70))) {
                if (i == 0) {
                    throw new NumberFormatException(String.format("Expected leading [0-9a-fA-F] character but was %#x", Byte.valueOf(b2)));
                }
                return this.buffer.readHexadecimalUnsignedLong();
            }
        }
        return this.buffer.readHexadecimalUnsignedLong();
    }

    @Override // com.BufferedSource
    public int readInt() throws IOException {
        require(4L);
        return this.buffer.readInt();
    }

    @Override // com.BufferedSource
    public int readIntLe() throws IOException {
        require(4L);
        return this.buffer.readIntLe();
    }

    @Override // com.BufferedSource
    public long readLong() throws IOException {
        require(8L);
        return this.buffer.readLong();
    }

    @Override // com.BufferedSource
    public long readLongLe() throws IOException {
        require(8L);
        return this.buffer.readLongLe();
    }

    @Override // com.BufferedSource
    public short readShort() throws IOException {
        require(2L);
        return this.buffer.readShort();
    }

    @Override // com.BufferedSource
    public short readShortLe() throws IOException {
        require(2L);
        return this.buffer.readShortLe();
    }

    @Override // com.BufferedSource
    public String readString(long j2, Charset charset) throws IOException {
        require(j2);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        return this.buffer.readString(j2, charset);
    }

    @Override // com.BufferedSource
    public String readString(Charset charset) throws IOException {
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        this.buffer.writeAll(this.source);
        return this.buffer.readString(charset);
    }

    @Override // com.BufferedSource
    public String readUtf8() throws IOException {
        this.buffer.writeAll(this.source);
        return this.buffer.readUtf8();
    }

    @Override // com.BufferedSource
    public String readUtf8(long j2) throws IOException {
        require(j2);
        return this.buffer.readUtf8(j2);
    }

    @Override // com.BufferedSource
    public int readUtf8CodePoint() throws IOException {
        require(1L);
        byte b2 = this.buffer.getByte(0L);
        if ((b2 & 224) == 192) {
            require(2L);
        } else if ((b2 & 240) == 224) {
            require(3L);
        } else if ((b2 & 248) == 240) {
            require(4L);
        }
        return this.buffer.readUtf8CodePoint();
    }

    @Override // com.BufferedSource
    @Nullable
    public String readUtf8Line() throws IOException {
        long indexOf = indexOf((byte) 10);
        if (indexOf != -1) {
            return this.buffer.readUtf8Line(indexOf);
        }
        if (this.buffer.size != 0) {
            return readUtf8(this.buffer.size);
        }
        return null;
    }

    @Override // com.BufferedSource
    public String readUtf8LineStrict() throws IOException {
        return readUtf8LineStrict(Long.MAX_VALUE);
    }

    @Override // com.BufferedSource
    public String readUtf8LineStrict(long j2) throws IOException {
        if (j2 < 0) {
            throw new IllegalArgumentException("limit < 0: " + j2);
        }
        long j3 = j2 == Long.MAX_VALUE ? Long.MAX_VALUE : j2 + 1;
        long indexOf = indexOf((byte) 10, 0L, j3);
        if (indexOf != -1) {
            return this.buffer.readUtf8Line(indexOf);
        }
        if (j3 < Long.MAX_VALUE && request(j3) && this.buffer.getByte(j3 - 1) == 13 && request(1 + j3) && this.buffer.getByte(j3) == 10) {
            return this.buffer.readUtf8Line(j3);
        }
        Buffer buffer = new Buffer();
        this.buffer.copyTo(buffer, 0L, Math.min(32L, this.buffer.size()));
        throw new EOFException("\\n not found: limit=" + Math.min(this.buffer.size(), j2) + " content=" + buffer.readByteString().hex() + (char) 8230);
    }

    @Override // com.BufferedSource
    public boolean request(long j2) throws IOException {
        if (j2 < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j2);
        }
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        while (this.buffer.size < j2) {
            if (this.source.read(this.buffer, 8192L) == -1) {
                return false;
            }
        }
        return true;
    }

    @Override // com.BufferedSource
    public void require(long j2) throws IOException {
        if (!request(j2)) {
            throw new EOFException();
        }
    }

    @Override // com.BufferedSource
    public int select(Options options) throws IOException {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        do {
            int selectPrefix = this.buffer.selectPrefix(options);
            if (selectPrefix == -1) {
                return -1;
            }
            int size = options.byteStrings[selectPrefix].size();
            if (size <= this.buffer.size) {
                this.buffer.skip(size);
                return selectPrefix;
            }
        } while (this.source.read(this.buffer, 8192L) != -1);
        return -1;
    }

    @Override // com.BufferedSource
    public void skip(long j2) throws IOException {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        while (j2 > 0) {
            if (this.buffer.size == 0 && this.source.read(this.buffer, 8192L) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j2, this.buffer.size());
            this.buffer.skip(min);
            j2 -= min;
        }
    }

    @Override // com.Source
    public Timeout timeout() {
        return this.source.timeout();
    }

    public String toString() {
        return "buffer(" + this.source + ")";
    }
}
