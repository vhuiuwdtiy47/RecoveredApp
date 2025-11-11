package l;

import L.C0016l;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import f.AbstractC0117a;
import java.util.WeakHashMap;

/* renamed from: l.v0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0264v0 extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3162a;

    /* renamed from: b, reason: collision with root package name */
    public int f3163b;

    /* renamed from: c, reason: collision with root package name */
    public int f3164c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f3165e;

    /* renamed from: f, reason: collision with root package name */
    public int f3166f;

    /* renamed from: g, reason: collision with root package name */
    public float f3167g;
    public boolean h;
    public int[] i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f3168j;

    /* renamed from: k, reason: collision with root package name */
    public Drawable f3169k;

    /* renamed from: l, reason: collision with root package name */
    public int f3170l;

    /* renamed from: m, reason: collision with root package name */
    public int f3171m;

    /* renamed from: n, reason: collision with root package name */
    public int f3172n;

    /* renamed from: o, reason: collision with root package name */
    public int f3173o;

    public AbstractC0264v0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f3162a = true;
        this.f3163b = -1;
        this.f3164c = 0;
        this.f3165e = 8388659;
        int[] iArr = AbstractC0117a.f2245n;
        C0016l s2 = C0016l.s(context, attributeSet, iArr, 0);
        WeakHashMap weakHashMap = L.S.f311a;
        L.M.d(this, context, iArr, attributeSet, (TypedArray) s2.f362c, 0, 0);
        TypedArray typedArray = (TypedArray) s2.f362c;
        int i = typedArray.getInt(1, -1);
        if (i >= 0) {
            setOrientation(i);
        }
        int i2 = typedArray.getInt(0, -1);
        if (i2 >= 0) {
            setGravity(i2);
        }
        boolean z2 = typedArray.getBoolean(2, true);
        if (!z2) {
            setBaselineAligned(z2);
        }
        this.f3167g = typedArray.getFloat(4, -1.0f);
        this.f3163b = typedArray.getInt(3, -1);
        this.h = typedArray.getBoolean(7, false);
        setDividerDrawable(s2.h(5));
        this.f3172n = typedArray.getInt(8, 0);
        this.f3173o = typedArray.getDimensionPixelSize(6, 0);
        s2.u();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0262u0;
    }

    public final void d(Canvas canvas, int i) {
        this.f3169k.setBounds(getPaddingLeft() + this.f3173o, i, (getWidth() - getPaddingRight()) - this.f3173o, this.f3171m + i);
        this.f3169k.draw(canvas);
    }

    public final void e(Canvas canvas, int i) {
        this.f3169k.setBounds(i, getPaddingTop() + this.f3173o, this.f3170l + i, (getHeight() - getPaddingBottom()) - this.f3173o);
        this.f3169k.draw(canvas);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [android.widget.LinearLayout$LayoutParams, l.u0] */
    /* JADX WARN: Type inference failed for: r2v4, types: [android.widget.LinearLayout$LayoutParams, l.u0] */
    @Override // android.view.ViewGroup
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public C0262u0 generateDefaultLayoutParams() {
        int i = this.d;
        if (i == 0) {
            return new LinearLayout.LayoutParams(-2, -2);
        }
        if (i == 1) {
            return new LinearLayout.LayoutParams(-1, -2);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.widget.LinearLayout$LayoutParams, l.u0] */
    @Override // android.view.ViewGroup
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public C0262u0 generateLayoutParams(AttributeSet attributeSet) {
        return new LinearLayout.LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.f3163b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.f3163b;
        if (childCount <= i2) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i2);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f3163b == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int i3 = this.f3164c;
        if (this.d == 1 && (i = this.f3165e & 112) != 48) {
            if (i == 16) {
                i3 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f3166f) / 2;
            } else if (i == 80) {
                i3 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f3166f;
            }
        }
        return i3 + ((LinearLayout.LayoutParams) ((C0262u0) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f3163b;
    }

    public Drawable getDividerDrawable() {
        return this.f3169k;
    }

    public int getDividerPadding() {
        return this.f3173o;
    }

    public int getDividerWidth() {
        return this.f3170l;
    }

    public int getGravity() {
        return this.f3165e;
    }

    public int getOrientation() {
        return this.d;
    }

    public int getShowDividers() {
        return this.f3172n;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f3167g;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.widget.LinearLayout$LayoutParams, l.u0] */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.widget.LinearLayout$LayoutParams, l.u0] */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.widget.LinearLayout$LayoutParams, l.u0] */
    @Override // android.view.ViewGroup
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public C0262u0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0262u0 ? new LinearLayout.LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new LinearLayout.LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LinearLayout.LayoutParams(layoutParams);
    }

    public final boolean i(int i) {
        if (i == 0) {
            return (this.f3172n & 1) != 0;
        }
        if (i == getChildCount()) {
            return (this.f3172n & 4) != 0;
        }
        if ((this.f3172n & 2) != 0) {
            for (int i2 = i - 1; i2 >= 0; i2--) {
                if (getChildAt(i2).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i;
        if (this.f3169k == null) {
            return;
        }
        int i2 = 0;
        if (this.d == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i2 < virtualChildCount) {
                View childAt = getChildAt(i2);
                if (childAt != null && childAt.getVisibility() != 8 && i(i2)) {
                    d(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((C0262u0) childAt.getLayoutParams())).topMargin) - this.f3171m);
                }
                i2++;
            }
            if (i(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                d(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.f3171m : childAt2.getBottom() + ((LinearLayout.LayoutParams) ((C0262u0) childAt2.getLayoutParams())).bottomMargin);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean z2 = getLayoutDirection() == 1;
        while (i2 < virtualChildCount2) {
            View childAt3 = getChildAt(i2);
            if (childAt3 != null && childAt3.getVisibility() != 8 && i(i2)) {
                C0262u0 c0262u0 = (C0262u0) childAt3.getLayoutParams();
                e(canvas, z2 ? childAt3.getRight() + ((LinearLayout.LayoutParams) c0262u0).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) c0262u0).leftMargin) - this.f3170l);
            }
            i2++;
        }
        if (i(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                C0262u0 c0262u02 = (C0262u0) childAt4.getLayoutParams();
                if (z2) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) c0262u02).leftMargin;
                    i = this.f3170l;
                    right = left - i;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) c0262u02).rightMargin;
                }
            } else if (z2) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i = this.f3170l;
                right = left - i;
            }
            e(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x018f  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r23, int r24, int r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 459
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractC0264v0.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:222:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0148  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r39, int r40) {
        /*
            Method dump skipped, instructions count: 2151
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractC0264v0.onMeasure(int, int):void");
    }

    public void setBaselineAligned(boolean z2) {
        this.f3162a = z2;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i >= 0 && i < getChildCount()) {
            this.f3163b = i;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f3169k) {
            return;
        }
        this.f3169k = drawable;
        if (drawable != null) {
            this.f3170l = drawable.getIntrinsicWidth();
            this.f3171m = drawable.getIntrinsicHeight();
        } else {
            this.f3170l = 0;
            this.f3171m = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.f3173o = i;
    }

    public void setGravity(int i) {
        if (this.f3165e != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f3165e = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.f3165e;
        if ((8388615 & i3) != i2) {
            this.f3165e = i2 | ((-8388616) & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z2) {
        this.h = z2;
    }

    public void setOrientation(int i) {
        if (this.d != i) {
            this.d = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.f3172n) {
            requestLayout();
        }
        this.f3172n = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.f3165e;
        if ((i3 & 112) != i2) {
            this.f3165e = i2 | (i3 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f2) {
        this.f3167g = Math.max(0.0f, f2);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
