package g;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class o implements Executor {
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        new Thread(runnable).start();
    }
}
