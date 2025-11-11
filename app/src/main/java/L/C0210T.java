package l;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import k.ViewTreeObserverOnGlobalLayoutListenerC0170d;

/* renamed from: l.T, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0210T extends Spinner {
    public static final int[] i = {R.attr.spinnerMode};

    /* renamed from: a, reason: collision with root package name */
    public final i0.l f3015a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f3016b;

    /* renamed from: c, reason: collision with root package name */
    public final C0193K f3017c;
    public SpinnerAdapter d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f3018e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC0208S f3019f;

    /* renamed from: g, reason: collision with root package name */
    public int f3020g;
    public final Rect h;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
    
        if (r7 == null) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0210T(android.content.Context r13, android.util.AttributeSet r14) {
        /*
            r12 = this;
            r0 = 2130904076(0x7f03040c, float:1.7414988E38)
            r12.<init>(r13, r14, r0)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r12.h = r1
            android.content.Context r1 = r12.getContext()
            l.AbstractC0204P0.a(r12, r1)
            int[] r1 = f.AbstractC0117a.f2252u
            L.l r2 = L.C0016l.s(r13, r14, r1, r0)
            i0.l r3 = new i0.l
            r3.<init>(r12)
            r12.f3015a = r3
            java.lang.Object r3 = r2.f362c
            android.content.res.TypedArray r3 = (android.content.res.TypedArray) r3
            r4 = 4
            r5 = 0
            int r4 = r3.getResourceId(r4, r5)
            if (r4 == 0) goto L35
            j.c r6 = new j.c
            r6.<init>(r13, r4)
            r12.f3016b = r6
            goto L37
        L35:
            r12.f3016b = r13
        L37:
            r4 = -1
            r6 = 0
            int[] r7 = l.C0210T.i     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L57
            android.content.res.TypedArray r7 = r13.obtainStyledAttributes(r14, r7, r0, r5)     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L57
            boolean r8 = r7.hasValue(r5)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4e
            if (r8 == 0) goto L50
            int r4 = r7.getInt(r5, r5)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4e
            goto L50
        L4a:
            r12 = move-exception
            r6 = r7
            goto Ld5
        L4e:
            r8 = move-exception
            goto L59
        L50:
            r7.recycle()
            goto L63
        L54:
            r12 = move-exception
            goto Ld5
        L57:
            r8 = move-exception
            r7 = r6
        L59:
            java.lang.String r9 = "AppCompatSpinner"
            java.lang.String r10 = "Could not read android:spinnerMode"
            android.util.Log.i(r9, r10, r8)     // Catch: java.lang.Throwable -> L4a
            if (r7 == 0) goto L63
            goto L50
        L63:
            r7 = 2
            r8 = 1
            if (r4 == 0) goto L9d
            if (r4 == r8) goto L6a
            goto Laa
        L6a:
            l.P r4 = new l.P
            android.content.Context r9 = r12.f3016b
            r4.<init>(r12, r9, r14)
            android.content.Context r9 = r12.f3016b
            L.l r1 = L.C0016l.s(r9, r14, r1, r0)
            r9 = 3
            r10 = -2
            java.lang.Object r11 = r1.f362c
            android.content.res.TypedArray r11 = (android.content.res.TypedArray) r11
            int r9 = r11.getLayoutDimension(r9, r10)
            r12.f3020g = r9
            android.graphics.drawable.Drawable r9 = r1.h(r8)
            r4.j(r9)
            java.lang.String r7 = r3.getString(r7)
            r4.f2999A = r7
            r1.u()
            r12.f3019f = r4
            l.K r1 = new l.K
            r1.<init>(r12, r12, r4)
            r12.f3017c = r1
            goto Laa
        L9d:
            l.M r1 = new l.M
            r1.<init>(r12)
            r12.f3019f = r1
            java.lang.String r4 = r3.getString(r7)
            r1.f2988c = r4
        Laa:
            java.lang.CharSequence[] r1 = r3.getTextArray(r5)
            if (r1 == 0) goto Lc1
            android.widget.ArrayAdapter r3 = new android.widget.ArrayAdapter
            r4 = 17367048(0x1090008, float:2.5162948E-38)
            r3.<init>(r13, r4, r1)
            r13 = 2131427439(0x7f0b006f, float:1.8476494E38)
            r3.setDropDownViewResource(r13)
            r12.setAdapter(r3)
        Lc1:
            r2.u()
            r12.f3018e = r8
            android.widget.SpinnerAdapter r13 = r12.d
            if (r13 == 0) goto Lcf
            r12.setAdapter(r13)
            r12.d = r6
        Lcf:
            i0.l r12 = r12.f3015a
            r12.d(r14, r0)
            return
        Ld5:
            if (r6 == 0) goto Lda
            r6.recycle()
        Lda:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C0210T.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i2 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i3 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i2) {
                view = null;
                i2 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i3 = Math.max(i3, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i3;
        }
        Rect rect = this.h;
        drawable.getPadding(rect);
        return rect.left + rect.right + i3;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        i0.l lVar = this.f3015a;
        if (lVar != null) {
            lVar.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        InterfaceC0208S interfaceC0208S = this.f3019f;
        return interfaceC0208S != null ? interfaceC0208S.d() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        InterfaceC0208S interfaceC0208S = this.f3019f;
        return interfaceC0208S != null ? interfaceC0208S.i() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f3019f != null ? this.f3020g : super.getDropDownWidth();
    }

    public final InterfaceC0208S getInternalPopup() {
        return this.f3019f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        InterfaceC0208S interfaceC0208S = this.f3019f;
        return interfaceC0208S != null ? interfaceC0208S.l() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f3016b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        InterfaceC0208S interfaceC0208S = this.f3019f;
        return interfaceC0208S != null ? interfaceC0208S.b() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        i0.l lVar = this.f3015a;
        if (lVar != null) {
            return lVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        i0.l lVar = this.f3015a;
        if (lVar != null) {
            return lVar.c();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC0208S interfaceC0208S = this.f3019f;
        if (interfaceC0208S == null || !interfaceC0208S.a()) {
            return;
        }
        interfaceC0208S.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f3019f == null || View.MeasureSpec.getMode(i2) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i2)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        C0205Q c0205q = (C0205Q) parcelable;
        super.onRestoreInstanceState(c0205q.getSuperState());
        if (!c0205q.f3010a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC0170d(2, this));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View$BaseSavedState, android.os.Parcelable, l.Q] */
    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        InterfaceC0208S interfaceC0208S = this.f3019f;
        baseSavedState.f3010a = interfaceC0208S != null && interfaceC0208S.a();
        return baseSavedState;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0193K c0193k = this.f3017c;
        if (c0193k == null || !c0193k.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        InterfaceC0208S interfaceC0208S = this.f3019f;
        if (interfaceC0208S == null) {
            return super.performClick();
        }
        if (interfaceC0208S.a()) {
            return true;
        }
        this.f3019f.g(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        i0.l lVar = this.f3015a;
        if (lVar != null) {
            lVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        i0.l lVar = this.f3015a;
        if (lVar != null) {
            lVar.f(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i2) {
        InterfaceC0208S interfaceC0208S = this.f3019f;
        if (interfaceC0208S == null) {
            super.setDropDownHorizontalOffset(i2);
        } else {
            interfaceC0208S.n(i2);
            interfaceC0208S.c(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i2) {
        InterfaceC0208S interfaceC0208S = this.f3019f;
        if (interfaceC0208S != null) {
            interfaceC0208S.k(i2);
        } else {
            super.setDropDownVerticalOffset(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i2) {
        if (this.f3019f != null) {
            this.f3020g = i2;
        } else {
            super.setDropDownWidth(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        InterfaceC0208S interfaceC0208S = this.f3019f;
        if (interfaceC0208S != null) {
            interfaceC0208S.j(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i2) {
        setPopupBackgroundDrawable(U.t.u(getPopupContext(), i2));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        InterfaceC0208S interfaceC0208S = this.f3019f;
        if (interfaceC0208S != null) {
            interfaceC0208S.h(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        i0.l lVar = this.f3015a;
        if (lVar != null) {
            lVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        i0.l lVar = this.f3015a;
        if (lVar != null) {
            lVar.i(mode);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.widget.ListAdapter, java.lang.Object, l.N] */
    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f3018e) {
            this.d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        InterfaceC0208S interfaceC0208S = this.f3019f;
        if (interfaceC0208S != 0) {
            Context context = this.f3016b;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            ?? obj = new Object();
            obj.f2995a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                obj.f2996b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                AbstractC0195L.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            interfaceC0208S.m(obj);
        }
    }
}
