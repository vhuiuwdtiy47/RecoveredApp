package U;

import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public final class l extends Z0.i {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Z0.i f771f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f772g;

    public l(Z0.i iVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f771f = iVar;
        this.f772g = threadPoolExecutor;
    }

    @Override // Z0.i
    public final void Q(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f772g;
        try {
            this.f771f.Q(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // Z0.i
    public final void T(v vVar) {
        ThreadPoolExecutor threadPoolExecutor = this.f772g;
        try {
            this.f771f.T(vVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
