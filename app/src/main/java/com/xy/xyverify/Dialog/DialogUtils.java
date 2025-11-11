package com.xy.xyverify.Dialog;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import com.xy.xyverify.Verify.C0003;
import com.xy.xyverify.Verify.C0004;

/* loaded from: classes.dex */
public class DialogUtils {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f0short = {399, 400, 396, 395, 559, 2920, 1563, 1548, 1562, 1564, 1541, 1565};

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000b. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:12:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public DialogUtils() {
        /*
            r4 = this;
            r4.<init>()
            r0 = 0
            java.lang.String r2 = "ۡۦۦ"
            int r2 = com.xy.xyverify.Dialog.C0001.m9(r2)
        Lb:
            switch(r2) {
                case 56415: goto Lf;
                case 1747648: goto L38;
                case 1747867: goto L54;
                case 1748799: goto L20;
                case 1748833: goto L10;
                case 1753451: goto L64;
                default: goto Le;
            }
        Le:
            goto Lb
        Lf:
            return
        L10:
            int r2 = com.xy.xyverify.Dialog.C0001.m8()
            if (r2 > 0) goto L64
            int r2 = com.xy.xyverify.Dialog.C0002.f6
            int r3 = com.xy.xyverify.Verify.C0003.f10
            r2 = r2 ^ r3
            r3 = -1748625(0xffffffffffe5516f, float:NaN)
            r2 = r2 ^ r3
            goto Lb
        L20:
            java.lang.String r0 = "YJhu4x"
            java.lang.String r0 = com.xy.xyverify.Verify.C0003.m43(r0)
            double r0 = java.lang.Double.parseDouble(r0)
            int r2 = com.xy.xyverify.Verify.C0003.f10
            if (r2 < 0) goto L43
            com.xy.xyverify.Dialog.C0001.m8()
            java.lang.String r2 = "ۡۦۦ"
            int r2 = com.xy.xyverify.Dialog.C0000.m4(r2)
            goto Lb
        L38:
            java.io.PrintStream r2 = java.lang.System.out
            r2.println(r0)
            int r2 = com.xy.xyverify.Dialog.C0002.m15()
            if (r2 > 0) goto L4a
        L43:
            java.lang.String r2 = "۠۟۟"
            int r2 = com.xy.xyverify.Verify.C0004.m49(r2)
            goto Lb
        L4a:
            int r2 = com.xy.xyverify.Dialog.C0002.f6
            int r3 = com.xy.xyverify.Dialog.C0002.f6
            int r2 = r2 + r3
            r3 = 55427(0xd883, float:7.767E-41)
            int r2 = r2 + r3
            goto Lb
        L54:
            int r2 = com.xy.xyverify.Dialog.C0001.m8()
            if (r2 > 0) goto L61
            java.lang.String r2 = "ۦۤۦ"
        L5c:
            int r2 = com.xy.xyverify.Verify.C0004.m49(r2)
            goto Lb
        L61:
            java.lang.String r2 = "ۡۦۦ"
            goto L5c
        L64:
            int r2 = com.xy.xyverify.Dialog.C0001.m8()
            if (r2 > 0) goto L74
            com.xy.xyverify.Dialog.C0000.m7()
            java.lang.String r2 = "ۥۨۥ"
        L6f:
            int r2 = com.xy.xyverify.Dialog.C0002.m14(r2)
            goto Lb
        L74:
            java.lang.String r2 = "ۣۢ"
            goto L6f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xy.xyverify.Dialog.DialogUtils.<init>():void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0007. Please report as an issue. */
    public static void DialogNotice(Context context, String str, String str2) {
        String str3;
        IOSDialog iOSDialog = null;
        int m4 = C0000.m4("ۢۨۡ");
        while (true) {
            switch (m4) {
                case 56353:
                    iOSDialog.show();
                    str3 = "ۦۥۤ";
                    m4 = C0002.m14(str3);
                case 1749851:
                    iOSDialog = IOSDialog.Make(context).setInput().setTitle(str).setMessage(str2);
                    if (C0004.m46() <= 0) {
                        str3 = "ۣۦۢ";
                        m4 = C0002.m14(str3);
                    } else {
                        m4 = (C0002.f6 ^ C0004.f11) + 1752514;
                    }
                case 1750751:
                    m4 = (C0000.f4 / C0003.f10) ^ (-1749842);
                case 1751685:
                    iOSDialog.setCancelable(false);
                    m4 = (C0002.f6 ^ (C0004.f11 / (-4597))) <= 0 ? C0004.m49("ۢۨۡ") : (C0002.f6 - C0004.f11) + 55136;
                case 1753605:
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000c. Please report as an issue. */
    public static LayerDrawable GetCustomBorder(int i, int i2, int i3, int i4, int i5, int i6, float[] fArr) {
        String str;
        String str2;
        int m4 = C0000.m4("۠ۥ۟");
        LayerDrawable layerDrawable = null;
        GradientDrawable gradientDrawable = null;
        GradientDrawable gradientDrawable2 = null;
        while (true) {
            switch (m4) {
                case 56482:
                    layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable2, gradientDrawable});
                    if (C0001.f5 * (C0000.f4 - 3953) >= 0) {
                        C0001.m8();
                        str = "ۦ۟";
                        m4 = C0004.m49(str);
                    } else {
                        str2 = "ۦ۟";
                        m4 = C0003.m44(str2);
                    }
                case 56505:
                    layerDrawable.setLayerInset(1, i3, i5, i4, i6);
                    if (C0003.m42() <= 0) {
                    }
                    m4 = C0003.m44("ۦۦۦ");
                case 56576:
                    gradientDrawable.setColor(i2);
                    m4 = (C0004.f11 * C0004.f11) + 1224051;
                case 1746780:
                    gradientDrawable.setShape(0);
                    if (C0001.m8() <= 0) {
                        m4 = C0004.m49("ۣ۟ۨ");
                    } else {
                        str = "ۧ۟۠";
                        m4 = C0004.m49(str);
                    }
                case 1746842:
                    gradientDrawable2.setColor(i);
                    if ((C0004.f11 ^ (C0002.f6 * 2565)) >= 0) {
                        C0001.f5 = 29;
                        m4 = C0001.m9("ۥۧ");
                    } else {
                        m4 = (C0000.f4 - C0001.f5) + 1750429;
                    }
                case 1746936:
                    GradientDrawable gradientDrawable3 = new GradientDrawable();
                    if (C0004.f11 >= 0) {
                        m4 = C0002.m14("۟ۤ۟");
                        gradientDrawable = gradientDrawable3;
                    } else {
                        m4 = (C0003.f10 - C0004.f11) + 55919;
                        gradientDrawable = gradientDrawable3;
                    }
                case 1746970:
                    gradientDrawable2.setCornerRadii(fArr);
                    if (C0002.f6 <= 0) {
                        C0003.m42();
                        m4 = C0002.m14("ۧ۟۠");
                    } else {
                        m4 = (C0000.f4 + C0004.f11) ^ 1746923;
                    }
                case 1747834:
                    GradientDrawable gradientDrawable4 = new GradientDrawable();
                    m4 = (C0001.f5 % C0000.f4) + 1746358;
                    gradientDrawable2 = gradientDrawable4;
                case 1750687:
                    gradientDrawable2.setShape(0);
                    m4 = (C0004.f11 * C0001.f5) + 2096902;
                case 1753638:
                    break;
                case 1754376:
                    gradientDrawable.setCornerRadii(fArr);
                    if (C0003.f10 + C0002.f6 + 9020 <= 0) {
                        C0001.f5 = 46;
                        str2 = "ۨۥ۟";
                        m4 = C0003.m44(str2);
                    } else {
                        m4 = (C0001.f5 % C0001.f5) ^ 56482;
                    }
                case 1755522:
                    m4 = C0003.m44("۠ۥ۟");
            }
            return layerDrawable;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000c. Please report as an issue. */
    public static LayerDrawable GetCustomBorder(XYBorder xYBorder) {
        String str;
        String str2;
        GradientDrawable gradientDrawable;
        int m9 = C0001.m9("۟ۨۦ");
        LayerDrawable layerDrawable = null;
        GradientDrawable gradientDrawable2 = null;
        GradientDrawable gradientDrawable3 = null;
        while (true) {
            switch (m9) {
                case 56419:
                    if (C0002.f6 - (C0004.f11 ^ 1154) <= 0) {
                        C0000.f4 = 46;
                        m9 = C0001.m9("ۡۨ۟");
                    } else {
                        m9 = (C0001.f5 / C0000.f4) + 1746973;
                    }
                case 56451:
                    gradientDrawable = new GradientDrawable();
                    str2 = "ۣۨۥ";
                    m9 = C0003.m44(str2);
                    gradientDrawable2 = gradientDrawable;
                case 56514:
                    gradientDrawable3.setColor(xYBorder.OutColor);
                    if (C0004.f11 >= 0) {
                        str2 = "ۤۧ";
                        gradientDrawable = gradientDrawable2;
                        m9 = C0003.m44(str2);
                        gradientDrawable2 = gradientDrawable;
                    } else {
                        m9 = C0001.m9("۟ۦۨ");
                    }
                case 1746913:
                    gradientDrawable3.setShape(0);
                    if (C0002.f6 <= 0) {
                        C0003.m42();
                        str = "ۣۨۥ";
                    } else {
                        str = "ۡۥ۟";
                    }
                    m9 = C0004.m49(str);
                case 1746973:
                    GradientDrawable gradientDrawable4 = new GradientDrawable();
                    m9 = C0000.m4("ۦۨ");
                    gradientDrawable3 = gradientDrawable4;
                case 1747747:
                    layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable3, gradientDrawable2});
                    m9 = (C0004.f11 ^ (C0004.f11 / (-5306))) >= 0 ? C0002.m14("ۣۦ") : (C0003.f10 / C0000.f4) ^ 1755624;
                case 1748795:
                    gradientDrawable3.setCornerRadii(xYBorder.radius);
                    if ((C0004.f11 | (C0001.f5 - 9015)) >= 0) {
                        C0002.m15();
                    } else {
                        m9 = (C0000.f4 ^ C0001.f5) + 55681;
                    }
                case 1749666:
                    break;
                case 1755466:
                    gradientDrawable2.setColor(xYBorder.InColor);
                    if (C0003.f10 >= 0) {
                        C0002.f6 = 85;
                    }
                    m9 = C0000.m4("ۣۨۦ");
                case 1755467:
                    gradientDrawable2.setShape(0);
                    if ((C0001.f5 ^ (C0000.f4 / 8656)) <= 0) {
                        C0004.m46();
                    }
                    m9 = C0004.m49("ۨۤۤ");
                case 1755496:
                    gradientDrawable2.setCornerRadii(xYBorder.radius);
                    if (C0004.m46() <= 0) {
                        C0003.m42();
                        m9 = C0003.m44("ۦۨ");
                    } else {
                        m9 = (C0000.f4 / C0001.f5) ^ 1747746;
                    }
                case 1755624:
                    layerDrawable.setLayerInset(1, xYBorder.leftWidth, xYBorder.topWidth, xYBorder.rightWidth, xYBorder.bottomWidth);
                    m9 = C0003.f10 >= 0 ? C0004.m49("۟ۦۨ") : C0000.m4("ۢۢۢ");
            }
            return layerDrawable;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0007. Please report as an issue. */
    public static GradientDrawable GetRadiusDrawable(float f2, int i) {
        GradientDrawable gradientDrawable = null;
        int m9 = C0001.m9("ۧۥۢ");
        while (true) {
            switch (m9) {
                case 1749667:
                    gradientDrawable.setShape(0);
                    if (C0002.m15() <= 0) {
                        C0000.m7();
                        m9 = C0004.m49("ۧۥۢ");
                    } else {
                        m9 = (C0000.f4 ^ C0002.f6) ^ 1753804;
                    }
                case 1751685:
                    gradientDrawable.setColor(i);
                    m9 = (C0001.f5 ^ C0003.f10) + 1750089;
                case 1751711:
                    m9 = C0003.m44(C0002.f6 <= 0 ? "ۤۡۧ" : "ۧۥۢ");
                case 1753540:
                    gradientDrawable.setCornerRadius(f2);
                    if (C0001.f5 / (C0001.f5 - 9695) != 0) {
                        C0003.f10 = 16;
                        m9 = C0002.m14("ۤۥۦ");
                    } else {
                        m9 = C0003.m44("ۨ۠ۢ");
                    }
                case 1754564:
                    gradientDrawable = new GradientDrawable();
                    if (C0004.f11 >= 0) {
                        C0004.m46();
                        m9 = C0003.m44("ۨ۠ۢ");
                    } else {
                        m9 = (C0002.f6 + C0003.f10) ^ 1751849;
                    }
                case 1755370:
                    break;
            }
            return gradientDrawable;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0007. Please report as an issue. */
    public static GradientDrawable GetRadiusDrawable(float[] fArr, int i) {
        String str;
        GradientDrawable gradientDrawable = null;
        int m44 = C0003.m44("ۨ۠ۥ");
        while (true) {
            switch (m44) {
                case 56322:
                    gradientDrawable.setCornerRadii(fArr);
                    if (C0000.f4 - (C0002.f6 ^ 8676) >= 0) {
                        C0001.m8();
                        m44 = C0004.m49("۠ۡ۠");
                    } else {
                        str = "ۣۦۥ";
                        m44 = C0004.m49(str);
                    }
                case 1747711:
                    gradientDrawable.setColor(i);
                    m44 = C0001.m9("ۥۣ۟");
                case 1749641:
                    str = C0004.f11 + (C0000.f4 + 1035) <= 0 ? "ۨۥۡ" : "ۨ۠ۥ";
                    m44 = C0004.m49(str);
                case 1750754:
                    break;
                case 1752457:
                    gradientDrawable.setShape(0);
                    str = "۠ۢ";
                    m44 = C0004.m49(str);
                case 1755373:
                    gradientDrawable = new GradientDrawable();
                    if (C0001.f5 <= 0) {
                        C0000.f4 = 45;
                        m44 = C0001.m9("ۥۣ۟");
                    } else {
                        m44 = C0004.m49("۠ۡ۠");
                    }
            }
            return gradientDrawable;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
    
        return (int) (r2 * r3.getResources().getDisplayMetrics().density);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int dpToPx(int r2, android.content.Context r3) {
        /*
            java.lang.String r0 = "ۣۧۧ"
            int r0 = com.xy.xyverify.Verify.C0003.m44(r0)
        L6:
            switch(r0) {
                case 1753639: goto La;
                case 1754507: goto L1a;
                default: goto L9;
            }
        L9:
            goto L6
        La:
            int r0 = com.xy.xyverify.Dialog.C0000.f4
            int r1 = com.xy.xyverify.Dialog.C0002.f6
            int r1 = r1 + 2740
            r0 = r0 ^ r1
            if (r0 > 0) goto L28
            java.lang.String r0 = "ۥۣۡ"
        L15:
            int r0 = com.xy.xyverify.Dialog.C0000.m4(r0)
            goto L6
        L1a:
            float r0 = (float) r2
            android.content.res.Resources r1 = r3.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            float r0 = r0 * r1
            int r0 = (int) r0
            return r0
        L28:
            java.lang.String r0 = "ۣۧۧ"
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xy.xyverify.Dialog.DialogUtils.dpToPx(int, android.content.Context):int");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x001b. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:208:0x030c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0307 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x05fd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x05f0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:353:0x04a6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:356:0x049e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02f1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0028 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0067 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x005b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map<java.lang.String, java.lang.Object> sendInTernet(java.lang.String r24, java.lang.String r25, java.lang.String r26, java.util.Map<java.lang.String, java.lang.String> r27) {
        /*
            Method dump skipped, instructions count: 1806
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xy.xyverify.Dialog.DialogUtils.sendInTernet(java.lang.String, java.lang.String, java.lang.String, java.util.Map):java.util.Map");
    }
}
