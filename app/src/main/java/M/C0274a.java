package m;

import java.util.concurrent.Executors;
import l.AbstractC0271z;

/* renamed from: m.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0274a extends AbstractC0271z {
    public static volatile C0274a d;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3219c;

    public C0274a(int i) {
        switch (i) {
            case 1:
                this.f3219c = new Object();
                Executors.newFixedThreadPool(4, new ThreadFactoryC0275b());
                return;
            default:
                this.f3219c = new C0274a(1);
                return;
        }
    }

    public static C0274a x() {
        if (d != null) {
            return d;
        }
        synchronized (C0274a.class) {
            try {
                if (d == null) {
                    d = new C0274a(0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return d;
    }
}
