package I;

import android.os.Process;

/* loaded from: classes.dex */
public final class j extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final int f277a;

    public j(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f277a = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f277a);
        super.run();
    }
}
