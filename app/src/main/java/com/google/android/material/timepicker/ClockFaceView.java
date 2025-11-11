package com.google.android.material.timepicker;

import L.S;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.android.music.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import w.C0371i;
import w.C0372j;
import w.n;
import w0.AbstractC0373a;

/* loaded from: classes.dex */
class ClockFaceView extends e implements d {

    /* renamed from: A, reason: collision with root package name */
    public final float[] f2067A;

    /* renamed from: B, reason: collision with root package name */
    public final int f2068B;

    /* renamed from: C, reason: collision with root package name */
    public final int f2069C;

    /* renamed from: D, reason: collision with root package name */
    public final int f2070D;

    /* renamed from: E, reason: collision with root package name */
    public final int f2071E;

    /* renamed from: F, reason: collision with root package name */
    public final String[] f2072F;
    public float G;

    /* renamed from: H, reason: collision with root package name */
    public final ColorStateList f2073H;

    /* renamed from: t, reason: collision with root package name */
    public final ClockHandView f2074t;

    /* renamed from: u, reason: collision with root package name */
    public final Rect f2075u;

    /* renamed from: v, reason: collision with root package name */
    public final RectF f2076v;

    /* renamed from: w, reason: collision with root package name */
    public final Rect f2077w;

    /* renamed from: x, reason: collision with root package name */
    public final SparseArray f2078x;

    /* renamed from: y, reason: collision with root package name */
    public final c f2079y;

    /* renamed from: z, reason: collision with root package name */
    public final int[] f2080z;

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2075u = new Rect();
        this.f2076v = new RectF();
        this.f2077w = new Rect();
        SparseArray sparseArray = new SparseArray();
        this.f2078x = sparseArray;
        this.f2067A = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0373a.f4154f, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList x2 = Z0.i.x(context, obtainStyledAttributes, 1);
        this.f2073H = x2;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.f2074t = clockHandView;
        this.f2068B = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = x2.getColorForState(new int[]{android.R.attr.state_selected}, x2.getDefaultColor());
        this.f2080z = new int[]{colorForState, colorForState, x2.getDefaultColor()};
        clockHandView.f2083c.add(this);
        int defaultColor = Z0.i.v(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList x3 = Z0.i.x(context, obtainStyledAttributes, 0);
        setBackgroundColor(x3 != null ? x3.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new b(this));
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.f2079y = new c(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.f2072F = strArr;
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        boolean z2 = false;
        for (int i = 0; i < Math.max(this.f2072F.length, size); i++) {
            TextView textView = (TextView) sparseArray.get(i);
            if (i >= this.f2072F.length) {
                removeView(textView);
                sparseArray.remove(i);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i, textView);
                    addView(textView);
                }
                textView.setText(this.f2072F[i]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i));
                int i2 = (i / 12) + 1;
                textView.setTag(R.id.material_clock_level, Integer.valueOf(i2));
                z2 = i2 > 1 ? true : z2;
                S.h(textView, this.f2079y);
                textView.setTextColor(this.f2073H);
            }
        }
        ClockHandView clockHandView2 = this.f2074t;
        if (clockHandView2.f2082b && !z2) {
            clockHandView2.f2090m = 1;
        }
        clockHandView2.f2082b = z2;
        clockHandView2.invalidate();
        this.f2069C = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.f2070D = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.f2071E = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    @Override // com.google.android.material.timepicker.e
    public final void m() {
        n nVar = new n();
        nVar.b(this);
        HashMap hashMap = new HashMap();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int i2 = (Integer) childAt.getTag(R.id.material_clock_level);
                if (i2 == null) {
                    i2 = 1;
                }
                if (!hashMap.containsKey(i2)) {
                    hashMap.put(i2, new ArrayList());
                }
                ((List) hashMap.get(i2)).add(childAt);
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            List list = (List) entry.getValue();
            int round = ((Integer) entry.getKey()).intValue() == 2 ? Math.round(this.f2096r * 0.66f) : this.f2096r;
            Iterator it = list.iterator();
            float f2 = 0.0f;
            while (it.hasNext()) {
                int id = ((View) it.next()).getId();
                HashMap hashMap2 = nVar.f4135c;
                if (!hashMap2.containsKey(Integer.valueOf(id))) {
                    hashMap2.put(Integer.valueOf(id), new C0371i());
                }
                C0372j c0372j = ((C0371i) hashMap2.get(Integer.valueOf(id))).d;
                c0372j.f4109z = R.id.circle_center;
                c0372j.f4048A = round;
                c0372j.f4049B = f2;
                f2 += 360.0f / list.size();
            }
        }
        nVar.a(this);
        setConstraintSet(null);
        requestLayout();
        int i3 = 0;
        while (true) {
            SparseArray sparseArray = this.f2078x;
            if (i3 >= sparseArray.size()) {
                return;
            }
            ((TextView) sparseArray.get(i3)).setVisibility(0);
            i3++;
        }
    }

    public final void n() {
        SparseArray sparseArray;
        RectF rectF;
        Rect rect;
        RectF rectF2 = this.f2074t.f2086g;
        float f2 = Float.MAX_VALUE;
        TextView textView = null;
        int i = 0;
        while (true) {
            sparseArray = this.f2078x;
            int size = sparseArray.size();
            rectF = this.f2076v;
            rect = this.f2075u;
            if (i >= size) {
                break;
            }
            TextView textView2 = (TextView) sparseArray.get(i);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(rectF2);
                float height = rectF.height() * rectF.width();
                if (height < f2) {
                    textView = textView2;
                    f2 = height;
                }
            }
            i++;
        }
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            TextView textView3 = (TextView) sparseArray.get(i2);
            if (textView3 != null) {
                textView3.setSelected(textView3 == textView);
                textView3.getHitRect(rect);
                rectF.set(rect);
                textView3.getLineBounds(0, this.f2077w);
                rectF.inset(r8.left, r8.top);
                textView3.getPaint().setShader(!RectF.intersects(rectF2, rectF) ? null : new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.f2080z, this.f2067A, Shader.TileMode.CLAMP));
                textView3.invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, this.f2072F.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        super.onLayout(z2, i, i2, i3, i4);
        n();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int max = (int) (this.f2071E / Math.max(Math.max(this.f2069C / displayMetrics.heightPixels, this.f2070D / displayMetrics.widthPixels), 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        setMeasuredDimension(max, max);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }
}
