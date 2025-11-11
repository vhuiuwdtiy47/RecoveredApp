package h0;

import Y.AbstractComponentCallbacksC0056x;
import Y.C0034a;
import Y.DialogInterfaceOnCancelListenerC0049p;
import Y.S;
import Y.W;
import android.content.Context;
import android.util.Log;
import androidx.lifecycle.C0098v;
import f0.C0118A;
import f0.C0133i;
import f0.J;
import f0.K;
import f0.v;
import j1.z;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Set;
import o0.C0304a;

@J("dialog")
/* renamed from: h0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0154d extends K {

    /* renamed from: c, reason: collision with root package name */
    public final Context f2575c;
    public final S d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f2576e = new LinkedHashSet();

    /* renamed from: f, reason: collision with root package name */
    public final C0304a f2577f = new C0304a(3, this);

    /* renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f2578g = new LinkedHashMap();

    public C0154d(Context context, S s2) {
        this.f2575c = context;
        this.d = s2;
    }

    @Override // f0.K
    public final v a() {
        return new v(this);
    }

    @Override // f0.K
    public final void d(List list, C0118A c0118a) {
        S s2 = this.d;
        if (s2.M()) {
            Log.i("DialogFragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0133i c0133i = (C0133i) it.next();
            DialogInterfaceOnCancelListenerC0049p k2 = k(c0133i);
            k2.f1143j0 = false;
            k2.f1144k0 = true;
            C0034a c0034a = new C0034a(s2);
            c0034a.f1072p = true;
            c0034a.e(0, k2, c0133i.f2309f, 1);
            c0034a.d(false);
            C0133i c0133i2 = (C0133i) j1.j.s0((List) ((y1.c) ((y1.a) b().f2322e.f33b)).a());
            boolean n02 = j1.j.n0((Iterable) ((y1.c) ((y1.a) b().f2323f.f33b)).a(), c0133i2);
            b().h(c0133i);
            if (c0133i2 != null && !n02) {
                b().c(c0133i2);
            }
        }
    }

    @Override // f0.K
    public final void e(f0.n nVar) {
        C0098v c0098v;
        this.f2287a = nVar;
        this.f2288b = true;
        Iterator it = ((List) ((y1.c) ((y1.a) nVar.f2322e.f33b)).a()).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            S s2 = this.d;
            if (!hasNext) {
                s2.f1014n.add(new W() { // from class: h0.a
                    @Override // Y.W
                    public final void a(S s3, AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x) {
                        q1.d.e(s3, "<unused var>");
                        q1.d.e(abstractComponentCallbacksC0056x, "childFragment");
                        C0154d c0154d = C0154d.this;
                        LinkedHashSet linkedHashSet = c0154d.f2576e;
                        String str = abstractComponentCallbacksC0056x.f1203y;
                        if ((linkedHashSet instanceof r1.a) && !(linkedHashSet instanceof r1.b)) {
                            q1.k.b(linkedHashSet, "kotlin.collections.MutableCollection");
                            throw null;
                        }
                        if (linkedHashSet.remove(str)) {
                            abstractComponentCallbacksC0056x.f1174N.a(c0154d.f2577f);
                        }
                        LinkedHashMap linkedHashMap = c0154d.f2578g;
                        String str2 = abstractComponentCallbacksC0056x.f1203y;
                        q1.k.a(linkedHashMap);
                        linkedHashMap.remove(str2);
                    }
                });
                return;
            }
            C0133i c0133i = (C0133i) it.next();
            DialogInterfaceOnCancelListenerC0049p dialogInterfaceOnCancelListenerC0049p = (DialogInterfaceOnCancelListenerC0049p) s2.C(c0133i.f2309f);
            if (dialogInterfaceOnCancelListenerC0049p == null || (c0098v = dialogInterfaceOnCancelListenerC0049p.f1174N) == null) {
                this.f2576e.add(c0133i.f2309f);
            } else {
                c0098v.a(this.f2577f);
            }
        }
    }

    @Override // f0.K
    public final void f(C0133i c0133i) {
        S s2 = this.d;
        if (s2.M()) {
            Log.i("DialogFragmentNavigator", "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state");
            return;
        }
        LinkedHashMap linkedHashMap = this.f2578g;
        String str = c0133i.f2309f;
        DialogInterfaceOnCancelListenerC0049p dialogInterfaceOnCancelListenerC0049p = (DialogInterfaceOnCancelListenerC0049p) linkedHashMap.get(str);
        if (dialogInterfaceOnCancelListenerC0049p == null) {
            AbstractComponentCallbacksC0056x C2 = s2.C(str);
            dialogInterfaceOnCancelListenerC0049p = C2 instanceof DialogInterfaceOnCancelListenerC0049p ? (DialogInterfaceOnCancelListenerC0049p) C2 : null;
        }
        if (dialogInterfaceOnCancelListenerC0049p != null) {
            dialogInterfaceOnCancelListenerC0049p.f1174N.f(this.f2577f);
            dialogInterfaceOnCancelListenerC0049p.L(false, false);
        }
        DialogInterfaceOnCancelListenerC0049p k2 = k(c0133i);
        k2.f1143j0 = false;
        k2.f1144k0 = true;
        C0034a c0034a = new C0034a(s2);
        c0034a.f1072p = true;
        c0034a.e(0, k2, str, 1);
        c0034a.d(false);
        f0.n b2 = b();
        List list = (List) ((y1.c) ((y1.a) b2.f2322e.f33b)).a();
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            C0133i c0133i2 = (C0133i) listIterator.previous();
            if (q1.d.a(c0133i2.f2309f, str)) {
                y1.c cVar = b2.f2321c;
                cVar.b(z.h0(z.h0((Set) cVar.a(), c0133i2), c0133i));
                b2.d(c0133i);
                return;
            }
        }
        throw new NoSuchElementException("List contains no element matching the predicate.");
    }

    @Override // f0.K
    public final void i(C0133i c0133i, boolean z2) {
        S s2 = this.d;
        if (s2.M()) {
            Log.i("DialogFragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        List list = (List) ((y1.c) ((y1.a) b().f2322e.f33b)).a();
        int indexOf = list.indexOf(c0133i);
        Iterator it = j1.j.v0(list.subList(indexOf, list.size())).iterator();
        while (it.hasNext()) {
            AbstractComponentCallbacksC0056x C2 = s2.C(((C0133i) it.next()).f2309f);
            if (C2 != null) {
                ((DialogInterfaceOnCancelListenerC0049p) C2).L(false, false);
            }
        }
        l(indexOf, c0133i, z2);
    }

    public final DialogInterfaceOnCancelListenerC0049p k(C0133i c0133i) {
        v vVar = c0133i.f2306b;
        q1.d.c(vVar, "null cannot be cast to non-null type androidx.navigation.fragment.DialogFragmentNavigator.Destination");
        C0152b c0152b = (C0152b) vVar;
        String str = c0152b.f2573g;
        if (str == null) {
            throw new IllegalStateException("DialogFragment class was not set");
        }
        char charAt = str.charAt(0);
        Context context = this.f2575c;
        if (charAt == '.') {
            str = context.getPackageName() + str;
        }
        Y.K E2 = this.d.E();
        context.getClassLoader();
        AbstractComponentCallbacksC0056x a2 = E2.a(str);
        q1.d.d(a2, "instantiate(...)");
        if (DialogInterfaceOnCancelListenerC0049p.class.isAssignableFrom(a2.getClass())) {
            DialogInterfaceOnCancelListenerC0049p dialogInterfaceOnCancelListenerC0049p = (DialogInterfaceOnCancelListenerC0049p) a2;
            dialogInterfaceOnCancelListenerC0049p.K(c0133i.h.a());
            dialogInterfaceOnCancelListenerC0049p.f1174N.a(this.f2577f);
            this.f2578g.put(c0133i.f2309f, dialogInterfaceOnCancelListenerC0049p);
            return dialogInterfaceOnCancelListenerC0049p;
        }
        StringBuilder sb = new StringBuilder("Dialog destination ");
        String str2 = c0152b.f2573g;
        if (str2 == null) {
            throw new IllegalStateException("DialogFragment class was not set");
        }
        sb.append(str2);
        sb.append(" is not an instance of DialogFragment");
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public final void l(int i, C0133i c0133i, boolean z2) {
        C0133i c0133i2 = (C0133i) j1.j.q0((List) ((y1.c) ((y1.a) b().f2322e.f33b)).a(), i - 1);
        boolean n02 = j1.j.n0((Iterable) ((y1.c) ((y1.a) b().f2323f.f33b)).a(), c0133i2);
        b().f(c0133i, z2);
        if (c0133i2 == null || n02) {
            return;
        }
        b().c(c0133i2);
    }
}
