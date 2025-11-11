package U;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class r implements h {

    /* renamed from: a, reason: collision with root package name */
    public final Context f779a;

    /* renamed from: b, reason: collision with root package name */
    public final I.d f780b;

    /* renamed from: c, reason: collision with root package name */
    public final Z0.f f781c;
    public final Object d;

    /* renamed from: e, reason: collision with root package name */
    public Handler f782e;

    /* renamed from: f, reason: collision with root package name */
    public ThreadPoolExecutor f783f;

    /* renamed from: g, reason: collision with root package name */
    public ThreadPoolExecutor f784g;
    public Z0.i h;

    public r(Context context, I.d dVar) {
        Z0.f fVar = s.d;
        this.d = new Object();
        Z0.i.i(context, "Context cannot be null");
        this.f779a = context.getApplicationContext();
        this.f780b = dVar;
        this.f781c = fVar;
    }

    @Override // U.h
    public final void a(Z0.i iVar) {
        synchronized (this.d) {
            this.h = iVar;
        }
        synchronized (this.d) {
            try {
                if (this.h == null) {
                    return;
                }
                if (this.f783f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0030a("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f784g = threadPoolExecutor;
                    this.f783f = threadPoolExecutor;
                }
                this.f783f.execute(new F0.b(2, this));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this.d) {
            try {
                this.h = null;
                Handler handler = this.f782e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f782e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f784g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f783f = null;
                this.f784g = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final I.i c() {
        try {
            Z0.f fVar = this.f781c;
            Context context = this.f779a;
            I.d dVar = this.f780b;
            fVar.getClass();
            D0.f a2 = I.c.a(context, dVar);
            int i = a2.f109a;
            if (i != 0) {
                throw new RuntimeException("fetchFonts failed (" + i + ")");
            }
            I.i[] iVarArr = (I.i[]) a2.f110b;
            if (iVarArr == null || iVarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return iVarArr[0];
        } catch (PackageManager.NameNotFoundException e2) {
            throw new RuntimeException("provider not found", e2);
        }
    }
}
