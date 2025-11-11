package z0;

import M0.i;
import M0.j;
import M0.m;
import Q0.d;
import T0.g;
import T0.k;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.music.R;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;

/* renamed from: z0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0385a extends Drawable implements i {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f4229a;

    /* renamed from: b, reason: collision with root package name */
    public final g f4230b;

    /* renamed from: c, reason: collision with root package name */
    public final j f4231c;
    public final Rect d;

    /* renamed from: e, reason: collision with root package name */
    public final C0387c f4232e;

    /* renamed from: f, reason: collision with root package name */
    public float f4233f;

    /* renamed from: g, reason: collision with root package name */
    public float f4234g;
    public final int h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f4235j;

    /* renamed from: k, reason: collision with root package name */
    public float f4236k;

    /* renamed from: l, reason: collision with root package name */
    public WeakReference f4237l;

    /* renamed from: m, reason: collision with root package name */
    public WeakReference f4238m;

    public C0385a(Context context, C0386b c0386b) {
        d dVar;
        WeakReference weakReference = new WeakReference(context);
        this.f4229a = weakReference;
        m.c(context, m.f497b, "Theme.MaterialComponents");
        this.d = new Rect();
        j jVar = new j(this);
        this.f4231c = jVar;
        TextPaint textPaint = jVar.f490a;
        textPaint.setTextAlign(Paint.Align.CENTER);
        C0387c c0387c = new C0387c(context, c0386b);
        this.f4232e = c0387c;
        boolean e2 = e();
        C0386b c0386b2 = c0387c.f4267b;
        g gVar = new g(k.a(context, e2 ? c0386b2.f4248g.intValue() : c0386b2.f4246e.intValue(), e() ? c0386b2.h.intValue() : c0386b2.f4247f.intValue(), new T0.a(0)).a());
        this.f4230b = gVar;
        g();
        Context context2 = (Context) weakReference.get();
        if (context2 != null && jVar.f495g != (dVar = new d(context2, c0386b2.d.intValue()))) {
            jVar.b(dVar, context2);
            textPaint.setColor(c0386b2.f4245c.intValue());
            invalidateSelf();
            i();
            invalidateSelf();
        }
        int i = c0386b2.f4251l;
        if (i != -2) {
            this.h = ((int) Math.pow(10.0d, i - 1.0d)) - 1;
        } else {
            this.h = c0386b2.f4252m;
        }
        jVar.f493e = true;
        i();
        invalidateSelf();
        jVar.f493e = true;
        g();
        i();
        invalidateSelf();
        textPaint.setAlpha(getAlpha());
        invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(c0386b2.f4244b.intValue());
        if (gVar.f683a.f671c != valueOf) {
            gVar.j(valueOf);
            invalidateSelf();
        }
        textPaint.setColor(c0386b2.f4245c.intValue());
        invalidateSelf();
        WeakReference weakReference2 = this.f4237l;
        if (weakReference2 != null && weakReference2.get() != null) {
            View view = (View) this.f4237l.get();
            WeakReference weakReference3 = this.f4238m;
            h(view, weakReference3 != null ? (FrameLayout) weakReference3.get() : null);
        }
        i();
        setVisible(c0386b2.f4259t.booleanValue(), false);
    }

    @Override // M0.i
    public final void a() {
        invalidateSelf();
    }

    public final String b() {
        C0387c c0387c = this.f4232e;
        C0386b c0386b = c0387c.f4267b;
        String str = c0386b.f4249j;
        boolean z2 = str != null;
        WeakReference weakReference = this.f4229a;
        if (z2) {
            int i = c0386b.f4251l;
            if (i == -2 || str == null || str.length() <= i) {
                return str;
            }
            Context context = (Context) weakReference.get();
            if (context == null) {
                return "";
            }
            return String.format(context.getString(R.string.m3_exceed_max_badge_text_suffix), str.substring(0, i - 1), "…");
        }
        if (!f()) {
            return null;
        }
        int i2 = this.h;
        C0386b c0386b2 = c0387c.f4267b;
        if (i2 == -2 || d() <= this.h) {
            return NumberFormat.getInstance(c0386b2.f4253n).format(d());
        }
        Context context2 = (Context) weakReference.get();
        return context2 == null ? "" : String.format(c0386b2.f4253n, context2.getString(R.string.mtrl_exceed_max_badge_number_suffix), Integer.valueOf(this.h), "+");
    }

    public final FrameLayout c() {
        WeakReference weakReference = this.f4238m;
        if (weakReference != null) {
            return (FrameLayout) weakReference.get();
        }
        return null;
    }

    public final int d() {
        int i = this.f4232e.f4267b.f4250k;
        if (i != -1) {
            return i;
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        String b2;
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.f4230b.draw(canvas);
        if (!e() || (b2 = b()) == null) {
            return;
        }
        Rect rect = new Rect();
        j jVar = this.f4231c;
        jVar.f490a.getTextBounds(b2, 0, b2.length(), rect);
        float exactCenterY = this.f4234g - rect.exactCenterY();
        canvas.drawText(b2, this.f4233f, rect.bottom <= 0 ? (int) exactCenterY : Math.round(exactCenterY), jVar.f490a);
    }

    public final boolean e() {
        return this.f4232e.f4267b.f4249j != null || f();
    }

    public final boolean f() {
        C0386b c0386b = this.f4232e.f4267b;
        return c0386b.f4249j == null && c0386b.f4250k != -1;
    }

    public final void g() {
        Context context = (Context) this.f4229a.get();
        if (context == null) {
            return;
        }
        boolean e2 = e();
        C0387c c0387c = this.f4232e;
        this.f4230b.setShapeAppearanceModel(k.a(context, e2 ? c0387c.f4267b.f4248g.intValue() : c0387c.f4267b.f4246e.intValue(), e() ? c0387c.f4267b.h.intValue() : c0387c.f4267b.f4247f.intValue(), new T0.a(0)).a());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f4232e.f4267b.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.d.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.d.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final void h(View view, FrameLayout frameLayout) {
        this.f4237l = new WeakReference(view);
        this.f4238m = new WeakReference(frameLayout);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        i();
        invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0238  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i() {
        /*
            Method dump skipped, instructions count: 736
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z0.C0385a.i():void");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return false;
    }

    @Override // android.graphics.drawable.Drawable, M0.i
    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        C0387c c0387c = this.f4232e;
        c0387c.f4266a.i = i;
        c0387c.f4267b.i = i;
        this.f4231c.f490a.setAlpha(getAlpha());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
