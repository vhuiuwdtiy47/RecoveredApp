package androidx.constraintlayout.widget;

import C.j;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.datepicker.k;
import com.tencent.wechat.Platform;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import r.C0317c;
import t.C0326d;
import t.C0327e;
import t.h;
import w.AbstractC0365c;
import w.AbstractC0366d;
import w.C0367e;
import w.C0368f;
import w.C0369g;
import w.n;
import w.o;
import w.p;
import w.r;
import w.s;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* renamed from: p, reason: collision with root package name */
    public static s f1462p;

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f1463a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1464b;

    /* renamed from: c, reason: collision with root package name */
    public final C0327e f1465c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f1466e;

    /* renamed from: f, reason: collision with root package name */
    public int f1467f;

    /* renamed from: g, reason: collision with root package name */
    public int f1468g;
    public boolean h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public n f1469j;

    /* renamed from: k, reason: collision with root package name */
    public j f1470k;

    /* renamed from: l, reason: collision with root package name */
    public int f1471l;

    /* renamed from: m, reason: collision with root package name */
    public HashMap f1472m;

    /* renamed from: n, reason: collision with root package name */
    public final SparseArray f1473n;

    /* renamed from: o, reason: collision with root package name */
    public final C0368f f1474o;

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1463a = new SparseArray();
        this.f1464b = new ArrayList(4);
        this.f1465c = new C0327e();
        this.d = 0;
        this.f1466e = 0;
        this.f1467f = Integer.MAX_VALUE;
        this.f1468g = Integer.MAX_VALUE;
        this.h = true;
        this.i = 257;
        this.f1469j = null;
        this.f1470k = null;
        this.f1471l = -1;
        this.f1472m = new HashMap();
        this.f1473n = new SparseArray();
        this.f1474o = new C0368f(this, this);
        i(attributeSet, 0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup$MarginLayoutParams, w.e] */
    public static C0367e g() {
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.f3985a = -1;
        marginLayoutParams.f3987b = -1;
        marginLayoutParams.f3988c = -1.0f;
        marginLayoutParams.d = true;
        marginLayoutParams.f3991e = -1;
        marginLayoutParams.f3993f = -1;
        marginLayoutParams.f3995g = -1;
        marginLayoutParams.h = -1;
        marginLayoutParams.i = -1;
        marginLayoutParams.f3999j = -1;
        marginLayoutParams.f4001k = -1;
        marginLayoutParams.f4003l = -1;
        marginLayoutParams.f4005m = -1;
        marginLayoutParams.f4007n = -1;
        marginLayoutParams.f4009o = -1;
        marginLayoutParams.f4011p = -1;
        marginLayoutParams.f4013q = 0;
        marginLayoutParams.f4014r = 0.0f;
        marginLayoutParams.f4015s = -1;
        marginLayoutParams.f4016t = -1;
        marginLayoutParams.f4017u = -1;
        marginLayoutParams.f4018v = -1;
        marginLayoutParams.f4019w = Integer.MIN_VALUE;
        marginLayoutParams.f4020x = Integer.MIN_VALUE;
        marginLayoutParams.f4021y = Integer.MIN_VALUE;
        marginLayoutParams.f4022z = Integer.MIN_VALUE;
        marginLayoutParams.f3960A = Integer.MIN_VALUE;
        marginLayoutParams.f3961B = Integer.MIN_VALUE;
        marginLayoutParams.f3962C = Integer.MIN_VALUE;
        marginLayoutParams.f3963D = 0;
        marginLayoutParams.f3964E = 0.5f;
        marginLayoutParams.f3965F = 0.5f;
        marginLayoutParams.G = null;
        marginLayoutParams.f3966H = -1.0f;
        marginLayoutParams.f3967I = -1.0f;
        marginLayoutParams.f3968J = 0;
        marginLayoutParams.f3969K = 0;
        marginLayoutParams.f3970L = 0;
        marginLayoutParams.f3971M = 0;
        marginLayoutParams.f3972N = 0;
        marginLayoutParams.f3973O = 0;
        marginLayoutParams.f3974P = 0;
        marginLayoutParams.f3975Q = 0;
        marginLayoutParams.f3976R = 1.0f;
        marginLayoutParams.f3977S = 1.0f;
        marginLayoutParams.f3978T = -1;
        marginLayoutParams.f3979U = -1;
        marginLayoutParams.f3980V = -1;
        marginLayoutParams.f3981W = false;
        marginLayoutParams.f3982X = false;
        marginLayoutParams.f3983Y = null;
        marginLayoutParams.f3984Z = 0;
        marginLayoutParams.f3986a0 = true;
        marginLayoutParams.b0 = true;
        marginLayoutParams.f3989c0 = false;
        marginLayoutParams.f3990d0 = false;
        marginLayoutParams.f3992e0 = false;
        marginLayoutParams.f3994f0 = -1;
        marginLayoutParams.f3996g0 = -1;
        marginLayoutParams.f3997h0 = -1;
        marginLayoutParams.f3998i0 = -1;
        marginLayoutParams.f4000j0 = Integer.MIN_VALUE;
        marginLayoutParams.f4002k0 = Integer.MIN_VALUE;
        marginLayoutParams.f4004l0 = 0.5f;
        marginLayoutParams.f4012p0 = new C0326d();
        return marginLayoutParams;
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return max2 > 0 ? max2 : max;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, w.s] */
    public static s getSharedValues() {
        if (f1462p == null) {
            ?? obj = new Object();
            new SparseIntArray();
            new HashMap();
            f1462p = obj;
        }
        return f1462p;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0367e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.f1464b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                ((AbstractC0365c) arrayList.get(i)).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i3 = (int) ((parseInt / 1080.0f) * width);
                        int i4 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f2 = i3;
                        float f3 = i4;
                        float f4 = i3 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f2, f3, f4, f3, paint);
                        float parseInt4 = i4 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f4, f3, f4, parseInt4, paint);
                        canvas.drawLine(f4, parseInt4, f2, parseInt4, paint);
                        canvas.drawLine(f2, parseInt4, f2, f3, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f2, f3, f4, parseInt4, paint);
                        canvas.drawLine(f2, parseInt4, f4, f3, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.h = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return g();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams, java.lang.Object, w.e] */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(context, attributeSet);
        marginLayoutParams.f3985a = -1;
        marginLayoutParams.f3987b = -1;
        marginLayoutParams.f3988c = -1.0f;
        marginLayoutParams.d = true;
        marginLayoutParams.f3991e = -1;
        marginLayoutParams.f3993f = -1;
        marginLayoutParams.f3995g = -1;
        marginLayoutParams.h = -1;
        marginLayoutParams.i = -1;
        marginLayoutParams.f3999j = -1;
        marginLayoutParams.f4001k = -1;
        marginLayoutParams.f4003l = -1;
        marginLayoutParams.f4005m = -1;
        marginLayoutParams.f4007n = -1;
        marginLayoutParams.f4009o = -1;
        marginLayoutParams.f4011p = -1;
        marginLayoutParams.f4013q = 0;
        marginLayoutParams.f4014r = 0.0f;
        marginLayoutParams.f4015s = -1;
        marginLayoutParams.f4016t = -1;
        marginLayoutParams.f4017u = -1;
        marginLayoutParams.f4018v = -1;
        marginLayoutParams.f4019w = Integer.MIN_VALUE;
        marginLayoutParams.f4020x = Integer.MIN_VALUE;
        marginLayoutParams.f4021y = Integer.MIN_VALUE;
        marginLayoutParams.f4022z = Integer.MIN_VALUE;
        marginLayoutParams.f3960A = Integer.MIN_VALUE;
        marginLayoutParams.f3961B = Integer.MIN_VALUE;
        marginLayoutParams.f3962C = Integer.MIN_VALUE;
        marginLayoutParams.f3963D = 0;
        marginLayoutParams.f3964E = 0.5f;
        marginLayoutParams.f3965F = 0.5f;
        marginLayoutParams.G = null;
        marginLayoutParams.f3966H = -1.0f;
        marginLayoutParams.f3967I = -1.0f;
        marginLayoutParams.f3968J = 0;
        marginLayoutParams.f3969K = 0;
        marginLayoutParams.f3970L = 0;
        marginLayoutParams.f3971M = 0;
        marginLayoutParams.f3972N = 0;
        marginLayoutParams.f3973O = 0;
        marginLayoutParams.f3974P = 0;
        marginLayoutParams.f3975Q = 0;
        marginLayoutParams.f3976R = 1.0f;
        marginLayoutParams.f3977S = 1.0f;
        marginLayoutParams.f3978T = -1;
        marginLayoutParams.f3979U = -1;
        marginLayoutParams.f3980V = -1;
        marginLayoutParams.f3981W = false;
        marginLayoutParams.f3982X = false;
        marginLayoutParams.f3983Y = null;
        marginLayoutParams.f3984Z = 0;
        marginLayoutParams.f3986a0 = true;
        marginLayoutParams.b0 = true;
        marginLayoutParams.f3989c0 = false;
        marginLayoutParams.f3990d0 = false;
        marginLayoutParams.f3992e0 = false;
        marginLayoutParams.f3994f0 = -1;
        marginLayoutParams.f3996g0 = -1;
        marginLayoutParams.f3997h0 = -1;
        marginLayoutParams.f3998i0 = -1;
        marginLayoutParams.f4000j0 = Integer.MIN_VALUE;
        marginLayoutParams.f4002k0 = Integer.MIN_VALUE;
        marginLayoutParams.f4004l0 = 0.5f;
        marginLayoutParams.f4012p0 = new C0326d();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f4138b);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            int i2 = AbstractC0366d.f3959a.get(index);
            switch (i2) {
                case 1:
                    marginLayoutParams.f3980V = obtainStyledAttributes.getInt(index, marginLayoutParams.f3980V);
                    break;
                case 2:
                    int resourceId = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f4011p);
                    marginLayoutParams.f4011p = resourceId;
                    if (resourceId == -1) {
                        marginLayoutParams.f4011p = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    marginLayoutParams.f4013q = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f4013q);
                    break;
                case Platform.INFO /* 4 */:
                    float f2 = obtainStyledAttributes.getFloat(index, marginLayoutParams.f4014r) % 360.0f;
                    marginLayoutParams.f4014r = f2;
                    if (f2 < 0.0f) {
                        marginLayoutParams.f4014r = (360.0f - f2) % 360.0f;
                        break;
                    } else {
                        break;
                    }
                case Platform.WARN /* 5 */:
                    marginLayoutParams.f3985a = obtainStyledAttributes.getDimensionPixelOffset(index, marginLayoutParams.f3985a);
                    break;
                case 6:
                    marginLayoutParams.f3987b = obtainStyledAttributes.getDimensionPixelOffset(index, marginLayoutParams.f3987b);
                    break;
                case 7:
                    marginLayoutParams.f3988c = obtainStyledAttributes.getFloat(index, marginLayoutParams.f3988c);
                    break;
                case 8:
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f3991e);
                    marginLayoutParams.f3991e = resourceId2;
                    if (resourceId2 == -1) {
                        marginLayoutParams.f3991e = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    int resourceId3 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f3993f);
                    marginLayoutParams.f3993f = resourceId3;
                    if (resourceId3 == -1) {
                        marginLayoutParams.f3993f = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    int resourceId4 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f3995g);
                    marginLayoutParams.f3995g = resourceId4;
                    if (resourceId4 == -1) {
                        marginLayoutParams.f3995g = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    int resourceId5 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.h);
                    marginLayoutParams.h = resourceId5;
                    if (resourceId5 == -1) {
                        marginLayoutParams.h = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    int resourceId6 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.i);
                    marginLayoutParams.i = resourceId6;
                    if (resourceId6 == -1) {
                        marginLayoutParams.i = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    int resourceId7 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f3999j);
                    marginLayoutParams.f3999j = resourceId7;
                    if (resourceId7 == -1) {
                        marginLayoutParams.f3999j = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    int resourceId8 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f4001k);
                    marginLayoutParams.f4001k = resourceId8;
                    if (resourceId8 == -1) {
                        marginLayoutParams.f4001k = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    int resourceId9 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f4003l);
                    marginLayoutParams.f4003l = resourceId9;
                    if (resourceId9 == -1) {
                        marginLayoutParams.f4003l = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    int resourceId10 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f4005m);
                    marginLayoutParams.f4005m = resourceId10;
                    if (resourceId10 == -1) {
                        marginLayoutParams.f4005m = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    int resourceId11 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f4015s);
                    marginLayoutParams.f4015s = resourceId11;
                    if (resourceId11 == -1) {
                        marginLayoutParams.f4015s = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 18:
                    int resourceId12 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f4016t);
                    marginLayoutParams.f4016t = resourceId12;
                    if (resourceId12 == -1) {
                        marginLayoutParams.f4016t = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 19:
                    int resourceId13 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f4017u);
                    marginLayoutParams.f4017u = resourceId13;
                    if (resourceId13 == -1) {
                        marginLayoutParams.f4017u = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 20:
                    int resourceId14 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f4018v);
                    marginLayoutParams.f4018v = resourceId14;
                    if (resourceId14 == -1) {
                        marginLayoutParams.f4018v = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 21:
                    marginLayoutParams.f4019w = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f4019w);
                    break;
                case 22:
                    marginLayoutParams.f4020x = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f4020x);
                    break;
                case 23:
                    marginLayoutParams.f4021y = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f4021y);
                    break;
                case 24:
                    marginLayoutParams.f4022z = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f4022z);
                    break;
                case 25:
                    marginLayoutParams.f3960A = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f3960A);
                    break;
                case 26:
                    marginLayoutParams.f3961B = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f3961B);
                    break;
                case 27:
                    marginLayoutParams.f3981W = obtainStyledAttributes.getBoolean(index, marginLayoutParams.f3981W);
                    break;
                case 28:
                    marginLayoutParams.f3982X = obtainStyledAttributes.getBoolean(index, marginLayoutParams.f3982X);
                    break;
                case 29:
                    marginLayoutParams.f3964E = obtainStyledAttributes.getFloat(index, marginLayoutParams.f3964E);
                    break;
                case 30:
                    marginLayoutParams.f3965F = obtainStyledAttributes.getFloat(index, marginLayoutParams.f3965F);
                    break;
                case 31:
                    int i3 = obtainStyledAttributes.getInt(index, 0);
                    marginLayoutParams.f3970L = i3;
                    if (i3 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 32:
                    int i4 = obtainStyledAttributes.getInt(index, 0);
                    marginLayoutParams.f3971M = i4;
                    if (i4 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 33:
                    try {
                        marginLayoutParams.f3972N = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f3972N);
                        break;
                    } catch (Exception unused) {
                        if (obtainStyledAttributes.getInt(index, marginLayoutParams.f3972N) == -2) {
                            marginLayoutParams.f3972N = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 34:
                    try {
                        marginLayoutParams.f3974P = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f3974P);
                        break;
                    } catch (Exception unused2) {
                        if (obtainStyledAttributes.getInt(index, marginLayoutParams.f3974P) == -2) {
                            marginLayoutParams.f3974P = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 35:
                    marginLayoutParams.f3976R = Math.max(0.0f, obtainStyledAttributes.getFloat(index, marginLayoutParams.f3976R));
                    marginLayoutParams.f3970L = 2;
                    break;
                case 36:
                    try {
                        marginLayoutParams.f3973O = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f3973O);
                        break;
                    } catch (Exception unused3) {
                        if (obtainStyledAttributes.getInt(index, marginLayoutParams.f3973O) == -2) {
                            marginLayoutParams.f3973O = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 37:
                    try {
                        marginLayoutParams.f3975Q = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f3975Q);
                        break;
                    } catch (Exception unused4) {
                        if (obtainStyledAttributes.getInt(index, marginLayoutParams.f3975Q) == -2) {
                            marginLayoutParams.f3975Q = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 38:
                    marginLayoutParams.f3977S = Math.max(0.0f, obtainStyledAttributes.getFloat(index, marginLayoutParams.f3977S));
                    marginLayoutParams.f3971M = 2;
                    break;
                default:
                    switch (i2) {
                        case 44:
                            n.h(marginLayoutParams, obtainStyledAttributes.getString(index));
                            break;
                        case 45:
                            marginLayoutParams.f3966H = obtainStyledAttributes.getFloat(index, marginLayoutParams.f3966H);
                            break;
                        case 46:
                            marginLayoutParams.f3967I = obtainStyledAttributes.getFloat(index, marginLayoutParams.f3967I);
                            break;
                        case 47:
                            marginLayoutParams.f3968J = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            marginLayoutParams.f3969K = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            marginLayoutParams.f3978T = obtainStyledAttributes.getDimensionPixelOffset(index, marginLayoutParams.f3978T);
                            break;
                        case 50:
                            marginLayoutParams.f3979U = obtainStyledAttributes.getDimensionPixelOffset(index, marginLayoutParams.f3979U);
                            break;
                        case 51:
                            marginLayoutParams.f3983Y = obtainStyledAttributes.getString(index);
                            break;
                        case 52:
                            int resourceId15 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f4007n);
                            marginLayoutParams.f4007n = resourceId15;
                            if (resourceId15 == -1) {
                                marginLayoutParams.f4007n = obtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            int resourceId16 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f4009o);
                            marginLayoutParams.f4009o = resourceId16;
                            if (resourceId16 == -1) {
                                marginLayoutParams.f4009o = obtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            marginLayoutParams.f3963D = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f3963D);
                            break;
                        case 55:
                            marginLayoutParams.f3962C = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f3962C);
                            break;
                        default:
                            switch (i2) {
                                case 64:
                                    n.g(marginLayoutParams, obtainStyledAttributes, index, 0);
                                    break;
                                case 65:
                                    n.g(marginLayoutParams, obtainStyledAttributes, index, 1);
                                    break;
                                case 66:
                                    marginLayoutParams.f3984Z = obtainStyledAttributes.getInt(index, marginLayoutParams.f3984Z);
                                    break;
                                case 67:
                                    marginLayoutParams.d = obtainStyledAttributes.getBoolean(index, marginLayoutParams.d);
                                    break;
                            }
                    }
            }
        }
        obtainStyledAttributes.recycle();
        marginLayoutParams.a();
        return marginLayoutParams;
    }

    public int getMaxHeight() {
        return this.f1468g;
    }

    public int getMaxWidth() {
        return this.f1467f;
    }

    public int getMinHeight() {
        return this.f1466e;
    }

    public int getMinWidth() {
        return this.d;
    }

    public int getOptimizationLevel() {
        return this.f1465c.f3755D0;
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        C0327e c0327e = this.f1465c;
        if (c0327e.f3728j == null) {
            int id2 = getId();
            if (id2 != -1) {
                c0327e.f3728j = getContext().getResources().getResourceEntryName(id2);
            } else {
                c0327e.f3728j = "parent";
            }
        }
        if (c0327e.f3726h0 == null) {
            c0327e.f3726h0 = c0327e.f3728j;
            Log.v("ConstraintLayout", " setDebugName " + c0327e.f3726h0);
        }
        Iterator it = c0327e.f3763q0.iterator();
        while (it.hasNext()) {
            C0326d c0326d = (C0326d) it.next();
            View view = c0326d.f3723f0;
            if (view != null) {
                if (c0326d.f3728j == null && (id = view.getId()) != -1) {
                    c0326d.f3728j = getContext().getResources().getResourceEntryName(id);
                }
                if (c0326d.f3726h0 == null) {
                    c0326d.f3726h0 = c0326d.f3728j;
                    Log.v("ConstraintLayout", " setDebugName " + c0326d.f3726h0);
                }
            }
        }
        c0327e.n(sb);
        return sb.toString();
    }

    public final C0326d h(View view) {
        if (view == this) {
            return this.f1465c;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof C0367e) {
            return ((C0367e) view.getLayoutParams()).f4012p0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof C0367e) {
            return ((C0367e) view.getLayoutParams()).f4012p0;
        }
        return null;
    }

    public final void i(AttributeSet attributeSet, int i) {
        C0327e c0327e = this.f1465c;
        c0327e.f3723f0 = this;
        C0368f c0368f = this.f1474o;
        c0327e.f3766u0 = c0368f;
        c0327e.f3764s0.f3901f = c0368f;
        this.f1463a.put(getId(), this);
        this.f1469j = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, r.f4138b, i, 0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 16) {
                    this.d = obtainStyledAttributes.getDimensionPixelOffset(index, this.d);
                } else if (index == 17) {
                    this.f1466e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1466e);
                } else if (index == 14) {
                    this.f1467f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1467f);
                } else if (index == 15) {
                    this.f1468g = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1468g);
                } else if (index == 113) {
                    this.i = obtainStyledAttributes.getInt(index, this.i);
                } else if (index == 56) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            j(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f1470k = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        n nVar = new n();
                        this.f1469j = nVar;
                        nVar.e(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f1469j = null;
                    }
                    this.f1471l = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        c0327e.f3755D0 = this.i;
        C0317c.f3555q = c0327e.W(512);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x003d. Please report as an issue. */
    public final void j(int i) {
        int eventType;
        k kVar;
        Context context = getContext();
        j jVar = new j(17, false);
        jVar.f60b = new SparseArray();
        jVar.f61c = new SparseArray();
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            eventType = xml.getEventType();
            kVar = null;
        } catch (IOException e2) {
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i, e2);
        } catch (XmlPullParserException e3) {
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i, e3);
        }
        while (true) {
            char c2 = 1;
            if (eventType == 1) {
                this.f1470k = jVar;
                return;
            }
            if (eventType == 2) {
                String name = xml.getName();
                switch (name.hashCode()) {
                    case -1349929691:
                        if (name.equals("ConstraintSet")) {
                            c2 = 4;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 80204913:
                        if (name.equals("State")) {
                            c2 = 2;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1382829617:
                        if (name.equals("StateSet")) {
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1657696882:
                        if (name.equals("layoutDescription")) {
                            c2 = 0;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1901439077:
                        if (name.equals("Variant")) {
                            c2 = 3;
                            break;
                        }
                        c2 = 65535;
                        break;
                    default:
                        c2 = 65535;
                        break;
                }
                if (c2 == 2) {
                    k kVar2 = new k(context, xml);
                    ((SparseArray) jVar.f60b).put(kVar2.f1909b, kVar2);
                    kVar = kVar2;
                } else if (c2 == 3) {
                    C0369g c0369g = new C0369g(context, xml);
                    if (kVar != null) {
                        ((ArrayList) kVar.f1908a).add(c0369g);
                    }
                } else if (c2 == 4) {
                    jVar.E(context, xml);
                }
            }
            eventType = xml.next();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0336  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(t.C0327e r25, int r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 1720
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.k(t.e, int, int, int):void");
    }

    public final void l(C0326d c0326d, C0367e c0367e, SparseArray sparseArray, int i, int i2) {
        View view = (View) this.f1463a.get(i);
        C0326d c0326d2 = (C0326d) sparseArray.get(i);
        if (c0326d2 == null || view == null || !(view.getLayoutParams() instanceof C0367e)) {
            return;
        }
        c0367e.f3989c0 = true;
        if (i2 == 6) {
            C0367e c0367e2 = (C0367e) view.getLayoutParams();
            c0367e2.f3989c0 = true;
            c0367e2.f4012p0.f3693E = true;
        }
        c0326d.i(6).b(c0326d2.i(i2), c0367e.f3963D, c0367e.f3962C, true);
        c0326d.f3693E = true;
        c0326d.i(3).j();
        c0326d.i(5).j();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            C0367e c0367e = (C0367e) childAt.getLayoutParams();
            C0326d c0326d = c0367e.f4012p0;
            if (childAt.getVisibility() != 8 || c0367e.f3990d0 || c0367e.f3992e0 || isInEditMode) {
                int r2 = c0326d.r();
                int s2 = c0326d.s();
                childAt.layout(r2, s2, c0326d.q() + r2, c0326d.k() + s2);
            }
        }
        ArrayList arrayList = this.f1464b;
        int size = arrayList.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                ((AbstractC0365c) arrayList.get(i6)).getClass();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:278:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0341  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r35, int r36) {
        /*
            Method dump skipped, instructions count: 1548
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        C0326d h = h(view);
        if ((view instanceof p) && !(h instanceof h)) {
            C0367e c0367e = (C0367e) view.getLayoutParams();
            h hVar = new h();
            c0367e.f4012p0 = hVar;
            c0367e.f3990d0 = true;
            hVar.S(c0367e.f3980V);
        }
        if (view instanceof AbstractC0365c) {
            AbstractC0365c abstractC0365c = (AbstractC0365c) view;
            abstractC0365c.i();
            ((C0367e) view.getLayoutParams()).f3992e0 = true;
            ArrayList arrayList = this.f1464b;
            if (!arrayList.contains(abstractC0365c)) {
                arrayList.add(abstractC0365c);
            }
        }
        this.f1463a.put(view.getId(), view);
        this.h = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f1463a.remove(view.getId());
        C0326d h = h(view);
        this.f1465c.f3763q0.remove(h);
        h.C();
        this.f1464b.remove(view);
        this.h = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.h = true;
        super.requestLayout();
    }

    public void setConstraintSet(n nVar) {
        this.f1469j = nVar;
    }

    @Override // android.view.View
    public void setId(int i) {
        int id = getId();
        SparseArray sparseArray = this.f1463a;
        sparseArray.remove(id);
        super.setId(i);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.f1468g) {
            return;
        }
        this.f1468g = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.f1467f) {
            return;
        }
        this.f1467f = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.f1466e) {
            return;
        }
        this.f1466e = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.d) {
            return;
        }
        this.d = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(o oVar) {
        j jVar = this.f1470k;
        if (jVar != null) {
            jVar.getClass();
        }
    }

    public void setOptimizationLevel(int i) {
        this.i = i;
        C0327e c0327e = this.f1465c;
        c0327e.f3755D0 = i;
        C0317c.f3555q = c0327e.W(512);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1463a = new SparseArray();
        this.f1464b = new ArrayList(4);
        this.f1465c = new C0327e();
        this.d = 0;
        this.f1466e = 0;
        this.f1467f = Integer.MAX_VALUE;
        this.f1468g = Integer.MAX_VALUE;
        this.h = true;
        this.i = 257;
        this.f1469j = null;
        this.f1470k = null;
        this.f1471l = -1;
        this.f1472m = new HashMap();
        this.f1473n = new SparseArray();
        this.f1474o = new C0368f(this, this);
        i(attributeSet, i);
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams, w.e] */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(layoutParams);
        marginLayoutParams.f3985a = -1;
        marginLayoutParams.f3987b = -1;
        marginLayoutParams.f3988c = -1.0f;
        marginLayoutParams.d = true;
        marginLayoutParams.f3991e = -1;
        marginLayoutParams.f3993f = -1;
        marginLayoutParams.f3995g = -1;
        marginLayoutParams.h = -1;
        marginLayoutParams.i = -1;
        marginLayoutParams.f3999j = -1;
        marginLayoutParams.f4001k = -1;
        marginLayoutParams.f4003l = -1;
        marginLayoutParams.f4005m = -1;
        marginLayoutParams.f4007n = -1;
        marginLayoutParams.f4009o = -1;
        marginLayoutParams.f4011p = -1;
        marginLayoutParams.f4013q = 0;
        marginLayoutParams.f4014r = 0.0f;
        marginLayoutParams.f4015s = -1;
        marginLayoutParams.f4016t = -1;
        marginLayoutParams.f4017u = -1;
        marginLayoutParams.f4018v = -1;
        marginLayoutParams.f4019w = Integer.MIN_VALUE;
        marginLayoutParams.f4020x = Integer.MIN_VALUE;
        marginLayoutParams.f4021y = Integer.MIN_VALUE;
        marginLayoutParams.f4022z = Integer.MIN_VALUE;
        marginLayoutParams.f3960A = Integer.MIN_VALUE;
        marginLayoutParams.f3961B = Integer.MIN_VALUE;
        marginLayoutParams.f3962C = Integer.MIN_VALUE;
        marginLayoutParams.f3963D = 0;
        marginLayoutParams.f3964E = 0.5f;
        marginLayoutParams.f3965F = 0.5f;
        marginLayoutParams.G = null;
        marginLayoutParams.f3966H = -1.0f;
        marginLayoutParams.f3967I = -1.0f;
        marginLayoutParams.f3968J = 0;
        marginLayoutParams.f3969K = 0;
        marginLayoutParams.f3970L = 0;
        marginLayoutParams.f3971M = 0;
        marginLayoutParams.f3972N = 0;
        marginLayoutParams.f3973O = 0;
        marginLayoutParams.f3974P = 0;
        marginLayoutParams.f3975Q = 0;
        marginLayoutParams.f3976R = 1.0f;
        marginLayoutParams.f3977S = 1.0f;
        marginLayoutParams.f3978T = -1;
        marginLayoutParams.f3979U = -1;
        marginLayoutParams.f3980V = -1;
        marginLayoutParams.f3981W = false;
        marginLayoutParams.f3982X = false;
        marginLayoutParams.f3983Y = null;
        marginLayoutParams.f3984Z = 0;
        marginLayoutParams.f3986a0 = true;
        marginLayoutParams.b0 = true;
        marginLayoutParams.f3989c0 = false;
        marginLayoutParams.f3990d0 = false;
        marginLayoutParams.f3992e0 = false;
        marginLayoutParams.f3994f0 = -1;
        marginLayoutParams.f3996g0 = -1;
        marginLayoutParams.f3997h0 = -1;
        marginLayoutParams.f3998i0 = -1;
        marginLayoutParams.f4000j0 = Integer.MIN_VALUE;
        marginLayoutParams.f4002k0 = Integer.MIN_VALUE;
        marginLayoutParams.f4004l0 = 0.5f;
        marginLayoutParams.f4012p0 = new C0326d();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) marginLayoutParams).leftMargin = marginLayoutParams2.leftMargin;
            ((ViewGroup.MarginLayoutParams) marginLayoutParams).rightMargin = marginLayoutParams2.rightMargin;
            ((ViewGroup.MarginLayoutParams) marginLayoutParams).topMargin = marginLayoutParams2.topMargin;
            ((ViewGroup.MarginLayoutParams) marginLayoutParams).bottomMargin = marginLayoutParams2.bottomMargin;
            marginLayoutParams.setMarginStart(marginLayoutParams2.getMarginStart());
            marginLayoutParams.setMarginEnd(marginLayoutParams2.getMarginEnd());
        }
        if (!(layoutParams instanceof C0367e)) {
            return marginLayoutParams;
        }
        C0367e c0367e = (C0367e) layoutParams;
        marginLayoutParams.f3985a = c0367e.f3985a;
        marginLayoutParams.f3987b = c0367e.f3987b;
        marginLayoutParams.f3988c = c0367e.f3988c;
        marginLayoutParams.d = c0367e.d;
        marginLayoutParams.f3991e = c0367e.f3991e;
        marginLayoutParams.f3993f = c0367e.f3993f;
        marginLayoutParams.f3995g = c0367e.f3995g;
        marginLayoutParams.h = c0367e.h;
        marginLayoutParams.i = c0367e.i;
        marginLayoutParams.f3999j = c0367e.f3999j;
        marginLayoutParams.f4001k = c0367e.f4001k;
        marginLayoutParams.f4003l = c0367e.f4003l;
        marginLayoutParams.f4005m = c0367e.f4005m;
        marginLayoutParams.f4007n = c0367e.f4007n;
        marginLayoutParams.f4009o = c0367e.f4009o;
        marginLayoutParams.f4011p = c0367e.f4011p;
        marginLayoutParams.f4013q = c0367e.f4013q;
        marginLayoutParams.f4014r = c0367e.f4014r;
        marginLayoutParams.f4015s = c0367e.f4015s;
        marginLayoutParams.f4016t = c0367e.f4016t;
        marginLayoutParams.f4017u = c0367e.f4017u;
        marginLayoutParams.f4018v = c0367e.f4018v;
        marginLayoutParams.f4019w = c0367e.f4019w;
        marginLayoutParams.f4020x = c0367e.f4020x;
        marginLayoutParams.f4021y = c0367e.f4021y;
        marginLayoutParams.f4022z = c0367e.f4022z;
        marginLayoutParams.f3960A = c0367e.f3960A;
        marginLayoutParams.f3961B = c0367e.f3961B;
        marginLayoutParams.f3962C = c0367e.f3962C;
        marginLayoutParams.f3963D = c0367e.f3963D;
        marginLayoutParams.f3964E = c0367e.f3964E;
        marginLayoutParams.f3965F = c0367e.f3965F;
        marginLayoutParams.G = c0367e.G;
        marginLayoutParams.f3966H = c0367e.f3966H;
        marginLayoutParams.f3967I = c0367e.f3967I;
        marginLayoutParams.f3968J = c0367e.f3968J;
        marginLayoutParams.f3969K = c0367e.f3969K;
        marginLayoutParams.f3981W = c0367e.f3981W;
        marginLayoutParams.f3982X = c0367e.f3982X;
        marginLayoutParams.f3970L = c0367e.f3970L;
        marginLayoutParams.f3971M = c0367e.f3971M;
        marginLayoutParams.f3972N = c0367e.f3972N;
        marginLayoutParams.f3974P = c0367e.f3974P;
        marginLayoutParams.f3973O = c0367e.f3973O;
        marginLayoutParams.f3975Q = c0367e.f3975Q;
        marginLayoutParams.f3976R = c0367e.f3976R;
        marginLayoutParams.f3977S = c0367e.f3977S;
        marginLayoutParams.f3978T = c0367e.f3978T;
        marginLayoutParams.f3979U = c0367e.f3979U;
        marginLayoutParams.f3980V = c0367e.f3980V;
        marginLayoutParams.f3986a0 = c0367e.f3986a0;
        marginLayoutParams.b0 = c0367e.b0;
        marginLayoutParams.f3989c0 = c0367e.f3989c0;
        marginLayoutParams.f3990d0 = c0367e.f3990d0;
        marginLayoutParams.f3994f0 = c0367e.f3994f0;
        marginLayoutParams.f3996g0 = c0367e.f3996g0;
        marginLayoutParams.f3997h0 = c0367e.f3997h0;
        marginLayoutParams.f3998i0 = c0367e.f3998i0;
        marginLayoutParams.f4000j0 = c0367e.f4000j0;
        marginLayoutParams.f4002k0 = c0367e.f4002k0;
        marginLayoutParams.f4004l0 = c0367e.f4004l0;
        marginLayoutParams.f3983Y = c0367e.f3983Y;
        marginLayoutParams.f3984Z = c0367e.f3984Z;
        marginLayoutParams.f4012p0 = c0367e.f4012p0;
        return marginLayoutParams;
    }
}
