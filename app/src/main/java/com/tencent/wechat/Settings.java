package com.tencent.wechat;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class Settings {
    static final int COUNT = 10;
    static final int DEFAULT_INITIAL_WINDOW_SIZE = 65535;
    static final int ENABLE_PUSH = 2;
    static final int HEADER_TABLE_SIZE = 1;
    static final int INITIAL_WINDOW_SIZE = 7;
    static final int MAX_CONCURRENT_STREAMS = 4;
    static final int MAX_FRAME_SIZE = 5;
    static final int MAX_HEADER_LIST_SIZE = 6;
    private int set;
    private final int[] values = new int[COUNT];

    /* JADX INFO: Access modifiers changed from: package-private */
    public void clear() {
        this.set = 0;
        Arrays.fill(this.values, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int get(int i) {
        return this.values[i];
    }

    boolean getEnablePush(boolean z2) {
        return ((4 & this.set) != 0 ? this.values[ENABLE_PUSH] : z2 ? HEADER_TABLE_SIZE : 0) == HEADER_TABLE_SIZE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getHeaderTableSize() {
        if ((ENABLE_PUSH & this.set) != 0) {
            return this.values[HEADER_TABLE_SIZE];
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getInitialWindowSize() {
        return (128 & this.set) != 0 ? this.values[INITIAL_WINDOW_SIZE] : DEFAULT_INITIAL_WINDOW_SIZE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getMaxConcurrentStreams(int i) {
        return (16 & this.set) != 0 ? this.values[4] : i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getMaxFrameSize(int i) {
        return (32 & this.set) != 0 ? this.values[5] : i;
    }

    int getMaxHeaderListSize(int i) {
        return (64 & this.set) != 0 ? this.values[MAX_HEADER_LIST_SIZE] : i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isSet(int i) {
        return ((HEADER_TABLE_SIZE << i) & this.set) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void merge(Settings settings) {
        for (int i = 0; i < COUNT; i += HEADER_TABLE_SIZE) {
            if (settings.isSet(i)) {
                set(i, settings.get(i));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Settings set(int i, int i2) {
        if (i < this.values.length) {
            this.set = (HEADER_TABLE_SIZE << i) | this.set;
            this.values[i] = i2;
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int size() {
        return Integer.bitCount(this.set);
    }
}
