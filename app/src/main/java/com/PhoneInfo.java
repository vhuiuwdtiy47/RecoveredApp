package com;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
public class PhoneInfo {
    public static String getProperty(String str, String str2) {
        try {
            try {
                Class<?> cls = Class.forName("android.os.SystemProperties");
                Class<?>[] clsArr = new Class[2];
                try {
                    clsArr[0] = Class.forName("java.lang.String");
                    try {
                        clsArr[1] = Class.forName("java.lang.String");
                        return (String) cls.getMethod("get", clsArr).invoke(cls, str, str2);
                    } catch (ClassNotFoundException e2) {
                        throw new NoClassDefFoundError(e2.getMessage());
                    }
                } catch (ClassNotFoundException e3) {
                    throw new NoClassDefFoundError(e3.getMessage());
                }
            } catch (Exception e4) {
                e4.printStackTrace();
                return str2;
            }
        } catch (Throwable th) {
            return str2;
        }
    }

    public static synchronized String md5Password(String str) {
        String upperCase;
        synchronized (PhoneInfo.class) {
            StringBuffer stringBuffer = new StringBuffer();
            try {
                for (byte b2 : MessageDigest.getInstance("md5").digest(str.getBytes())) {
                    String hexString = Integer.toHexString(b2 & 255);
                    if (hexString.length() == 1) {
                        stringBuffer.append("0");
                    }
                    stringBuffer.append(hexString);
                }
            } catch (NoSuchAlgorithmException e2) {
                e2.printStackTrace();
            }
            upperCase = stringBuffer.toString().toUpperCase();
        }
        return upperCase;
    }
}
