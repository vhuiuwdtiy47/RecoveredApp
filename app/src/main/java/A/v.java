package a;

import Y.I;
import Y.S;
import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import f0.y;
import java.util.Iterator;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f1307a;

    /* renamed from: b, reason: collision with root package name */
    public final j1.h f1308b = new j1.h();

    /* renamed from: c, reason: collision with root package name */
    public I f1309c;
    public final OnBackInvokedCallback d;

    /* renamed from: e, reason: collision with root package name */
    public OnBackInvokedDispatcher f1310e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1311f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1312g;

    public v(Runnable runnable) {
        this.f1307a = runnable;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            this.d = i >= 34 ? r.f1297a.a(new C0071m(this, 0), new C0071m(this, 1), new C0072n(0, this), new C0072n(1, this)) : C0074p.f1293a.a(new C0072n(2, this));
        }
    }

    public final void a() {
        Object obj;
        j1.h hVar = this.f1308b;
        hVar.getClass();
        ListIterator listIterator = hVar.listIterator(hVar.f2751c);
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            } else {
                obj = listIterator.previous();
                if (((I) obj).f974a) {
                    break;
                }
            }
        }
        I i = (I) obj;
        this.f1309c = null;
        if (i == null) {
            this.f1307a.run();
            return;
        }
        switch (i.d) {
            case 0:
                S s2 = (S) i.f977e;
                s2.y(true);
                if (s2.h.f974a) {
                    s2.P();
                    return;
                } else {
                    s2.f1009g.a();
                    return;
                }
            default:
                i0.j jVar = ((y) i.f977e).f2365b;
                if (jVar.f2640f.isEmpty()) {
                    return;
                }
                f0.v f2 = jVar.f();
                q1.d.b(f2);
                if (jVar.k(f2.f2359b.f2660a, true, false)) {
                    jVar.b();
                    return;
                }
                return;
        }
    }

    public final void b(boolean z2) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f1310e;
        OnBackInvokedCallback onBackInvokedCallback = this.d;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        C0074p c0074p = C0074p.f1293a;
        if (z2 && !this.f1311f) {
            c0074p.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f1311f = true;
        } else {
            if (z2 || !this.f1311f) {
                return;
            }
            c0074p.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f1311f = false;
        }
    }

    public final void c() {
        boolean z2 = this.f1312g;
        boolean z3 = false;
        j1.h hVar = this.f1308b;
        if (hVar == null || !hVar.isEmpty()) {
            Iterator<E> it = hVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((I) it.next()).f974a) {
                    z3 = true;
                    break;
                }
            }
        }
        this.f1312g = z3;
        if (z3 == z2 || Build.VERSION.SDK_INT < 33) {
            return;
        }
        b(z3);
    }
}
