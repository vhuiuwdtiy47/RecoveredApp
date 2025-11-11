package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import f.AbstractC0117a;
import k.AbstractC0169c;
import k.C0168b;
import k.l;
import k.m;
import k.o;
import k.z;
import l.C0224b0;
import l.InterfaceC0245m;
import l.c1;

/* loaded from: classes.dex */
public class ActionMenuItemView extends C0224b0 implements z, View.OnClickListener, InterfaceC0245m {

    /* renamed from: g, reason: collision with root package name */
    public o f1319g;
    public CharSequence h;
    public Drawable i;

    /* renamed from: j, reason: collision with root package name */
    public l f1320j;

    /* renamed from: k, reason: collision with root package name */
    public C0168b f1321k;

    /* renamed from: l, reason: collision with root package name */
    public AbstractC0169c f1322l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1323m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1324n;

    /* renamed from: o, reason: collision with root package name */
    public final int f1325o;

    /* renamed from: p, reason: collision with root package name */
    public int f1326p;

    /* renamed from: q, reason: collision with root package name */
    public final int f1327q;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f1323m = h();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0117a.f2237c, 0, 0);
        this.f1325o = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.f1327q = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f1326p = -1;
        setSaveEnabled(false);
    }

    @Override // k.z
    public final void a(o oVar) {
        this.f1319g = oVar;
        setIcon(oVar.getIcon());
        setTitle(oVar.getTitleCondensed());
        setId(oVar.f2865a);
        setVisibility(oVar.isVisible() ? 0 : 8);
        setEnabled(oVar.isEnabled());
        if (oVar.hasSubMenu() && this.f1321k == null) {
            this.f1321k = new C0168b(this);
        }
    }

    @Override // l.InterfaceC0245m
    public final boolean b() {
        return !TextUtils.isEmpty(getText()) && this.f1319g.getIcon() == null;
    }

    @Override // l.InterfaceC0245m
    public final boolean c() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // k.z
    public o getItemData() {
        return this.f1319g;
    }

    public final boolean h() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (i < 480) {
            return (i >= 640 && i2 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    public final void i() {
        boolean z2 = true;
        boolean z3 = !TextUtils.isEmpty(this.h);
        if (this.i != null && ((this.f1319g.f2886y & 4) != 4 || (!this.f1323m && !this.f1324n))) {
            z2 = false;
        }
        boolean z4 = z3 & z2;
        setText(z4 ? this.h : null);
        CharSequence charSequence = this.f1319g.f2878q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z4 ? null : this.f1319g.f2868e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f1319g.f2879r;
        if (TextUtils.isEmpty(charSequence2)) {
            c1.a(this, z4 ? null : this.f1319g.f2868e);
        } else {
            c1.a(this, charSequence2);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        l lVar = this.f1320j;
        if (lVar != null) {
            lVar.b(this.f1319g);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f1323m = h();
        i();
    }

    @Override // l.C0224b0, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean isEmpty = TextUtils.isEmpty(getText());
        if (!isEmpty && (i3 = this.f1326p) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i4 = this.f1325o;
        int min = mode == Integer.MIN_VALUE ? Math.min(size, i4) : i4;
        if (mode != 1073741824 && i4 > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i2);
        }
        if (!isEmpty || this.i == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.i.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0168b c0168b;
        if (this.f1319g.hasSubMenu() && (c0168b = this.f1321k) != null && c0168b.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z2) {
    }

    public void setChecked(boolean z2) {
    }

    public void setExpandedFormat(boolean z2) {
        if (this.f1324n != z2) {
            this.f1324n = z2;
            o oVar = this.f1319g;
            if (oVar != null) {
                m mVar = oVar.f2875n;
                mVar.f2845k = true;
                mVar.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.i = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f1327q;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, null, null, null);
        i();
    }

    public void setItemInvoker(l lVar) {
        this.f1320j = lVar;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.f1326p = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(AbstractC0169c abstractC0169c) {
        this.f1322l = abstractC0169c;
    }

    public void setTitle(CharSequence charSequence) {
        this.h = charSequence;
        i();
    }
}
