package L;

import android.view.View;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class Y {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f316a;

    public Y(View view) {
        this.f316a = new WeakReference(view);
    }

    public final void a(float f2) {
        View view = (View) this.f316a.get();
        if (view != null) {
            view.animate().alpha(f2);
        }
    }

    public final void b() {
        View view = (View) this.f316a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void c(long j2) {
        View view = (View) this.f316a.get();
        if (view != null) {
            view.animate().setDuration(j2);
        }
    }

    public final void d(Z z2) {
        View view = (View) this.f316a.get();
        if (view != null) {
            if (z2 != null) {
                view.animate().setListener(new A0.a(z2, view));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void e(float f2) {
        View view = (View) this.f316a.get();
        if (view != null) {
            view.animate().translationY(f2);
        }
    }
}
