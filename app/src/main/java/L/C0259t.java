package l;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;
import android.widget.TextView;

/* renamed from: l.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0259t {

    /* renamed from: a, reason: collision with root package name */
    public ColorStateList f3143a = null;

    /* renamed from: b, reason: collision with root package name */
    public PorterDuff.Mode f3144b = null;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3145c = false;
    public boolean d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3146e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f3147f;

    public /* synthetic */ C0259t(TextView textView) {
        this.f3147f = textView;
    }

    public void a() {
        CompoundButton compoundButton = (CompoundButton) this.f3147f;
        Drawable a2 = R.c.a(compoundButton);
        if (a2 != null) {
            if (this.f3145c || this.d) {
                Drawable mutate = a2.mutate();
                if (this.f3145c) {
                    E.a.h(mutate, this.f3143a);
                }
                if (this.d) {
                    E.a.i(mutate, this.f3144b);
                }
                if (mutate.isStateful()) {
                    mutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(mutate);
            }
        }
    }

    public void b() {
        C0257s c0257s = (C0257s) this.f3147f;
        Drawable checkMarkDrawable = c0257s.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f3145c || this.d) {
                Drawable mutate = checkMarkDrawable.mutate();
                if (this.f3145c) {
                    E.a.h(mutate, this.f3143a);
                }
                if (this.d) {
                    E.a.i(mutate, this.f3144b);
                }
                if (mutate.isStateful()) {
                    mutate.setState(c0257s.getDrawableState());
                }
                c0257s.setCheckMarkDrawable(mutate);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0060 A[Catch: all -> 0x003f, TryCatch #1 {all -> 0x003f, blocks: (B:3:0x0026, B:5:0x002d, B:8:0x0033, B:9:0x0059, B:11:0x0060, B:12:0x0067, B:14:0x006e, B:21:0x0042, B:23:0x0048, B:25:0x004e), top: B:2:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006e A[Catch: all -> 0x003f, TRY_LEAVE, TryCatch #1 {all -> 0x003f, blocks: (B:3:0x0026, B:5:0x002d, B:8:0x0033, B:9:0x0059, B:11:0x0060, B:12:0x0067, B:14:0x006e, B:21:0x0042, B:23:0x0048, B:25:0x004e), top: B:2:0x0026 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(android.util.AttributeSet r9, int r10) {
        /*
            r8 = this;
            android.widget.TextView r8 = r8.f3147f
            r0 = r8
            android.widget.CompoundButton r0 = (android.widget.CompoundButton) r0
            android.content.Context r8 = r0.getContext()
            int[] r2 = f.AbstractC0117a.f2244m
            L.l r8 = L.C0016l.s(r8, r9, r2, r10)
            java.lang.Object r1 = r8.f362c
            r7 = r1
            android.content.res.TypedArray r7 = (android.content.res.TypedArray) r7
            android.content.Context r1 = r0.getContext()
            java.util.WeakHashMap r3 = L.S.f311a
            java.lang.Object r3 = r8.f362c
            r4 = r3
            android.content.res.TypedArray r4 = (android.content.res.TypedArray) r4
            r6 = 0
            r3 = r9
            r5 = r10
            L.M.d(r0, r1, r2, r3, r4, r5, r6)
            r9 = 1
            boolean r10 = r7.hasValue(r9)     // Catch: java.lang.Throwable -> L3f
            r1 = 0
            if (r10 == 0) goto L42
            int r9 = r7.getResourceId(r9, r1)     // Catch: java.lang.Throwable -> L3f
            if (r9 == 0) goto L42
            android.content.Context r10 = r0.getContext()     // Catch: java.lang.Throwable -> L3f android.content.res.Resources.NotFoundException -> L42
            android.graphics.drawable.Drawable r9 = U.t.u(r10, r9)     // Catch: java.lang.Throwable -> L3f android.content.res.Resources.NotFoundException -> L42
            r0.setButtonDrawable(r9)     // Catch: java.lang.Throwable -> L3f android.content.res.Resources.NotFoundException -> L42
            goto L59
        L3f:
            r0 = move-exception
            r9 = r0
            goto L7f
        L42:
            boolean r9 = r7.hasValue(r1)     // Catch: java.lang.Throwable -> L3f
            if (r9 == 0) goto L59
            int r9 = r7.getResourceId(r1, r1)     // Catch: java.lang.Throwable -> L3f
            if (r9 == 0) goto L59
            android.content.Context r10 = r0.getContext()     // Catch: java.lang.Throwable -> L3f
            android.graphics.drawable.Drawable r9 = U.t.u(r10, r9)     // Catch: java.lang.Throwable -> L3f
            r0.setButtonDrawable(r9)     // Catch: java.lang.Throwable -> L3f
        L59:
            r9 = 2
            boolean r10 = r7.hasValue(r9)     // Catch: java.lang.Throwable -> L3f
            if (r10 == 0) goto L67
            android.content.res.ColorStateList r9 = r8.g(r9)     // Catch: java.lang.Throwable -> L3f
            R.b.c(r0, r9)     // Catch: java.lang.Throwable -> L3f
        L67:
            r9 = 3
            boolean r10 = r7.hasValue(r9)     // Catch: java.lang.Throwable -> L3f
            if (r10 == 0) goto L7b
            r10 = -1
            int r9 = r7.getInt(r9, r10)     // Catch: java.lang.Throwable -> L3f
            r10 = 0
            android.graphics.PorterDuff$Mode r9 = l.AbstractC0242k0.b(r9, r10)     // Catch: java.lang.Throwable -> L3f
            R.b.d(r0, r9)     // Catch: java.lang.Throwable -> L3f
        L7b:
            r8.u()
            return
        L7f:
            r8.u()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C0259t.c(android.util.AttributeSet, int):void");
    }
}
