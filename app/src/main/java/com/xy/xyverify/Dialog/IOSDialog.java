package com.xy.xyverify.Dialog;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.xy.xyverify.Verify.C0003;
import com.xy.xyverify.Verify.C0004;

/* loaded from: classes.dex */
public class IOSDialog extends Dialog {
    private static Handler handler;

    /* renamed from: short, reason: not valid java name */
    private static final short[] f1short;
    private LinearLayout ButtonLayout;
    private Button CancelButton;
    private LinearLayout ContentLayout;
    private EditText InputEdit;
    private LinearLayout MainView;
    private TextView MessageView;
    private Button OkButton;
    private Button OtherButton;
    private float Radius;
    private TextView TitleView;
    private Context context;
    private GradientDrawable gradientDrawable;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
    
        return;
     */
    static {
        /*
            java.lang.String r0 = "ۣۤ۠"
            int r0 = com.xy.xyverify.Dialog.C0002.m14(r0)
        L6:
            switch(r0) {
                case 1748828: goto La;
                case 1749760: goto L14;
                case 1750687: goto L39;
                case 1755558: goto L4c;
                default: goto L9;
            }
        L9:
            goto L6
        La:
            int r0 = com.xy.xyverify.Dialog.C0002.f6
            int r1 = com.xy.xyverify.Verify.C0003.f10
            int r0 = r0 - r1
            r1 = 1750191(0x1ab4af, float:2.45254E-39)
            r0 = r0 ^ r1
            goto L6
        L14:
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            com.xy.xyverify.Dialog.IOSDialog.handler = r0
            int r0 = com.xy.xyverify.Dialog.C0000.m7()
            if (r0 > 0) goto L2f
            com.xy.xyverify.Verify.C0003.m42()
            java.lang.String r0 = "ۣۤ۠"
            int r0 = com.xy.xyverify.Verify.C0003.m44(r0)
            goto L6
        L2f:
            int r0 = com.xy.xyverify.Dialog.C0001.f5
            int r1 = com.xy.xyverify.Verify.C0003.f10
            int r0 = r0 + r1
            r1 = 1755140(0x1ac804, float:2.459475E-39)
            r0 = r0 ^ r1
            goto L6
        L39:
            r0 = 16
            short[] r0 = new short[r0]
            r0 = {x0060: FILL_ARRAY_DATA , data: [1434, 1418, 1418, 1408, 1422, 1532, 1420, 2887, 2849, 2902, 2898, 2902, 2897, 2896, 29429, -32449} // fill-array
            com.xy.xyverify.Dialog.IOSDialog.f1short = r0
            int r0 = com.xy.xyverify.Verify.C0003.f10
            int r1 = com.xy.xyverify.Verify.C0004.f11
            int r0 = r0 - r1
            r1 = 1749393(0x1ab191, float:2.451422E-39)
            r0 = r0 ^ r1
            goto L6
        L4c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xy.xyverify.Dialog.IOSDialog.<clinit>():void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0054 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public IOSDialog(android.content.Context r4) {
        /*
            r3 = this;
            r3.<init>(r4)
            r1 = 0
            java.lang.String r0 = "ۣ۠ۡ"
            int r0 = com.xy.xyverify.Dialog.C0000.m4(r0)
        La:
            switch(r0) {
                case 56382: goto Le;
                case 1746814: goto L8c;
                case 1747651: goto L27;
                case 1747718: goto L2d;
                case 1747774: goto L65;
                case 1748611: goto L6f;
                case 1748770: goto Lca;
                case 1748891: goto Lae;
                case 1749671: goto L36;
                case 1749823: goto L4b;
                case 1751529: goto L1a;
                case 1754656: goto La3;
                default: goto Ld;
            }
        Ld:
            goto La
        Le:
            java.io.PrintStream r0 = java.lang.System.out
            r0.println(r1)
            java.lang.String r0 = "ۡۤۥ"
        L15:
            int r0 = com.xy.xyverify.Dialog.C0001.m9(r0)
            goto La
        L1a:
            int r0 = com.xy.xyverify.Dialog.C0002.m15()
            if (r0 > 0) goto L4b
            java.lang.String r0 = "ۡ۟ۡ"
        L22:
            int r0 = com.xy.xyverify.Verify.C0003.m44(r0)
            goto La
        L27:
            r3.initMainView()
            java.lang.String r0 = "ۣ۟ۢ"
            goto L15
        L2d:
            r3.context = r4
            java.lang.String r0 = "۠۟ۢ"
        L31:
            int r0 = com.xy.xyverify.Verify.C0004.m49(r0)
            goto La
        L36:
            r0 = 1112014848(0x42480000, float:50.0)
            r3.Radius = r0
            int r0 = com.xy.xyverify.Dialog.C0002.f6
            if (r0 > 0) goto L41
            java.lang.String r0 = "ۧۨۡ"
            goto L15
        L41:
            int r0 = com.xy.xyverify.Verify.C0004.f11
            int r2 = com.xy.xyverify.Dialog.C0000.f4
            r0 = r0 ^ r2
            r2 = -1747763(0xffffffffffe554cd, float:NaN)
            r0 = r0 ^ r2
            goto La
        L4b:
            int r0 = com.xy.xyverify.Dialog.C0002.f6
            int r2 = com.xy.xyverify.Dialog.C0000.f4
            int r2 = r2 / 2674
            r0 = r0 | r2
            if (r0 > 0) goto L5b
            r0 = 82
            com.xy.xyverify.Dialog.C0000.f4 = r0
            java.lang.String r0 = "ۦۦۣ"
            goto L31
        L5b:
            int r0 = com.xy.xyverify.Dialog.C0001.f5
            int r2 = com.xy.xyverify.Dialog.C0002.f6
            int r0 = r0 * r2
            r2 = 1509674(0x17092a, float:2.115504E-39)
            int r0 = r0 + r2
            goto La
        L65:
            android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
            r0.<init>()
            r3.gradientDrawable = r0
            java.lang.String r0 = "ۢۢۧ"
            goto L31
        L6f:
            java.lang.String r0 = "PuRGccMmJxSOxIl8WlM"
            java.lang.String r0 = com.xy.xyverify.Dialog.C0000.m6(r0)
            float r1 = java.lang.Float.parseFloat(r0)
            int r0 = com.xy.xyverify.Verify.C0004.f11
            int r2 = com.xy.xyverify.Dialog.C0001.f5
            int r2 = r2 / 5309
            int r0 = r0 + r2
            if (r0 < 0) goto L89
            r0 = 77
            com.xy.xyverify.Dialog.C0002.f6 = r0
        L86:
            java.lang.String r0 = "ۡۨۢ"
            goto L22
        L89:
            java.lang.String r0 = "ۢ۠"
            goto L31
        L8c:
            r3.initChildView()
            int r0 = com.xy.xyverify.Dialog.C0002.f6
            int r2 = com.xy.xyverify.Dialog.C0001.f5
            int r2 = r2 % (-2650)
            int r0 = r0 / r2
            if (r0 > 0) goto L86
            com.xy.xyverify.Dialog.C0001.m8()
            java.lang.String r0 = "ۡ۟ۡ"
            int r0 = com.xy.xyverify.Verify.C0004.m49(r0)
            goto La
        La3:
            int r0 = com.xy.xyverify.Dialog.C0000.f4
            int r2 = com.xy.xyverify.Dialog.C0002.f6
            r0 = r0 ^ r2
            r2 = 1746998(0x1aa836, float:2.448066E-39)
            int r0 = r0 + r2
            goto La
        Lae:
            r3.initButton()
            int r0 = com.xy.xyverify.Dialog.C0000.m7()
            if (r0 > 0) goto Lc2
            com.xy.xyverify.Dialog.C0000.m7()
            java.lang.String r0 = "۠ۡۧ"
            int r0 = com.xy.xyverify.Verify.C0004.m49(r0)
            goto La
        Lc2:
            java.lang.String r0 = "ۤ۠ۥ"
            int r0 = com.xy.xyverify.Dialog.C0002.m14(r0)
            goto La
        Lca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xy.xyverify.Dialog.IOSDialog.<init>(android.content.Context):void");
    }

    public static IOSDialog Make(Context context) {
        return new IOSDialog(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003f, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void MakeShow(final android.content.Context r2, final java.lang.String r3, final java.lang.String r4) {
        /*
            java.lang.String r0 = "ۥۣۣ"
            int r0 = com.xy.xyverify.Dialog.C0002.m14(r0)
        L6:
            switch(r0) {
                case 1752581: goto La;
                case 1753447: goto L3f;
                case 1754592: goto L24;
                default: goto L9;
            }
        L9:
            goto L6
        La:
            android.os.Handler r0 = com.xy.xyverify.Dialog.IOSDialog.handler
            com.xy.xyverify.Dialog.IOSDialog$$ExternalSyntheticLambda0 r1 = new com.xy.xyverify.Dialog.IOSDialog$$ExternalSyntheticLambda0
            r1.<init>(r2, r3, r4)
            r0.post(r1)
            int r0 = com.xy.xyverify.Verify.C0004.f11
            int r1 = com.xy.xyverify.Dialog.C0001.f5
            int r1 = r1 + 6204
            int r0 = r0 / r1
            if (r0 == 0) goto L35
            java.lang.String r0 = "ۧۦ۟"
            int r0 = com.xy.xyverify.Dialog.C0000.m4(r0)
            goto L6
        L24:
            int r0 = com.xy.xyverify.Verify.C0004.f11
            if (r0 < 0) goto L32
            com.xy.xyverify.Dialog.C0001.m8()
            java.lang.String r0 = "ۦۣۧ"
        L2d:
            int r0 = com.xy.xyverify.Dialog.C0002.m14(r0)
            goto L6
        L32:
            java.lang.String r0 = "ۥۣۣ"
            goto L2d
        L35:
            int r0 = com.xy.xyverify.Dialog.C0000.f4
            int r1 = com.xy.xyverify.Verify.C0003.f10
            int r0 = r0 % r1
            r1 = 1753431(0x1ac157, float:2.45708E-39)
            int r0 = r0 + r1
            goto L6
        L3f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xy.xyverify.Dialog.IOSDialog.MakeShow(android.content.Context, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0026. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0033 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0359 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x034c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0337 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x032b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0120 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x031b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0314 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0365 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01d5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01e2 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void RefreshButton() {
        /*
            Method dump skipped, instructions count: 1810
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xy.xyverify.Dialog.IOSDialog.RefreshButton():void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0064 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ void access$001(com.xy.xyverify.Dialog.IOSDialog r3) {
        /*
            r0 = 0
            java.lang.String r1 = "ۨ۠ۥ"
            int r2 = com.xy.xyverify.Dialog.C0001.m9(r1)
            r1 = r0
        L8:
            switch(r2) {
                case 56505: goto Lc;
                case 1747936: goto L26;
                case 1750816: goto L77;
                case 1751712: goto L47;
                case 1752549: goto L8d;
                case 1755373: goto L52;
                case 1755584: goto L60;
                default: goto Lb;
            }
        Lb:
            goto L8
        Lc:
            java.lang.String r0 = "qs"
            java.lang.String r0 = com.xy.xyverify.Dialog.C0000.m6(r0)
            int r1 = com.xy.xyverify.Dialog.C0002.f6
            int r2 = com.xy.xyverify.Dialog.C0000.f4
            int r2 = r2 + (-4911)
            int r1 = r1 / r2
            if (r1 == 0) goto L1e
            com.xy.xyverify.Dialog.C0001.m8()
        L1e:
            java.lang.String r1 = "۠ۨۨ"
            int r2 = com.xy.xyverify.Verify.C0003.m44(r1)
            r1 = r0
            goto L8
        L26:
            java.io.PrintStream r0 = java.lang.System.out
            r0.println(r1)
            int r0 = com.xy.xyverify.Verify.C0004.f11
            int r2 = com.xy.xyverify.Dialog.C0000.f4
            r2 = r2 ^ 9982(0x26fe, float:1.3988E-41)
            int r0 = r0 + r2
            if (r0 > 0) goto L3f
            com.xy.xyverify.Dialog.C0001.m8()
            java.lang.String r0 = "ۤۦۢ"
            int r0 = com.xy.xyverify.Dialog.C0000.m4(r0)
            r2 = r0
            goto L8
        L3f:
            java.lang.String r0 = "ۥۢۢ"
        L41:
            int r0 = com.xy.xyverify.Verify.C0004.m49(r0)
            r2 = r0
            goto L8
        L47:
            int r0 = com.xy.xyverify.Dialog.C0001.f5
            int r2 = com.xy.xyverify.Dialog.C0002.f6
            int r0 = r0 * r2
            r2 = 1516277(0x1722f5, float:2.124757E-39)
            int r0 = r0 + r2
            r2 = r0
            goto L8
        L52:
            super.cancel()
            int r0 = com.xy.xyverify.Dialog.C0000.f4
            int r2 = com.xy.xyverify.Dialog.C0000.f4
            int r0 = r0 + r2
            r2 = 1749332(0x1ab154, float:2.451336E-39)
            int r0 = r0 + r2
            r2 = r0
            goto L8
        L60:
            int r0 = com.xy.xyverify.Verify.C0004.f11
            if (r0 < 0) goto L6c
            java.lang.String r0 = "ۡۦۤ"
        L66:
            int r0 = com.xy.xyverify.Dialog.C0000.m4(r0)
            r2 = r0
            goto L8
        L6c:
            int r0 = com.xy.xyverify.Dialog.C0001.f5
            int r2 = com.xy.xyverify.Verify.C0003.f10
            int r0 = r0 - r2
            r2 = 1751999(0x1abbbf, float:2.455074E-39)
            int r0 = r0 + r2
            r2 = r0
            goto L8
        L77:
            int r0 = com.xy.xyverify.Verify.C0004.m46()
            if (r0 > 0) goto L60
            int r0 = com.xy.xyverify.Dialog.C0002.m15()
            if (r0 > 0) goto L8a
            r0 = 91
            com.xy.xyverify.Verify.C0003.f10 = r0
            java.lang.String r0 = "ۦ۟"
            goto L41
        L8a:
            java.lang.String r0 = "ۦ۟"
            goto L66
        L8d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xy.xyverify.Dialog.IOSDialog.access$001(com.xy.xyverify.Dialog.IOSDialog):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000a. Please report as an issue. */
    private Button createButton(String str) {
        String str2;
        String str3;
        LinearLayout.LayoutParams layoutParams;
        String str4;
        LinearLayout.LayoutParams layoutParams2 = null;
        Button button = null;
        int m4 = C0000.m4("۠۠ۨ");
        while (true) {
            switch (m4) {
                case 56414:
                    button.setLayoutParams(layoutParams2);
                    if (C0001.f5 <= 0) {
                        C0000.f4 = 84;
                        m4 = C0002.m14("ۧۡۡ");
                    } else {
                        str3 = "ۢ۟ۡ";
                        layoutParams = layoutParams2;
                        layoutParams2 = layoutParams;
                        m4 = C0004.m49(str3);
                    }
                case 1747688:
                    layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
                    if ((C0000.f4 | (C0003.f10 ^ (-9122))) <= 0) {
                        C0004.f11 = 18;
                        str3 = "ۤۢۤ";
                        layoutParams2 = layoutParams;
                        m4 = C0004.m49(str3);
                    } else {
                        layoutParams2 = layoutParams;
                        m4 = 1752265 ^ (C0000.f4 - C0001.f5);
                    }
                case 1749572:
                    button.setOnClickListener(new View.OnClickListener(this) { // from class: com.xy.xyverify.Dialog.IOSDialog$$ExternalSyntheticLambda1
                        public final IOSDialog f$0;

                        /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000a. Please report as an issue. */
                        /* JADX WARN: Removed duplicated region for block: B:19:0x0092  */
                        /* JADX WARN: Removed duplicated region for block: B:22:0x009a  */
                        {
                            /*
                                r3 = this;
                                r3.<init>()
                                r1 = 0
                                java.lang.String r0 = "ۥۢۡ"
                                int r0 = com.xy.xyverify.Dialog.C0001.m9(r0)
                            La:
                                switch(r0) {
                                    case 56544: goto Le;
                                    case 1747682: goto L23;
                                    case 1750631: goto L89;
                                    case 1751679: goto L3d;
                                    case 1752548: goto L61;
                                    case 1753569: goto L9d;
                                    case 1754503: goto L6a;
                                    default: goto Ld;
                                }
                            Ld:
                                goto La
                            Le:
                                java.io.PrintStream r0 = java.lang.System.out
                                r0.println(r1)
                                int r0 = com.xy.xyverify.Dialog.C0002.f6
                                int r2 = com.xy.xyverify.Verify.C0003.f10
                                int r2 = r2 / 9269
                                r0 = r0 ^ r2
                                if (r0 > 0) goto L57
                                java.lang.String r0 = "ۣۢۦ"
                                int r0 = com.xy.xyverify.Verify.C0003.m44(r0)
                                goto La
                            L23:
                                int r0 = com.xy.xyverify.Dialog.C0002.m15()
                                if (r0 > 0) goto L89
                                int r0 = com.xy.xyverify.Dialog.C0002.m15()
                                if (r0 > 0) goto L36
                                java.lang.String r0 = "۠۠ۢ"
                                int r0 = com.xy.xyverify.Dialog.C0002.m14(r0)
                                goto La
                            L36:
                                java.lang.String r0 = "ۣۣۧ"
                            L38:
                                int r0 = com.xy.xyverify.Dialog.C0000.m4(r0)
                                goto La
                            L3d:
                                int r0 = com.xy.xyverify.Dialog.C0001.f5
                                int r2 = com.xy.xyverify.Dialog.C0002.f6
                                int r2 = r2 + 1760
                                int r0 = r0 - r2
                                if (r0 < 0) goto L4d
                                r0 = 88
                                com.xy.xyverify.Dialog.C0001.f5 = r0
                                java.lang.String r0 = "ۢۡۦ"
                                goto L38
                            L4d:
                                int r0 = com.xy.xyverify.Verify.C0004.f11
                                int r2 = com.xy.xyverify.Verify.C0004.f11
                                int r0 = r0 * r2
                                r2 = 1229819(0x12c3fb, float:1.723343E-39)
                                int r0 = r0 + r2
                                goto La
                            L57:
                                int r0 = com.xy.xyverify.Dialog.C0000.f4
                                int r2 = com.xy.xyverify.Verify.C0003.f10
                                int r0 = r0 + r2
                                r2 = 1753925(0x1ac345, float:2.457772E-39)
                                r0 = r0 ^ r2
                                goto La
                            L61:
                                r3.f$0 = r4
                                java.lang.String r0 = "۠۠ۢ"
                            L65:
                                int r0 = com.xy.xyverify.Verify.C0004.m49(r0)
                                goto La
                            L6a:
                                java.lang.String r0 = "p6iO3r1gsrL6hD2EI"
                                java.lang.String r0 = com.xy.xyverify.Verify.C0004.m47(r0)
                                int r1 = java.lang.Integer.parseInt(r0)
                                int r0 = com.xy.xyverify.Verify.C0004.f11
                                if (r0 < 0) goto L7f
                                r0 = 59
                                com.xy.xyverify.Dialog.C0002.f6 = r0
                                java.lang.String r0 = "ۥۢۡ"
                                goto L65
                            L7f:
                                int r0 = com.xy.xyverify.Verify.C0003.f10
                                int r2 = com.xy.xyverify.Verify.C0004.f11
                                int r0 = r0 + r2
                                r2 = 57333(0xdff5, float:8.034E-41)
                                int r0 = r0 + r2
                                goto La
                            L89:
                                int r0 = com.xy.xyverify.Dialog.C0002.f6
                                int r2 = com.xy.xyverify.Verify.C0004.f11
                                int r2 = r2 * (-4311)
                                r0 = r0 ^ r2
                                if (r0 > 0) goto L9a
                                java.lang.String r0 = "۟ۧ"
                            L94:
                                int r0 = com.xy.xyverify.Dialog.C0000.m4(r0)
                                goto La
                            L9a:
                                java.lang.String r0 = "ۦۤ۟"
                                goto L94
                            L9d:
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.xy.xyverify.Dialog.IOSDialog$$ExternalSyntheticLambda1.<init>(com.xy.xyverify.Dialog.IOSDialog):void");
                        }

                        /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
                        /* JADX WARN: Removed duplicated region for block: B:25:0x0066  */
                        /* JADX WARN: Removed duplicated region for block: B:28:0x0072  */
                        @Override // android.view.View.OnClickListener
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void onClick(android.view.View r4) {
                            /*
                                r3 = this;
                                r0 = 0
                                java.lang.String r1 = "۟ۨۡ"
                                int r2 = com.xy.xyverify.Dialog.C0001.m9(r1)
                                r1 = r0
                            L8:
                                switch(r2) {
                                    case 1746968: goto Lc;
                                    case 1749633: goto L22;
                                    case 1750632: goto L45;
                                    case 1750750: goto L99;
                                    case 1752611: goto L62;
                                    case 1752616: goto La5;
                                    case 1754654: goto L75;
                                    default: goto Lb;
                                }
                            Lb:
                                goto L8
                            Lc:
                                com.xy.xyverify.Dialog.IOSDialog r0 = r3.f$0
                                r0.m2lambda$createButton$0$comxyxyverifyDialogIOSDialog(r4)
                                int r0 = com.xy.xyverify.Dialog.C0000.m7()
                                if (r0 > 0) goto L1a
                                com.xy.xyverify.Verify.C0003.m42()
                            L1a:
                                java.lang.String r0 = "ۣۢۧ"
                                int r0 = com.xy.xyverify.Verify.C0004.m49(r0)
                                r2 = r0
                                goto L8
                            L22:
                                java.lang.String r0 = "UBbBdI9COlhKgQogGHK0PlRkAE"
                                java.lang.String r0 = com.xy.xyverify.Verify.C0003.m43(r0)
                                int r1 = com.xy.xyverify.Dialog.C0001.m8()
                                if (r1 > 0) goto L3a
                                r1 = 47
                                com.xy.xyverify.Dialog.C0002.f6 = r1
                                java.lang.String r1 = "ۥۤۢ"
                                int r2 = com.xy.xyverify.Verify.C0003.m44(r1)
                                r1 = r0
                                goto L8
                            L3a:
                                int r1 = com.xy.xyverify.Verify.C0003.f10
                                int r2 = com.xy.xyverify.Dialog.C0002.f6
                                r1 = r1 ^ r2
                                r2 = 1755086(0x1ac7ce, float:2.4594E-39)
                                int r2 = r2 + r1
                                r1 = r0
                                goto L8
                            L45:
                                int r0 = com.xy.xyverify.Dialog.C0001.m8()
                                if (r0 > 0) goto L62
                                int r0 = com.xy.xyverify.Dialog.C0002.f6
                                if (r0 > 0) goto L57
                                java.lang.String r0 = "ۣۦۡ"
                                int r0 = com.xy.xyverify.Dialog.C0000.m4(r0)
                                r2 = r0
                                goto L8
                            L57:
                                int r0 = com.xy.xyverify.Dialog.C0001.f5
                                int r2 = com.xy.xyverify.Verify.C0003.f10
                                r0 = r0 ^ r2
                                r2 = 1750055(0x1ab427, float:2.45235E-39)
                                int r0 = r0 + r2
                                r2 = r0
                                goto L8
                            L62:
                                int r0 = com.xy.xyverify.Verify.C0003.f10
                                if (r0 < 0) goto L72
                                r0 = 78
                                com.xy.xyverify.Verify.C0004.f11 = r0
                                java.lang.String r0 = "ۦۡ۠"
                            L6c:
                                int r0 = com.xy.xyverify.Dialog.C0000.m4(r0)
                                r2 = r0
                                goto L8
                            L72:
                                java.lang.String r0 = "ۥۤۧ"
                                goto L6c
                            L75:
                                java.io.PrintStream r0 = java.lang.System.out
                                r0.println(r1)
                                int r0 = com.xy.xyverify.Verify.C0003.m42()
                                if (r0 > 0) goto L8d
                                r0 = 68
                                com.xy.xyverify.Verify.C0003.f10 = r0
                                java.lang.String r0 = "۟ۨۡ"
                                int r0 = com.xy.xyverify.Dialog.C0000.m4(r0)
                                r2 = r0
                                goto L8
                            L8d:
                                int r0 = com.xy.xyverify.Dialog.C0000.f4
                                int r2 = com.xy.xyverify.Dialog.C0002.f6
                                int r0 = r0 * r2
                                r2 = 1386068(0x152654, float:1.942295E-39)
                                int r0 = r0 + r2
                                r2 = r0
                                goto L8
                            L99:
                                int r0 = com.xy.xyverify.Dialog.C0002.f6
                                int r2 = com.xy.xyverify.Verify.C0003.f10
                                int r0 = r0 / r2
                                r2 = 1746975(0x1aa81f, float:2.448033E-39)
                                int r0 = r0 + r2
                                r2 = r0
                                goto L8
                            La5:
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.xy.xyverify.Dialog.IOSDialog$$ExternalSyntheticLambda1.onClick(android.view.View):void");
                        }
                    });
                    if (C0004.f11 >= 0) {
                        C0004.m46();
                        m4 = C0004.m49("ۣۢ۠");
                    }
                case 1750625:
                    if (C0003.f10 >= 0) {
                        C0003.f10 = 10;
                        str2 = "ۣ۠۟";
                    } else {
                        str2 = "۠۠ۨ";
                    }
                    m4 = C0001.m9(str2);
                case 1750757:
                    break;
                case 1751590:
                    Button button2 = new Button(this.context);
                    if (C0000.f4 <= 0) {
                        C0001.f5 = 76;
                        str4 = "ۢ۟ۡ";
                    } else {
                        str4 = "ۤۤۥ";
                    }
                    button = button2;
                    m4 = C0001.m9(str4);
                case 1751653:
                    button.setTextColor(Color.parseColor(str));
                    m4 = (C0004.f11 % C0004.f11) + 1753575;
                case 1752523:
                    layoutParams2.gravity = 17;
                    if ((C0003.f10 ^ (C0004.f11 % (-2185))) <= 0) {
                        C0000.m7();
                        m4 = C0003.m44("ۦۤۥ");
                    } else {
                        str3 = "ۤۢۤ";
                        layoutParams = layoutParams2;
                        layoutParams2 = layoutParams;
                        m4 = C0004.m49(str3);
                    }
                case 1753575:
                    button.setTextSize(15.0f);
                    m4 = (C0001.f5 ^ (C0000.f4 ^ 7631)) <= 0 ? C0002.m14("ۣۦۨ") : (C0000.f4 / C0003.f10) + 1754450;
                case 1754439:
                    button.setVisibility(8);
                    m4 = (C0002.f6 / C0001.f5) + 56413;
            }
            return button;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000e. Please report as an issue. */
    private void initButton() {
        String m5;
        String str;
        String str2;
        String str3;
        String str4;
        LinearLayout.LayoutParams layoutParams;
        int m4 = C0000.m4("ۡۧۢ");
        String str5 = null;
        LinearLayout.LayoutParams layoutParams2 = null;
        LinearLayout linearLayout = null;
        while (true) {
            switch (m4) {
                case 56477:
                    LinearLayout linearLayout2 = new LinearLayout(this.context);
                    m4 = (C0000.f4 + C0002.f6) ^ 1749551;
                    linearLayout = linearLayout2;
                case 56540:
                    this.OkButton.setText(C0002.m13(f1short, 14, 2, 2715));
                    m4 = (C0001.f5 * C0003.f10) + 1786513;
                case 1746781:
                    this.OkButton.setVisibility(0);
                    m4 = C0003.m44("ۣۧ");
                case 1746873:
                    this.OtherButton = createButton(str5);
                    if (C0000.f4 % (C0004.f11 + 7730) <= 0) {
                        C0004.m46();
                        m4 = C0003.m44("ۢ۟ۥ");
                    } else {
                        str2 = "۟ۢ۠";
                        m4 = C0002.m14(str2);
                    }
                case 1746879:
                    this.ButtonLayout.addView(this.OkButton);
                    if (C0004.f11 >= 0) {
                        C0001.m8();
                        m4 = C0002.m14("ۣۨۥ");
                    } else {
                        m4 = C0003.m44("ۢ۟ۥ");
                    }
                case 1747741:
                    this.MainView.addView(this.ButtonLayout);
                    str4 = "ۣۨۥ";
                    layoutParams = layoutParams2;
                    m4 = C0002.m14(str4);
                    layoutParams2 = layoutParams;
                case 1747835:
                    this.ButtonLayout.setOrientation(0);
                    m4 = (C0001.f5 ^ C0004.f11) + 1755419;
                case 1748769:
                    this.OkButton = createButton(str5);
                    if (C0002.f6 <= 0) {
                        C0001.f5 = 95;
                        m4 = C0004.m49("ۣۧ۟");
                    } else {
                        m4 = C0002.m14("ۤۦۤ");
                    }
                case 1748860:
                    this.MainView.addView(this.ContentLayout);
                    m4 = (C0000.f4 | C0002.f6) + 1752694;
                case 1749576:
                    setRadius(this.Radius);
                    if (C0002.f6 - (C0000.f4 + 9563) >= 0) {
                        C0001.m8();
                        m4 = C0002.m14("۟ۥۥ");
                    } else {
                        str2 = "۠ۢ۟";
                        m4 = C0002.m14(str2);
                    }
                case 1749730:
                    this.ButtonLayout.addView(this.OtherButton);
                    if (C0001.f5 + (C0004.f11 | 3363) >= 0) {
                        C0001.m8();
                        m4 = C0003.m44("ۣۧ");
                    } else {
                        str4 = "۟ۥۥ";
                        layoutParams = layoutParams2;
                        m4 = C0002.m14(str4);
                        layoutParams2 = layoutParams;
                    }
                case 1750779:
                    this.ButtonLayout = linearLayout;
                    m4 = C0002.m15() <= 0 ? C0000.m4("ۢۤۤ") : C0003.m44("ۧۤ۟");
                case 1750816:
                    break;
                case 1751623:
                    layoutParams = new LinearLayout.LayoutParams(-1, -2);
                    if (C0003.f10 / (C0002.f6 | 2388) != 0) {
                        str4 = "۟ۥ۟";
                        m4 = C0002.m14(str4);
                        layoutParams2 = layoutParams;
                    } else {
                        m4 = 1755036 + (C0002.f6 % C0004.f11);
                        layoutParams2 = layoutParams;
                    }
                case 1751714:
                    this.CancelButton = createButton(C0004.m48(f1short, 7, 7, 2916));
                    if (C0002.m15() <= 0) {
                        C0001.f5 = 31;
                        m4 = C0003.m44("ۥ۠ۨ");
                    } else {
                        str4 = "۟ۥ۟";
                        layoutParams = layoutParams2;
                        m4 = C0002.m14(str4);
                        layoutParams2 = layoutParams;
                    }
                case 1751771:
                    m5 = C0000.m5(f1short, 0, 7, 1465);
                    if (C0001.f5 / (C0004.f11 - 2306) != 0) {
                        m4 = C0000.m4("ۡۧۢ");
                        str5 = m5;
                    } else {
                        m4 = C0002.m14("ۡۤۤ");
                        str5 = m5;
                    }
                case 1752493:
                    if (C0000.m7() <= 0) {
                        C0002.f6 = 20;
                        str = "ۢۢۥ";
                        m4 = C0003.m44(str);
                    } else {
                        m4 = (C0003.f10 - C0000.f4) + 1749668;
                    }
                case 1753700:
                    new LinearLayout.LayoutParams(-1, -2).gravity = 80;
                    if (C0001.f5 <= 0) {
                        str3 = "۠ۢ۟";
                        m4 = C0000.m4(str3);
                    } else {
                        str = "ۣۤۦ";
                        m4 = C0003.m44(str);
                    }
                case 1753702:
                    this.ButtonLayout.addView(this.CancelButton);
                    if (C0004.f11 >= 0) {
                        m4 = C0000.m4("ۣۤۦ");
                    } else {
                        str2 = "ۢۤۤ";
                        m4 = C0002.m14(str2);
                    }
                case 1754530:
                    linearLayout.setLayoutParams(layoutParams2);
                    if (C0004.f11 % (C0003.f10 + 3318) >= 0) {
                        C0001.m8();
                        m5 = str5;
                        m4 = C0002.m14("ۡۤۤ");
                        str5 = m5;
                    } else {
                        str3 = "۠ۥ۠";
                        m4 = C0000.m4(str3);
                    }
                case 1754569:
                    RefreshButton();
                    if (C0001.f5 <= 0) {
                        C0000.m7();
                        m4 = C0002.m14("ۤۦۤ");
                    } else {
                        m4 = (C0002.f6 / C0003.f10) + 1753709;
                    }
                case 1754596:
                    this.ButtonLayout.setWeightSum(3.0f);
                    if (C0003.f10 < 0) {
                        m4 = (C0000.f4 * C0002.f6) + 1385223;
                    }
                case 1755530:
                    layoutParams2.setMargins(0, 30, 0, 0);
                    if (C0001.m8() <= 0) {
                        C0001.m8();
                        str2 = "۟ۢ۠";
                        m4 = C0002.m14(str2);
                    } else {
                        m4 = C0002.m14("ۥۢ");
                    }
            }
            return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0010. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x029b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void initChildView() {
        /*
            Method dump skipped, instructions count: 784
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xy.xyverify.Dialog.IOSDialog.initChildView():void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000b. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ce A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void initMainView() {
        /*
            Method dump skipped, instructions count: 542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xy.xyverify.Dialog.IOSDialog.initMainView():void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    public static /* synthetic */ void lambda$MakeShow$1(Context context, String str, String str2) {
        String str3;
        int m14 = C0002.m14("ۡۦۨ");
        Long l2 = null;
        while (true) {
            switch (m14) {
                case 1748835:
                    new IOSDialog(context).setTitle(str).setMessage(str2).show();
                    m14 = C0002.m14("ۢۥۤ");
                case 1749761:
                    if (C0000.m7() <= 0) {
                        m14 = C0001.m9(C0004.f11 >= 0 ? "ۣۤ۠" : "ۨۧۥ");
                    } else {
                        str3 = "ۣۤ۟";
                        m14 = C0004.m49(str3);
                    }
                case 1750686:
                    break;
                case 1751527:
                    str3 = "ۣۤ۟";
                    m14 = C0004.m49(str3);
                case 1754442:
                    System.out.println(l2);
                    if (C0004.m46() <= 0) {
                        m14 = C0003.m44("ۢۥۤ");
                    } else {
                        str3 = "ۣۤ۟";
                        m14 = C0004.m49(str3);
                    }
                case 1755554:
                    str3 = C0004.m46() <= 0 ? "ۦ۠ۢ" : "ۡۦۨ";
                    m14 = C0004.m49(str3);
                case 1755590:
                    Long valueOf = Long.valueOf(C0002.m12("t7EW89I0uO66djgefEqv"));
                    m14 = 1752977 + (C0000.f4 - C0004.f11);
                    l2 = valueOf;
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.xy.xyverify.Dialog.IOSDialog addContentView(android.view.View r3) {
        /*
            r2 = this;
            java.lang.String r0 = "ۡۢۤ"
            int r0 = com.xy.xyverify.Verify.C0003.m44(r0)
        L6:
            switch(r0) {
                case 1748703: goto La;
                case 1748707: goto L22;
                case 1752677: goto Lb;
                default: goto L9;
            }
        L9:
            goto L6
        La:
            return r2
        Lb:
            int r0 = com.xy.xyverify.Dialog.C0000.f4
            int r1 = com.xy.xyverify.Verify.C0004.f11
            int r1 = r1 / 2648
            r0 = r0 ^ r1
            if (r0 > 0) goto L1f
            r0 = 63
            com.xy.xyverify.Dialog.C0002.f6 = r0
            java.lang.String r0 = "۟ۢۥ"
        L1a:
            int r0 = com.xy.xyverify.Dialog.C0002.m14(r0)
            goto L6
        L1f:
            java.lang.String r0 = "ۡۢۤ"
            goto L1a
        L22:
            android.widget.LinearLayout r0 = r2.ContentLayout
            r0.addView(r3)
            int r0 = com.xy.xyverify.Verify.C0003.f10
            if (r0 < 0) goto L35
            com.xy.xyverify.Dialog.C0002.m15()
            java.lang.String r0 = "ۡۢۤ"
            int r0 = com.xy.xyverify.Verify.C0003.m44(r0)
            goto L6
        L35:
            java.lang.String r0 = "ۡۢ۠"
            int r0 = com.xy.xyverify.Dialog.C0001.m9(r0)
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xy.xyverify.Dialog.IOSDialog.addContentView(android.view.View):com.xy.xyverify.Dialog.IOSDialog");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0007. Please report as an issue. */
    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        String str;
        AlphaAnimation alphaAnimation = null;
        int m14 = C0002.m14("ۣۤ۟");
        while (true) {
            switch (m14) {
                case 1746724:
                    alphaAnimation.setAnimationListener(new Animation.AnimationListener(this) { // from class: com.xy.xyverify.Dialog.IOSDialog.1
                        final IOSDialog this$0;

                        /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000c. Please report as an issue. */
                        {
                            String str2;
                            String str3;
                            this.this$0 = this;
                            Integer num = null;
                            int m49 = C0004.m49("ۤۢۡ");
                            while (true) {
                                switch (m49) {
                                    case 56291:
                                        m49 = (C0001.f5 % C0001.f5) + 1754415;
                                    case 1751587:
                                        if (C0002.m15() > 0) {
                                            m49 = (C0001.f5 % C0001.f5) + 1754415;
                                        } else if (C0000.f4 <= 0) {
                                            C0000.f4 = 59;
                                            m49 = C0001.m9("ۥۢۧ");
                                        } else {
                                            m49 = C0002.m14("ۧۦۣ");
                                        }
                                    case 1752554:
                                        System.out.println(num);
                                        if (C0002.m15() <= 0) {
                                            m49 = C0000.m4("ۤۢۡ");
                                        } else {
                                            str3 = "ۧ۠ۨ";
                                            m49 = C0000.m4(str3);
                                        }
                                    case 1754415:
                                        break;
                                    case 1754596:
                                        num = Integer.valueOf(C0004.m47("8HDtgdLMEKzOkgkF"));
                                        if (C0001.f5 * (C0004.f11 | 2803) >= 0) {
                                            C0000.m7();
                                            str3 = "ۨ۠ۤ";
                                            m49 = C0000.m4(str3);
                                        } else {
                                            str2 = "ۥۢۧ";
                                            m49 = C0003.m44(str2);
                                        }
                                    case 1755372:
                                        if (C0004.f11 / (C0000.f4 + 2012) != 0) {
                                            C0000.m7();
                                            str2 = "ۣۤ";
                                            m49 = C0003.m44(str2);
                                        } else {
                                            m49 = C0002.m14("ۤۢۡ");
                                        }
                                }
                                return;
                            }
                        }

                        /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
                        @Override // android.view.animation.Animation.AnimationListener
                        public void onAnimationEnd(Animation animation) {
                            String str2;
                            int m49 = C0004.m49("ۣۡۧ");
                            while (true) {
                                switch (m49) {
                                    case 1750601:
                                        IOSDialog.access$001(this.this$0);
                                        if (C0003.f10 >= 0) {
                                            m49 = C0001.m9("ۣۡۧ");
                                        } else {
                                            str2 = "ۤۢ۟";
                                            m49 = C0004.m49(str2);
                                        }
                                    case 1750695:
                                        if (C0002.f6 * (C0001.f5 - 7477) >= 0) {
                                            C0000.f4 = 25;
                                            str2 = "ۥۦۧ";
                                            m49 = C0004.m49(str2);
                                        } else {
                                            m49 = (C0004.f11 | C0003.f10) ^ (-1750538);
                                        }
                                    case 1751585:
                                        break;
                                }
                                return;
                            }
                        }

                        /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
                        /* JADX WARN: Removed duplicated region for block: B:27:0x0061 A[SYNTHETIC] */
                        /* JADX WARN: Removed duplicated region for block: B:30:0x005a A[SYNTHETIC] */
                        @Override // android.view.animation.Animation.AnimationListener
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public void onAnimationRepeat(android.view.animation.Animation r4) {
                            /*
                                r3 = this;
                                r1 = 0
                                java.lang.String r0 = "ۢۥۥ"
                                int r0 = com.xy.xyverify.Verify.C0004.m49(r0)
                                r2 = r0
                            L8:
                                switch(r2) {
                                    case 56505: goto Lc;
                                    case 1749762: goto L2f;
                                    case 1750659: goto L6c;
                                    case 1751589: goto L51;
                                    case 1751714: goto Ld;
                                    case 1755462: goto L3d;
                                    default: goto Lb;
                                }
                            Lb:
                                goto L8
                            Lc:
                                return
                            Ld:
                                java.io.PrintStream r0 = java.lang.System.out
                                r0.println(r1)
                                int r0 = com.xy.xyverify.Dialog.C0002.f6
                                int r2 = com.xy.xyverify.Dialog.C0002.f6
                                int r2 = r2 * (-8007)
                                r0 = r0 ^ r2
                                if (r0 < 0) goto L26
                                com.xy.xyverify.Dialog.C0001.m8()
                                java.lang.String r0 = "ۣۤۢ"
                                int r0 = com.xy.xyverify.Verify.C0004.m49(r0)
                                r2 = r0
                                goto L8
                            L26:
                                java.lang.String r2 = "ۦ۟"
                                r0 = r1
                            L29:
                                int r2 = com.xy.xyverify.Verify.C0004.m49(r2)
                                r1 = r0
                                goto L8
                            L2f:
                                int r0 = com.xy.xyverify.Verify.C0004.m46()
                                if (r0 > 0) goto L51
                                java.lang.String r0 = "ۣۣۣ"
                            L37:
                                int r0 = com.xy.xyverify.Dialog.C0000.m4(r0)
                                r2 = r0
                                goto L8
                            L3d:
                                int r0 = com.xy.xyverify.Verify.C0004.f11
                                int r2 = com.xy.xyverify.Verify.C0003.f10
                                int r2 = r2 + (-8294)
                                int r0 = r0 + r2
                                if (r0 < 0) goto L49
                                java.lang.String r0 = "ۣ۠ۢ"
                                goto L37
                            L49:
                                java.lang.String r0 = "ۢۥۥ"
                                int r0 = com.xy.xyverify.Verify.C0004.m49(r0)
                                r2 = r0
                                goto L8
                            L51:
                                int r0 = com.xy.xyverify.Verify.C0003.f10
                                int r2 = com.xy.xyverify.Dialog.C0001.f5
                                r2 = r2 ^ 7501(0x1d4d, float:1.0511E-41)
                                r0 = r0 ^ r2
                                if (r0 < 0) goto L61
                                com.xy.xyverify.Verify.C0003.m42()
                                java.lang.String r2 = "ۦۢ۟"
                                r0 = r1
                                goto L29
                            L61:
                                int r0 = com.xy.xyverify.Dialog.C0002.f6
                                int r2 = com.xy.xyverify.Verify.C0003.f10
                                r0 = r0 | r2
                                r2 = 56507(0xdcbb, float:7.9183E-41)
                                int r0 = r0 + r2
                                r2 = r0
                                goto L8
                            L6c:
                                java.lang.String r0 = "r59PPrBJGnFGIMMBzHF0"
                                java.lang.String r0 = com.xy.xyverify.Verify.C0003.m43(r0)
                                float r0 = java.lang.Float.parseFloat(r0)
                                java.lang.String r1 = "ۤۦۤ"
                                r2 = r1
                                goto L29
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.xy.xyverify.Dialog.IOSDialog.AnonymousClass1.onAnimationRepeat(android.view.animation.Animation):void");
                        }

                        /* JADX WARN: Code restructure failed: missing block: B:14:0x0021, code lost:
                        
                            return;
                         */
                        @Override // android.view.animation.Animation.AnimationListener
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public void onAnimationStart(android.view.animation.Animation r2) {
                            /*
                                r1 = this;
                                java.lang.String r0 = "ۣۤۧ"
                                int r0 = com.xy.xyverify.Verify.C0003.m44(r0)
                            L6:
                                switch(r0) {
                                    case 1746912: goto La;
                                    case 1751744: goto L21;
                                    default: goto L9;
                                }
                            L9:
                                goto L6
                            La:
                                int r0 = com.xy.xyverify.Dialog.C0002.m15()
                                if (r0 > 0) goto L1a
                                com.xy.xyverify.Verify.C0004.m46()
                                java.lang.String r0 = "ۢۢۦ"
                                int r0 = com.xy.xyverify.Verify.C0004.m49(r0)
                                goto L6
                            L1a:
                                java.lang.String r0 = "ۣۤۧ"
                                int r0 = com.xy.xyverify.Dialog.C0000.m4(r0)
                                goto L6
                            L21:
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.xy.xyverify.Dialog.IOSDialog.AnonymousClass1.onAnimationStart(android.view.animation.Animation):void");
                        }
                    });
                    if ((C0000.f4 ^ (C0002.f6 % (-6908))) <= 0) {
                        C0000.f4 = 56;
                        m14 = C0003.m44("ۣۨ۠");
                    } else {
                        str = "۟ۦۣ";
                        m14 = C0002.m14(str);
                    }
                case 1746908:
                    this.MainView.startAnimation(alphaAnimation);
                    m14 = C0002.m15() <= 0 ? C0003.m44("۠ۧۦ") : (C0004.f11 - C0003.f10) + 1754079;
                case 1747903:
                    alphaAnimation.setDuration(500L);
                    if (C0004.f11 % (C0004.f11 | (-4140)) != 0) {
                        C0001.f5 = 18;
                        m14 = C0002.m14("ۣۤ۟");
                    } else {
                        m14 = C0002.f6 + C0001.f5 + 1750554;
                    }
                case 1750811:
                    m14 = (C0000.f4 ^ C0002.f6) + 1750720;
                case 1751496:
                    alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                    if ((C0002.f6 ^ (C0003.f10 * (-6966))) <= 0) {
                        C0002.f6 = 33;
                        str = "۟ۦۣ";
                        m14 = C0002.m14(str);
                    } else {
                        str = "۠ۧۦ";
                        m14 = C0002.m14(str);
                    }
                case 1751532:
                    alphaAnimation.setFillAfter(true);
                    m14 = (C0004.f11 * C0000.f4) + 2283190;
                case 1753422:
                    break;
            }
            return;
        }
    }

    public Button getCancelButton() {
        return this.CancelButton;
    }

    public EditText getInput() {
        return this.InputEdit;
    }

    public Button getOkButton() {
        return this.OkButton;
    }

    public Button getOtherButton() {
        return this.OtherButton;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0052 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004a A[SYNTHETIC] */
    /* renamed from: lambda$createButton$0$com-xy-xyverify-Dialog-IOSDialog, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ void m2lambda$createButton$0$comxyxyverifyDialogIOSDialog(android.view.View r4) {
        /*
            r3 = this;
            r0 = 0
            java.lang.String r1 = "ۤۨۡ"
            int r2 = com.xy.xyverify.Dialog.C0001.m9(r1)
            r1 = r0
        L8:
            switch(r2) {
                case 1747748: goto Lc;
                case 1748738: goto L76;
                case 1750566: goto L5a;
                case 1751647: goto L2c;
                case 1751773: goto Ld;
                case 1753419: goto L88;
                case 1753696: goto L41;
                default: goto Lb;
            }
        Lb:
            goto L8
        Lc:
            return
        Ld:
            r3.cancel()
            int r0 = com.xy.xyverify.Dialog.C0001.m8()
            if (r0 > 0) goto L21
            com.xy.xyverify.Dialog.C0001.m8()
            java.lang.String r0 = "ۦۨۢ"
        L1b:
            int r0 = com.xy.xyverify.Verify.C0003.m44(r0)
            r2 = r0
            goto L8
        L21:
            int r0 = com.xy.xyverify.Verify.C0004.f11
            int r2 = com.xy.xyverify.Verify.C0004.f11
            int r0 = r0 * r2
            r2 = 1915042(0x1d38a2, float:2.683545E-39)
            r0 = r0 ^ r2
            r2 = r0
            goto L8
        L2c:
            java.lang.String r0 = "dWqOA7sespAPfg"
            java.lang.String r0 = com.xy.xyverify.Verify.C0004.m47(r0)
            java.lang.Integer r0 = java.lang.Integer.decode(r0)
            int r1 = com.xy.xyverify.Dialog.C0001.f5
            int r2 = com.xy.xyverify.Verify.C0003.f10
            r1 = r1 ^ r2
            r2 = 1750988(0x1ab7cc, float:2.453657E-39)
            int r2 = r2 + r1
            r1 = r0
            goto L8
        L41:
            int r0 = com.xy.xyverify.Verify.C0004.f11
            int r2 = com.xy.xyverify.Dialog.C0002.f6
            int r2 = r2 + 1005
            int r0 = r0 / r2
            if (r0 == 0) goto L52
            java.lang.String r0 = "ۦۥ"
            int r0 = com.xy.xyverify.Dialog.C0001.m9(r0)
            r2 = r0
            goto L8
        L52:
            java.lang.String r0 = "۠ۢۦ"
        L54:
            int r0 = com.xy.xyverify.Dialog.C0002.m14(r0)
            r2 = r0
            goto L8
        L5a:
            java.io.PrintStream r0 = java.lang.System.out
            r0.println(r1)
            int r0 = com.xy.xyverify.Dialog.C0002.f6
            int r2 = com.xy.xyverify.Verify.C0003.f10
            int r2 = r2 / 6212
            r0 = r0 ^ r2
            if (r0 > 0) goto L73
            com.xy.xyverify.Dialog.C0001.m8()
            java.lang.String r0 = "ۤۨۡ"
            int r0 = com.xy.xyverify.Dialog.C0001.m9(r0)
            r2 = r0
            goto L8
        L73:
            java.lang.String r0 = "۠ۢۦ"
            goto L1b
        L76:
            int r0 = com.xy.xyverify.Verify.C0003.f10
            if (r0 < 0) goto L7d
            java.lang.String r0 = "۟ۦۨ"
            goto L54
        L7d:
            int r0 = com.xy.xyverify.Dialog.C0000.f4
            int r2 = com.xy.xyverify.Dialog.C0001.f5
            int r0 = r0 * r2
            r2 = 2080773(0x1fc005, float:2.915784E-39)
            r0 = r0 ^ r2
            r2 = r0
            goto L8
        L88:
            int r0 = com.xy.xyverify.Dialog.C0001.m8()
            if (r0 > 0) goto L41
            int r0 = com.xy.xyverify.Dialog.C0002.f6
            int r2 = com.xy.xyverify.Dialog.C0000.f4
            r0 = r0 | r2
            r2 = 1750641(0x1ab671, float:2.45317E-39)
            int r0 = r0 + r2
            r2 = r0
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xy.xyverify.Dialog.IOSDialog.m2lambda$createButton$0$comxyxyverifyDialogIOSDialog(android.view.View):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    public IOSDialog setCancelButton(String str) {
        int m49 = C0004.m49("ۤۡۤ");
        while (true) {
            switch (m49) {
                case 56386:
                    this.CancelButton.setVisibility(0);
                    m49 = (C0004.f11 - C0002.f6) ^ (-1747530);
                case 56573:
                    if (C0002.f6 <= 0) {
                        C0002.f6 = 33;
                        m49 = C0000.m4("ۦۥۡ");
                    } else {
                        m49 = (C0001.f5 % C0001.f5) ^ 1751559;
                    }
                case 1748617:
                    RefreshButton();
                    m49 = C0003.f10 >= 0 ? C0001.m9("ۢۤ") : (C0003.f10 | C0002.f6) ^ (-1753634);
                case 1751559:
                    this.CancelButton.setText(str);
                    if (C0000.m7() <= 0) {
                        m49 = C0001.m9("ۡ۟ۧ");
                    }
                case 1753632:
                    break;
            }
            return this;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.xy.xyverify.Dialog.IOSDialog setInput() {
        /*
            r2 = this;
            java.lang.String r0 = "ۥۣۢ"
            int r0 = com.xy.xyverify.Dialog.C0002.m14(r0)
        L6:
            switch(r0) {
                case 1750600: goto La;
                case 1752580: goto Lb;
                case 1752707: goto L1c;
                default: goto L9;
            }
        L9:
            goto L6
        La:
            return r2
        Lb:
            android.widget.LinearLayout r0 = r2.ContentLayout
            android.widget.EditText r1 = r2.InputEdit
            r0.addView(r1)
            int r0 = com.xy.xyverify.Verify.C0004.f11
            int r1 = com.xy.xyverify.Dialog.C0001.f5
            int r0 = r0 - r1
            r1 = 1751807(0x1abaff, float:2.454804E-39)
            int r0 = r0 + r1
            goto L6
        L1c:
            int r0 = com.xy.xyverify.Dialog.C0002.m15()
            if (r0 > 0) goto L2d
            r0 = 69
            com.xy.xyverify.Verify.C0003.f10 = r0
            java.lang.String r0 = "۠ۧۤ"
            int r0 = com.xy.xyverify.Verify.C0003.m44(r0)
            goto L6
        L2d:
            int r0 = com.xy.xyverify.Verify.C0004.f11
            int r1 = com.xy.xyverify.Dialog.C0000.f4
            int r0 = r0 % r1
            r1 = 1753303(0x1ac0d7, float:2.456901E-39)
            int r0 = r0 + r1
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xy.xyverify.Dialog.IOSDialog.setInput():com.xy.xyverify.Dialog.IOSDialog");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.xy.xyverify.Dialog.IOSDialog setMessage(java.lang.String r3) {
        /*
            r2 = this;
            java.lang.String r0 = "ۥ۟ۦ"
            int r0 = com.xy.xyverify.Dialog.C0002.m14(r0)
        L6:
            switch(r0) {
                case 56511: goto La;
                case 1748832: goto Lb;
                case 1752460: goto L33;
                case 1754626: goto L1b;
                default: goto L9;
            }
        L9:
            goto L6
        La:
            return r2
        Lb:
            android.widget.TextView r0 = r2.MessageView
            r1 = 0
            r0.setVisibility(r1)
            int r0 = com.xy.xyverify.Dialog.C0000.f4
            int r1 = com.xy.xyverify.Dialog.C0000.f4
            int r0 = r0 * r1
            r1 = 494053(0x789e5, float:6.92316E-40)
            int r0 = r0 - r1
            goto L6
        L1b:
            int r0 = com.xy.xyverify.Dialog.C0000.f4
            if (r0 > 0) goto L29
            com.xy.xyverify.Verify.C0003.m42()
            java.lang.String r0 = "ۣۤۢ"
            int r0 = com.xy.xyverify.Dialog.C0002.m14(r0)
            goto L6
        L29:
            int r0 = com.xy.xyverify.Dialog.C0000.f4
            int r1 = com.xy.xyverify.Dialog.C0001.f5
            int r0 = r0 / r1
            r1 = 1752461(0x1abd8d, float:2.455721E-39)
            r0 = r0 ^ r1
            goto L6
        L33:
            android.widget.TextView r0 = r2.MessageView
            r0.setText(r3)
            int r0 = com.xy.xyverify.Verify.C0003.f10
            int r1 = com.xy.xyverify.Dialog.C0002.f6
            int r0 = r0 / r1
            r1 = 1748832(0x1aaf60, float:2.450636E-39)
            int r0 = r0 + r1
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xy.xyverify.Dialog.IOSDialog.setMessage(java.lang.String):com.xy.xyverify.Dialog.IOSDialog");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.xy.xyverify.Dialog.IOSDialog setMessageSize(float r3) {
        /*
            r2 = this;
            java.lang.String r0 = "ۥۤ۟"
            int r0 = com.xy.xyverify.Verify.C0004.m49(r0)
        L6:
            switch(r0) {
                case 1752608: goto La;
                case 1752615: goto L19;
                case 1755619: goto L23;
                default: goto L9;
            }
        L9:
            goto L6
        La:
            android.widget.TextView r0 = r2.MessageView
            r0.setTextSize(r3)
            int r0 = com.xy.xyverify.Verify.C0003.f10
            int r1 = com.xy.xyverify.Dialog.C0000.f4
            int r0 = r0 - r1
            r1 = 1756427(0x1acd0b, float:2.461278E-39)
            int r0 = r0 + r1
            goto L6
        L19:
            int r0 = com.xy.xyverify.Verify.C0003.f10
            int r1 = com.xy.xyverify.Verify.C0004.f11
            int r0 = r0 * r1
            r1 = 1705030(0x1a0446, float:2.389256E-39)
            r0 = r0 ^ r1
            goto L6
        L23:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xy.xyverify.Dialog.IOSDialog.setMessageSize(float):com.xy.xyverify.Dialog.IOSDialog");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.xy.xyverify.Dialog.IOSDialog setMinHeight(int r3) {
        /*
            r2 = this;
            java.lang.String r0 = "ۦۡۡ"
            int r0 = com.xy.xyverify.Dialog.C0001.m9(r0)
        L6:
            switch(r0) {
                case 1753478: goto La;
                case 1753509: goto L23;
                case 1755429: goto L2d;
                default: goto L9;
            }
        L9:
            goto L6
        La:
            android.widget.LinearLayout r0 = r2.MainView
            r0.setMinimumHeight(r3)
            int r0 = com.xy.xyverify.Dialog.C0002.f6
            int r1 = com.xy.xyverify.Verify.C0004.f11
            r1 = r1 | (-2573(0xfffffffffffff5f3, float:NaN))
            int r0 = r0 + r1
            if (r0 < 0) goto L2a
            r0 = 42
            com.xy.xyverify.Verify.C0003.f10 = r0
            java.lang.String r0 = "ۦۢۡ"
        L1e:
            int r0 = com.xy.xyverify.Dialog.C0000.m4(r0)
            goto L6
        L23:
            java.lang.String r0 = "ۦۡۡ"
            int r0 = com.xy.xyverify.Dialog.C0002.m14(r0)
            goto L6
        L2a:
            java.lang.String r0 = "ۨۢ۟"
            goto L1e
        L2d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xy.xyverify.Dialog.IOSDialog.setMinHeight(int):com.xy.xyverify.Dialog.IOSDialog");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.xy.xyverify.Dialog.IOSDialog setMinWith(int r2) {
        /*
            r1 = this;
            java.lang.String r0 = "ۦۢۥ"
            int r0 = com.xy.xyverify.Verify.C0003.m44(r0)
        L6:
            switch(r0) {
                case 1750571: goto La;
                case 1753513: goto Lb;
                case 1755402: goto L23;
                default: goto L9;
            }
        L9:
            goto L6
        La:
            return r1
        Lb:
            android.widget.LinearLayout r0 = r1.MainView
            r0.setMinimumWidth(r2)
            int r0 = com.xy.xyverify.Verify.C0004.m46()
            if (r0 > 0) goto L20
            com.xy.xyverify.Verify.C0003.m42()
            java.lang.String r0 = "ۣۨۡ"
        L1b:
            int r0 = com.xy.xyverify.Verify.C0004.m49(r0)
            goto L6
        L20:
            java.lang.String r0 = "ۣ۠ۨ"
            goto L1b
        L23:
            int r0 = com.xy.xyverify.Dialog.C0000.m7()
            if (r0 > 0) goto L30
            java.lang.String r0 = "۟۟ۥ"
        L2b:
            int r0 = com.xy.xyverify.Verify.C0003.m44(r0)
            goto L6
        L30:
            java.lang.String r0 = "ۦۢۥ"
            goto L2b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xy.xyverify.Dialog.IOSDialog.setMinWith(int):com.xy.xyverify.Dialog.IOSDialog");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    public IOSDialog setOkButton(String str) {
        int m4 = C0000.m4("ۥۥۣ");
        while (true) {
            switch (m4) {
                case 1747719:
                    RefreshButton();
                    m4 = (C0004.f11 % C0004.f11) + 1751744;
                case 1751744:
                    break;
                case 1752586:
                    this.OkButton.setVisibility(0);
                    m4 = C0001.m9("۠ۡۨ");
                case 1752643:
                    this.OkButton.setText(str);
                    if ((C0004.f11 | (C0000.f4 ^ 8023)) >= 0) {
                        C0001.m8();
                        m4 = C0001.m9("۠ۡۨ");
                    } else {
                        m4 = (C0003.f10 * C0000.f4) + 1801558;
                    }
                case 1755398:
                    if (C0003.f10 % (C0003.f10 ^ 9678) >= 0) {
                        C0001.m8();
                        m4 = C0000.m4("ۣۢ۠");
                    } else {
                        m4 = (C0004.f11 / C0003.f10) + 1752633;
                    }
            }
            return this;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    public IOSDialog setOtherButton(String str) {
        String str2;
        int m9 = C0001.m9("ۥ۟ۡ");
        while (true) {
            switch (m9) {
                case 1752455:
                    this.OtherButton.setText(str);
                    if ((C0003.f10 ^ (C0001.f5 / (-2530))) >= 0) {
                        C0000.f4 = 33;
                        m9 = C0002.m14("ۦۥۢ");
                    } else {
                        str2 = "ۦۥۢ";
                        m9 = C0004.m49(str2);
                    }
                case 1753603:
                    this.OtherButton.setVisibility(0);
                    if (C0000.f4 + (C0004.f11 ^ 8062) >= 0) {
                        C0001.f5 = 37;
                    } else {
                        m9 = C0004.f11 + C0004.f11 + 1755985;
                    }
                case 1754444:
                    if (C0001.f5 + C0002.f6 + 5008 <= 0) {
                        C0003.f10 = 55;
                        str2 = "ۣۧۧ";
                        m9 = C0004.m49(str2);
                    } else {
                        m9 = C0003.f10 + C0000.f4 + 1751779;
                    }
                case 1754539:
                    RefreshButton();
                    m9 = C0004.m46() <= 0 ? C0002.m14("ۥ۟ۡ") : C0001.m9("ۨ۟ۤ");
                case 1755341:
                    break;
            }
            return this;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    public IOSDialog setRadius(float f2) {
        String str;
        int m44 = C0003.m44("ۣۡ۟");
        while (true) {
            switch (m44) {
                case 1748613:
                    this.Radius = f2;
                    m44 = C0000.f4 * (C0002.f6 + (-6165)) >= 0 ? C0001.m9("ۣۢۧ") : (C0002.f6 - C0002.f6) ^ 1755585;
                case 1749822:
                    this.MainView.setBackground(this.gradientDrawable);
                    m44 = C0003.f10 + C0002.f6 + 1751066;
                case 1751494:
                    break;
                case 1751619:
                    if ((C0000.f4 ^ (C0000.f4 * 1220)) <= 0) {
                        C0001.f5 = 19;
                        str = "ۧ۟ۤ";
                        m44 = C0003.m44(str);
                    } else {
                        m44 = (C0000.f4 + C0004.f11) ^ 1748630;
                    }
                case 1755585:
                    this.gradientDrawable.setCornerRadii(new float[]{f2, f2, f2, f2, f2, f2, f2, f2});
                    if (C0001.f5 <= 0) {
                        C0002.f6 = 62;
                        m44 = C0001.m9("ۣۤۢ");
                    } else {
                        str = "ۣۢۧ";
                        m44 = C0003.m44(str);
                    }
            }
            return this;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    public IOSDialog setRadius(int i) {
        String str;
        int m44 = C0003.m44("ۣۧۧ");
        while (true) {
            switch (m44) {
                case 1752611:
                    if ((C0003.f10 | (C0002.f6 * (-2344))) >= 0) {
                        str = "ۡۧۧ";
                        m44 = C0002.m14(str);
                    } else {
                        m44 = (C0002.f6 % C0000.f4) + 1754013;
                    }
                case 1753453:
                    this.MainView.setBackground(this.gradientDrawable);
                    m44 = (C0000.f4 ^ C0004.f11) ^ (-1755519);
                case 1754507:
                    this.gradientDrawable.setColor(i);
                    if (C0004.m46() <= 0) {
                        m44 = C0004.m49("ۣۨۥ");
                    } else {
                        str = "ۦ۠ۧ";
                        m44 = C0002.m14(str);
                    }
                case 1755466:
                    break;
            }
            return this;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004b, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.xy.xyverify.Dialog.IOSDialog setTitle(java.lang.String r3) {
        /*
            r2 = this;
            java.lang.String r0 = "ۥ۟ۡ"
            int r0 = com.xy.xyverify.Dialog.C0001.m9(r0)
        L6:
            switch(r0) {
                case 1752455: goto La;
                case 1752485: goto L28;
                case 1754411: goto L4b;
                case 1755522: goto L38;
                default: goto L9;
            }
        L9:
            goto L6
        La:
            android.widget.TextView r0 = r2.TitleView
            r0.setText(r3)
            int r0 = com.xy.xyverify.Dialog.C0001.f5
            if (r0 > 0) goto L1e
            r0 = 56
            com.xy.xyverify.Verify.C0003.f10 = r0
            java.lang.String r0 = "ۧ۠ۤ"
            int r0 = com.xy.xyverify.Dialog.C0002.m14(r0)
            goto L6
        L1e:
            int r0 = com.xy.xyverify.Dialog.C0002.f6
            int r1 = com.xy.xyverify.Verify.C0004.f11
            r0 = r0 | r1
            r1 = 1753014(0x1abfb6, float:2.456496E-39)
            int r0 = r0 + r1
            goto L6
        L28:
            android.widget.TextView r0 = r2.TitleView
            r1 = 0
            r0.setVisibility(r1)
            int r0 = com.xy.xyverify.Verify.C0003.f10
            int r1 = com.xy.xyverify.Verify.C0004.f11
            int r0 = r0 / r1
            r1 = 1754411(0x1ac52b, float:2.458453E-39)
            r0 = r0 ^ r1
            goto L6
        L38:
            int r0 = com.xy.xyverify.Verify.C0004.f11
            int r1 = com.xy.xyverify.Dialog.C0000.f4
            r1 = r1 | 7203(0x1c23, float:1.0094E-41)
            int r0 = r0 - r1
            if (r0 < 0) goto L48
            java.lang.String r0 = "ۧۤ"
        L43:
            int r0 = com.xy.xyverify.Dialog.C0002.m14(r0)
            goto L6
        L48:
            java.lang.String r0 = "ۥ۟ۡ"
            goto L43
        L4b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xy.xyverify.Dialog.IOSDialog.setTitle(java.lang.String):com.xy.xyverify.Dialog.IOSDialog");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.xy.xyverify.Dialog.IOSDialog setTitleSize(float r3) {
        /*
            r2 = this;
            java.lang.String r0 = "ۡۥۣ"
            int r0 = com.xy.xyverify.Verify.C0004.m49(r0)
        L6:
            switch(r0) {
                case 1748799: goto La;
                case 1752615: goto L2f;
                case 1754658: goto L22;
                default: goto L9;
            }
        L9:
            goto L6
        La:
            android.widget.TextView r0 = r2.TitleView
            r0.setTextSize(r3)
            int r0 = com.xy.xyverify.Dialog.C0001.f5
            int r1 = com.xy.xyverify.Dialog.C0001.f5
            int r1 = r1 * 8140
            int r0 = r0 / r1
            if (r0 == 0) goto L2c
            com.xy.xyverify.Dialog.C0001.m8()
            java.lang.String r0 = "ۣۧۨ"
        L1d:
            int r0 = com.xy.xyverify.Dialog.C0002.m14(r0)
            goto L6
        L22:
            int r0 = com.xy.xyverify.Verify.C0004.f11
            int r1 = com.xy.xyverify.Verify.C0004.f11
            r0 = r0 | r1
            r1 = 1749522(0x1ab212, float:2.451602E-39)
            int r0 = r0 + r1
            goto L6
        L2c:
            java.lang.String r0 = "ۥۤۦ"
            goto L1d
        L2f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xy.xyverify.Dialog.IOSDialog.setTitleSize(float):com.xy.xyverify.Dialog.IOSDialog");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0007. Please report as an issue. */
    @Override // android.app.Dialog
    public void show() {
        String str;
        String str2;
        AlphaAnimation alphaAnimation = null;
        int m14 = C0002.m14("ۥۧ۠");
        while (true) {
            switch (m14) {
                case 56320:
                    if (C0002.m15() <= 0) {
                        C0000.m7();
                        str = "ۤۧۥ";
                        m14 = C0001.m9(str);
                    } else {
                        m14 = (C0004.f11 ^ C0002.f6) ^ (-1752387);
                    }
                case 1746941:
                    alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                    if (C0003.f10 * (C0003.f10 / (-6741)) != 0) {
                        C0001.f5 = 93;
                        str2 = "ۣ۠۟";
                        m14 = C0000.m4(str2);
                    } else {
                        str2 = "ۦۧۦ";
                        m14 = C0000.m4(str2);
                    }
                case 1750562:
                    break;
                case 1752456:
                    this.MainView.startAnimation(alphaAnimation);
                    if (C0001.f5 <= 0) {
                        C0002.m15();
                        m14 = C0004.m49("ۥۧ۠");
                    } else {
                        str2 = "ۣ۠۟";
                        m14 = C0000.m4(str2);
                    }
                case 1752702:
                    super.show();
                    if (C0004.f11 - (C0000.f4 / (-7768)) >= 0) {
                        C0003.f10 = 57;
                    }
                    m14 = C0004.m49("۟ۧۥ");
                case 1753669:
                    alphaAnimation.setDuration(500L);
                    str = "ۨۥۧ";
                    m14 = C0001.m9(str);
                case 1755530:
                    alphaAnimation.setFillAfter(true);
                    if (C0004.f11 / (C0003.f10 | 4641) <= 0) {
                    }
                    m14 = C0002.m14("ۥ۟ۢ");
            }
            return;
        }
    }
}
