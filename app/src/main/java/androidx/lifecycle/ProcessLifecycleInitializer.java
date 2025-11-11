package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;
import q0.C0313a;
import q0.InterfaceC0314b;

/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements InterfaceC0314b {
    @Override // q0.InterfaceC0314b
    public final List a() {
        return j1.s.f2755a;
    }

    @Override // q0.InterfaceC0314b
    public final Object b(Context context) {
        q1.d.e(context, "context");
        C0313a c2 = C0313a.c(context);
        q1.d.d(c2, "getInstance(...)");
        if (!c2.f3534b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!AbstractC0094q.f1595a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            q1.d.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new C0093p());
        }
        E e2 = E.h;
        e2.getClass();
        e2.f1549e = new Handler();
        e2.f1550f.d(EnumC0091n.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        q1.d.c(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new D(e2));
        return e2;
    }
}
