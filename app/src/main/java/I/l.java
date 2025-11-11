package I;

import L.e0;
import L.i0;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.view.View;

/* loaded from: classes.dex */
public final class l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f278a = 0;

    /* renamed from: b, reason: collision with root package name */
    public Object f279b;

    /* renamed from: c, reason: collision with root package name */
    public Object f280c;
    public Object d;

    public /* synthetic */ l() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        switch (this.f278a) {
            case 0:
                try {
                    obj = ((e) this.f279b).call();
                } catch (Exception unused) {
                    obj = null;
                }
                ((Handler) this.d).post(new A0.d((f) this.f280c, 2, obj));
                return;
            default:
                e0.h((View) this.f279b, (C.j) this.f280c);
                ((ValueAnimator) this.d).start();
                return;
        }
    }

    public l(View view, i0 i0Var, C.j jVar, ValueAnimator valueAnimator) {
        this.f279b = view;
        this.f280c = jVar;
        this.d = valueAnimator;
    }
}
