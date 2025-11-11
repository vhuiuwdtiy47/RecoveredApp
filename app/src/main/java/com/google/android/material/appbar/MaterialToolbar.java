package com.google.android.material.appbar;

import L.G;
import L.S;
import M0.m;
import M0.n;
import T0.g;
import Y0.a;
import Z0.i;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.android.music.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import w0.AbstractC0373a;

/* loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {

    /* renamed from: W, reason: collision with root package name */
    public static final ImageView.ScaleType[] f1762W = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* renamed from: R, reason: collision with root package name */
    public Integer f1763R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f1764S;

    /* renamed from: T, reason: collision with root package name */
    public boolean f1765T;

    /* renamed from: U, reason: collision with root package name */
    public ImageView.ScaleType f1766U;

    /* renamed from: V, reason: collision with root package name */
    public Boolean f1767V;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar), attributeSet, 0);
        Context context2 = getContext();
        TypedArray g2 = m.g(context2, attributeSet, AbstractC0373a.f4167u, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar, new int[0]);
        if (g2.hasValue(2)) {
            setNavigationIconTint(g2.getColor(2, -1));
        }
        this.f1764S = g2.getBoolean(4, false);
        this.f1765T = g2.getBoolean(3, false);
        int i = g2.getInt(1, -1);
        if (i >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f1762W;
            if (i < scaleTypeArr.length) {
                this.f1766U = scaleTypeArr[i];
            }
        }
        if (g2.hasValue(0)) {
            this.f1767V = Boolean.valueOf(g2.getBoolean(0, false));
        }
        g2.recycle();
        Drawable background = getBackground();
        ColorStateList valueOf = background == null ? ColorStateList.valueOf(0) : i.y(background);
        if (valueOf != null) {
            g gVar = new g();
            gVar.j(valueOf);
            gVar.h(context2);
            WeakHashMap weakHashMap = S.f311a;
            gVar.i(G.i(this));
            setBackground(gVar);
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f1766U;
    }

    public Integer getNavigationIconTint() {
        return this.f1763R;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public final void m(int i) {
        Menu menu = getMenu();
        boolean z2 = menu instanceof k.m;
        if (z2) {
            ((k.m) menu).w();
        }
        super.m(i);
        if (z2) {
            ((k.m) menu).v();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof g) {
            i.h0(this, (g) background);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z2, i, i2, i3, i4);
        int i5 = 0;
        ImageView imageView2 = null;
        if (this.f1764S || this.f1765T) {
            ArrayList e2 = m.e(this, getTitle());
            boolean isEmpty = e2.isEmpty();
            n nVar = m.f498c;
            TextView textView = isEmpty ? null : (TextView) Collections.min(e2, nVar);
            ArrayList e3 = m.e(this, getSubtitle());
            TextView textView2 = e3.isEmpty() ? null : (TextView) Collections.max(e3, nVar);
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i6 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i7 = 0; i7 < getChildCount(); i7++) {
                    View childAt = getChildAt(i7);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i6 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i6 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.f1764S && textView != null) {
                    v(textView, pair);
                }
                if (this.f1765T && textView2 != null) {
                    v(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            while (true) {
                if (i5 >= getChildCount()) {
                    break;
                }
                View childAt2 = getChildAt(i5);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
                i5++;
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.f1767V;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f1766U;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        Drawable background = getBackground();
        if (background instanceof g) {
            ((g) background).i(f2);
        }
    }

    public void setLogoAdjustViewBounds(boolean z2) {
        Boolean bool = this.f1767V;
        if (bool == null || bool.booleanValue() != z2) {
            this.f1767V = Boolean.valueOf(z2);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f1766U != scaleType) {
            this.f1766U = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.f1763R != null) {
            drawable = drawable.mutate();
            E.a.g(drawable, this.f1763R.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i) {
        this.f1763R = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z2) {
        if (this.f1765T != z2) {
            this.f1765T = z2;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z2) {
        if (this.f1764S != z2) {
            this.f1764S = z2;
            requestLayout();
        }
    }

    public final void v(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i2 = measuredWidth2 + i;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i, 0), Math.max(i2 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i += max;
            i2 -= max;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i2 - i, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i, textView.getTop(), i2, textView.getBottom());
    }
}
