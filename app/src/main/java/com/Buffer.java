package com;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class Buffer implements BufferedSource, BufferedSink, Cloneable, ByteChannel {
    private static final byte[] DIGITS = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
    static final int REPLACEMENT_CHARACTER = 65533;

    @Nullable
    Segment head;
    long size;

    /* loaded from: classes.dex */
    public static final class UnsafeCursor implements Closeable {
        public Buffer buffer;
        public byte[] data;
        public boolean readWrite;
        private Segment segment;
        public long offset = -1;
        public int start = -1;
        public int end = -1;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.buffer == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            this.buffer = null;
            this.segment = null;
            this.offset = -1L;
            this.data = null;
            this.start = -1;
            this.end = -1;
        }

        public final long expandBuffer(int i) {
            if (i <= 0) {
                throw new IllegalArgumentException("minByteCount <= 0: " + i);
            }
            if (i > 8192) {
                throw new IllegalArgumentException("minByteCount > Segment.SIZE: " + i);
            }
            if (this.buffer == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (!this.readWrite) {
                throw new IllegalStateException("expandBuffer() only permitted for read/write buffers");
            }
            long j2 = this.buffer.size;
            Segment writableSegment = this.buffer.writableSegment(i);
            int i2 = 8192 - writableSegment.limit;
            writableSegment.limit = 8192;
            this.buffer.size = i2 + j2;
            this.segment = writableSegment;
            this.offset = j2;
            this.data = writableSegment.data;
            this.start = 8192 - i2;
            this.end = 8192;
            return i2;
        }

        public final int next() {
            if (this.offset == this.buffer.size) {
                throw new IllegalStateException();
            }
            return this.offset == -1 ? seek(0L) : seek(this.offset + (this.end - this.start));
        }

        public final long resizeBuffer(long j2) {
            if (this.buffer == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (!this.readWrite) {
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers");
            }
            long j3 = this.buffer.size;
            if (j2 <= j3) {
                if (j2 < 0) {
                    throw new IllegalArgumentException("newSize < 0: " + j2);
                }
                long j4 = j3 - j2;
                while (true) {
                    if (j4 <= 0) {
                        break;
                    }
                    Segment segment = this.buffer.head.prev;
                    int i = segment.limit - segment.pos;
                    if (i > j4) {
                        segment.limit = (int) (segment.limit - j4);
                        break;
                    }
                    this.buffer.head = segment.pop();
                    SegmentPool.recycle(segment);
                    j4 -= i;
                }
                this.segment = null;
                this.offset = j2;
                this.data = null;
                this.start = -1;
                this.end = -1;
            } else if (j2 > j3) {
                boolean z2 = true;
                long j5 = j2 - j3;
                while (j5 > 0) {
                    Segment writableSegment = this.buffer.writableSegment(1);
                    int min = (int) Math.min(j5, 8192 - writableSegment.limit);
                    writableSegment.limit += min;
                    j5 -= min;
                    if (z2) {
                        this.segment = writableSegment;
                        this.offset = j3;
                        this.data = writableSegment.data;
                        this.start = writableSegment.limit - min;
                        this.end = writableSegment.limit;
                        z2 = false;
                    }
                }
            }
            this.buffer.size = j2;
            return j3;
        }

        public final int seek(long j2) {
            long j3;
            long j4;
            if (j2 < -1 || j2 > this.buffer.size) {
                throw new ArrayIndexOutOfBoundsException(String.format("offset=%s > size=%s", Long.valueOf(j2), Long.valueOf(this.buffer.size)));
            }
            if (j2 == -1 || j2 == this.buffer.size) {
                this.segment = null;
                this.offset = j2;
                this.data = null;
                this.start = -1;
                this.end = -1;
                return -1;
            }
            long j5 = this.buffer.size;
            Segment segment = this.buffer.head;
            Segment segment2 = this.buffer.head;
            if (this.segment != null) {
                j3 = this.offset - (this.start - this.segment.pos);
                if (j3 > j2) {
                    segment2 = this.segment;
                    j4 = 0;
                } else {
                    segment = this.segment;
                    j4 = j3;
                    j3 = j5;
                }
            } else {
                j3 = j5;
                j4 = 0;
            }
            if (j3 - j2 > j2 - j4) {
                while (j2 >= (segment.limit - segment.pos) + j4) {
                    j4 += segment.limit - segment.pos;
                    segment = segment.next;
                }
            } else {
                j4 = j3;
                segment = segment2;
                while (j4 > j2) {
                    segment = segment.prev;
                    j4 -= segment.limit - segment.pos;
                }
            }
            if (this.readWrite && segment.shared) {
                Segment unsharedCopy = segment.unsharedCopy();
                if (this.buffer.head == segment) {
                    this.buffer.head = unsharedCopy;
                }
                segment = segment.push(unsharedCopy);
                segment.prev.pop();
            }
            this.segment = segment;
            this.offset = j2;
            this.data = segment.data;
            this.start = ((int) (j2 - j4)) + segment.pos;
            this.end = segment.limit;
            return this.end - this.start;
        }
    }

    private ByteString digest(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            if (this.head != null) {
                messageDigest.update(this.head.data, this.head.pos, this.head.limit - this.head.pos);
                for (Segment segment = this.head.next; segment != this.head; segment = segment.next) {
                    messageDigest.update(segment.data, segment.pos, segment.limit - segment.pos);
                }
            }
            return ByteString.of(messageDigest.digest());
        } catch (NoSuchAlgorithmException e2) {
            throw new AssertionError();
        }
    }

    private ByteString hmac(String str, ByteString byteString) {
        try {
            Mac mac = Mac.getInstance(str);
            mac.init(new SecretKeySpec(byteString.toByteArray(), str));
            if (this.head != null) {
                mac.update(this.head.data, this.head.pos, this.head.limit - this.head.pos);
                for (Segment segment = this.head.next; segment != this.head; segment = segment.next) {
                    mac.update(segment.data, segment.pos, segment.limit - segment.pos);
                }
            }
            return ByteString.of(mac.doFinal());
        } catch (InvalidKeyException e2) {
            throw new IllegalArgumentException(e2);
        } catch (NoSuchAlgorithmException e3) {
            throw new AssertionError();
        }
    }

    private boolean rangeEquals(Segment segment, int i, ByteString byteString, int i2, int i3) {
        int i4 = segment.limit;
        byte[] bArr = segment.data;
        int i5 = i;
        Segment segment2 = segment;
        while (i2 < i3) {
            if (i5 == i4) {
                segment2 = segment2.next;
                bArr = segment2.data;
                i5 = segment2.pos;
                i4 = segment2.limit;
            }
            if (bArr[i5] != byteString.getByte(i2)) {
                return false;
            }
            i5++;
            i2++;
        }
        return true;
    }

    private void readFrom(InputStream inputStream, long j2, boolean z2) throws IOException {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        }
        while (true) {
            if (j2 <= 0 && !z2) {
                return;
            }
            Segment writableSegment = writableSegment(1);
            int read = inputStream.read(writableSegment.data, writableSegment.limit, (int) Math.min(j2, 8192 - writableSegment.limit));
            if (read == -1) {
                if (!z2) {
                    throw new EOFException();
                }
                return;
            } else {
                writableSegment.limit += read;
                this.size += read;
                j2 -= read;
            }
        }
    }

    @Override // com.BufferedSource, com.BufferedSink
    public Buffer buffer() {
        return this;
    }

    public final void clear() {
        try {
            skip(this.size);
        } catch (EOFException e2) {
            throw new AssertionError(e2);
        }
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public Buffer m0clone() {
        Buffer buffer = new Buffer();
        if (this.size == 0) {
            return buffer;
        }
        buffer.head = this.head.sharedCopy();
        Segment segment = buffer.head;
        Segment segment2 = buffer.head;
        Segment segment3 = buffer.head;
        segment2.prev = segment3;
        segment.next = segment3;
        for (Segment segment4 = this.head.next; segment4 != this.head; segment4 = segment4.next) {
            buffer.head.prev.push(segment4.sharedCopy());
        }
        buffer.size = this.size;
        return buffer;
    }

    @Override // com.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public final long completeSegmentByteCount() {
        long j2 = this.size;
        if (j2 == 0) {
            return 0L;
        }
        Segment segment = this.head.prev;
        return (segment.limit >= 8192 || !segment.owner) ? j2 : j2 - (segment.limit - segment.pos);
    }

    public final Buffer copyTo(Buffer buffer, long j2, long j3) {
        if (buffer == null) {
            throw new IllegalArgumentException("out == null");
        }
        Util.checkOffsetAndCount(this.size, j2, j3);
        if (j3 != 0) {
            buffer.size += j3;
            Segment segment = this.head;
            while (j2 >= segment.limit - segment.pos) {
                j2 -= segment.limit - segment.pos;
                segment = segment.next;
            }
            while (j3 > 0) {
                Segment sharedCopy = segment.sharedCopy();
                sharedCopy.pos = (int) (sharedCopy.pos + j2);
                sharedCopy.limit = Math.min(sharedCopy.pos + ((int) j3), sharedCopy.limit);
                if (buffer.head == null) {
                    sharedCopy.prev = sharedCopy;
                    sharedCopy.next = sharedCopy;
                    buffer.head = sharedCopy;
                } else {
                    buffer.head.prev.push(sharedCopy);
                }
                j3 -= sharedCopy.limit - sharedCopy.pos;
                segment = segment.next;
                j2 = 0;
            }
        }
        return this;
    }

    public final Buffer copyTo(OutputStream outputStream) throws IOException {
        return copyTo(outputStream, 0L, this.size);
    }

    public final Buffer copyTo(OutputStream outputStream, long j2, long j3) throws IOException {
        if (outputStream == null) {
            throw new IllegalArgumentException("out == null");
        }
        Util.checkOffsetAndCount(this.size, j2, j3);
        if (j3 != 0) {
            Segment segment = this.head;
            while (j2 >= segment.limit - segment.pos) {
                j2 -= segment.limit - segment.pos;
                segment = segment.next;
            }
            while (j3 > 0) {
                int min = (int) Math.min(segment.limit - r1, j3);
                outputStream.write(segment.data, (int) (segment.pos + j2), min);
                j3 -= min;
                segment = segment.next;
                j2 = 0;
            }
        }
        return this;
    }

    @Override // com.BufferedSink
    public BufferedSink emit() {
        return this;
    }

    @Override // com.BufferedSink
    public Buffer emitCompleteSegments() {
        return this;
    }

    public boolean equals(Object obj) {
        long j2 = 0;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Buffer)) {
            return false;
        }
        Buffer buffer = (Buffer) obj;
        if (this.size != buffer.size) {
            return false;
        }
        if (this.size == 0) {
            return true;
        }
        Segment segment = this.head;
        Segment segment2 = buffer.head;
        int i = segment.pos;
        int i2 = segment2.pos;
        while (j2 < this.size) {
            long min = Math.min(segment.limit - i, segment2.limit - i2);
            int i3 = 0;
            while (i3 < min) {
                int i4 = i + 1;
                byte b2 = segment.data[i];
                int i5 = i2 + 1;
                if (b2 != segment2.data[i2]) {
                    return false;
                }
                i3++;
                i2 = i5;
                i = i4;
            }
            if (i == segment.limit) {
                segment = segment.next;
                i = segment.pos;
            }
            if (i2 == segment2.limit) {
                segment2 = segment2.next;
                i2 = segment2.pos;
            }
            j2 += min;
        }
        return true;
    }

    @Override // com.BufferedSource
    public boolean exhausted() {
        return this.size == 0;
    }

    @Override // com.BufferedSink, com.Sink, java.io.Flushable
    public void flush() {
    }

    public final byte getByte(long j2) {
        Util.checkOffsetAndCount(this.size, j2, 1L);
        if (this.size - j2 > j2) {
            Segment segment = this.head;
            while (true) {
                int i = segment.limit - segment.pos;
                if (j2 < i) {
                    return segment.data[segment.pos + ((int) j2)];
                }
                j2 -= i;
                segment = segment.next;
            }
        } else {
            long j3 = j2 - this.size;
            Segment segment2 = this.head.prev;
            while (true) {
                j3 += segment2.limit - segment2.pos;
                if (j3 >= 0) {
                    return segment2.data[segment2.pos + ((int) j3)];
                }
                segment2 = segment2.prev;
            }
        }
    }

    public int hashCode() {
        Segment segment = this.head;
        if (segment == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = segment.pos;
            int i3 = segment.limit;
            while (i2 < i3) {
                int i4 = segment.data[i2] + (i * 31);
                i2++;
                i = i4;
            }
            segment = segment.next;
        } while (segment != this.head);
        return i;
    }

    public final ByteString hmacSha1(ByteString byteString) {
        return hmac("HmacSHA1", byteString);
    }

    public final ByteString hmacSha256(ByteString byteString) {
        return hmac("HmacSHA256", byteString);
    }

    public final ByteString hmacSha512(ByteString byteString) {
        return hmac("HmacSHA512", byteString);
    }

    @Override // com.BufferedSource
    public long indexOf(byte b2) {
        return indexOf(b2, 0L, Long.MAX_VALUE);
    }

    @Override // com.BufferedSource
    public long indexOf(byte b2, long j2) {
        return indexOf(b2, j2, Long.MAX_VALUE);
    }

    @Override // com.BufferedSource
    public long indexOf(byte b2, long j2, long j3) {
        Segment segment;
        long j4;
        Segment segment2;
        if (j2 < 0 || j3 < j2) {
            throw new IllegalArgumentException(String.format("size=%s fromIndex=%s toIndex=%s", Long.valueOf(this.size), Long.valueOf(j2), Long.valueOf(j3)));
        }
        if (j3 > this.size) {
            j3 = this.size;
        }
        if (j2 == j3 || (segment = this.head) == null) {
            return -1L;
        }
        if (this.size - j2 >= j2) {
            j4 = 0;
            segment2 = segment;
            while (true) {
                long j5 = (segment2.limit - segment2.pos) + j4;
                if (j5 >= j2) {
                    break;
                }
                segment2 = segment2.next;
                j4 = j5;
            }
        } else {
            j4 = this.size;
            segment2 = segment;
            while (j4 > j2) {
                segment2 = segment2.prev;
                j4 -= segment2.limit - segment2.pos;
            }
        }
        long j6 = j4;
        while (j6 < j3) {
            byte[] bArr = segment2.data;
            int min = (int) Math.min(segment2.limit, (segment2.pos + j3) - j6);
            for (int i = (int) ((segment2.pos + j2) - j6); i < min; i++) {
                if (bArr[i] == b2) {
                    return (i - segment2.pos) + j6;
                }
            }
            long j7 = j6 + (segment2.limit - segment2.pos);
            segment2 = segment2.next;
            j2 = j7;
            j6 = j7;
        }
        return -1L;
    }

    @Override // com.BufferedSource
    public long indexOf(ByteString byteString) throws IOException {
        return indexOf(byteString, 0L);
    }

    @Override // com.BufferedSource
    public long indexOf(ByteString byteString, long j2) throws IOException {
        long j3;
        Segment segment;
        if (byteString.size() == 0) {
            throw new IllegalArgumentException("bytes is empty");
        }
        if (j2 < 0) {
            throw new IllegalArgumentException("fromIndex < 0");
        }
        Segment segment2 = this.head;
        if (segment2 == null) {
            return -1L;
        }
        if (this.size - j2 >= j2) {
            j3 = 0;
            segment = segment2;
            while (true) {
                long j4 = (segment.limit - segment.pos) + j3;
                if (j4 >= j2) {
                    break;
                }
                segment = segment.next;
                j3 = j4;
            }
        } else {
            j3 = this.size;
            segment = segment2;
            while (j3 > j2) {
                segment = segment.prev;
                j3 -= segment.limit - segment.pos;
            }
        }
        byte b2 = byteString.getByte(0);
        int size = byteString.size();
        long j5 = (this.size - size) + 1;
        long j6 = j3;
        Segment segment3 = segment;
        while (j6 < j5) {
            byte[] bArr = segment3.data;
            int min = (int) Math.min(segment3.limit, (segment3.pos + j5) - j6);
            for (int i = (int) ((segment3.pos + j2) - j6); i < min; i++) {
                if (bArr[i] == b2 && rangeEquals(segment3, i + 1, byteString, 1, size)) {
                    return (i - segment3.pos) + j6;
                }
            }
            long j7 = (segment3.limit - segment3.pos) + j6;
            segment3 = segment3.next;
            j6 = j7;
            j2 = j7;
        }
        return -1L;
    }

    @Override // com.BufferedSource
    public long indexOfElement(ByteString byteString) {
        return indexOfElement(byteString, 0L);
    }

    @Override // com.BufferedSource
    public long indexOfElement(ByteString byteString, long j2) {
        long j3;
        Segment segment;
        if (j2 < 0) {
            throw new IllegalArgumentException("fromIndex < 0");
        }
        Segment segment2 = this.head;
        if (segment2 == null) {
            return -1L;
        }
        if (this.size - j2 >= j2) {
            j3 = 0;
            segment = segment2;
            while (true) {
                long j4 = (segment.limit - segment.pos) + j3;
                if (j4 >= j2) {
                    break;
                }
                segment = segment.next;
                j3 = j4;
            }
        } else {
            j3 = this.size;
            segment = segment2;
            while (j3 > j2) {
                segment = segment.prev;
                j3 -= segment.limit - segment.pos;
            }
        }
        if (byteString.size() == 2) {
            byte b2 = byteString.getByte(0);
            byte b3 = byteString.getByte(1);
            while (j3 < this.size) {
                byte[] bArr = segment.data;
                int i = segment.limit;
                for (int i2 = (int) ((segment.pos + j2) - j3); i2 < i; i2++) {
                    byte b4 = bArr[i2];
                    if (b4 == b2 || b4 == b3) {
                        return j3 + (i2 - segment.pos);
                    }
                }
                j3 += segment.limit - segment.pos;
                segment = segment.next;
                j2 = j3;
            }
        } else {
            byte[] internalArray = byteString.internalArray();
            while (j3 < this.size) {
                byte[] bArr2 = segment.data;
                int i3 = segment.limit;
                for (int i4 = (int) ((segment.pos + j2) - j3); i4 < i3; i4++) {
                    byte b5 = bArr2[i4];
                    for (byte b6 : internalArray) {
                        if (b5 == b6) {
                            return j3 + (i4 - segment.pos);
                        }
                    }
                }
                j3 += segment.limit - segment.pos;
                segment = segment.next;
                j2 = j3;
            }
        }
        return -1L;
    }

    @Override // com.BufferedSource
    public InputStream inputStream() {
        return new InputStream() { // from class: com.Buffer.2
            @Override // java.io.InputStream
            public int available() {
                return (int) Math.min(Buffer.this.size, 2147483647L);
            }

            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            @Override // java.io.InputStream
            public int read() {
                if (Buffer.this.size > 0) {
                    return Buffer.this.readByte() & 255;
                }
                return -1;
            }

            @Override // java.io.InputStream
            public int read(byte[] bArr, int i, int i2) {
                return Buffer.this.read(bArr, i, i2);
            }

            public String toString() {
                return Buffer.this + ".inputStream()";
            }
        };
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    public final ByteString md5() {
        return digest("MD5");
    }

    @Override // com.BufferedSink
    public OutputStream outputStream() {
        return new OutputStream() { // from class: com.Buffer.1
            @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            @Override // java.io.OutputStream, java.io.Flushable
            public void flush() {
            }

            public String toString() {
                return Buffer.this + ".outputStream()";
            }

            @Override // java.io.OutputStream
            public void write(int i) {
                Buffer.this.writeByte((int) ((byte) i));
            }

            @Override // java.io.OutputStream
            public void write(byte[] bArr, int i, int i2) {
                Buffer.this.write(bArr, i, i2);
            }
        };
    }

    @Override // com.BufferedSource
    public boolean rangeEquals(long j2, ByteString byteString) {
        return rangeEquals(j2, byteString, 0, byteString.size());
    }

    @Override // com.BufferedSource
    public boolean rangeEquals(long j2, ByteString byteString, int i, int i2) {
        if (j2 < 0 || i < 0 || i2 < 0 || this.size - j2 < i2 || byteString.size() - i < i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (getByte(i3 + j2) != byteString.getByte(i + i3)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        Segment segment = this.head;
        if (segment == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), segment.limit - segment.pos);
        byteBuffer.put(segment.data, segment.pos, min);
        segment.pos += min;
        this.size -= min;
        if (segment.pos != segment.limit) {
            return min;
        }
        this.head = segment.pop();
        SegmentPool.recycle(segment);
        return min;
    }

    @Override // com.BufferedSource
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // com.BufferedSource
    public int read(byte[] bArr, int i, int i2) {
        Util.checkOffsetAndCount(bArr.length, i, i2);
        Segment segment = this.head;
        if (segment == null) {
            return -1;
        }
        int min = Math.min(i2, segment.limit - segment.pos);
        System.arraycopy(segment.data, segment.pos, bArr, i, min);
        segment.pos += min;
        this.size -= min;
        if (segment.pos != segment.limit) {
            return min;
        }
        this.head = segment.pop();
        SegmentPool.recycle(segment);
        return min;
    }

    @Override // com.Source
    public long read(Buffer buffer, long j2) {
        if (buffer == null) {
            throw new IllegalArgumentException("sink == null");
        }
        if (j2 < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j2);
        }
        if (this.size == 0) {
            return -1L;
        }
        if (j2 > this.size) {
            j2 = this.size;
        }
        buffer.write(this, j2);
        return j2;
    }

    @Override // com.BufferedSource
    public long readAll(Sink sink) throws IOException {
        long j2 = this.size;
        if (j2 > 0) {
            sink.write(this, j2);
        }
        return j2;
    }

    public final UnsafeCursor readAndWriteUnsafe() {
        return readAndWriteUnsafe(new UnsafeCursor());
    }

    public final UnsafeCursor readAndWriteUnsafe(UnsafeCursor unsafeCursor) {
        if (unsafeCursor.buffer != null) {
            throw new IllegalStateException("already attached to a buffer");
        }
        unsafeCursor.buffer = this;
        unsafeCursor.readWrite = true;
        return unsafeCursor;
    }

    @Override // com.BufferedSource
    public byte readByte() {
        if (this.size == 0) {
            throw new IllegalStateException("size == 0");
        }
        Segment segment = this.head;
        int i = segment.pos;
        int i2 = segment.limit;
        int i3 = i + 1;
        byte b2 = segment.data[i];
        this.size--;
        if (i3 == i2) {
            this.head = segment.pop();
            SegmentPool.recycle(segment);
        } else {
            segment.pos = i3;
        }
        return b2;
    }

    @Override // com.BufferedSource
    public byte[] readByteArray() {
        try {
            return readByteArray(this.size);
        } catch (EOFException e2) {
            throw new AssertionError(e2);
        }
    }

    @Override // com.BufferedSource
    public byte[] readByteArray(long j2) throws EOFException {
        Util.checkOffsetAndCount(this.size, 0L, j2);
        if (j2 > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j2);
        }
        byte[] bArr = new byte[(int) j2];
        readFully(bArr);
        return bArr;
    }

    @Override // com.BufferedSource
    public ByteString readByteString() {
        return new ByteString(readByteArray());
    }

    @Override // com.BufferedSource
    public ByteString readByteString(long j2) throws EOFException {
        return new ByteString(readByteArray(j2));
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c9 A[EDGE_INSN: B:49:0x00c9->B:43:0x00c9 BREAK  A[LOOP:0: B:7:0x001e->B:48:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d6  */
    @Override // com.BufferedSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long readDecimalLong() {
        /*
            Method dump skipped, instructions count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.Buffer.readDecimalLong():long");
    }

    public final Buffer readFrom(InputStream inputStream) throws IOException {
        readFrom(inputStream, Long.MAX_VALUE, true);
        return this;
    }

    public final Buffer readFrom(InputStream inputStream, long j2) throws IOException {
        if (j2 < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j2);
        }
        readFrom(inputStream, j2, false);
        return this;
    }

    @Override // com.BufferedSource
    public void readFully(Buffer buffer, long j2) throws EOFException {
        if (this.size < j2) {
            buffer.write(this, this.size);
            throw new EOFException();
        }
        buffer.write(this, j2);
    }

    @Override // com.BufferedSource
    public void readFully(byte[] bArr) throws EOFException {
        int i = 0;
        while (i < bArr.length) {
            int read = read(bArr, i, bArr.length - i);
            if (read == -1) {
                throw new EOFException();
            }
            i += read;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a6 A[EDGE_INSN: B:42:0x00a6->B:39:0x00a6 BREAK  A[LOOP:0: B:7:0x0013->B:41:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ba  */
    @Override // com.BufferedSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long readHexadecimalUnsignedLong() {
        /*
            r15 = this;
            r0 = 0
            r4 = 0
            long r1 = r15.size
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 != 0) goto L11
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "size == 0"
            r0.<init>(r1)
            throw r0
        L11:
            r1 = r0
            r2 = r4
        L13:
            com.Segment r10 = r15.head
            byte[] r11 = r10.data
            int r6 = r10.pos
            int r12 = r10.limit
            r7 = r6
        L1c:
            if (r7 >= r12) goto L95
            r8 = r11[r7]
            r6 = 48
            if (r8 < r6) goto L5b
            r6 = 57
            if (r8 > r6) goto L5b
            int r6 = r8 + (-48)
        L2a:
            r13 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r13 = r13 & r2
            int r9 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r9 == 0) goto Lae
            com.Buffer r0 = new com.Buffer
            r0.<init>()
            com.Buffer r0 = r0.writeHexadecimalUnsignedLong(r2)
            com.Buffer r0 = r0.writeByte(r8)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Number too large: "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r0 = r0.readUtf8()
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L5b:
            r6 = 97
            if (r8 < r6) goto L68
            r6 = 102(0x66, float:1.43E-43)
            if (r8 > r6) goto L68
            int r6 = r8 + (-97)
            int r6 = r6 + 10
            goto L2a
        L68:
            r6 = 65
            if (r8 < r6) goto L75
            r6 = 70
            if (r8 > r6) goto L75
            int r6 = r8 + (-65)
            int r6 = r6 + 10
            goto L2a
        L75:
            if (r1 != 0) goto L94
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r8)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L94:
            r0 = 1
        L95:
            if (r7 != r12) goto Lba
            com.Segment r6 = r10.pop()
            r15.head = r6
            com.SegmentPool.recycle(r10)
        La0:
            if (r0 != 0) goto La6
            com.Segment r6 = r15.head
            if (r6 != 0) goto L13
        La6:
            long r4 = r15.size
            long r0 = (long) r1
            long r0 = r4 - r0
            r15.size = r0
            return r2
        Lae:
            r8 = 4
            long r2 = r2 << r8
            long r8 = (long) r6
            long r8 = r8 | r2
            int r2 = r7 + 1
            int r1 = r1 + 1
            r7 = r2
            r2 = r8
            goto L1c
        Lba:
            r10.pos = r7
            goto La0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.Buffer.readHexadecimalUnsignedLong():long");
    }

    @Override // com.BufferedSource
    public int readInt() {
        if (this.size < 4) {
            throw new IllegalStateException("size < 4: " + this.size);
        }
        Segment segment = this.head;
        int i = segment.pos;
        int i2 = segment.limit;
        if (i2 - i < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = segment.data;
        int i3 = i + 1;
        int i4 = i3 + 1;
        int i5 = ((bArr[i] & 255) << 24) | ((bArr[i3] & 255) << 16);
        int i6 = i4 + 1;
        int i7 = i5 | ((bArr[i4] & 255) << 8);
        int i8 = i6 + 1;
        int i9 = i7 | (bArr[i6] & 255);
        this.size -= 4;
        if (i8 != i2) {
            segment.pos = i8;
            return i9;
        }
        this.head = segment.pop();
        SegmentPool.recycle(segment);
        return i9;
    }

    @Override // com.BufferedSource
    public int readIntLe() {
        return Util.reverseBytesInt(readInt());
    }

    @Override // com.BufferedSource
    public long readLong() {
        if (this.size < 8) {
            throw new IllegalStateException("size < 8: " + this.size);
        }
        Segment segment = this.head;
        int i = segment.pos;
        int i2 = segment.limit;
        if (i2 - i < 8) {
            return ((readInt() & 4294967295L) << 32) | (readInt() & 4294967295L);
        }
        byte[] bArr = segment.data;
        long j2 = (bArr[i] & 255) << 56;
        int i3 = i + 1 + 1 + 1;
        long j3 = j2 | ((bArr[r4] & 255) << 48) | ((bArr[r0] & 255) << 40);
        long j4 = j3 | ((bArr[i3] & 255) << 32);
        long j5 = j4 | ((bArr[r0] & 255) << 24);
        long j6 = j5 | ((bArr[r6] & 255) << 16);
        int i4 = i3 + 1 + 1 + 1 + 1 + 1;
        long j7 = (bArr[r6] & 255) | j6 | ((bArr[r0] & 255) << 8);
        this.size -= 8;
        if (i4 != i2) {
            segment.pos = i4;
            return j7;
        }
        this.head = segment.pop();
        SegmentPool.recycle(segment);
        return j7;
    }

    @Override // com.BufferedSource
    public long readLongLe() {
        return Util.reverseBytesLong(readLong());
    }

    @Override // com.BufferedSource
    public short readShort() {
        if (this.size < 2) {
            throw new IllegalStateException("size < 2: " + this.size);
        }
        Segment segment = this.head;
        int i = segment.pos;
        int i2 = segment.limit;
        if (i2 - i < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = segment.data;
        int i3 = i + 1;
        int i4 = i3 + 1;
        int i5 = ((bArr[i] & 255) << 8) | (bArr[i3] & 255);
        this.size -= 2;
        if (i4 == i2) {
            this.head = segment.pop();
            SegmentPool.recycle(segment);
        } else {
            segment.pos = i4;
        }
        return (short) i5;
    }

    @Override // com.BufferedSource
    public short readShortLe() {
        return Util.reverseBytesShort(readShort());
    }

    @Override // com.BufferedSource
    public String readString(long j2, Charset charset) throws EOFException {
        Util.checkOffsetAndCount(this.size, 0L, j2);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        if (j2 > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j2);
        }
        if (j2 == 0) {
            return "";
        }
        Segment segment = this.head;
        if (segment.pos + j2 > segment.limit) {
            return new String(readByteArray(j2), charset);
        }
        String str = new String(segment.data, segment.pos, (int) j2, charset);
        segment.pos = (int) (segment.pos + j2);
        this.size -= j2;
        if (segment.pos != segment.limit) {
            return str;
        }
        this.head = segment.pop();
        SegmentPool.recycle(segment);
        return str;
    }

    @Override // com.BufferedSource
    public String readString(Charset charset) {
        try {
            return readString(this.size, charset);
        } catch (EOFException e2) {
            throw new AssertionError(e2);
        }
    }

    public final UnsafeCursor readUnsafe() {
        return readUnsafe(new UnsafeCursor());
    }

    public final UnsafeCursor readUnsafe(UnsafeCursor unsafeCursor) {
        if (unsafeCursor.buffer != null) {
            throw new IllegalStateException("already attached to a buffer");
        }
        unsafeCursor.buffer = this;
        unsafeCursor.readWrite = false;
        return unsafeCursor;
    }

    @Override // com.BufferedSource
    public String readUtf8() {
        try {
            return readString(this.size, Util.UTF_8);
        } catch (EOFException e2) {
            throw new AssertionError(e2);
        }
    }

    @Override // com.BufferedSource
    public String readUtf8(long j2) throws EOFException {
        return readString(j2, Util.UTF_8);
    }

    @Override // com.BufferedSource
    public int readUtf8CodePoint() throws EOFException {
        int i;
        int i2;
        int i3;
        if (this.size == 0) {
            throw new EOFException();
        }
        byte b2 = getByte(0L);
        if ((b2 & 128) == 0) {
            i3 = 0;
            i = b2 & Byte.MAX_VALUE;
            i2 = 1;
        } else if ((b2 & 224) == 192) {
            i = b2 & 31;
            i2 = 2;
            i3 = 128;
        } else if ((b2 & 240) == 224) {
            i = b2 & 15;
            i2 = 3;
            i3 = 2048;
        } else {
            if ((b2 & 248) != 240) {
                skip(1L);
                return REPLACEMENT_CHARACTER;
            }
            i = b2 & 7;
            i2 = 4;
            i3 = 65536;
        }
        if (this.size < i2) {
            throw new EOFException("size < " + i2 + ": " + this.size + " (to read code point prefixed 0x" + Integer.toHexString(b2) + ")");
        }
        int i4 = i;
        int i5 = 1;
        while (i5 < i2) {
            byte b3 = getByte(i5);
            if ((b3 & 192) != 128) {
                skip(i5);
                return REPLACEMENT_CHARACTER;
            }
            i5++;
            i4 = (b3 & 63) | (i4 << 6);
        }
        skip(i2);
        if (i4 > 1114111) {
            return REPLACEMENT_CHARACTER;
        }
        if ((i4 < 55296 || i4 > 57343) && i4 >= i3) {
            return i4;
        }
        return REPLACEMENT_CHARACTER;
    }

    @Override // com.BufferedSource
    @Nullable
    public String readUtf8Line() throws EOFException {
        long indexOf = indexOf((byte) 10);
        if (indexOf != -1) {
            return readUtf8Line(indexOf);
        }
        if (this.size != 0) {
            return readUtf8(this.size);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String readUtf8Line(long j2) throws EOFException {
        if (j2 <= 0 || getByte(j2 - 1) != 13) {
            String readUtf8 = readUtf8(j2);
            skip(1L);
            return readUtf8;
        }
        String readUtf82 = readUtf8(j2 - 1);
        skip(2L);
        return readUtf82;
    }

    @Override // com.BufferedSource
    public String readUtf8LineStrict() throws EOFException {
        return readUtf8LineStrict(Long.MAX_VALUE);
    }

    @Override // com.BufferedSource
    public String readUtf8LineStrict(long j2) throws EOFException {
        if (j2 < 0) {
            throw new IllegalArgumentException("limit < 0: " + j2);
        }
        long j3 = j2 != Long.MAX_VALUE ? j2 + 1 : Long.MAX_VALUE;
        long indexOf = indexOf((byte) 10, 0L, j3);
        if (indexOf != -1) {
            return readUtf8Line(indexOf);
        }
        if (j3 < size() && getByte(j3 - 1) == 13 && getByte(j3) == 10) {
            return readUtf8Line(j3);
        }
        Buffer buffer = new Buffer();
        copyTo(buffer, 0L, Math.min(32L, size()));
        throw new EOFException("\\n not found: limit=" + Math.min(size(), j2) + " content=" + buffer.readByteString().hex() + (char) 8230);
    }

    @Override // com.BufferedSource
    public boolean request(long j2) {
        return this.size >= j2;
    }

    @Override // com.BufferedSource
    public void require(long j2) throws EOFException {
        if (this.size < j2) {
            throw new EOFException();
        }
    }

    List<Integer> segmentSizes() {
        if (this.head == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(this.head.limit - this.head.pos));
        for (Segment segment = this.head.next; segment != this.head; segment = segment.next) {
            arrayList.add(Integer.valueOf(segment.limit - segment.pos));
        }
        return arrayList;
    }

    @Override // com.BufferedSource
    public int select(Options options) {
        Segment segment = this.head;
        if (segment == null) {
            return options.indexOf(ByteString.EMPTY);
        }
        ByteString[] byteStringArr = options.byteStrings;
        int length = byteStringArr.length;
        for (int i = 0; i < length; i++) {
            ByteString byteString = byteStringArr[i];
            if (this.size >= byteString.size() && rangeEquals(segment, segment.pos, byteString, 0, byteString.size())) {
                try {
                    skip(byteString.size());
                    return i;
                } catch (EOFException e2) {
                    throw new AssertionError(e2);
                }
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int selectPrefix(Options options) {
        Segment segment = this.head;
        ByteString[] byteStringArr = options.byteStrings;
        int length = byteStringArr.length;
        for (int i = 0; i < length; i++) {
            ByteString byteString = byteStringArr[i];
            int min = (int) Math.min(this.size, byteString.size());
            if (min == 0 || rangeEquals(segment, segment.pos, byteString, 0, min)) {
                return i;
            }
        }
        return -1;
    }

    public final ByteString sha1() {
        return digest("SHA-1");
    }

    public final ByteString sha256() {
        return digest("SHA-256");
    }

    public final ByteString sha512() {
        return digest("SHA-512");
    }

    public final long size() {
        return this.size;
    }

    @Override // com.BufferedSource
    public void skip(long j2) throws EOFException {
        while (j2 > 0) {
            if (this.head == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j2, this.head.limit - this.head.pos);
            this.size -= min;
            j2 -= min;
            Segment segment = this.head;
            segment.pos = min + segment.pos;
            if (this.head.pos == this.head.limit) {
                Segment segment2 = this.head;
                this.head = segment2.pop();
                SegmentPool.recycle(segment2);
            }
        }
    }

    public final ByteString snapshot() {
        if (this.size > 2147483647L) {
            throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.size);
        }
        return snapshot((int) this.size);
    }

    public final ByteString snapshot(int i) {
        return i == 0 ? ByteString.EMPTY : new SegmentedByteString(this, i);
    }

    @Override // com.Source
    public Timeout timeout() {
        return Timeout.NONE;
    }

    public String toString() {
        return snapshot().toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Segment writableSegment(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException();
        }
        if (this.head != null) {
            Segment segment = this.head.prev;
            return (segment.limit + i > 8192 || !segment.owner) ? segment.push(SegmentPool.take()) : segment;
        }
        this.head = SegmentPool.take();
        Segment segment2 = this.head;
        Segment segment3 = this.head;
        Segment segment4 = this.head;
        segment3.prev = segment4;
        segment2.next = segment4;
        return segment4;
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer == null) {
            throw new IllegalArgumentException("source == null");
        }
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            Segment writableSegment = writableSegment(1);
            int min = Math.min(i, 8192 - writableSegment.limit);
            byteBuffer.get(writableSegment.data, writableSegment.limit, min);
            i -= min;
            writableSegment.limit = min + writableSegment.limit;
        }
        this.size += remaining;
        return remaining;
    }

    @Override // com.BufferedSink
    public Buffer write(ByteString byteString) {
        if (byteString == null) {
            throw new IllegalArgumentException("byteString == null");
        }
        byteString.write(this);
        return this;
    }

    @Override // com.BufferedSink
    public Buffer write(byte[] bArr) {
        if (bArr == null) {
            throw new IllegalArgumentException("source == null");
        }
        return write(bArr, 0, bArr.length);
    }

    @Override // com.BufferedSink
    public Buffer write(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new IllegalArgumentException("source == null");
        }
        Util.checkOffsetAndCount(bArr.length, i, i2);
        int i3 = i + i2;
        while (i < i3) {
            Segment writableSegment = writableSegment(1);
            int min = Math.min(i3 - i, 8192 - writableSegment.limit);
            System.arraycopy(bArr, i, writableSegment.data, writableSegment.limit, min);
            i += min;
            writableSegment.limit = min + writableSegment.limit;
        }
        this.size += i2;
        return this;
    }

    @Override // com.BufferedSink
    public BufferedSink write(Source source, long j2) throws IOException {
        while (j2 > 0) {
            long read = source.read(this, j2);
            if (read == -1) {
                throw new EOFException();
            }
            j2 -= read;
        }
        return this;
    }

    @Override // com.Sink
    public void write(Buffer buffer, long j2) {
        if (buffer == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (buffer == this) {
            throw new IllegalArgumentException("source == this");
        }
        Util.checkOffsetAndCount(buffer.size, 0L, j2);
        while (j2 > 0) {
            if (j2 < buffer.head.limit - buffer.head.pos) {
                Segment segment = this.head != null ? this.head.prev : null;
                if (segment != null && segment.owner) {
                    if ((segment.limit + j2) - (segment.shared ? 0 : segment.pos) <= 8192) {
                        buffer.head.writeTo(segment, (int) j2);
                        buffer.size -= j2;
                        this.size += j2;
                        return;
                    }
                }
                buffer.head = buffer.head.split((int) j2);
            }
            Segment segment2 = buffer.head;
            long j3 = segment2.limit - segment2.pos;
            buffer.head = segment2.pop();
            if (this.head == null) {
                this.head = segment2;
                Segment segment3 = this.head;
                Segment segment4 = this.head;
                Segment segment5 = this.head;
                segment4.prev = segment5;
                segment3.next = segment5;
            } else {
                this.head.prev.push(segment2).compact();
            }
            buffer.size -= j3;
            this.size += j3;
            j2 -= j3;
        }
    }

    @Override // com.BufferedSink
    public long writeAll(Source source) throws IOException {
        if (source == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j2 = 0;
        while (true) {
            long read = source.read(this, 8192L);
            if (read == -1) {
                return j2;
            }
            j2 += read;
        }
    }

    @Override // com.BufferedSink
    public Buffer writeByte(int i) {
        Segment writableSegment = writableSegment(1);
        byte[] bArr = writableSegment.data;
        int i2 = writableSegment.limit;
        writableSegment.limit = i2 + 1;
        bArr[i2] = (byte) i;
        this.size++;
        return this;
    }

    @Override // com.BufferedSink
    public Buffer writeDecimalLong(long j2) {
        boolean z2;
        long j3;
        int i = 1;
        if (j2 == 0) {
            return writeByte(48);
        }
        if (j2 < 0) {
            j3 = -j2;
            if (j3 < 0) {
                return writeUtf8("-9223372036854775808");
            }
            z2 = true;
        } else {
            z2 = false;
            j3 = j2;
        }
        if (j3 >= 100000000) {
            i = j3 < 1000000000000L ? j3 < 10000000000L ? j3 < 1000000000 ? 9 : 10 : j3 < 100000000000L ? 11 : 12 : j3 < 1000000000000000L ? j3 < 10000000000000L ? 13 : j3 < 100000000000000L ? 14 : 15 : j3 < 100000000000000000L ? j3 < 10000000000000000L ? 16 : 17 : j3 < 1000000000000000000L ? 18 : 19;
        } else if (j3 >= 10000) {
            i = j3 < 1000000 ? j3 < 100000 ? 5 : 6 : j3 < 10000000 ? 7 : 8;
        } else if (j3 >= 100) {
            i = j3 < 1000 ? 3 : 4;
        } else if (j3 >= 10) {
            i = 2;
        }
        if (z2) {
            i++;
        }
        Segment writableSegment = writableSegment(i);
        byte[] bArr = writableSegment.data;
        int i2 = writableSegment.limit + i;
        while (j3 != 0) {
            i2--;
            bArr[i2] = DIGITS[(int) (j3 % 10)];
            j3 /= 10;
        }
        if (z2) {
            bArr[i2 - 1] = 45;
        }
        writableSegment.limit += i;
        this.size += i;
        return this;
    }

    @Override // com.BufferedSink
    public Buffer writeHexadecimalUnsignedLong(long j2) {
        if (j2 == 0) {
            return writeByte(48);
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j2)) / 4) + 1;
        Segment writableSegment = writableSegment(numberOfTrailingZeros);
        byte[] bArr = writableSegment.data;
        int i = writableSegment.limit;
        for (int i2 = (writableSegment.limit + numberOfTrailingZeros) - 1; i2 >= i; i2--) {
            bArr[i2] = DIGITS[(int) (15 & j2)];
            j2 >>>= 4;
        }
        writableSegment.limit += numberOfTrailingZeros;
        this.size = numberOfTrailingZeros + this.size;
        return this;
    }

    @Override // com.BufferedSink
    public Buffer writeInt(int i) {
        Segment writableSegment = writableSegment(4);
        byte[] bArr = writableSegment.data;
        int i2 = writableSegment.limit;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >>> 8) & 255);
        bArr[i5] = (byte) (i & 255);
        writableSegment.limit = i5 + 1;
        this.size += 4;
        return this;
    }

    @Override // com.BufferedSink
    public Buffer writeIntLe(int i) {
        return writeInt(Util.reverseBytesInt(i));
    }

    @Override // com.BufferedSink
    public Buffer writeLong(long j2) {
        Segment writableSegment = writableSegment(8);
        byte[] bArr = writableSegment.data;
        int i = writableSegment.limit;
        int i2 = i + 1;
        bArr[i] = (byte) ((j2 >>> 56) & 255);
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((j2 >>> 48) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((j2 >>> 40) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((j2 >>> 32) & 255);
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((j2 >>> 24) & 255);
        int i7 = i6 + 1;
        bArr[i6] = (byte) ((j2 >>> 16) & 255);
        int i8 = i7 + 1;
        bArr[i7] = (byte) ((j2 >>> 8) & 255);
        bArr[i8] = (byte) (j2 & 255);
        writableSegment.limit = i8 + 1;
        this.size += 8;
        return this;
    }

    @Override // com.BufferedSink
    public Buffer writeLongLe(long j2) {
        return writeLong(Util.reverseBytesLong(j2));
    }

    @Override // com.BufferedSink
    public Buffer writeShort(int i) {
        Segment writableSegment = writableSegment(2);
        byte[] bArr = writableSegment.data;
        int i2 = writableSegment.limit;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i3] = (byte) (i & 255);
        writableSegment.limit = i3 + 1;
        this.size += 2;
        return this;
    }

    @Override // com.BufferedSink
    public Buffer writeShortLe(int i) {
        return writeShort((int) Util.reverseBytesShort((short) i));
    }

    @Override // com.BufferedSink
    public Buffer writeString(String str, int i, int i2, Charset charset) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i < 0) {
            throw new IllegalAccessError("beginIndex < 0: " + i);
        }
        if (i2 < i) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + i2 + " < " + i);
        }
        if (i2 > str.length()) {
            throw new IllegalArgumentException("endIndex > string.length: " + i2 + " > " + str.length());
        }
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        if (charset.equals(Util.UTF_8)) {
            return writeUtf8(str, i, i2);
        }
        byte[] bytes = str.substring(i, i2).getBytes(charset);
        return write(bytes, 0, bytes.length);
    }

    @Override // com.BufferedSink
    public Buffer writeString(String str, Charset charset) {
        return writeString(str, 0, str.length(), charset);
    }

    public final Buffer writeTo(OutputStream outputStream) throws IOException {
        return writeTo(outputStream, this.size);
    }

    public final Buffer writeTo(OutputStream outputStream, long j2) throws IOException {
        Segment segment;
        if (outputStream == null) {
            throw new IllegalArgumentException("out == null");
        }
        Util.checkOffsetAndCount(this.size, 0L, j2);
        Segment segment2 = this.head;
        while (j2 > 0) {
            int min = (int) Math.min(j2, segment2.limit - segment2.pos);
            outputStream.write(segment2.data, segment2.pos, min);
            segment2.pos += min;
            this.size -= min;
            j2 -= min;
            if (segment2.pos == segment2.limit) {
                segment = segment2.pop();
                this.head = segment;
                SegmentPool.recycle(segment2);
            } else {
                segment = segment2;
            }
            segment2 = segment;
        }
        return this;
    }

    @Override // com.BufferedSink
    public Buffer writeUtf8(String str) {
        return writeUtf8(str, 0, str.length());
    }

    @Override // com.BufferedSink
    public Buffer writeUtf8(String str, int i, int i2) {
        int i3;
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0: " + i);
        }
        if (i2 < i) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + i2 + " < " + i);
        }
        if (i2 > str.length()) {
            throw new IllegalArgumentException("endIndex > string.length: " + i2 + " > " + str.length());
        }
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt < 128) {
                Segment writableSegment = writableSegment(1);
                byte[] bArr = writableSegment.data;
                int i4 = writableSegment.limit - i;
                int min = Math.min(i2, 8192 - i4);
                i3 = i + 1;
                bArr[i4 + i] = (byte) charAt;
                while (i3 < min) {
                    char charAt2 = str.charAt(i3);
                    if (charAt2 >= 128) {
                        break;
                    }
                    bArr[i3 + i4] = (byte) charAt2;
                    i3++;
                }
                int i5 = (i3 + i4) - writableSegment.limit;
                writableSegment.limit += i5;
                this.size += i5;
            } else if (charAt < 2048) {
                writeByte((charAt >> 6) | 192);
                writeByte((charAt & '?') | 128);
                i3 = i + 1;
            } else if (charAt < 55296 || charAt > 57343) {
                writeByte((charAt >> '\f') | 224);
                writeByte(((charAt >> 6) & 63) | 128);
                writeByte((charAt & '?') | 128);
                i3 = i + 1;
            } else {
                char charAt3 = i + 1 < i2 ? str.charAt(i + 1) : (char) 0;
                if (charAt > 56319 || charAt3 < 56320 || charAt3 > 57343) {
                    writeByte(63);
                    i++;
                } else {
                    int i6 = ((charAt3 & 9215) | ((charAt & 10239) << 10)) + 65536;
                    writeByte((i6 >> 18) | 240);
                    writeByte(((i6 >> 12) & 63) | 128);
                    writeByte(((i6 >> 6) & 63) | 128);
                    writeByte((i6 & 63) | 128);
                    i3 = i + 2;
                }
            }
            i = i3;
        }
        return this;
    }

    @Override // com.BufferedSink
    public Buffer writeUtf8CodePoint(int i) {
        if (i < 128) {
            writeByte(i);
        } else if (i < 2048) {
            writeByte((i >> 6) | 192);
            writeByte((i & 63) | 128);
        } else if (i < 65536) {
            if (i < 55296 || i > 57343) {
                writeByte((i >> 12) | 224);
                writeByte(((i >> 6) & 63) | 128);
                writeByte((i & 63) | 128);
            } else {
                writeByte(63);
            }
        } else {
            if (i > 1114111) {
                throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(i));
            }
            writeByte((i >> 18) | 240);
            writeByte(((i >> 12) & 63) | 128);
            writeByte(((i >> 6) & 63) | 128);
            writeByte((i & 63) | 128);
        }
        return this;
    }
}
