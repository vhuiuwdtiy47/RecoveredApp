package androidx.lifecycle;

import d0.C0114a;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class Q {

    /* renamed from: a, reason: collision with root package name */
    public final C0114a f1570a = new C0114a();

    public final void a() {
        C0114a c0114a = this.f1570a;
        if (c0114a != null && !c0114a.d) {
            c0114a.d = true;
            synchronized (c0114a.f2168a) {
                try {
                    Iterator it = c0114a.f2169b.values().iterator();
                    while (it.hasNext()) {
                        C0114a.a((AutoCloseable) it.next());
                    }
                    Iterator it2 = c0114a.f2170c.iterator();
                    while (it2.hasNext()) {
                        C0114a.a((AutoCloseable) it2.next());
                    }
                    c0114a.f2170c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        b();
    }

    public void b() {
    }
}
