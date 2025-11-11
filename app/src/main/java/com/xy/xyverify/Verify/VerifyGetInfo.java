package com.xy.xyverify.Verify;

import com.xy.xyverify.Dialog.DialogUtils;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
public class VerifyGetInfo {
    private static String APPKEY = "x3AASf3Ma36KhkhR";
    private static String BaseURL = "https://yz.uuu8.vip/api.php";
    private static String RC4KEY = "1oSke4MjjoU10656";
    private static String APPID = "10656";
    private static String NoticeURL = "?api=notice&app=" + APPID;
    private static String UpdateURL = "?api=ini&app=" + APPID;
    private static String LoginURL = "?api=kmlogon&app=" + APPID;
    private static String DetachURL = "?api=kmunmachine&app=" + APPID;
    public static int Code = 200;

    public static String Login(String str, String str2) {
        String valueOf = String.valueOf(System.currentTimeMillis());
        try {
            return DeBody((String) DialogUtils.sendInTernet(BaseURL + LoginURL + "&data=" + Rc4Util.encryRC4String("&kami=" + str + "&markcode=" + str2 + "&t=" + valueOf + "&sign=" + GetMd5(str, str2, valueOf), RC4KEY, "UTF-8"), "GET", "", null).get("result"));
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public static String detach(String str, String str2) {
        String valueOf = String.valueOf(System.currentTimeMillis());
        try {
            return DeBody((String) DialogUtils.sendInTernet(BaseURL + DetachURL + "&data=" + Rc4Util.encryRC4String("&kami=" + str + "&markcode=" + str2 + "&t=" + valueOf + "&sign=" + GetMd5(str, str2, valueOf), RC4KEY, "UTF-8"), "GET", "", null).get("result"));
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public static String Notice() {
        return DeBody(DialogUtils.sendInTernet(BaseURL + NoticeURL, "GET", "", null).get("result").toString());
    }

    public static String Update() {
        return DeBody(DialogUtils.sendInTernet(BaseURL + UpdateURL, "GET", "", null).get("result").toString());
    }

    private static String DeBody(String str) {
        try {
            return Rc4Util.decryRC4(str, RC4KEY, "UTF-8");
        } catch (Exception e2) {
            e2.printStackTrace();
            try {
                return Rc4Util.decryRC4(str.substring(0, str.length() - 1), RC4KEY, "UTF-8");
            } catch (Exception e3) {
                e3.printStackTrace();
                try {
                    return Rc4Util.decryRC4(str.replaceAll("\n", ""), RC4KEY, "UTF-8");
                } catch (Exception e4) {
                    e4.printStackTrace();
                    return "";
                }
            }
        }
    }

    private static String toHex(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b2 : bArr) {
            sb.append(String.format("%02x", Byte.valueOf(b2)));
        }
        return sb.toString();
    }

    private static String GetMd5(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        if (!str.equals("")) {
            sb.append("kami=").append(str);
        }
        if (!str2.equals("")) {
            sb.append("&markcode=").append(str2);
        }
        sb.append("&t=").append(str3).append("&").append(APPKEY);
        String sb2 = sb.toString();
        if (sb2.charAt(0) == '&') {
            sb2 = sb2.substring(1);
        }
        System.out.println(sb2);
        try {
            return toHex(MessageDigest.getInstance("MD5").digest(sb2.getBytes()));
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException(e2);
        }
    }
}
