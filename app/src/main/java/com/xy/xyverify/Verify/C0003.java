package com.xy.xyverify.Verify;

import com.xy.xyverify.Dialog.C0001;
import java.io.ByteArrayOutputStream;

/* renamed from: com.xy.xyverify.Verify.۟۠ۦۢۧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0003 {

    /* renamed from: ۦۣ۟ۤ, reason: contains not printable characters */
    public static int f10 = -66;

    /* renamed from: ۣۣ۟۟ۧ, reason: not valid java name and contains not printable characters */
    public static int m42() {
        return 737 ^ C0001.f5;
    }

    /* renamed from: ۟ۤۡۤۦ, reason: not valid java name and contains not printable characters */
    public static String m43(String str) {
        String str2 = "";
        String str3 = "";
        for (int i = 0; i < 15; i++) {
            str2 = new StringBuffer().append(str2).append(Integer.toHexString(i)).toString();
            str3 = new StringBuffer().append(str3).append(((int) (Math.random() * 10)) ^ i).toString();
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length() / 2);
        for (int i2 = 0; i2 < str.length(); i2 += 2) {
            byteArrayOutputStream.write((str2.indexOf(str.charAt(i2)) << 4) | str2.indexOf(str.charAt(i2 + 1)));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        String str4 = "a";
        while (str4.length() > 0) {
            str4 = "";
            if ("".length() == 0) {
                str4 = "a";
            }
        }
        int length = str4.length();
        int length2 = str3.length();
        for (int i3 = 0; i3 < length; i3++) {
            byteArray[i3] = (byte) (byteArray[i3] ^ str3.charAt(i3 % length2));
        }
        for (int i4 = 0; i4 < byteArray.length; i4 = "".length() + 1) {
        }
        return new String(byteArray);
    }

    /* renamed from: ۣ۟ۧ۟, reason: not valid java name and contains not printable characters */
    public static int m44(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: ۧ۟ۦۡ, reason: not valid java name and contains not printable characters */
    public static String m45(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
