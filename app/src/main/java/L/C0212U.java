package l;

import android.graphics.Typeface;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* renamed from: l.U, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0212U extends C.b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3023e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f3024f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ WeakReference f3025g;
    public final /* synthetic */ C0219Y h;

    public C0212U(C0219Y c0219y, int i, int i2, WeakReference weakReference) {
        this.h = c0219y;
        this.f3023e = i;
        this.f3024f = i2;
        this.f3025g = weakReference;
    }

    @Override // C.b
    public final void g(int i) {
    }

    @Override // C.b
    public final void h(Typeface typeface) {
        int i = this.f3023e;
        if (i != -1) {
            typeface = AbstractC0218X.a(typeface, i, (this.f3024f & 2) != 0);
        }
        C0219Y c0219y = this.h;
        if (c0219y.f3041m) {
            c0219y.f3040l = typeface;
            TextView textView = (TextView) this.f3025g.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new D0.b(textView, typeface, c0219y.f3038j));
                } else {
                    textView.setTypeface(typeface, c0219y.f3038j);
                }
            }
        }
    }
}
