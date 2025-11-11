package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;

/* renamed from: l.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0257s extends CheckedTextView {

    /* renamed from: a, reason: collision with root package name */
    public final C0259t f3138a;

    /* renamed from: b, reason: collision with root package name */
    public final i0.l f3139b;

    /* renamed from: c, reason: collision with root package name */
    public final C0219Y f3140c;
    public C0269y d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0089 A[Catch: all -> 0x0068, TryCatch #1 {all -> 0x0068, blocks: (B:3:0x004f, B:5:0x0056, B:8:0x005c, B:9:0x0082, B:11:0x0089, B:12:0x0090, B:14:0x0097, B:21:0x006b, B:23:0x0071, B:25:0x0077), top: B:2:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0097 A[Catch: all -> 0x0068, TRY_LEAVE, TryCatch #1 {all -> 0x0068, blocks: (B:3:0x004f, B:5:0x0056, B:8:0x005c, B:9:0x0082, B:11:0x0089, B:12:0x0090, B:14:0x0097, B:21:0x006b, B:23:0x0071, B:25:0x0077), top: B:2:0x004f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0257s(android.content.Context r9, android.util.AttributeSet r10) {
        /*
            r8 = this;
            l.AbstractC0206Q0.a(r9)
            r5 = 2130903234(0x7f0300c2, float:1.741328E38)
            r8.<init>(r9, r10, r5)
            android.content.Context r9 = r8.getContext()
            l.AbstractC0204P0.a(r8, r9)
            l.Y r9 = new l.Y
            r9.<init>(r8)
            r8.f3140c = r9
            r9.f(r10, r5)
            r9.b()
            i0.l r9 = new i0.l
            r9.<init>(r8)
            r8.f3139b = r9
            r9.d(r10, r5)
            l.t r9 = new l.t
            r9.<init>(r8)
            r8.f3138a = r9
            android.content.Context r9 = r8.getContext()
            int[] r2 = f.AbstractC0117a.f2243l
            L.l r9 = L.C0016l.s(r9, r10, r2, r5)
            java.lang.Object r0 = r9.f362c
            r7 = r0
            android.content.res.TypedArray r7 = (android.content.res.TypedArray) r7
            android.content.Context r1 = r8.getContext()
            java.util.WeakHashMap r0 = L.S.f311a
            java.lang.Object r0 = r9.f362c
            r4 = r0
            android.content.res.TypedArray r4 = (android.content.res.TypedArray) r4
            r6 = 0
            r0 = r8
            r3 = r10
            L.M.d(r0, r1, r2, r3, r4, r5, r6)
            r8 = 1
            boolean r10 = r7.hasValue(r8)     // Catch: java.lang.Throwable -> L68
            r1 = 0
            if (r10 == 0) goto L6b
            int r8 = r7.getResourceId(r8, r1)     // Catch: java.lang.Throwable -> L68
            if (r8 == 0) goto L6b
            android.content.Context r10 = r0.getContext()     // Catch: java.lang.Throwable -> L68 android.content.res.Resources.NotFoundException -> L6b
            android.graphics.drawable.Drawable r8 = U.t.u(r10, r8)     // Catch: java.lang.Throwable -> L68 android.content.res.Resources.NotFoundException -> L6b
            r0.setCheckMarkDrawable(r8)     // Catch: java.lang.Throwable -> L68 android.content.res.Resources.NotFoundException -> L6b
            goto L82
        L68:
            r0 = move-exception
            r8 = r0
            goto Laf
        L6b:
            boolean r8 = r7.hasValue(r1)     // Catch: java.lang.Throwable -> L68
            if (r8 == 0) goto L82
            int r8 = r7.getResourceId(r1, r1)     // Catch: java.lang.Throwable -> L68
            if (r8 == 0) goto L82
            android.content.Context r10 = r0.getContext()     // Catch: java.lang.Throwable -> L68
            android.graphics.drawable.Drawable r8 = U.t.u(r10, r8)     // Catch: java.lang.Throwable -> L68
            r0.setCheckMarkDrawable(r8)     // Catch: java.lang.Throwable -> L68
        L82:
            r8 = 2
            boolean r10 = r7.hasValue(r8)     // Catch: java.lang.Throwable -> L68
            if (r10 == 0) goto L90
            android.content.res.ColorStateList r8 = r9.g(r8)     // Catch: java.lang.Throwable -> L68
            r0.setCheckMarkTintList(r8)     // Catch: java.lang.Throwable -> L68
        L90:
            r8 = 3
            boolean r10 = r7.hasValue(r8)     // Catch: java.lang.Throwable -> L68
            if (r10 == 0) goto La4
            r10 = -1
            int r8 = r7.getInt(r8, r10)     // Catch: java.lang.Throwable -> L68
            r10 = 0
            android.graphics.PorterDuff$Mode r8 = l.AbstractC0242k0.b(r8, r10)     // Catch: java.lang.Throwable -> L68
            r0.setCheckMarkTintMode(r8)     // Catch: java.lang.Throwable -> L68
        La4:
            r9.u()
            l.y r8 = r0.getEmojiTextViewHelper()
            r8.a(r3, r5)
            return
        Laf:
            r9.u()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C0257s.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private C0269y getEmojiTextViewHelper() {
        if (this.d == null) {
            this.d = new C0269y(this);
        }
        return this.d;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0219Y c0219y = this.f3140c;
        if (c0219y != null) {
            c0219y.b();
        }
        i0.l lVar = this.f3139b;
        if (lVar != null) {
            lVar.a();
        }
        C0259t c0259t = this.f3138a;
        if (c0259t != null) {
            c0259t.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return super.getCustomSelectionActionModeCallback();
    }

    public ColorStateList getSupportBackgroundTintList() {
        i0.l lVar = this.f3139b;
        if (lVar != null) {
            return lVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        i0.l lVar = this.f3139b;
        if (lVar != null) {
            return lVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        C0259t c0259t = this.f3138a;
        if (c0259t != null) {
            return c0259t.f3143a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        C0259t c0259t = this.f3138a;
        if (c0259t != null) {
            return c0259t.f3144b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f3140c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f3140c.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        AbstractC0271z.q(editorInfo, onCreateInputConnection, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().b(z2);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        i0.l lVar = this.f3139b;
        if (lVar != null) {
            lVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        i0.l lVar = this.f3139b;
        if (lVar != null) {
            lVar.f(i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C0259t c0259t = this.f3138a;
        if (c0259t != null) {
            if (c0259t.f3146e) {
                c0259t.f3146e = false;
            } else {
                c0259t.f3146e = true;
                c0259t.b();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0219Y c0219y = this.f3140c;
        if (c0219y != null) {
            c0219y.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0219Y c0219y = this.f3140c;
        if (c0219y != null) {
            c0219y.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().c(z2);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        i0.l lVar = this.f3139b;
        if (lVar != null) {
            lVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        i0.l lVar = this.f3139b;
        if (lVar != null) {
            lVar.i(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        C0259t c0259t = this.f3138a;
        if (c0259t != null) {
            c0259t.f3143a = colorStateList;
            c0259t.f3145c = true;
            c0259t.b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        C0259t c0259t = this.f3138a;
        if (c0259t != null) {
            c0259t.f3144b = mode;
            c0259t.d = true;
            c0259t.b();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0219Y c0219y = this.f3140c;
        c0219y.i(colorStateList);
        c0219y.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0219Y c0219y = this.f3140c;
        c0219y.j(mode);
        c0219y.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0219Y c0219y = this.f3140c;
        if (c0219y != null) {
            c0219y.g(context, i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(U.t.u(getContext(), i));
    }
}
