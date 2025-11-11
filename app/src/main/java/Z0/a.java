package Z0;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: b, reason: collision with root package name */
    public static volatile a f1218b;

    /* renamed from: a, reason: collision with root package name */
    public Activity f1219a;

    /* JADX WARN: Type inference failed for: r1v2, types: [Z0.a, java.lang.Object] */
    public static a a() {
        if (f1218b == null) {
            synchronized (a.class) {
                try {
                    if (f1218b == null) {
                        f1218b = new Object();
                    }
                } finally {
                }
            }
        }
        return f1218b;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (this.f1219a != activity) {
            return;
        }
        this.f1219a = null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.f1219a = activity;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
