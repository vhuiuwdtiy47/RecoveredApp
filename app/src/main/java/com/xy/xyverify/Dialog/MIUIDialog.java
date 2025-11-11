package com.xy.xyverify.Dialog;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.xy.xyverify.Verify.C0003;
import com.xy.xyverify.Verify.C0004;

/* loaded from: classes.dex */
public class MIUIDialog extends Dialog {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f2short = {1710, 1725, 1742, 1717, 1721, 1739, 1739, 1996, 1961, 2015, 1961, 2015, 1961, 2015, 31163, -30095, 2224, 2208, 2211, 2208, 2211, 2208, 2211, 2632, 2653, 2653, 2653, 2653, 2653, 2653, 1508, 1527, 1412, 1535, 1523, 1409, 1409, 1067, 1101, 1100, 1101, 1100, 1101, 1100};
    private LinearLayout ButtonLayout;
    private Button CancelButton;
    private LinearLayout ContentLayout;
    private EditText InputEdit;
    private LinearLayout MainView;
    private TextView MessageView;
    private Button OkButton;
    private TextView TitleView;
    private Context context;

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000a. Please report as an issue. */
    public MIUIDialog(Context context) {
        super(context);
        String str;
        String str2;
        Long l2 = null;
        int m9 = C0001.m9("ۦ۟۟");
        while (true) {
            switch (m9) {
                case 1746910:
                    InitBackGround();
                    m9 = C0004.m49("ۤۥۥ");
                case 1748772:
                    if (C0004.f11 - (C0001.f5 | 3164) >= 0) {
                        str = "ۨ۠ۡ";
                        m9 = C0004.m49(str);
                    } else {
                        m9 = (C0003.f10 * C0000.f4) + 1802386;
                    }
                case 1749858:
                    InitChildView();
                    m9 = C0003.m44(C0003.m42() <= 0 ? "ۣۨۧ" : "ۦ۟ۥ");
                case 1751526:
                    break;
                case 1751586:
                    l2 = Long.valueOf(C0000.m6("VOSnbhqO6UCTkxONSv6TLGugJZe"));
                    if (C0004.f11 < 0) {
                        str = "ۥ۠ۡ";
                        m9 = C0004.m49(str);
                    } else {
                        m9 = C0004.m49("ۤۥۥ");
                    }
                case 1751684:
                    InitMainView();
                    m9 = C0000.f4 <= 0 ? C0001.m9("ۦ۟۟") : C0001.f5 + C0001.f5 + 1748890;
                case 1752486:
                    System.out.println(l2);
                    if (C0000.f4 % (C0004.f11 ^ 9763) <= 0) {
                        m9 = C0002.m14("ۦ۟ۥ");
                    } else {
                        str = "ۤ۠ۢ";
                        m9 = C0004.m49(str);
                    }
                case 1752612:
                    if (C0003.m42() <= 0) {
                        str = "ۤۢ۠";
                        m9 = C0004.m49(str);
                    } else {
                        m9 = (C0000.f4 * C0002.f6) + 1384978;
                    }
                case 1753414:
                    this.context = context;
                    m9 = C0004.m49(C0003.f10 >= 0 ? "ۥۣۤ" : "۟ۦۥ");
                case 1753420:
                    InitButton();
                    if (C0002.f6 <= 0) {
                        C0002.m15();
                        str2 = "ۢۨۨ";
                    } else {
                        str2 = "ۥۣۤ";
                    }
                    m9 = C0002.m14(str2);
                case 1755588:
                    m9 = (C0000.f4 * C0002.f6) + 1384978;
            }
            return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000f. Please report as an issue. */
    private Button CreateButton(int i) {
        String str;
        String str2;
        String str3;
        Button button = null;
        LinearLayout.LayoutParams layoutParams = null;
        int m9 = C0001.m9("ۤۥۧ");
        while (true) {
            switch (m9) {
                case 56319:
                    button.setLayoutParams(layoutParams);
                    str = C0003.f10 >= 0 ? "ۣۨۡ" : "ۣ۟ۧ";
                    m9 = C0004.m49(str);
                case 56478:
                    button.setTypeface(null, 1);
                    if (C0000.m7() <= 0) {
                        C0000.f4 = 86;
                        str3 = "ۦۤۦ";
                        m9 = C0004.m49(str3);
                    } else {
                        str2 = "ۧ۟ۧ";
                        m9 = C0004.m49(str2);
                    }
                case 56542:
                    button.setGravity(17);
                    if (C0004.m46() <= 0) {
                        str2 = "ۧ۟ۧ";
                        m9 = C0004.m49(str2);
                    } else {
                        m9 = (C0000.f4 % C0001.f5) + 1755364;
                    }
                case 1747654:
                    Button button2 = new Button(this.context);
                    m9 = 56541 + (C0000.f4 / C0002.f6);
                    button = button2;
                case 1747747:
                    if (C0003.f10 >= 0) {
                        C0000.f4 = 17;
                        m9 = C0004.m49("ۨۦ");
                    } else {
                        m9 = (C0000.f4 % C0003.f10) + 1751670;
                    }
                case 1748866:
                    layoutParams.gravity = 17;
                    str2 = "ۤ۟ۨ";
                    m9 = C0004.m49(str2);
                case 1750539:
                    button.setTextColor(i);
                    m9 = C0003.f10 + C0003.f10 + 56610;
                case 1750812:
                    break;
                case 1751501:
                    layoutParams.setMargins(40, 2, 40, 2);
                    if (C0000.f4 * C0000.f4 * (-5816) <= 0) {
                        C0004.f11 = 56;
                        m9 = C0000.m4("۠ۢۥ");
                    } else {
                        m9 = (C0003.f10 / C0002.f6) + 1747654;
                    }
                case 1751686:
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2, 1.0f);
                    if (C0004.f11 + C0001.f5 + 4299 <= 0) {
                        C0000.f4 = 94;
                        m9 = C0002.m14("۠۟");
                        layoutParams = layoutParams2;
                    } else {
                        m9 = 1748932 + (C0003.f10 % C0001.f5);
                        layoutParams = layoutParams2;
                    }
                case 1753576:
                    button.setOnClickListener(new View.OnClickListener(this) { // from class: com.xy.xyverify.Dialog.MIUIDialog$$ExternalSyntheticLambda0
                        public final MIUIDialog f$0;

                        /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000b. Please report as an issue. */
                        /* JADX WARN: Removed duplicated region for block: B:33:0x0071 A[SYNTHETIC] */
                        /* JADX WARN: Removed duplicated region for block: B:36:0x0067 A[SYNTHETIC] */
                        {
                            /*
                                r4 = this;
                                r4.<init>()
                                r2 = 0
                                java.lang.String r0 = "ۨۨۨ"
                                int r0 = com.xy.xyverify.Verify.C0004.m49(r0)
                            Lb:
                                switch(r0) {
                                    case 1747684: goto Lf;
                                    case 1750533: goto L96;
                                    case 1751495: goto L40;
                                    case 1753547: goto L5e;
                                    case 1754596: goto Lbc;
                                    case 1754655: goto L85;
                                    case 1755624: goto L27;
                                    default: goto Le;
                                }
                            Le:
                                goto Lb
                            Lf:
                                java.io.PrintStream r0 = java.lang.System.out
                                r0.println(r2)
                                int r0 = com.xy.xyverify.Verify.C0003.f10
                                int r1 = com.xy.xyverify.Verify.C0003.f10
                                r1 = r1 | 6479(0x194f, float:9.079E-42)
                                r0 = r0 | r1
                                if (r0 < 0) goto L7b
                                com.xy.xyverify.Dialog.C0001.m8()
                                java.lang.String r0 = "ۧۨ۠"
                            L22:
                                int r0 = com.xy.xyverify.Dialog.C0002.m14(r0)
                                goto Lb
                            L27:
                                r4.f$0 = r5
                                int r0 = com.xy.xyverify.Verify.C0004.f11
                                int r1 = com.xy.xyverify.Dialog.C0000.f4
                                int r1 = r1 + (-3387)
                                int r0 = r0 / r1
                                if (r0 == 0) goto L3d
                                r0 = 28
                                com.xy.xyverify.Dialog.C0000.f4 = r0
                                java.lang.String r0 = "ۨۨۨ"
                                int r0 = com.xy.xyverify.Dialog.C0002.m14(r0)
                                goto Lb
                            L3d:
                                java.lang.String r0 = "ۧۨ۠"
                                goto L22
                            L40:
                                int r0 = com.xy.xyverify.Verify.C0003.f10
                                int r1 = com.xy.xyverify.Dialog.C0001.f5
                                int r1 = r1 + (-6928)
                                int r0 = r0 % r1
                                if (r0 < 0) goto L54
                                r0 = 62
                                com.xy.xyverify.Verify.C0003.f10 = r0
                                java.lang.String r0 = "ۨ۠۟"
                                int r0 = com.xy.xyverify.Dialog.C0002.m14(r0)
                                goto Lb
                            L54:
                                int r0 = com.xy.xyverify.Dialog.C0000.f4
                                int r1 = com.xy.xyverify.Dialog.C0002.f6
                                int r0 = r0 / r1
                                r1 = 1755625(0x1ac9e9, float:2.460155E-39)
                                r0 = r0 ^ r1
                                goto Lb
                            L5e:
                                int r0 = com.xy.xyverify.Verify.C0004.f11
                                int r1 = com.xy.xyverify.Dialog.C0001.f5
                                int r1 = r1 % (-832)
                                int r0 = r0 * r1
                                if (r0 < 0) goto L71
                                com.xy.xyverify.Verify.C0003.m42()
                                java.lang.String r0 = "ۢۥۦ"
                                int r0 = com.xy.xyverify.Dialog.C0002.m14(r0)
                                goto Lb
                            L71:
                                int r0 = com.xy.xyverify.Verify.C0003.f10
                                int r1 = com.xy.xyverify.Dialog.C0000.f4
                                int r0 = r0 * r1
                                r1 = 1803568(0x1b8530, float:2.527337E-39)
                                int r0 = r0 + r1
                                goto Lb
                            L7b:
                                int r0 = com.xy.xyverify.Dialog.C0002.f6
                                int r1 = com.xy.xyverify.Verify.C0004.f11
                                int r0 = r0 / r1
                                r1 = 1754596(0x1ac5e4, float:2.458713E-39)
                                int r0 = r0 + r1
                                goto Lb
                            L85:
                                int r0 = com.xy.xyverify.Dialog.C0001.m8()
                                if (r0 > 0) goto L5e
                                int r0 = com.xy.xyverify.Dialog.C0001.f5
                                int r1 = com.xy.xyverify.Dialog.C0002.f6
                                int r0 = r0 / r1
                                r1 = 1750533(0x1ab605, float:2.453019E-39)
                                int r0 = r0 + r1
                                goto Lb
                            L96:
                                java.lang.String r0 = "4b5GCVVgLhWIZH7ULZ7"
                                java.lang.String r0 = com.xy.xyverify.Dialog.C0002.m12(r0)
                                double r2 = java.lang.Double.parseDouble(r0)
                                int r0 = com.xy.xyverify.Dialog.C0002.f6
                                int r1 = com.xy.xyverify.Verify.C0004.f11
                                int r1 = r1 * 2425
                                int r0 = r0 / r1
                                if (r0 == 0) goto Lb1
                                java.lang.String r0 = "ۤ۟ۢ"
                                int r0 = com.xy.xyverify.Verify.C0004.m49(r0)
                                goto Lb
                            Lb1:
                                int r0 = com.xy.xyverify.Dialog.C0000.f4
                                int r1 = com.xy.xyverify.Verify.C0004.f11
                                int r0 = r0 / r1
                                r1 = 1747685(0x1aaae5, float:2.449028E-39)
                                int r0 = r0 + r1
                                goto Lb
                            Lbc:
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.xy.xyverify.Dialog.MIUIDialog$$ExternalSyntheticLambda0.<init>(com.xy.xyverify.Dialog.MIUIDialog):void");
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
                                java.lang.String r0 = "ۧۢۡ"
                                int r0 = com.xy.xyverify.Dialog.C0001.m9(r0)
                            L6:
                                switch(r0) {
                                    case 1750813: goto La;
                                    case 1752616: goto L1d;
                                    case 1754470: goto Lb;
                                    default: goto L9;
                                }
                            L9:
                                goto L6
                            La:
                                return
                            Lb:
                                com.xy.xyverify.Dialog.MIUIDialog r0 = r2.f$0
                                r0.m3lambda$CreateButton$0$comxyxyverifyDialogMIUIDialog(r3)
                                int r0 = com.xy.xyverify.Verify.C0004.m46()
                                if (r0 > 0) goto L16
                            L16:
                                java.lang.String r0 = "ۣۨۢ"
                                int r0 = com.xy.xyverify.Verify.C0003.m44(r0)
                                goto L6
                            L1d:
                                int r0 = com.xy.xyverify.Dialog.C0001.m8()
                                if (r0 > 0) goto L2d
                                r0 = 1
                                com.xy.xyverify.Dialog.C0002.f6 = r0
                                java.lang.String r0 = "ۣۡ"
                                int r0 = com.xy.xyverify.Verify.C0004.m49(r0)
                                goto L6
                            L2d:
                                int r0 = com.xy.xyverify.Verify.C0004.f11
                                int r1 = com.xy.xyverify.Verify.C0004.f11
                                int r0 = r0 - r1
                                r1 = 1754470(0x1ac566, float:2.458536E-39)
                                r0 = r0 ^ r1
                                goto L6
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.xy.xyverify.Dialog.MIUIDialog$$ExternalSyntheticLambda0.onClick(android.view.View):void");
                        }
                    });
                    str = "ۣۨۡ";
                    m9 = C0004.m49(str);
                case 1754383:
                    button.setVisibility(8);
                    if ((C0002.f6 ^ (C0003.f10 * 6251)) >= 0) {
                        C0000.m7();
                        m9 = C0001.m9("ۤ۟ۨ");
                    } else {
                        str3 = "ۦۤۦ";
                        m9 = C0004.m49(str3);
                    }
                case 1755622:
                    button.setMinimumHeight(DialogUtils.dpToPx(50, this.context));
                    str3 = "۠۟";
                    m9 = C0004.m49(str3);
            }
            return button;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0009. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void InitBackGround() {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xy.xyverify.Dialog.MIUIDialog.InitBackGround():void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0012. Please report as an issue. */
    private void InitButton() {
        String str;
        String str2;
        String str3;
        String str4;
        LinearLayout.LayoutParams layoutParams;
        int m4 = C0000.m4("ۦۧۢ");
        Button button = null;
        LinearLayout linearLayout = null;
        Button button2 = null;
        GradientDrawable gradientDrawable = null;
        GradientDrawable gradientDrawable2 = null;
        LinearLayout.LayoutParams layoutParams2 = null;
        while (true) {
            switch (m4) {
                case 56447:
                    RefreshButton();
                    m4 = C0001.f5 <= 0 ? C0003.m44("ۤ۠ۧ") : (C0003.f10 % C0001.f5) + 1754660;
                case 56508:
                    button2.setBackground(gradientDrawable);
                    if (C0001.f5 <= 0) {
                        C0003.f10 = 65;
                        m4 = C0004.m49("ۤۢۧ");
                    } else {
                        m4 = C0000.m4("ۣۤ");
                    }
                case 56576:
                    layoutParams2.gravity = 17;
                    if (C0004.f11 >= 0) {
                        C0002.m15();
                        m4 = C0000.m4("ۥ۟۟");
                    } else {
                        m4 = (C0004.f11 ^ C0001.f5) + 1751424;
                    }
                case 1746723:
                    this.ButtonLayout = linearLayout;
                    if (C0000.m7() <= 0) {
                        C0001.m8();
                        m4 = C0003.m44("ۥۣۨ");
                    } else {
                        m4 = (C0000.f4 * C0004.f11) ^ (-1239773);
                    }
                case 1746913:
                    Button CreateButton = CreateButton(-1);
                    m4 = (C0000.f4 - C0000.f4) + 1752453;
                    button = CreateButton;
                case 1747837:
                    this.MainView.addView(this.ButtonLayout);
                    if (C0004.m46() <= 0) {
                        C0000.m7();
                        m4 = C0001.m9("ۣۤ");
                    } else {
                        m4 = C0004.m49("ۣۡ۠");
                    }
                case 1747839:
                    layoutParams2.setMargins(0, 0, 0, DialogUtils.dpToPx(25, this.context));
                    if (C0002.f6 + (C0003.f10 | (-6295)) <= 0) {
                        C0001.m8();
                        m4 = C0003.m44("ۦۧۢ");
                    } else {
                        m4 = (C0003.f10 - C0003.f10) ^ 1752673;
                    }
                case 1747865:
                    this.ButtonLayout.setOrientation(0);
                    if (C0000.m7() <= 0) {
                        C0002.m15();
                        str4 = "ۦۢ";
                        layoutParams = layoutParams2;
                        m4 = C0003.m44(str4);
                        layoutParams2 = layoutParams;
                    } else {
                        m4 = C0004.f11 + C0002.f6 + 1751760;
                    }
                case 1748615:
                    button.setBackground(gradientDrawable2);
                    if (C0003.f10 >= 0) {
                        C0001.m8();
                    }
                    m4 = C0000.m4("ۧۢ۟");
                case 1750538:
                    this.ButtonLayout.addView(this.OkButton);
                    m4 = C0000.m4("۠ۥۢ");
                case 1750594:
                    break;
                case 1750601:
                    this.ButtonLayout.setGravity(17);
                    m4 = C0002.f6 - (C0003.f10 % 3518) <= 0 ? C0001.m9("ۣ۟ۦ") : (C0002.f6 / C0004.f11) + 1747839;
                case 1751525:
                    gradientDrawable2 = DialogUtils.GetRadiusDrawable(100.0f, Color.parseColor(C0003.m45(f2short, 0, 7, 1677)));
                    m4 = C0004.m49("ۤۢۧ");
                case 1751531:
                    layoutParams = new LinearLayout.LayoutParams(-1, -2);
                    str4 = "ۨۨ";
                    m4 = C0003.m44(str4);
                    layoutParams2 = layoutParams;
                case 1751593:
                    gradientDrawable = DialogUtils.GetRadiusDrawable(100.0f, Color.parseColor(C0000.m5(f2short, 7, 7, 2031)));
                    str2 = "۟ۦۨ";
                    m4 = C0004.m49(str2);
                case 1751748:
                    button2 = CreateButton(Color.parseColor(C0002.m13(f2short, 16, 7, 2195)));
                    str2 = "ۧۨۥ";
                    m4 = C0004.m49(str2);
                case 1752453:
                    this.OkButton = button;
                    if (C0004.f11 >= 0) {
                        C0000.f4 = 45;
                        m4 = C0000.m4("۠ۥۢ");
                    } else {
                        m4 = (C0000.f4 / C0003.f10) + 1748626;
                    }
                case 1752586:
                    this.OkButton.setVisibility(0);
                    if ((C0001.f5 ^ (C0001.f5 / 4480)) <= 0) {
                        C0003.f10 = 84;
                        str3 = "۟۠ۤ";
                        m4 = C0002.m14(str3);
                    } else {
                        m4 = C0000.m4("ۤۧۧ");
                    }
                case 1752673:
                    this.ButtonLayout.setLayoutParams(layoutParams2);
                    if (C0003.f10 / (C0003.f10 | 387) <= 0) {
                        C0003.m42();
                        m4 = C0004.m49("ۣۡ۠");
                    } else {
                        m4 = C0000.m4("ۤ۠ۡ");
                    }
                case 1753665:
                    linearLayout = new LinearLayout(this.context);
                    if (C0001.f5 <= 0) {
                        C0004.f11 = 92;
                        m4 = C0003.m44("۠ۥۤ");
                    } else {
                        str2 = "۟۠ۤ";
                        m4 = C0004.m49(str2);
                    }
                case 1754375:
                    if ((C0004.f11 ^ (C0000.f4 | 9506)) >= 0) {
                        C0004.m46();
                        str = "۟ۢۡ";
                    } else {
                        str = "ۦۧۢ";
                    }
                    m4 = C0004.m49(str);
                case 1754445:
                    linearLayout.setWeightSum(2.0f);
                    if (C0003.m42() <= 0) {
                        C0000.m7();
                        m4 = C0002.m14("ۤ۠ۡ");
                    } else {
                        str2 = "۠ۦ۟";
                        m4 = C0004.m49(str2);
                    }
                case 1754468:
                    this.OkButton.setText(C0000.m5(f2short, 14, 2, 469));
                    if (C0001.f5 - (C0001.f5 | 7364) >= 0) {
                        str2 = "۠ۦ۟";
                        m4 = C0004.m49(str2);
                    } else {
                        m4 = (C0000.f4 * C0001.f5) + 1393458;
                    }
                case 1754594:
                    this.ButtonLayout.addView(this.CancelButton);
                    if (C0000.f4 - (C0001.f5 % 5381) <= 0) {
                        C0000.f4 = 91;
                        m4 = C0004.m49("ۤۧۧ");
                    } else {
                        str3 = "ۣ۟ۦ";
                        m4 = C0002.m14(str3);
                    }
                case 1754660:
                    this.CancelButton = button2;
                    if (C0003.f10 >= 0) {
                        C0000.f4 = 31;
                        m4 = C0001.m9("ۧ۟۟");
                    } else {
                        str4 = "ۦۢ";
                        layoutParams = layoutParams2;
                        m4 = C0003.m44(str4);
                        layoutParams2 = layoutParams;
                    }
            }
            return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000f. Please report as an issue. */
    private void InitChildView() {
        String str;
        LinearLayout.LayoutParams layoutParams;
        TextView textView;
        String str2;
        LinearLayout.LayoutParams layoutParams2;
        LinearLayout.LayoutParams layoutParams3;
        String str3;
        String str4;
        LinearLayout linearLayout;
        LinearLayout linearLayout2 = null;
        LinearLayout.LayoutParams layoutParams4 = null;
        TextView textView2 = null;
        LinearLayout.LayoutParams layoutParams5 = null;
        LinearLayout.LayoutParams layoutParams6 = null;
        int m14 = C0002.m14("۠۠۟");
        LinearLayout.LayoutParams layoutParams7 = null;
        TextView textView3 = null;
        while (true) {
            switch (m14) {
                case 56320:
                    this.TitleView.setTextSize(20.0f);
                    layoutParams7 = new LinearLayout.LayoutParams(-1, -2);
                    m14 = (C0004.f11 * C0002.f6) + 2109622;
                case 56416:
                    textView2.setGravity(17);
                    this.TitleView.setTypeface(null, 1);
                    if (C0000.f4 > 0) {
                        str3 = "۠۠";
                        layoutParams3 = layoutParams4;
                        layoutParams4 = layoutParams3;
                        m14 = C0004.m49(str3);
                    } else {
                        str = "ۦۤۤ";
                        layoutParams = layoutParams6;
                        textView = textView2;
                        m14 = C0000.m4(str);
                        layoutParams6 = layoutParams;
                        textView2 = textView;
                    }
                case 1746816:
                    this.MainView.addView(this.ContentLayout);
                    if (C0001.m8() <= 0) {
                        m14 = C0004.m49("۠۟ۢ");
                    } else {
                        str4 = "ۣۡۡ";
                        linearLayout = linearLayout2;
                        linearLayout2 = linearLayout;
                        m14 = C0001.m9(str4);
                    }
                case 1746849:
                    this.InputEdit = new EditText(this.context);
                    layoutParams = new LinearLayout.LayoutParams(-1, -2);
                    if (C0002.m15() <= 0) {
                        C0004.m46();
                        layoutParams6 = layoutParams;
                        m14 = C0003.m44("ۢ۠ۨ");
                    } else {
                        str = "۠۟ۢ";
                        textView = textView2;
                        m14 = C0000.m4(str);
                        layoutParams6 = layoutParams;
                        textView2 = textView;
                    }
                case 1746968:
                    this.MainView.addView(this.TitleView);
                    this.MainView.addView(this.MessageView);
                    str = "ۣ۟ۤ";
                    layoutParams = layoutParams6;
                    textView = textView2;
                    m14 = C0000.m4(str);
                    layoutParams6 = layoutParams;
                    textView2 = textView;
                case 1747651:
                    layoutParams6.gravity = 17;
                    layoutParams6.setMargins(DialogUtils.dpToPx(20, this.context), DialogUtils.dpToPx(20, this.context), DialogUtils.dpToPx(20, this.context), DialogUtils.dpToPx(20, this.context));
                    if (C0003.m42() <= 0) {
                        C0004.m46();
                    }
                    m14 = C0004.m49("ۦ۟ۨ");
                case 1747679:
                    linearLayout = new LinearLayout(this.context);
                    this.ContentLayout = linearLayout;
                    if (C0002.m15() <= 0) {
                        str4 = "ۣ۟ۤ";
                        linearLayout2 = linearLayout;
                        m14 = C0001.m9(str4);
                    } else {
                        linearLayout2 = linearLayout;
                        m14 = C0000.f4 + C0004.f11 + 1752591;
                    }
                case 1747780:
                    m14 = (C0000.f4 | C0004.f11) + 1747696;
                case 1749610:
                    this.MessageView = textView3;
                    textView3.setGravity(17);
                    if (C0001.m8() <= 0) {
                        m14 = C0001.m9("ۦ۠ۦ");
                    } else {
                        str4 = "ۨۤ۠";
                        linearLayout = linearLayout2;
                        linearLayout2 = linearLayout;
                        m14 = C0001.m9(str4);
                    }
                case 1750595:
                    break;
                case 1750779:
                    layoutParams5.setMargins(0, 0, 0, 30);
                    this.MessageView.setTextColor(Color.parseColor(C0003.m45(f2short, 23, 7, 2667)));
                    str = "ۦۤۤ";
                    layoutParams = layoutParams6;
                    textView = textView2;
                    m14 = C0000.m4(str);
                    layoutParams6 = layoutParams;
                    textView2 = textView;
                case 1752460:
                    layoutParams7.setMargins(0, 70, 0, 30);
                    layoutParams7.gravity = 17;
                    if (C0001.f5 + (C0001.f5 | (-3164)) >= 0) {
                        C0002.f6 = 17;
                        str2 = "ۣۣ";
                        layoutParams2 = layoutParams5;
                    } else {
                        str2 = "ۦۣۤ";
                        layoutParams2 = layoutParams5;
                    }
                    layoutParams5 = layoutParams2;
                    m14 = C0004.m49(str2);
                case 1752610:
                    linearLayout2.setOrientation(1);
                    layoutParams3 = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                    if (C0000.f4 <= 0) {
                        C0001.m8();
                        str3 = "ۣۧ۟";
                        layoutParams4 = layoutParams3;
                        m14 = C0004.m49(str3);
                    } else {
                        layoutParams4 = layoutParams3;
                        m14 = (C0004.f11 / C0001.f5) + 1752644;
                    }
                case 1752643:
                    layoutParams4.gravity = 17;
                    this.ContentLayout.setLayoutParams(layoutParams4);
                    str = "ۦ۠ۦ";
                    layoutParams = layoutParams6;
                    textView = textView2;
                    m14 = C0000.m4(str);
                    layoutParams6 = layoutParams;
                    textView2 = textView;
                case 1753423:
                    this.InputEdit.setLayoutParams(layoutParams6);
                    this.InputEdit.setGravity(17);
                    if ((C0001.f5 ^ (C0002.f6 % 162)) <= 0) {
                        C0004.m46();
                        m14 = C0003.m44("۠۠۟");
                    } else {
                        m14 = C0002.f6 + C0001.f5 + 1754607;
                    }
                case 1753452:
                    textView = new TextView(this.context);
                    this.TitleView = textView;
                    str = "ۣۣ";
                    layoutParams = layoutParams6;
                    m14 = C0000.m4(str);
                    layoutParams6 = layoutParams;
                    textView2 = textView;
                case 1753573:
                    this.TitleView.setLayoutParams(layoutParams7);
                    textView3 = new TextView(this.context);
                    m14 = C0000.f4 + C0000.f4 + 1748126;
                case 1753574:
                    this.MessageView.setTextSize(DialogUtils.dpToPx(6, this.context));
                    this.MessageView.setLayoutParams(layoutParams5);
                    if (C0001.f5 <= 0) {
                        C0001.f5 = 78;
                        m14 = C0003.m44("ۣۡۡ");
                    } else {
                        m14 = (C0000.f4 | C0002.f6) + 1745843;
                    }
                case 1755492:
                    layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                    layoutParams2.gravity = 17;
                    if (C0003.m42() <= 0) {
                        C0003.m42();
                        layoutParams5 = layoutParams2;
                        m14 = C0003.m44("۠۠");
                    } else {
                        str2 = "ۣۧ۟";
                        layoutParams5 = layoutParams2;
                        m14 = C0004.m49(str2);
                    }
                case 1755585:
                    this.InputEdit.setBackground(DialogUtils.GetCustomBorder(Color.parseColor(C0004.m48(f2short, 30, 7, 1479)), Color.parseColor(C0003.m45(f2short, 37, 7, 1032)), 4, 4, 4, 4, new float[]{30.0f, 30.0f, 30.0f, 30.0f, 30.0f, 30.0f, 30.0f, 30.0f}));
                    str2 = "۟ۨۡ";
                    layoutParams2 = layoutParams5;
                    layoutParams5 = layoutParams2;
                    m14 = C0004.m49(str2);
            }
            return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000a. Please report as an issue. */
    private void InitMainView() {
        LinearLayout.LayoutParams layoutParams;
        String str;
        String str2;
        LinearLayout.LayoutParams layoutParams2 = null;
        int m44 = C0003.m44("ۣۥۣ");
        while (true) {
            switch (m44) {
                case 1746752:
                    this.MainView.setBackgroundColor(-1);
                    if ((C0003.f10 ^ (C0002.f6 / 3850)) >= 0) {
                        str = "ۢۡۧ";
                        layoutParams = layoutParams2;
                        m44 = C0001.m9(str);
                        layoutParams2 = layoutParams;
                    } else {
                        str2 = "ۣۨۢ";
                        m44 = C0001.m9(str2);
                    }
                case 1747905:
                    setContentView(this.MainView);
                    m44 = C0001.m9((C0001.f5 ^ (C0002.f6 | 7777)) <= 0 ? "ۣۥۣ" : "ۢۡۧ");
                case 1748891:
                    this.MainView.setBackground(DialogUtils.GetRadiusDrawable(new float[]{50.0f, 50.0f, 50.0f, 50.0f, 0.0f, 0.0f, 0.0f, 0.0f}, -1));
                    if (C0003.m42() <= 0) {
                        C0004.m46();
                        str2 = "ۡۨۢ";
                        m44 = C0001.m9(str2);
                    } else {
                        m44 = (C0001.f5 + C0003.f10) ^ 1747555;
                    }
                case 1749640:
                    break;
                case 1750536:
                    this.MainView.setOrientation(1);
                    if ((C0000.f4 | (C0003.f10 + 5161)) <= 0) {
                    }
                    m44 = C0004.m49("۟ۡۢ");
                case 1750721:
                    this.MainView = new LinearLayout(this.context);
                    m44 = C0000.m4(C0004.f11 >= 0 ? "ۣۨۢ" : "ۦۢۥ");
                case 1751780:
                    m44 = C0002.m15() <= 0 ? C0004.m49("ۣۨۦ") : C0004.f11 + C0004.f11 + 1752167;
                case 1753513:
                    layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    if (C0001.f5 <= 0) {
                        C0003.f10 = 47;
                        m44 = C0002.m14("ۣ۟ۤ");
                        layoutParams2 = layoutParams;
                    } else {
                        str = "ۣ۟ۤ";
                        m44 = C0001.m9(str);
                        layoutParams2 = layoutParams;
                    }
                case 1755433:
                    this.MainView.setLayoutParams(layoutParams2);
                    if (C0000.f4 % (C0004.f11 % (-8245)) <= 0) {
                        C0002.f6 = 19;
                        m44 = C0000.m4("ۤۨۨ");
                    } else {
                        str2 = "ۡۨۢ";
                        m44 = C0001.m9(str2);
                    }
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void MakeShow(final android.content.Context r2, final java.lang.String r3, final java.lang.String r4) {
        /*
            java.lang.String r0 = "ۥۣۢ"
            int r0 = com.xy.xyverify.Verify.C0004.m49(r0)
        L6:
            switch(r0) {
                case 1746908: goto La;
                case 1752580: goto L29;
                case 1753477: goto Lb;
                default: goto L9;
            }
        L9:
            goto L6
        La:
            return
        Lb:
            int r0 = com.xy.xyverify.Dialog.C0001.f5
            int r1 = com.xy.xyverify.Verify.C0004.f11
            int r1 = r1 + (-5049)
            int r0 = r0 / r1
            if (r0 == 0) goto L1f
            r0 = 80
            com.xy.xyverify.Verify.C0004.f11 = r0
            java.lang.String r0 = "ۨ۟ۦ"
            int r0 = com.xy.xyverify.Dialog.C0001.m9(r0)
            goto L6
        L1f:
            int r0 = com.xy.xyverify.Verify.C0003.f10
            int r1 = com.xy.xyverify.Dialog.C0002.f6
            int r0 = r0 * r1
            r1 = 1785184(0x1b3d60, float:2.501576E-39)
            int r0 = r0 + r1
            goto L6
        L29:
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            com.xy.xyverify.Dialog.MIUIDialog$$ExternalSyntheticLambda1 r1 = new com.xy.xyverify.Dialog.MIUIDialog$$ExternalSyntheticLambda1
            r1.<init>(r2, r3, r4)
            r0.post(r1)
            int r0 = com.xy.xyverify.Dialog.C0000.m7()
            if (r0 > 0) goto L4a
            com.xy.xyverify.Verify.C0004.m46()
            java.lang.String r0 = "ۦۡ۠"
            int r0 = com.xy.xyverify.Dialog.C0000.m4(r0)
            goto L6
        L4a:
            int r0 = com.xy.xyverify.Verify.C0004.f11
            int r1 = com.xy.xyverify.Dialog.C0001.f5
            int r0 = r0 % r1
            r1 = 1747147(0x1aa8cb, float:2.448274E-39)
            int r0 = r0 + r1
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xy.xyverify.Dialog.MIUIDialog.MakeShow(android.content.Context, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0098 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void RefreshButton() {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xy.xyverify.Dialog.MIUIDialog.RefreshButton():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002c, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ void access$001(com.xy.xyverify.Dialog.MIUIDialog r2) {
        /*
            java.lang.String r0 = "ۡۤۡ"
            int r0 = com.xy.xyverify.Verify.C0004.m49(r0)
        L6:
            switch(r0) {
                case 56481: goto La;
                case 1746784: goto L2c;
                case 1748766: goto L14;
                default: goto L9;
            }
        L9:
            goto L6
        La:
            int r0 = com.xy.xyverify.Dialog.C0002.f6
            int r1 = com.xy.xyverify.Dialog.C0001.f5
            int r0 = r0 / r1
            r1 = 1748765(0x1aaf1d, float:2.450542E-39)
            int r0 = r0 + r1
            goto L6
        L14:
            super.cancel()
            int r0 = com.xy.xyverify.Verify.C0004.f11
            if (r0 < 0) goto L22
            java.lang.String r0 = "ۡۤۡ"
            int r0 = com.xy.xyverify.Verify.C0003.m44(r0)
            goto L6
        L22:
            int r0 = com.xy.xyverify.Dialog.C0000.f4
            int r1 = com.xy.xyverify.Dialog.C0001.f5
            int r0 = r0 + r1
            r1 = 1745834(0x1aa3aa, float:2.446435E-39)
            r0 = r0 ^ r1
            goto L6
        L2c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xy.xyverify.Dialog.MIUIDialog.access$001(com.xy.xyverify.Dialog.MIUIDialog):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0038 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0031 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void lambda$MakeShow$1(android.content.Context r3, java.lang.String r4, java.lang.String r5) {
        /*
            r0 = 0
            java.lang.String r1 = "ۥۦۨ"
            int r2 = com.xy.xyverify.Dialog.C0000.m4(r1)
            r1 = r0
        L8:
            switch(r2) {
                case 1749851: goto Lc;
                case 1751594: goto L1e;
                case 1752581: goto Ld;
                case 1752613: goto L40;
                case 1752679: goto L54;
                case 1753515: goto L67;
                case 1753632: goto L2b;
                default: goto Lb;
            }
        Lb:
            goto L8
        Lc:
            return
        Ld:
            int r0 = com.xy.xyverify.Dialog.C0000.m7()
            if (r0 > 0) goto L2b
            int r0 = com.xy.xyverify.Dialog.C0002.f6
            int r2 = com.xy.xyverify.Verify.C0003.f10
            int r0 = r0 * r2
            r2 = -1752817(0xffffffffffe5410f, float:NaN)
            r0 = r0 ^ r2
            r2 = r0
            goto L8
        L1e:
            java.io.PrintStream r0 = java.lang.System.out
            r0.println(r1)
            java.lang.String r0 = "ۢۨۡ"
        L25:
            int r0 = com.xy.xyverify.Verify.C0004.m49(r0)
            r2 = r0
            goto L8
        L2b:
            int r0 = com.xy.xyverify.Dialog.C0002.m15()
            if (r0 > 0) goto L38
            r0 = 17
            com.xy.xyverify.Verify.C0004.f11 = r0
            java.lang.String r0 = "۟۠ۥ"
            goto L25
        L38:
            java.lang.String r0 = "ۢۨۡ"
            int r0 = com.xy.xyverify.Verify.C0004.m49(r0)
            r2 = r0
            goto L8
        L40:
            int r0 = com.xy.xyverify.Verify.C0003.f10
            int r2 = com.xy.xyverify.Verify.C0003.f10
            int r2 = r2 + 1315
            int r0 = r0 * r2
            if (r0 < 0) goto L51
            java.lang.String r0 = "۠ۤۢ"
        L4b:
            int r0 = com.xy.xyverify.Dialog.C0000.m4(r0)
            r2 = r0
            goto L8
        L51:
            java.lang.String r0 = "ۥۦۨ"
            goto L4b
        L54:
            com.xy.xyverify.Dialog.MIUIDialog r0 = new com.xy.xyverify.Dialog.MIUIDialog
            r0.<init>(r3)
            com.xy.xyverify.Dialog.MIUIDialog r0 = r0.setTitle(r4)
            com.xy.xyverify.Dialog.MIUIDialog r0 = r0.setMessage(r5)
            r0.show()
            java.lang.String r0 = "ۥۣۣ"
            goto L25
        L67:
            java.lang.String r0 = "c951s6nU6pT8SFt"
            java.lang.String r0 = com.xy.xyverify.Dialog.C0000.m6(r0)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            int r1 = com.xy.xyverify.Dialog.C0001.f5
            if (r1 > 0) goto L78
            com.xy.xyverify.Verify.C0003.m42()
        L78:
            java.lang.String r1 = "ۤۢۨ"
            int r2 = com.xy.xyverify.Dialog.C0000.m4(r1)
            r1 = r0
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xy.xyverify.Dialog.MIUIDialog.lambda$MakeShow$1(android.content.Context, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0009. Please report as an issue. */
    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        String str;
        String str2;
        TranslateAnimation translateAnimation = null;
        int m14 = C0002.m14("ۨ۠۟");
        while (true) {
            switch (m14) {
                case 1746725:
                    translateAnimation.setAnimationListener(new Animation.AnimationListener(this) { // from class: com.xy.xyverify.Dialog.MIUIDialog.1
                        final MIUIDialog this$0;

                        /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000c. Please report as an issue. */
                        /* JADX WARN: Removed duplicated region for block: B:17:0x0033 A[SYNTHETIC] */
                        /* JADX WARN: Removed duplicated region for block: B:20:0x0029 A[SYNTHETIC] */
                        {
                            /*
                                r3 = this;
                                r3.this$0 = r4
                                r3.<init>()
                                r0 = 0
                                java.lang.String r1 = "ۥ۠ۥ"
                                int r1 = com.xy.xyverify.Dialog.C0002.m14(r1)
                            Lc:
                                switch(r1) {
                                    case 56319: goto L10;
                                    case 1750818: goto L4a;
                                    case 1752490: goto L41;
                                    case 1752641: goto L20;
                                    case 1753507: goto L76;
                                    case 1754531: goto L6d;
                                    default: goto Lf;
                                }
                            Lf:
                                goto Lc
                            L10:
                                int r1 = com.xy.xyverify.Dialog.C0001.f5
                                int r2 = com.xy.xyverify.Verify.C0003.f10
                                int r2 = r2 / (-6109)
                                r1 = r1 ^ r2
                                if (r1 > 0) goto L3a
                                java.lang.String r1 = "۠۟ۢ"
                            L1b:
                                int r1 = com.xy.xyverify.Dialog.C0002.m14(r1)
                                goto Lc
                            L20:
                                int r1 = com.xy.xyverify.Dialog.C0001.f5
                                int r2 = com.xy.xyverify.Verify.C0003.f10
                                int r2 = r2 / 3203
                                r1 = r1 ^ r2
                                if (r1 > 0) goto L33
                                com.xy.xyverify.Verify.C0004.m46()
                                java.lang.String r1 = "ۣۤۨ"
                                int r1 = com.xy.xyverify.Verify.C0004.m49(r1)
                                goto Lc
                            L33:
                                java.lang.String r1 = "ۦۢ۟"
                                int r1 = com.xy.xyverify.Dialog.C0001.m9(r1)
                                goto Lc
                            L3a:
                                java.lang.String r1 = "ۥ۠ۥ"
                                int r1 = com.xy.xyverify.Verify.C0003.m44(r1)
                                goto Lc
                            L41:
                                int r1 = com.xy.xyverify.Dialog.C0000.m7()
                                if (r1 > 0) goto L20
                                java.lang.String r1 = "ۧۤ۠"
                                goto L1b
                            L4a:
                                java.io.PrintStream r1 = java.lang.System.out
                                r1.println(r0)
                                int r1 = com.xy.xyverify.Verify.C0004.f11
                                int r2 = com.xy.xyverify.Verify.C0003.f10
                                r2 = r2 ^ 7869(0x1ebd, float:1.1027E-41)
                                int r1 = r1 / r2
                                if (r1 == 0) goto L63
                                r1 = 90
                                com.xy.xyverify.Verify.C0003.f10 = r1
                                java.lang.String r1 = "ۥ۠ۥ"
                                int r1 = com.xy.xyverify.Dialog.C0002.m14(r1)
                                goto Lc
                            L63:
                                int r1 = com.xy.xyverify.Dialog.C0002.f6
                                int r2 = com.xy.xyverify.Dialog.C0001.f5
                                r1 = r1 | r2
                                r2 = 1753013(0x1abfb5, float:2.456494E-39)
                                int r1 = r1 + r2
                                goto Lc
                            L6d:
                                java.lang.String r0 = "mqSaR2S7ayBoIKsEZd"
                                java.lang.String r0 = com.xy.xyverify.Dialog.C0000.m6(r0)
                                java.lang.String r1 = "ۣۨۧ"
                                goto L1b
                            L76:
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.xy.xyverify.Dialog.MIUIDialog.AnonymousClass1.<init>(com.xy.xyverify.Dialog.MIUIDialog):void");
                        }

                        /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0007. Please report as an issue. */
                        /* JADX WARN: Removed duplicated region for block: B:10:0x0011 A[SYNTHETIC] */
                        /* JADX WARN: Removed duplicated region for block: B:6:0x0048 A[SYNTHETIC] */
                        @Override // android.view.animation.Animation.AnimationListener
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public void onAnimationEnd(android.view.animation.Animation r4) {
                            /*
                                r3 = this;
                                r1 = 0
                                java.lang.String r0 = "ۣۡۧ"
                                int r0 = com.xy.xyverify.Dialog.C0000.m4(r0)
                            L7:
                                switch(r0) {
                                    case 1749602: goto Lb;
                                    case 1750597: goto Laa;
                                    case 1750601: goto L8d;
                                    case 1750720: goto L1c;
                                    case 1751651: goto L52;
                                    case 1752582: goto L6f;
                                    case 1754377: goto L2f;
                                    default: goto La;
                                }
                            La:
                                goto L7
                            Lb:
                                int r0 = com.xy.xyverify.Verify.C0004.m46()
                                if (r0 > 0) goto L48
                                r0 = 16
                                com.xy.xyverify.Dialog.C0000.f4 = r0
                                java.lang.String r0 = "۟ۨۡ"
                                int r0 = com.xy.xyverify.Verify.C0003.m44(r0)
                                goto L7
                            L1c:
                                java.io.PrintStream r0 = java.lang.System.out
                                r0.println(r1)
                                int r0 = com.xy.xyverify.Verify.C0003.f10
                                if (r0 < 0) goto L9f
                                com.xy.xyverify.Verify.C0003.m42()
                                java.lang.String r0 = "ۢ۠۠"
                                int r0 = com.xy.xyverify.Dialog.C0000.m4(r0)
                                goto L7
                            L2f:
                                int r0 = com.xy.xyverify.Verify.C0004.f11
                                if (r0 < 0) goto L3e
                                r0 = 92
                                com.xy.xyverify.Dialog.C0000.f4 = r0
                                java.lang.String r0 = "ۧۢۥ"
                                int r0 = com.xy.xyverify.Dialog.C0001.m9(r0)
                                goto L7
                            L3e:
                                int r0 = com.xy.xyverify.Dialog.C0002.f6
                                int r2 = com.xy.xyverify.Verify.C0003.f10
                                int r0 = r0 + r2
                                r2 = 1750173(0x1ab49d, float:2.452515E-39)
                                int r0 = r0 + r2
                                goto L7
                            L48:
                                int r0 = com.xy.xyverify.Dialog.C0001.f5
                                int r2 = com.xy.xyverify.Verify.C0004.f11
                                int r0 = r0 % r2
                                r2 = 1750113(0x1ab461, float:2.45243E-39)
                                int r0 = r0 + r2
                                goto L7
                            L52:
                                int r0 = com.xy.xyverify.Dialog.C0000.m7()
                                if (r0 > 0) goto Lb
                                int r0 = com.xy.xyverify.Verify.C0004.m46()
                                if (r0 > 0) goto L65
                                java.lang.String r0 = "ۣۡۧ"
                                int r0 = com.xy.xyverify.Verify.C0004.m49(r0)
                                goto L7
                            L65:
                                int r0 = com.xy.xyverify.Dialog.C0002.f6
                                int r2 = com.xy.xyverify.Verify.C0004.f11
                                int r0 = r0 + r2
                                r2 = -1752803(0xffffffffffe5411d, float:NaN)
                                r0 = r0 ^ r2
                                goto L7
                            L6f:
                                java.lang.String r0 = "NxmLoMMbid"
                                java.lang.String r0 = com.xy.xyverify.Dialog.C0001.m10(r0)
                                float r1 = java.lang.Float.parseFloat(r0)
                                int r0 = com.xy.xyverify.Dialog.C0001.f5
                                int r2 = com.xy.xyverify.Dialog.C0002.f6
                                int r2 = r2 % 6372
                                r0 = r0 | r2
                                if (r0 > 0) goto L85
                                com.xy.xyverify.Dialog.C0001.m8()
                            L85:
                                java.lang.String r0 = "ۣۥۢ"
                                int r0 = com.xy.xyverify.Dialog.C0000.m4(r0)
                                goto L7
                            L8d:
                                com.xy.xyverify.Dialog.MIUIDialog r0 = r3.this$0
                                com.xy.xyverify.Dialog.MIUIDialog.access$001(r0)
                                int r0 = com.xy.xyverify.Verify.C0004.f11
                                int r2 = com.xy.xyverify.Verify.C0003.f10
                                int r2 = r2 % 3556
                                int r0 = r0 - r2
                                if (r0 < 0) goto La7
                                r0 = 33
                                com.xy.xyverify.Verify.C0003.f10 = r0
                            L9f:
                                java.lang.String r0 = "ۣۣۡ"
                            La1:
                                int r0 = com.xy.xyverify.Dialog.C0000.m4(r0)
                                goto L7
                            La7:
                                java.lang.String r0 = "ۣۤۤ"
                                goto La1
                            Laa:
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.xy.xyverify.Dialog.MIUIDialog.AnonymousClass1.onAnimationEnd(android.view.animation.Animation):void");
                        }

                        /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
                        
                            return;
                         */
                        @Override // android.view.animation.Animation.AnimationListener
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public void onAnimationRepeat(android.view.animation.Animation r2) {
                            /*
                                r1 = this;
                                java.lang.String r0 = "ۤۢ"
                                int r0 = com.xy.xyverify.Verify.C0003.m44(r0)
                            L6:
                                switch(r0) {
                                    case 56446: goto La;
                                    case 1750655: goto Lb;
                                    default: goto L9;
                                }
                            L9:
                                goto L6
                            La:
                                return
                            Lb:
                                int r0 = com.xy.xyverify.Verify.C0003.f10
                                if (r0 < 0) goto L1a
                                r0 = 76
                                com.xy.xyverify.Dialog.C0000.f4 = r0
                                java.lang.String r0 = "ۦۥۦ"
                            L15:
                                int r0 = com.xy.xyverify.Dialog.C0001.m9(r0)
                                goto L6
                            L1a:
                                java.lang.String r0 = "ۤۢ"
                                goto L15
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.xy.xyverify.Dialog.MIUIDialog.AnonymousClass1.onAnimationRepeat(android.view.animation.Animation):void");
                        }

                        /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0007. Please report as an issue. */
                        /* JADX WARN: Removed duplicated region for block: B:13:0x0074  */
                        /* JADX WARN: Removed duplicated region for block: B:9:0x006d  */
                        @Override // android.view.animation.Animation.AnimationListener
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public void onAnimationStart(android.view.animation.Animation r4) {
                            /*
                                r3 = this;
                                r0 = 0
                                java.lang.String r1 = "ۡۤۡ"
                                int r1 = com.xy.xyverify.Dialog.C0000.m4(r1)
                            L7:
                                switch(r1) {
                                    case 1748766: goto Lb;
                                    case 1750721: goto L64;
                                    case 1752648: goto L77;
                                    case 1752734: goto L38;
                                    case 1753633: goto L4d;
                                    case 1754445: goto L1c;
                                    default: goto La;
                                }
                            La:
                                goto L7
                            Lb:
                                int r1 = com.xy.xyverify.Dialog.C0000.m7()
                                if (r1 > 0) goto L64
                                int r1 = com.xy.xyverify.Verify.C0003.f10
                                if (r1 < 0) goto L2e
                                java.lang.String r1 = "ۡۤۡ"
                                int r1 = com.xy.xyverify.Dialog.C0002.m14(r1)
                                goto L7
                            L1c:
                                java.lang.String r0 = "YQZmw6NAomUCVkwHKEWU"
                                java.lang.String r0 = com.xy.xyverify.Dialog.C0002.m12(r0)
                                java.lang.Long r0 = java.lang.Long.valueOf(r0)
                                int r1 = com.xy.xyverify.Verify.C0003.f10
                                if (r1 < 0) goto L35
                                r1 = 47
                                com.xy.xyverify.Verify.C0003.f10 = r1
                            L2e:
                                java.lang.String r1 = "ۧۡۧ"
                            L30:
                                int r1 = com.xy.xyverify.Dialog.C0000.m4(r1)
                                goto L7
                            L35:
                                java.lang.String r1 = "ۥۨۡ"
                                goto L30
                            L38:
                                java.io.PrintStream r1 = java.lang.System.out
                                r1.println(r0)
                                int r1 = com.xy.xyverify.Dialog.C0000.f4
                                int r2 = com.xy.xyverify.Dialog.C0001.f5
                                int r2 = r2 + (-1552)
                                int r1 = r1 % r2
                                if (r1 > 0) goto L46
                            L46:
                                java.lang.String r1 = "ۥۥۨ"
                                int r1 = com.xy.xyverify.Verify.C0004.m49(r1)
                                goto L7
                            L4d:
                                int r1 = com.xy.xyverify.Dialog.C0000.f4
                                int r2 = com.xy.xyverify.Dialog.C0001.f5
                                int r2 = r2 % (-2628)
                                int r1 = r1 % r2
                                if (r1 > 0) goto L61
                                r1 = 52
                                com.xy.xyverify.Dialog.C0001.f5 = r1
                                java.lang.String r1 = "ۣۣۨ"
                            L5c:
                                int r1 = com.xy.xyverify.Dialog.C0001.m9(r1)
                                goto L7
                            L61:
                                java.lang.String r1 = "ۡۤۡ"
                                goto L5c
                            L64:
                                int r1 = com.xy.xyverify.Verify.C0004.f11
                                int r2 = com.xy.xyverify.Verify.C0003.f10
                                int r2 = r2 + (-2654)
                                int r1 = r1 * r2
                                if (r1 > 0) goto L74
                                java.lang.String r1 = "۟ۦۣ"
                            L6f:
                                int r1 = com.xy.xyverify.Dialog.C0000.m4(r1)
                                goto L7
                            L74:
                                java.lang.String r1 = "ۥۥۨ"
                                goto L6f
                            L77:
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.xy.xyverify.Dialog.MIUIDialog.AnonymousClass1.onAnimationStart(android.view.animation.Animation):void");
                        }
                    });
                    str2 = "ۣ۟ۤ";
                    m14 = C0004.m49(str2);
                case 1746846:
                    this.MainView.startAnimation(translateAnimation);
                    if (C0003.f10 >= 0) {
                        C0003.f10 = 64;
                        str2 = "ۣ۟ۤ";
                        m14 = C0004.m49(str2);
                    } else {
                        str = "ۥۣۨ";
                        m14 = C0001.m9(str);
                    }
                case 1750723:
                    if (C0000.f4 + C0004.f11 + 2000 <= 0) {
                        C0002.m15();
                        str = "۟ۦۧ";
                    } else {
                        str = "ۨ۠۟";
                    }
                    m14 = C0001.m9(str);
                case 1750753:
                    translateAnimation.setDuration(500L);
                    m14 = C0003.f10 + C0002.f6 + 1746297;
                case 1752586:
                    break;
                case 1755367:
                    translateAnimation = new TranslateAnimation(2, 0.0f, 2, 0.0f, 2, 0.0f, 2, 1.0f);
                    str2 = "ۣۦۤ";
                    m14 = C0004.m49(str2);
            }
            return;
        }
    }

    public Button getCancelButton() {
        return this.CancelButton;
    }

    public EditText getInputEdit() {
        return this.InputEdit;
    }

    public Button getOkButton() {
        return this.OkButton;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0077  */
    /* renamed from: lambda$CreateButton$0$com-xy-xyverify-Dialog-MIUIDialog, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ void m3lambda$CreateButton$0$comxyxyverifyDialogMIUIDialog(android.view.View r4) {
        /*
            r3 = this;
            r0 = 0
            java.lang.String r1 = "ۤۥۥ"
            int r2 = com.xy.xyverify.Dialog.C0000.m4(r1)
            r1 = r0
        L8:
            switch(r2) {
                case 56292: goto Lc;
                case 56475: goto L92;
                case 1746944: goto L7a;
                case 1747929: goto L33;
                case 1750630: goto L48;
                case 1751684: goto L17;
                case 1754502: goto L66;
                default: goto Lb;
            }
        Lb:
            goto L8
        Lc:
            int r0 = com.xy.xyverify.Verify.C0004.f11
            int r2 = com.xy.xyverify.Dialog.C0000.f4
            int r0 = r0 + r2
            r2 = 1751665(0x1aba71, float:2.454605E-39)
            int r0 = r0 + r2
            r2 = r0
            goto L8
        L17:
            r3.cancel()
            int r0 = com.xy.xyverify.Dialog.C0002.f6
            int r2 = com.xy.xyverify.Dialog.C0000.f4
            int r2 = r2 * (-4298)
            int r0 = r0 * r2
            if (r0 < 0) goto L2b
            java.lang.String r0 = "۟ۧۨ"
            int r0 = com.xy.xyverify.Dialog.C0001.m9(r0)
            r2 = r0
            goto L8
        L2b:
            java.lang.String r0 = "ۣۢۥ"
        L2d:
            int r0 = com.xy.xyverify.Dialog.C0000.m4(r0)
            r2 = r0
            goto L8
        L33:
            java.lang.String r0 = "QX"
            java.lang.String r0 = com.xy.xyverify.Verify.C0003.m43(r0)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            int r1 = com.xy.xyverify.Verify.C0004.f11
            int r2 = com.xy.xyverify.Dialog.C0002.f6
            r1 = r1 | r2
            r2 = 1747473(0x1aaa11, float:2.448731E-39)
            int r2 = r2 + r1
            r1 = r0
            goto L8
        L48:
            int r0 = com.xy.xyverify.Verify.C0003.m42()
            if (r0 > 0) goto L66
            int r0 = com.xy.xyverify.Dialog.C0001.f5
            int r2 = com.xy.xyverify.Verify.C0004.f11
            int r2 = r2 / (-5450)
            r0 = r0 ^ r2
            if (r0 > 0) goto L63
            r0 = 96
            com.xy.xyverify.Verify.C0004.f11 = r0
            java.lang.String r0 = "ۣ۟"
        L5d:
            int r0 = com.xy.xyverify.Dialog.C0001.m9(r0)
            r2 = r0
            goto L8
        L63:
            java.lang.String r0 = "۠ۨۡ"
            goto L5d
        L66:
            int r0 = com.xy.xyverify.Dialog.C0001.f5
            int r2 = com.xy.xyverify.Verify.C0003.f10
            int r2 = r2 + (-8039)
            r0 = r0 | r2
            if (r0 < 0) goto L77
            java.lang.String r0 = "ۢۨۦ"
        L71:
            int r0 = com.xy.xyverify.Dialog.C0001.m9(r0)
            r2 = r0
            goto L8
        L77:
            java.lang.String r0 = "ۥ۠"
            goto L71
        L7a:
            java.io.PrintStream r0 = java.lang.System.out
            r0.println(r1)
            int r0 = com.xy.xyverify.Dialog.C0000.f4
            int r2 = com.xy.xyverify.Dialog.C0000.f4
            int r2 = r2 + 6603
            int r0 = r0 * r2
            if (r0 > 0) goto L8f
            r0 = 8
            com.xy.xyverify.Verify.C0003.f10 = r0
            java.lang.String r0 = "ۤۥۥ"
            goto L2d
        L8f:
            java.lang.String r0 = "ۥ۠"
            goto L71
        L92:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xy.xyverify.Dialog.MIUIDialog.m3lambda$CreateButton$0$comxyxyverifyDialogMIUIDialog(android.view.View):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    public MIUIDialog setCancelButton(String str) {
        String str2;
        int m4 = C0000.m4("ۤۦۨ");
        while (true) {
            switch (m4) {
                case 56415:
                    break;
                case 1751718:
                    this.CancelButton.setText(str);
                    if (C0000.m7() <= 0) {
                        C0002.m15();
                        m4 = C0004.m49("ۥۨۧ");
                    } else {
                        str2 = "ۣۨۧ";
                        m4 = C0002.m14(str2);
                    }
                case 1752740:
                    RefreshButton();
                    if (C0003.m42() <= 0) {
                        C0003.f10 = 36;
                        m4 = C0000.m4("ۣۧۧ");
                    } else {
                        str2 = "ۣۢ";
                        m4 = C0002.m14(str2);
                    }
                case 1754507:
                    str2 = C0002.f6 % (C0002.f6 | 8734) <= 0 ? "ۣۣۢ" : "ۤۦۨ";
                    m4 = C0002.m14(str2);
                case 1755468:
                    this.CancelButton.setVisibility(0);
                    m4 = (C0001.f5 | (C0004.f11 | (-7250))) >= 0 ? C0004.m49("ۤۦۨ") : (C0000.f4 ^ C0004.f11) + 1752793;
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
    public com.xy.xyverify.Dialog.MIUIDialog setInput() {
        /*
            r2 = this;
            java.lang.String r0 = "ۧۦۢ"
            int r0 = com.xy.xyverify.Dialog.C0001.m9(r0)
        L6:
            switch(r0) {
                case 1749700: goto La;
                case 1754595: goto Lb;
                case 1755553: goto L2c;
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
            int r0 = com.xy.xyverify.Dialog.C0000.m7()
            if (r0 > 0) goto L22
            com.xy.xyverify.Dialog.C0000.m7()
            java.lang.String r0 = "ۧۦۢ"
            int r0 = com.xy.xyverify.Verify.C0004.m49(r0)
            goto L6
        L22:
            int r0 = com.xy.xyverify.Verify.C0003.f10
            int r1 = com.xy.xyverify.Dialog.C0002.f6
            r0 = r0 | r1
            r1 = -1749702(0xffffffffffe54d3a, float:NaN)
            r0 = r0 ^ r1
            goto L6
        L2c:
            int r0 = com.xy.xyverify.Dialog.C0001.f5
            int r1 = com.xy.xyverify.Verify.C0003.f10
            int r1 = r1 + (-510)
            r0 = r0 | r1
            if (r0 < 0) goto L3f
            r0 = 0
            com.xy.xyverify.Dialog.C0002.f6 = r0
            java.lang.String r0 = "ۣۢۤ"
            int r0 = com.xy.xyverify.Dialog.C0000.m4(r0)
            goto L6
        L3f:
            java.lang.String r0 = "ۧۦۢ"
            int r0 = com.xy.xyverify.Verify.C0003.m44(r0)
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xy.xyverify.Dialog.MIUIDialog.setInput():com.xy.xyverify.Dialog.MIUIDialog");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.xy.xyverify.Dialog.MIUIDialog setMessage(java.lang.String r3) {
        /*
            r2 = this;
            java.lang.String r0 = "۠۟۟"
            int r0 = com.xy.xyverify.Verify.C0004.m49(r0)
        L6:
            switch(r0) {
                case 1747648: goto La;
                case 1749734: goto L1c;
                case 1753668: goto L29;
                default: goto L9;
            }
        L9:
            goto L6
        La:
            android.widget.TextView r0 = r2.MessageView
            r0.setText(r3)
            int r0 = com.xy.xyverify.Verify.C0004.m46()
            if (r0 > 0) goto L26
            java.lang.String r0 = "ۦۧۥ"
        L17:
            int r0 = com.xy.xyverify.Verify.C0004.m49(r0)
            goto L6
        L1c:
            int r0 = com.xy.xyverify.Dialog.C0000.f4
            int r1 = com.xy.xyverify.Dialog.C0002.f6
            r0 = r0 ^ r1
            r1 = 1747400(0x1aa9c8, float:2.448629E-39)
            r0 = r0 ^ r1
            goto L6
        L26:
            java.lang.String r0 = "ۦۧۥ"
            goto L17
        L29:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xy.xyverify.Dialog.MIUIDialog.setMessage(java.lang.String):com.xy.xyverify.Dialog.MIUIDialog");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.xy.xyverify.Dialog.MIUIDialog setOkButton(java.lang.String r3) {
        /*
            r2 = this;
            java.lang.String r0 = "ۧۥۡ"
            int r0 = com.xy.xyverify.Verify.C0004.m49(r0)
        L6:
            switch(r0) {
                case 1747812: goto La;
                case 1752551: goto L14;
                case 1752732: goto L30;
                case 1754563: goto L21;
                default: goto L9;
            }
        L9:
            goto L6
        La:
            int r0 = com.xy.xyverify.Dialog.C0002.f6
            int r1 = com.xy.xyverify.Dialog.C0001.f5
            int r0 = r0 + r1
            r1 = 1754641(0x1ac611, float:2.458776E-39)
            r0 = r0 ^ r1
            goto L6
        L14:
            r2.RefreshButton()
            int r0 = com.xy.xyverify.Dialog.C0000.f4
            int r1 = com.xy.xyverify.Dialog.C0001.f5
            int r0 = r0 / r1
            r1 = 1752731(0x1abe9b, float:2.456099E-39)
            int r0 = r0 + r1
            goto L6
        L21:
            android.widget.Button r0 = r2.OkButton
            r0.setText(r3)
            int r0 = com.xy.xyverify.Verify.C0003.f10
            int r1 = com.xy.xyverify.Dialog.C0000.f4
            int r0 = r0 / r1
            r1 = 1752551(0x1abde7, float:2.455847E-39)
            r0 = r0 ^ r1
            goto L6
        L30:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xy.xyverify.Dialog.MIUIDialog.setOkButton(java.lang.String):com.xy.xyverify.Dialog.MIUIDialog");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.xy.xyverify.Dialog.MIUIDialog setTitle(java.lang.String r3) {
        /*
            r2 = this;
            java.lang.String r0 = "ۣ۟۟"
            int r0 = com.xy.xyverify.Verify.C0003.m44(r0)
        L6:
            switch(r0) {
                case 56288: goto La;
                case 1746811: goto L29;
                case 1747743: goto Lb;
                default: goto L9;
            }
        L9:
            goto L6
        La:
            return r2
        Lb:
            int r0 = com.xy.xyverify.Dialog.C0001.f5
            int r1 = com.xy.xyverify.Dialog.C0001.f5
            r1 = r1 ^ 7294(0x1c7e, float:1.0221E-41)
            int r0 = r0 % r1
            if (r0 > 0) goto L1f
            r0 = 53
            com.xy.xyverify.Dialog.C0001.f5 = r0
            java.lang.String r0 = "ۢۤۦ"
            int r0 = com.xy.xyverify.Verify.C0003.m44(r0)
            goto L6
        L1f:
            int r0 = com.xy.xyverify.Verify.C0003.f10
            int r1 = com.xy.xyverify.Verify.C0004.f11
            r0 = r0 ^ r1
            r1 = 1746152(0x1aa4e8, float:2.44688E-39)
            int r0 = r0 + r1
            goto L6
        L29:
            android.widget.TextView r0 = r2.TitleView
            r0.setText(r3)
            int r0 = com.xy.xyverify.Dialog.C0001.f5
            if (r0 > 0) goto L39
            java.lang.String r0 = "۟۟"
        L34:
            int r0 = com.xy.xyverify.Dialog.C0002.m14(r0)
            goto L6
        L39:
            java.lang.String r0 = "۟۟"
            goto L34
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xy.xyverify.Dialog.MIUIDialog.setTitle(java.lang.String):com.xy.xyverify.Dialog.MIUIDialog");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0015 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0059 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ed A[SYNTHETIC] */
    @Override // android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void show() {
        /*
            Method dump skipped, instructions count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xy.xyverify.Dialog.MIUIDialog.show():void");
    }
}
