package com.xy.xyverify.Dialog;

import com.xy.xyverify.Verify.C0003;
import com.xy.xyverify.Verify.C0004;

/* loaded from: classes.dex */
public class XYBorder {
    int InColor;
    int OutColor;
    int bottomWidth;
    int leftWidth;
    float[] radius;
    int rightWidth;
    int topWidth;

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000a. Please report as an issue. */
    public XYBorder(int i, int i2, int i3, int i4, int i5, int i6, float[] fArr) {
        String str;
        String str2;
        String str3;
        String str4;
        float f2 = 0.0f;
        int m9 = C0001.m9("ۨۥۦ");
        while (true) {
            switch (m9) {
                case 56327:
                    this.InColor = i2;
                    m9 = (C0004.f11 | C0004.f11) ^ (-1748020);
                case 56538:
                    System.out.println(f2);
                    str2 = "ۡۨۨ";
                    m9 = C0001.m9(str2);
                case 1748609:
                    this.rightWidth = i4;
                    m9 = C0003.f10 + (C0003.f10 + (-8377)) >= 0 ? C0001.m9("ۡۢۢ") : (C0002.f6 / C0000.f4) ^ 1748765;
                case 1748675:
                    f2 = Float.parseFloat(C0000.m6("kxKbsygDK56YrW"));
                    if ((C0000.f4 ^ (C0003.f10 * 1655)) >= 0) {
                        C0003.m42();
                        str3 = "ۣۣۡ";
                        m9 = C0000.m4(str3);
                    } else {
                        str4 = "ۧۡ";
                        m9 = C0000.m4(str4);
                    }
                case 1748705:
                    this.leftWidth = i3;
                    str = "ۡ۟۟";
                    m9 = C0004.m49(str);
                case 1748765:
                    this.topWidth = i5;
                    m9 = (C0001.f5 * C0000.f4) + 1394357;
                case 1748897:
                    break;
                case 1750566:
                    this.radius = fArr;
                    if ((C0000.f4 ^ (C0004.f11 ^ 2055)) >= 0) {
                        str4 = "ۣۡۡ";
                        m9 = C0000.m4(str4);
                    } else {
                        m9 = C0004.m49("ۥ۟ۤ");
                    }
                case 1750597:
                    m9 = C0002.m14("ۡۨۨ");
                case 1752458:
                    if (C0004.m46() > 0) {
                        m9 = C0002.m14("ۡۨۨ");
                    } else {
                        str4 = "ۣۡۡ";
                        m9 = C0000.m4(str4);
                    }
                case 1753485:
                    this.bottomWidth = i6;
                    if ((C0004.f11 | (C0002.f6 / 7635)) >= 0) {
                        str2 = "ۧۡ";
                        m9 = C0001.m9(str2);
                    } else {
                        str3 = "ۣۣ۠";
                        m9 = C0000.m4(str3);
                    }
                case 1755337:
                    if (C0003.f10 >= 0) {
                        C0000.f4 = 29;
                        str = "ۣ۠ۥ";
                    } else {
                        str = "ۨۥۦ";
                    }
                    m9 = C0004.m49(str);
                case 1755529:
                    this.OutColor = i;
                    m9 = (C0001.f5 ^ C0001.f5) + 56327;
            }
            return;
        }
    }
}
