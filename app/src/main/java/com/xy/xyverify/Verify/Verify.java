package com.xy.xyverify.Verify;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import android.widget.EditText;
import com.tencent.wechat.StatusLine;
import com.xy.xyverify.Dialog.C0000;
import com.xy.xyverify.Dialog.C0001;
import com.xy.xyverify.Dialog.C0002;
import com.xy.xyverify.Dialog.IOSDialog;
import com.xy.xyverify.Dialog.MIUIDialog;
import com.xy.xyverify.Dialog.XYToast;
import com.xy.xyverify.Verify.Verify;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class Verify {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f8short = {2949, 2954, 2944, 2966, 2955, 2957, 2944, 3003, 2957, 2944, 29974, 23608, -31268, 29422, -27866, 21212, -30370, -29382, 21452, 20936, 22895, 3028, 3070, 3058, 3062, 29084, 22706, -32481, 30253, -30625, -29637, 21197, 20681, 22638, -26512, 32655, 2525, 493, 493, 493, 32556, -29466, -31435, 23417, 23016, 31113, 28553, 30833, 27925, -2760, 634, 2597, 2597, 2597, 24746, 25582, 1583, 23222, 25832, 29239, 23321, 26204, 22227, 29982, 23600, 23124, -29120, 2852, 2856, 2851, 2850, 2424, 2406, 2418, 1393, 1390, 1399, -31893, 28432, 29668, 29289, 21892, -32368, 22306, 24453, 19022, -31554, 19065, 32313, 20959, 22904, -29859, 31855, 24750, 20513, 20819, 23028, -29743, 31971, 23299, -28905, 30156, 29761, -24700, -32398, 1103, 1091, 1096, 1097, 22970, 20765, 17622, -30170, 17633, 28833, -27434, 29481, 1556, 1546, 1566, 3034, 3019, 3019, 3044, 3036, 3036, 2922, 2917, 2927, 2937, 2916, 2914, 2927, 2853, 2914, 2917, 2943, 2926, 2917, 2943, 2853, 2922, 2920, 2943, 2914, 2916, 2917, 2853, 2909, 2882, 2894, 2908, 20772, 23785, 26013, 26329, -25828, -27637, 23128, -29108, 25671, 26371, 22259, 30354, 24722, 30570, 25102, -1490, -28971, 25558, 24722, 625, 623, 635, 1925, 1942, 1921, 1920, 1946, 1948, 1949, 419, 434, 434, 413, 439, 434, 422, 419, 438, 423, 413, 439, 432, 430, 20960, 22855, 19596, -32132, 19643, 30971, 3005, 2993, 3002, 3003, 22966, 20753, -31948, 29702, 26823, 22600, 2777, 2759, 2771, 31474, 31615, -28486, -29108, 22643, 20692, 17695, -29713, 17704, 29032, 2694, 2694, 2694, 2694, 2770, 2738, 2738, 2770, 2715, 2715, 2783, 2743, 2743, 2757, 2706, 2706, 2757, 2700, 2700, 31758, 21792, 26725, 22762, 2687, 22597, 28010, 28547, -24703, 17487, 1077, 1055, 1043, 1047, 305, 317, 310, 311, 2592, 2622, 2602, 284, 259, 282, -29534, 24793, 31789, 32160, 23117, -29095, 3232, 3247, 3237, 3251, 3246, 3240, 3237, 3311, 3240, 3247, 3253, 3236, 3247, 3253, 3311, 3232, 3234, 3253, 3240, 3246, 3247, 3311, 3223, 3208, 3204, 3222, 21590, 22939, 24815, 25515, -24978, -28295, 24362, -29890, 2189, 2178, 2184, 2206, 2179, 2181, 2184, 2242, 2181, 2178, 2200, 2185, 2178, 2200, 2242, 2189, 2191, 2200, 2181, 2179, 2178, 2242, 2234, 2213, 2217, 2235, 23180, 22337, 28213, 28017, -28492, -24669, 20976, -31260, 30175, 23793, 25012, 20795, 942, 20884, 25787, 26194, -27056, 19870, 1632, 1644, 1639, 1638, 2005, 1995, 2015, 918, 905, 912, 2028, 2028, 2028, 2028, 1976, 2008, 2008, 1976, 2033, 2033, 1973, 2013, 2013, 1967, 2040, 2040, 1967, 2022, 2022, -29543, 24802, 31766, 32155, 23158, -29086, 2404, 2382, 2370, 2374, 1625, 1607, 1619, 2674, 2659, 2659, 2636, 2676, 2676, 3164, 3151, 3160, 3161, 3139, 3141, 3140, 1924, 1941, 1941, 1978, 1936, 1941, 1921, 1924, 1937, 1920, 1978, 1936, 1943, 1929, 1997, 2014, 1993, 1992, 2002, 2004, 2005, 2020, 2002, 2005, 2013, 2004, 1124, 1141, 1141, 1114, 1136, 1141, 1121, 1124, 1137, 1120, 1114, 1128, 1136, 1142, 1137, 1563, 1546, 1546, 1573, 1551, 1546, 1566, 1563, 1550, 1567, 1573, 1545, 1554, 1557, 1549, 1027, 1042, 1042, 1085, 1041, 1045, 1035, 1046, 1025, 1034, 3049};
    boolean FreeKami;
    boolean TureCard;
    String androidId;
    String app_gg;
    Context context;
    int getVersioncode;
    private Handler handler;
    String mustUpdate;
    String updateInfo;
    String updateShow;
    String url;
    int versioncode;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.xy.xyverify.Verify.Verify$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass2 extends TimerTask {

        /* renamed from: short, reason: not valid java name */
        private static final short[] f9short = {279, 283, 272, 273, 2402, 2428, 2408, 2471, 2488, 2465, 21051, 23196, 21033, 23900, 21354, 26181};
        final Verify this$0;
        final String val$androidId;
        final String val$card;
        final Timer val$timer;

        /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0012. Please report as an issue. */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0054  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        AnonymousClass2(com.xy.xyverify.Verify.Verify r4, java.lang.String r5, java.lang.String r6, java.util.Timer r7) {
            /*
                r3 = this;
                r3.this$0 = r4
                r3.val$card = r5
                r3.val$androidId = r6
                r3.val$timer = r7
                r3.<init>()
                r0 = 0
                java.lang.String r1 = "ۢۥ۠"
                int r1 = com.xy.xyverify.Dialog.C0002.m14(r1)
            L12:
                switch(r1) {
                    case 56475: goto L16;
                    case 1746850: goto La0;
                    case 1749607: goto L4b;
                    case 1749757: goto L81;
                    case 1751718: goto L34;
                    case 1753478: goto L5e;
                    default: goto L15;
                }
            L15:
                goto L12
            L16:
                java.lang.String r0 = "nWrIIFG7V1Lt5"
                java.lang.String r0 = com.xy.xyverify.Dialog.C0000.m6(r0)
                java.lang.Double r0 = java.lang.Double.valueOf(r0)
                int r1 = com.xy.xyverify.Verify.C0004.f11
                int r2 = com.xy.xyverify.Verify.C0003.f10
                r2 = r2 | (-9519(0xffffffffffffdad1, float:NaN))
                int r1 = r1 - r2
                if (r1 < 0) goto L7e
                r1 = 31
                com.xy.xyverify.Dialog.C0002.f6 = r1
                java.lang.String r1 = "ۢ۠ۥ"
                int r1 = com.xy.xyverify.Dialog.C0000.m4(r1)
                goto L12
            L34:
                int r1 = com.xy.xyverify.Dialog.C0002.f6
                int r2 = com.xy.xyverify.Dialog.C0001.f5
                int r2 = r2 + 2201
                int r1 = r1 / r2
                if (r1 == 0) goto L44
                java.lang.String r1 = "ۧۤ۠"
                int r1 = com.xy.xyverify.Dialog.C0002.m14(r1)
                goto L12
            L44:
                java.lang.String r1 = "ۢۥ۠"
                int r1 = com.xy.xyverify.Dialog.C0000.m4(r1)
                goto L12
            L4b:
                int r1 = com.xy.xyverify.Dialog.C0001.f5
                int r2 = com.xy.xyverify.Dialog.C0000.f4
                int r2 = r2 * 8620
                int r1 = r1 - r2
                if (r1 < 0) goto L5b
                java.lang.String r1 = "ۣۦۤ"
            L56:
                int r1 = com.xy.xyverify.Verify.C0004.m49(r1)
                goto L12
            L5b:
                java.lang.String r1 = "۟ۤۧ"
                goto L56
            L5e:
                java.io.PrintStream r1 = java.lang.System.out
                r1.println(r0)
                int r1 = com.xy.xyverify.Dialog.C0000.m7()
                if (r1 > 0) goto L74
                r1 = 33
                com.xy.xyverify.Dialog.C0000.f4 = r1
                java.lang.String r1 = "ۢۥ۠"
                int r1 = com.xy.xyverify.Dialog.C0000.m4(r1)
                goto L12
            L74:
                int r1 = com.xy.xyverify.Dialog.C0000.f4
                int r2 = com.xy.xyverify.Verify.C0003.f10
                r1 = r1 ^ r2
                r2 = 1747530(0x1aaa4a, float:2.448811E-39)
                int r1 = r1 + r2
                goto L12
            L7e:
                java.lang.String r1 = "ۦۡۡ"
                goto L56
            L81:
                int r1 = com.xy.xyverify.Dialog.C0000.m7()
                if (r1 > 0) goto L4b
                int r1 = com.xy.xyverify.Verify.C0004.m46()
                if (r1 > 0) goto L95
                java.lang.String r1 = "ۦۡۡ"
                int r1 = com.xy.xyverify.Verify.C0003.m44(r1)
                goto L12
            L95:
                int r1 = com.xy.xyverify.Dialog.C0001.f5
                int r2 = com.xy.xyverify.Verify.C0003.f10
                int r1 = r1 - r2
                r2 = 55925(0xda75, float:7.8368E-41)
                int r1 = r1 + r2
                goto L12
            La0:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.xy.xyverify.Verify.Verify.AnonymousClass2.<init>(com.xy.xyverify.Verify.Verify, java.lang.String, java.lang.String, java.util.Timer):void");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0097 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:31:0x008b A[SYNTHETIC] */
        /* renamed from: lambda$run$0$com-xy-xyverify-Verify-Verify$2, reason: not valid java name */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public /* synthetic */ void m40lambda$run$0$comxyxyverifyVerifyVerify$2(java.util.Timer r4) {
            /*
                Method dump skipped, instructions count: 266
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.xy.xyverify.Verify.Verify.AnonymousClass2.m40lambda$run$0$comxyxyverifyVerifyVerify$2(java.util.Timer):void");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
        /* renamed from: lambda$run$1$com-xy-xyverify-Verify-Verify$2, reason: not valid java name */
        public /* synthetic */ void m41lambda$run$1$comxyxyverifyVerifyVerify$2(Timer timer) {
            String str;
            int m4 = C0000.m4("ۡ۠۠");
            while (true) {
                switch (m4) {
                    case 1747715:
                        break;
                    case 1748641:
                        Verify.access$100(this.this$0);
                        if ((C0000.f4 ^ (C0004.f11 / (-945))) <= 0) {
                            C0002.m15();
                            m4 = C0003.m44("ۧۨۥ");
                        } else {
                            m4 = (C0002.f6 | C0000.f4) ^ 1752552;
                        }
                    case 1749855:
                        timer.cancel();
                        if (C0002.m15() <= 0) {
                            C0001.f5 = 18;
                            m4 = C0001.m9("۠ۡۤ");
                        } else {
                            str = "۠ۡۤ";
                            m4 = C0000.m4(str);
                        }
                    case 1752582:
                        Verify.access$200(this.this$0);
                        str = "ۢۨۥ";
                        m4 = C0000.m4(str);
                    case 1754660:
                        if ((C0003.f10 ^ (C0001.f5 + 4504)) >= 0) {
                            C0000.m7();
                            str = "ۢۤۥ";
                        } else {
                            str = "ۡ۠۠";
                        }
                        m4 = C0000.m4(str);
                }
                return;
            }
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0012. Please report as an issue. */
        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            Runnable runnable;
            JSONObject jSONObject;
            Object obj;
            JSONObject jSONObject2;
            String str6;
            String str7;
            JSONObject jSONObject3 = null;
            long j2 = 0;
            Handler handler = null;
            Handler handler2 = null;
            final Timer timer = null;
            Runnable runnable2 = null;
            Runnable runnable3 = null;
            final Timer timer2 = null;
            int m9 = C0001.m9("ۡۡۦ");
            while (true) {
                switch (m9) {
                    case 56353:
                        try {
                        } catch (Exception e2) {
                            e2.printStackTrace();
                            if ((C0003.f10 ^ (C0001.f5 / (-8298))) < 0) {
                                str4 = "ۣ۟ۧ";
                                break;
                            } else {
                                C0002.m15();
                                m9 = C0001.m9("ۤۡۧ");
                            }
                        }
                        if (j2 > System.currentTimeMillis() / 1000) {
                            m9 = C0002.m14("ۤۢۢ");
                        } else if (C0000.f4 - (C0000.f4 | (-4645)) <= 0) {
                            C0001.f5 = 27;
                            str7 = "ۦ۠ۡ";
                            m9 = C0001.m9(str7);
                        } else {
                            m9 = (C0003.f10 ^ C0001.f5) + 1751984;
                        }
                    case 56478:
                        jSONObject = new JSONObject(VerifyGetInfo.Login(this.val$card, this.val$androidId));
                        obj = "۟ۥۡ";
                        jSONObject2 = jSONObject;
                        jSONObject3 = jSONObject2;
                        m9 = C0002.m14(obj);
                    case 1746812:
                    case 1746939:
                    case 1749703:
                    case 1751497:
                        str3 = "ۢۦۦ";
                        m9 = C0002.m14(str3);
                    case 1746875:
                        if (jSONObject3.getInt(C0004.m48(f9short, 0, 4, 372)) != VerifyGetInfo.Code) {
                            str = "ۨۡۡ";
                            m9 = C0001.m9(str);
                        } else if (C0003.f10 * C0001.f5 * (-668) <= 0) {
                            C0003.m42();
                            m9 = C0001.m9("ۦۢ۠");
                        } else {
                            str4 = "ۦ۠ۡ";
                            m9 = C0004.m49(str4);
                        }
                    case 1746941:
                        if (C0002.m15() <= 0) {
                            m9 = C0002.m14("ۢۢۢ");
                        } else {
                            str = "ۤ۟ۤ";
                            m9 = C0001.m9(str);
                        }
                    case 1747773:
                        Timer timer3 = this.val$timer;
                        if (C0001.f5 * (C0002.f6 | (-9359)) >= 0) {
                            timer2 = timer3;
                            m9 = C0003.m44("ۦۨ۠");
                        } else {
                            timer2 = timer3;
                            m9 = C0002.m14("ۣۡۢ");
                        }
                    case 1748609:
                        m9 = C0001.m9("ۥۣ");
                    case 1748678:
                        if (C0002.f6 - (C0002.f6 - 556) <= 0) {
                            C0004.f11 = 58;
                            m9 = C0002.m14("ۣ۟ۧ");
                        } else {
                            m9 = (C0001.f5 * C0004.f11) + 406410;
                        }
                    case 1748680:
                        m9 = C0002.m14("ۤۢۢ");
                    case 1748736:
                        Runnable runnable4 = new Runnable(this, timer2) { // from class: com.xy.xyverify.Verify.Verify$2$$ExternalSyntheticLambda0
                            public final Verify.AnonymousClass2 f$0;
                            public final Timer f$1;

                            /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000a. Please report as an issue. */
                            {
                                String str8;
                                Integer num = null;
                                int m92 = C0001.m9("۠ۥ");
                                while (true) {
                                    switch (m92) {
                                        case 56325:
                                            this.f$0 = this;
                                            m92 = (C0003.f10 - C0004.f11) + 1747024;
                                        case 56545:
                                            m92 = C0003.m44("ۨۧۢ");
                                        case 1746688:
                                            System.out.println(num);
                                            if (C0001.f5 / (C0004.f11 % (-8386)) != 0) {
                                            }
                                            m92 = C0001.m9("ۨۧۢ");
                                        case 1747681:
                                            this.f$1 = timer2;
                                            str8 = "ۣۤۢ";
                                            m92 = C0001.m9(str8);
                                        case 1751619:
                                            if (C0000.m7() <= 0) {
                                                if (C0003.f10 / (C0001.f5 % 674) != 0) {
                                                    C0003.m42();
                                                }
                                                m92 = C0000.m4("ۥۡ۠");
                                            } else {
                                                m92 = C0003.m44("ۨۧۢ");
                                            }
                                        case 1752516:
                                            num = Integer.decode(C0004.m47("XJOo"));
                                            if (C0002.f6 <= 0) {
                                                C0001.f5 = 31;
                                                str8 = "ۣۤۢ";
                                            } else {
                                                str8 = "۟۟۠";
                                            }
                                            m92 = C0001.m9(str8);
                                        case 1755465:
                                            m92 = (C0002.f6 - C0003.f10) + 55765;
                                        case 1755587:
                                            break;
                                    }
                                    return;
                                }
                            }

                            /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
                            @Override // java.lang.Runnable
                            public final void run() {
                                String str8;
                                int m44 = C0003.m44("۠ۤۤ");
                                while (true) {
                                    switch (m44) {
                                        case 1747808:
                                            this.f$0.m40lambda$run$0$comxyxyverifyVerifyVerify$2(this.f$1);
                                            str8 = "ۨۦۥ";
                                            m44 = C0003.m44(str8);
                                        case 1749573:
                                            if (C0000.f4 / (C0001.f5 * 1709) != 0) {
                                                str8 = "ۧۡۧ";
                                                m44 = C0003.m44(str8);
                                            } else {
                                                m44 = (C0001.f5 % C0001.f5) ^ 1747808;
                                            }
                                        case 1755559:
                                            break;
                                    }
                                    return;
                                }
                            }
                        };
                        if (C0004.f11 - (C0003.f10 / (-2289)) >= 0) {
                            C0001.f5 = 69;
                            runnable3 = runnable4;
                            m9 = C0004.m49("ۨۢ۟");
                        } else {
                            runnable3 = runnable4;
                            m9 = (C0003.f10 - C0003.f10) + 1753633;
                        }
                    case 1748894:
                        str = "ۨۡۡ";
                        m9 = C0001.m9(str);
                    case 1749666:
                        handler2.post(runnable2);
                        str3 = "ۣۢۢ";
                        m9 = C0002.m14(str3);
                    case 1749697:
                        m9 = (C0001.f5 % C0003.f10) ^ 1749713;
                    case 1749794:
                        break;
                    case 1751531:
                        timer = this.val$timer;
                        if (C0003.f10 >= 0) {
                            C0002.m15();
                            str6 = "ۣۢۢ";
                            m9 = C0002.m14(str6);
                        } else {
                            m9 = C0004.m49("ۨۡۦ");
                        }
                    case 1751562:
                        handler = this.this$0.handler;
                        if (C0003.f10 / (C0001.f5 ^ (-16)) != 0) {
                            C0001.m8();
                            str4 = "ۧۦۦ";
                            m9 = C0004.m49(str4);
                        } else {
                            str5 = "ۣ۠۠";
                            runnable = runnable2;
                            runnable2 = runnable;
                            m9 = C0004.m49(str5);
                        }
                    case 1751588:
                        if (((j2 - 8) - (System.currentTimeMillis() / 1000)) + 8 >= 300) {
                            str3 = "ۢۦۦ";
                            m9 = C0002.m14(str3);
                        } else if (C0002.f6 % (C0003.f10 % 7704) <= 0) {
                            C0003.f10 = 7;
                            m9 = C0000.m4("ۨۡۡ");
                        } else {
                            str7 = "ۦۢ۠";
                            m9 = C0001.m9(str7);
                        }
                    case 1753447:
                        j2 = jSONObject3.getJSONObject(C0000.m5(f9short, 4, 3, 2319)).getLong(C0002.m13(f9short, 7, 3, 2513));
                        if (C0001.f5 % (C0001.f5 * 5062) <= 0) {
                            m9 = C0003.m44("ۡۡۦ");
                        } else {
                            str2 = "ۡۢ";
                            m9 = C0001.m9(str2);
                        }
                    case 1753508:
                        XYToast.makeTextShow(this.this$0.context, C0002.m13(f9short, 10, 6, 346));
                        if ((C0000.f4 | (C0002.f6 % 6903)) <= 0) {
                            C0000.m7();
                            m9 = C0002.m14("ۡۨۥ");
                        } else {
                            obj = "ۧۦۦ";
                            jSONObject2 = jSONObject3;
                            jSONObject3 = jSONObject2;
                            m9 = C0002.m14(obj);
                        }
                    case 1753633:
                        handler.post(runnable3);
                        if (C0004.f11 % (C0001.f5 | 7766) >= 0) {
                            C0001.f5 = 45;
                            jSONObject = jSONObject3;
                            obj = "۟ۥۡ";
                            jSONObject2 = jSONObject;
                            jSONObject3 = jSONObject2;
                            m9 = C0002.m14(obj);
                        } else {
                            m9 = (C0002.f6 - C0001.f5) ^ 1746935;
                        }
                    case 1753694:
                        if (C0003.f10 >= 0) {
                            C0003.f10 = 38;
                            str3 = "ۢ۠۟";
                            m9 = C0002.m14(str3);
                        } else {
                            m9 = (C0003.f10 % C0003.f10) ^ 1749697;
                        }
                    case 1754599:
                        if (C0003.f10 - (C0001.f5 * (-294)) <= 0) {
                            m9 = C0002.m14("ۡ۟۟");
                        } else {
                            str3 = "ۣ۟۠";
                            m9 = C0002.m14(str3);
                        }
                    case 1755400:
                        handler2 = this.this$0.handler;
                        if (C0000.f4 <= 0) {
                            C0003.f10 = 11;
                            str2 = "ۨۡۦ";
                            m9 = C0001.m9(str2);
                        } else {
                            str6 = "ۤ۠ۧ";
                            m9 = C0002.m14(str6);
                        }
                    case 1755405:
                        runnable = new Runnable(this, timer) { // from class: com.xy.xyverify.Verify.Verify$2$$ExternalSyntheticLambda1
                            public final Verify.AnonymousClass2 f$0;
                            public final Timer f$1;

                            /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000a. Please report as an issue. */
                            /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
                            /* JADX WARN: Removed duplicated region for block: B:25:0x006d  */
                            {
                                /*
                                    r3 = this;
                                    r3.<init>()
                                    r0 = 0
                                    java.lang.String r1 = "۟ۨ۠"
                                    int r1 = com.xy.xyverify.Verify.C0003.m44(r1)
                                La:
                                    switch(r1) {
                                        case 56290: goto Le;
                                        case 1746967: goto L8e;
                                        case 1747718: goto L70;
                                        case 1748706: goto L4c;
                                        case 1749672: goto L3c;
                                        case 1750658: goto L5d;
                                        case 1750751: goto L26;
                                        case 1755407: goto Laf;
                                        default: goto Ld;
                                    }
                                Ld:
                                    goto La
                                Le:
                                    java.io.PrintStream r1 = java.lang.System.out
                                    r1.println(r0)
                                    int r1 = com.xy.xyverify.Verify.C0004.f11
                                    int r2 = com.xy.xyverify.Dialog.C0002.f6
                                    int r2 = r2 % (-4283)
                                    r1 = r1 ^ r2
                                    if (r1 < 0) goto L32
                                    com.xy.xyverify.Dialog.C0001.m8()
                                    java.lang.String r1 = "۠ۡۧ"
                                    int r1 = com.xy.xyverify.Dialog.C0002.m14(r1)
                                    goto La
                                L26:
                                    r3.f$1 = r5
                                    int r1 = com.xy.xyverify.Dialog.C0000.f4
                                    int r2 = com.xy.xyverify.Dialog.C0001.f5
                                    int r1 = r1 * r2
                                    r2 = 2082928(0x1fc870, float:2.918804E-39)
                                    r1 = r1 ^ r2
                                    goto La
                                L32:
                                    int r1 = com.xy.xyverify.Dialog.C0001.f5
                                    int r2 = com.xy.xyverify.Dialog.C0000.f4
                                    r1 = r1 | r2
                                    r2 = 1754409(0x1ac529, float:2.45845E-39)
                                    int r1 = r1 + r2
                                    goto La
                                L3c:
                                    int r1 = com.xy.xyverify.Verify.C0003.m42()
                                    if (r1 > 0) goto L5d
                                    int r1 = com.xy.xyverify.Dialog.C0001.f5
                                    int r2 = com.xy.xyverify.Dialog.C0002.f6
                                    r1 = r1 | r2
                                    r2 = 1748212(0x1aacf4, float:2.449767E-39)
                                    int r1 = r1 + r2
                                    goto La
                                L4c:
                                    java.lang.String r0 = "BCUyvoAEFyFk"
                                    java.lang.String r0 = com.xy.xyverify.Dialog.C0002.m12(r0)
                                    java.lang.Double r0 = java.lang.Double.valueOf(r0)
                                    java.lang.String r1 = "۟ۡ"
                                L58:
                                    int r1 = com.xy.xyverify.Dialog.C0000.m4(r1)
                                    goto La
                                L5d:
                                    int r1 = com.xy.xyverify.Verify.C0003.f10
                                    int r2 = com.xy.xyverify.Verify.C0004.f11
                                    int r2 = r2 % 5465
                                    int r1 = r1 / r2
                                    if (r1 == 0) goto L6d
                                    r1 = 24
                                    com.xy.xyverify.Dialog.C0000.f4 = r1
                                    java.lang.String r1 = "۠ۤۤ"
                                    goto L58
                                L6d:
                                    java.lang.String r1 = "ۨۡۨ"
                                    goto L58
                                L70:
                                    int r1 = com.xy.xyverify.Dialog.C0000.f4
                                    int r2 = com.xy.xyverify.Dialog.C0001.f5
                                    int r2 = r2 + 7746
                                    int r1 = r1 % r2
                                    if (r1 > 0) goto L83
                                    com.xy.xyverify.Dialog.C0002.m15()
                                    java.lang.String r1 = "ۤۤ۟"
                                    int r1 = com.xy.xyverify.Verify.C0004.m49(r1)
                                    goto La
                                L83:
                                    int r1 = com.xy.xyverify.Dialog.C0002.f6
                                    int r2 = com.xy.xyverify.Verify.C0004.f11
                                    int r1 = r1 * r2
                                    r2 = 2104129(0x201b41, float:2.948513E-39)
                                    int r1 = r1 + r2
                                    goto La
                                L8e:
                                    r3.f$0 = r4
                                    int r1 = com.xy.xyverify.Dialog.C0002.f6
                                    int r2 = com.xy.xyverify.Dialog.C0002.f6
                                    int r2 = r2 + (-2908)
                                    r1 = r1 ^ r2
                                    if (r1 < 0) goto La4
                                    com.xy.xyverify.Dialog.C0001.m8()
                                    java.lang.String r1 = "ۣۣۢ"
                                    int r1 = com.xy.xyverify.Dialog.C0000.m4(r1)
                                    goto La
                                La4:
                                    int r1 = com.xy.xyverify.Verify.C0003.f10
                                    int r2 = com.xy.xyverify.Dialog.C0002.f6
                                    int r1 = r1 / r2
                                    r2 = 1750751(0x1ab6df, float:2.453325E-39)
                                    r1 = r1 ^ r2
                                    goto La
                                Laf:
                                    return
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.xy.xyverify.Verify.Verify$2$$ExternalSyntheticLambda1.<init>(com.xy.xyverify.Verify.Verify$2, java.util.Timer):void");
                            }

                            /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
                            /* JADX WARN: Removed duplicated region for block: B:19:0x0042 A[SYNTHETIC] */
                            /* JADX WARN: Removed duplicated region for block: B:22:0x003f A[SYNTHETIC] */
                            @Override // java.lang.Runnable
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final void run() {
                                /*
                                    r4 = this;
                                    r2 = 0
                                    java.lang.String r0 = "ۣ۠ۢ"
                                    int r0 = com.xy.xyverify.Verify.C0004.m49(r0)
                                L8:
                                    switch(r0) {
                                        case 56567: goto Lc;
                                        case 1746723: goto L53;
                                        case 1747745: goto L2a;
                                        case 1750626: goto L7c;
                                        case 1750755: goto L4c;
                                        case 1751748: goto L3b;
                                        case 1753421: goto L6b;
                                        default: goto Lb;
                                    }
                                Lb:
                                    goto L8
                                Lc:
                                    java.lang.String r0 = "FdU1Yr1reQg89eIVMrfif2bFJ"
                                    java.lang.String r0 = com.xy.xyverify.Verify.C0004.m47(r0)
                                    double r2 = java.lang.Double.parseDouble(r0)
                                    int r0 = com.xy.xyverify.Verify.C0003.f10
                                    int r1 = com.xy.xyverify.Dialog.C0002.f6
                                    int r1 = r1 + (-3028)
                                    r0 = r0 | r1
                                    if (r0 < 0) goto L38
                                    r0 = 45
                                    com.xy.xyverify.Dialog.C0001.f5 = r0
                                    java.lang.String r0 = "۟۠ۤ"
                                    int r0 = com.xy.xyverify.Dialog.C0000.m4(r0)
                                    goto L8
                                L2a:
                                    com.xy.xyverify.Verify.Verify$2 r0 = r4.f$0
                                    java.util.Timer r1 = r4.f$1
                                    r0.m41lambda$run$1$comxyxyverifyVerifyVerify$2(r1)
                                    java.lang.String r0 = "ۦ۟ۦ"
                                L33:
                                    int r0 = com.xy.xyverify.Dialog.C0000.m4(r0)
                                    goto L8
                                L38:
                                    java.lang.String r0 = "۟۠ۤ"
                                    goto L33
                                L3b:
                                    int r0 = com.xy.xyverify.Verify.C0004.f11
                                    if (r0 < 0) goto L42
                                    java.lang.String r0 = "۠ۦۡ"
                                    goto L33
                                L42:
                                    int r0 = com.xy.xyverify.Dialog.C0002.f6
                                    int r1 = com.xy.xyverify.Dialog.C0000.f4
                                    int r0 = r0 * r1
                                    r1 = 1384078(0x151e8e, float:1.939506E-39)
                                    int r0 = r0 + r1
                                    goto L8
                                L4c:
                                    java.lang.String r0 = "ۣ۠ۢ"
                                    int r0 = com.xy.xyverify.Dialog.C0000.m4(r0)
                                    goto L8
                                L53:
                                    java.io.PrintStream r0 = java.lang.System.out
                                    r0.println(r2)
                                    int r0 = com.xy.xyverify.Dialog.C0001.f5
                                    int r1 = com.xy.xyverify.Dialog.C0002.f6
                                    int r1 = r1 % (-6600)
                                    int r0 = r0 * r1
                                    if (r0 > 0) goto L68
                                L61:
                                    java.lang.String r0 = "ۨ۟"
                                L63:
                                    int r0 = com.xy.xyverify.Dialog.C0001.m9(r0)
                                    goto L8
                                L68:
                                    java.lang.String r0 = "ۣۢۡ"
                                    goto L63
                                L6b:
                                    int r0 = com.xy.xyverify.Dialog.C0002.m15()
                                    if (r0 > 0) goto L3b
                                    int r0 = com.xy.xyverify.Verify.C0004.f11
                                    if (r0 < 0) goto L61
                                    java.lang.String r0 = "ۣۢۡ"
                                    int r0 = com.xy.xyverify.Verify.C0004.m49(r0)
                                    goto L8
                                L7c:
                                    return
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.xy.xyverify.Verify.Verify$2$$ExternalSyntheticLambda1.run():void");
                            }
                        };
                        if (C0000.m7() <= 0) {
                            C0004.f11 = 33;
                            str5 = "ۢۦۦ";
                            runnable2 = runnable;
                            m9 = C0004.m49(str5);
                        } else {
                            str = "ۢۢۢ";
                            runnable2 = runnable;
                            m9 = C0001.m9(str);
                        }
                    case 1755429:
                        str = C0003.f10 % (C0003.f10 | 8415) != 0 ? "ۧۥۥ" : "ۡۡۦ";
                        m9 = C0001.m9(str);
                }
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003d, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void $r8$lambda$qYf42yUja4xHdBRYNYGuRy85y1A(com.xy.xyverify.Verify.Verify r2) {
        /*
            java.lang.String r0 = "ۨۥ"
            int r0 = com.xy.xyverify.Verify.C0003.m44(r0)
        L6:
            switch(r0) {
                case 56573: goto La;
                case 1752705: goto L3d;
                case 1753540: goto L23;
                default: goto L9;
            }
        L9:
            goto L6
        La:
            r2.MIUILogin()
            int r0 = com.xy.xyverify.Dialog.C0002.f6
            int r1 = com.xy.xyverify.Verify.C0004.f11
            int r1 = r1 % 4999
            int r0 = r0 - r1
            if (r0 > 0) goto L20
            com.xy.xyverify.Verify.C0003.m42()
            java.lang.String r0 = "ۦۣۡ"
        L1b:
            int r0 = com.xy.xyverify.Dialog.C0001.m9(r0)
            goto L6
        L20:
            java.lang.String r0 = "ۥۣۧ"
            goto L1b
        L23:
            int r0 = com.xy.xyverify.Verify.C0004.m46()
            if (r0 > 0) goto L33
            com.xy.xyverify.Dialog.C0002.m15()
            java.lang.String r0 = "ۢ۠ۧ"
            int r0 = com.xy.xyverify.Verify.C0003.m44(r0)
            goto L6
        L33:
            int r0 = com.xy.xyverify.Dialog.C0000.f4
            int r1 = com.xy.xyverify.Verify.C0003.f10
            r0 = r0 | r1
            r1 = 56575(0xdcff, float:7.9278E-41)
            int r0 = r0 + r1
            goto L6
        L3d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xy.xyverify.Verify.Verify.$r8$lambda$qYf42yUja4xHdBRYNYGuRy85y1A(com.xy.xyverify.Verify.Verify):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000f. Please report as an issue. */
    private Verify(Context context) {
        String str;
        String str2;
        String str3;
        int m9 = C0001.m9("ۥۣ۟");
        Integer num = null;
        while (true) {
            switch (m9) {
                case 56293:
                    break;
                case 56385:
                    m9 = (C0000.f4 - C0001.f5) + 1746436;
                case 56573:
                case 1752553:
                    str = (C0003.f10 ^ (C0003.f10 / 6280)) >= 0 ? "ۢ۠" : "ۢ۟ۦ";
                    m9 = C0000.m4(str);
                case 1746694:
                    try {
                        this.versioncode = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                        str = "۟ۥۤ";
                        m9 = C0000.m4(str);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        if (C0003.f10 < 0) {
                            break;
                        } else {
                            C0002.m15();
                            m9 = C0002.m14("ۧۦ۟");
                        }
                    }
                case 1746876:
                    m9 = C0001.m9("ۥۣ۟");
                case 1746878:
                    this.androidId = Settings.Secure.getString(context.getContentResolver(), C0000.m5(f8short, 0, 10, 3044));
                    if (C0003.f10 / (C0000.f4 % (-7439)) != 0) {
                        C0004.f11 = 78;
                        m9 = C0003.m44("ۢ۟ۡ");
                    } else {
                        m9 = (C0001.f5 % C0002.f6) + 1755137;
                    }
                case 1748767:
                    Integer decode = Integer.decode(C0002.m12("ykEf5pBGiFQg23MQku"));
                    m9 = 1753791 + (C0001.f5 ^ C0000.f4);
                    num = decode;
                case 1749572:
                    if (C0003.m42() > 0) {
                        m9 = (C0000.f4 * C0002.f6) ^ 347185;
                    } else if (C0000.f4 <= 0) {
                        C0002.f6 = 0;
                        str3 = "ۧۥ۟";
                        m9 = C0004.m49(str3);
                    } else {
                        m9 = (C0001.f5 * C0000.f4) + 1389639;
                    }
                case 1749577:
                    MakeInternet(context);
                    m9 = (C0002.f6 ^ C0001.f5) + 1749562;
                case 1749822:
                    this.handler = new Handler(Looper.getMainLooper());
                    if (C0001.f5 + (C0003.f10 / (-9997)) <= 0) {
                        m9 = C0003.m44("ۥۢۦ");
                    } else {
                        str = "ۦۨۢ";
                        m9 = C0000.m4(str);
                    }
                case 1752457:
                    this.TureCard = true;
                    if (C0003.f10 >= 0) {
                        C0001.f5 = 17;
                        m9 = C0004.m49("۟ۥۢ");
                    } else {
                        m9 = (C0003.f10 / C0004.f11) ^ 1754592;
                    }
                case 1752738:
                    m9 = (C0001.f5 % C0004.f11) ^ 1755137;
                case 1753485:
                    m9 = (C0000.f4 * C0002.f6) ^ 347185;
                case 1753696:
                    this.context = context;
                    if (C0004.f11 >= 0) {
                        str2 = "ۥۨۥ";
                        m9 = C0001.m9(str2);
                    } else {
                        m9 = (C0003.f10 / C0002.f6) + 1746694;
                    }
                case 1754561:
                    System.out.println(num);
                    if (C0004.f11 * (C0001.f5 % (-6423)) >= 0) {
                        C0001.f5 = 71;
                        m9 = C0000.m4("ۦۡۨ");
                    } else {
                        str2 = "۟ۤ";
                        m9 = C0001.m9(str2);
                    }
                case 1754592:
                    this.FreeKami = false;
                    m9 = (C0000.f4 / C0001.f5) + 1749821;
                case 1755621:
                    if (C0001.f5 % (C0002.f6 + 4124) <= 0) {
                        C0004.m46();
                        m9 = C0001.m9("ۣۢ");
                    } else {
                        str3 = "ۨۥ";
                        m9 = C0004.m49(str3);
                    }
            }
            return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000e. Please report as an issue. */
    private void IOSLogin() {
        String str;
        String str2;
        String str3;
        String str4;
        EditText input;
        String str5;
        int m9 = C0001.m9("ۤ۟۠");
        final EditText editText = null;
        String str6 = null;
        final IOSDialog iOSDialog = null;
        IOSDialog iOSDialog2 = null;
        while (true) {
            switch (m9) {
                case 1746816:
                    iOSDialog.getCancelButton().setOnClickListener(new View.OnClickListener() { // from class: com.xy.xyverify.Verify.Verify$$ExternalSyntheticLambda19
                        /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000a. Please report as an issue. */
                        {
                            String str7;
                            String str8;
                            String str9 = null;
                            int m92 = C0001.m9("ۣ۠ۨ");
                            while (true) {
                                switch (m92) {
                                    case 56507:
                                        m92 = C0003.m44("ۨۨۥ");
                                    case 1747684:
                                        if (C0000.f4 / (C0001.f5 | 1083) != 0) {
                                            C0003.f10 = 53;
                                            str8 = "ۣ۠ۢ";
                                            m92 = C0000.m4(str8);
                                        } else {
                                            m92 = C0001.m9("ۣ۠ۨ");
                                        }
                                    case 1747931:
                                        if (C0003.m42() > 0) {
                                            m92 = C0003.m44("ۨۨۥ");
                                        } else if (C0004.f11 + (C0002.f6 * 7441) <= 0) {
                                            C0004.f11 = 61;
                                            m92 = C0000.m4("ۨۨۥ");
                                        } else {
                                            str7 = "ۨ۠۠";
                                            m92 = C0000.m4(str7);
                                        }
                                    case 1749638:
                                        System.out.println(str9);
                                        if (C0000.f4 <= 0) {
                                            str7 = "ۢۡۥ";
                                            m92 = C0000.m4(str7);
                                        } else {
                                            str8 = "ۨۨۥ";
                                            m92 = C0000.m4(str8);
                                        }
                                    case 1755368:
                                        str9 = C0001.m10("C7S3eDbJ");
                                        str7 = "ۢۡۥ";
                                        m92 = C0000.m4(str7);
                                    case 1755621:
                                        break;
                                }
                                return;
                            }
                        }

                        /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            String str7;
                            int m92 = C0001.m9("ۧۧ۟");
                            while (true) {
                                switch (m92) {
                                    case 1749759:
                                        if (C0000.m7() <= 0) {
                                            str7 = "ۡۨۦ";
                                            m92 = C0004.m49(str7);
                                        } else {
                                            m92 = (C0001.f5 + C0004.f11) ^ (-1754386);
                                        }
                                    case 1751656:
                                        break;
                                    case 1754623:
                                        Verify.lambda$IOSLogin$16(view);
                                        if ((C0003.f10 ^ (C0001.f5 - 6644)) <= 0) {
                                            C0004.m46();
                                            m92 = C0003.m44("ۤۤۨ");
                                        } else {
                                            str7 = "ۤۤۨ";
                                            m92 = C0004.m49(str7);
                                        }
                                }
                                return;
                            }
                        }
                    });
                    if (C0003.f10 - (C0004.f11 / 8384) >= 0) {
                        C0000.f4 = 94;
                        m9 = C0000.m4("ۦۢۢ");
                    } else {
                        str5 = "ۦ۠ۦ";
                        input = editText;
                        m9 = C0000.m4(str5);
                        editText = input;
                    }
                case 1747901:
                    str3 = C0003.m45(f8short, 10, 2, 877);
                    if (C0000.m7() <= 0) {
                        C0000.f4 = 43;
                        m9 = C0000.m4("ۢۤۥ");
                        str6 = str3;
                    } else {
                        str2 = "ۥۦۤ";
                        m9 = C0003.m44(str2);
                        str6 = str3;
                    }
                case 1749602:
                    if (C0002.m15() <= 0) {
                        C0002.m15();
                        str = "۟۟";
                        m9 = C0002.m14(str);
                    } else {
                        m9 = (C0003.f10 - C0004.f11) ^ 1751892;
                    }
                case 1749672:
                    iOSDialog.show();
                    if (C0000.f4 - (C0003.f10 * 4595) <= 0) {
                        C0004.m46();
                        m9 = C0002.m14("ۣ۟ۤ");
                    } else {
                        str5 = "ۦۥۢ";
                        input = editText;
                        m9 = C0000.m4(str5);
                        editText = input;
                    }
                case 1749731:
                    iOSDialog.setCancelable(false);
                    if (C0004.f11 * (C0004.f11 ^ (-4392)) >= 0) {
                        m9 = C0000.m4("ۢۢۨ");
                    } else {
                        str4 = "ۢۢۨ";
                        m9 = C0000.m4(str4);
                    }
                case 1750628:
                    break;
                case 1751493:
                    iOSDialog2 = new IOSDialog(this.context);
                    if (C0004.f11 % (C0000.f4 ^ 5089) >= 0) {
                        C0003.f10 = 88;
                        str3 = str6;
                        str2 = "ۥۦۤ";
                        m9 = C0003.m44(str2);
                        str6 = str3;
                    } else {
                        m9 = (C0001.f5 + C0002.f6) ^ 1747055;
                    }
                case 1752647:
                    editText.setHint(C0002.m13(f8short, 16, 5, 681));
                    m9 = C0003.f10 >= 0 ? C0002.m14("ۦ۠ۦ") : (C0001.f5 / C0003.f10) ^ (-1746823);
                case 1752675:
                    iOSDialog = iOSDialog2.setTitle(str6).setInput().setOkButton(str6).setOtherButton(C0004.m48(f8short, 12, 2, 3135)).setCancelButton(C0002.m13(f8short, 14, 2, 806));
                    if (C0004.f11 >= 0) {
                        str4 = "ۥۥۧ";
                        m9 = C0000.m4(str4);
                    } else {
                        str2 = "ۢۤۥ";
                        str3 = str6;
                        m9 = C0003.m44(str2);
                        str6 = str3;
                    }
                case 1753452:
                    iOSDialog.getOkButton().setOnClickListener(new View.OnClickListener(this, editText, iOSDialog) { // from class: com.xy.xyverify.Verify.Verify$$ExternalSyntheticLambda20
                        public final Verify f$0;
                        public final EditText f$1;
                        public final IOSDialog f$2;

                        /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000a. Please report as an issue. */
                        {
                            String str7;
                            String str8;
                            Integer num = null;
                            int m49 = C0004.m49("۟ۡۡ");
                            while (true) {
                                switch (m49) {
                                    case 1746751:
                                        this.f$0 = this;
                                        if (C0002.m15() <= 0) {
                                            m49 = C0002.m14("ۣۣۧ");
                                        } else {
                                            str8 = "۟ۢۡ";
                                            m49 = C0003.m44(str8);
                                        }
                                    case 1746782:
                                        this.f$1 = editText;
                                        if (C0002.f6 + (C0003.f10 - 6004) >= 0) {
                                        }
                                        m49 = C0000.m4("ۣۡۢ");
                                    case 1748736:
                                        this.f$2 = iOSDialog;
                                        m49 = (C0003.f10 ^ C0000.f4) + 1751468;
                                    case 1748765:
                                        break;
                                    case 1749641:
                                        num = Integer.valueOf(C0004.m47("ON"));
                                        if ((C0001.f5 | (C0000.f4 - 2164)) < 0) {
                                            str8 = "ۦ۟ۨ";
                                            m49 = C0003.m44(str8);
                                        }
                                        str8 = "۟ۢۡ";
                                        m49 = C0003.m44(str8);
                                    case 1750783:
                                        str7 = "ۡۤ۠";
                                        m49 = C0001.m9(str7);
                                    case 1750788:
                                        if (C0001.m8() > 0) {
                                            str7 = "ۡۤ۠";
                                            m49 = C0001.m9(str7);
                                        } else if (C0002.f6 <= 0) {
                                            C0004.f11 = 55;
                                            m49 = C0003.m44("۟ۡۡ");
                                        } else {
                                            m49 = (C0002.f6 ^ C0000.f4) ^ 1749377;
                                        }
                                    case 1753423:
                                        System.out.println(num);
                                        if (C0003.f10 / (C0003.f10 % (-8291)) <= 0) {
                                        }
                                        m49 = C0000.m4("ۡۤ۠");
                                    case 1755343:
                                        if (C0003.f10 >= 0) {
                                            C0002.m15();
                                            str7 = "ۣۦۢ";
                                            m49 = C0001.m9(str7);
                                        } else {
                                            m49 = (C0000.f4 ^ C0000.f4) ^ 1746751;
                                        }
                                }
                                return;
                            }
                        }

                        /* JADX WARN: Code restructure failed: missing block: B:21:0x0040, code lost:
                        
                            return;
                         */
                        @Override // android.view.View.OnClickListener
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void onClick(android.view.View r4) {
                            /*
                                r3 = this;
                                java.lang.String r0 = "۠ۦۨ"
                                int r0 = com.xy.xyverify.Dialog.C0001.m9(r0)
                            L6:
                                switch(r0) {
                                    case 56386: goto La;
                                    case 1747874: goto L1d;
                                    case 1749730: goto L40;
                                    default: goto L9;
                                }
                            L9:
                                goto L6
                            La:
                                int r0 = com.xy.xyverify.Dialog.C0002.m15()
                                if (r0 > 0) goto L1a
                                com.xy.xyverify.Dialog.C0000.m7()
                                java.lang.String r0 = "ۣۧۢ"
                            L15:
                                int r0 = com.xy.xyverify.Dialog.C0001.m9(r0)
                                goto L6
                            L1a:
                                java.lang.String r0 = "۠ۦۨ"
                                goto L15
                            L1d:
                                com.xy.xyverify.Verify.Verify r0 = r3.f$0
                                android.widget.EditText r1 = r3.f$1
                                com.xy.xyverify.Dialog.IOSDialog r2 = r3.f$2
                                r0.m19lambda$IOSLogin$20$comxyxyverifyVerifyVerify(r1, r2, r4)
                                int r0 = com.xy.xyverify.Dialog.C0002.f6
                                int r1 = com.xy.xyverify.Dialog.C0000.f4
                                int r1 = r1 % 7629
                                r0 = r0 ^ r1
                                if (r0 > 0) goto L36
                                java.lang.String r0 = "۠ۦۨ"
                                int r0 = com.xy.xyverify.Verify.C0003.m44(r0)
                                goto L6
                            L36:
                                int r0 = com.xy.xyverify.Verify.C0003.f10
                                int r1 = com.xy.xyverify.Verify.C0004.f11
                                r0 = r0 ^ r1
                                r1 = 1749071(0x1ab04f, float:2.45097E-39)
                                int r0 = r0 + r1
                                goto L6
                            L40:
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.xy.xyverify.Verify.Verify$$ExternalSyntheticLambda20.onClick(android.view.View):void");
                        }
                    });
                    if (C0003.f10 >= 0) {
                        C0004.f11 = 10;
                        m9 = C0004.m49("۠ۧۤ");
                    } else {
                        str = "ۦۢۢ";
                        m9 = C0002.m14(str);
                    }
                case 1753510:
                    iOSDialog.getOtherButton().setOnClickListener(new View.OnClickListener(this, editText) { // from class: com.xy.xyverify.Verify.Verify$$ExternalSyntheticLambda21
                        public final Verify f$0;
                        public final EditText f$1;

                        /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000b. Please report as an issue. */
                        {
                            Long decode;
                            String str7;
                            String str8;
                            Long l2 = null;
                            int m14 = C0002.m14("ۣۨۤ");
                            while (true) {
                                switch (m14) {
                                    case 1749853:
                                        if (C0003.f10 >= 0) {
                                            C0004.f11 = 50;
                                            m14 = C0003.m44("ۢۡۦ");
                                        } else {
                                            m14 = (C0002.f6 * C0002.f6) ^ 1667085;
                                        }
                                    case 1751616:
                                        decode = Long.decode(C0000.m6("7NdQvBP"));
                                        if (C0001.f5 / (C0002.f6 * (-3154)) != 0) {
                                            m14 = C0003.m44("ۨۦۨ");
                                            l2 = decode;
                                        } else {
                                            str7 = "ۤۥ۟";
                                            m14 = C0004.m49(str7);
                                            l2 = decode;
                                        }
                                    case 1751678:
                                        System.out.println(l2);
                                        if (C0001.m8() <= 0) {
                                            str7 = "ۧۦ۟";
                                            decode = l2;
                                            m14 = C0004.m49(str7);
                                            l2 = decode;
                                        } else {
                                            str8 = "ۨۦۨ";
                                            m14 = C0003.m44(str8);
                                        }
                                    case 1752708:
                                    case 1754592:
                                        m14 = C0004.m46() <= 0 ? (C0004.f11 / C0002.f6) + 1751617 : (C0003.f10 * C0004.f11) ^ 1733580;
                                    case 1755406:
                                        this.f$1 = editText;
                                        str8 = C0001.m8() <= 0 ? "ۣۢۨ" : "ۧۦ۟";
                                        m14 = C0003.m44(str8);
                                    case 1755465:
                                        this.f$0 = this;
                                        m14 = (C0002.f6 ^ C0000.f4) ^ 1755654;
                                    case 1755562:
                                        break;
                                }
                                return;
                            }
                        }

                        /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
                        
                            return;
                         */
                        @Override // android.view.View.OnClickListener
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void onClick(android.view.View r3) {
                            /*
                                r2 = this;
                                java.lang.String r0 = "ۦۤ۟"
                                int r0 = com.xy.xyverify.Dialog.C0002.m14(r0)
                            L6:
                                switch(r0) {
                                    case 1748800: goto La;
                                    case 1753569: goto L25;
                                    case 1754564: goto Lb;
                                    default: goto L9;
                                }
                            L9:
                                goto L6
                            La:
                                return
                            Lb:
                                int r0 = com.xy.xyverify.Verify.C0003.f10
                                int r1 = com.xy.xyverify.Dialog.C0001.f5
                                r1 = r1 | 7843(0x1ea3, float:1.099E-41)
                                int r0 = r0 * r1
                                if (r0 < 0) goto L1b
                                java.lang.String r0 = "۟۟۟"
                                int r0 = com.xy.xyverify.Dialog.C0001.m9(r0)
                                goto L6
                            L1b:
                                int r0 = com.xy.xyverify.Verify.C0004.f11
                                int r1 = com.xy.xyverify.Verify.C0003.f10
                                int r0 = r0 / r1
                                r1 = 1753559(0x1ac1d7, float:2.45726E-39)
                                int r0 = r0 + r1
                                goto L6
                            L25:
                                com.xy.xyverify.Verify.Verify r0 = r2.f$0
                                android.widget.EditText r1 = r2.f$1
                                r0.m24lambda$IOSLogin$25$comxyxyverifyVerifyVerify(r1, r3)
                                int r0 = com.xy.xyverify.Dialog.C0001.m8()
                                if (r0 > 0) goto L3c
                                com.xy.xyverify.Dialog.C0002.m15()
                                java.lang.String r0 = "ۧۥۢ"
                                int r0 = com.xy.xyverify.Dialog.C0001.m9(r0)
                                goto L6
                            L3c:
                                int r0 = com.xy.xyverify.Verify.C0003.f10
                                int r1 = com.xy.xyverify.Dialog.C0002.f6
                                int r0 = r0 * r1
                                r1 = 1781404(0x1b2e9c, float:2.496279E-39)
                                int r0 = r0 + r1
                                goto L6
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.xy.xyverify.Verify.Verify$$ExternalSyntheticLambda21.onClick(android.view.View):void");
                        }
                    });
                    m9 = (C0001.f5 / C0004.f11) + 1750628;
                case 1753603:
                    input = iOSDialog.getInput();
                    if (C0004.f11 >= 0) {
                        C0003.f10 = 76;
                        str5 = "ۤ۟۠";
                        m9 = C0000.m4(str5);
                        editText = input;
                    } else {
                        m9 = 1752647 ^ (C0001.f5 / C0002.f6);
                        editText = input;
                    }
            }
            return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0071 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void IOSNotice() {
        /*
            r4 = this;
            r2 = 0
            java.lang.String r0 = "۠ۢ"
            int r0 = com.xy.xyverify.Verify.C0003.m44(r0)
        L8:
            switch(r0) {
                case 56322: goto Lc;
                case 56540: goto L4b;
                case 56541: goto La3;
                case 1746972: goto L86;
                case 1746974: goto L38;
                case 1750661: goto L68;
                case 1751718: goto L23;
                default: goto Lb;
            }
        Lb:
            goto L8
        Lc:
            java.lang.Thread r0 = new java.lang.Thread
            com.xy.xyverify.Verify.Verify$$ExternalSyntheticLambda3 r1 = new com.xy.xyverify.Verify.Verify$$ExternalSyntheticLambda3
            r1.<init>(r4)
            r0.<init>(r1)
            r0.start()
            int r0 = com.xy.xyverify.Verify.C0003.f10
            int r1 = com.xy.xyverify.Verify.C0003.f10
            int r0 = r0 * r1
            r1 = 1751320(0x1ab918, float:2.454122E-39)
            r0 = r0 ^ r1
            goto L8
        L23:
            java.io.PrintStream r0 = java.lang.System.out
            r0.println(r2)
            int r0 = com.xy.xyverify.Verify.C0003.m42()
            if (r0 > 0) goto L31
            com.xy.xyverify.Verify.C0003.m42()
        L31:
            java.lang.String r0 = "ۧۤ"
            int r0 = com.xy.xyverify.Verify.C0004.m49(r0)
            goto L8
        L38:
            int r0 = com.xy.xyverify.Verify.C0004.f11
            int r1 = com.xy.xyverify.Dialog.C0000.f4
            r1 = r1 | 4651(0x122b, float:6.517E-42)
            int r0 = r0 + r1
            if (r0 > 0) goto L48
            java.lang.String r0 = "ۣۡ۠"
        L43:
            int r0 = com.xy.xyverify.Dialog.C0000.m4(r0)
            goto L8
        L48:
            java.lang.String r0 = "۠ۢ"
            goto L43
        L4b:
            java.lang.String r0 = "DTe"
            java.lang.String r0 = com.xy.xyverify.Dialog.C0002.m12(r0)
            long r2 = java.lang.Long.parseLong(r0)
            int r0 = com.xy.xyverify.Dialog.C0001.f5
            int r1 = com.xy.xyverify.Verify.C0004.f11
            int r1 = r1 + (-7443)
            int r0 = r0 + r1
            if (r0 < 0) goto L65
            java.lang.String r0 = "ۤۦۨ"
            int r0 = com.xy.xyverify.Verify.C0004.m49(r0)
            goto L8
        L65:
            java.lang.String r0 = "ۤۦۨ"
            goto L43
        L68:
            int r0 = com.xy.xyverify.Dialog.C0001.f5
            int r1 = com.xy.xyverify.Verify.C0003.f10
            int r1 = r1 / 3880
            int r0 = r0 + r1
            if (r0 > 0) goto L7c
            r0 = 50
            com.xy.xyverify.Dialog.C0002.f6 = r0
            java.lang.String r0 = "ۡ۟ۧ"
        L77:
            int r0 = com.xy.xyverify.Dialog.C0000.m4(r0)
            goto L8
        L7c:
            int r0 = com.xy.xyverify.Verify.C0004.f11
            int r1 = com.xy.xyverify.Verify.C0004.f11
            int r0 = r0 - r1
            r1 = 56541(0xdcdd, float:7.9231E-41)
            int r0 = r0 + r1
            goto L8
        L86:
            int r0 = com.xy.xyverify.Verify.C0004.m46()
            if (r0 > 0) goto L68
            int r0 = com.xy.xyverify.Verify.C0004.f11
            int r1 = com.xy.xyverify.Verify.C0004.f11
            int r1 = r1 % 3367
            int r0 = r0 + r1
            if (r0 < 0) goto La0
            com.xy.xyverify.Dialog.C0002.m15()
            java.lang.String r0 = "ۣۣۥ"
            int r0 = com.xy.xyverify.Verify.C0003.m44(r0)
            goto L8
        La0:
            java.lang.String r0 = "ۣۧ"
            goto L77
        La3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xy.xyverify.Verify.Verify.IOSNotice():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void IOSUpdate() {
        /*
            r2 = this;
            java.lang.String r0 = "ۡۨ۟"
            int r0 = com.xy.xyverify.Verify.C0004.m49(r0)
        L6:
            switch(r0) {
                case 1748888: goto La;
                case 1752639: goto L21;
                case 1753546: goto L34;
                default: goto L9;
            }
        L9:
            goto L6
        La:
            java.lang.Thread r0 = new java.lang.Thread
            com.xy.xyverify.Verify.Verify$$ExternalSyntheticLambda15 r1 = new com.xy.xyverify.Verify.Verify$$ExternalSyntheticLambda15
            r1.<init>(r2)
            r0.<init>(r1)
            r0.start()
            int r0 = com.xy.xyverify.Dialog.C0000.f4
            int r1 = com.xy.xyverify.Dialog.C0001.f5
            int r0 = r0 * r1
            r1 = 1394418(0x1546f2, float:1.953996E-39)
            int r0 = r0 + r1
            goto L6
        L21:
            int r0 = com.xy.xyverify.Dialog.C0000.m7()
            if (r0 > 0) goto L31
            com.xy.xyverify.Verify.C0003.m42()
            java.lang.String r0 = "ۤۥ"
        L2c:
            int r0 = com.xy.xyverify.Dialog.C0002.m14(r0)
            goto L6
        L31:
            java.lang.String r0 = "ۡۨ۟"
            goto L2c
        L34:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xy.xyverify.Verify.Verify.IOSUpdate():void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000f. Please report as an issue. */
    private void MIUILogin() {
        String str;
        MIUIDialog mIUIDialog;
        String str2;
        String str3;
        String str4;
        final SharedPreferences sharedPreferences = null;
        MIUIDialog mIUIDialog2 = null;
        final EditText editText = null;
        String str5 = null;
        final MIUIDialog mIUIDialog3 = null;
        int m14 = C0002.m14("ۣ۠ۤ");
        while (true) {
            switch (m14) {
                case 1746688:
                    if (C0002.f6 * (C0001.f5 / (-2816)) != 0) {
                        str4 = "ۣۧۦ";
                        m14 = C0001.m9(str4);
                    } else {
                        m14 = C0003.m44("ۣ۠ۤ");
                    }
                case 1747777:
                    new Timer().schedule(new TimerTask(this) { // from class: com.xy.xyverify.Verify.Verify.1
                        final Verify this$0;

                        /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000c. Please report as an issue. */
                        /* JADX WARN: Removed duplicated region for block: B:12:0x008c  */
                        /* JADX WARN: Removed duplicated region for block: B:16:0x0097  */
                        {
                            /*
                                r3 = this;
                                r3.this$0 = r4
                                r3.<init>()
                                r0 = 0
                                java.lang.String r1 = "ۢۧۢ"
                                int r1 = com.xy.xyverify.Verify.C0004.m49(r1)
                            Lc:
                                switch(r1) {
                                    case 56295: goto L10;
                                    case 56536: goto L69;
                                    case 1746819: goto L86;
                                    case 1749821: goto L11;
                                    case 1752548: goto L2f;
                                    case 1752584: goto L4e;
                                    default: goto Lf;
                                }
                            Lf:
                                goto Lc
                            L10:
                                return
                            L11:
                                int r1 = com.xy.xyverify.Dialog.C0002.m15()
                                if (r1 > 0) goto L86
                                int r1 = com.xy.xyverify.Verify.C0004.m46()
                                if (r1 > 0) goto L28
                                r1 = 59
                                com.xy.xyverify.Dialog.C0000.f4 = r1
                                java.lang.String r1 = "ۢۧۢ"
                                int r1 = com.xy.xyverify.Dialog.C0000.m4(r1)
                                goto Lc
                            L28:
                                java.lang.String r1 = "ۥۣۦ"
                            L2a:
                                int r1 = com.xy.xyverify.Dialog.C0002.m14(r1)
                                goto Lc
                            L2f:
                                java.io.PrintStream r1 = java.lang.System.out
                                r1.println(r0)
                                int r1 = com.xy.xyverify.Dialog.C0002.f6
                                int r2 = com.xy.xyverify.Verify.C0004.f11
                                int r2 = r2 + (-335)
                                r1 = r1 | r2
                                if (r1 < 0) goto L44
                                r1 = 65
                                com.xy.xyverify.Dialog.C0000.f4 = r1
                            L41:
                                java.lang.String r1 = "ۥۢۡ"
                                goto L2a
                            L44:
                                int r1 = com.xy.xyverify.Verify.C0003.f10
                                int r2 = com.xy.xyverify.Dialog.C0001.f5
                                int r1 = r1 * r2
                                r2 = -42785(0xffffffffffff58df, float:NaN)
                                r1 = r1 ^ r2
                                goto Lc
                            L4e:
                                java.lang.String r0 = "BmHg8VmpuXNg719"
                                java.lang.String r0 = com.xy.xyverify.Dialog.C0002.m12(r0)
                                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                                int r1 = com.xy.xyverify.Dialog.C0000.m7()
                                if (r1 > 0) goto L41
                                r1 = 53
                                com.xy.xyverify.Verify.C0004.f11 = r1
                                java.lang.String r1 = "ۥۣۦ"
                                int r1 = com.xy.xyverify.Dialog.C0001.m9(r1)
                                goto Lc
                            L69:
                                int r1 = com.xy.xyverify.Verify.C0003.f10
                                int r2 = com.xy.xyverify.Dialog.C0002.f6
                                r2 = r2 | 658(0x292, float:9.22E-43)
                                int r1 = r1 + r2
                                if (r1 > 0) goto L7c
                                com.xy.xyverify.Verify.C0003.m42()
                                java.lang.String r1 = "ۥۧ۠"
                                int r1 = com.xy.xyverify.Dialog.C0002.m14(r1)
                                goto Lc
                            L7c:
                                int r1 = com.xy.xyverify.Dialog.C0001.f5
                                int r2 = com.xy.xyverify.Verify.C0003.f10
                                int r1 = r1 - r2
                                r2 = 1749275(0x1ab11b, float:2.451256E-39)
                                r1 = r1 ^ r2
                                goto Lc
                            L86:
                                int r1 = com.xy.xyverify.Verify.C0003.m42()
                                if (r1 > 0) goto L97
                                com.xy.xyverify.Verify.C0004.m46()
                                java.lang.String r1 = "ۨۤۦ"
                            L91:
                                int r1 = com.xy.xyverify.Dialog.C0001.m9(r1)
                                goto Lc
                            L97:
                                java.lang.String r1 = "۟ۦ"
                                goto L91
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.xy.xyverify.Verify.Verify.AnonymousClass1.<init>(com.xy.xyverify.Verify.Verify):void");
                        }

                        /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
                        @Override // java.util.TimerTask, java.lang.Runnable
                        public void run() {
                            int m142 = C0002.m14("ۥۣ۟");
                            while (true) {
                                switch (m142) {
                                    case 56350:
                                        System.exit(0);
                                        m142 = C0002.f6 <= 0 ? C0002.m14("ۡ۟") : (C0004.f11 ^ C0003.f10) + 1753043;
                                    case 56542:
                                        if (C0000.f4 + (C0002.f6 - 7953) >= 0) {
                                            C0002.m15();
                                            m142 = C0003.m44("ۦۦۦ");
                                        } else {
                                            m142 = C0002.m14("ۥۣ۟");
                                        }
                                    case 1748641:
                                        m142 = (C0000.f4 - C0004.f11) + 1752237;
                                    case 1752457:
                                        if (!this.this$0.TureCard) {
                                            m142 = (C0000.f4 - C0004.f11) + 1752237;
                                        } else if (C0000.f4 <= 0) {
                                            C0002.m15();
                                            m142 = C0000.m4("ۥۣ۟");
                                        } else {
                                            m142 = (C0001.f5 * C0002.f6) ^ 227814;
                                        }
                                    case 1753702:
                                        break;
                                }
                                return;
                            }
                        }
                    }, 300000L);
                    if ((C0001.f5 | (C0001.f5 + 8816)) <= 0) {
                        C0000.m7();
                        str = "ۦۢ۠";
                        mIUIDialog = mIUIDialog2;
                        mIUIDialog2 = mIUIDialog;
                        m14 = C0004.m49(str);
                    } else {
                        m14 = (C0003.f10 / C0003.f10) + 1754655;
                    }
                case 1748702:
                    mIUIDialog = new MIUIDialog(this.context);
                    if (C0002.f6 - (C0001.f5 % (-6142)) <= 0) {
                        mIUIDialog2 = mIUIDialog;
                        m14 = C0000.m4("ۨ۟ۦ");
                    } else {
                        str = "ۦۡۦ";
                        mIUIDialog2 = mIUIDialog;
                        m14 = C0004.m49(str);
                    }
                case 1748860:
                    editText.setHint(C0004.m48(f8short, 29, 5, 936));
                    if (C0003.m42() <= 0) {
                        C0000.m7();
                        str3 = "ۣ۠ۤ";
                    } else {
                        str3 = "ۢۨۧ";
                    }
                    m14 = C0000.m4(str3);
                case 1749857:
                    mIUIDialog3.getCancelButton().setOnClickListener(new View.OnClickListener(this, editText) { // from class: com.xy.xyverify.Verify.Verify$$ExternalSyntheticLambda24
                        public final Verify f$0;
                        public final EditText f$1;

                        /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000a. Please report as an issue. */
                        /* JADX WARN: Removed duplicated region for block: B:10:0x0017 A[SYNTHETIC] */
                        /* JADX WARN: Removed duplicated region for block: B:6:0x0031 A[SYNTHETIC] */
                        {
                            /*
                                r3 = this;
                                r3.<init>()
                                r0 = 0
                                java.lang.String r1 = "ۦ۟۠"
                                int r1 = com.xy.xyverify.Dialog.C0002.m14(r1)
                            La:
                                switch(r1) {
                                    case 1750624: goto Le;
                                    case 1751620: goto L70;
                                    case 1751711: goto Lab;
                                    case 1752462: goto L5c;
                                    case 1752522: goto L21;
                                    case 1753415: goto L45;
                                    case 1753540: goto L90;
                                    case 1754565: goto L3b;
                                    default: goto Ld;
                                }
                            Ld:
                                goto La
                            Le:
                                int r1 = com.xy.xyverify.Verify.C0003.f10
                                int r2 = com.xy.xyverify.Dialog.C0002.f6
                                r2 = r2 | (-3151(0xfffffffffffff3b1, float:NaN))
                                int r1 = r1 + r2
                                if (r1 < 0) goto L31
                                com.xy.xyverify.Dialog.C0001.m8()
                                java.lang.String r1 = "ۣۢۤ"
                                int r1 = com.xy.xyverify.Dialog.C0002.m14(r1)
                                goto La
                            L21:
                                java.io.PrintStream r1 = java.lang.System.out
                                r1.println(r0)
                                int r1 = com.xy.xyverify.Dialog.C0000.f4
                                if (r1 > 0) goto L7e
                                java.lang.String r1 = "ۣۣۤ"
                                int r1 = com.xy.xyverify.Dialog.C0002.m14(r1)
                                goto La
                            L31:
                                int r1 = com.xy.xyverify.Verify.C0003.f10
                                int r2 = com.xy.xyverify.Dialog.C0001.f5
                                int r1 = r1 * r2
                                r2 = 1783655(0x1b3767, float:2.499433E-39)
                                int r1 = r1 + r2
                                goto La
                            L3b:
                                int r1 = com.xy.xyverify.Dialog.C0002.f6
                                int r2 = com.xy.xyverify.Verify.C0004.f11
                                int r1 = r1 - r2
                                r2 = 1754502(0x1ac586, float:2.458581E-39)
                                r1 = r1 ^ r2
                                goto La
                            L45:
                                r3.f$0 = r4
                                int r1 = com.xy.xyverify.Dialog.C0001.f5
                                if (r1 > 0) goto L52
                            L4b:
                                java.lang.String r1 = "ۥۡۦ"
                                int r1 = com.xy.xyverify.Dialog.C0000.m4(r1)
                                goto La
                            L52:
                                int r1 = com.xy.xyverify.Dialog.C0001.f5
                                int r2 = com.xy.xyverify.Dialog.C0000.f4
                                r1 = r1 ^ r2
                                r2 = 1750850(0x1ab742, float:2.453463E-39)
                                int r1 = r1 + r2
                                goto La
                            L5c:
                                int r1 = com.xy.xyverify.Verify.C0003.m42()
                                if (r1 > 0) goto Le
                                int r1 = com.xy.xyverify.Dialog.C0002.f6
                                if (r1 > 0) goto L69
                                com.xy.xyverify.Verify.C0003.m42()
                            L69:
                                java.lang.String r1 = "ۦۣۡ"
                                int r1 = com.xy.xyverify.Dialog.C0002.m14(r1)
                                goto La
                            L70:
                                r3.f$1 = r5
                                int r1 = com.xy.xyverify.Verify.C0004.f11
                                int r2 = com.xy.xyverify.Verify.C0003.f10
                                r2 = r2 ^ (-5594(0xffffffffffffea26, float:NaN))
                                int r1 = r1 / r2
                                if (r1 == 0) goto L85
                                com.xy.xyverify.Dialog.C0000.m7()
                            L7e:
                                java.lang.String r1 = "ۤۦۡ"
                                int r1 = com.xy.xyverify.Dialog.C0000.m4(r1)
                                goto La
                            L85:
                                int r1 = com.xy.xyverify.Dialog.C0000.f4
                                int r2 = com.xy.xyverify.Dialog.C0002.f6
                                r1 = r1 ^ r2
                                r2 = 1751686(0x1aba86, float:2.454635E-39)
                                int r1 = r1 + r2
                                goto La
                            L90:
                                java.lang.String r0 = "Qp4ou8FkOdy1q"
                                java.lang.String r0 = com.xy.xyverify.Dialog.C0001.m10(r0)
                                java.lang.Long r0 = java.lang.Long.valueOf(r0)
                                int r1 = com.xy.xyverify.Dialog.C0000.f4
                                int r2 = com.xy.xyverify.Verify.C0004.f11
                                int r2 = r2 * (-5656)
                                int r1 = r1 + r2
                                if (r1 > 0) goto L4b
                                java.lang.String r1 = "ۣۢ۟"
                                int r1 = com.xy.xyverify.Verify.C0004.m49(r1)
                                goto La
                            Lab:
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.xy.xyverify.Verify.Verify$$ExternalSyntheticLambda24.<init>(com.xy.xyverify.Verify.Verify, android.widget.EditText):void");
                        }

                        /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
                        /* JADX WARN: Removed duplicated region for block: B:29:0x007d A[SYNTHETIC] */
                        /* JADX WARN: Removed duplicated region for block: B:32:0x0075 A[SYNTHETIC] */
                        @Override // android.view.View.OnClickListener
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void onClick(android.view.View r4) {
                            /*
                                r3 = this;
                                r0 = 0
                                java.lang.String r1 = "ۧۡۢ"
                                int r2 = com.xy.xyverify.Dialog.C0002.m14(r1)
                                r1 = r0
                            L8:
                                switch(r2) {
                                    case 1746820: goto Lc;
                                    case 1747779: goto L46;
                                    case 1748672: goto L9e;
                                    case 1749702: goto L6f;
                                    case 1751586: goto L24;
                                    case 1753449: goto L4f;
                                    case 1754440: goto L94;
                                    default: goto Lb;
                                }
                            Lb:
                                goto L8
                            Lc:
                                java.lang.String r0 = "xst"
                                java.lang.String r0 = com.xy.xyverify.Dialog.C0002.m12(r0)
                                int r0 = java.lang.Integer.parseInt(r0)
                                int r1 = com.xy.xyverify.Dialog.C0002.m15()
                                if (r1 > 0) goto L88
                                java.lang.String r1 = "ۦۣ۠"
                                int r2 = com.xy.xyverify.Verify.C0004.m49(r1)
                                r1 = r0
                                goto L8
                            L24:
                                java.io.PrintStream r0 = java.lang.System.out
                                r0.println(r1)
                                int r0 = com.xy.xyverify.Verify.C0003.m42()
                                if (r0 > 0) goto L3b
                                r0 = 25
                                com.xy.xyverify.Verify.C0004.f11 = r0
                                java.lang.String r0 = "ۣ۠ۦ"
                            L35:
                                int r0 = com.xy.xyverify.Dialog.C0001.m9(r0)
                                r2 = r0
                                goto L8
                            L3b:
                                int r0 = com.xy.xyverify.Verify.C0003.f10
                                int r2 = com.xy.xyverify.Verify.C0003.f10
                                r0 = r0 | r2
                                r2 = -1748610(0xffffffffffe5517e, float:NaN)
                                r0 = r0 ^ r2
                                r2 = r0
                                goto L8
                            L46:
                                int r0 = com.xy.xyverify.Dialog.C0000.m7()
                                if (r0 > 0) goto L6f
                                java.lang.String r0 = "ۣ۟ۨ"
                                goto L35
                            L4f:
                                int r0 = com.xy.xyverify.Verify.C0003.f10
                                int r2 = com.xy.xyverify.Verify.C0004.f11
                                r2 = r2 ^ 2388(0x954, float:3.346E-42)
                                r0 = r0 | r2
                                if (r0 < 0) goto L64
                                r0 = 73
                                com.xy.xyverify.Dialog.C0001.f5 = r0
                                java.lang.String r0 = "ۢۧۦ"
                            L5e:
                                int r0 = com.xy.xyverify.Verify.C0004.m49(r0)
                                r2 = r0
                                goto L8
                            L64:
                                int r0 = com.xy.xyverify.Dialog.C0002.f6
                                int r2 = com.xy.xyverify.Dialog.C0002.f6
                                int r0 = r0 + r2
                                r2 = 1754772(0x1ac694, float:2.45896E-39)
                                r0 = r0 ^ r2
                                r2 = r0
                                goto L8
                            L6f:
                                int r0 = com.xy.xyverify.Dialog.C0001.m8()
                                if (r0 > 0) goto L7d
                                java.lang.String r0 = "ۤۦ۟"
                                int r0 = com.xy.xyverify.Dialog.C0001.m9(r0)
                                r2 = r0
                                goto L8
                            L7d:
                                int r0 = com.xy.xyverify.Dialog.C0000.f4
                                int r2 = com.xy.xyverify.Dialog.C0002.f6
                                r0 = r0 | r2
                                r2 = 1747666(0x1aaad2, float:2.449002E-39)
                                int r0 = r0 + r2
                                r2 = r0
                                goto L8
                            L88:
                                int r1 = com.xy.xyverify.Dialog.C0002.f6
                                int r2 = com.xy.xyverify.Dialog.C0001.f5
                                r1 = r1 | r2
                                r2 = 1751092(0x1ab834, float:2.453803E-39)
                                int r2 = r2 + r1
                                r1 = r0
                                goto L8
                            L94:
                                com.xy.xyverify.Verify.Verify r0 = r3.f$0
                                android.widget.EditText r2 = r3.f$1
                                r0.m32lambda$MIUILogin$7$comxyxyverifyVerifyVerify(r2, r4)
                                java.lang.String r0 = "ۣ۠ۦ"
                                goto L5e
                            L9e:
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.xy.xyverify.Verify.Verify$$ExternalSyntheticLambda24.onClick(android.view.View):void");
                        }
                    });
                    if (C0003.f10 * C0000.f4 * 5928 >= 0) {
                        C0003.f10 = 53;
                        m14 = C0004.m49("ۧۨۡ");
                    } else {
                        m14 = (C0004.f11 / C0003.f10) ^ 1752452;
                    }
                case 1751773:
                    mIUIDialog3.setCancelable(false);
                    mIUIDialog = mIUIDialog2;
                    mIUIDialog2 = mIUIDialog;
                    m14 = C0000.m4("ۨ۟ۦ");
                case 1752462:
                    mIUIDialog3.getOkButton().setOnClickListener(new View.OnClickListener(this, editText, sharedPreferences, mIUIDialog3) { // from class: com.xy.xyverify.Verify.Verify$$ExternalSyntheticLambda25
                        public final Verify f$0;
                        public final EditText f$1;
                        public final SharedPreferences f$2;
                        public final MIUIDialog f$3;

                        /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000c. Please report as an issue. */
                        /* JADX WARN: Removed duplicated region for block: B:20:0x0075 A[SYNTHETIC] */
                        /* JADX WARN: Removed duplicated region for block: B:24:0x006d A[SYNTHETIC] */
                        {
                            /*
                                Method dump skipped, instructions count: 252
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.xy.xyverify.Verify.Verify$$ExternalSyntheticLambda25.<init>(com.xy.xyverify.Verify.Verify, android.widget.EditText, android.content.SharedPreferences, com.xy.xyverify.Dialog.MIUIDialog):void");
                        }

                        /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            String str6;
                            int m44 = C0003.m44("ۢ۠");
                            Long l2 = null;
                            while (true) {
                                switch (m44) {
                                    case 56382:
                                        this.f$0.m30lambda$MIUILogin$10$comxyxyverifyVerifyVerify(this.f$1, this.f$2, this.f$3, view);
                                        m44 = (C0004.f11 - C0004.f11) ^ 1752641;
                                    case 1746913:
                                        str6 = C0002.f6 + (C0003.f10 + (-7315)) >= 0 ? "ۧ۠ۨ" : "ۢ۠";
                                        m44 = C0000.m4(str6);
                                    case 1751528:
                                        m44 = (C0003.f10 ^ C0002.f6) ^ (-1755332);
                                    case 1751590:
                                        System.out.println(l2);
                                        m44 = C0001.m9("ۨۤۨ");
                                    case 1752547:
                                        Long decode = Long.decode(C0002.m12("RCMaSsL2lnisXpnaHa"));
                                        if (C0004.m46() <= 0) {
                                            C0001.m8();
                                            m44 = C0004.m49("ۢ۠");
                                            l2 = decode;
                                        } else {
                                            m44 = 1752398 + (C0003.f10 - C0000.f4);
                                            l2 = decode;
                                        }
                                    case 1752641:
                                        if (C0000.m7() <= 0) {
                                            str6 = "ۥۢ۠";
                                            m44 = C0000.m4(str6);
                                        } else {
                                            m44 = (C0003.f10 ^ C0002.f6) ^ (-1755332);
                                        }
                                    case 1755500:
                                        break;
                                }
                                return;
                            }
                        }
                    });
                    if (C0003.f10 % (C0001.f5 - 7601) >= 0) {
                        m14 = C0002.m14("ۧۤۧ");
                    } else {
                        str4 = "ۧۢۢ";
                        m14 = C0001.m9(str4);
                    }
                case 1753483:
                    str5 = C0000.m5(f8short, 25, 2, 2023);
                    if ((C0001.f5 | C0003.f10 | 6640) >= 0) {
                        C0001.f5 = 56;
                        str2 = "ۧۢۢ";
                        m14 = C0002.m14(str2);
                    } else {
                        m14 = (C0003.f10 ^ C0004.f11) + 1752849;
                    }
                case 1753508:
                    MIUIDialog cancelButton = mIUIDialog2.setTitle(str5).setInput().setOkButton(str5).setCancelButton(C0003.m45(f8short, 27, 2, 2300));
                    if ((C0001.f5 | (C0003.f10 / (-5800))) <= 0) {
                        C0002.f6 = 79;
                        mIUIDialog3 = cancelButton;
                        m14 = C0001.m9("۟۟۠");
                    } else {
                        mIUIDialog3 = cancelButton;
                        m14 = (C0003.f10 + C0001.f5) ^ 1751935;
                    }
                case 1754471:
                    break;
                case 1754538:
                    editText = mIUIDialog3.getInputEdit();
                    m14 = C0001.m9(C0003.m42() <= 0 ? "ۡۢ۟" : "ۡۧۢ");
                case 1754656:
                    sharedPreferences = this.context.getSharedPreferences(C0002.m13(f8short, 21, 4, 2975), 0);
                    if (C0003.f10 + (C0001.f5 / (-2939)) >= 0) {
                        C0000.f4 = 89;
                        m14 = C0000.m4("ۡۧۢ");
                    } else {
                        str2 = "ۡۢ۟";
                        m14 = C0002.m14(str2);
                    }
                case 1755343:
                    mIUIDialog3.show();
                    m14 = C0004.f11 * (C0000.f4 + (-8984)) <= 0 ? C0001.m9("ۢۨۧ") : (C0003.f10 - C0001.f5) + 1755088;
            }
            return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0157 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x014e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void MIUINotice() {
        /*
            Method dump skipped, instructions count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xy.xyverify.Verify.Verify.MIUINotice():void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0037 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void MIUIUpdate() {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xy.xyverify.Verify.Verify.MIUIUpdate():void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0019 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x009a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void MakeInternetDialog(android.content.Context r3) {
        /*
            com.xy.xyverify.Verify.Verify r0 = new com.xy.xyverify.Verify.Verify
            r0.<init>(r3)
            r0 = 0
            java.lang.String r1 = "۟ۥۤ"
            int r1 = com.xy.xyverify.Dialog.C0001.m9(r1)
        Lc:
            switch(r1) {
                case 56452: goto L10;
                case 56510: goto L24;
                case 1746878: goto L7b;
                case 1749575: goto L5f;
                case 1749602: goto L44;
                case 1754414: goto La2;
                default: goto Lf;
            }
        Lf:
            goto Lc
        L10:
            int r1 = com.xy.xyverify.Dialog.C0001.f5
            int r2 = com.xy.xyverify.Verify.C0004.f11
            int r2 = r2 + 7010
            r1 = r1 | r2
            if (r1 > 0) goto L9a
            r1 = 59
            com.xy.xyverify.Verify.C0004.f11 = r1
            java.lang.String r1 = "ۥۣ۠"
            int r1 = com.xy.xyverify.Dialog.C0002.m14(r1)
            goto Lc
        L24:
            java.lang.String r0 = "sNya0YS4j4t5ejCcifL"
            java.lang.String r0 = com.xy.xyverify.Verify.C0004.m47(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r1 = com.xy.xyverify.Dialog.C0000.f4
            if (r1 > 0) goto L3d
            r1 = 55
            com.xy.xyverify.Verify.C0004.f11 = r1
            java.lang.String r1 = "۟ۥۤ"
            int r1 = com.xy.xyverify.Dialog.C0000.m4(r1)
            goto Lc
        L3d:
            java.lang.String r1 = "ۢ۟ۤ"
            int r1 = com.xy.xyverify.Dialog.C0000.m4(r1)
            goto Lc
        L44:
            int r1 = com.xy.xyverify.Dialog.C0000.m7()
            if (r1 > 0) goto L55
            r1 = 93
            com.xy.xyverify.Verify.C0003.f10 = r1
            java.lang.String r1 = "ۧ۟۟"
            int r1 = com.xy.xyverify.Dialog.C0002.m14(r1)
            goto Lc
        L55:
            int r1 = com.xy.xyverify.Dialog.C0001.f5
            int r2 = com.xy.xyverify.Dialog.C0001.f5
            int r1 = r1 % r2
            r2 = 1746878(0x1aa7be, float:2.447897E-39)
            int r1 = r1 + r2
            goto Lc
        L5f:
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
            int r1 = com.xy.xyverify.Verify.C0004.m46()
            if (r1 > 0) goto L74
            com.xy.xyverify.Dialog.C0002.m15()
            java.lang.String r1 = "ۤۨ"
            int r1 = com.xy.xyverify.Dialog.C0002.m14(r1)
            goto Lc
        L74:
            java.lang.String r1 = "ۧ۠ۧ"
            int r1 = com.xy.xyverify.Verify.C0003.m44(r1)
            goto Lc
        L7b:
            int r1 = com.xy.xyverify.Verify.C0004.m46()
            if (r1 > 0) goto L10
            int r1 = com.xy.xyverify.Dialog.C0002.m15()
            if (r1 > 0) goto L8f
            java.lang.String r1 = "ۢ۠۠"
            int r1 = com.xy.xyverify.Dialog.C0001.m9(r1)
            goto Lc
        L8f:
            int r1 = com.xy.xyverify.Dialog.C0000.f4
            int r2 = com.xy.xyverify.Dialog.C0002.f6
            int r1 = r1 + r2
            r2 = 55274(0xd7ea, float:7.7455E-41)
            int r1 = r1 + r2
            goto Lc
        L9a:
            java.lang.String r1 = "ۧ۠ۧ"
            int r1 = com.xy.xyverify.Verify.C0003.m44(r1)
            goto Lc
        La2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xy.xyverify.Verify.Verify.MakeInternetDialog(android.content.Context):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0024 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ void access$100(com.xy.xyverify.Verify.Verify r3) {
        /*
            r0 = 0
            java.lang.String r1 = "ۦۥۡ"
            int r2 = com.xy.xyverify.Verify.C0003.m44(r1)
            r1 = r0
        L8:
            switch(r2) {
                case 56384: goto Lc;
                case 1746847: goto Lb4;
                case 1748615: goto L58;
                case 1749855: goto L7f;
                case 1753602: goto L97;
                case 1754379: goto L20;
                case 1754626: goto L37;
                default: goto Lb;
            }
        Lb:
            goto L8
        Lc:
            int r0 = com.xy.xyverify.Dialog.C0000.m7()
            if (r0 > 0) goto L20
            int r0 = com.xy.xyverify.Dialog.C0000.m7()
            if (r0 > 0) goto L74
            java.lang.String r0 = "ۢۢ"
            int r0 = com.xy.xyverify.Dialog.C0000.m4(r0)
            r2 = r0
            goto L8
        L20:
            int r0 = com.xy.xyverify.Dialog.C0001.f5
            if (r0 > 0) goto L2c
            java.lang.String r0 = "ۥۦۨ"
        L26:
            int r0 = com.xy.xyverify.Verify.C0004.m49(r0)
            r2 = r0
            goto L8
        L2c:
            int r0 = com.xy.xyverify.Dialog.C0002.f6
            int r2 = com.xy.xyverify.Verify.C0003.f10
            int r0 = r0 * r2
            r2 = 1779451(0x1b26fb, float:2.493542E-39)
            int r0 = r0 + r2
            r2 = r0
            goto L8
        L37:
            java.io.PrintStream r0 = java.lang.System.out
            r0.println(r1)
            int r0 = com.xy.xyverify.Dialog.C0001.m8()
            if (r0 > 0) goto L4d
            com.xy.xyverify.Verify.C0003.m42()
            java.lang.String r0 = "ۦۥۡ"
            int r0 = com.xy.xyverify.Dialog.C0002.m14(r0)
            r2 = r0
            goto L8
        L4d:
            int r0 = com.xy.xyverify.Dialog.C0002.f6
            int r2 = com.xy.xyverify.Verify.C0003.f10
            int r0 = r0 / r2
            r2 = 1746854(0x1aa7a6, float:2.447864E-39)
            int r0 = r0 + r2
            r2 = r0
            goto L8
        L58:
            int r0 = com.xy.xyverify.Verify.C0003.m42()
            if (r0 > 0) goto L69
            com.xy.xyverify.Dialog.C0000.m7()
            java.lang.String r0 = "ۨۦ۟"
            int r0 = com.xy.xyverify.Dialog.C0002.m14(r0)
            r2 = r0
            goto L8
        L69:
            int r0 = com.xy.xyverify.Dialog.C0000.f4
            int r2 = com.xy.xyverify.Verify.C0003.f10
            int r0 = r0 / r2
            r2 = 1753613(0x1ac20d, float:2.457335E-39)
            int r0 = r0 + r2
            r2 = r0
            goto L8
        L74:
            int r0 = com.xy.xyverify.Dialog.C0002.f6
            int r2 = com.xy.xyverify.Dialog.C0002.f6
            int r0 = r0 + r2
            r2 = 1748867(0x1aaf83, float:2.450685E-39)
            int r0 = r0 + r2
            r2 = r0
            goto L8
        L7f:
            java.lang.String r0 = "eEFCOchJ4JDR"
            java.lang.String r0 = com.xy.xyverify.Verify.C0003.m43(r0)
            int r1 = com.xy.xyverify.Dialog.C0002.f6
            int r2 = com.xy.xyverify.Dialog.C0002.f6
            int r2 = r2 + 305
            int r1 = r1 - r2
            if (r1 < 0) goto L8e
        L8e:
            java.lang.String r1 = "ۧۧۢ"
            int r2 = com.xy.xyverify.Dialog.C0000.m4(r1)
            r1 = r0
            goto L8
        L97:
            r3.MIUILogin()
            int r0 = com.xy.xyverify.Dialog.C0000.f4
            int r2 = com.xy.xyverify.Verify.C0003.f10
            int r2 = r2 + (-3692)
            r0 = r0 ^ r2
            if (r0 < 0) goto Lb0
            r0 = 22
            com.xy.xyverify.Verify.C0004.f11 = r0
            java.lang.String r0 = "ۣۧ۟"
            int r0 = com.xy.xyverify.Dialog.C0002.m14(r0)
            r2 = r0
            goto L8
        Lb0:
            java.lang.String r0 = "ۢۢ"
            goto L26
        Lb4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xy.xyverify.Verify.Verify.access$100(com.xy.xyverify.Verify.Verify):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ void access$200(com.xy.xyverify.Verify.Verify r2) {
        /*
            java.lang.String r0 = "ۨۦۣ"
            int r0 = com.xy.xyverify.Dialog.C0002.m14(r0)
        L6:
            switch(r0) {
                case 1747806: goto La;
                case 1752736: goto L23;
                case 1755557: goto Lb;
                default: goto L9;
            }
        L9:
            goto L6
        La:
            return
        Lb:
            r2.MIUINotice()
            int r0 = com.xy.xyverify.Dialog.C0000.f4
            if (r0 > 0) goto L19
            java.lang.String r0 = "ۨۦۣ"
            int r0 = com.xy.xyverify.Verify.C0003.m44(r0)
            goto L6
        L19:
            int r0 = com.xy.xyverify.Verify.C0004.f11
            int r1 = com.xy.xyverify.Dialog.C0000.f4
            r0 = r0 | r1
            r1 = -1747791(0xffffffffffe554b1, float:NaN)
            r0 = r0 ^ r1
            goto L6
        L23:
            int r0 = com.xy.xyverify.Verify.C0003.f10
            if (r0 < 0) goto L2e
            java.lang.String r0 = "ۣۨۧ"
            int r0 = com.xy.xyverify.Verify.C0003.m44(r0)
            goto L6
        L2e:
            int r0 = com.xy.xyverify.Verify.C0003.f10
            int r1 = com.xy.xyverify.Dialog.C0002.f6
            int r0 = r0 + r1
            r1 = 1755129(0x1ac7f9, float:2.45946E-39)
            int r0 = r0 + r1
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xy.xyverify.Verify.Verify.access$200(com.xy.xyverify.Verify.Verify):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0007. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0055 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void lambda$IOSLogin$16(android.view.View r3) {
        /*
            r0 = 0
            java.lang.String r1 = "ۨۦۦ"
            int r1 = com.xy.xyverify.Dialog.C0002.m14(r1)
        L7:
            switch(r1) {
                case 1749574: goto Lb;
                case 1749579: goto Lb1;
                case 1749671: goto L5f;
                case 1752734: goto L99;
                case 1754507: goto L79;
                case 1755558: goto L41;
                case 1755560: goto L25;
                default: goto La;
            }
        La:
            goto L7
        Lb:
            int r1 = com.xy.xyverify.Dialog.C0001.m8()
            if (r1 > 0) goto L41
            int r1 = com.xy.xyverify.Dialog.C0001.f5
            int r2 = com.xy.xyverify.Verify.C0003.f10
            int r2 = r2 + 6266
            int r1 = r1 - r2
            if (r1 < 0) goto La6
            r1 = 42
            com.xy.xyverify.Verify.C0003.f10 = r1
            java.lang.String r1 = "ۣۧۧ"
            int r1 = com.xy.xyverify.Verify.C0004.m49(r1)
            goto L7
        L25:
            r1 = 0
            java.lang.System.exit(r1)
            int r1 = com.xy.xyverify.Dialog.C0001.m8()
            if (r1 > 0) goto L3a
            r1 = 75
            com.xy.xyverify.Verify.C0004.f11 = r1
            java.lang.String r1 = "ۨۦۦ"
            int r1 = com.xy.xyverify.Verify.C0004.m49(r1)
            goto L7
        L3a:
            java.lang.String r1 = "ۣۢ۟"
            int r1 = com.xy.xyverify.Verify.C0004.m49(r1)
            goto L7
        L41:
            int r1 = com.xy.xyverify.Dialog.C0001.f5
            int r2 = com.xy.xyverify.Verify.C0004.f11
            int r2 = r2 / 557
            int r1 = r1 * r2
            if (r1 < 0) goto L55
            r1 = 82
            com.xy.xyverify.Dialog.C0002.f6 = r1
            java.lang.String r1 = "ۣۧۥ"
        L50:
            int r1 = com.xy.xyverify.Verify.C0003.m44(r1)
            goto L7
        L55:
            int r1 = com.xy.xyverify.Dialog.C0000.f4
            int r2 = com.xy.xyverify.Dialog.C0002.f6
            int r1 = r1 + r2
            r2 = 1748343(0x1aad77, float:2.44995E-39)
            int r1 = r1 + r2
            goto L7
        L5f:
            int r1 = com.xy.xyverify.Dialog.C0001.f5
            int r2 = com.xy.xyverify.Dialog.C0002.f6
            r2 = r2 | (-2542(0xfffffffffffff612, float:NaN))
            int r1 = r1 % r2
            if (r1 > 0) goto L72
            com.xy.xyverify.Dialog.C0000.m7()
            java.lang.String r1 = "۠ۢۢ"
            int r1 = com.xy.xyverify.Verify.C0003.m44(r1)
            goto L7
        L72:
            java.lang.String r1 = "ۨۦۦ"
            int r1 = com.xy.xyverify.Verify.C0004.m49(r1)
            goto L7
        L79:
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
            int r1 = com.xy.xyverify.Dialog.C0002.f6
            if (r1 > 0) goto L8e
            r1 = 84
            com.xy.xyverify.Verify.C0003.f10 = r1
            java.lang.String r1 = "ۢۢۧ"
            int r1 = com.xy.xyverify.Dialog.C0002.m14(r1)
            goto L7
        L8e:
            int r1 = com.xy.xyverify.Verify.C0004.f11
            int r2 = com.xy.xyverify.Dialog.C0001.f5
            int r1 = r1 % r2
            r2 = 1749818(0x1ab33a, float:2.452017E-39)
            int r1 = r1 + r2
            goto L7
        L99:
            java.lang.String r0 = "E3"
            java.lang.String r0 = com.xy.xyverify.Dialog.C0002.m12(r0)
            java.lang.Long r0 = java.lang.Long.decode(r0)
            java.lang.String r1 = "ۣۧۧ"
            goto L50
        La6:
            int r1 = com.xy.xyverify.Dialog.C0000.f4
            int r2 = com.xy.xyverify.Dialog.C0001.f5
            int r1 = r1 / r2
            r2 = 1752735(0x1abe9f, float:2.456105E-39)
            r1 = r1 ^ r2
            goto L7
        Lb1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xy.xyverify.Verify.Verify.lambda$IOSLogin$16(android.view.View):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0009. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void lambda$MIUIUpdate$5(com.xy.xyverify.Dialog.MIUIDialog r5, android.view.View r6) {
        /*
            r0 = 0
            java.lang.String r2 = "ۣۢ۠"
            int r4 = com.xy.xyverify.Verify.C0004.m49(r2)
            r2 = r0
        L9:
            switch(r4) {
                case 1747933: goto Ld;
                case 1749640: goto La6;
                case 1750625: goto L35;
                case 1751590: goto L9a;
                case 1752679: goto L27;
                case 1752703: goto L82;
                case 1755524: goto L57;
                default: goto Lc;
            }
        Lc:
            goto L9
        Ld:
            java.io.PrintStream r0 = java.lang.System.out
            r0.println(r2)
            int r0 = com.xy.xyverify.Dialog.C0001.f5
            int r1 = com.xy.xyverify.Dialog.C0002.f6
            int r1 = r1 / 6761
            int r0 = r0 - r1
            if (r0 > 0) goto L1f
            r0 = 97
            com.xy.xyverify.Dialog.C0002.f6 = r0
        L1f:
            java.lang.String r0 = "ۢۡۧ"
            int r0 = com.xy.xyverify.Verify.C0003.m44(r0)
            r4 = r0
            goto L9
        L27:
            int r0 = com.xy.xyverify.Verify.C0004.m46()
            if (r0 > 0) goto L82
            java.lang.String r0 = "ۨۥۡ"
        L2f:
            int r0 = com.xy.xyverify.Dialog.C0002.m14(r0)
            r4 = r0
            goto L9
        L35:
            r5.cancel()
            int r0 = com.xy.xyverify.Dialog.C0000.f4
            int r1 = com.xy.xyverify.Verify.C0004.f11
            int r1 = r1 + (-1832)
            int r0 = r0 * r1
            if (r0 < 0) goto L4c
            r0 = 7
            com.xy.xyverify.Dialog.C0000.f4 = r0
            java.lang.String r0 = "ۣۢ۠"
            int r0 = com.xy.xyverify.Dialog.C0001.m9(r0)
            r4 = r0
            goto L9
        L4c:
            int r0 = com.xy.xyverify.Dialog.C0002.f6
            int r1 = com.xy.xyverify.Dialog.C0002.f6
            r0 = r0 | r1
            r1 = 1752185(0x1abc79, float:2.455334E-39)
            int r0 = r0 + r1
            r4 = r0
            goto L9
        L57:
            java.lang.String r0 = "sZHRCX8iTPPJkEmFgbTAArGs"
            java.lang.String r0 = com.xy.xyverify.Dialog.C0001.m10(r0)
            long r0 = java.lang.Long.parseLong(r0)
            int r2 = com.xy.xyverify.Dialog.C0001.f5
            int r3 = com.xy.xyverify.Verify.C0003.f10
            int r3 = r3 % (-4534)
            int r2 = r2 % r3
            if (r2 > 0) goto L76
            r2 = 55
            com.xy.xyverify.Verify.C0003.f10 = r2
            java.lang.String r2 = "ۨۥۡ"
            int r4 = com.xy.xyverify.Verify.C0004.m49(r2)
            r2 = r0
            goto L9
        L76:
            int r2 = com.xy.xyverify.Dialog.C0001.f5
            int r3 = com.xy.xyverify.Dialog.C0001.f5
            r2 = r2 ^ r3
            r3 = 1747933(0x1aabdd, float:2.449376E-39)
            int r4 = r2 + r3
            r2 = r0
            goto L9
        L82:
            int r0 = com.xy.xyverify.Verify.C0004.f11
            int r1 = com.xy.xyverify.Dialog.C0002.f6
            int r1 = r1 + (-7801)
            int r0 = r0 + r1
            if (r0 < 0) goto L8e
            java.lang.String r0 = "ۥۣ"
            goto L2f
        L8e:
            int r0 = com.xy.xyverify.Verify.C0004.f11
            int r1 = com.xy.xyverify.Verify.C0003.f10
            r0 = r0 | r1
            r1 = -1749705(0xffffffffffe54d37, float:NaN)
            r0 = r0 ^ r1
            r4 = r0
            goto L9
        L9a:
            int r0 = com.xy.xyverify.Verify.C0003.f10
            int r1 = com.xy.xyverify.Dialog.C0002.f6
            int r0 = r0 % r1
            r1 = 1750691(0x1ab6a3, float:2.45324E-39)
            int r0 = r0 + r1
            r4 = r0
            goto L9
        La6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xy.xyverify.Verify.Verify.lambda$MIUIUpdate$5(com.xy.xyverify.Dialog.MIUIDialog, android.view.View):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0007. Please report as an issue. */
    public void HeartBeat(String str, String str2) {
        String str3;
        Timer timer = null;
        int m4 = C0000.m4("ۦۤۤ");
        while (true) {
            switch (m4) {
                case 1751555:
                    if (C0003.f10 >= 0) {
                        C0000.m7();
                        str3 = "ۣۨۨ";
                    } else {
                        str3 = "ۦۤۤ";
                    }
                    m4 = C0001.m9(str3);
                case 1751778:
                    timer.schedule(new AnonymousClass2(this, str, str2, timer), 0L, 300000L);
                    if ((C0004.f11 ^ (C0000.f4 / 7571)) >= 0) {
                        C0002.f6 = 68;
                        m4 = C0001.m9("ۤۨۦ");
                    } else {
                        str3 = "ۥۥۣ";
                        m4 = C0001.m9(str3);
                    }
                case 1752643:
                    break;
                case 1753574:
                    timer = new Timer();
                    if ((C0004.f11 ^ (C0004.f11 + 7314)) >= 0) {
                        C0004.f11 = 58;
                        m4 = C0000.m4("ۦۤۤ");
                    } else {
                        m4 = C0001.m9("ۤۨۦ");
                    }
            }
            return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0007. Please report as an issue. */
    public void MakeInternet(final Context context) {
        String str;
        String str2;
        Integer num = null;
        int m4 = C0000.m4("۠ۢۧ");
        while (true) {
            switch (m4) {
                case 56569:
                    if (C0002.m15() <= 0) {
                        if ((C0002.f6 ^ (C0002.f6 / 4540)) <= 0) {
                            C0002.f6 = 41;
                            str2 = "ۣۣ۠";
                        } else {
                            str2 = "ۤ۠۠";
                        }
                        m4 = C0000.m4(str2);
                    } else {
                        m4 = C0004.f11 + C0003.f10 + 1752468;
                    }
                case 1746749:
                    System.out.println(num);
                    m4 = C0004.m49("ۤۥ۠");
                case 1747749:
                    new Thread(new Runnable(this, context) { // from class: com.xy.xyverify.Verify.Verify$$ExternalSyntheticLambda18
                        public final Verify f$0;
                        public final Context f$1;

                        /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000a. Please report as an issue. */
                        {
                            String str3;
                            String str4;
                            Integer num2 = null;
                            int m42 = C0000.m4("ۡۥۦ");
                            while (true) {
                                switch (m42) {
                                    case 1746975:
                                        break;
                                    case 1748799:
                                        this.f$1 = context;
                                        if ((C0002.f6 ^ (C0002.f6 | (-7285))) >= 0) {
                                            C0002.m15();
                                            m42 = C0000.m4("ۨۥۤ");
                                        } else {
                                            m42 = (C0002.f6 - C0003.f10) + 1751119;
                                        }
                                    case 1748802:
                                        this.f$0 = this;
                                        if (C0004.f11 >= 0) {
                                            C0003.f10 = 43;
                                            m42 = C0003.m44("ۤۥ۠");
                                        } else {
                                            m42 = (C0002.f6 ^ C0002.f6) + 1748799;
                                        }
                                    case 1749794:
                                        num2 = Integer.valueOf(C0004.m47("9Pgql5PXz4clB5rIrwD804sV7"));
                                        m42 = C0003.m44("ۣۤۡ");
                                    case 1751618:
                                        System.out.println(num2);
                                        if (C0002.f6 <= 0) {
                                            C0002.m15();
                                            str4 = "ۦۧ۟";
                                            m42 = C0002.m14(str4);
                                        } else {
                                            m42 = (C0001.f5 | C0001.f5) + 1746491;
                                        }
                                    case 1751679:
                                        if (C0003.m42() > 0) {
                                            str3 = "۟ۨۨ";
                                            m42 = C0002.m14(str3);
                                        } else if (C0000.m7() <= 0) {
                                            m42 = C0003.m44("ۣۤۡ");
                                        } else {
                                            str4 = "ۢۦۦ";
                                            m42 = C0002.m14(str4);
                                        }
                                    case 1753662:
                                        if (C0003.f10 / (C0003.f10 - 4532) != 0) {
                                            C0002.f6 = 2;
                                            str3 = "ۢۥۧ";
                                            m42 = C0002.m14(str3);
                                        } else {
                                            m42 = C0000.m4("ۡۥۦ");
                                        }
                                    case 1755527:
                                        str3 = "۟ۨۨ";
                                        m42 = C0002.m14(str3);
                                }
                                return;
                            }
                        }

                        /* JADX WARN: Code restructure failed: missing block: B:21:0x003f, code lost:
                        
                            return;
                         */
                        @Override // java.lang.Runnable
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void run() {
                            /*
                                r2 = this;
                                java.lang.String r0 = "ۣ۟۠"
                                int r0 = com.xy.xyverify.Dialog.C0002.m14(r0)
                            L6:
                                switch(r0) {
                                    case 1746812: goto La;
                                    case 1746942: goto L3f;
                                    case 1754631: goto L2f;
                                    default: goto L9;
                                }
                            L9:
                                goto L6
                            La:
                                com.xy.xyverify.Verify.Verify r0 = r2.f$0
                                android.content.Context r1 = r2.f$1
                                r0.m39lambda$MakeInternet$2$comxyxyverifyVerifyVerify(r1)
                                int r0 = com.xy.xyverify.Dialog.C0000.f4
                                int r1 = com.xy.xyverify.Dialog.C0002.f6
                                int r1 = r1 / (-8691)
                                r0 = r0 ^ r1
                                if (r0 > 0) goto L25
                                r0 = 13
                                com.xy.xyverify.Verify.C0004.f11 = r0
                                java.lang.String r0 = "ۧۧۧ"
                                int r0 = com.xy.xyverify.Dialog.C0002.m14(r0)
                                goto L6
                            L25:
                                int r0 = com.xy.xyverify.Dialog.C0001.f5
                                int r1 = com.xy.xyverify.Dialog.C0001.f5
                                int r0 = r0 / r1
                                r1 = 1746941(0x1aa7fd, float:2.447986E-39)
                                int r0 = r0 + r1
                                goto L6
                            L2f:
                                int r0 = com.xy.xyverify.Dialog.C0001.m8()
                                if (r0 > 0) goto L3c
                                java.lang.String r0 = "ۤۧ۠"
                            L37:
                                int r0 = com.xy.xyverify.Dialog.C0002.m14(r0)
                                goto L6
                            L3c:
                                java.lang.String r0 = "ۣ۟۠"
                                goto L37
                            L3f:
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.xy.xyverify.Verify.Verify$$ExternalSyntheticLambda18.run():void");
                        }
                    }).start();
                    if (C0001.f5 <= 0) {
                        C0001.m8();
                        m4 = C0000.m4("۟ۡ۟");
                    } else {
                        m4 = (C0000.f4 - C0000.f4) ^ 56569;
                    }
                case 1750566:
                    if (C0001.m8() <= 0) {
                        C0000.m7();
                        str = "۟ۧۦ";
                    } else {
                        str = "۠ۢۧ";
                    }
                    m4 = C0004.m49(str);
                case 1751524:
                    num = Integer.valueOf(C0003.m43("BpNiTiCL"));
                    m4 = C0000.m4("۟ۡ۟");
                case 1751679:
                    break;
                case 1754378:
                    m4 = C0004.f11 + C0003.f10 + 1752468;
            }
            return;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* renamed from: lambda$IOSLogin$17$com-xy-xyverify-Verify-Verify, reason: not valid java name */
    public /* synthetic */ void m16lambda$IOSLogin$17$comxyxyverifyVerifyVerify(IOSDialog iOSDialog) {
        String str;
        int m9 = C0001.m9("ۣۧ۠");
        while (true) {
            switch (m9) {
                case 56448:
                    if (C0003.m42() <= 0) {
                        C0000.m7();
                        str = "۟ۥ";
                    } else {
                        str = "ۣۧ۠";
                    }
                    m9 = C0003.m44(str);
                case 1750780:
                    XYToast.makeTextShow(this.context, C0002.m13(f8short, 59, 4, 1100));
                    if (C0000.f4 <= 0) {
                        C0000.f4 = 94;
                    }
                    m9 = C0003.m44("ۤۢۧ");
                case 1751593:
                    iOSDialog.cancel();
                    str = "ۥۢ۠";
                    m9 = C0003.m44(str);
                case 1752547:
                    break;
            }
            return;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    /* renamed from: lambda$IOSLogin$18$com-xy-xyverify-Verify-Verify, reason: not valid java name */
    public /* synthetic */ void m17lambda$IOSLogin$18$comxyxyverifyVerifyVerify() {
        String str;
        String str2;
        long j2 = 0;
        int m9 = C0001.m9("۟ۡۥ");
        while (true) {
            switch (m9) {
                case 56421:
                    break;
                case 1746755:
                    XYToast.makeTextShow(this.context, C0003.m45(f8short, 63, 4, 869));
                    str2 = "ۣۢۥ";
                    m9 = C0004.m49(str2);
                case 1746789:
                    System.out.println(j2);
                    if (C0003.f10 >= 0) {
                        C0000.f4 = 56;
                    }
                    m9 = C0002.m14("ۣۨ");
                case 1749700:
                    if (C0002.m15() <= 0) {
                        if (C0000.f4 <= 0) {
                            C0002.f6 = 32;
                        }
                        str = "ۣۧۢ";
                        m9 = C0002.m14(str);
                    } else {
                        str2 = "ۣۨ";
                        m9 = C0004.m49(str2);
                    }
                case 1750782:
                    j2 = Long.parseLong(C0001.m10("K7bkqzCM"));
                    if (C0003.m42() <= 0) {
                        C0004.f11 = 81;
                        m9 = C0003.m44("ۧۦ۠");
                    } else {
                        str = "۟ۢۨ";
                        m9 = C0002.m14(str);
                    }
                case 1752453:
                    str2 = "ۣۨ";
                    m9 = C0004.m49(str2);
                case 1754593:
                    if (C0001.m8() <= 0) {
                        C0001.f5 = 23;
                        str2 = "ۢۢ";
                        m9 = C0004.m49(str2);
                    } else {
                        m9 = (C0000.f4 - C0002.f6) + 1746507;
                    }
            }
            return;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000f. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x01d8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0017 A[SYNTHETIC] */
    /* renamed from: lambda$IOSLogin$19$com-xy-xyverify-Verify-Verify, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ void m18lambda$IOSLogin$19$comxyxyverifyVerifyVerify(java.lang.String r19, final com.xy.xyverify.Dialog.IOSDialog r20) {
        /*
            Method dump skipped, instructions count: 680
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xy.xyverify.Verify.Verify.m18lambda$IOSLogin$19$comxyxyverifyVerifyVerify(java.lang.String, com.xy.xyverify.Dialog.IOSDialog):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0064 A[SYNTHETIC] */
    /* renamed from: lambda$IOSLogin$20$com-xy-xyverify-Verify-Verify, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ void m19lambda$IOSLogin$20$comxyxyverifyVerifyVerify(android.widget.EditText r7, final com.xy.xyverify.Dialog.IOSDialog r8, android.view.View r9) {
        /*
            r6 = this;
            r0 = 0
            java.lang.String r1 = "ۨۢ۟"
            int r2 = com.xy.xyverify.Dialog.C0002.m14(r1)
            r1 = r0
        L8:
            switch(r2) {
                case 56569: goto Lc;
                case 1748735: goto L5e;
                case 1750600: goto Lbe;
                case 1751496: goto L77;
                case 1753700: goto L40;
                case 1755429: goto L1b;
                case 1755584: goto Lbe;
                case 1755624: goto L9c;
                default: goto Lb;
            }
        Lb:
            goto L8
        Lc:
            int r0 = com.xy.xyverify.Dialog.C0001.f5
            if (r0 > 0) goto L5b
            com.xy.xyverify.Dialog.C0001.m8()
            java.lang.String r0 = "ۢ۟"
        L15:
            int r0 = com.xy.xyverify.Verify.C0003.m44(r0)
            r2 = r0
            goto L8
        L1b:
            android.text.Editable r0 = r7.getText()
            java.lang.String r0 = r0.toString()
            int r1 = com.xy.xyverify.Verify.C0004.m46()
            if (r1 > 0) goto L35
            r1 = 90
            com.xy.xyverify.Dialog.C0000.f4 = r1
            java.lang.String r1 = "ۣۡۡ"
            int r2 = com.xy.xyverify.Dialog.C0002.m14(r1)
            r1 = r0
            goto L8
        L35:
            int r1 = com.xy.xyverify.Verify.C0003.f10
            int r2 = com.xy.xyverify.Verify.C0004.f11
            int r1 = r1 - r2
            r2 = 1750839(0x1ab737, float:2.453448E-39)
            int r2 = r2 + r1
            r1 = r0
            goto L8
        L40:
            android.content.Context r0 = r6.context
            short[] r2 = com.xy.xyverify.Verify.Verify.f8short
            r3 = 83
            r4 = 6
            r5 = 1091(0x443, float:1.529E-42)
            java.lang.String r2 = com.xy.xyverify.Verify.C0004.m48(r2, r3, r4, r5)
            com.xy.xyverify.Dialog.XYToast.makeTextShow(r0, r2)
            int r0 = com.xy.xyverify.Dialog.C0001.f5
            int r2 = com.xy.xyverify.Verify.C0003.f10
            r0 = r0 | r2
            r2 = 1750602(0x1ab64a, float:2.453116E-39)
            int r0 = r0 + r2
            r2 = r0
            goto L8
        L5b:
            java.lang.String r0 = "ۨۢ۟"
            goto L15
        L5e:
            int r0 = com.xy.xyverify.Verify.C0004.m46()
            if (r0 > 0) goto L6f
            com.xy.xyverify.Verify.C0003.m42()
            java.lang.String r0 = "۟۟ۡ"
            int r0 = com.xy.xyverify.Dialog.C0002.m14(r0)
            r2 = r0
            goto L8
        L6f:
            java.lang.String r0 = "ۨۨۨ"
            int r0 = com.xy.xyverify.Verify.C0004.m49(r0)
            r2 = r0
            goto L8
        L77:
            java.lang.String r0 = ""
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L5e
            int r0 = com.xy.xyverify.Dialog.C0002.f6
            if (r0 > 0) goto L90
            r0 = 54
            com.xy.xyverify.Dialog.C0002.f6 = r0
            java.lang.String r0 = "ۨۨۨ"
            int r0 = com.xy.xyverify.Dialog.C0001.m9(r0)
            r2 = r0
            goto L8
        L90:
            int r0 = com.xy.xyverify.Dialog.C0002.f6
            int r2 = com.xy.xyverify.Verify.C0003.f10
            int r0 = r0 / r2
            r2 = 1753707(0x1ac26b, float:2.457467E-39)
            int r0 = r0 + r2
            r2 = r0
            goto L8
        L9c:
            java.lang.Thread r0 = new java.lang.Thread
            com.xy.xyverify.Verify.Verify$$ExternalSyntheticLambda9 r2 = new com.xy.xyverify.Verify.Verify$$ExternalSyntheticLambda9
            r2.<init>(r6, r1, r8)
            r0.<init>(r2)
            r0.start()
            int r0 = com.xy.xyverify.Dialog.C0002.f6
            int r2 = com.xy.xyverify.Verify.C0004.f11
            int r2 = r2 * 5099
            r0 = r0 ^ r2
            if (r0 < 0) goto Lbb
            java.lang.String r0 = "ۣۤ۟"
        Lb4:
            int r0 = com.xy.xyverify.Verify.C0003.m44(r0)
            r2 = r0
            goto L8
        Lbb:
            java.lang.String r0 = "ۨۧ۟"
            goto Lb4
        Lbe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xy.xyverify.Verify.Verify.m19lambda$IOSLogin$20$comxyxyverifyVerifyVerify(android.widget.EditText, com.xy.xyverify.Dialog.IOSDialog, android.view.View):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        return;
     */
    /* renamed from: lambda$IOSLogin$21$com-xy-xyverify-Verify-Verify, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ void m20lambda$IOSLogin$21$comxyxyverifyVerifyVerify() {
        /*
            r5 = this;
            java.lang.String r0 = "۠ۦۤ"
            int r0 = com.xy.xyverify.Dialog.C0002.m14(r0)
        L6:
            switch(r0) {
                case 1747680: goto La;
                case 1747870: goto L1e;
                case 1748769: goto L51;
                default: goto L9;
            }
        L9:
            goto L6
        La:
            int r0 = com.xy.xyverify.Dialog.C0000.f4
            int r1 = com.xy.xyverify.Dialog.C0000.f4
            int r1 = r1 + 7043
            r0 = r0 ^ r1
            if (r0 > 0) goto L47
            r0 = 86
            com.xy.xyverify.Dialog.C0000.f4 = r0
            java.lang.String r0 = "ۧۤ۠"
            int r0 = com.xy.xyverify.Verify.C0004.m49(r0)
            goto L6
        L1e:
            android.content.Context r0 = r5.context
            short[] r1 = com.xy.xyverify.Verify.Verify.f8short
            r2 = 89
            r3 = 6
            r4 = 702(0x2be, float:9.84E-43)
            java.lang.String r1 = com.xy.xyverify.Dialog.C0000.m5(r1, r2, r3, r4)
            com.xy.xyverify.Dialog.XYToast.makeTextShow(r0, r1)
            int r0 = com.xy.xyverify.Dialog.C0001.f5
            if (r0 > 0) goto L3d
            r0 = 52
            com.xy.xyverify.Verify.C0004.f11 = r0
            java.lang.String r0 = "۠ۦۤ"
            int r0 = com.xy.xyverify.Verify.C0003.m44(r0)
            goto L6
        L3d:
            int r0 = com.xy.xyverify.Verify.C0004.f11
            int r1 = com.xy.xyverify.Verify.C0003.f10
            int r0 = r0 * r1
            r1 = 1701051(0x19f4bb, float:2.38368E-39)
            int r0 = r0 + r1
            goto L6
        L47:
            int r0 = com.xy.xyverify.Verify.C0004.f11
            int r1 = com.xy.xyverify.Dialog.C0001.f5
            int r0 = r0 + r1
            r1 = -1747825(0xffffffffffe5548f, float:NaN)
            r0 = r0 ^ r1
            goto L6
        L51:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xy.xyverify.Verify.Verify.m20lambda$IOSLogin$21$comxyxyverifyVerifyVerify():void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* renamed from: lambda$IOSLogin$22$com-xy-xyverify-Verify-Verify, reason: not valid java name */
    public /* synthetic */ void m21lambda$IOSLogin$22$comxyxyverifyVerifyVerify() {
        String str;
        int m9 = C0001.m9("ۧۤۦ");
        while (true) {
            switch (m9) {
                case 56506:
                    break;
                case 1751592:
                    if (C0001.f5 / (C0001.f5 - 380) <= 0) {
                        C0001.f5 = 25;
                        str = "ۨ۠ۥ";
                        m9 = C0001.m9(str);
                    } else {
                        m9 = C0000.m4("ۧۤۦ");
                    }
                case 1754537:
                    XYToast.makeTextShow(this.context, C0002.m13(f8short, 95, 6, 562));
                    str = "ۦ۠";
                    m9 = C0001.m9(str);
            }
            return;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
    
        return;
     */
    /* renamed from: lambda$IOSLogin$23$com-xy-xyverify-Verify-Verify, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ void m22lambda$IOSLogin$23$comxyxyverifyVerifyVerify() {
        /*
            r5 = this;
            java.lang.String r0 = "ۣۣۤ"
            int r0 = com.xy.xyverify.Dialog.C0000.m4(r0)
        L6:
            switch(r0) {
                case 1750690: goto La;
                case 1755466: goto L48;
                case 1755495: goto L30;
                default: goto L9;
            }
        L9:
            goto L6
        La:
            android.content.Context r0 = r5.context
            short[] r1 = com.xy.xyverify.Verify.Verify.f8short
            r2 = 101(0x65, float:1.42E-43)
            r3 = 4
            r4 = 2717(0xa9d, float:3.807E-42)
            java.lang.String r1 = com.xy.xyverify.Dialog.C0000.m5(r1, r2, r3, r4)
            com.xy.xyverify.Dialog.XYToast.makeTextShow(r0, r1)
            int r0 = com.xy.xyverify.Verify.C0003.f10
            int r1 = com.xy.xyverify.Dialog.C0001.f5
            r1 = r1 | (-4933(0xffffffffffffecbb, float:NaN))
            int r0 = r0 % r1
            if (r0 < 0) goto L2d
            com.xy.xyverify.Verify.C0004.m46()
            java.lang.String r0 = "ۣۣۤ"
        L28:
            int r0 = com.xy.xyverify.Dialog.C0000.m4(r0)
            goto L6
        L2d:
            java.lang.String r0 = "ۣۨۥ"
            goto L28
        L30:
            int r0 = com.xy.xyverify.Verify.C0003.m42()
            if (r0 > 0) goto L41
            r0 = 27
            com.xy.xyverify.Verify.C0003.f10 = r0
            java.lang.String r0 = "ۤۤۢ"
            int r0 = com.xy.xyverify.Verify.C0004.m49(r0)
            goto L6
        L41:
            java.lang.String r0 = "ۣۣۤ"
            int r0 = com.xy.xyverify.Verify.C0004.m49(r0)
            goto L6
        L48:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xy.xyverify.Verify.Verify.m22lambda$IOSLogin$23$comxyxyverifyVerifyVerify():void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000e. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0151 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x014b A[SYNTHETIC] */
    /* renamed from: lambda$IOSLogin$24$com-xy-xyverify-Verify-Verify, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ void m23lambda$IOSLogin$24$comxyxyverifyVerifyVerify(java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xy.xyverify.Verify.Verify.m23lambda$IOSLogin$24$comxyxyverifyVerifyVerify(java.lang.String):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0009. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:56:0x012c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0124 A[SYNTHETIC] */
    /* renamed from: lambda$IOSLogin$25$com-xy-xyverify-Verify-Verify, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ void m24lambda$IOSLogin$25$comxyxyverifyVerifyVerify(android.widget.EditText r8, android.view.View r9) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xy.xyverify.Verify.Verify.m24lambda$IOSLogin$25$comxyxyverifyVerifyVerify(android.widget.EditText, android.view.View):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    /* renamed from: lambda$IOSNotice$11$com-xy-xyverify-Verify-Verify, reason: not valid java name */
    public /* synthetic */ void m25lambda$IOSNotice$11$comxyxyverifyVerifyVerify(String str) {
        String str2;
        int m9 = C0001.m9("ۦۢ۟");
        IOSDialog iOSDialog = null;
        while (true) {
            switch (m9) {
                case 56350:
                    iOSDialog.show();
                    m9 = (C0004.f11 - C0003.f10) ^ (-1755930);
                case 1748616:
                    if ((C0004.f11 | (C0000.f4 / (-8407))) >= 0) {
                        C0003.m42();
                        str2 = "ۥ۠ۧ";
                    } else {
                        str2 = "ۦۢ۟";
                    }
                    m9 = C0003.m44(str2);
                case 1753507:
                    IOSDialog message = new IOSDialog(this.context).setTitle(C0002.m13(f8short, 115, 2, 1228)).setMessage(str);
                    if (C0003.f10 + (C0002.f6 / 5259) >= 0) {
                        m9 = C0002.m14("ۡ۟");
                        iOSDialog = message;
                    } else {
                        m9 = 1516244 + (C0001.f5 * C0002.f6);
                        iOSDialog = message;
                    }
                case 1755340:
                    iOSDialog.setCancelable(false);
                    if (C0003.m42() <= 0) {
                        m9 = C0002.m14("ۦۢ۟");
                    } else {
                        str2 = "ۡ۟";
                        m9 = C0003.m44(str2);
                    }
                case 1755529:
                    break;
            }
            return;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0139 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0130 A[SYNTHETIC] */
    /* renamed from: lambda$IOSNotice$12$com-xy-xyverify-Verify-Verify, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ void m26lambda$IOSNotice$12$comxyxyverifyVerifyVerify() {
        /*
            Method dump skipped, instructions count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xy.xyverify.Verify.Verify.m26lambda$IOSNotice$12$comxyxyverifyVerifyVerify():void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000a. Please report as an issue. */
    /* renamed from: lambda$IOSUpdate$13$com-xy-xyverify-Verify-Verify, reason: not valid java name */
    public /* synthetic */ void m27lambda$IOSUpdate$13$comxyxyverifyVerifyVerify(String str, View view) {
        String str2;
        Uri uri;
        String str3;
        Intent intent;
        String str4;
        Intent intent2 = null;
        int m44 = C0003.m44("۠ۧ۠");
        Uri uri2 = null;
        while (true) {
            switch (m44) {
                case 56416:
                    if (C0002.f6 - (C0003.f10 + 6491) >= 0) {
                        str4 = "۟ۧۦ";
                        intent = intent2;
                        intent2 = intent;
                        m44 = C0002.m14(str4);
                    } else {
                        m44 = (C0004.f11 % C0003.f10) + 1746882;
                    }
                case 1746819:
                    if (C0003.m42() <= 0) {
                        uri = uri2;
                        m44 = C0004.m49("ۥۧۥ");
                        uri2 = uri;
                    } else {
                        str3 = "ۢۨۥ";
                        m44 = C0003.m44(str3);
                    }
                case 1747656:
                    try {
                        uri = Uri.parse(str);
                    } catch (Exception e2) {
                        XYToast.makeTextShow(this.context, C0003.m45(f8short, 152, 8, 873));
                        if (C0004.m46() <= 0) {
                            C0004.m46();
                            m44 = C0000.m4("۠ۧ۠");
                        } else {
                            m44 = C0001.f5 + C0004.f11 + 1750898;
                        }
                    }
                    if ((C0004.f11 ^ (C0002.f6 % 723)) >= 0) {
                        m44 = C0002.m14("ۣۣ");
                        uri2 = uri;
                    } else {
                        m44 = C0004.m49("ۥۧۥ");
                        uri2 = uri;
                    }
                case 1747897:
                    if (C0001.m8() <= 0) {
                        C0004.f11 = 65;
                        m44 = C0003.m44("۠۟ۧ");
                    } else {
                        str2 = "۠۟ۧ";
                        m44 = C0001.m9(str2);
                    }
                case 1749824:
                    str2 = "۠۟ۧ";
                    m44 = C0001.m9(str2);
                case 1749855:
                case 1750659:
                    if (C0004.f11 * (C0002.f6 % 4103) >= 0) {
                        C0002.m15();
                        str3 = "ۣۡۦ";
                        m44 = C0003.m44(str3);
                    } else {
                        m44 = (C0004.f11 * C0000.f4) + 2289136;
                    }
                case 1750535:
                    this.context.startActivity(intent2);
                    m44 = C0002.f6 + C0003.f10 + 1746391;
                case 1752670:
                    break;
                case 1752707:
                    intent = new Intent(C0003.m45(f8short, 126, 26, 2827), uri2);
                    if (C0002.f6 / (C0004.f11 * 5204) != 0) {
                        C0002.f6 = 5;
                        intent2 = intent;
                        m44 = C0000.m4("ۥۦ۟");
                    } else {
                        str4 = "ۣۣ۟";
                        intent2 = intent;
                        m44 = C0002.m14(str4);
                    }
                case 1753632:
                    if (C0001.f5 / (C0001.f5 * (-3591)) != 0) {
                        str2 = "ۧۧۨ";
                        m44 = C0001.m9(str2);
                    } else {
                        m44 = (C0001.f5 - C0003.f10) + 1747347;
                    }
            }
            return;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0135 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x012c A[SYNTHETIC] */
    /* renamed from: lambda$IOSUpdate$14$com-xy-xyverify-Verify-Verify, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ void m28lambda$IOSUpdate$14$comxyxyverifyVerifyVerify(int r10, final java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xy.xyverify.Verify.Verify.m28lambda$IOSUpdate$14$comxyxyverifyVerifyVerify(int, java.lang.String):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0010. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01f8  */
    /* renamed from: lambda$IOSUpdate$15$com-xy-xyverify-Verify-Verify, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ void m29lambda$IOSUpdate$15$comxyxyverifyVerifyVerify() {
        /*
            Method dump skipped, instructions count: 588
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xy.xyverify.Verify.Verify.m29lambda$IOSUpdate$15$comxyxyverifyVerifyVerify():void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ab A[SYNTHETIC] */
    /* renamed from: lambda$MIUILogin$10$com-xy-xyverify-Verify-Verify, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ void m30lambda$MIUILogin$10$comxyxyverifyVerifyVerify(android.widget.EditText r7, final android.content.SharedPreferences r8, final com.xy.xyverify.Dialog.MIUIDialog r9, android.view.View r10) {
        /*
            r6 = this;
            r0 = 0
            java.lang.String r1 = "ۣۦۢ"
            int r2 = com.xy.xyverify.Dialog.C0001.m9(r1)
            r1 = r0
        L8:
            switch(r2) {
                case 1746875: goto Lc;
                case 1747804: goto L46;
                case 1750751: goto L93;
                case 1751589: goto Lc4;
                case 1752741: goto L28;
                case 1753477: goto La7;
                case 1753570: goto Lc4;
                case 1754507: goto L76;
                default: goto Lb;
            }
        Lb:
            goto L8
        Lc:
            int r0 = com.xy.xyverify.Dialog.C0000.f4
            int r2 = com.xy.xyverify.Verify.C0003.f10
            r2 = r2 ^ 9006(0x232e, float:1.262E-41)
            r0 = r0 ^ r2
            if (r0 < 0) goto L1d
            java.lang.String r0 = "ۢ۠ۥ"
            int r0 = com.xy.xyverify.Verify.C0004.m49(r0)
            r2 = r0
            goto L8
        L1d:
            int r0 = com.xy.xyverify.Verify.C0004.f11
            int r2 = com.xy.xyverify.Dialog.C0002.f6
            r0 = r0 | r2
            r2 = -1750224(0xffffffffffe54b30, float:NaN)
            r0 = r0 ^ r2
            r2 = r0
            goto L8
        L28:
            java.lang.Thread r0 = new java.lang.Thread
            com.xy.xyverify.Verify.Verify$$ExternalSyntheticLambda23 r2 = new com.xy.xyverify.Verify.Verify$$ExternalSyntheticLambda23
            r2.<init>(r6, r1, r8, r9)
            r0.<init>(r2)
            r0.start()
            int r0 = com.xy.xyverify.Verify.C0003.f10
            int r2 = com.xy.xyverify.Dialog.C0000.f4
            r2 = r2 ^ (-1699(0xfffffffffffff95d, float:NaN))
            r0 = r0 | r2
            if (r0 < 0) goto L87
            java.lang.String r0 = "۟ۥۡ"
            int r0 = com.xy.xyverify.Dialog.C0001.m9(r0)
            r2 = r0
            goto L8
        L46:
            android.content.Context r0 = r6.context
            short[] r2 = com.xy.xyverify.Verify.Verify.f8short
            r3 = 195(0xc3, float:2.73E-43)
            r4 = 6
            r5 = 641(0x281, float:8.98E-43)
            java.lang.String r2 = com.xy.xyverify.Dialog.C0000.m5(r2, r3, r4, r5)
            com.xy.xyverify.Dialog.XYToast.makeTextShow(r0, r2)
            int r0 = com.xy.xyverify.Dialog.C0000.f4
            int r2 = com.xy.xyverify.Dialog.C0000.f4
            r2 = r2 ^ 7659(0x1deb, float:1.0733E-41)
            r0 = r0 | r2
            if (r0 > 0) goto L6b
            r0 = 26
            com.xy.xyverify.Verify.C0003.f10 = r0
            java.lang.String r0 = "ۦۡ۠"
            int r0 = com.xy.xyverify.Verify.C0003.m44(r0)
            r2 = r0
            goto L8
        L6b:
            int r0 = com.xy.xyverify.Dialog.C0000.f4
            int r2 = com.xy.xyverify.Dialog.C0001.f5
            int r0 = r0 - r2
            r2 = 1751847(0x1abb27, float:2.45486E-39)
            r0 = r0 ^ r2
            r2 = r0
            goto L8
        L76:
            java.lang.String r0 = ""
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto La7
            int r0 = com.xy.xyverify.Dialog.C0001.m8()
            if (r0 > 0) goto L90
            com.xy.xyverify.Verify.C0003.m42()
        L87:
            java.lang.String r0 = "ۦۤ۠"
        L89:
            int r0 = com.xy.xyverify.Verify.C0004.m49(r0)
            r2 = r0
            goto L8
        L90:
            java.lang.String r0 = "۠ۤ۠"
            goto L89
        L93:
            android.text.Editable r0 = r7.getText()
            java.lang.String r0 = r0.toString()
            int r1 = com.xy.xyverify.Dialog.C0001.f5
            int r2 = com.xy.xyverify.Verify.C0004.f11
            int r1 = r1 + r2
            r2 = 1754746(0x1ac67a, float:2.458923E-39)
            int r2 = r2 + r1
            r1 = r0
            goto L8
        La7:
            int r0 = com.xy.xyverify.Dialog.C0001.f5
            if (r0 > 0) goto Lb8
            r0 = 25
            com.xy.xyverify.Dialog.C0002.f6 = r0
            java.lang.String r0 = "ۢ۟"
            int r0 = com.xy.xyverify.Dialog.C0002.m14(r0)
            r2 = r0
            goto L8
        Lb8:
            int r0 = com.xy.xyverify.Verify.C0004.f11
            int r2 = com.xy.xyverify.Dialog.C0000.f4
            int r0 = r0 % r2
            r2 = 1753464(0x1ac178, float:2.457126E-39)
            int r0 = r0 + r2
            r2 = r0
            goto L8
        Lc4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xy.xyverify.Verify.Verify.m30lambda$MIUILogin$10$comxyxyverifyVerifyVerify(android.widget.EditText, android.content.SharedPreferences, com.xy.xyverify.Dialog.MIUIDialog, android.view.View):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0009. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0044 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x003c A[SYNTHETIC] */
    /* renamed from: lambda$MIUILogin$6$com-xy-xyverify-Verify-Verify, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ void m31lambda$MIUILogin$6$comxyxyverifyVerifyVerify(java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xy.xyverify.Verify.Verify.m31lambda$MIUILogin$6$comxyxyverifyVerifyVerify(java.lang.String):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0009. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0041 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0036 A[SYNTHETIC] */
    /* renamed from: lambda$MIUILogin$7$com-xy-xyverify-Verify-Verify, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ void m32lambda$MIUILogin$7$comxyxyverifyVerifyVerify(android.widget.EditText r8, android.view.View r9) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xy.xyverify.Verify.Verify.m32lambda$MIUILogin$7$comxyxyverifyVerifyVerify(android.widget.EditText, android.view.View):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0007. Please report as an issue. */
    /* renamed from: lambda$MIUILogin$8$com-xy-xyverify-Verify-Verify, reason: not valid java name */
    public /* synthetic */ void m33lambda$MIUILogin$8$comxyxyverifyVerifyVerify(long j2, SharedPreferences sharedPreferences, String str, MIUIDialog mIUIDialog) {
        String str2;
        String str3;
        String str4 = null;
        int m9 = C0001.m9("ۡۧ۠");
        while (true) {
            switch (m9) {
                case 1746721:
                    sharedPreferences.edit().putString(C0004.m48(f8short, 253, 4, 1150), str).apply();
                    m9 = (C0004.f11 * C0003.f10) + 1707618;
                case 1748858:
                    this.TureCard = false;
                    str2 = "ۧۨۧ";
                    m9 = C0003.m44(str2);
                case 1750818:
                    break;
                case 1751531:
                    HeartBeat(str, this.androidId);
                    str3 = "ۣۨۧ";
                    m9 = C0002.m14(str3);
                case 1752701:
                    str3 = C0003.f10 % (C0002.f6 | (-6974)) >= 0 ? "۠۟ۧ" : "ۡۧ۠";
                    m9 = C0002.m14(str3);
                case 1753698:
                    XYToast.makeTextShow(this.context, C0002.m13(f8short, 243, 10, 2677) + str4);
                    if (C0004.m46() <= 0) {
                        C0000.m7();
                        m9 = C0003.m44("ۤ۠ۧ");
                    } else {
                        str2 = "۟۠ۢ";
                        m9 = C0003.m44(str2);
                    }
                case 1754662:
                    str4 = new SimpleDateFormat(C0004.m48(f8short, 224, 19, 2815)).format(new Date(1000 * j2));
                    if (C0004.f11 >= 0) {
                        str2 = "ۡۧ۠";
                        m9 = C0003.m44(str2);
                    } else {
                        m9 = (C0003.f10 ^ C0001.f5) + 1754120;
                    }
                case 1755336:
                    mIUIDialog.cancel();
                    if (C0000.m7() <= 0) {
                        C0003.f10 = 82;
                        m9 = C0003.m44("ۣۨۧ");
                    } else {
                        m9 = C0003.m44("ۤ۠ۧ");
                    }
            }
            return;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0015. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0141 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0134 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02dd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02d9 A[SYNTHETIC] */
    /* renamed from: lambda$MIUILogin$9$com-xy-xyverify-Verify-Verify, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ void m34lambda$MIUILogin$9$comxyxyverifyVerifyVerify(final java.lang.String r18, final android.content.SharedPreferences r19, final com.xy.xyverify.Dialog.MIUIDialog r20) {
        /*
            Method dump skipped, instructions count: 914
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xy.xyverify.Verify.Verify.m34lambda$MIUILogin$9$comxyxyverifyVerifyVerify(java.lang.String, android.content.SharedPreferences, com.xy.xyverify.Dialog.MIUIDialog):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0009. Please report as an issue. */
    /* renamed from: lambda$MIUINotice$3$com-xy-xyverify-Verify-Verify, reason: not valid java name */
    public /* synthetic */ void m35lambda$MIUINotice$3$comxyxyverifyVerifyVerify(View view) {
        String str;
        String str2;
        int m44 = C0003.m44("ۥۤۢ");
        Intent intent = null;
        Uri uri = null;
        while (true) {
            switch (m44) {
                case 56510:
                    if (C0004.f11 - (C0002.f6 / (-1138)) >= 0) {
                        m44 = C0004.m49("ۦۤ");
                    } else {
                        str2 = "۠ۥۢ";
                        m44 = C0003.m44(str2);
                    }
                case 56573:
                case 1747837:
                    m44 = C0004.f11 + C0003.f10 + 1754243;
                case 1748740:
                    try {
                        this.context.startActivity(intent);
                    } catch (Exception e2) {
                        XYToast.makeTextShow(this.context, C0003.m45(f8short, 299, 8, 1563));
                        if (C0001.m8() <= 0) {
                            C0004.m46();
                            m44 = C0001.m9("ۣۡۦ");
                        } else {
                            m44 = (C0004.f11 - C0000.f4) + 58038;
                        }
                    }
                    if (C0003.f10 - (C0001.f5 - 8383) <= 0) {
                        str2 = "ۥۤۢ";
                        m44 = C0003.m44(str2);
                    } else {
                        m44 = C0001.f5 + C0003.f10 + 56092;
                    }
                case 1749608:
                    if ((C0001.f5 ^ (C0001.f5 / 3908)) <= 0) {
                        C0001.f5 = 78;
                        m44 = C0001.m9("ۣۧ۠");
                    } else {
                        m44 = (C0003.f10 ^ C0003.f10) + 56510;
                    }
                case 1751776:
                    Intent intent2 = new Intent(C0003.m45(f8short, 273, 26, 3265), uri);
                    if (C0000.m7() <= 0) {
                        C0002.m15();
                        m44 = C0004.m49("ۢ۠ۦ");
                        intent = intent2;
                    } else {
                        m44 = 1749463 + (C0004.f11 % C0000.f4);
                        intent = intent2;
                    }
                case 1752488:
                    if (C0004.m46() <= 0) {
                        C0000.m7();
                        m44 = C0004.m49("ۨۦۢ");
                    } else {
                        str = "ۥۣ۟";
                        m44 = C0001.m9(str);
                    }
                case 1752577:
                    uri = Uri.parse(this.updateInfo);
                    if (C0000.f4 <= 0) {
                        C0003.f10 = 48;
                    }
                    m44 = C0003.m44("ۤۨۤ");
                case 1752611:
                    if (C0004.f11 * (C0002.f6 / 9521) != 0) {
                    }
                    m44 = C0001.m9("ۥۣ۟");
                case 1752707:
                    if (C0002.m15() <= 0) {
                        str = "ۣ۠ۦ";
                        m44 = C0001.m9(str);
                    } else {
                        m44 = (C0004.f11 % C0004.f11) + 1752611;
                    }
                case 1753454:
                    break;
            }
            return;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000a. Please report as an issue. */
    /* renamed from: lambda$MIUIUpdate$4$com-xy-xyverify-Verify-Verify, reason: not valid java name */
    public /* synthetic */ void m36lambda$MIUIUpdate$4$comxyxyverifyVerifyVerify(View view) {
        String str;
        Uri uri;
        String str2;
        String str3;
        int m4 = C0000.m4("ۣۨۨ");
        Float f2 = null;
        Uri uri2 = null;
        Intent intent = null;
        while (true) {
            switch (m4) {
                case 56382:
                    try {
                        Intent intent2 = new Intent(C0003.m45(f8short, StatusLine.HTTP_TEMP_REDIRECT, 26, 2284), uri2);
                        if (C0003.f10 >= 0) {
                            m4 = C0003.m44("ۦۡۦ");
                            intent = intent2;
                        } else {
                            m4 = (C0002.f6 - C0004.f11) ^ 1748989;
                            intent = intent2;
                        }
                    } catch (Exception e2) {
                        XYToast.makeTextShow(this.context, C0004.m48(f8short, 333, 8, 2241));
                        if (C0003.m42() > 0) {
                            str3 = "ۨۨۥ";
                            break;
                        } else {
                            C0003.m42();
                            m4 = C0001.m9("ۨۧۨ");
                        }
                    }
                case 1747715:
                    if (C0004.f11 / (C0004.f11 % (-4995)) <= 0) {
                        C0002.f6 = 6;
                        str = "ۨ۠ۡ";
                    } else {
                        str = "ۣۨۨ";
                    }
                    m4 = C0000.m4(str);
                case 1747772:
                    this.context.startActivity(intent);
                    if (C0000.f4 - (C0000.f4 ^ (-4619)) <= 0) {
                        C0001.f5 = 84;
                    } else {
                        uri = uri2;
                        m4 = C0004.m49("ۣۡ۟");
                        uri2 = uri;
                    }
                case 1747868:
                    m4 = C0000.m7() <= 0 ? C0000.m4("ۣۧۤ") : (C0000.f4 | C0004.f11) + 1753436;
                case 1748733:
                    if ((C0004.f11 ^ (C0004.f11 / (-7667))) >= 0) {
                        C0000.m7();
                        m4 = C0003.m44("ۣۨۨ");
                    } else {
                        m4 = (C0001.f5 * C0001.f5) + 1519221;
                    }
                case 1750819:
                    System.out.println(f2);
                    if ((C0003.f10 | C0004.f11 | (-7170)) >= 0) {
                        C0001.f5 = 76;
                        str2 = "۠ۡۤ";
                        m4 = C0003.m44(str2);
                    } else {
                        m4 = C0003.m44("ۦ۟ۤ");
                    }
                case 1751685:
                    uri = Uri.parse(this.url);
                    if (C0001.f5 - (C0004.f11 % 401) <= 0) {
                        C0002.m15();
                        m4 = C0004.m49("ۣۡ۟");
                        uri2 = uri;
                    } else {
                        m4 = 56366 + (C0000.f4 % C0003.f10);
                        uri2 = uri;
                    }
                case 1752609:
                    if (C0000.m7() <= 0) {
                        C0004.f11 = 70;
                        m4 = C0000.m4("۠ۦۨ");
                    } else {
                        m4 = (C0003.f10 / C0000.f4) + 1751685;
                    }
                case 1753419:
                    break;
                case 1753477:
                case 1755621:
                    if (C0000.m7() <= 0) {
                        C0004.m46();
                        str3 = "۠ۨ۠";
                        m4 = C0004.m49(str3);
                    } else {
                        m4 = (C0002.f6 * C0000.f4) + 1381320;
                    }
                case 1753483:
                case 1754534:
                    f2 = Float.decode(C0001.m10("W4rBqW"));
                    if (C0001.f5 / (C0002.f6 ^ 1101) != 0) {
                        C0002.m15();
                        m4 = C0004.m49("ۦۡ۠");
                    } else {
                        str2 = "ۣۨۨ";
                        m4 = C0003.m44(str2);
                    }
                case 1755469:
                    str2 = "ۤۥۦ";
                    m4 = C0003.m44(str2);
                case 1755593:
                    if (C0004.m46() <= 0) {
                        C0004.m46();
                        m4 = C0003.m44("۠ۤۤ");
                    } else {
                        str = "ۣۡ۟";
                        m4 = C0000.m4(str);
                    }
            }
            return;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0068  */
    /* renamed from: lambda$MakeInternet$0$com-xy-xyverify-Verify-Verify, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ void m37lambda$MakeInternet$0$comxyxyverifyVerifyVerify() {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xy.xyverify.Verify.Verify.m37lambda$MakeInternet$0$comxyxyverifyVerifyVerify():void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0018. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0252 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0133 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x020a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0203 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0272 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0265 A[SYNTHETIC] */
    /* renamed from: lambda$MakeInternet$1$com-xy-xyverify-Verify-Verify, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ void m38lambda$MakeInternet$1$comxyxyverifyVerifyVerify(java.lang.String r25, android.content.Context r26) {
        /*
            Method dump skipped, instructions count: 1216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xy.xyverify.Verify.Verify.m38lambda$MakeInternet$1$comxyxyverifyVerifyVerify(java.lang.String, android.content.Context):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0010. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0293 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x028f A[SYNTHETIC] */
    /* renamed from: lambda$MakeInternet$2$com-xy-xyverify-Verify-Verify, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ void m39lambda$MakeInternet$2$comxyxyverifyVerifyVerify(final android.content.Context r15) {
        /*
            Method dump skipped, instructions count: 758
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xy.xyverify.Verify.Verify.m39lambda$MakeInternet$2$comxyxyverifyVerifyVerify(android.content.Context):void");
    }
}
