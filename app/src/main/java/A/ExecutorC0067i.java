package a;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import g.AbstractActivityC0146i;
import java.util.concurrent.Executor;

/* renamed from: a.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC0067i implements Executor, ViewTreeObserver.OnDrawListener, Runnable {

    /* renamed from: b, reason: collision with root package name */
    public Runnable f1265b;
    public final /* synthetic */ AbstractActivityC0146i d;

    /* renamed from: a, reason: collision with root package name */
    public final long f1264a = SystemClock.uptimeMillis() + 10000;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1266c = false;

    public ExecutorC0067i(AbstractActivityC0146i abstractActivityC0146i) {
        this.d = abstractActivityC0146i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f1265b = runnable;
        View decorView = this.d.getWindow().getDecorView();
        if (!this.f1266c) {
            decorView.postOnAnimation(new F0.b(10, this));
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z2;
        Runnable runnable = this.f1265b;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f1264a) {
                this.f1266c = false;
                this.d.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f1265b = null;
        C0070l c0070l = this.d.i;
        synchronized (c0070l.f1284a) {
            z2 = c0070l.f1285b;
        }
        if (z2) {
            this.f1266c = false;
            this.d.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
