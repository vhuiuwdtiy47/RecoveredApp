package androidx.lifecycle;

import android.os.Looper;
import java.util.Map;
import m.C0274a;

/* loaded from: classes.dex */
public class A {

    /* renamed from: j, reason: collision with root package name */
    public static final Object f1539j = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Object f1540a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final n.f f1541b = new n.f();

    /* renamed from: c, reason: collision with root package name */
    public int f1542c = 0;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f1543e;

    /* renamed from: f, reason: collision with root package name */
    public volatile Object f1544f;

    /* renamed from: g, reason: collision with root package name */
    public int f1545g;
    public boolean h;
    public boolean i;

    public A() {
        Object obj = f1539j;
        this.f1544f = obj;
        this.f1543e = obj;
        this.f1545g = -1;
    }

    public static void a(String str) {
        ((C0274a) C0274a.x().f3219c).getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(D.f.d("Cannot invoke ", str, " on a background thread"));
        }
    }

    public final void b(z zVar) {
        if (zVar.f1609b) {
            if (!zVar.e()) {
                zVar.b(false);
                return;
            }
            int i = zVar.f1610c;
            int i2 = this.f1545g;
            if (i >= i2) {
                return;
            }
            zVar.f1610c = i2;
            zVar.f1608a.a(this.f1543e);
        }
    }

    public final void c(z zVar) {
        if (this.h) {
            this.i = true;
            return;
        }
        this.h = true;
        do {
            this.i = false;
            if (zVar != null) {
                b(zVar);
                zVar = null;
            } else {
                n.f fVar = this.f1541b;
                fVar.getClass();
                n.d dVar = new n.d(fVar);
                fVar.f3235c.put(dVar, Boolean.FALSE);
                while (dVar.hasNext()) {
                    b((z) ((Map.Entry) dVar.next()).getValue());
                    if (this.i) {
                        break;
                    }
                }
            }
        } while (this.i);
        this.h = false;
    }

    public final void d(InterfaceC0096t interfaceC0096t, B b2) {
        Object obj;
        a("observe");
        if (interfaceC0096t.d().f1600c == EnumC0092o.f1590a) {
            return;
        }
        y yVar = new y(this, interfaceC0096t, b2);
        n.f fVar = this.f1541b;
        n.c a2 = fVar.a(b2);
        if (a2 != null) {
            obj = a2.f3228b;
        } else {
            n.c cVar = new n.c(b2, yVar);
            fVar.d++;
            n.c cVar2 = fVar.f3234b;
            if (cVar2 == null) {
                fVar.f3233a = cVar;
                fVar.f3234b = cVar;
            } else {
                cVar2.f3229c = cVar;
                cVar.d = cVar2;
                fVar.f3234b = cVar;
            }
            obj = null;
        }
        z zVar = (z) obj;
        if (zVar != null && !zVar.d(interfaceC0096t)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (zVar != null) {
            return;
        }
        interfaceC0096t.d().a(yVar);
    }

    public final void e(Object obj) {
        a("setValue");
        this.f1545g++;
        this.f1543e = obj;
        c(null);
    }
}
