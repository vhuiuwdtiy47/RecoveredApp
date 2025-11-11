package com.tencent.wechat;

import com.Okio;
import com.Sink;
import com.Source;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/* loaded from: classes.dex */
public interface FileSystem {
    public static final FileSystem SYSTEM = new FileSystem() { // from class: com.tencent.wechat.FileSystem.1
        @Override // com.tencent.wechat.FileSystem
        public Sink appendingSink(File file) throws FileNotFoundException {
            try {
                return Okio.appendingSink(file);
            } catch (FileNotFoundException e2) {
                file.getParentFile().mkdirs();
                return Okio.appendingSink(file);
            }
        }

        @Override // com.tencent.wechat.FileSystem
        public void delete(File file) throws IOException {
            if (!file.delete() && file.exists()) {
                throw new IOException("failed to delete " + file);
            }
        }

        @Override // com.tencent.wechat.FileSystem
        public void deleteContents(File file) throws IOException {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                throw new IOException("not a readable directory: " + file);
            }
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    deleteContents(file2);
                }
                if (!file2.delete()) {
                    throw new IOException("failed to delete " + file2);
                }
            }
        }

        @Override // com.tencent.wechat.FileSystem
        public boolean exists(File file) {
            return file.exists();
        }

        @Override // com.tencent.wechat.FileSystem
        public void rename(File file, File file2) throws IOException {
            delete(file2);
            if (!file.renameTo(file2)) {
                throw new IOException("failed to rename " + file + " to " + file2);
            }
        }

        @Override // com.tencent.wechat.FileSystem
        public Sink sink(File file) throws FileNotFoundException {
            try {
                return Okio.sink(file);
            } catch (FileNotFoundException e2) {
                file.getParentFile().mkdirs();
                return Okio.sink(file);
            }
        }

        @Override // com.tencent.wechat.FileSystem
        public long size(File file) {
            return file.length();
        }

        @Override // com.tencent.wechat.FileSystem
        public Source source(File file) throws FileNotFoundException {
            return Okio.source(file);
        }
    };

    Sink appendingSink(File file) throws FileNotFoundException;

    void delete(File file) throws IOException;

    void deleteContents(File file) throws IOException;

    boolean exists(File file);

    void rename(File file, File file2) throws IOException;

    Sink sink(File file) throws FileNotFoundException;

    long size(File file);

    Source source(File file) throws FileNotFoundException;
}
