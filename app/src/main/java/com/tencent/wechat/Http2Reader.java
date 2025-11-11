package com.tencent.wechat;

import com.Buffer;
import com.BufferedSource;
import com.ByteString;
import com.Source;
import com.Timeout;
import com.tencent.Util;
import com.tencent.wechat.Hpack;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class Http2Reader implements Closeable {
    static final Logger logger = Logger.getLogger(Http2.class.getName());
    private final boolean client;
    private final ContinuationSource continuation;
    final Hpack.Reader hpackReader;
    private final BufferedSource source;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class ContinuationSource implements Source {
        byte flags;
        int left;
        int length;
        short padding;
        private final BufferedSource source;
        int streamId;

        public ContinuationSource(BufferedSource bufferedSource) {
            this.source = bufferedSource;
        }

        private void readContinuationHeader() throws IOException {
            int i = this.streamId;
            int readMedium = Http2Reader.readMedium(this.source);
            this.left = readMedium;
            this.length = readMedium;
            byte readByte = (byte) (this.source.readByte() & 255);
            this.flags = (byte) (this.source.readByte() & 255);
            if (Http2Reader.logger.isLoggable(Level.FINE)) {
                Http2Reader.logger.fine(Http2.frameLog(true, this.streamId, this.length, readByte, this.flags));
            }
            this.streamId = this.source.readInt() & Integer.MAX_VALUE;
            if (readByte != 9) {
                throw Http2.ioException("%s != TYPE_CONTINUATION", Byte.valueOf(readByte));
            }
            if (this.streamId != i) {
                throw Http2.ioException("TYPE_CONTINUATION streamId changed", new Object[0]);
            }
        }

        @Override // com.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        @Override // com.Source
        public long read(Buffer buffer, long j2) throws IOException {
            while (this.left == 0) {
                this.source.skip(this.padding);
                this.padding = (short) 0;
                if ((this.flags & 4) != 0) {
                    return -1L;
                }
                readContinuationHeader();
            }
            long read = this.source.read(buffer, Math.min(j2, this.left));
            if (read == -1) {
                return -1L;
            }
            this.left = (int) (this.left - read);
            return read;
        }

        @Override // com.Source
        public Timeout timeout() {
            return this.source.timeout();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface Handler {
        void ackSettings();

        void alternateService(int i, String str, ByteString byteString, String str2, int i2, long j2);

        void data(boolean z2, int i, BufferedSource bufferedSource, int i2) throws IOException;

        void goAway(int i, ErrorCode errorCode, ByteString byteString);

        void headers(boolean z2, int i, int i2, List<Header> list);

        void ping(boolean z2, int i, int i2);

        void priority(int i, int i2, int i3, boolean z2);

        void pushPromise(int i, int i2, List<Header> list) throws IOException;

        void rstStream(int i, ErrorCode errorCode);

        void settings(boolean z2, Settings settings);

        void windowUpdate(int i, long j2);
    }

    public Http2Reader(BufferedSource bufferedSource, boolean z2) {
        this.source = bufferedSource;
        this.client = z2;
        this.continuation = new ContinuationSource(this.source);
        this.hpackReader = new Hpack.Reader(4096, this.continuation);
    }

    static int lengthWithoutPadding(int i, byte b2, short s2) throws IOException {
        if ((b2 & 8) != 0) {
            i--;
        }
        if (s2 > i) {
            throw Http2.ioException("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s2), Integer.valueOf(i));
        }
        return (short) (i - s2);
    }

    private void readData(Handler handler, int i, byte b2, int i2) throws IOException {
        if (i2 == 0) {
            throw Http2.ioException("PROTOCOL_ERROR: TYPE_DATA streamId == 0", new Object[0]);
        }
        boolean z2 = (b2 & 1) != 0;
        if ((b2 & 32) != 0) {
            throw Http2.ioException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
        }
        short readByte = (b2 & 8) != 0 ? (short) (this.source.readByte() & 255) : (short) 0;
        handler.data(z2, i2, this.source, lengthWithoutPadding(i, b2, readByte));
        this.source.skip(readByte);
    }

    private void readGoAway(Handler handler, int i, byte b2, int i2) throws IOException {
        if (i < 8) {
            throw Http2.ioException("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i));
        }
        if (i2 != 0) {
            throw Http2.ioException("TYPE_GOAWAY streamId != 0", new Object[0]);
        }
        int readInt = this.source.readInt();
        int readInt2 = this.source.readInt();
        int i3 = i - 8;
        ErrorCode fromHttp2 = ErrorCode.fromHttp2(readInt2);
        if (fromHttp2 == null) {
            throw Http2.ioException("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(readInt2));
        }
        ByteString byteString = ByteString.EMPTY;
        if (i3 > 0) {
            byteString = this.source.readByteString(i3);
        }
        handler.goAway(readInt, fromHttp2, byteString);
    }

    private List<Header> readHeaderBlock(int i, short s2, byte b2, int i2) throws IOException {
        ContinuationSource continuationSource = this.continuation;
        this.continuation.left = i;
        continuationSource.length = i;
        this.continuation.padding = s2;
        this.continuation.flags = b2;
        this.continuation.streamId = i2;
        this.hpackReader.readHeaders();
        return this.hpackReader.getAndResetHeaderList();
    }

    private void readHeaders(Handler handler, int i, byte b2, int i2) throws IOException {
        if (i2 == 0) {
            throw Http2.ioException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
        }
        boolean z2 = (b2 & 1) != 0;
        short readByte = (b2 & 8) != 0 ? (short) (this.source.readByte() & 255) : (short) 0;
        if ((b2 & 32) != 0) {
            readPriority(handler, i2);
            i -= 5;
        }
        handler.headers(z2, i2, -1, readHeaderBlock(lengthWithoutPadding(i, b2, readByte), readByte, b2, i2));
    }

    static int readMedium(BufferedSource bufferedSource) throws IOException {
        return ((bufferedSource.readByte() & 255) << 16) | ((bufferedSource.readByte() & 255) << 8) | (bufferedSource.readByte() & 255);
    }

    private void readPing(Handler handler, int i, byte b2, int i2) throws IOException {
        if (i != 8) {
            throw Http2.ioException("TYPE_PING length != 8: %s", Integer.valueOf(i));
        }
        if (i2 != 0) {
            throw Http2.ioException("TYPE_PING streamId != 0", new Object[0]);
        }
        handler.ping((b2 & 1) != 0, this.source.readInt(), this.source.readInt());
    }

    private void readPriority(Handler handler, int i) throws IOException {
        int readInt = this.source.readInt();
        handler.priority(i, readInt & Integer.MAX_VALUE, (this.source.readByte() & 255) + 1, (Integer.MIN_VALUE & readInt) != 0);
    }

    private void readPriority(Handler handler, int i, byte b2, int i2) throws IOException {
        if (i != 5) {
            throw Http2.ioException("TYPE_PRIORITY length: %d != 5", Integer.valueOf(i));
        }
        if (i2 == 0) {
            throw Http2.ioException("TYPE_PRIORITY streamId == 0", new Object[0]);
        }
        readPriority(handler, i2);
    }

    private void readPushPromise(Handler handler, int i, byte b2, int i2) throws IOException {
        if (i2 == 0) {
            throw Http2.ioException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
        }
        short readByte = (b2 & 8) != 0 ? (short) (this.source.readByte() & 255) : (short) 0;
        handler.pushPromise(i2, this.source.readInt() & Integer.MAX_VALUE, readHeaderBlock(lengthWithoutPadding(i - 4, b2, readByte), readByte, b2, i2));
    }

    private void readRstStream(Handler handler, int i, byte b2, int i2) throws IOException {
        if (i != 4) {
            throw Http2.ioException("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i));
        }
        if (i2 == 0) {
            throw Http2.ioException("TYPE_RST_STREAM streamId == 0", new Object[0]);
        }
        int readInt = this.source.readInt();
        ErrorCode fromHttp2 = ErrorCode.fromHttp2(readInt);
        if (fromHttp2 == null) {
            throw Http2.ioException("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(readInt));
        }
        handler.rstStream(i2, fromHttp2);
    }

    private void readSettings(Handler handler, int i, byte b2, int i2) throws IOException {
        if (i2 != 0) {
            throw Http2.ioException("TYPE_SETTINGS streamId != 0", new Object[0]);
        }
        if ((b2 & 1) != 0) {
            if (i != 0) {
                throw Http2.ioException("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
            }
            handler.ackSettings();
            return;
        }
        if (i % 6 != 0) {
            throw Http2.ioException("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(i));
        }
        Settings settings = new Settings();
        for (int i3 = 0; i3 < i; i3 += 6) {
            short readShort = this.source.readShort();
            int readInt = this.source.readInt();
            switch (readShort) {
                case 2:
                    if (readInt != 0 && readInt != 1) {
                        throw Http2.ioException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                    }
                    break;
                case 3:
                    readShort = 4;
                    break;
                case Platform.INFO /* 4 */:
                    readShort = 7;
                    if (readInt < 0) {
                        throw Http2.ioException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                    }
                    break;
                case Platform.WARN /* 5 */:
                    if (readInt < 16384 || readInt > 16777215) {
                        throw Http2.ioException("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(readInt));
                    }
                    break;
            }
            settings.set(readShort, readInt);
        }
        handler.settings(false, settings);
    }

    private void readWindowUpdate(Handler handler, int i, byte b2, int i2) throws IOException {
        if (i != 4) {
            throw Http2.ioException("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(i));
        }
        long readInt = this.source.readInt() & 2147483647L;
        if (readInt == 0) {
            throw Http2.ioException("windowSizeIncrement was 0", Long.valueOf(readInt));
        }
        handler.windowUpdate(i2, readInt);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.source.close();
    }

    public boolean nextFrame(boolean z2, Handler handler) throws IOException {
        try {
            this.source.require(9L);
            int readMedium = readMedium(this.source);
            if (readMedium < 0 || readMedium > 16384) {
                throw Http2.ioException("FRAME_SIZE_ERROR: %s", Integer.valueOf(readMedium));
            }
            byte readByte = (byte) (this.source.readByte() & 255);
            if (z2 && readByte != 4) {
                throw Http2.ioException("Expected a SETTINGS frame but was %s", Byte.valueOf(readByte));
            }
            byte readByte2 = (byte) (this.source.readByte() & 255);
            int readInt = this.source.readInt() & Integer.MAX_VALUE;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(Http2.frameLog(true, readInt, readMedium, readByte, readByte2));
            }
            switch (readByte) {
                case 0:
                    readData(handler, readMedium, readByte2, readInt);
                    return true;
                case 1:
                    readHeaders(handler, readMedium, readByte2, readInt);
                    return true;
                case 2:
                    readPriority(handler, readMedium, readByte2, readInt);
                    return true;
                case 3:
                    readRstStream(handler, readMedium, readByte2, readInt);
                    return true;
                case Platform.INFO /* 4 */:
                    readSettings(handler, readMedium, readByte2, readInt);
                    return true;
                case Platform.WARN /* 5 */:
                    readPushPromise(handler, readMedium, readByte2, readInt);
                    return true;
                case 6:
                    readPing(handler, readMedium, readByte2, readInt);
                    return true;
                case 7:
                    readGoAway(handler, readMedium, readByte2, readInt);
                    return true;
                case 8:
                    readWindowUpdate(handler, readMedium, readByte2, readInt);
                    return true;
                default:
                    this.source.skip(readMedium);
                    return true;
            }
        } catch (IOException e2) {
            return false;
        }
    }

    public void readConnectionPreface(Handler handler) throws IOException {
        if (this.client) {
            if (!nextFrame(true, handler)) {
                throw Http2.ioException("Required SETTINGS preface not received", new Object[0]);
            }
            return;
        }
        ByteString readByteString = this.source.readByteString(Http2.CONNECTION_PREFACE.size());
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(Util.format("<< CONNECTION %s", readByteString.hex()));
        }
        if (!Http2.CONNECTION_PREFACE.equals(readByteString)) {
            throw Http2.ioException("Expected a connection header but was %s", readByteString.utf8());
        }
    }
}
