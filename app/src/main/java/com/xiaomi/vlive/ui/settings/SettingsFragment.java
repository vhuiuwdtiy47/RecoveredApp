package com.xiaomi.vlive.ui.settings;

import U.t;
import U.v;
import Y.AbstractComponentCallbacksC0056x;
import Y.B;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.T;
import androidx.lifecycle.V;
import c0.e;
import com.android.music.R;
import com.xiaomi.vlive.App;
import com.xiaomi.vlive.ui.settings.SettingsFragment;
import e1.b;
import g.AbstractActivityC0146i;
import h1.c;
import l.AbstractC0271z;
import q1.d;
import q1.i;

/* loaded from: classes.dex */
public class SettingsFragment extends AbstractComponentCallbacksC0056x {

    /* renamed from: W, reason: collision with root package name */
    public b f2162W;

    /* renamed from: Z, reason: collision with root package name */
    public TextView f2165Z;

    /* renamed from: a0, reason: collision with root package name */
    public App f2166a0;

    /* renamed from: c0, reason: collision with root package name */
    public c f2167c0;

    /* renamed from: X, reason: collision with root package name */
    public FrameLayout f2163X = null;

    /* renamed from: Y, reason: collision with root package name */
    public View f2164Y = null;
    public final Handler b0 = new Handler(Looper.getMainLooper());

    @Override // Y.AbstractComponentCallbacksC0056x
    public final View u(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.f2166a0 = (App) G().getApplication();
        V c2 = c();
        T i = i();
        e a2 = a();
        d.e(i, "factory");
        v vVar = new v(c2, i, a2);
        q1.b a3 = i.a(h1.d.class);
        String s2 = t.s(a3);
        if (s2 == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        View inflate = layoutInflater.inflate(R.layout.fragment_settings, viewGroup, false);
        int i2 = R.id.actionRangebgin1;
        EditText editText = (EditText) AbstractC0271z.i(inflate, R.id.actionRangebgin1);
        if (editText != null) {
            i2 = R.id.actionRangebgin2;
            EditText editText2 = (EditText) AbstractC0271z.i(inflate, R.id.actionRangebgin2);
            if (editText2 != null) {
                i2 = R.id.actionRangebgin3;
                EditText editText3 = (EditText) AbstractC0271z.i(inflate, R.id.actionRangebgin3);
                if (editText3 != null) {
                    i2 = R.id.actionRangebgin4;
                    EditText editText4 = (EditText) AbstractC0271z.i(inflate, R.id.actionRangebgin4);
                    if (editText4 != null) {
                        i2 = R.id.actionRangebgin5;
                        EditText editText5 = (EditText) AbstractC0271z.i(inflate, R.id.actionRangebgin5);
                        if (editText5 != null) {
                            i2 = R.id.actionRangebgin6;
                            EditText editText6 = (EditText) AbstractC0271z.i(inflate, R.id.actionRangebgin6);
                            if (editText6 != null) {
                                i2 = R.id.actionRangebgin8;
                                EditText editText7 = (EditText) AbstractC0271z.i(inflate, R.id.actionRangebgin8);
                                if (editText7 != null) {
                                    i2 = R.id.actionRangeend1;
                                    EditText editText8 = (EditText) AbstractC0271z.i(inflate, R.id.actionRangeend1);
                                    if (editText8 != null) {
                                        i2 = R.id.actionRangeend2;
                                        EditText editText9 = (EditText) AbstractC0271z.i(inflate, R.id.actionRangeend2);
                                        if (editText9 != null) {
                                            i2 = R.id.actionRangeend3;
                                            EditText editText10 = (EditText) AbstractC0271z.i(inflate, R.id.actionRangeend3);
                                            if (editText10 != null) {
                                                i2 = R.id.actionRangeend4;
                                                EditText editText11 = (EditText) AbstractC0271z.i(inflate, R.id.actionRangeend4);
                                                if (editText11 != null) {
                                                    i2 = R.id.actionRangeend5;
                                                    EditText editText12 = (EditText) AbstractC0271z.i(inflate, R.id.actionRangeend5);
                                                    if (editText12 != null) {
                                                        i2 = R.id.actionRangeend6;
                                                        EditText editText13 = (EditText) AbstractC0271z.i(inflate, R.id.actionRangeend6);
                                                        if (editText13 != null) {
                                                            i2 = R.id.actionRangeend8;
                                                            EditText editText14 = (EditText) AbstractC0271z.i(inflate, R.id.actionRangeend8);
                                                            if (editText14 != null) {
                                                                i2 = R.id.colorctype_1;
                                                                RadioButton radioButton = (RadioButton) AbstractC0271z.i(inflate, R.id.colorctype_1);
                                                                if (radioButton != null) {
                                                                    i2 = R.id.colorctype_2;
                                                                    RadioButton radioButton2 = (RadioButton) AbstractC0271z.i(inflate, R.id.colorctype_2);
                                                                    if (radioButton2 != null) {
                                                                        i2 = R.id.colorctype_3;
                                                                        RadioButton radioButton3 = (RadioButton) AbstractC0271z.i(inflate, R.id.colorctype_3);
                                                                        if (radioButton3 != null) {
                                                                            i2 = R.id.radioGroup_color_type;
                                                                            RadioGroup radioGroup = (RadioGroup) AbstractC0271z.i(inflate, R.id.radioGroup_color_type);
                                                                            if (radioGroup != null) {
                                                                                i2 = R.id.rootLayout;
                                                                                FrameLayout frameLayout = (FrameLayout) AbstractC0271z.i(inflate, R.id.rootLayout);
                                                                                if (frameLayout != null) {
                                                                                    i2 = R.id.rootLinearLayout;
                                                                                    if (((LinearLayout) AbstractC0271z.i(inflate, R.id.rootLinearLayout)) != null) {
                                                                                        i2 = R.id.savePlayTime;
                                                                                        Button button = (Button) AbstractC0271z.i(inflate, R.id.savePlayTime);
                                                                                        if (button != null) {
                                                                                            i2 = R.id.selectxy;
                                                                                            Button button2 = (Button) AbstractC0271z.i(inflate, R.id.selectxy);
                                                                                            if (button2 != null) {
                                                                                                i2 = R.id.textxy;
                                                                                                TextView textView = (TextView) AbstractC0271z.i(inflate, R.id.textxy);
                                                                                                if (textView != null) {
                                                                                                    i2 = R.id.tips1;
                                                                                                    TextView textView2 = (TextView) AbstractC0271z.i(inflate, R.id.tips1);
                                                                                                    if (textView2 != null) {
                                                                                                        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                                                                                                        this.f2162W = new b(constraintLayout, editText, editText2, editText3, editText4, editText5, editText6, editText7, editText8, editText9, editText10, editText11, editText12, editText13, editText14, radioButton, radioButton2, radioButton3, radioGroup, frameLayout, button, button2, textView, textView2);
                                                                                                        final int i3 = 0;
                                                                                                        button2.setOnClickListener(new View.OnClickListener(this) { // from class: h1.a

                                                                                                            /* renamed from: b, reason: collision with root package name */
                                                                                                            public final /* synthetic */ SettingsFragment f2604b;

                                                                                                            {
                                                                                                                this.f2604b = this;
                                                                                                            }

                                                                                                            @Override // android.view.View.OnClickListener
                                                                                                            public final void onClick(View view) {
                                                                                                                switch (i3) {
                                                                                                                    case 0:
                                                                                                                        final SettingsFragment settingsFragment = this.f2604b;
                                                                                                                        if (settingsFragment.f2164Y != null) {
                                                                                                                            return;
                                                                                                                        }
                                                                                                                        B b2 = settingsFragment.f1198t;
                                                                                                                        final AbstractActivityC0146i abstractActivityC0146i = b2 == null ? null : b2.f958e;
                                                                                                                        settingsFragment.f2162W.f2231s.setVisibility(0);
                                                                                                                        View view2 = new View(abstractActivityC0146i);
                                                                                                                        settingsFragment.f2164Y = view2;
                                                                                                                        view2.setBackgroundColor(Color.parseColor("#88000000"));
                                                                                                                        settingsFragment.f2162W.f2231s.addView(settingsFragment.f2164Y, new FrameLayout.LayoutParams(-1, -1));
                                                                                                                        settingsFragment.f2164Y.bringToFront();
                                                                                                                        TextView textView3 = new TextView(abstractActivityC0146i);
                                                                                                                        settingsFragment.f2165Z = textView3;
                                                                                                                        textView3.setTextColor(-16777216);
                                                                                                                        settingsFragment.f2165Z.setTextSize(12.0f);
                                                                                                                        settingsFragment.f2165Z.setText("选择坐标，3秒后自动确认");
                                                                                                                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                                                                                                                        layoutParams.gravity = 8388659;
                                                                                                                        layoutParams.setMargins(200, 500, 0, 0);
                                                                                                                        settingsFragment.f2162W.f2231s.addView(settingsFragment.f2165Z, layoutParams);
                                                                                                                        settingsFragment.f2165Z.bringToFront();
                                                                                                                        settingsFragment.f2164Y.setOnTouchListener(new View.OnTouchListener() { // from class: h1.b
                                                                                                                            /* JADX WARN: Multi-variable type inference failed */
                                                                                                                            /* JADX WARN: Type inference failed for: r12v9, types: [java.lang.Runnable, h1.c] */
                                                                                                                            @Override // android.view.View.OnTouchListener
                                                                                                                            public final boolean onTouch(View view3, MotionEvent motionEvent) {
                                                                                                                                AbstractActivityC0146i abstractActivityC0146i2 = abstractActivityC0146i;
                                                                                                                                final SettingsFragment settingsFragment2 = SettingsFragment.this;
                                                                                                                                settingsFragment2.getClass();
                                                                                                                                try {
                                                                                                                                    if (motionEvent.getAction() == 0) {
                                                                                                                                        int x2 = (int) motionEvent.getX();
                                                                                                                                        int y2 = (int) motionEvent.getY();
                                                                                                                                        int[] iArr = new int[2];
                                                                                                                                        view3.getLocationOnScreen(iArr);
                                                                                                                                        final int x3 = iArr[0] + ((int) motionEvent.getX());
                                                                                                                                        final int y3 = iArr[1] + ((int) motionEvent.getY());
                                                                                                                                        settingsFragment2.f2162W.f2233u.setText("当前选择监测屏幕坐标: (" + x3 + ", " + y3 + ")");
                                                                                                                                        settingsFragment2.f2165Z.setText("选择坐标，3秒后自动确认: (" + x3 + ", " + y3 + ")");
                                                                                                                                        FrameLayout frameLayout2 = settingsFragment2.f2163X;
                                                                                                                                        if (frameLayout2 != null) {
                                                                                                                                            settingsFragment2.f2162W.f2231s.removeView(frameLayout2);
                                                                                                                                        }
                                                                                                                                        FrameLayout frameLayout3 = new FrameLayout(abstractActivityC0146i2);
                                                                                                                                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(40, 40);
                                                                                                                                        layoutParams2.leftMargin = x2 - 20;
                                                                                                                                        layoutParams2.topMargin = y2 - 20;
                                                                                                                                        frameLayout3.setLayoutParams(layoutParams2);
                                                                                                                                        View view4 = new View(abstractActivityC0146i2);
                                                                                                                                        view4.setBackgroundColor(-65536);
                                                                                                                                        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, 4);
                                                                                                                                        layoutParams3.gravity = 16;
                                                                                                                                        frameLayout3.addView(view4, layoutParams3);
                                                                                                                                        View view5 = new View(abstractActivityC0146i2);
                                                                                                                                        view5.setBackgroundColor(-65536);
                                                                                                                                        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(4, -1);
                                                                                                                                        layoutParams4.gravity = 1;
                                                                                                                                        frameLayout3.addView(view5, layoutParams4);
                                                                                                                                        settingsFragment2.f2162W.f2231s.addView(frameLayout3);
                                                                                                                                        settingsFragment2.f2163X = frameLayout3;
                                                                                                                                        c cVar = settingsFragment2.f2167c0;
                                                                                                                                        Handler handler = settingsFragment2.b0;
                                                                                                                                        if (cVar != null) {
                                                                                                                                            handler.removeCallbacks(cVar);
                                                                                                                                        }
                                                                                                                                        ?? r12 = new Runnable() { // from class: h1.c
                                                                                                                                            @Override // java.lang.Runnable
                                                                                                                                            public final void run() {
                                                                                                                                                SettingsFragment settingsFragment3 = SettingsFragment.this;
                                                                                                                                                FrameLayout frameLayout4 = settingsFragment3.f2163X;
                                                                                                                                                if (frameLayout4 != null) {
                                                                                                                                                    settingsFragment3.f2162W.f2231s.removeView(frameLayout4);
                                                                                                                                                    settingsFragment3.f2163X = null;
                                                                                                                                                }
                                                                                                                                                View view6 = settingsFragment3.f2164Y;
                                                                                                                                                if (view6 != null) {
                                                                                                                                                    settingsFragment3.f2162W.f2231s.removeView(view6);
                                                                                                                                                    settingsFragment3.f2164Y = null;
                                                                                                                                                }
                                                                                                                                                TextView textView4 = settingsFragment3.f2165Z;
                                                                                                                                                if (textView4 != null) {
                                                                                                                                                    settingsFragment3.f2162W.f2231s.removeView(textView4);
                                                                                                                                                    settingsFragment3.f2165Z = null;
                                                                                                                                                }
                                                                                                                                                settingsFragment3.f2162W.f2231s.setVisibility(8);
                                                                                                                                                SharedPreferences.Editor edit = settingsFragment3.f2166a0.f2121a.edit();
                                                                                                                                                int i4 = x3;
                                                                                                                                                edit.putInt("MonitorTargetX", i4).apply();
                                                                                                                                                SharedPreferences.Editor edit2 = settingsFragment3.f2166a0.f2121a.edit();
                                                                                                                                                int i5 = y3;
                                                                                                                                                edit2.putInt("MonitorTargetY", i5).apply();
                                                                                                                                                t.f(1, App.f2119k.getApplicationContext(), "设置坐标成功(" + i4 + "," + i5 + ")");
                                                                                                                                            }
                                                                                                                                        };
                                                                                                                                        settingsFragment2.f2167c0 = r12;
                                                                                                                                        handler.postDelayed(r12, 3000L);
                                                                                                                                    }
                                                                                                                                } catch (Exception unused) {
                                                                                                                                }
                                                                                                                                return true;
                                                                                                                            }
                                                                                                                        });
                                                                                                                        return;
                                                                                                                    default:
                                                                                                                        SettingsFragment settingsFragment2 = this.f2604b;
                                                                                                                        settingsFragment2.getClass();
                                                                                                                        try {
                                                                                                                            long parseLong = Long.parseLong(settingsFragment2.f2162W.f2216a.getText().toString().trim());
                                                                                                                            long parseLong2 = Long.parseLong(settingsFragment2.f2162W.h.getText().toString().trim());
                                                                                                                            long parseLong3 = Long.parseLong(settingsFragment2.f2162W.f2217b.getText().toString().trim());
                                                                                                                            long parseLong4 = Long.parseLong(settingsFragment2.f2162W.i.getText().toString().trim());
                                                                                                                            long parseLong5 = Long.parseLong(settingsFragment2.f2162W.f2218c.getText().toString().trim());
                                                                                                                            long parseLong6 = Long.parseLong(settingsFragment2.f2162W.f2222j.getText().toString().trim());
                                                                                                                            long parseLong7 = Long.parseLong(settingsFragment2.f2162W.d.getText().toString().trim());
                                                                                                                            long parseLong8 = Long.parseLong(settingsFragment2.f2162W.f2223k.getText().toString().trim());
                                                                                                                            long parseLong9 = Long.parseLong(settingsFragment2.f2162W.f2219e.getText().toString().trim());
                                                                                                                            long parseLong10 = Long.parseLong(settingsFragment2.f2162W.f2224l.getText().toString().trim());
                                                                                                                            long parseLong11 = Long.parseLong(settingsFragment2.f2162W.f2220f.getText().toString().trim());
                                                                                                                            long parseLong12 = Long.parseLong(settingsFragment2.f2162W.f2225m.getText().toString().trim());
                                                                                                                            long parseLong13 = Long.parseLong(settingsFragment2.f2162W.f2221g.getText().toString().trim());
                                                                                                                            long parseLong14 = Long.parseLong(settingsFragment2.f2162W.f2226n.getText().toString().trim());
                                                                                                                            if (parseLong2 >= parseLong && parseLong4 >= parseLong3 && parseLong6 >= parseLong5 && parseLong8 >= parseLong7 && parseLong10 >= parseLong9 && parseLong12 >= parseLong11 && parseLong14 >= parseLong13) {
                                                                                                                                settingsFragment2.f2166a0.f(1, parseLong);
                                                                                                                                settingsFragment2.f2166a0.e(1, parseLong2);
                                                                                                                                settingsFragment2.f2166a0.f(2, parseLong3);
                                                                                                                                settingsFragment2.f2166a0.e(2, parseLong4);
                                                                                                                                settingsFragment2.f2166a0.f(3, parseLong5);
                                                                                                                                settingsFragment2.f2166a0.e(3, parseLong6);
                                                                                                                                settingsFragment2.f2166a0.f(4, parseLong7);
                                                                                                                                settingsFragment2.f2166a0.e(4, parseLong8);
                                                                                                                                settingsFragment2.f2166a0.f(5, parseLong9);
                                                                                                                                settingsFragment2.f2166a0.e(5, parseLong10);
                                                                                                                                settingsFragment2.f2166a0.f(6, parseLong11);
                                                                                                                                settingsFragment2.f2166a0.e(6, parseLong12);
                                                                                                                                settingsFragment2.f2166a0.f(8, parseLong13);
                                                                                                                                settingsFragment2.f2166a0.e(8, parseLong14);
                                                                                                                                t.g("保存成功");
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            t.g("保存失败\n结束时间不能大于开始时间");
                                                                                                                            return;
                                                                                                                        } catch (NumberFormatException unused) {
                                                                                                                            t.f(1, App.f2119k.getApplicationContext(), "保存失败,输入数据有误");
                                                                                                                            return;
                                                                                                                        }
                                                                                                                }
                                                                                                            }
                                                                                                        });
                                                                                                        this.f2162W.f2233u.setText("当前选择监测屏幕坐标: (" + this.f2166a0.f2121a.getInt("MonitorTargetX", 55) + ", " + this.f2166a0.f2121a.getInt("MonitorTargetY", 380) + ")");
                                                                                                        final int i4 = 1;
                                                                                                        this.f2162W.f2232t.setOnClickListener(new View.OnClickListener(this) { // from class: h1.a

                                                                                                            /* renamed from: b, reason: collision with root package name */
                                                                                                            public final /* synthetic */ SettingsFragment f2604b;

                                                                                                            {
                                                                                                                this.f2604b = this;
                                                                                                            }

                                                                                                            @Override // android.view.View.OnClickListener
                                                                                                            public final void onClick(View view) {
                                                                                                                switch (i4) {
                                                                                                                    case 0:
                                                                                                                        final SettingsFragment settingsFragment = this.f2604b;
                                                                                                                        if (settingsFragment.f2164Y != null) {
                                                                                                                            return;
                                                                                                                        }
                                                                                                                        B b2 = settingsFragment.f1198t;
                                                                                                                        final AbstractActivityC0146i abstractActivityC0146i = b2 == null ? null : b2.f958e;
                                                                                                                        settingsFragment.f2162W.f2231s.setVisibility(0);
                                                                                                                        View view2 = new View(abstractActivityC0146i);
                                                                                                                        settingsFragment.f2164Y = view2;
                                                                                                                        view2.setBackgroundColor(Color.parseColor("#88000000"));
                                                                                                                        settingsFragment.f2162W.f2231s.addView(settingsFragment.f2164Y, new FrameLayout.LayoutParams(-1, -1));
                                                                                                                        settingsFragment.f2164Y.bringToFront();
                                                                                                                        TextView textView3 = new TextView(abstractActivityC0146i);
                                                                                                                        settingsFragment.f2165Z = textView3;
                                                                                                                        textView3.setTextColor(-16777216);
                                                                                                                        settingsFragment.f2165Z.setTextSize(12.0f);
                                                                                                                        settingsFragment.f2165Z.setText("选择坐标，3秒后自动确认");
                                                                                                                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                                                                                                                        layoutParams.gravity = 8388659;
                                                                                                                        layoutParams.setMargins(200, 500, 0, 0);
                                                                                                                        settingsFragment.f2162W.f2231s.addView(settingsFragment.f2165Z, layoutParams);
                                                                                                                        settingsFragment.f2165Z.bringToFront();
                                                                                                                        settingsFragment.f2164Y.setOnTouchListener(new View.OnTouchListener() { // from class: h1.b
                                                                                                                            /* JADX WARN: Multi-variable type inference failed */
                                                                                                                            /* JADX WARN: Type inference failed for: r12v9, types: [java.lang.Runnable, h1.c] */
                                                                                                                            @Override // android.view.View.OnTouchListener
                                                                                                                            public final boolean onTouch(View view3, MotionEvent motionEvent) {
                                                                                                                                AbstractActivityC0146i abstractActivityC0146i2 = abstractActivityC0146i;
                                                                                                                                final SettingsFragment settingsFragment2 = SettingsFragment.this;
                                                                                                                                settingsFragment2.getClass();
                                                                                                                                try {
                                                                                                                                    if (motionEvent.getAction() == 0) {
                                                                                                                                        int x2 = (int) motionEvent.getX();
                                                                                                                                        int y2 = (int) motionEvent.getY();
                                                                                                                                        int[] iArr = new int[2];
                                                                                                                                        view3.getLocationOnScreen(iArr);
                                                                                                                                        final int x3 = iArr[0] + ((int) motionEvent.getX());
                                                                                                                                        final int y3 = iArr[1] + ((int) motionEvent.getY());
                                                                                                                                        settingsFragment2.f2162W.f2233u.setText("当前选择监测屏幕坐标: (" + x3 + ", " + y3 + ")");
                                                                                                                                        settingsFragment2.f2165Z.setText("选择坐标，3秒后自动确认: (" + x3 + ", " + y3 + ")");
                                                                                                                                        FrameLayout frameLayout2 = settingsFragment2.f2163X;
                                                                                                                                        if (frameLayout2 != null) {
                                                                                                                                            settingsFragment2.f2162W.f2231s.removeView(frameLayout2);
                                                                                                                                        }
                                                                                                                                        FrameLayout frameLayout3 = new FrameLayout(abstractActivityC0146i2);
                                                                                                                                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(40, 40);
                                                                                                                                        layoutParams2.leftMargin = x2 - 20;
                                                                                                                                        layoutParams2.topMargin = y2 - 20;
                                                                                                                                        frameLayout3.setLayoutParams(layoutParams2);
                                                                                                                                        View view4 = new View(abstractActivityC0146i2);
                                                                                                                                        view4.setBackgroundColor(-65536);
                                                                                                                                        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, 4);
                                                                                                                                        layoutParams3.gravity = 16;
                                                                                                                                        frameLayout3.addView(view4, layoutParams3);
                                                                                                                                        View view5 = new View(abstractActivityC0146i2);
                                                                                                                                        view5.setBackgroundColor(-65536);
                                                                                                                                        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(4, -1);
                                                                                                                                        layoutParams4.gravity = 1;
                                                                                                                                        frameLayout3.addView(view5, layoutParams4);
                                                                                                                                        settingsFragment2.f2162W.f2231s.addView(frameLayout3);
                                                                                                                                        settingsFragment2.f2163X = frameLayout3;
                                                                                                                                        c cVar = settingsFragment2.f2167c0;
                                                                                                                                        Handler handler = settingsFragment2.b0;
                                                                                                                                        if (cVar != null) {
                                                                                                                                            handler.removeCallbacks(cVar);
                                                                                                                                        }
                                                                                                                                        ?? r12 = new Runnable() { // from class: h1.c
                                                                                                                                            @Override // java.lang.Runnable
                                                                                                                                            public final void run() {
                                                                                                                                                SettingsFragment settingsFragment3 = SettingsFragment.this;
                                                                                                                                                FrameLayout frameLayout4 = settingsFragment3.f2163X;
                                                                                                                                                if (frameLayout4 != null) {
                                                                                                                                                    settingsFragment3.f2162W.f2231s.removeView(frameLayout4);
                                                                                                                                                    settingsFragment3.f2163X = null;
                                                                                                                                                }
                                                                                                                                                View view6 = settingsFragment3.f2164Y;
                                                                                                                                                if (view6 != null) {
                                                                                                                                                    settingsFragment3.f2162W.f2231s.removeView(view6);
                                                                                                                                                    settingsFragment3.f2164Y = null;
                                                                                                                                                }
                                                                                                                                                TextView textView4 = settingsFragment3.f2165Z;
                                                                                                                                                if (textView4 != null) {
                                                                                                                                                    settingsFragment3.f2162W.f2231s.removeView(textView4);
                                                                                                                                                    settingsFragment3.f2165Z = null;
                                                                                                                                                }
                                                                                                                                                settingsFragment3.f2162W.f2231s.setVisibility(8);
                                                                                                                                                SharedPreferences.Editor edit = settingsFragment3.f2166a0.f2121a.edit();
                                                                                                                                                int i42 = x3;
                                                                                                                                                edit.putInt("MonitorTargetX", i42).apply();
                                                                                                                                                SharedPreferences.Editor edit2 = settingsFragment3.f2166a0.f2121a.edit();
                                                                                                                                                int i5 = y3;
                                                                                                                                                edit2.putInt("MonitorTargetY", i5).apply();
                                                                                                                                                t.f(1, App.f2119k.getApplicationContext(), "设置坐标成功(" + i42 + "," + i5 + ")");
                                                                                                                                            }
                                                                                                                                        };
                                                                                                                                        settingsFragment2.f2167c0 = r12;
                                                                                                                                        handler.postDelayed(r12, 3000L);
                                                                                                                                    }
                                                                                                                                } catch (Exception unused) {
                                                                                                                                }
                                                                                                                                return true;
                                                                                                                            }
                                                                                                                        });
                                                                                                                        return;
                                                                                                                    default:
                                                                                                                        SettingsFragment settingsFragment2 = this.f2604b;
                                                                                                                        settingsFragment2.getClass();
                                                                                                                        try {
                                                                                                                            long parseLong = Long.parseLong(settingsFragment2.f2162W.f2216a.getText().toString().trim());
                                                                                                                            long parseLong2 = Long.parseLong(settingsFragment2.f2162W.h.getText().toString().trim());
                                                                                                                            long parseLong3 = Long.parseLong(settingsFragment2.f2162W.f2217b.getText().toString().trim());
                                                                                                                            long parseLong4 = Long.parseLong(settingsFragment2.f2162W.i.getText().toString().trim());
                                                                                                                            long parseLong5 = Long.parseLong(settingsFragment2.f2162W.f2218c.getText().toString().trim());
                                                                                                                            long parseLong6 = Long.parseLong(settingsFragment2.f2162W.f2222j.getText().toString().trim());
                                                                                                                            long parseLong7 = Long.parseLong(settingsFragment2.f2162W.d.getText().toString().trim());
                                                                                                                            long parseLong8 = Long.parseLong(settingsFragment2.f2162W.f2223k.getText().toString().trim());
                                                                                                                            long parseLong9 = Long.parseLong(settingsFragment2.f2162W.f2219e.getText().toString().trim());
                                                                                                                            long parseLong10 = Long.parseLong(settingsFragment2.f2162W.f2224l.getText().toString().trim());
                                                                                                                            long parseLong11 = Long.parseLong(settingsFragment2.f2162W.f2220f.getText().toString().trim());
                                                                                                                            long parseLong12 = Long.parseLong(settingsFragment2.f2162W.f2225m.getText().toString().trim());
                                                                                                                            long parseLong13 = Long.parseLong(settingsFragment2.f2162W.f2221g.getText().toString().trim());
                                                                                                                            long parseLong14 = Long.parseLong(settingsFragment2.f2162W.f2226n.getText().toString().trim());
                                                                                                                            if (parseLong2 >= parseLong && parseLong4 >= parseLong3 && parseLong6 >= parseLong5 && parseLong8 >= parseLong7 && parseLong10 >= parseLong9 && parseLong12 >= parseLong11 && parseLong14 >= parseLong13) {
                                                                                                                                settingsFragment2.f2166a0.f(1, parseLong);
                                                                                                                                settingsFragment2.f2166a0.e(1, parseLong2);
                                                                                                                                settingsFragment2.f2166a0.f(2, parseLong3);
                                                                                                                                settingsFragment2.f2166a0.e(2, parseLong4);
                                                                                                                                settingsFragment2.f2166a0.f(3, parseLong5);
                                                                                                                                settingsFragment2.f2166a0.e(3, parseLong6);
                                                                                                                                settingsFragment2.f2166a0.f(4, parseLong7);
                                                                                                                                settingsFragment2.f2166a0.e(4, parseLong8);
                                                                                                                                settingsFragment2.f2166a0.f(5, parseLong9);
                                                                                                                                settingsFragment2.f2166a0.e(5, parseLong10);
                                                                                                                                settingsFragment2.f2166a0.f(6, parseLong11);
                                                                                                                                settingsFragment2.f2166a0.e(6, parseLong12);
                                                                                                                                settingsFragment2.f2166a0.f(8, parseLong13);
                                                                                                                                settingsFragment2.f2166a0.e(8, parseLong14);
                                                                                                                                t.g("保存成功");
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            t.g("保存失败\n结束时间不能大于开始时间");
                                                                                                                            return;
                                                                                                                        } catch (NumberFormatException unused) {
                                                                                                                            t.f(1, App.f2119k.getApplicationContext(), "保存失败,输入数据有误");
                                                                                                                            return;
                                                                                                                        }
                                                                                                                }
                                                                                                            }
                                                                                                        });
                                                                                                        this.f2162W.f2216a.setText(String.valueOf(this.f2166a0.b(1, 0L)));
                                                                                                        this.f2162W.h.setText(String.valueOf(this.f2166a0.a(1, 1170000L)));
                                                                                                        this.f2162W.f2217b.setText(String.valueOf(this.f2166a0.b(2, 5000000L)));
                                                                                                        this.f2162W.i.setText(String.valueOf(this.f2166a0.a(2, 5900000L)));
                                                                                                        this.f2162W.f2218c.setText(String.valueOf(this.f2166a0.b(3, 2000000L)));
                                                                                                        this.f2162W.f2222j.setText(String.valueOf(this.f2166a0.a(3, 3200000L)));
                                                                                                        this.f2162W.d.setText(String.valueOf(this.f2166a0.b(4, 3200000L)));
                                                                                                        this.f2162W.f2223k.setText(String.valueOf(this.f2166a0.a(4, 4000000L)));
                                                                                                        this.f2162W.f2219e.setText(String.valueOf(this.f2166a0.b(5, 4000000L)));
                                                                                                        this.f2162W.f2224l.setText(String.valueOf(this.f2166a0.a(5, 4000000L)));
                                                                                                        this.f2162W.f2220f.setText(String.valueOf(this.f2166a0.b(6, 4000000L)));
                                                                                                        this.f2162W.f2225m.setText(String.valueOf(this.f2166a0.a(6, 5000000L)));
                                                                                                        this.f2162W.f2221g.setText(String.valueOf(this.f2166a0.b(8, 5600000L)));
                                                                                                        this.f2162W.f2226n.setText(String.valueOf(this.f2166a0.a(8, 6800000L)));
                                                                                                        this.f2162W.f2230r.setOnCheckedChangeListener(new f1.b(2, this));
                                                                                                        return constraintLayout;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
    }

    @Override // Y.AbstractComponentCallbacksC0056x
    public final void v() {
        this.f1165D = true;
        this.f2162W = null;
    }
}
