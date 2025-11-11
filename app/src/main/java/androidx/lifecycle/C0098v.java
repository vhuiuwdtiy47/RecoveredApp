package androidx.lifecycle;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import m.C0274a;
import n.C0277a;

/* renamed from: androidx.lifecycle.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0098v {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1598a;

    /* renamed from: b, reason: collision with root package name */
    public C0277a f1599b;

    /* renamed from: c, reason: collision with root package name */
    public EnumC0092o f1600c;
    public final WeakReference d;

    /* renamed from: e, reason: collision with root package name */
    public int f1601e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1602f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1603g;
    public final ArrayList h;
    public final y1.c i;

    public C0098v(InterfaceC0096t interfaceC0096t) {
        new AtomicReference(null);
        this.f1598a = true;
        this.f1599b = new C0277a();
        EnumC0092o enumC0092o = EnumC0092o.f1591b;
        this.f1600c = enumC0092o;
        this.h = new ArrayList();
        this.d = new WeakReference(interfaceC0096t);
        this.i = new y1.c(enumC0092o);
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [androidx.lifecycle.u, java.lang.Object] */
    public final void a(InterfaceC0095s interfaceC0095s) {
        r c0084g;
        Object obj;
        InterfaceC0096t interfaceC0096t;
        ArrayList arrayList = this.h;
        q1.d.e(interfaceC0095s, "observer");
        c("addObserver");
        EnumC0092o enumC0092o = this.f1600c;
        EnumC0092o enumC0092o2 = EnumC0092o.f1590a;
        if (enumC0092o != enumC0092o2) {
            enumC0092o2 = EnumC0092o.f1591b;
        }
        ?? obj2 = new Object();
        HashMap hashMap = AbstractC0099w.f1604a;
        boolean z2 = interfaceC0095s instanceof r;
        boolean z3 = interfaceC0095s instanceof U.j;
        if (z2 && z3) {
            c0084g = new C0084g((U.j) interfaceC0095s, (r) interfaceC0095s);
        } else if (z3) {
            c0084g = new C0084g((U.j) interfaceC0095s, (r) null);
        } else if (z2) {
            c0084g = (r) interfaceC0095s;
        } else {
            Class<?> cls = interfaceC0095s.getClass();
            if (AbstractC0099w.b(cls) == 2) {
                Object obj3 = AbstractC0099w.f1605b.get(cls);
                q1.d.b(obj3);
                List list = (List) obj3;
                if (list.size() == 1) {
                    AbstractC0099w.a((Constructor) list.get(0), interfaceC0095s);
                    throw null;
                }
                int size = list.size();
                InterfaceC0086i[] interfaceC0086iArr = new InterfaceC0086i[size];
                if (size > 0) {
                    AbstractC0099w.a((Constructor) list.get(0), interfaceC0095s);
                    throw null;
                }
                c0084g = new C0082e(r1, interfaceC0086iArr);
            } else {
                c0084g = new C0084g(interfaceC0095s);
            }
        }
        obj2.f1597b = c0084g;
        obj2.f1596a = enumC0092o2;
        C0277a c0277a = this.f1599b;
        n.c a2 = c0277a.a(interfaceC0095s);
        if (a2 != null) {
            obj = a2.f3228b;
        } else {
            HashMap hashMap2 = c0277a.f3223e;
            n.c cVar = new n.c(interfaceC0095s, obj2);
            c0277a.d++;
            n.c cVar2 = c0277a.f3234b;
            if (cVar2 == null) {
                c0277a.f3233a = cVar;
                c0277a.f3234b = cVar;
            } else {
                cVar2.f3229c = cVar;
                cVar.d = cVar2;
                c0277a.f3234b = cVar;
            }
            hashMap2.put(interfaceC0095s, cVar);
            obj = null;
        }
        if (((C0097u) obj) == null && (interfaceC0096t = (InterfaceC0096t) this.d.get()) != null) {
            r1 = (this.f1601e != 0 || this.f1602f) ? 1 : 0;
            EnumC0092o b2 = b(interfaceC0095s);
            this.f1601e++;
            while (obj2.f1596a.compareTo(b2) < 0 && this.f1599b.f3223e.containsKey(interfaceC0095s)) {
                arrayList.add(obj2.f1596a);
                C0089l c0089l = EnumC0091n.Companion;
                EnumC0092o enumC0092o3 = obj2.f1596a;
                c0089l.getClass();
                q1.d.e(enumC0092o3, "state");
                int ordinal = enumC0092o3.ordinal();
                EnumC0091n enumC0091n = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? null : EnumC0091n.ON_RESUME : EnumC0091n.ON_START : EnumC0091n.ON_CREATE;
                if (enumC0091n == null) {
                    throw new IllegalStateException("no event up from " + obj2.f1596a);
                }
                obj2.a(interfaceC0096t, enumC0091n);
                arrayList.remove(arrayList.size() - 1);
                b2 = b(interfaceC0095s);
            }
            if (r1 == 0) {
                h();
            }
            this.f1601e--;
        }
    }

    public final EnumC0092o b(InterfaceC0095s interfaceC0095s) {
        HashMap hashMap = this.f1599b.f3223e;
        n.c cVar = hashMap.containsKey(interfaceC0095s) ? ((n.c) hashMap.get(interfaceC0095s)).d : null;
        EnumC0092o enumC0092o = cVar != null ? ((C0097u) cVar.f3228b).f1596a : null;
        ArrayList arrayList = this.h;
        EnumC0092o enumC0092o2 = arrayList.isEmpty() ? null : (EnumC0092o) arrayList.get(arrayList.size() - 1);
        EnumC0092o enumC0092o3 = this.f1600c;
        q1.d.e(enumC0092o3, "state1");
        if (enumC0092o == null || enumC0092o.compareTo(enumC0092o3) >= 0) {
            enumC0092o = enumC0092o3;
        }
        return (enumC0092o2 == null || enumC0092o2.compareTo(enumC0092o) >= 0) ? enumC0092o : enumC0092o2;
    }

    public final void c(String str) {
        if (this.f1598a) {
            ((C0274a) C0274a.x().f3219c).getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(D.f.d("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final void d(EnumC0091n enumC0091n) {
        q1.d.e(enumC0091n, "event");
        c("handleLifecycleEvent");
        e(enumC0091n.a());
    }

    public final void e(EnumC0092o enumC0092o) {
        if (this.f1600c == enumC0092o) {
            return;
        }
        InterfaceC0096t interfaceC0096t = (InterfaceC0096t) this.d.get();
        EnumC0092o enumC0092o2 = this.f1600c;
        q1.d.e(enumC0092o2, "current");
        q1.d.e(enumC0092o, "next");
        EnumC0092o enumC0092o3 = EnumC0092o.f1591b;
        EnumC0092o enumC0092o4 = EnumC0092o.f1590a;
        if (enumC0092o2 == enumC0092o3 && enumC0092o == enumC0092o4) {
            throw new IllegalStateException(("State must be at least '" + EnumC0092o.f1592c + "' to be moved to '" + enumC0092o + "' in component " + interfaceC0096t).toString());
        }
        if (enumC0092o2 == enumC0092o4 && enumC0092o2 != enumC0092o) {
            throw new IllegalStateException(("State is '" + enumC0092o4 + "' and cannot be moved to `" + enumC0092o + "` in component " + interfaceC0096t).toString());
        }
        this.f1600c = enumC0092o;
        if (this.f1602f || this.f1601e != 0) {
            this.f1603g = true;
            return;
        }
        this.f1602f = true;
        h();
        this.f1602f = false;
        if (this.f1600c == enumC0092o4) {
            this.f1599b = new C0277a();
        }
    }

    public final void f(InterfaceC0095s interfaceC0095s) {
        q1.d.e(interfaceC0095s, "observer");
        c("removeObserver");
        this.f1599b.b(interfaceC0095s);
    }

    public final void g(EnumC0092o enumC0092o) {
        q1.d.e(enumC0092o, "state");
        c("setCurrentState");
        e(enumC0092o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        r12.f1603g = false;
        r12.i.b(r12.f1600c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h() {
        /*
            Method dump skipped, instructions count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.C0098v.h():void");
    }
}
