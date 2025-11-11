package U;

import android.content.Context;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class m implements h {

    /* renamed from: a, reason: collision with root package name */
    public final Context f773a;

    public m(Context context, int i) {
        switch (i) {
            case 1:
                this.f773a = context;
                return;
            default:
                this.f773a = context.getApplicationContext();
                return;
        }
    }

    @Override // U.h
    public void a(Z0.i iVar) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0030a("EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new k(this, iVar, threadPoolExecutor, 0));
    }
}
