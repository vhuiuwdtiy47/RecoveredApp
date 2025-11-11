package h0;

import U.t;
import Y.AbstractComponentCallbacksC0056x;
import Y.C0034a;
import Y.P;
import Y.S;
import Y.W;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.B;
import androidx.lifecycle.Q;
import androidx.lifecycle.V;
import c0.C0110a;
import c0.C0113d;
import f0.C0118A;
import f0.C0125a;
import f0.C0133i;
import f0.J;
import f0.K;
import f0.r;
import f0.v;
import j1.p;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;

@J("fragment")
/* loaded from: classes.dex */
public class j extends K {

    /* renamed from: c, reason: collision with root package name */
    public final Context f2591c;
    public final S d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2592e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashSet f2593f = new LinkedHashSet();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f2594g = new ArrayList();
    public final C0155e h = new C0155e(0, this);
    public final r i = new r(2, this);

    /* loaded from: classes.dex */
    public static final class a extends Q {

        /* renamed from: b, reason: collision with root package name */
        public WeakReference f2595b;

        @Override // androidx.lifecycle.Q
        public final void b() {
            WeakReference weakReference = this.f2595b;
            if (weakReference == null) {
                RuntimeException runtimeException = new RuntimeException("lateinit property completeTransition has not been initialized");
                q1.d.f(runtimeException, q1.d.class.getName());
                throw runtimeException;
            }
            p1.a aVar = (p1.a) weakReference.get();
            if (aVar != null) {
                aVar.a();
            }
        }
    }

    public j(Context context, S s2, int i) {
        this.f2591c = context;
        this.d = s2;
        this.f2592e = i;
    }

    public static void k(j jVar, String str, int i) {
        int h02;
        int i2 = 0;
        boolean z2 = (i & 2) == 0;
        boolean z3 = (i & 4) != 0;
        ArrayList arrayList = jVar.f2594g;
        if (z3) {
            q1.d.e(arrayList, "<this>");
            int h03 = j1.k.h0(arrayList);
            if (h03 >= 0) {
                int i3 = 0;
                while (true) {
                    Object obj = arrayList.get(i2);
                    i1.d dVar = (i1.d) obj;
                    q1.d.e(dVar, "it");
                    if (!q1.d.a(dVar.f2670a, str)) {
                        if (i3 != i2) {
                            arrayList.set(i3, obj);
                        }
                        i3++;
                    }
                    if (i2 == h03) {
                        break;
                    } else {
                        i2++;
                    }
                }
                i2 = i3;
            }
            if (i2 < arrayList.size() && i2 <= (h02 = j1.k.h0(arrayList))) {
                while (true) {
                    arrayList.remove(h02);
                    if (h02 == i2) {
                        break;
                    } else {
                        h02--;
                    }
                }
            }
        }
        arrayList.add(new i1.d(str, Boolean.valueOf(z2)));
    }

    public static boolean n() {
        return Log.isLoggable("FragmentManager", 2) || Log.isLoggable("FragmentNavigator", 2);
    }

    @Override // f0.K
    public final v a() {
        return new v(this);
    }

    @Override // f0.K
    public final void d(List list, C0118A c0118a) {
        S s2 = this.d;
        if (s2.M()) {
            Log.i("FragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0133i c0133i = (C0133i) it.next();
            boolean isEmpty = ((List) ((y1.c) ((y1.a) b().f2322e.f33b)).a()).isEmpty();
            if (c0118a == null || isEmpty || !c0118a.f2259b || !this.f2593f.remove(c0133i.f2309f)) {
                C0034a m2 = m(c0133i, c0118a);
                if (!isEmpty) {
                    C0133i c0133i2 = (C0133i) j1.j.s0((List) ((y1.c) ((y1.a) b().f2322e.f33b)).a());
                    if (c0133i2 != null) {
                        k(this, c0133i2.f2309f, 6);
                    }
                    String str = c0133i.f2309f;
                    k(this, str, 6);
                    if (!m2.h) {
                        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
                    }
                    m2.f1065g = true;
                    m2.i = str;
                }
                m2.d(false);
                if (n()) {
                    Log.v("FragmentNavigator", "Calling pushWithTransition via navigate() on entry " + c0133i);
                }
                b().h(c0133i);
            } else {
                s2.w(new Y.Q(s2, c0133i.f2309f, 0), false);
                b().h(c0133i);
            }
        }
    }

    @Override // f0.K
    public final void e(final f0.n nVar) {
        this.f2287a = nVar;
        this.f2288b = true;
        if (n()) {
            Log.v("FragmentNavigator", "onAttach");
        }
        W w2 = new W() { // from class: h0.g
            @Override // Y.W
            public final void a(S s2, AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x) {
                Object obj;
                q1.d.e(s2, "<unused var>");
                q1.d.e(abstractComponentCallbacksC0056x, "fragment");
                f0.n nVar2 = f0.n.this;
                List list = (List) ((y1.c) ((y1.a) nVar2.f2322e.f33b)).a();
                ListIterator listIterator = list.listIterator(list.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        obj = null;
                        break;
                    } else {
                        obj = listIterator.previous();
                        if (q1.d.a(((C0133i) obj).f2309f, abstractComponentCallbacksC0056x.f1203y)) {
                            break;
                        }
                    }
                }
                C0133i c0133i = (C0133i) obj;
                j jVar = this;
                jVar.getClass();
                if (j.n()) {
                    Log.v("FragmentNavigator", "Attaching fragment " + abstractComponentCallbacksC0056x + " associated with entry " + c0133i + " to FragmentManager " + jVar.d);
                }
                if (c0133i != null) {
                    final h hVar = new h(jVar, abstractComponentCallbacksC0056x, c0133i);
                    abstractComponentCallbacksC0056x.f1176P.d(abstractComponentCallbacksC0056x, new B() { // from class: h0.m
                        @Override // androidx.lifecycle.B
                        public final /* synthetic */ void a(Object obj2) {
                            h.this.c(obj2);
                        }

                        public final boolean equals(Object obj2) {
                            if (!(obj2 instanceof B) || !(obj2 instanceof m)) {
                                return false;
                            }
                            return h.this.equals(h.this);
                        }

                        public final int hashCode() {
                            return h.this.hashCode();
                        }
                    });
                    abstractComponentCallbacksC0056x.f1174N.a(jVar.h);
                    jVar.l(abstractComponentCallbacksC0056x, c0133i, nVar2);
                }
            }
        };
        S s2 = this.d;
        s2.f1014n.add(w2);
        l lVar = new l(nVar, this);
        if (s2.f1012l == null) {
            s2.f1012l = new ArrayList();
        }
        s2.f1012l.add(lVar);
    }

    @Override // f0.K
    public final void f(C0133i c0133i) {
        S s2 = this.d;
        if (s2.M()) {
            Log.i("FragmentNavigator", "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state");
            return;
        }
        C0034a m2 = m(c0133i, null);
        List list = (List) ((y1.c) ((y1.a) b().f2322e.f33b)).a();
        if (list.size() > 1) {
            C0133i c0133i2 = (C0133i) j1.j.q0(list, j1.k.h0(list) - 1);
            if (c0133i2 != null) {
                k(this, c0133i2.f2309f, 6);
            }
            String str = c0133i.f2309f;
            k(this, str, 4);
            s2.w(new P(s2, str, -1), false);
            k(this, str, 2);
            if (!m2.h) {
                throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
            }
            m2.f1065g = true;
            m2.i = str;
        }
        m2.d(false);
        b().d(c0133i);
    }

    @Override // f0.K
    public final void g(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("androidx-nav-fragment:navigator:savedIds");
        if (stringArrayList != null) {
            LinkedHashSet linkedHashSet = this.f2593f;
            linkedHashSet.clear();
            p.l0(stringArrayList, linkedHashSet);
        }
    }

    @Override // f0.K
    public final Bundle h() {
        LinkedHashSet linkedHashSet = this.f2593f;
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return Z0.i.f(new i1.d("androidx-nav-fragment:navigator:savedIds", new ArrayList(linkedHashSet)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ab, code lost:
    
        if (q1.d.a(r13.f2309f, r8.f2309f) == false) goto L30;
     */
    @Override // f0.K
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(f0.C0133i r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.j.i(f0.i, boolean):void");
    }

    public final void l(final AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x, final C0133i c0133i, final f0.n nVar) {
        q1.d.e(abstractComponentCallbacksC0056x, "fragment");
        V c2 = abstractComponentCallbacksC0056x.c();
        C0113d c0113d = new C0113d(0);
        c0113d.a(q1.i.a(a.class), new C0125a(7));
        A0.c b2 = c0113d.b();
        C0110a c0110a = C0110a.f1740b;
        q1.d.e(c0110a, "defaultCreationExtras");
        U.v vVar = new U.v(c2, b2, c0110a);
        q1.b a2 = q1.i.a(a.class);
        String s2 = t.s(a2);
        if (s2 == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        ((a) vVar.i(a2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s2))).f2595b = new WeakReference(new p1.a(c0133i, nVar, this, abstractComponentCallbacksC0056x) { // from class: h0.i

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ f0.n f2588a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f2589b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ AbstractComponentCallbacksC0056x f2590c;

            {
                this.f2588a = nVar;
                this.f2589b = this;
                this.f2590c = abstractComponentCallbacksC0056x;
            }

            @Override // p1.a
            public final Object a() {
                f0.n nVar2 = this.f2588a;
                for (C0133i c0133i2 : (Iterable) ((y1.c) ((y1.a) nVar2.f2323f.f33b)).a()) {
                    this.f2589b.getClass();
                    if (j.n()) {
                        Log.v("FragmentNavigator", "Marking transition complete for entry " + c0133i2 + " due to fragment " + this.f2590c + " viewmodel being cleared");
                    }
                    nVar2.c(c0133i2);
                }
                return i1.g.f2679c;
            }
        });
    }

    public final C0034a m(C0133i c0133i, C0118A c0118a) {
        v vVar = c0133i.f2306b;
        q1.d.c(vVar, "null cannot be cast to non-null type androidx.navigation.fragment.FragmentNavigator.Destination");
        Bundle a2 = c0133i.h.a();
        String str = ((k) vVar).f2596g;
        if (str == null) {
            throw new IllegalStateException("Fragment class was not set");
        }
        char charAt = str.charAt(0);
        Context context = this.f2591c;
        if (charAt == '.') {
            str = context.getPackageName() + str;
        }
        S s2 = this.d;
        Y.K E2 = s2.E();
        context.getClassLoader();
        AbstractComponentCallbacksC0056x a3 = E2.a(str);
        q1.d.d(a3, "instantiate(...)");
        a3.K(a2);
        C0034a c0034a = new C0034a(s2);
        int i = c0118a != null ? c0118a.f2262f : -1;
        int i2 = c0118a != null ? c0118a.f2263g : -1;
        int i3 = c0118a != null ? c0118a.h : -1;
        int i4 = c0118a != null ? c0118a.i : -1;
        if (i != -1 || i2 != -1 || i3 != -1 || i4 != -1) {
            if (i == -1) {
                i = 0;
            }
            if (i2 == -1) {
                i2 = 0;
            }
            if (i3 == -1) {
                i3 = 0;
            }
            int i5 = i4 != -1 ? i4 : 0;
            c0034a.f1061b = i;
            c0034a.f1062c = i2;
            c0034a.d = i3;
            c0034a.f1063e = i5;
        }
        int i6 = this.f2592e;
        if (i6 == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        c0034a.e(i6, a3, c0133i.f2309f, 2);
        c0034a.g(a3);
        c0034a.f1072p = true;
        return c0034a;
    }
}
