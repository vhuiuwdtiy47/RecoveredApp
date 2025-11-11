package com.tencent.wechat;

import com.Buffer;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* loaded from: classes.dex */
final class FileOperator {
    private static final int BUFFER_SIZE = 8192;
    private final byte[] byteArray = new byte[BUFFER_SIZE];
    private final ByteBuffer byteBuffer = ByteBuffer.wrap(this.byteArray);
    private final FileChannel fileChannel;

    public FileOperator(FileChannel fileChannel) {
        this.fileChannel = fileChannel;
    }

    public void read(long j2, Buffer buffer, long j3) throws IOException {
        if (j3 < 0) {
            throw new IndexOutOfBoundsException();
        }
        while (j3 > 0) {
            try {
                this.byteBuffer.limit((int) Math.min(8192L, j3));
                if (this.fileChannel.read(this.byteBuffer, j2) == -1) {
                    throw new EOFException();
                }
                int position = this.byteBuffer.position();
                buffer.write(this.byteArray, 0, position);
                j2 += position;
                j3 -= position;
            } finally {
                this.byteBuffer.clear();
            }
        }
    }

    public void write(long j2, Buffer buffer, long j3) throws IOException {
        if (j3 < 0 || j3 > buffer.size()) {
            throw new IndexOutOfBoundsException();
        }
        long j4 = j2;
        while (j3 > 0) {
            try {
                int min = (int) Math.min(8192L, j3);
                buffer.read(this.byteArray, 0, min);
                this.byteBuffer.limit(min);
                do {
                    j4 += this.fileChannel.write(this.byteBuffer, j4);
                } while (this.byteBuffer.hasRemaining());
                j3 -= min;
            } finally {
                this.byteBuffer.clear();
            }
        }
    }
}
