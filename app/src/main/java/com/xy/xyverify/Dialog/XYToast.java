package com.xy.xyverify.Dialog;

import android.content.Context;
import android.graphics.Color;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.xy.xyverify.Verify.C0003;
import com.xy.xyverify.Verify.C0004;

/* loaded from: classes.dex */
public class XYToast extends Toast {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f3short = {864, 880, 880, 890, 884, 774, 886};
    LinearLayout MainView;
    TextView Message;
    Context context;
    private XYBorder xyBorder;

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000c. Please report as an issue. */
    private XYToast(Context context) {
        super(context);
        String str;
        Double d;
        Double d2 = null;
        int m49 = C0004.m49("ۣ۟ۡ");
        while (true) {
            switch (m49) {
                case 56352:
                    this.context = context;
                    if (C0003.f10 >= 0) {
                        C0001.f5 = 46;
                    }
                    m49 = C0000.m4("۟ۨۨ");
                case 56572:
                    break;
                case 1746975:
                    initMainView();
                    if (C0003.f10 >= 0) {
                        C0003.f10 = 12;
                        m49 = C0001.m9("ۣۦۢ");
                    } else {
                        m49 = C0002.m14("ۣۧۦ");
                    }
                case 1749787:
                    System.out.println(d2);
                    if (C0001.f5 * (C0001.f5 ^ 3090) <= 0) {
                        C0002.f6 = 43;
                        str = "ۨۤ";
                        d = d2;
                    } else {
                        str = "ۨۤ";
                        d = d2;
                    }
                    m49 = C0000.m4(str);
                    d2 = d;
                case 1750533:
                    this.xyBorder = new XYBorder(-7829368, -1, 1, 1, 1, 1, new float[]{40.0f, 40.0f, 40.0f, 40.0f, 40.0f, 40.0f, 40.0f, 40.0f});
                    m49 = C0001.m9("ۡۡ");
                case 1750660:
                    m49 = (C0001.f5 * C0004.f11) + 2100465;
                case 1750751:
                    m49 = (C0001.f5 - C0004.f11) ^ 55371;
                case 1751589:
                    if (C0004.m46() > 0) {
                        m49 = (C0001.f5 - C0004.f11) ^ 55371;
                    } else if (C0000.f4 + (C0000.f4 % 3507) <= 0) {
                        C0001.m8();
                        m49 = C0001.m9("ۣۤۢ");
                    } else {
                        m49 = C0000.f4 + C0001.f5 + 1754297;
                    }
                case 1754506:
                    initChildView();
                    m49 = C0001.m9("ۣۤۢ");
                case 1755523:
                    d = Double.decode(C0003.m43("Z3owe"));
                    if (C0001.m8() <= 0) {
                        C0003.f10 = 7;
                        m49 = C0000.m4("ۣۣۤ");
                        d2 = d;
                    } else {
                        str = "ۢۦ۟";
                        m49 = C0000.m4(str);
                        d2 = d;
                    }
            }
            return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000a. Please report as an issue. */
    private void initChildView() {
        int m49 = C0004.m49("ۡۥۥ");
        while (true) {
            switch (m49) {
                case 56507:
                    break;
                case 1748801:
                    this.Message = new TextView(this.context);
                    if ((C0001.f5 | (C0003.f10 % 4874)) >= 0) {
                        C0000.f4 = 15;
                    } else {
                        m49 = C0000.m4("ۥۣۡ");
                    }
                case 1752579:
                    new LinearLayout.LayoutParams(-1, -1).gravity = 17;
                    m49 = (C0000.f4 % C0003.f10) ^ 1754396;
                case 1752586:
                    m49 = (C0002.f6 * C0003.f10) + 1781405;
                case 1752644:
                    this.MainView.addView(this.Message);
                    m49 = (C0004.f11 | C0002.f6) + 57036;
                case 1754380:
                    this.Message.setGravity(17);
                    if (C0004.f11 >= 0) {
                        C0000.f4 = 0;
                        m49 = C0000.m4("ۡۥۥ");
                    } else {
                        m49 = (C0000.f4 % C0004.f11) ^ 1754484;
                    }
                case 1754471:
                    setTextColor(Color.parseColor(C0003.m45(f3short, 0, 7, 835)));
                    m49 = C0000.f4 * (C0002.f6 | 1296) <= 0 ? C0001.m9("ۥۣۡ") : C0002.m14("ۥۥۤ");
            }
            return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000d. Please report as an issue. */
    private void initMainView() {
        String str;
        int m49 = C0004.m49("۠۠۠");
        while (true) {
            switch (m49) {
                case 1746755:
                    new LinearLayout.LayoutParams(-2, -2).gravity = 17;
                    if (C0003.m42() <= 0) {
                        C0002.f6 = 36;
                        m49 = C0001.m9("ۤۥۤ");
                    } else {
                        m49 = C0002.m14("ۢۡۡ");
                    }
                case 1747680:
                    this.MainView = new LinearLayout(this.context);
                    m49 = (C0001.f5 * C0003.f10) + 1778699;
                case 1747902:
                    this.MainView.setMinimumHeight(130);
                    if (C0000.f4 <= 0) {
                        C0001.m8();
                        m49 = C0003.m44("ۣۢۢ");
                    }
                case 1747903:
                    setGravity(17, 0, 800);
                    if (C0003.f10 - (C0003.f10 * (-1380)) >= 0) {
                        C0004.m46();
                        m49 = C0001.m9("۠ۧۥ");
                    } else {
                        m49 = C0000.m4("ۥۢۥ");
                    }
                case 1749634:
                    this.MainView.setGravity(17);
                    m49 = (C0000.f4 ^ (C0003.f10 * 6309)) >= 0 ? C0000.m4("ۥۢ۠") : (C0002.f6 | C0003.f10) + 1749699;
                case 1749697:
                    this.MainView.setMinimumWidth(200);
                    if (C0002.f6 <= 0) {
                        str = "۠ۧۦ";
                        m49 = C0004.m49(str);
                    } else {
                        m49 = C0000.m4("۠ۧۥ");
                    }
                case 1751683:
                    break;
                case 1752547:
                    if (C0001.f5 <= 0) {
                        C0001.f5 = 25;
                        m49 = C0002.m14("ۡۦۦ");
                    } else {
                        m49 = (C0004.f11 - C0001.f5) + 1748887;
                    }
                case 1752552:
                    setView(this.MainView);
                    if (C0002.m15() <= 0) {
                        C0002.m15();
                        m49 = C0000.m4("ۥۢۥ");
                    } else {
                        str = "ۤۥۤ";
                        m49 = C0004.m49(str);
                    }
                case 1753483:
                    this.MainView.setBackgroundColor(-1);
                    m49 = (C0000.f4 - C0000.f4) ^ 1754595;
                case 1753484:
                    setRadius(30.0f);
                    if (C0000.f4 <= 0) {
                        m49 = C0001.m9("ۦۡۧ");
                    } else {
                        str = "۠ۧۦ";
                        m49 = C0004.m49(str);
                    }
                case 1754595:
                    this.MainView.setPadding(20, 10, 20, 10);
                    m49 = C0001.m8() <= 0 ? C0001.m9("ۦۡۦ") : (C0001.f5 | C0003.f10) + 1753486;
            }
            return;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0041, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void lambda$makeTextShow$0(android.content.Context r2, java.lang.String r3) {
        /*
            java.lang.String r0 = "ۡۨ۟"
            int r0 = com.xy.xyverify.Verify.C0003.m44(r0)
        L6:
            switch(r0) {
                case 1748888: goto La;
                case 1753482: goto L23;
                case 1753606: goto L41;
                default: goto L9;
            }
        L9:
            goto L6
        La:
            com.xy.xyverify.Dialog.XYToast r0 = new com.xy.xyverify.Dialog.XYToast
            r0.<init>(r2)
            com.xy.xyverify.Dialog.XYToast r0 = r0.setMessage(r3)
            r0.show()
            int r0 = com.xy.xyverify.Dialog.C0000.m7()
            if (r0 > 0) goto L37
            java.lang.String r0 = "ۦۡۥ"
            int r0 = com.xy.xyverify.Dialog.C0000.m4(r0)
            goto L6
        L23:
            int r0 = com.xy.xyverify.Verify.C0004.m46()
            if (r0 > 0) goto L34
            r0 = 99
            com.xy.xyverify.Dialog.C0001.f5 = r0
            java.lang.String r0 = "ۢ۠ۢ"
        L2f:
            int r0 = com.xy.xyverify.Dialog.C0002.m14(r0)
            goto L6
        L34:
            java.lang.String r0 = "ۡۨ۟"
            goto L2f
        L37:
            int r0 = com.xy.xyverify.Dialog.C0001.f5
            int r1 = com.xy.xyverify.Verify.C0003.f10
            r0 = r0 ^ r1
            r1 = 1754028(0x1ac3ac, float:2.457917E-39)
            int r0 = r0 + r1
            goto L6
        L41:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xy.xyverify.Dialog.XYToast.lambda$makeTextShow$0(android.content.Context, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0023, code lost:
    
        return new com.xy.xyverify.Dialog.XYToast(r2).setMessage(r3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.xy.xyverify.Dialog.XYToast makeText(android.content.Context r2, java.lang.String r3) {
        /*
            java.lang.String r0 = "ۢ۟ۡ"
            int r0 = com.xy.xyverify.Dialog.C0000.m4(r0)
        L6:
            switch(r0) {
                case 1748798: goto La;
                case 1749572: goto L1a;
                default: goto L9;
            }
        L9:
            goto L6
        La:
            int r0 = com.xy.xyverify.Verify.C0003.f10
            int r1 = com.xy.xyverify.Verify.C0004.f11
            int r1 = r1 % 1334
            int r0 = r0 / r1
            if (r0 == 0) goto L24
            java.lang.String r0 = "ۧۡۡ"
            int r0 = com.xy.xyverify.Dialog.C0001.m9(r0)
            goto L6
        L1a:
            com.xy.xyverify.Dialog.XYToast r0 = new com.xy.xyverify.Dialog.XYToast
            r0.<init>(r2)
            com.xy.xyverify.Dialog.XYToast r0 = r0.setMessage(r3)
            return r0
        L24:
            int r0 = com.xy.xyverify.Verify.C0003.f10
            int r1 = com.xy.xyverify.Verify.C0004.f11
            int r0 = r0 - r1
            r1 = 1748915(0x1aafb3, float:2.450752E-39)
            int r0 = r0 + r1
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xy.xyverify.Dialog.XYToast.makeText(android.content.Context, java.lang.String):com.xy.xyverify.Dialog.XYToast");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0038, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void makeTextShow(final android.content.Context r2, final java.lang.String r3) {
        /*
            java.lang.String r0 = "ۨۥ"
            int r0 = com.xy.xyverify.Verify.C0004.m49(r0)
        L6:
            switch(r0) {
                case 56573: goto La;
                case 1746721: goto L38;
                case 1747902: goto L25;
                default: goto L9;
            }
        L9:
            goto L6
        La:
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            com.xy.xyverify.Dialog.XYToast$$ExternalSyntheticLambda0 r1 = new com.xy.xyverify.Dialog.XYToast$$ExternalSyntheticLambda0
            r1.<init>(r2, r3)
            r0.post(r1)
            int r0 = com.xy.xyverify.Dialog.C0001.f5
            int r1 = com.xy.xyverify.Dialog.C0000.f4
            r0 = r0 | r1
            r1 = 1745723(0x1aa33b, float:2.446279E-39)
            int r0 = r0 + r1
            goto L6
        L25:
            int r0 = com.xy.xyverify.Verify.C0004.m46()
            if (r0 > 0) goto L35
            com.xy.xyverify.Dialog.C0000.m7()
            java.lang.String r0 = "ۡۧۢ"
        L30:
            int r0 = com.xy.xyverify.Dialog.C0002.m14(r0)
            goto L6
        L35:
            java.lang.String r0 = "ۨۥ"
            goto L30
        L38:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xy.xyverify.Dialog.XYToast.makeTextShow(android.content.Context, java.lang.String):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    public XYToast setBackGroundColor(int i) {
        String str;
        int m9 = C0001.m9("ۣۡۢ");
        while (true) {
            switch (m9) {
                case 1748706:
                    this.xyBorder.InColor = i;
                    if (C0002.f6 + (C0002.f6 % (-7515)) <= 0) {
                        C0004.f11 = 27;
                    }
                    m9 = C0000.m4("ۨ۟ۢ");
                case 1754438:
                    if (C0002.f6 <= 0) {
                        C0000.m7();
                        str = "ۣۥۣ";
                    } else {
                        str = "ۣۡۢ";
                    }
                    m9 = C0002.m14(str);
                case 1754597:
                    break;
                case 1755339:
                    this.MainView.setBackground(DialogUtils.GetCustomBorder(this.xyBorder));
                    if (C0000.m7() <= 0) {
                        m9 = C0003.m44("ۣۡۢ");
                    } else {
                        str = "ۧۦۤ";
                        m9 = C0002.m14(str);
                    }
            }
            return this;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005d, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.xy.xyverify.Dialog.XYToast setBorderColor(int r3) {
        /*
            r2 = this;
            java.lang.String r0 = "ۤۥۤ"
            int r0 = com.xy.xyverify.Verify.C0004.m49(r0)
        L6:
            switch(r0) {
                case 1747806: goto La;
                case 1750562: goto L21;
                case 1750722: goto L5d;
                case 1751683: goto L49;
                default: goto L9;
            }
        L9:
            goto L6
        La:
            int r0 = com.xy.xyverify.Dialog.C0002.f6
            int r1 = com.xy.xyverify.Dialog.C0002.f6
            int r1 = r1 + (-2654)
            int r0 = r0 - r1
            if (r0 > 0) goto L1a
            java.lang.String r0 = "ۨۢۤ"
            int r0 = com.xy.xyverify.Dialog.C0000.m4(r0)
            goto L6
        L1a:
            java.lang.String r0 = "ۤۥۤ"
            int r0 = com.xy.xyverify.Dialog.C0000.m4(r0)
            goto L6
        L21:
            android.widget.LinearLayout r0 = r2.MainView
            com.xy.xyverify.Dialog.XYBorder r1 = r2.xyBorder
            android.graphics.drawable.LayerDrawable r1 = com.xy.xyverify.Dialog.DialogUtils.GetCustomBorder(r1)
            r0.setBackground(r1)
            int r0 = com.xy.xyverify.Verify.C0003.f10
            int r1 = com.xy.xyverify.Dialog.C0001.f5
            int r1 = r1 + 7353
            int r0 = r0 / r1
            if (r0 == 0) goto L3f
            com.xy.xyverify.Dialog.C0000.m7()
            java.lang.String r0 = "۠ۤۢ"
            int r0 = com.xy.xyverify.Verify.C0004.m49(r0)
            goto L6
        L3f:
            int r0 = com.xy.xyverify.Verify.C0003.f10
            int r1 = com.xy.xyverify.Verify.C0003.f10
            int r0 = r0 % r1
            r1 = 1750722(0x1ab6c2, float:2.453284E-39)
            int r0 = r0 + r1
            goto L6
        L49:
            com.xy.xyverify.Dialog.XYBorder r0 = r2.xyBorder
            r0.OutColor = r3
            int r0 = com.xy.xyverify.Verify.C0004.f11
            int r1 = com.xy.xyverify.Dialog.C0002.f6
            int r1 = r1 / 2516
            r0 = r0 ^ r1
            if (r0 < 0) goto L56
        L56:
            java.lang.String r0 = "ۣ۠۟"
            int r0 = com.xy.xyverify.Verify.C0004.m49(r0)
            goto L6
        L5d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xy.xyverify.Dialog.XYToast.setBorderColor(int):com.xy.xyverify.Dialog.XYToast");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    public XYToast setMessage(String str) {
        String str2;
        int m44 = C0003.m44("۟ۤۤ");
        while (true) {
            switch (m44) {
                case 1746847:
                    this.Message.setText(str);
                    if (C0002.f6 <= 0) {
                        C0001.f5 = 63;
                        m44 = C0004.m49("ۣۣۨ");
                    } else {
                        str2 = "ۡۢۦ";
                        m44 = C0003.m44(str2);
                    }
                case 1748709:
                    break;
                case 1750814:
                    if (C0000.f4 <= 0) {
                        C0000.f4 = 29;
                        str2 = "ۢۡ";
                    } else {
                        str2 = "۟ۤۤ";
                    }
                    m44 = C0003.m44(str2);
            }
            return this;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.xy.xyverify.Dialog.XYToast setRadius(float r4) {
        /*
            r3 = this;
            java.lang.String r0 = "ۥۣۤ"
            int r0 = com.xy.xyverify.Verify.C0004.m49(r0)
        L6:
            switch(r0) {
                case 1747839: goto La;
                case 1748803: goto L24;
                case 1749670: goto Lb;
                case 1752582: goto L39;
                default: goto L9;
            }
        L9:
            goto L6
        La:
            return r3
        Lb:
            int r0 = com.xy.xyverify.Verify.C0003.f10
            if (r0 < 0) goto L1a
            r0 = 15
            com.xy.xyverify.Verify.C0003.f10 = r0
            java.lang.String r0 = "ۨۨۡ"
            int r0 = com.xy.xyverify.Verify.C0004.m49(r0)
            goto L6
        L1a:
            int r0 = com.xy.xyverify.Verify.C0003.f10
            int r1 = com.xy.xyverify.Verify.C0004.f11
            int r0 = r0 % r1
            r1 = -1752648(0xffffffffffe541b8, float:NaN)
            r0 = r0 ^ r1
            goto L6
        L24:
            android.widget.LinearLayout r0 = r3.MainView
            com.xy.xyverify.Dialog.XYBorder r1 = r3.xyBorder
            android.graphics.drawable.LayerDrawable r1 = com.xy.xyverify.Dialog.DialogUtils.GetCustomBorder(r1)
            r0.setBackground(r1)
            int r0 = com.xy.xyverify.Dialog.C0001.f5
            int r1 = com.xy.xyverify.Dialog.C0001.f5
            int r0 = r0 * r1
            r1 = 1513583(0x17186f, float:2.120982E-39)
            int r0 = r0 + r1
            goto L6
        L39:
            com.xy.xyverify.Dialog.XYBorder r0 = r3.xyBorder
            r1 = 8
            float[] r1 = new float[r1]
            r2 = 0
            r1[r2] = r4
            r2 = 1
            r1[r2] = r4
            r2 = 2
            r1[r2] = r4
            r2 = 3
            r1[r2] = r4
            r2 = 4
            r1[r2] = r4
            r2 = 5
            r1[r2] = r4
            r2 = 6
            r1[r2] = r4
            r2 = 7
            r1[r2] = r4
            r0.radius = r1
            java.lang.String r0 = "ۡۥۧ"
            int r0 = com.xy.xyverify.Dialog.C0002.m14(r0)
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xy.xyverify.Dialog.XYToast.setRadius(float):com.xy.xyverify.Dialog.XYToast");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    public XYToast setRadius(int i, int i2, int i3, int i4, int i5, int i6, float[] fArr) {
        String str;
        String str2;
        int m9 = C0001.m9("۠ۦۢ");
        while (true) {
            switch (m9) {
                case 1746787:
                    this.MainView.setBackground(DialogUtils.GetCustomBorder(this.xyBorder));
                    if (C0001.f5 % (C0001.f5 + 1056) <= 0) {
                        C0002.m15();
                        str2 = "۟ۢۦ";
                        m9 = C0001.m9(str2);
                    } else {
                        str2 = "ۥ۟۠";
                        m9 = C0001.m9(str2);
                    }
                case 1746943:
                    this.xyBorder.InColor = i2;
                    str = C0004.f11 % (C0004.f11 ^ 2833) >= 0 ? "ۥۢ۟" : "ۧۥۢ";
                    m9 = C0004.m49(str);
                case 1747866:
                    this.xyBorder.bottomWidth = i6;
                    if (C0001.m8() <= 0) {
                        C0002.f6 = 3;
                    } else {
                        m9 = (C0001.f5 | C0001.f5) ^ 1749895;
                    }
                case 1747868:
                    this.xyBorder.OutColor = i;
                    m9 = (C0003.f10 / C0000.f4) + 1746943;
                case 1749603:
                    this.xyBorder.radius = fArr;
                    str2 = "۟ۢۦ";
                    m9 = C0001.m9(str2);
                case 1749633:
                    this.xyBorder.topWidth = i5;
                    m9 = (C0002.f6 | C0003.f10) + 1747868;
                case 1751622:
                    this.xyBorder.rightWidth = i4;
                    str = "ۢۡ۠";
                    m9 = C0004.m49(str);
                case 1752454:
                    break;
                case 1752546:
                    m9 = (C0003.f10 | C0001.f5) + 1747870;
                case 1754564:
                    this.xyBorder.leftWidth = i3;
                    m9 = (C0003.f10 ^ (C0001.f5 + 2550)) >= 0 ? C0001.m9("ۧۥۢ") : C0002.m14("ۣۤۥ");
            }
            return this;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0036, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.xy.xyverify.Dialog.XYToast setTextColor(int r3) {
        /*
            r2 = this;
            java.lang.String r0 = "ۢۥۧ"
            int r0 = com.xy.xyverify.Dialog.C0000.m4(r0)
        L6:
            switch(r0) {
                case 1749607: goto La;
                case 1749764: goto L19;
                case 1751744: goto L36;
                default: goto L9;
            }
        L9:
            goto L6
        La:
            int r0 = com.xy.xyverify.Dialog.C0001.f5
            if (r0 > 0) goto L33
            r0 = 68
            com.xy.xyverify.Verify.C0004.f11 = r0
            java.lang.String r0 = "ۤۨ۟"
        L14:
            int r0 = com.xy.xyverify.Verify.C0004.m49(r0)
            goto L6
        L19:
            android.widget.TextView r0 = r2.Message
            r0.setTextColor(r3)
            int r0 = com.xy.xyverify.Dialog.C0002.f6
            if (r0 > 0) goto L29
            java.lang.String r0 = "ۢۥۧ"
            int r0 = com.xy.xyverify.Dialog.C0000.m4(r0)
            goto L6
        L29:
            int r0 = com.xy.xyverify.Verify.C0003.f10
            int r1 = com.xy.xyverify.Verify.C0003.f10
            int r0 = r0 * r1
            r1 = 1747388(0x1aa9bc, float:2.448612E-39)
            int r0 = r0 + r1
            goto L6
        L33:
            java.lang.String r0 = "ۢۥۧ"
            goto L14
        L36:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xy.xyverify.Dialog.XYToast.setTextColor(int):com.xy.xyverify.Dialog.XYToast");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002d, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.xy.xyverify.Dialog.XYToast setTextSize(int r3) {
        /*
            r2 = this;
            java.lang.String r0 = "۟ۢۡ"
            int r0 = com.xy.xyverify.Dialog.C0000.m4(r0)
        L6:
            switch(r0) {
                case 56451: goto La;
                case 1746782: goto L1a;
                case 1751779: goto L2d;
                default: goto L9;
            }
        L9:
            goto L6
        La:
            int r0 = com.xy.xyverify.Verify.C0003.m42()
            if (r0 > 0) goto L17
            java.lang.String r0 = "۟ۥۨ"
        L12:
            int r0 = com.xy.xyverify.Dialog.C0001.m9(r0)
            goto L6
        L17:
            java.lang.String r0 = "۟ۢۡ"
            goto L12
        L1a:
            android.widget.TextView r0 = r2.Message
            float r1 = (float) r3
            r0.setTextSize(r1)
            int r0 = com.xy.xyverify.Dialog.C0002.m15()
            if (r0 > 0) goto L26
        L26:
            java.lang.String r0 = "ۤۨۧ"
            int r0 = com.xy.xyverify.Dialog.C0001.m9(r0)
            goto L6
        L2d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xy.xyverify.Dialog.XYToast.setTextSize(int):com.xy.xyverify.Dialog.XYToast");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.xy.xyverify.Dialog.XYToast setToastPosition(int r3, int r4, int r5) {
        /*
            r2 = this;
            java.lang.String r0 = "ۢۨ۠"
            int r0 = com.xy.xyverify.Verify.C0003.m44(r0)
        L6:
            switch(r0) {
                case 1747716: goto La;
                case 1749850: goto Lb;
                case 1755585: goto L24;
                default: goto L9;
            }
        L9:
            goto L6
        La:
            return r2
        Lb:
            r2.setGravity(r3, r4, r5)
            int r0 = com.xy.xyverify.Dialog.C0001.f5
            int r1 = com.xy.xyverify.Dialog.C0000.f4
            int r1 = r1 % 2815
            int r0 = r0 * r1
            if (r0 > 0) goto L21
            com.xy.xyverify.Verify.C0004.m46()
            java.lang.String r0 = "ۨۧ۠"
        L1c:
            int r0 = com.xy.xyverify.Dialog.C0001.m9(r0)
            goto L6
        L21:
            java.lang.String r0 = "۠ۡۥ"
            goto L1c
        L24:
            int r0 = com.xy.xyverify.Dialog.C0000.f4
            int r1 = com.xy.xyverify.Dialog.C0000.f4
            int r0 = r0 - r1
            r1 = 1749850(0x1ab35a, float:2.452062E-39)
            int r0 = r0 + r1
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xy.xyverify.Dialog.XYToast.setToastPosition(int, int, int):com.xy.xyverify.Dialog.XYToast");
    }
}
