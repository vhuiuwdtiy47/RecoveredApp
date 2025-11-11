package f0;

import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.EnumC0092o;
import androidx.lifecycle.V;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final Z0.f f2319a;

    /* renamed from: b, reason: collision with root package name */
    public final y1.c f2320b;

    /* renamed from: c, reason: collision with root package name */
    public final y1.c f2321c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final A0.c f2322e;

    /* renamed from: f, reason: collision with root package name */
    public final A0.c f2323f;

    /* renamed from: g, reason: collision with root package name */
    public final K f2324g;
    public final /* synthetic */ y h;

    /* JADX WARN: Type inference failed for: r4v1, types: [Z0.f, java.lang.Object] */
    public n(y yVar, K k2) {
        q1.d.e(k2, "navigator");
        this.h = yVar;
        this.f2319a = new Object();
        y1.c cVar = new y1.c(j1.s.f2755a);
        this.f2320b = cVar;
        y1.c cVar2 = new y1.c(j1.u.f2757a);
        this.f2321c = cVar2;
        this.f2322e = new A0.c(28, cVar);
        this.f2323f = new A0.c(28, cVar2);
        this.f2324g = k2;
    }

    public final void a(C0133i c0133i) {
        q1.d.e(c0133i, "backStackEntry");
        synchronized (this.f2319a) {
            y1.c cVar = this.f2320b;
            Collection collection = (Collection) cVar.a();
            q1.d.e(collection, "<this>");
            ArrayList arrayList = new ArrayList(collection.size() + 1);
            arrayList.addAll(collection);
            arrayList.add(c0133i);
            cVar.b(arrayList);
        }
    }

    public final C0133i b(v vVar, Bundle bundle) {
        i0.j jVar = this.h.f2365b;
        jVar.getClass();
        return I.b(jVar.f2636a.f2366c, vVar, bundle, jVar.h(), jVar.f2646n);
    }

    public final void c(C0133i c0133i) {
        o oVar;
        q1.d.e(c0133i, "entry");
        i0.j jVar = this.h.f2365b;
        jVar.getClass();
        LinkedHashMap linkedHashMap = jVar.f2654v;
        boolean a2 = q1.d.a(linkedHashMap.get(c0133i), Boolean.TRUE);
        y1.c cVar = this.f2321c;
        Set set = (Set) cVar.a();
        q1.d.e(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(j1.w.h0(set.size()));
        boolean z2 = false;
        for (Object obj : set) {
            boolean z3 = true;
            if (!z2 && q1.d.a(obj, c0133i)) {
                z2 = true;
                z3 = false;
            }
            if (z3) {
                linkedHashSet.add(obj);
            }
        }
        cVar.b(linkedHashSet);
        linkedHashMap.remove(c0133i);
        j1.h hVar = jVar.f2640f;
        boolean contains = hVar.contains(c0133i);
        y1.c cVar2 = jVar.h;
        if (contains) {
            if (this.d) {
                return;
            }
            jVar.r();
            jVar.f2641g.b(j1.j.z0(hVar));
            cVar2.b(jVar.n());
            return;
        }
        jVar.q(c0133i);
        if (c0133i.h.f2618j.f1600c.compareTo(EnumC0092o.f1592c) >= 0) {
            c0133i.e(EnumC0092o.f1590a);
        }
        boolean isEmpty = hVar.isEmpty();
        String str = c0133i.f2309f;
        if (!isEmpty) {
            Iterator it = hVar.iterator();
            while (it.hasNext()) {
                if (q1.d.a(((C0133i) it.next()).f2309f, str)) {
                    break;
                }
            }
        }
        if (!a2 && (oVar = jVar.f2646n) != null) {
            q1.d.e(str, "backStackEntryId");
            V v2 = (V) oVar.f2325b.remove(str);
            if (v2 != null) {
                v2.a();
            }
        }
        jVar.r();
        cVar2.b(jVar.n());
    }

    public final void d(C0133i c0133i) {
        int i;
        synchronized (this.f2319a) {
            try {
                ArrayList z02 = j1.j.z0((Collection) ((y1.c) ((y1.a) this.f2322e.f33b)).a());
                ListIterator listIterator = z02.listIterator(z02.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        i = -1;
                        break;
                    } else if (q1.d.a(((C0133i) listIterator.previous()).f2309f, c0133i.f2309f)) {
                        i = listIterator.nextIndex();
                        break;
                    }
                }
                z02.set(i, c0133i);
                this.f2320b.b(z02);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(final C0133i c0133i, final boolean z2) {
        i0.j jVar = this.h.f2365b;
        p1.a aVar = new p1.a(c0133i, z2) { // from class: f0.m

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C0133i f2318b;

            @Override // p1.a
            public final Object a() {
                n nVar = n.this;
                C0133i c0133i2 = this.f2318b;
                synchronized (nVar.f2319a) {
                    try {
                        y1.c cVar = nVar.f2320b;
                        Iterable iterable = (Iterable) cVar.a();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : iterable) {
                            if (q1.d.a((C0133i) obj, c0133i2)) {
                                break;
                            }
                            arrayList.add(obj);
                        }
                        cVar.b(arrayList);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return i1.g.f2679c;
            }
        };
        jVar.getClass();
        K b2 = jVar.f2650r.b(c0133i.f2306b.f2358a);
        jVar.f2654v.put(c0133i, Boolean.valueOf(z2));
        if (!b2.equals(this.f2324g)) {
            Object obj = jVar.f2651s.get(b2);
            q1.d.b(obj);
            ((n) obj).e(c0133i, z2);
            return;
        }
        i0.g gVar = jVar.f2653u;
        if (gVar != null) {
            gVar.c(c0133i);
            aVar.a();
            return;
        }
        j1.h hVar = jVar.f2640f;
        int indexOf = hVar.indexOf(c0133i);
        if (indexOf < 0) {
            String str = "Ignoring pop of " + c0133i + " as it was not found on the current back stack";
            q1.d.e(str, "message");
            Log.i("NavController", str);
            return;
        }
        int i = indexOf + 1;
        if (i != hVar.f2751c) {
            jVar.k(((C0133i) hVar.get(i)).f2306b.f2359b.f2660a, true, false);
        }
        i0.j.m(jVar, c0133i);
        aVar.a();
        jVar.f2637b.a();
        jVar.b();
    }

    public final void f(C0133i c0133i, boolean z2) {
        Object obj;
        y1.c cVar = this.f2321c;
        Iterable iterable = (Iterable) cVar.a();
        boolean z3 = iterable instanceof Collection;
        A0.c cVar2 = this.f2322e;
        if (!z3 || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((C0133i) it.next()) == c0133i) {
                    Iterable iterable2 = (Iterable) ((y1.c) ((y1.a) cVar2.f33b)).a();
                    if ((iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty()) {
                        return;
                    }
                    Iterator it2 = iterable2.iterator();
                    while (it2.hasNext()) {
                        if (((C0133i) it2.next()) == c0133i) {
                        }
                    }
                    return;
                }
            }
        }
        cVar.b(j1.z.h0((Set) cVar.a(), c0133i));
        List list = (List) ((y1.c) ((y1.a) cVar2.f33b)).a();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            C0133i c0133i2 = (C0133i) obj;
            if (!q1.d.a(c0133i2, c0133i)) {
                y1.a aVar = (y1.a) cVar2.f33b;
                if (((List) ((y1.c) aVar).a()).lastIndexOf(c0133i2) < ((List) ((y1.c) aVar).a()).lastIndexOf(c0133i)) {
                    break;
                }
            }
        }
        C0133i c0133i3 = (C0133i) obj;
        if (c0133i3 != null) {
            cVar.b(j1.z.h0((Set) cVar.a(), c0133i3));
        }
        e(c0133i, z2);
    }

    public final void g(C0133i c0133i) {
        q1.d.e(c0133i, "backStackEntry");
        i0.j jVar = this.h.f2365b;
        jVar.getClass();
        K b2 = jVar.f2650r.b(c0133i.f2306b.f2358a);
        if (!b2.equals(this.f2324g)) {
            Object obj = jVar.f2651s.get(b2);
            if (obj != null) {
                ((n) obj).g(c0133i);
                return;
            }
            throw new IllegalStateException(("NavigatorBackStack for " + c0133i.f2306b.f2358a + " should already be created").toString());
        }
        p1.l lVar = jVar.f2652t;
        if (lVar != null) {
            lVar.c(c0133i);
            a(c0133i);
            return;
        }
        String str = "Ignoring add of destination " + c0133i.f2306b + " outside of the call to navigate(). ";
        q1.d.e(str, "message");
        Log.i("NavController", str);
    }

    public final void h(C0133i c0133i) {
        y1.c cVar = this.f2321c;
        Iterable iterable = (Iterable) cVar.a();
        boolean z2 = iterable instanceof Collection;
        A0.c cVar2 = this.f2322e;
        if (!z2 || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((C0133i) it.next()) == c0133i) {
                    Iterable iterable2 = (Iterable) ((y1.c) ((y1.a) cVar2.f33b)).a();
                    if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                        Iterator it2 = iterable2.iterator();
                        while (it2.hasNext()) {
                            if (((C0133i) it2.next()) == c0133i) {
                                return;
                            }
                        }
                    }
                }
            }
        }
        C0133i c0133i2 = (C0133i) j1.j.s0((List) ((y1.c) ((y1.a) cVar2.f33b)).a());
        if (c0133i2 != null) {
            cVar.b(j1.z.h0((Set) cVar.a(), c0133i2));
        }
        cVar.b(j1.z.h0((Set) cVar.a(), c0133i));
        g(c0133i);
    }
}
