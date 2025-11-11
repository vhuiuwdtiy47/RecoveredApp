package com.tencent.wechat;

import com.Buffer;
import com.ByteString;
import com.Source;
import com.Timeout;
import com.tencent.Util;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: classes.dex */
final class Relay {
    private static final long FILE_HEADER_SIZE = 32;
    static final ByteString PREFIX_CLEAN = ByteString.encodeUtf8("OkHttp cache v1\n");
    static final ByteString PREFIX_DIRTY = ByteString.encodeUtf8("OkHttp DIRTY :(\n");
    private static final int SOURCE_FILE = 2;
    private static final int SOURCE_UPSTREAM = 1;
    final long bufferMaxSize;
    boolean complete;
    RandomAccessFile file;
    private final ByteString metadata;
    int sourceCount;
    Source upstream;
    long upstreamPos;
    Thread upstreamReader;
    final Buffer upstreamBuffer = new Buffer();
    final Buffer buffer = new Buffer();

    /* loaded from: classes.dex */
    class RelaySource implements Source {
        private FileOperator fileOperator;
        private long sourcePos;
        private final Timeout timeout = new Timeout();

        RelaySource() {
            this.fileOperator = new FileOperator(Relay.this.file.getChannel());
        }

        @Override // com.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            RandomAccessFile randomAccessFile = null;
            if (this.fileOperator == null) {
                return;
            }
            this.fileOperator = null;
            synchronized (Relay.this) {
                Relay relay = Relay.this;
                relay.sourceCount--;
                if (Relay.this.sourceCount == 0) {
                    randomAccessFile = Relay.this.file;
                    Relay.this.file = null;
                }
            }
            if (randomAccessFile != null) {
                Util.closeQuietly(randomAccessFile);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x003f, code lost:
        
            if (r0 != com.tencent.wechat.Relay.SOURCE_FILE) goto L81;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0041, code lost:
        
            r4 = java.lang.Math.min(r14, r7 - r12.sourcePos);
            r12.fileOperator.read(com.tencent.wechat.Relay.FILE_HEADER_SIZE + r12.sourcePos, r13, r4);
            r12.sourcePos += r4;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:?, code lost:
        
            return r4;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0088, code lost:
        
            r10 = r12.this$0.upstream.read(r12.this$0.upstreamBuffer, r12.this$0.bufferMaxSize);
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x009c, code lost:
        
            if (r10 != (-1)) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x009e, code lost:
        
            r12.this$0.commit(r7);
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x00a3, code lost:
        
            r1 = r12.this$0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00a7, code lost:
        
            monitor-enter(r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00a8, code lost:
        
            r12.this$0.upstreamReader = null;
            r12.this$0.notifyAll();
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00b2, code lost:
        
            monitor-exit(r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:?, code lost:
        
            return -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00b8, code lost:
        
            r4 = java.lang.Math.min(r10, r14);
            r12.this$0.upstreamBuffer.copyTo(r13, 0, r4);
            r12.sourcePos += r4;
            r12.fileOperator.write(r7 + com.tencent.wechat.Relay.FILE_HEADER_SIZE, r12.this$0.upstreamBuffer.m0clone(), r10);
            r1 = r12.this$0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00dd, code lost:
        
            monitor-enter(r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00de, code lost:
        
            r12.this$0.buffer.write(r12.this$0.upstreamBuffer, r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00f7, code lost:
        
            if (r12.this$0.buffer.size() <= r12.this$0.bufferMaxSize) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00f9, code lost:
        
            r12.this$0.buffer.skip(r12.this$0.buffer.size() - r12.this$0.bufferMaxSize);
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x010d, code lost:
        
            r12.this$0.upstreamPos += r10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x0114, code lost:
        
            monitor-exit(r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x0115, code lost:
        
            r1 = r12.this$0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x0117, code lost:
        
            monitor-enter(r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x0118, code lost:
        
            r12.this$0.upstreamReader = null;
            r12.this$0.notifyAll();
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x0122, code lost:
        
            monitor-exit(r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:?, code lost:
        
            return r4;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x012b, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x012e, code lost:
        
            monitor-enter(r12.this$0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x012f, code lost:
        
            r12.this$0.upstreamReader = null;
            r12.this$0.notifyAll();
         */
        /* JADX WARN: Code restructure failed: missing block: B:67:0x013a, code lost:
        
            throw r0;
         */
        @Override // com.Source
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public long read(com.Buffer r13, long r14) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 318
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.wechat.Relay.RelaySource.read(com.Buffer, long):long");
        }

        @Override // com.Source
        public Timeout timeout() {
            return this.timeout;
        }
    }

    private Relay(RandomAccessFile randomAccessFile, Source source, long j2, ByteString byteString, long j3) {
        this.file = randomAccessFile;
        this.upstream = source;
        this.complete = source == null;
        this.upstreamPos = j2;
        this.metadata = byteString;
        this.bufferMaxSize = j3;
    }

    public static Relay edit(File file, Source source, ByteString byteString, long j2) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        Relay relay = new Relay(randomAccessFile, source, 0L, byteString, j2);
        randomAccessFile.setLength(0L);
        relay.writeHeader(PREFIX_DIRTY, -1L, -1L);
        return relay;
    }

    public static Relay read(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        FileOperator fileOperator = new FileOperator(randomAccessFile.getChannel());
        Buffer buffer = new Buffer();
        fileOperator.read(0L, buffer, FILE_HEADER_SIZE);
        if (!buffer.readByteString(PREFIX_CLEAN.size()).equals(PREFIX_CLEAN)) {
            throw new IOException("unreadable cache file");
        }
        long readLong = buffer.readLong();
        long readLong2 = buffer.readLong();
        Buffer buffer2 = new Buffer();
        fileOperator.read(FILE_HEADER_SIZE + readLong, buffer2, readLong2);
        return new Relay(randomAccessFile, null, readLong, buffer2.readByteString(), 0L);
    }

    private void writeHeader(ByteString byteString, long j2, long j3) throws IOException {
        Buffer buffer = new Buffer();
        buffer.write(byteString);
        buffer.writeLong(j2);
        buffer.writeLong(j3);
        if (buffer.size() != FILE_HEADER_SIZE) {
            throw new IllegalArgumentException();
        }
        new FileOperator(this.file.getChannel()).write(0L, buffer, FILE_HEADER_SIZE);
    }

    private void writeMetadata(long j2) throws IOException {
        Buffer buffer = new Buffer();
        buffer.write(this.metadata);
        new FileOperator(this.file.getChannel()).write(FILE_HEADER_SIZE + j2, buffer, this.metadata.size());
    }

    void commit(long j2) throws IOException {
        writeMetadata(j2);
        this.file.getChannel().force(false);
        writeHeader(PREFIX_CLEAN, j2, this.metadata.size());
        this.file.getChannel().force(false);
        synchronized (this) {
            this.complete = true;
        }
        Util.closeQuietly(this.upstream);
        this.upstream = null;
    }

    boolean isClosed() {
        return this.file == null;
    }

    public ByteString metadata() {
        return this.metadata;
    }

    public Source newSource() {
        synchronized (this) {
            if (this.file == null) {
                return null;
            }
            this.sourceCount += SOURCE_UPSTREAM;
            return new RelaySource();
        }
    }
}
