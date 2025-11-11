package M0;

import android.content.Context;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: c, reason: collision with root package name */
    public float f492c;
    public float d;

    /* renamed from: f, reason: collision with root package name */
    public final WeakReference f494f;

    /* renamed from: g, reason: collision with root package name */
    public Q0.d f495g;

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f490a = new TextPaint(1);

    /* renamed from: b, reason: collision with root package name */
    public final H0.a f491b = new H0.a(1, this);

    /* renamed from: e, reason: collision with root package name */
    public boolean f493e = true;

    public j(i iVar) {
        this.f494f = new WeakReference(null);
        this.f494f = new WeakReference(iVar);
    }

    public final void a(String str) {
        TextPaint textPaint = this.f490a;
        this.f492c = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        this.d = str != null ? Math.abs(textPaint.getFontMetrics().ascent) : 0.0f;
        this.f493e = false;
    }

    public final void b(Q0.d dVar, Context context) {
        if (this.f495g != dVar) {
            this.f495g = dVar;
            if (dVar != null) {
                TextPaint textPaint = this.f490a;
                H0.a aVar = this.f491b;
                dVar.f(context, textPaint, aVar);
                i iVar = (i) this.f494f.get();
                if (iVar != null) {
                    textPaint.drawableState = iVar.getState();
                }
                dVar.e(context, textPaint, aVar);
                this.f493e = true;
            }
            i iVar2 = (i) this.f494f.get();
            if (iVar2 != null) {
                iVar2.a();
                iVar2.onStateChange(iVar2.getState());
            }
        }
    }
}
