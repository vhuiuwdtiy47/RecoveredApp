package Y;

import L.C0016l;
import a.C0063e;
import a.InterfaceC0061c;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.C0098v;
import androidx.lifecycle.EnumC0092o;
import c.C0106e;
import c0.C0110a;
import com.android.music.R;
import com.tencent.wechat.Platform;
import e0.C0116a;
import f0.C0133i;
import g.AbstractActivityC0146i;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class S {

    /* renamed from: A, reason: collision with root package name */
    public C0106e f991A;

    /* renamed from: B, reason: collision with root package name */
    public C0106e f992B;

    /* renamed from: C, reason: collision with root package name */
    public C0106e f993C;

    /* renamed from: D, reason: collision with root package name */
    public ArrayDeque f994D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f995E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f996F;
    public boolean G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f997H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f998I;

    /* renamed from: J, reason: collision with root package name */
    public ArrayList f999J;

    /* renamed from: K, reason: collision with root package name */
    public ArrayList f1000K;

    /* renamed from: L, reason: collision with root package name */
    public ArrayList f1001L;

    /* renamed from: M, reason: collision with root package name */
    public V f1002M;

    /* renamed from: N, reason: collision with root package name */
    public final D0.i f1003N;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1005b;
    public ArrayList d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f1007e;

    /* renamed from: g, reason: collision with root package name */
    public a.v f1009g;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f1012l;

    /* renamed from: m, reason: collision with root package name */
    public final C.j f1013m;

    /* renamed from: n, reason: collision with root package name */
    public final CopyOnWriteArrayList f1014n;

    /* renamed from: o, reason: collision with root package name */
    public final F f1015o;

    /* renamed from: p, reason: collision with root package name */
    public final F f1016p;

    /* renamed from: q, reason: collision with root package name */
    public final F f1017q;

    /* renamed from: r, reason: collision with root package name */
    public final F f1018r;

    /* renamed from: s, reason: collision with root package name */
    public final J f1019s;

    /* renamed from: t, reason: collision with root package name */
    public int f1020t;

    /* renamed from: u, reason: collision with root package name */
    public B f1021u;

    /* renamed from: v, reason: collision with root package name */
    public U.t f1022v;

    /* renamed from: w, reason: collision with root package name */
    public AbstractComponentCallbacksC0056x f1023w;

    /* renamed from: x, reason: collision with root package name */
    public AbstractComponentCallbacksC0056x f1024x;

    /* renamed from: y, reason: collision with root package name */
    public final K f1025y;

    /* renamed from: z, reason: collision with root package name */
    public final T0.e f1026z;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1004a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final U.v f1006c = new U.v(1);

    /* renamed from: f, reason: collision with root package name */
    public final E f1008f = new E(this);
    public final I h = new I(0, this);
    public final AtomicInteger i = new AtomicInteger();

    /* renamed from: j, reason: collision with root package name */
    public final Map f1010j = Collections.synchronizedMap(new HashMap());

    /* renamed from: k, reason: collision with root package name */
    public final Map f1011k = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v12, types: [Y.F] */
    /* JADX WARN: Type inference failed for: r0v13, types: [Y.F] */
    /* JADX WARN: Type inference failed for: r0v14, types: [Y.F] */
    /* JADX WARN: Type inference failed for: r0v15, types: [Y.F] */
    public S() {
        final int i = 0;
        Collections.synchronizedMap(new HashMap());
        this.f1013m = new C.j(this);
        this.f1014n = new CopyOnWriteArrayList();
        this.f1015o = new K.a(this) { // from class: Y.F

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ S f969b;

            {
                this.f969b = this;
            }

            @Override // K.a
            public final void a(Object obj) {
                switch (i) {
                    case 0:
                        S s2 = this.f969b;
                        if (s2.J()) {
                            s2.h(false);
                            return;
                        }
                        return;
                    case 1:
                        Integer num = (Integer) obj;
                        S s3 = this.f969b;
                        if (s3.J() && num.intValue() == 80) {
                            s3.l(false);
                            return;
                        }
                        return;
                    case 2:
                        A.f fVar = (A.f) obj;
                        S s4 = this.f969b;
                        if (s4.J()) {
                            boolean z2 = fVar.f13a;
                            s4.m(false);
                            return;
                        }
                        return;
                    default:
                        A.p pVar = (A.p) obj;
                        S s5 = this.f969b;
                        if (s5.J()) {
                            boolean z3 = pVar.f24a;
                            s5.r(false);
                            return;
                        }
                        return;
                }
            }
        };
        final int i2 = 1;
        this.f1016p = new K.a(this) { // from class: Y.F

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ S f969b;

            {
                this.f969b = this;
            }

            @Override // K.a
            public final void a(Object obj) {
                switch (i2) {
                    case 0:
                        S s2 = this.f969b;
                        if (s2.J()) {
                            s2.h(false);
                            return;
                        }
                        return;
                    case 1:
                        Integer num = (Integer) obj;
                        S s3 = this.f969b;
                        if (s3.J() && num.intValue() == 80) {
                            s3.l(false);
                            return;
                        }
                        return;
                    case 2:
                        A.f fVar = (A.f) obj;
                        S s4 = this.f969b;
                        if (s4.J()) {
                            boolean z2 = fVar.f13a;
                            s4.m(false);
                            return;
                        }
                        return;
                    default:
                        A.p pVar = (A.p) obj;
                        S s5 = this.f969b;
                        if (s5.J()) {
                            boolean z3 = pVar.f24a;
                            s5.r(false);
                            return;
                        }
                        return;
                }
            }
        };
        final int i3 = 2;
        this.f1017q = new K.a(this) { // from class: Y.F

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ S f969b;

            {
                this.f969b = this;
            }

            @Override // K.a
            public final void a(Object obj) {
                switch (i3) {
                    case 0:
                        S s2 = this.f969b;
                        if (s2.J()) {
                            s2.h(false);
                            return;
                        }
                        return;
                    case 1:
                        Integer num = (Integer) obj;
                        S s3 = this.f969b;
                        if (s3.J() && num.intValue() == 80) {
                            s3.l(false);
                            return;
                        }
                        return;
                    case 2:
                        A.f fVar = (A.f) obj;
                        S s4 = this.f969b;
                        if (s4.J()) {
                            boolean z2 = fVar.f13a;
                            s4.m(false);
                            return;
                        }
                        return;
                    default:
                        A.p pVar = (A.p) obj;
                        S s5 = this.f969b;
                        if (s5.J()) {
                            boolean z3 = pVar.f24a;
                            s5.r(false);
                            return;
                        }
                        return;
                }
            }
        };
        final int i4 = 3;
        this.f1018r = new K.a(this) { // from class: Y.F

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ S f969b;

            {
                this.f969b = this;
            }

            @Override // K.a
            public final void a(Object obj) {
                switch (i4) {
                    case 0:
                        S s2 = this.f969b;
                        if (s2.J()) {
                            s2.h(false);
                            return;
                        }
                        return;
                    case 1:
                        Integer num = (Integer) obj;
                        S s3 = this.f969b;
                        if (s3.J() && num.intValue() == 80) {
                            s3.l(false);
                            return;
                        }
                        return;
                    case 2:
                        A.f fVar = (A.f) obj;
                        S s4 = this.f969b;
                        if (s4.J()) {
                            boolean z2 = fVar.f13a;
                            s4.m(false);
                            return;
                        }
                        return;
                    default:
                        A.p pVar = (A.p) obj;
                        S s5 = this.f969b;
                        if (s5.J()) {
                            boolean z3 = pVar.f24a;
                            s5.r(false);
                            return;
                        }
                        return;
                }
            }
        };
        this.f1019s = new J(this);
        this.f1020t = -1;
        this.f1025y = new K(this);
        this.f1026z = new T0.e(8);
        this.f994D = new ArrayDeque();
        this.f1003N = new D0.i(6, this);
    }

    public static boolean H(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    public static boolean I(AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x) {
        abstractComponentCallbacksC0056x.getClass();
        Iterator it = abstractComponentCallbacksC0056x.f1199u.f1006c.g().iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x2 = (AbstractComponentCallbacksC0056x) it.next();
            if (abstractComponentCallbacksC0056x2 != null) {
                z2 = I(abstractComponentCallbacksC0056x2);
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    public static boolean K(AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x) {
        if (abstractComponentCallbacksC0056x == null) {
            return true;
        }
        if (abstractComponentCallbacksC0056x.f1164C) {
            return abstractComponentCallbacksC0056x.f1197s == null || K(abstractComponentCallbacksC0056x.f1200v);
        }
        return false;
    }

    public static boolean L(AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x) {
        if (abstractComponentCallbacksC0056x == null) {
            return true;
        }
        S s2 = abstractComponentCallbacksC0056x.f1197s;
        return abstractComponentCallbacksC0056x.equals(s2.f1024x) && L(s2.f1023w);
    }

    public static void b0(AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x) {
        if (H(2)) {
            Log.v("FragmentManager", "show: " + abstractComponentCallbacksC0056x);
        }
        if (abstractComponentCallbacksC0056x.f1204z) {
            abstractComponentCallbacksC0056x.f1204z = false;
            abstractComponentCallbacksC0056x.f1170J = !abstractComponentCallbacksC0056x.f1170J;
        }
    }

    public final int A(String str, int i, boolean z2) {
        ArrayList arrayList = this.d;
        if (arrayList == null || arrayList.isEmpty()) {
            return -1;
        }
        if (str == null && i < 0) {
            if (z2) {
                return 0;
            }
            return this.d.size() - 1;
        }
        int size = this.d.size() - 1;
        while (size >= 0) {
            C0034a c0034a = (C0034a) this.d.get(size);
            if ((str != null && str.equals(c0034a.i)) || (i >= 0 && i == c0034a.f1075s)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (!z2) {
            if (size == this.d.size() - 1) {
                return -1;
            }
            return size + 1;
        }
        while (size > 0) {
            C0034a c0034a2 = (C0034a) this.d.get(size - 1);
            if ((str == null || !str.equals(c0034a2.i)) && (i < 0 || i != c0034a2.f1075s)) {
                break;
            }
            size--;
        }
        return size;
    }

    public final AbstractComponentCallbacksC0056x B(int i) {
        U.v vVar = this.f1006c;
        ArrayList arrayList = (ArrayList) vVar.f790a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x = (AbstractComponentCallbacksC0056x) arrayList.get(size);
            if (abstractComponentCallbacksC0056x != null && abstractComponentCallbacksC0056x.f1201w == i) {
                return abstractComponentCallbacksC0056x;
            }
        }
        for (Y y2 : ((HashMap) vVar.f791b).values()) {
            if (y2 != null) {
                AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x2 = y2.f1052c;
                if (abstractComponentCallbacksC0056x2.f1201w == i) {
                    return abstractComponentCallbacksC0056x2;
                }
            }
        }
        return null;
    }

    public final AbstractComponentCallbacksC0056x C(String str) {
        U.v vVar = this.f1006c;
        if (str != null) {
            ArrayList arrayList = (ArrayList) vVar.f790a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x = (AbstractComponentCallbacksC0056x) arrayList.get(size);
                if (abstractComponentCallbacksC0056x != null && str.equals(abstractComponentCallbacksC0056x.f1203y)) {
                    return abstractComponentCallbacksC0056x;
                }
            }
        }
        if (str == null) {
            vVar.getClass();
            return null;
        }
        for (Y y2 : ((HashMap) vVar.f791b).values()) {
            if (y2 != null) {
                AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x2 = y2.f1052c;
                if (str.equals(abstractComponentCallbacksC0056x2.f1203y)) {
                    return abstractComponentCallbacksC0056x2;
                }
            }
        }
        return null;
    }

    public final ViewGroup D(AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x) {
        ViewGroup viewGroup = abstractComponentCallbacksC0056x.f1166E;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (abstractComponentCallbacksC0056x.f1202x <= 0 || !this.f1022v.Q()) {
            return null;
        }
        View P2 = this.f1022v.P(abstractComponentCallbacksC0056x.f1202x);
        if (P2 instanceof ViewGroup) {
            return (ViewGroup) P2;
        }
        return null;
    }

    public final K E() {
        AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x = this.f1023w;
        return abstractComponentCallbacksC0056x != null ? abstractComponentCallbacksC0056x.f1197s.E() : this.f1025y;
    }

    public final T0.e F() {
        AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x = this.f1023w;
        return abstractComponentCallbacksC0056x != null ? abstractComponentCallbacksC0056x.f1197s.F() : this.f1026z;
    }

    public final void G(AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x) {
        if (H(2)) {
            Log.v("FragmentManager", "hide: " + abstractComponentCallbacksC0056x);
        }
        if (abstractComponentCallbacksC0056x.f1204z) {
            return;
        }
        abstractComponentCallbacksC0056x.f1204z = true;
        abstractComponentCallbacksC0056x.f1170J = true ^ abstractComponentCallbacksC0056x.f1170J;
        a0(abstractComponentCallbacksC0056x);
    }

    public final boolean J() {
        AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x = this.f1023w;
        if (abstractComponentCallbacksC0056x == null) {
            return true;
        }
        return abstractComponentCallbacksC0056x.f1198t != null && abstractComponentCallbacksC0056x.f1189k && abstractComponentCallbacksC0056x.k().J();
    }

    public final boolean M() {
        return this.f996F || this.G;
    }

    public final void N(int i, boolean z2) {
        HashMap hashMap;
        B b2;
        if (this.f1021u == null && i != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z2 || i != this.f1020t) {
            this.f1020t = i;
            U.v vVar = this.f1006c;
            Iterator it = ((ArrayList) vVar.f790a).iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                hashMap = (HashMap) vVar.f791b;
                if (!hasNext) {
                    break;
                }
                Y y2 = (Y) hashMap.get(((AbstractComponentCallbacksC0056x) it.next()).f1185e);
                if (y2 != null) {
                    y2.k();
                }
            }
            for (Y y3 : hashMap.values()) {
                if (y3 != null) {
                    y3.k();
                    AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x = y3.f1052c;
                    if (abstractComponentCallbacksC0056x.f1190l && !abstractComponentCallbacksC0056x.p()) {
                        if (abstractComponentCallbacksC0056x.f1191m && !((HashMap) vVar.f792c).containsKey(abstractComponentCallbacksC0056x.f1185e)) {
                            vVar.n(y3.o(), abstractComponentCallbacksC0056x.f1185e);
                        }
                        vVar.k(y3);
                    }
                }
            }
            c0();
            if (this.f995E && (b2 = this.f1021u) != null && this.f1020t == 7) {
                b2.i.invalidateOptionsMenu();
                this.f995E = false;
            }
        }
    }

    public final void O() {
        if (this.f1021u == null) {
            return;
        }
        this.f996F = false;
        this.G = false;
        this.f1002M.f1038g = false;
        for (AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x : this.f1006c.h()) {
            if (abstractComponentCallbacksC0056x != null) {
                abstractComponentCallbacksC0056x.f1199u.O();
            }
        }
    }

    public final boolean P() {
        return Q(-1, 0);
    }

    public final boolean Q(int i, int i2) {
        y(false);
        x(true);
        AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x = this.f1024x;
        if (abstractComponentCallbacksC0056x != null && i < 0 && abstractComponentCallbacksC0056x.g().P()) {
            return true;
        }
        boolean R2 = R(this.f999J, this.f1000K, null, i, i2);
        if (R2) {
            this.f1005b = true;
            try {
                T(this.f999J, this.f1000K);
            } finally {
                d();
            }
        }
        e0();
        if (this.f998I) {
            this.f998I = false;
            c0();
        }
        ((HashMap) this.f1006c.f791b).values().removeAll(Collections.singleton(null));
        return R2;
    }

    public final boolean R(ArrayList arrayList, ArrayList arrayList2, String str, int i, int i2) {
        int A2 = A(str, i, (i2 & 1) != 0);
        if (A2 < 0) {
            return false;
        }
        for (int size = this.d.size() - 1; size >= A2; size--) {
            arrayList.add((C0034a) this.d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void S(AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x) {
        if (H(2)) {
            Log.v("FragmentManager", "remove: " + abstractComponentCallbacksC0056x + " nesting=" + abstractComponentCallbacksC0056x.f1196r);
        }
        boolean p2 = abstractComponentCallbacksC0056x.p();
        if (abstractComponentCallbacksC0056x.f1162A && p2) {
            return;
        }
        U.v vVar = this.f1006c;
        synchronized (((ArrayList) vVar.f790a)) {
            ((ArrayList) vVar.f790a).remove(abstractComponentCallbacksC0056x);
        }
        abstractComponentCallbacksC0056x.f1189k = false;
        if (I(abstractComponentCallbacksC0056x)) {
            this.f995E = true;
        }
        abstractComponentCallbacksC0056x.f1190l = true;
        a0(abstractComponentCallbacksC0056x);
    }

    public final void T(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (!((C0034a) arrayList.get(i)).f1072p) {
                if (i2 != i) {
                    z(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((C0034a) arrayList.get(i2)).f1072p) {
                        i2++;
                    }
                }
                z(arrayList, arrayList2, i, i2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 != size) {
            z(arrayList, arrayList2, i2, size);
        }
    }

    public final void U(Bundle bundle) {
        C.j jVar;
        Y y2;
        Bundle bundle2;
        Bundle bundle3;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle3 = bundle.getBundle(str)) != null) {
                bundle3.setClassLoader(this.f1021u.f959f.getClassLoader());
                this.f1011k.put(str.substring(7), bundle3);
            }
        }
        HashMap hashMap = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle2 = bundle.getBundle(str2)) != null) {
                bundle2.setClassLoader(this.f1021u.f959f.getClassLoader());
                hashMap.put(str2.substring(9), bundle2);
            }
        }
        U.v vVar = this.f1006c;
        HashMap hashMap2 = (HashMap) vVar.f792c;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        T t2 = (T) bundle.getParcelable("state");
        if (t2 == null) {
            return;
        }
        HashMap hashMap3 = (HashMap) vVar.f791b;
        hashMap3.clear();
        Iterator it = t2.f1027a.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            jVar = this.f1013m;
            if (!hasNext) {
                break;
            }
            Bundle n2 = vVar.n(null, (String) it.next());
            if (n2 != null) {
                AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x = (AbstractComponentCallbacksC0056x) this.f1002M.f1034b.get(((X) n2.getParcelable("state")).f1040b);
                if (abstractComponentCallbacksC0056x != null) {
                    if (H(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + abstractComponentCallbacksC0056x);
                    }
                    y2 = new Y(jVar, vVar, abstractComponentCallbacksC0056x, n2);
                } else {
                    y2 = new Y(this.f1013m, this.f1006c, this.f1021u.f959f.getClassLoader(), E(), n2);
                }
                AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x2 = y2.f1052c;
                abstractComponentCallbacksC0056x2.f1183b = n2;
                abstractComponentCallbacksC0056x2.f1197s = this;
                if (H(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + abstractComponentCallbacksC0056x2.f1185e + "): " + abstractComponentCallbacksC0056x2);
                }
                y2.m(this.f1021u.f959f.getClassLoader());
                vVar.j(y2);
                y2.f1053e = this.f1020t;
            }
        }
        V v2 = this.f1002M;
        v2.getClass();
        Iterator it2 = new ArrayList(v2.f1034b.values()).iterator();
        while (it2.hasNext()) {
            AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x3 = (AbstractComponentCallbacksC0056x) it2.next();
            if (hashMap3.get(abstractComponentCallbacksC0056x3.f1185e) == null) {
                if (H(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + abstractComponentCallbacksC0056x3 + " that was not found in the set of active Fragments " + t2.f1027a);
                }
                this.f1002M.f(abstractComponentCallbacksC0056x3);
                abstractComponentCallbacksC0056x3.f1197s = this;
                Y y3 = new Y(jVar, vVar, abstractComponentCallbacksC0056x3);
                y3.f1053e = 1;
                y3.k();
                abstractComponentCallbacksC0056x3.f1190l = true;
                y3.k();
            }
        }
        ArrayList<String> arrayList = t2.f1028b;
        ((ArrayList) vVar.f790a).clear();
        if (arrayList != null) {
            for (String str3 : arrayList) {
                AbstractComponentCallbacksC0056x c2 = vVar.c(str3);
                if (c2 == null) {
                    throw new IllegalStateException(D.f.d("No instantiated fragment for (", str3, ")"));
                }
                if (H(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + c2);
                }
                vVar.a(c2);
            }
        }
        if (t2.f1029c != null) {
            this.d = new ArrayList(t2.f1029c.length);
            int i = 0;
            while (true) {
                C0035b[] c0035bArr = t2.f1029c;
                if (i >= c0035bArr.length) {
                    break;
                }
                C0035b c0035b = c0035bArr[i];
                c0035b.getClass();
                C0034a c0034a = new C0034a(this);
                c0035b.a(c0034a);
                c0034a.f1075s = c0035b.f1086g;
                int i2 = 0;
                while (true) {
                    ArrayList arrayList2 = c0035b.f1082b;
                    if (i2 >= arrayList2.size()) {
                        break;
                    }
                    String str4 = (String) arrayList2.get(i2);
                    if (str4 != null) {
                        ((Z) c0034a.f1060a.get(i2)).f1055b = vVar.c(str4);
                    }
                    i2++;
                }
                c0034a.c(1);
                if (H(2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i + " (index " + c0034a.f1075s + "): " + c0034a);
                    PrintWriter printWriter = new PrintWriter(new b0());
                    c0034a.f("  ", printWriter, false);
                    printWriter.close();
                }
                this.d.add(c0034a);
                i++;
            }
        } else {
            this.d = null;
        }
        this.i.set(t2.d);
        String str5 = t2.f1030e;
        if (str5 != null) {
            AbstractComponentCallbacksC0056x c3 = vVar.c(str5);
            this.f1024x = c3;
            q(c3);
        }
        ArrayList arrayList3 = t2.f1031f;
        if (arrayList3 != null) {
            for (int i3 = 0; i3 < arrayList3.size(); i3++) {
                this.f1010j.put((String) arrayList3.get(i3), (C0036c) t2.f1032g.get(i3));
            }
        }
        this.f994D = new ArrayDeque(t2.h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.os.Parcelable, java.lang.Object, Y.T] */
    public final Bundle V() {
        int i;
        ArrayList arrayList;
        C0035b[] c0035bArr;
        int size;
        Bundle bundle = new Bundle();
        Iterator it = e().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C0044k c0044k = (C0044k) it.next();
            if (c0044k.f1125e) {
                if (H(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                c0044k.f1125e = false;
                c0044k.c();
            }
        }
        v();
        y(true);
        this.f996F = true;
        this.f1002M.f1038g = true;
        U.v vVar = this.f1006c;
        vVar.getClass();
        HashMap hashMap = (HashMap) vVar.f791b;
        ArrayList arrayList2 = new ArrayList(hashMap.size());
        for (Y y2 : hashMap.values()) {
            if (y2 != null) {
                AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x = y2.f1052c;
                vVar.n(y2.o(), abstractComponentCallbacksC0056x.f1185e);
                arrayList2.add(abstractComponentCallbacksC0056x.f1185e);
                if (H(2)) {
                    Log.v("FragmentManager", "Saved state of " + abstractComponentCallbacksC0056x + ": " + abstractComponentCallbacksC0056x.f1183b);
                }
            }
        }
        HashMap hashMap2 = (HashMap) this.f1006c.f792c;
        if (!hashMap2.isEmpty()) {
            U.v vVar2 = this.f1006c;
            synchronized (((ArrayList) vVar2.f790a)) {
                try {
                    if (((ArrayList) vVar2.f790a).isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(((ArrayList) vVar2.f790a).size());
                        Iterator it2 = ((ArrayList) vVar2.f790a).iterator();
                        while (it2.hasNext()) {
                            AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x2 = (AbstractComponentCallbacksC0056x) it2.next();
                            arrayList.add(abstractComponentCallbacksC0056x2.f1185e);
                            if (H(2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + abstractComponentCallbacksC0056x2.f1185e + "): " + abstractComponentCallbacksC0056x2);
                            }
                        }
                    }
                } finally {
                }
            }
            ArrayList arrayList3 = this.d;
            if (arrayList3 == null || (size = arrayList3.size()) <= 0) {
                c0035bArr = null;
            } else {
                c0035bArr = new C0035b[size];
                for (i = 0; i < size; i++) {
                    c0035bArr[i] = new C0035b((C0034a) this.d.get(i));
                    if (H(2)) {
                        Log.v("FragmentManager", "saveAllState: adding back stack #" + i + ": " + this.d.get(i));
                    }
                }
            }
            ?? obj = new Object();
            obj.f1030e = null;
            ArrayList arrayList4 = new ArrayList();
            obj.f1031f = arrayList4;
            ArrayList arrayList5 = new ArrayList();
            obj.f1032g = arrayList5;
            obj.f1027a = arrayList2;
            obj.f1028b = arrayList;
            obj.f1029c = c0035bArr;
            obj.d = this.i.get();
            AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x3 = this.f1024x;
            if (abstractComponentCallbacksC0056x3 != null) {
                obj.f1030e = abstractComponentCallbacksC0056x3.f1185e;
            }
            arrayList4.addAll(this.f1010j.keySet());
            arrayList5.addAll(this.f1010j.values());
            obj.h = new ArrayList(this.f994D);
            bundle.putParcelable("state", obj);
            for (String str : this.f1011k.keySet()) {
                bundle.putBundle("result_" + str, (Bundle) this.f1011k.get(str));
            }
            for (String str2 : hashMap2.keySet()) {
                bundle.putBundle("fragment_" + str2, (Bundle) hashMap2.get(str2));
            }
        } else if (H(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return bundle;
        }
        return bundle;
    }

    public final void W() {
        synchronized (this.f1004a) {
            try {
                if (this.f1004a.size() == 1) {
                    this.f1021u.f960g.removeCallbacks(this.f1003N);
                    this.f1021u.f960g.post(this.f1003N);
                    e0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void X(AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x, boolean z2) {
        ViewGroup D2 = D(abstractComponentCallbacksC0056x);
        if (D2 == null || !(D2 instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) D2).setDrawDisappearingViewsLast(!z2);
    }

    public final void Y(AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x, EnumC0092o enumC0092o) {
        if (abstractComponentCallbacksC0056x.equals(this.f1006c.c(abstractComponentCallbacksC0056x.f1185e)) && (abstractComponentCallbacksC0056x.f1198t == null || abstractComponentCallbacksC0056x.f1197s == this)) {
            abstractComponentCallbacksC0056x.f1173M = enumC0092o;
            return;
        }
        throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC0056x + " is not an active fragment of FragmentManager " + this);
    }

    public final void Z(AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x) {
        if (abstractComponentCallbacksC0056x != null) {
            if (!abstractComponentCallbacksC0056x.equals(this.f1006c.c(abstractComponentCallbacksC0056x.f1185e)) || (abstractComponentCallbacksC0056x.f1198t != null && abstractComponentCallbacksC0056x.f1197s != this)) {
                throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC0056x + " is not an active fragment of FragmentManager " + this);
            }
        }
        AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x2 = this.f1024x;
        this.f1024x = abstractComponentCallbacksC0056x;
        q(abstractComponentCallbacksC0056x2);
        q(this.f1024x);
    }

    public final Y a(AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x) {
        String str = abstractComponentCallbacksC0056x.f1172L;
        if (str != null) {
            Z.d.c(abstractComponentCallbacksC0056x, str);
        }
        if (H(2)) {
            Log.v("FragmentManager", "add: " + abstractComponentCallbacksC0056x);
        }
        Y f2 = f(abstractComponentCallbacksC0056x);
        abstractComponentCallbacksC0056x.f1197s = this;
        U.v vVar = this.f1006c;
        vVar.j(f2);
        if (!abstractComponentCallbacksC0056x.f1162A) {
            vVar.a(abstractComponentCallbacksC0056x);
            abstractComponentCallbacksC0056x.f1190l = false;
            if (abstractComponentCallbacksC0056x.f1167F == null) {
                abstractComponentCallbacksC0056x.f1170J = false;
            }
            if (I(abstractComponentCallbacksC0056x)) {
                this.f995E = true;
            }
        }
        return f2;
    }

    public final void a0(AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x) {
        ViewGroup D2 = D(abstractComponentCallbacksC0056x);
        if (D2 != null) {
            C0053u c0053u = abstractComponentCallbacksC0056x.f1169I;
            if ((c0053u == null ? 0 : c0053u.f1156e) + (c0053u == null ? 0 : c0053u.d) + (c0053u == null ? 0 : c0053u.f1155c) + (c0053u == null ? 0 : c0053u.f1154b) > 0) {
                if (D2.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    D2.setTag(R.id.visible_removing_fragment_view_tag, abstractComponentCallbacksC0056x);
                }
                AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x2 = (AbstractComponentCallbacksC0056x) D2.getTag(R.id.visible_removing_fragment_view_tag);
                C0053u c0053u2 = abstractComponentCallbacksC0056x.f1169I;
                boolean z2 = c0053u2 != null ? c0053u2.f1153a : false;
                if (abstractComponentCallbacksC0056x2.f1169I == null) {
                    return;
                }
                abstractComponentCallbacksC0056x2.f().f1153a = z2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(B b2, U.t tVar, AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x) {
        String str;
        if (this.f1021u != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f1021u = b2;
        this.f1022v = tVar;
        this.f1023w = abstractComponentCallbacksC0056x;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f1014n;
        if (abstractComponentCallbacksC0056x != 0) {
            copyOnWriteArrayList.add(new L(abstractComponentCallbacksC0056x));
        } else if (b2 != null) {
            copyOnWriteArrayList.add(b2);
        }
        if (this.f1023w != null) {
            e0();
        }
        if (b2 != null) {
            a.v h = b2.i.h();
            this.f1009g = h;
            B b3 = abstractComponentCallbacksC0056x != 0 ? abstractComponentCallbacksC0056x : b2;
            h.getClass();
            I i = this.h;
            q1.d.e(i, "onBackPressedCallback");
            C0098v d = b3.d();
            if (d.f1600c != EnumC0092o.f1590a) {
                i.f975b.add(new a.s(h, d, i));
                h.c();
                i.f976c = new a.u(0, h);
            }
        }
        if (abstractComponentCallbacksC0056x != 0) {
            V v2 = abstractComponentCallbacksC0056x.f1197s.f1002M;
            HashMap hashMap = v2.f1035c;
            V v3 = (V) hashMap.get(abstractComponentCallbacksC0056x.f1185e);
            if (v3 == null) {
                v3 = new V(v2.f1036e);
                hashMap.put(abstractComponentCallbacksC0056x.f1185e, v3);
            }
            this.f1002M = v3;
        } else if (b2 != null) {
            androidx.lifecycle.V c2 = b2.i.c();
            U u2 = V.h;
            q1.d.e(c2, "store");
            C0110a c0110a = C0110a.f1740b;
            q1.d.e(c0110a, "defaultCreationExtras");
            U.v vVar = new U.v(c2, u2, c0110a);
            q1.b a2 = q1.i.a(V.class);
            String s2 = U.t.s(a2);
            if (s2 == null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            this.f1002M = (V) vVar.i(a2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s2));
        } else {
            this.f1002M = new V(false);
        }
        this.f1002M.f1038g = M();
        this.f1006c.d = this.f1002M;
        B b4 = this.f1021u;
        if (b4 != null && abstractComponentCallbacksC0056x == 0) {
            C.j b5 = b4.b();
            b5.I("android:support:fragments", new G(0, this));
            Bundle b6 = b5.b("android:support:fragments");
            if (b6 != null) {
                U(b6);
            }
        }
        B b7 = this.f1021u;
        if (b7 != null) {
            AbstractActivityC0146i abstractActivityC0146i = b7.i;
            if (abstractComponentCallbacksC0056x != 0) {
                str = abstractComponentCallbacksC0056x.f1185e + ":";
            } else {
                str = "";
            }
            String str2 = "FragmentManager:" + str;
            String c3 = D.f.c(str2, "StartActivityForResult");
            M m2 = new M(3);
            H h2 = new H(this, 1);
            C0063e c0063e = abstractActivityC0146i.f1273j;
            this.f991A = c0063e.c(c3, m2, h2);
            this.f992B = c0063e.c(D.f.c(str2, "StartIntentSenderForResult"), new M(0), new H(this, 2));
            this.f993C = c0063e.c(D.f.c(str2, "RequestPermissions"), new M(1), new H(this, 0));
        }
        B b8 = this.f1021u;
        if (b8 != null) {
            b8.i.f(this.f1015o);
        }
        B b9 = this.f1021u;
        if (b9 != null) {
            b9.i.f1275l.add(this.f1016p);
        }
        B b10 = this.f1021u;
        if (b10 != null) {
            b10.i.f1277n.add(this.f1017q);
        }
        B b11 = this.f1021u;
        if (b11 != null) {
            b11.i.f1278o.add(this.f1018r);
        }
        B b12 = this.f1021u;
        if (b12 == null || abstractComponentCallbacksC0056x != 0) {
            return;
        }
        AbstractActivityC0146i abstractActivityC0146i2 = b12.i;
        J j2 = this.f1019s;
        C0016l c0016l = abstractActivityC0146i2.f1269c;
        ((CopyOnWriteArrayList) c0016l.f362c).add(j2);
        ((Runnable) c0016l.f361b).run();
    }

    public final void c(AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x) {
        if (H(2)) {
            Log.v("FragmentManager", "attach: " + abstractComponentCallbacksC0056x);
        }
        if (abstractComponentCallbacksC0056x.f1162A) {
            abstractComponentCallbacksC0056x.f1162A = false;
            if (abstractComponentCallbacksC0056x.f1189k) {
                return;
            }
            this.f1006c.a(abstractComponentCallbacksC0056x);
            if (H(2)) {
                Log.v("FragmentManager", "add from attach: " + abstractComponentCallbacksC0056x);
            }
            if (I(abstractComponentCallbacksC0056x)) {
                this.f995E = true;
            }
        }
    }

    public final void c0() {
        Iterator it = this.f1006c.f().iterator();
        while (it.hasNext()) {
            Y y2 = (Y) it.next();
            AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x = y2.f1052c;
            if (abstractComponentCallbacksC0056x.G) {
                if (this.f1005b) {
                    this.f998I = true;
                } else {
                    abstractComponentCallbacksC0056x.G = false;
                    y2.k();
                }
            }
        }
    }

    public final void d() {
        this.f1005b = false;
        this.f1000K.clear();
        this.f999J.clear();
    }

    public final void d0(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new b0());
        B b2 = this.f1021u;
        if (b2 == null) {
            try {
                u("  ", null, printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e2) {
                Log.e("FragmentManager", "Failed dumping state", e2);
                throw runtimeException;
            }
        }
        try {
            b2.i.dump("  ", null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e3) {
            Log.e("FragmentManager", "Failed dumping state", e3);
            throw runtimeException;
        }
    }

    public final HashSet e() {
        C0044k c0044k;
        HashSet hashSet = new HashSet();
        Iterator it = this.f1006c.f().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((Y) it.next()).f1052c.f1166E;
            if (viewGroup != null) {
                q1.d.e(F(), "factory");
                Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
                if (tag instanceof C0044k) {
                    c0044k = (C0044k) tag;
                } else {
                    c0044k = new C0044k(viewGroup);
                    viewGroup.setTag(R.id.special_effects_controller_view_tag, c0044k);
                }
                hashSet.add(c0044k);
            }
        }
        return hashSet;
    }

    public final void e0() {
        synchronized (this.f1004a) {
            try {
                if (!this.f1004a.isEmpty()) {
                    this.h.a(true);
                    return;
                }
                I i = this.h;
                ArrayList arrayList = this.d;
                i.a((arrayList != null ? arrayList.size() : 0) > 0 && L(this.f1023w));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Y f(AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x) {
        String str = abstractComponentCallbacksC0056x.f1185e;
        U.v vVar = this.f1006c;
        Y y2 = (Y) ((HashMap) vVar.f791b).get(str);
        if (y2 != null) {
            return y2;
        }
        Y y3 = new Y(this.f1013m, vVar, abstractComponentCallbacksC0056x);
        y3.m(this.f1021u.f959f.getClassLoader());
        y3.f1053e = this.f1020t;
        return y3;
    }

    public final void g(AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x) {
        if (H(2)) {
            Log.v("FragmentManager", "detach: " + abstractComponentCallbacksC0056x);
        }
        if (abstractComponentCallbacksC0056x.f1162A) {
            return;
        }
        abstractComponentCallbacksC0056x.f1162A = true;
        if (abstractComponentCallbacksC0056x.f1189k) {
            if (H(2)) {
                Log.v("FragmentManager", "remove from detach: " + abstractComponentCallbacksC0056x);
            }
            U.v vVar = this.f1006c;
            synchronized (((ArrayList) vVar.f790a)) {
                ((ArrayList) vVar.f790a).remove(abstractComponentCallbacksC0056x);
            }
            abstractComponentCallbacksC0056x.f1189k = false;
            if (I(abstractComponentCallbacksC0056x)) {
                this.f995E = true;
            }
            a0(abstractComponentCallbacksC0056x);
        }
    }

    public final void h(boolean z2) {
        if (z2 && this.f1021u != null) {
            d0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x : this.f1006c.h()) {
            if (abstractComponentCallbacksC0056x != null) {
                abstractComponentCallbacksC0056x.f1165D = true;
                if (z2) {
                    abstractComponentCallbacksC0056x.f1199u.h(true);
                }
            }
        }
    }

    public final boolean i() {
        if (this.f1020t >= 1) {
            for (AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x : this.f1006c.h()) {
                if (abstractComponentCallbacksC0056x != null) {
                    if (!abstractComponentCallbacksC0056x.f1204z ? abstractComponentCallbacksC0056x.f1199u.i() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean j() {
        if (this.f1020t < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z2 = false;
        for (AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x : this.f1006c.h()) {
            if (abstractComponentCallbacksC0056x != null && K(abstractComponentCallbacksC0056x)) {
                if (!abstractComponentCallbacksC0056x.f1204z ? abstractComponentCallbacksC0056x.f1199u.j() : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(abstractComponentCallbacksC0056x);
                    z2 = true;
                }
            }
        }
        if (this.f1007e != null) {
            for (int i = 0; i < this.f1007e.size(); i++) {
                AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x2 = (AbstractComponentCallbacksC0056x) this.f1007e.get(i);
                if (arrayList == null || !arrayList.contains(abstractComponentCallbacksC0056x2)) {
                    abstractComponentCallbacksC0056x2.getClass();
                }
            }
        }
        this.f1007e = arrayList;
        return z2;
    }

    public final void k() {
        boolean z2 = true;
        this.f997H = true;
        y(true);
        v();
        B b2 = this.f1021u;
        U.v vVar = this.f1006c;
        if (b2 != null) {
            z2 = ((V) vVar.d).f1037f;
        } else {
            AbstractActivityC0146i abstractActivityC0146i = b2.f959f;
            if (abstractActivityC0146i != null) {
                z2 = true ^ abstractActivityC0146i.isChangingConfigurations();
            }
        }
        if (z2) {
            Iterator it = this.f1010j.values().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((C0036c) it.next()).f1094a.iterator();
                while (it2.hasNext()) {
                    ((V) vVar.d).d((String) it2.next(), false);
                }
            }
        }
        t(-1);
        B b3 = this.f1021u;
        if (b3 != null) {
            AbstractActivityC0146i abstractActivityC0146i2 = b3.i;
            abstractActivityC0146i2.f1275l.remove(this.f1016p);
        }
        B b4 = this.f1021u;
        if (b4 != null) {
            AbstractActivityC0146i abstractActivityC0146i3 = b4.i;
            abstractActivityC0146i3.f1274k.remove(this.f1015o);
        }
        B b5 = this.f1021u;
        if (b5 != null) {
            AbstractActivityC0146i abstractActivityC0146i4 = b5.i;
            abstractActivityC0146i4.f1277n.remove(this.f1017q);
        }
        B b6 = this.f1021u;
        if (b6 != null) {
            AbstractActivityC0146i abstractActivityC0146i5 = b6.i;
            abstractActivityC0146i5.f1278o.remove(this.f1018r);
        }
        B b7 = this.f1021u;
        if (b7 != null && this.f1023w == null) {
            AbstractActivityC0146i abstractActivityC0146i6 = b7.i;
            J j2 = this.f1019s;
            C0016l c0016l = abstractActivityC0146i6.f1269c;
            ((CopyOnWriteArrayList) c0016l.f362c).remove(j2);
            if (((HashMap) c0016l.d).remove(j2) != null) {
                throw new ClassCastException();
            }
            ((Runnable) c0016l.f361b).run();
        }
        this.f1021u = null;
        this.f1022v = null;
        this.f1023w = null;
        if (this.f1009g != null) {
            Iterator it3 = this.h.f975b.iterator();
            while (it3.hasNext()) {
                ((InterfaceC0061c) it3.next()).cancel();
            }
            this.f1009g = null;
        }
        C0106e c0106e = this.f991A;
        if (c0106e != null) {
            c0106e.b();
            this.f992B.b();
            this.f993C.b();
        }
    }

    public final void l(boolean z2) {
        if (z2 && this.f1021u != null) {
            d0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x : this.f1006c.h()) {
            if (abstractComponentCallbacksC0056x != null) {
                abstractComponentCallbacksC0056x.f1165D = true;
                if (z2) {
                    abstractComponentCallbacksC0056x.f1199u.l(true);
                }
            }
        }
    }

    public final void m(boolean z2) {
        if (z2 && this.f1021u != null) {
            d0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x : this.f1006c.h()) {
            if (abstractComponentCallbacksC0056x != null && z2) {
                abstractComponentCallbacksC0056x.f1199u.m(true);
            }
        }
    }

    public final void n() {
        Iterator it = this.f1006c.g().iterator();
        while (it.hasNext()) {
            AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x = (AbstractComponentCallbacksC0056x) it.next();
            if (abstractComponentCallbacksC0056x != null) {
                abstractComponentCallbacksC0056x.o();
                abstractComponentCallbacksC0056x.f1199u.n();
            }
        }
    }

    public final boolean o() {
        if (this.f1020t >= 1) {
            for (AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x : this.f1006c.h()) {
                if (abstractComponentCallbacksC0056x != null) {
                    if (!abstractComponentCallbacksC0056x.f1204z ? abstractComponentCallbacksC0056x.f1199u.o() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void p() {
        if (this.f1020t < 1) {
            return;
        }
        for (AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x : this.f1006c.h()) {
            if (abstractComponentCallbacksC0056x != null && !abstractComponentCallbacksC0056x.f1204z) {
                abstractComponentCallbacksC0056x.f1199u.p();
            }
        }
    }

    public final void q(AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x) {
        if (abstractComponentCallbacksC0056x != null) {
            if (abstractComponentCallbacksC0056x.equals(this.f1006c.c(abstractComponentCallbacksC0056x.f1185e))) {
                abstractComponentCallbacksC0056x.f1197s.getClass();
                boolean L2 = L(abstractComponentCallbacksC0056x);
                Boolean bool = abstractComponentCallbacksC0056x.f1188j;
                if (bool == null || bool.booleanValue() != L2) {
                    abstractComponentCallbacksC0056x.f1188j = Boolean.valueOf(L2);
                    S s2 = abstractComponentCallbacksC0056x.f1199u;
                    s2.e0();
                    s2.q(s2.f1024x);
                }
            }
        }
    }

    public final void r(boolean z2) {
        if (z2 && this.f1021u != null) {
            d0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x : this.f1006c.h()) {
            if (abstractComponentCallbacksC0056x != null && z2) {
                abstractComponentCallbacksC0056x.f1199u.r(true);
            }
        }
    }

    public final boolean s() {
        if (this.f1020t < 1) {
            return false;
        }
        boolean z2 = false;
        for (AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x : this.f1006c.h()) {
            if (abstractComponentCallbacksC0056x != null && K(abstractComponentCallbacksC0056x)) {
                if (!abstractComponentCallbacksC0056x.f1204z ? abstractComponentCallbacksC0056x.f1199u.s() : false) {
                    z2 = true;
                }
            }
        }
        return z2;
    }

    public final void t(int i) {
        try {
            this.f1005b = true;
            for (Y y2 : ((HashMap) this.f1006c.f791b).values()) {
                if (y2 != null) {
                    y2.f1053e = i;
                }
            }
            N(i, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((C0044k) it.next()).e();
            }
            this.f1005b = false;
            y(true);
        } catch (Throwable th) {
            this.f1005b = false;
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x = this.f1023w;
        if (abstractComponentCallbacksC0056x != null) {
            sb.append(abstractComponentCallbacksC0056x.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f1023w)));
            sb.append("}");
        } else {
            B b2 = this.f1021u;
            if (b2 != null) {
                sb.append(b2.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f1021u)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void u(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2;
        String c2 = D.f.c(str, "    ");
        U.v vVar = this.f1006c;
        vVar.getClass();
        String str3 = str + "    ";
        HashMap hashMap = (HashMap) vVar.f791b;
        if (!hashMap.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (Y y2 : hashMap.values()) {
                printWriter.print(str);
                if (y2 != null) {
                    AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x = y2.f1052c;
                    printWriter.println(abstractComponentCallbacksC0056x);
                    abstractComponentCallbacksC0056x.getClass();
                    printWriter.print(str3);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(abstractComponentCallbacksC0056x.f1201w));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(abstractComponentCallbacksC0056x.f1202x));
                    printWriter.print(" mTag=");
                    printWriter.println(abstractComponentCallbacksC0056x.f1203y);
                    printWriter.print(str3);
                    printWriter.print("mState=");
                    printWriter.print(abstractComponentCallbacksC0056x.f1182a);
                    printWriter.print(" mWho=");
                    printWriter.print(abstractComponentCallbacksC0056x.f1185e);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(abstractComponentCallbacksC0056x.f1196r);
                    printWriter.print(str3);
                    printWriter.print("mAdded=");
                    printWriter.print(abstractComponentCallbacksC0056x.f1189k);
                    printWriter.print(" mRemoving=");
                    printWriter.print(abstractComponentCallbacksC0056x.f1190l);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(abstractComponentCallbacksC0056x.f1192n);
                    printWriter.print(" mInLayout=");
                    printWriter.println(abstractComponentCallbacksC0056x.f1193o);
                    printWriter.print(str3);
                    printWriter.print("mHidden=");
                    printWriter.print(abstractComponentCallbacksC0056x.f1204z);
                    printWriter.print(" mDetached=");
                    printWriter.print(abstractComponentCallbacksC0056x.f1162A);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(abstractComponentCallbacksC0056x.f1164C);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(false);
                    printWriter.print(str3);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(abstractComponentCallbacksC0056x.f1163B);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(abstractComponentCallbacksC0056x.f1168H);
                    if (abstractComponentCallbacksC0056x.f1197s != null) {
                        printWriter.print(str3);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(abstractComponentCallbacksC0056x.f1197s);
                    }
                    if (abstractComponentCallbacksC0056x.f1198t != null) {
                        printWriter.print(str3);
                        printWriter.print("mHost=");
                        printWriter.println(abstractComponentCallbacksC0056x.f1198t);
                    }
                    if (abstractComponentCallbacksC0056x.f1200v != null) {
                        printWriter.print(str3);
                        printWriter.print("mParentFragment=");
                        printWriter.println(abstractComponentCallbacksC0056x.f1200v);
                    }
                    if (abstractComponentCallbacksC0056x.f1186f != null) {
                        printWriter.print(str3);
                        printWriter.print("mArguments=");
                        printWriter.println(abstractComponentCallbacksC0056x.f1186f);
                    }
                    if (abstractComponentCallbacksC0056x.f1183b != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(abstractComponentCallbacksC0056x.f1183b);
                    }
                    if (abstractComponentCallbacksC0056x.f1184c != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(abstractComponentCallbacksC0056x.f1184c);
                    }
                    if (abstractComponentCallbacksC0056x.d != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedViewRegistryState=");
                        printWriter.println(abstractComponentCallbacksC0056x.d);
                    }
                    Object obj = abstractComponentCallbacksC0056x.f1187g;
                    if (obj == null) {
                        S s2 = abstractComponentCallbacksC0056x.f1197s;
                        obj = (s2 == null || (str2 = abstractComponentCallbacksC0056x.h) == null) ? null : s2.f1006c.c(str2);
                    }
                    if (obj != null) {
                        printWriter.print(str3);
                        printWriter.print("mTarget=");
                        printWriter.print(obj);
                        printWriter.print(" mTargetRequestCode=");
                        printWriter.println(abstractComponentCallbacksC0056x.i);
                    }
                    printWriter.print(str3);
                    printWriter.print("mPopDirection=");
                    C0053u c0053u = abstractComponentCallbacksC0056x.f1169I;
                    printWriter.println(c0053u == null ? false : c0053u.f1153a);
                    C0053u c0053u2 = abstractComponentCallbacksC0056x.f1169I;
                    if ((c0053u2 == null ? 0 : c0053u2.f1154b) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getEnterAnim=");
                        C0053u c0053u3 = abstractComponentCallbacksC0056x.f1169I;
                        printWriter.println(c0053u3 == null ? 0 : c0053u3.f1154b);
                    }
                    C0053u c0053u4 = abstractComponentCallbacksC0056x.f1169I;
                    if ((c0053u4 == null ? 0 : c0053u4.f1155c) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getExitAnim=");
                        C0053u c0053u5 = abstractComponentCallbacksC0056x.f1169I;
                        printWriter.println(c0053u5 == null ? 0 : c0053u5.f1155c);
                    }
                    C0053u c0053u6 = abstractComponentCallbacksC0056x.f1169I;
                    if ((c0053u6 == null ? 0 : c0053u6.d) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getPopEnterAnim=");
                        C0053u c0053u7 = abstractComponentCallbacksC0056x.f1169I;
                        printWriter.println(c0053u7 == null ? 0 : c0053u7.d);
                    }
                    C0053u c0053u8 = abstractComponentCallbacksC0056x.f1169I;
                    if ((c0053u8 == null ? 0 : c0053u8.f1156e) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getPopExitAnim=");
                        C0053u c0053u9 = abstractComponentCallbacksC0056x.f1169I;
                        printWriter.println(c0053u9 == null ? 0 : c0053u9.f1156e);
                    }
                    if (abstractComponentCallbacksC0056x.f1166E != null) {
                        printWriter.print(str3);
                        printWriter.print("mContainer=");
                        printWriter.println(abstractComponentCallbacksC0056x.f1166E);
                    }
                    if (abstractComponentCallbacksC0056x.f1167F != null) {
                        printWriter.print(str3);
                        printWriter.print("mView=");
                        printWriter.println(abstractComponentCallbacksC0056x.f1167F);
                    }
                    if (abstractComponentCallbacksC0056x.h() != null) {
                        androidx.lifecycle.V c3 = abstractComponentCallbacksC0056x.c();
                        U u2 = C0116a.f2189c;
                        q1.d.e(c3, "store");
                        C0110a c0110a = C0110a.f1740b;
                        q1.d.e(c0110a, "defaultCreationExtras");
                        U.v vVar2 = new U.v(c3, u2, c0110a);
                        q1.b a2 = q1.i.a(C0116a.class);
                        String s3 = U.t.s(a2);
                        if (s3 == null) {
                            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
                        }
                        o.k kVar = ((C0116a) vVar2.i(a2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s3))).f2190b;
                        if (kVar.e() > 0) {
                            printWriter.print(str3);
                            printWriter.println("Loaders:");
                            if (kVar.e() > 0) {
                                if (kVar.f(0) != null) {
                                    throw new ClassCastException();
                                }
                                printWriter.print(str3);
                                printWriter.print("  #");
                                printWriter.print(kVar.c(0));
                                printWriter.print(": ");
                                throw null;
                            }
                        }
                    }
                    printWriter.print(str3);
                    printWriter.println("Child " + abstractComponentCallbacksC0056x.f1199u + ":");
                    abstractComponentCallbacksC0056x.f1199u.u(D.f.c(str3, "  "), fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        ArrayList arrayList = (ArrayList) vVar.f790a;
        int size3 = arrayList.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size3; i++) {
                AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x2 = (AbstractComponentCallbacksC0056x) arrayList.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC0056x2.toString());
            }
        }
        ArrayList arrayList2 = this.f1007e;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size2; i2++) {
                AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x3 = (AbstractComponentCallbacksC0056x) this.f1007e.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC0056x3.toString());
            }
        }
        ArrayList arrayList3 = this.d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size; i3++) {
                C0034a c0034a = (C0034a) this.d.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(c0034a.toString());
                c0034a.f(c2, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.i.get());
        synchronized (this.f1004a) {
            try {
                int size4 = this.f1004a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i4 = 0; i4 < size4; i4++) {
                        Object obj2 = (O) this.f1004a.get(i4);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i4);
                        printWriter.print(": ");
                        printWriter.println(obj2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f1021u);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f1022v);
        if (this.f1023w != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f1023w);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f1020t);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f996F);
        printWriter.print(" mStopped=");
        printWriter.print(this.G);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f997H);
        if (this.f995E) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f995E);
        }
    }

    public final void v() {
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((C0044k) it.next()).e();
        }
    }

    public final void w(O o2, boolean z2) {
        if (!z2) {
            if (this.f1021u == null) {
                if (!this.f997H) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (M()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f1004a) {
            try {
                if (this.f1021u == null) {
                    if (!z2) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f1004a.add(o2);
                    W();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void x(boolean z2) {
        if (this.f1005b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f1021u == null) {
            if (!this.f997H) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f1021u.f960g.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z2 && M()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.f999J == null) {
            this.f999J = new ArrayList();
            this.f1000K = new ArrayList();
        }
    }

    public final boolean y(boolean z2) {
        boolean z3;
        x(z2);
        boolean z4 = false;
        while (true) {
            ArrayList arrayList = this.f999J;
            ArrayList arrayList2 = this.f1000K;
            synchronized (this.f1004a) {
                if (this.f1004a.isEmpty()) {
                    z3 = false;
                } else {
                    try {
                        int size = this.f1004a.size();
                        z3 = false;
                        for (int i = 0; i < size; i++) {
                            z3 |= ((O) this.f1004a.get(i)).a(arrayList, arrayList2);
                        }
                    } finally {
                    }
                }
            }
            if (!z3) {
                break;
            }
            z4 = true;
            this.f1005b = true;
            try {
                T(this.f999J, this.f1000K);
            } finally {
                d();
            }
        }
        e0();
        if (this.f998I) {
            this.f998I = false;
            c0();
        }
        ((HashMap) this.f1006c.f791b).values().removeAll(Collections.singleton(null));
        return z4;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:143:0x0250. Please report as an issue. */
    public final void z(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        Object obj;
        ViewGroup viewGroup;
        ArrayList arrayList3;
        Iterator it;
        Object obj2;
        h0.l lVar;
        Iterator it2;
        Object obj3;
        LinkedHashSet linkedHashSet;
        Object obj4;
        boolean z2;
        int i3;
        boolean z3;
        boolean z4;
        int i4;
        int i5;
        boolean z5;
        boolean z6;
        int i6;
        boolean z7 = ((C0034a) arrayList.get(i)).f1072p;
        ArrayList arrayList4 = this.f1001L;
        if (arrayList4 == null) {
            this.f1001L = new ArrayList();
        } else {
            arrayList4.clear();
        }
        ArrayList arrayList5 = this.f1001L;
        U.v vVar = this.f1006c;
        arrayList5.addAll(vVar.h());
        AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x = this.f1024x;
        int i7 = i;
        boolean z8 = false;
        while (true) {
            int i8 = 1;
            if (i7 >= i2) {
                boolean z9 = z7;
                boolean z10 = z8;
                this.f1001L.clear();
                if (!z9 && this.f1020t >= 1) {
                    for (int i9 = i; i9 < i2; i9++) {
                        Iterator it3 = ((C0034a) arrayList.get(i9)).f1060a.iterator();
                        while (it3.hasNext()) {
                            AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x2 = ((Z) it3.next()).f1055b;
                            if (abstractComponentCallbacksC0056x2 != null && abstractComponentCallbacksC0056x2.f1197s != null) {
                                vVar.j(f(abstractComponentCallbacksC0056x2));
                            }
                        }
                    }
                }
                for (int i10 = i; i10 < i2; i10++) {
                    C0034a c0034a = (C0034a) arrayList.get(i10);
                    if (((Boolean) arrayList2.get(i10)).booleanValue()) {
                        c0034a.c(-1);
                        ArrayList arrayList6 = c0034a.f1060a;
                        for (int size = arrayList6.size() - 1; size >= 0; size--) {
                            Z z11 = (Z) arrayList6.get(size);
                            AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x3 = z11.f1055b;
                            if (abstractComponentCallbacksC0056x3 != null) {
                                abstractComponentCallbacksC0056x3.f1191m = c0034a.f1076t;
                                if (abstractComponentCallbacksC0056x3.f1169I != null) {
                                    abstractComponentCallbacksC0056x3.f().f1153a = true;
                                }
                                int i11 = c0034a.f1064f;
                                int i12 = 8194;
                                int i13 = 4097;
                                if (i11 != 4097) {
                                    if (i11 != 8194) {
                                        i12 = 4100;
                                        i13 = 8197;
                                        if (i11 != 8197) {
                                            if (i11 == 4099) {
                                                i12 = 4099;
                                            } else if (i11 != 4100) {
                                                i12 = 0;
                                            }
                                        }
                                    }
                                    i12 = i13;
                                }
                                if (abstractComponentCallbacksC0056x3.f1169I != null || i12 != 0) {
                                    abstractComponentCallbacksC0056x3.f();
                                    abstractComponentCallbacksC0056x3.f1169I.f1157f = i12;
                                }
                                abstractComponentCallbacksC0056x3.f();
                                abstractComponentCallbacksC0056x3.f1169I.getClass();
                            }
                            int i14 = z11.f1054a;
                            S s2 = c0034a.f1073q;
                            switch (i14) {
                                case 1:
                                    abstractComponentCallbacksC0056x3.J(z11.d, z11.f1057e, z11.f1058f, z11.f1059g);
                                    s2.X(abstractComponentCallbacksC0056x3, true);
                                    s2.S(abstractComponentCallbacksC0056x3);
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + z11.f1054a);
                                case 3:
                                    abstractComponentCallbacksC0056x3.J(z11.d, z11.f1057e, z11.f1058f, z11.f1059g);
                                    s2.a(abstractComponentCallbacksC0056x3);
                                case Platform.INFO /* 4 */:
                                    abstractComponentCallbacksC0056x3.J(z11.d, z11.f1057e, z11.f1058f, z11.f1059g);
                                    s2.getClass();
                                    b0(abstractComponentCallbacksC0056x3);
                                case Platform.WARN /* 5 */:
                                    abstractComponentCallbacksC0056x3.J(z11.d, z11.f1057e, z11.f1058f, z11.f1059g);
                                    s2.X(abstractComponentCallbacksC0056x3, true);
                                    s2.G(abstractComponentCallbacksC0056x3);
                                case 6:
                                    abstractComponentCallbacksC0056x3.J(z11.d, z11.f1057e, z11.f1058f, z11.f1059g);
                                    s2.c(abstractComponentCallbacksC0056x3);
                                case 7:
                                    abstractComponentCallbacksC0056x3.J(z11.d, z11.f1057e, z11.f1058f, z11.f1059g);
                                    s2.X(abstractComponentCallbacksC0056x3, true);
                                    s2.g(abstractComponentCallbacksC0056x3);
                                case 8:
                                    s2.Z(null);
                                case 9:
                                    s2.Z(abstractComponentCallbacksC0056x3);
                                case 10:
                                    s2.Y(abstractComponentCallbacksC0056x3, z11.h);
                            }
                        }
                    } else {
                        c0034a.c(1);
                        ArrayList arrayList7 = c0034a.f1060a;
                        int size2 = arrayList7.size();
                        for (int i15 = 0; i15 < size2; i15++) {
                            Z z12 = (Z) arrayList7.get(i15);
                            AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x4 = z12.f1055b;
                            if (abstractComponentCallbacksC0056x4 != null) {
                                abstractComponentCallbacksC0056x4.f1191m = c0034a.f1076t;
                                if (abstractComponentCallbacksC0056x4.f1169I != null) {
                                    abstractComponentCallbacksC0056x4.f().f1153a = false;
                                }
                                int i16 = c0034a.f1064f;
                                if (abstractComponentCallbacksC0056x4.f1169I != null || i16 != 0) {
                                    abstractComponentCallbacksC0056x4.f();
                                    abstractComponentCallbacksC0056x4.f1169I.f1157f = i16;
                                }
                                abstractComponentCallbacksC0056x4.f();
                                abstractComponentCallbacksC0056x4.f1169I.getClass();
                            }
                            int i17 = z12.f1054a;
                            S s3 = c0034a.f1073q;
                            switch (i17) {
                                case 1:
                                    abstractComponentCallbacksC0056x4.J(z12.d, z12.f1057e, z12.f1058f, z12.f1059g);
                                    s3.X(abstractComponentCallbacksC0056x4, false);
                                    s3.a(abstractComponentCallbacksC0056x4);
                                    break;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + z12.f1054a);
                                case 3:
                                    abstractComponentCallbacksC0056x4.J(z12.d, z12.f1057e, z12.f1058f, z12.f1059g);
                                    s3.S(abstractComponentCallbacksC0056x4);
                                    break;
                                case Platform.INFO /* 4 */:
                                    abstractComponentCallbacksC0056x4.J(z12.d, z12.f1057e, z12.f1058f, z12.f1059g);
                                    s3.G(abstractComponentCallbacksC0056x4);
                                    break;
                                case Platform.WARN /* 5 */:
                                    abstractComponentCallbacksC0056x4.J(z12.d, z12.f1057e, z12.f1058f, z12.f1059g);
                                    s3.X(abstractComponentCallbacksC0056x4, false);
                                    b0(abstractComponentCallbacksC0056x4);
                                    break;
                                case 6:
                                    abstractComponentCallbacksC0056x4.J(z12.d, z12.f1057e, z12.f1058f, z12.f1059g);
                                    s3.g(abstractComponentCallbacksC0056x4);
                                    break;
                                case 7:
                                    abstractComponentCallbacksC0056x4.J(z12.d, z12.f1057e, z12.f1058f, z12.f1059g);
                                    s3.X(abstractComponentCallbacksC0056x4, false);
                                    s3.c(abstractComponentCallbacksC0056x4);
                                    break;
                                case 8:
                                    s3.Z(abstractComponentCallbacksC0056x4);
                                    break;
                                case 9:
                                    s3.Z(null);
                                    break;
                                case 10:
                                    s3.Y(abstractComponentCallbacksC0056x4, z12.i);
                                    break;
                            }
                        }
                    }
                }
                boolean booleanValue = ((Boolean) arrayList2.get(i2 - 1)).booleanValue();
                if (z10 && (arrayList3 = this.f1012l) != null && !arrayList3.isEmpty()) {
                    LinkedHashSet<AbstractComponentCallbacksC0056x> linkedHashSet2 = new LinkedHashSet();
                    Iterator it4 = arrayList.iterator();
                    while (it4.hasNext()) {
                        C0034a c0034a2 = (C0034a) it4.next();
                        HashSet hashSet = new HashSet();
                        for (int i18 = 0; i18 < c0034a2.f1060a.size(); i18++) {
                            AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x5 = ((Z) c0034a2.f1060a.get(i18)).f1055b;
                            if (abstractComponentCallbacksC0056x5 != null && c0034a2.f1065g) {
                                hashSet.add(abstractComponentCallbacksC0056x5);
                            }
                        }
                        linkedHashSet2.addAll(hashSet);
                    }
                    Iterator it5 = this.f1012l.iterator();
                    while (it5.hasNext()) {
                        h0.l lVar2 = (h0.l) it5.next();
                        for (AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x6 : linkedHashSet2) {
                            lVar2.getClass();
                            q1.d.e(abstractComponentCallbacksC0056x6, "fragment");
                            if (booleanValue) {
                                f0.n nVar = lVar2.f2597a;
                                List list = (List) ((y1.c) ((y1.a) nVar.f2322e.f33b)).a();
                                ListIterator listIterator = list.listIterator(list.size());
                                while (true) {
                                    if (listIterator.hasPrevious()) {
                                        obj4 = listIterator.previous();
                                        ListIterator listIterator2 = listIterator;
                                        linkedHashSet = linkedHashSet2;
                                        if (!q1.d.a(((C0133i) obj4).f2309f, abstractComponentCallbacksC0056x6.f1203y)) {
                                            listIterator = listIterator2;
                                            linkedHashSet2 = linkedHashSet;
                                        }
                                    } else {
                                        linkedHashSet = linkedHashSet2;
                                        obj4 = null;
                                    }
                                }
                                C0133i c0133i = (C0133i) obj4;
                                lVar2.f2598b.getClass();
                                if (h0.j.n()) {
                                    Log.v("FragmentNavigator", "OnBackStackChangedStarted for fragment " + abstractComponentCallbacksC0056x6 + " associated with entry " + c0133i);
                                }
                                if (c0133i != null) {
                                    y1.c cVar = nVar.f2321c;
                                    cVar.b(j1.z.h0((Set) cVar.a(), c0133i));
                                    i0.j jVar = nVar.h.f2365b;
                                    jVar.getClass();
                                    if (!jVar.f2640f.contains(c0133i)) {
                                        throw new IllegalStateException("Cannot transition entry that is not in the back stack");
                                    }
                                    c0133i.e(EnumC0092o.d);
                                } else {
                                    continue;
                                }
                            } else {
                                linkedHashSet = linkedHashSet2;
                            }
                            linkedHashSet2 = linkedHashSet;
                        }
                    }
                    LinkedHashSet linkedHashSet3 = linkedHashSet2;
                    Iterator it6 = this.f1012l.iterator();
                    while (it6.hasNext()) {
                        h0.l lVar3 = (h0.l) it6.next();
                        Iterator it7 = linkedHashSet3.iterator();
                        while (it7.hasNext()) {
                            AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x7 = (AbstractComponentCallbacksC0056x) it7.next();
                            lVar3.getClass();
                            q1.d.e(abstractComponentCallbacksC0056x7, "fragment");
                            f0.n nVar2 = lVar3.f2597a;
                            ArrayList u02 = j1.j.u0((Collection) ((y1.c) ((y1.a) nVar2.f2322e.f33b)).a(), (Iterable) ((y1.c) ((y1.a) nVar2.f2323f.f33b)).a());
                            ListIterator listIterator3 = u02.listIterator(u02.size());
                            while (true) {
                                if (listIterator3.hasPrevious()) {
                                    obj2 = listIterator3.previous();
                                    it = it6;
                                    if (!q1.d.a(((C0133i) obj2).f2309f, abstractComponentCallbacksC0056x7.f1203y)) {
                                        it6 = it;
                                    }
                                } else {
                                    it = it6;
                                    obj2 = null;
                                }
                            }
                            C0133i c0133i2 = (C0133i) obj2;
                            h0.j jVar2 = lVar3.f2598b;
                            boolean z13 = booleanValue && jVar2.f2594g.isEmpty() && abstractComponentCallbacksC0056x7.f1190l;
                            Iterator it8 = jVar2.f2594g.iterator();
                            while (true) {
                                if (it8.hasNext()) {
                                    obj3 = it8.next();
                                    lVar = lVar3;
                                    it2 = it7;
                                    if (!q1.d.a(((i1.d) obj3).f2670a, abstractComponentCallbacksC0056x7.f1203y)) {
                                        lVar3 = lVar;
                                        it7 = it2;
                                    }
                                } else {
                                    lVar = lVar3;
                                    it2 = it7;
                                    obj3 = null;
                                }
                            }
                            i1.d dVar = (i1.d) obj3;
                            if (dVar != null) {
                                jVar2.f2594g.remove(dVar);
                            }
                            if (!z13 && h0.j.n()) {
                                Log.v("FragmentNavigator", "OnBackStackChangedCommitted for fragment " + abstractComponentCallbacksC0056x7 + " associated with entry " + c0133i2);
                            }
                            boolean z14 = dVar != null && ((Boolean) dVar.f2671b).booleanValue();
                            if (!booleanValue && !z14 && c0133i2 == null) {
                                throw new IllegalArgumentException(("The fragment " + abstractComponentCallbacksC0056x7 + " is unknown to the FragmentNavigator. Please use the navigate() function to add fragments to the FragmentNavigator managed FragmentManager.").toString());
                            }
                            if (c0133i2 != null) {
                                jVar2.l(abstractComponentCallbacksC0056x7, c0133i2, nVar2);
                                if (z13) {
                                    if (h0.j.n()) {
                                        Log.v("FragmentNavigator", "OnBackStackChangedCommitted for fragment " + abstractComponentCallbacksC0056x7 + " popping associated entry " + c0133i2 + " via system back");
                                    }
                                    nVar2.f(c0133i2, false);
                                    it6 = it;
                                    lVar3 = lVar;
                                    it7 = it2;
                                }
                            }
                            it6 = it;
                            lVar3 = lVar;
                            it7 = it2;
                        }
                    }
                }
                for (int i19 = i; i19 < i2; i19++) {
                    C0034a c0034a3 = (C0034a) arrayList.get(i19);
                    if (booleanValue) {
                        for (int size3 = c0034a3.f1060a.size() - 1; size3 >= 0; size3--) {
                            AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x8 = ((Z) c0034a3.f1060a.get(size3)).f1055b;
                            if (abstractComponentCallbacksC0056x8 != null) {
                                f(abstractComponentCallbacksC0056x8).k();
                            }
                        }
                    } else {
                        Iterator it9 = c0034a3.f1060a.iterator();
                        while (it9.hasNext()) {
                            AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x9 = ((Z) it9.next()).f1055b;
                            if (abstractComponentCallbacksC0056x9 != null) {
                                f(abstractComponentCallbacksC0056x9).k();
                            }
                        }
                    }
                }
                N(this.f1020t, true);
                HashSet hashSet2 = new HashSet();
                for (int i20 = i; i20 < i2; i20++) {
                    Iterator it10 = ((C0034a) arrayList.get(i20)).f1060a.iterator();
                    while (it10.hasNext()) {
                        AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x10 = ((Z) it10.next()).f1055b;
                        if (abstractComponentCallbacksC0056x10 != null && (viewGroup = abstractComponentCallbacksC0056x10.f1166E) != null) {
                            hashSet2.add(C0044k.f(viewGroup, this));
                        }
                    }
                }
                Iterator it11 = hashSet2.iterator();
                while (it11.hasNext()) {
                    C0044k c0044k = (C0044k) it11.next();
                    c0044k.d = booleanValue;
                    synchronized (c0044k.f1123b) {
                        try {
                            c0044k.g();
                            ArrayList arrayList8 = c0044k.f1123b;
                            ListIterator listIterator4 = arrayList8.listIterator(arrayList8.size());
                            while (true) {
                                if (listIterator4.hasPrevious()) {
                                    obj = listIterator4.previous();
                                    d0 d0Var = (d0) obj;
                                    View view = d0Var.f1103c.f1167F;
                                    q1.d.d(view, "operation.fragment.mView");
                                    char c2 = 4;
                                    if (view.getAlpha() != 0.0f || view.getVisibility() != 0) {
                                        int visibility = view.getVisibility();
                                        if (visibility == 0) {
                                            c2 = 2;
                                        } else if (visibility != 4) {
                                            if (visibility != 8) {
                                                throw new IllegalArgumentException("Unknown visibility " + visibility);
                                            }
                                            c2 = 3;
                                        }
                                    }
                                    if (d0Var.f1101a != 2 || c2 == 2) {
                                    }
                                } else {
                                    obj = null;
                                }
                            }
                            c0044k.f1125e = false;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    c0044k.c();
                }
                for (int i21 = i; i21 < i2; i21++) {
                    C0034a c0034a4 = (C0034a) arrayList.get(i21);
                    if (((Boolean) arrayList2.get(i21)).booleanValue() && c0034a4.f1075s >= 0) {
                        c0034a4.f1075s = -1;
                    }
                    c0034a4.getClass();
                }
                if (!z10 || this.f1012l == null) {
                    return;
                }
                for (int i22 = 0; i22 < this.f1012l.size(); i22++) {
                    ((h0.l) this.f1012l.get(i22)).getClass();
                }
                return;
            }
            C0034a c0034a5 = (C0034a) arrayList.get(i7);
            if (((Boolean) arrayList2.get(i7)).booleanValue()) {
                z2 = z7;
                i3 = i7;
                z3 = z8;
                int i23 = 1;
                ArrayList arrayList9 = this.f1001L;
                ArrayList arrayList10 = c0034a5.f1060a;
                int size4 = arrayList10.size() - 1;
                while (size4 >= 0) {
                    Z z15 = (Z) arrayList10.get(size4);
                    int i24 = z15.f1054a;
                    if (i24 != i23) {
                        if (i24 != 3) {
                            switch (i24) {
                                case 8:
                                    abstractComponentCallbacksC0056x = null;
                                    break;
                                case 9:
                                    abstractComponentCallbacksC0056x = z15.f1055b;
                                    break;
                                case 10:
                                    z15.i = z15.h;
                                    break;
                            }
                            size4--;
                            i23 = 1;
                        }
                        arrayList9.add(z15.f1055b);
                        size4--;
                        i23 = 1;
                    }
                    arrayList9.remove(z15.f1055b);
                    size4--;
                    i23 = 1;
                }
            } else {
                ArrayList arrayList11 = this.f1001L;
                int i25 = 0;
                while (true) {
                    ArrayList arrayList12 = c0034a5.f1060a;
                    if (i25 < arrayList12.size()) {
                        Z z16 = (Z) arrayList12.get(i25);
                        int i26 = z16.f1054a;
                        if (i26 != i8) {
                            z4 = z7;
                            if (i26 != 2) {
                                if (i26 == 3 || i26 == 6) {
                                    arrayList11.remove(z16.f1055b);
                                    AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x11 = z16.f1055b;
                                    if (abstractComponentCallbacksC0056x11 == abstractComponentCallbacksC0056x) {
                                        arrayList12.add(i25, new Z(9, abstractComponentCallbacksC0056x11));
                                        i25++;
                                        i5 = i7;
                                        z5 = z8;
                                        i4 = 1;
                                        abstractComponentCallbacksC0056x = null;
                                    }
                                } else if (i26 == 7) {
                                    i4 = 1;
                                } else if (i26 == 8) {
                                    arrayList12.add(i25, new Z(9, abstractComponentCallbacksC0056x, 0));
                                    z16.f1056c = true;
                                    i25++;
                                    abstractComponentCallbacksC0056x = z16.f1055b;
                                }
                                i5 = i7;
                                z5 = z8;
                                i4 = 1;
                            } else {
                                AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x12 = z16.f1055b;
                                int i27 = abstractComponentCallbacksC0056x12.f1202x;
                                int size5 = arrayList11.size() - 1;
                                boolean z17 = false;
                                while (size5 >= 0) {
                                    int i28 = size5;
                                    AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x13 = (AbstractComponentCallbacksC0056x) arrayList11.get(size5);
                                    int i29 = i7;
                                    if (abstractComponentCallbacksC0056x13.f1202x != i27) {
                                        z6 = z8;
                                    } else if (abstractComponentCallbacksC0056x13 == abstractComponentCallbacksC0056x12) {
                                        z6 = z8;
                                        z17 = true;
                                    } else {
                                        if (abstractComponentCallbacksC0056x13 == abstractComponentCallbacksC0056x) {
                                            z6 = z8;
                                            i6 = 0;
                                            arrayList12.add(i25, new Z(9, abstractComponentCallbacksC0056x13, 0));
                                            i25++;
                                            abstractComponentCallbacksC0056x = null;
                                        } else {
                                            z6 = z8;
                                            i6 = 0;
                                        }
                                        Z z18 = new Z(3, abstractComponentCallbacksC0056x13, i6);
                                        z18.d = z16.d;
                                        z18.f1058f = z16.f1058f;
                                        z18.f1057e = z16.f1057e;
                                        z18.f1059g = z16.f1059g;
                                        arrayList12.add(i25, z18);
                                        arrayList11.remove(abstractComponentCallbacksC0056x13);
                                        i25++;
                                        abstractComponentCallbacksC0056x = abstractComponentCallbacksC0056x;
                                    }
                                    size5 = i28 - 1;
                                    z8 = z6;
                                    i7 = i29;
                                }
                                i5 = i7;
                                z5 = z8;
                                i4 = 1;
                                if (z17) {
                                    arrayList12.remove(i25);
                                    i25--;
                                } else {
                                    z16.f1054a = 1;
                                    z16.f1056c = true;
                                    arrayList11.add(abstractComponentCallbacksC0056x12);
                                }
                            }
                            i25 += i4;
                            i8 = i4;
                            z7 = z4;
                            z8 = z5;
                            i7 = i5;
                        } else {
                            z4 = z7;
                            i4 = i8;
                        }
                        i5 = i7;
                        z5 = z8;
                        arrayList11.add(z16.f1055b);
                        i25 += i4;
                        i8 = i4;
                        z7 = z4;
                        z8 = z5;
                        i7 = i5;
                    } else {
                        z2 = z7;
                        i3 = i7;
                        z3 = z8;
                    }
                }
            }
            z8 = z3 || c0034a5.f1065g;
            i7 = i3 + 1;
            z7 = z2;
        }
    }
}
