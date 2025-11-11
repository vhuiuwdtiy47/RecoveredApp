package com.tencent.wechat;

import com.BufferedSource;
import com.GzipSource;
import com.Okio;
import com.tencent.Util;
import java.io.IOException;
import java.io.InputStream;
import java.net.IDN;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class PublicSuffixDatabase {
    private static final byte EXCEPTION_MARKER = 33;
    public static final String PUBLIC_SUFFIX_RESOURCE = "publicsuffixes.gz";
    private byte[] publicSuffixExceptionListBytes;
    private byte[] publicSuffixListBytes;
    private static final byte[] WILDCARD_LABEL = {42};
    private static final String[] EMPTY_RULE = new String[0];
    private static final String[] PREVAILING_RULE = {"*"};
    private static final PublicSuffixDatabase instance = new PublicSuffixDatabase();
    private final AtomicBoolean listRead = new AtomicBoolean(false);
    private final CountDownLatch readCompleteLatch = new CountDownLatch(1);

    private static String binarySearchBytes(byte[] bArr, byte[][] bArr2, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = 0;
        int length = bArr.length;
        while (i8 < length) {
            int i9 = (i8 + length) / 2;
            while (i9 > -1 && bArr[i9] != 10) {
                i9--;
            }
            int i10 = i9 + 1;
            int i11 = 1;
            while (bArr[i10 + i11] != 10) {
                i11++;
            }
            int i12 = (i10 + i11) - i10;
            int i13 = 0;
            int i14 = 0;
            boolean z2 = false;
            int i15 = i;
            while (true) {
                if (z2) {
                    i2 = 46;
                    z2 = false;
                } else {
                    i2 = bArr2[i15][i13] & 255;
                }
                i3 = i2 - (bArr[i10 + i14] & 255);
                if (i3 != 0) {
                    i4 = i14;
                    i5 = i13;
                    break;
                }
                i14++;
                int i16 = i13 + 1;
                if (i14 == i12) {
                    i5 = i16;
                    i4 = i14;
                    break;
                }
                if (bArr2[i15].length == i16) {
                    if (i15 == bArr2.length - 1) {
                        i5 = i16;
                        i4 = i14;
                        break;
                    }
                    i15++;
                    i16 = -1;
                    z2 = true;
                }
                i13 = i16;
            }
            if (i3 < 0) {
                i7 = i10 - 1;
                i6 = i8;
            } else if (i3 > 0) {
                i6 = i11 + i10 + 1;
                i7 = length;
            } else {
                int i17 = i12 - i4;
                int length2 = bArr2[i15].length - i5;
                for (int i18 = i15 + 1; i18 < bArr2.length; i18++) {
                    length2 += bArr2[i18].length;
                }
                if (length2 < i17) {
                    i7 = i10 - 1;
                    i6 = i8;
                } else {
                    if (length2 <= i17) {
                        return new String(bArr, i10, i12, Util.UTF_8);
                    }
                    i6 = i11 + i10 + 1;
                    i7 = length;
                }
            }
            length = i7;
            i8 = i6;
        }
        return null;
    }

    private String[] findMatchingRule(String[] strArr) {
        String str;
        String str2;
        String str3 = null;
        int i = 0;
        if (this.listRead.get() || !this.listRead.compareAndSet(false, true)) {
            try {
                this.readCompleteLatch.await();
            } catch (InterruptedException e2) {
            }
        } else {
            readTheList();
        }
        synchronized (this) {
            if (this.publicSuffixListBytes == null) {
                throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
            }
        }
        byte[][] bArr = new byte[strArr.length];
        for (int i2 = 0; i2 < strArr.length; i2++) {
            bArr[i2] = strArr[i2].getBytes(Util.UTF_8);
        }
        int i3 = 0;
        while (true) {
            if (i3 >= bArr.length) {
                str = null;
                break;
            }
            str = binarySearchBytes(this.publicSuffixListBytes, bArr, i3);
            if (str != null) {
                break;
            }
            i3++;
        }
        if (bArr.length > 1) {
            byte[][] bArr2 = (byte[][]) bArr.clone();
            for (int i4 = 0; i4 < bArr2.length - 1; i4++) {
                bArr2[i4] = WILDCARD_LABEL;
                String binarySearchBytes = binarySearchBytes(this.publicSuffixListBytes, bArr2, i4);
                if (binarySearchBytes != null) {
                    str2 = binarySearchBytes;
                    break;
                }
            }
        }
        str2 = null;
        if (str2 != null) {
            while (true) {
                if (i >= bArr.length - 1) {
                    break;
                }
                String binarySearchBytes2 = binarySearchBytes(this.publicSuffixExceptionListBytes, bArr, i);
                if (binarySearchBytes2 != null) {
                    str3 = binarySearchBytes2;
                    break;
                }
                i++;
            }
        }
        if (str3 != null) {
            return ("!" + str3).split("\\.");
        }
        if (str == null && str2 == null) {
            return PREVAILING_RULE;
        }
        String[] split = str != null ? str.split("\\.") : EMPTY_RULE;
        String[] split2 = str2 != null ? str2.split("\\.") : EMPTY_RULE;
        return split.length > split2.length ? split : split2;
    }

    public static PublicSuffixDatabase get() {
        return instance;
    }

    private void readTheList() {
        byte[] bArr;
        byte[] bArr2 = null;
        InputStream resourceAsStream = PublicSuffixDatabase.class.getClassLoader().getResourceAsStream(PUBLIC_SUFFIX_RESOURCE);
        if (resourceAsStream != null) {
            BufferedSource buffer = Okio.buffer(new GzipSource(Okio.source(resourceAsStream)));
            try {
                try {
                    byte[] bArr3 = new byte[buffer.readInt()];
                    buffer.readFully(bArr3);
                    bArr = new byte[buffer.readInt()];
                    buffer.readFully(bArr);
                    Util.closeQuietly(buffer);
                    bArr2 = bArr3;
                } catch (IOException e2) {
                    Platform.get().log(5, "Failed to read public suffix list", e2);
                    Util.closeQuietly(buffer);
                    bArr = null;
                }
            } catch (Throwable th) {
                Util.closeQuietly(buffer);
                throw th;
            }
        } else {
            bArr = null;
        }
        synchronized (this) {
            this.publicSuffixListBytes = bArr2;
            this.publicSuffixExceptionListBytes = bArr;
        }
        this.readCompleteLatch.countDown();
    }

    public String getEffectiveTldPlusOne(String str) {
        if (str == null) {
            throw new NullPointerException("domain == null");
        }
        String[] split = IDN.toUnicode(str).split("\\.");
        String[] findMatchingRule = findMatchingRule(split);
        if (split.length == findMatchingRule.length && findMatchingRule[0].charAt(0) != '!') {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        String[] split2 = str.split("\\.");
        for (int length = findMatchingRule[0].charAt(0) == '!' ? split.length - findMatchingRule.length : split.length - (findMatchingRule.length + 1); length < split2.length; length++) {
            sb.append(split2[length]).append('.');
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    void setListBytes(byte[] bArr, byte[] bArr2) {
        this.publicSuffixListBytes = bArr;
        this.publicSuffixExceptionListBytes = bArr2;
        this.listRead.set(true);
        this.readCompleteLatch.countDown();
    }
}
