package g;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class n implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2543a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f2544b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    public final o f2545c;
    public Runnable d;

    public n(o oVar) {
        this.f2545c = oVar;
    }

    public final void a() {
        synchronized (this.f2543a) {
            try {
                Runnable runnable = (Runnable) this.f2544b.poll();
                this.d = runnable;
                if (runnable != null) {
                    this.f2545c.execute(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.f2543a) {
            try {
                this.f2544b.add(new C.o(this, 2, runnable));
                if (this.d == null) {
                    a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
