package C;

import L.C0021q;
import L.E;
import L.S;
import L.Y;
import L.u0;
import U.A;
import U.v;
import U.y;
import U.z;
import Y.AbstractComponentCallbacksC0056x;
import android.animation.Animator;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableString;
import android.util.SparseIntArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.C0088k;
import androidx.lifecycle.EnumC0092o;
import g.AbstractActivityC0146i;
import g.B;
import g.C0144g;
import j.AbstractC0156a;
import j.C0160e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import k.MenuC0165B;
import l.AbstractC0271z;
import n0.F;
import n0.W;
import n0.c0;
import n0.f0;
import n0.g0;
import o0.InterfaceC0306c;
import o0.InterfaceC0307d;
import p0.C0309a;
import r.C0318d;
import r.C0320f;

/* loaded from: classes.dex */
public final class j implements L.r, U.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f59a;

    /* renamed from: b, reason: collision with root package name */
    public Object f60b;

    /* renamed from: c, reason: collision with root package name */
    public Object f61c;

    public /* synthetic */ j(int i, boolean z2) {
        this.f59a = i;
    }

    public static int w(int i, int i2) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            i3++;
            if (i3 == i2) {
                i4++;
                i3 = 0;
            } else if (i3 > i2) {
                i4++;
                i3 = 1;
            }
        }
        return i3 + 1 > i2 ? i4 + 1 : i4;
    }

    public void A(int i, int i2) {
        int[] iArr = (int[]) this.f60b;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        r(i3);
        int[] iArr2 = (int[]) this.f60b;
        System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
        int[] iArr3 = (int[]) this.f60b;
        Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
        ArrayList arrayList = (ArrayList) this.f61c;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            c0 c0Var = (c0) ((ArrayList) this.f61c).get(size);
            int i4 = c0Var.f3331a;
            if (i4 >= i) {
                if (i4 < i3) {
                    ((ArrayList) this.f61c).remove(size);
                } else {
                    c0Var.f3331a = i4 - i2;
                }
            }
        }
    }

    public void B(AbstractC0156a abstractC0156a) {
        v vVar = (v) this.f60b;
        ((ActionMode.Callback) vVar.f790a).onDestroyActionMode(vVar.e(abstractC0156a));
        B b2 = (B) this.f61c;
        if (b2.f2452w != null) {
            b2.f2441l.getDecorView().removeCallbacks(b2.f2453x);
        }
        if (b2.f2451v != null) {
            Y y2 = b2.f2454y;
            if (y2 != null) {
                y2.b();
            }
            Y a2 = S.a(b2.f2451v);
            a2.a(0.0f);
            b2.f2454y = a2;
            a2.d(new g.s(2, this));
        }
        b2.f2450u = null;
        ViewGroup viewGroup = b2.f2408A;
        WeakHashMap weakHashMap = S.f311a;
        E.c(viewGroup);
        b2.H();
    }

    public boolean C(AbstractC0156a abstractC0156a, k.m mVar) {
        ViewGroup viewGroup = ((B) this.f61c).f2408A;
        WeakHashMap weakHashMap = S.f311a;
        E.c(viewGroup);
        v vVar = (v) this.f60b;
        C0160e e2 = vVar.e(abstractC0156a);
        o.j jVar = (o.j) vVar.d;
        Menu menu = (Menu) jVar.get(mVar);
        if (menu == null) {
            menu = new MenuC0165B((Context) vVar.f791b, mVar);
            jVar.put(mVar, menu);
        }
        return ((ActionMode.Callback) vVar.f790a).onPrepareActionMode(e2, menu);
    }

    public void D(I.g gVar) {
        int i = gVar.f269b;
        Handler handler = (Handler) this.f61c;
        A0.c cVar = (A0.c) this.f60b;
        if (i != 0) {
            handler.post(new I.a(cVar, i, 0));
        } else {
            handler.post(new A0.d(cVar, 1, gVar.f268a));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x022f, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void E(android.content.Context r14, android.content.res.XmlResourceParser r15) {
        /*
            Method dump skipped, instructions count: 670
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: C.j.E(android.content.Context, android.content.res.XmlResourceParser):void");
    }

    public void F(Bundle bundle) {
        C0309a c0309a = (C0309a) this.f60b;
        if (!c0309a.f3511e) {
            c0309a.a();
        }
        InterfaceC0307d interfaceC0307d = c0309a.f3508a;
        if (interfaceC0307d.d().f1600c.compareTo(EnumC0092o.d) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + interfaceC0307d.d().f1600c).toString());
        }
        if (c0309a.f3513g) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        Bundle bundle2 = null;
        if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
            Bundle bundle3 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
            if (bundle3 == null) {
                AbstractC0271z.p("androidx.lifecycle.BundlableSavedStateRegistry.key");
                throw null;
            }
            bundle2 = bundle3;
        }
        c0309a.f3512f = bundle2;
        c0309a.f3513g = true;
    }

    public void G(Bundle bundle) {
        C0309a c0309a = (C0309a) this.f60b;
        Bundle f2 = Z0.i.f((i1.d[]) Arrays.copyOf(new i1.d[0], 0));
        Bundle bundle2 = c0309a.f3512f;
        if (bundle2 != null) {
            f2.putAll(bundle2);
        }
        synchronized (c0309a.f3510c) {
            for (Map.Entry entry : c0309a.d.entrySet()) {
                AbstractC0271z.t(f2, (String) entry.getKey(), ((InterfaceC0306c) entry.getValue()).a());
            }
        }
        if (f2.isEmpty()) {
            return;
        }
        AbstractC0271z.t(bundle, "androidx.lifecycle.BundlableSavedStateRegistry.key", f2);
    }

    public C0021q H(W w2, int i) {
        g0 g0Var;
        C0021q c0021q;
        o.j jVar = (o.j) this.f60b;
        int d = jVar.d(w2);
        if (d >= 0 && (g0Var = (g0) jVar.i(d)) != null) {
            int i2 = g0Var.f3369a;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                g0Var.f3369a = i3;
                if (i == 4) {
                    c0021q = g0Var.f3370b;
                } else {
                    if (i != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    c0021q = g0Var.f3371c;
                }
                if ((i3 & 12) == 0) {
                    jVar.g(d);
                    g0Var.f3369a = 0;
                    g0Var.f3370b = null;
                    g0Var.f3371c = null;
                    g0.d.c(g0Var);
                }
                return c0021q;
            }
        }
        return null;
    }

    public void I(String str, InterfaceC0306c interfaceC0306c) {
        q1.d.e(interfaceC0306c, "provider");
        C0309a c0309a = (C0309a) this.f60b;
        synchronized (c0309a.f3510c) {
            if (c0309a.d.containsKey(str)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            c0309a.d.put(str, interfaceC0306c);
        }
    }

    public void J(W w2) {
        g0 g0Var = (g0) ((o.j) this.f60b).get(w2);
        if (g0Var == null) {
            return;
        }
        g0Var.f3369a &= -2;
    }

    public void K(W w2) {
        o.h hVar = (o.h) this.f61c;
        int e2 = hVar.e() - 1;
        while (true) {
            if (e2 < 0) {
                break;
            }
            if (w2 == hVar.f(e2)) {
                Object[] objArr = hVar.f3493c;
                Object obj = objArr[e2];
                Object obj2 = o.i.f3494a;
                if (obj != obj2) {
                    objArr[e2] = obj2;
                    hVar.f3491a = true;
                }
            } else {
                e2--;
            }
        }
        g0 g0Var = (g0) ((o.j) this.f60b).remove(w2);
        if (g0Var != null) {
            g0Var.f3369a = 0;
            g0Var.f3370b = null;
            g0Var.f3371c = null;
            g0.d.c(g0Var);
        }
    }

    public void L() {
        if (!((C0309a) this.f60b).h) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        C0144g c0144g = (C0144g) this.f61c;
        if (c0144g == null) {
            c0144g = new C0144g(this);
        }
        this.f61c = c0144g;
        try {
            C0088k.class.getDeclaredConstructor(new Class[0]);
            C0144g c0144g2 = (C0144g) this.f61c;
            if (c0144g2 != null) {
                ((LinkedHashSet) c0144g2.f2533b).add(C0088k.class.getName());
            }
        } catch (NoSuchMethodException e2) {
            throw new IllegalArgumentException("Class " + C0088k.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
        }
    }

    public void a(W w2, C0021q c0021q) {
        o.j jVar = (o.j) this.f60b;
        g0 g0Var = (g0) jVar.get(w2);
        if (g0Var == null) {
            g0Var = g0.a();
            jVar.put(w2, g0Var);
        }
        g0Var.f3371c = c0021q;
        g0Var.f3369a |= 8;
    }

    public Bundle b(String str) {
        Bundle bundle;
        C0309a c0309a = (C0309a) this.f60b;
        if (!c0309a.f3513g) {
            throw new IllegalStateException("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
        }
        Bundle bundle2 = c0309a.f3512f;
        if (bundle2 == null) {
            return null;
        }
        if (bundle2.containsKey(str)) {
            bundle = bundle2.getBundle(str);
            if (bundle == null) {
                AbstractC0271z.p(str);
                throw null;
            }
        } else {
            bundle = null;
        }
        bundle2.remove(str);
        if (bundle2.isEmpty()) {
            c0309a.f3512f = null;
        }
        return bundle;
    }

    public void c(boolean z2) {
        AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x = ((Y.S) this.f61c).f1023w;
        if (abstractComponentCallbacksC0056x != null) {
            abstractComponentCallbacksC0056x.k().f1013m.c(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f60b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public void d(boolean z2) {
        Y.S s2 = (Y.S) this.f61c;
        AbstractActivityC0146i abstractActivityC0146i = s2.f1021u.f959f;
        AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x = s2.f1023w;
        if (abstractComponentCallbacksC0056x != null) {
            abstractComponentCallbacksC0056x.k().f1013m.d(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f60b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public void e(boolean z2) {
        AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x = ((Y.S) this.f61c).f1023w;
        if (abstractComponentCallbacksC0056x != null) {
            abstractComponentCallbacksC0056x.k().f1013m.e(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f60b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public void f(boolean z2) {
        AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x = ((Y.S) this.f61c).f1023w;
        if (abstractComponentCallbacksC0056x != null) {
            abstractComponentCallbacksC0056x.k().f1013m.f(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f60b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public void g(boolean z2) {
        AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x = ((Y.S) this.f61c).f1023w;
        if (abstractComponentCallbacksC0056x != null) {
            abstractComponentCallbacksC0056x.k().f1013m.g(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f60b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    @Override // U.p
    public Object h() {
        return (A) this.f60b;
    }

    public void i(boolean z2) {
        AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x = ((Y.S) this.f61c).f1023w;
        if (abstractComponentCallbacksC0056x != null) {
            abstractComponentCallbacksC0056x.k().f1013m.i(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f60b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public void j(boolean z2) {
        Y.S s2 = (Y.S) this.f61c;
        AbstractActivityC0146i abstractActivityC0146i = s2.f1021u.f959f;
        AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x = s2.f1023w;
        if (abstractComponentCallbacksC0056x != null) {
            abstractComponentCallbacksC0056x.k().f1013m.j(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f60b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public void k(boolean z2) {
        AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x = ((Y.S) this.f61c).f1023w;
        if (abstractComponentCallbacksC0056x != null) {
            abstractComponentCallbacksC0056x.k().f1013m.k(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f60b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public void l(boolean z2) {
        AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x = ((Y.S) this.f61c).f1023w;
        if (abstractComponentCallbacksC0056x != null) {
            abstractComponentCallbacksC0056x.k().f1013m.l(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f60b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public void m(boolean z2) {
        AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x = ((Y.S) this.f61c).f1023w;
        if (abstractComponentCallbacksC0056x != null) {
            abstractComponentCallbacksC0056x.k().f1013m.m(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f60b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public void n(boolean z2) {
        AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x = ((Y.S) this.f61c).f1023w;
        if (abstractComponentCallbacksC0056x != null) {
            abstractComponentCallbacksC0056x.k().f1013m.n(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f60b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public void o(boolean z2) {
        AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x = ((Y.S) this.f61c).f1023w;
        if (abstractComponentCallbacksC0056x != null) {
            abstractComponentCallbacksC0056x.k().f1013m.o(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f60b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public void p(boolean z2) {
        AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x = ((Y.S) this.f61c).f1023w;
        if (abstractComponentCallbacksC0056x != null) {
            abstractComponentCallbacksC0056x.k().f1013m.p(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f60b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public void q(boolean z2) {
        AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x = ((Y.S) this.f61c).f1023w;
        if (abstractComponentCallbacksC0056x != null) {
            abstractComponentCallbacksC0056x.k().f1013m.q(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f60b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public void r(int i) {
        int[] iArr = (int[]) this.f60b;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i, 10) + 1];
            this.f60b = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i >= iArr.length) {
            int length = iArr.length;
            while (length <= i) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.f60b = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.f60b;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    @Override // U.p
    public boolean s(CharSequence charSequence, int i, int i2, y yVar) {
        if ((yVar.f799c & 4) > 0) {
            return true;
        }
        if (((A) this.f60b) == null) {
            this.f60b = new A(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((T0.e) this.f61c).getClass();
        ((A) this.f60b).setSpan(new z(yVar), i, i2, 33);
        return true;
    }

    public View t(int i, int i2, int i3, int i4) {
        View u2;
        F f2 = (F) this.f60b;
        int d = f2.d();
        int c2 = f2.c();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            switch (f2.f3241a) {
                case 0:
                    u2 = f2.f3242b.u(i);
                    break;
                default:
                    u2 = f2.f3242b.u(i);
                    break;
            }
            int b2 = f2.b(u2);
            int a2 = f2.a(u2);
            f0 f0Var = (f0) this.f61c;
            f0Var.f3361b = d;
            f0Var.f3362c = c2;
            f0Var.d = b2;
            f0Var.f3363e = a2;
            if (i3 != 0) {
                f0Var.f3360a = i3;
                if (f0Var.a()) {
                    return u2;
                }
            }
            if (i4 != 0) {
                f0Var.f3360a = i4;
                if (f0Var.a()) {
                    view = u2;
                }
            }
            i += i5;
        }
        return view;
    }

    public String toString() {
        switch (this.f59a) {
            case 2:
                return "Bounds{lower=" + ((D.c) this.f60b) + " upper=" + ((D.c) this.f61c) + "}";
            case 16:
                String str = "[ ";
                if (((C0320f) this.f60b) != null) {
                    for (int i = 0; i < 9; i++) {
                        str = str + ((C0320f) this.f60b).h[i] + " ";
                    }
                }
                return str + "] " + ((C0320f) this.f60b);
            default:
                return super.toString();
        }
    }

    public InterfaceC0306c u() {
        InterfaceC0306c interfaceC0306c;
        C0309a c0309a = (C0309a) this.f60b;
        synchronized (c0309a.f3510c) {
            Iterator it = c0309a.d.entrySet().iterator();
            do {
                interfaceC0306c = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                InterfaceC0306c interfaceC0306c2 = (InterfaceC0306c) entry.getValue();
                if (q1.d.a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                    interfaceC0306c = interfaceC0306c2;
                }
            } while (interfaceC0306c == null);
        }
        return interfaceC0306c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [M0.q, java.lang.Object] */
    @Override // L.r
    public u0 v(View view, u0 u0Var) {
        ?? obj = new Object();
        M0.q qVar = (M0.q) this.f61c;
        obj.f500a = qVar.f500a;
        obj.f501b = qVar.f501b;
        obj.f502c = qVar.f502c;
        obj.d = qVar.d;
        return ((M0.p) this.f60b).a(view, u0Var, obj);
    }

    public void x() {
        ((SparseIntArray) this.f60b).clear();
    }

    public boolean y(View view) {
        F f2 = (F) this.f60b;
        int d = f2.d();
        int c2 = f2.c();
        int b2 = f2.b(view);
        int a2 = f2.a(view);
        f0 f0Var = (f0) this.f61c;
        f0Var.f3361b = d;
        f0Var.f3362c = c2;
        f0Var.d = b2;
        f0Var.f3363e = a2;
        f0Var.f3360a = 24579;
        return f0Var.a();
    }

    public void z(int i, int i2) {
        int[] iArr = (int[]) this.f60b;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        r(i3);
        int[] iArr2 = (int[]) this.f60b;
        System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
        Arrays.fill((int[]) this.f60b, i, i3, -1);
        ArrayList arrayList = (ArrayList) this.f61c;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            c0 c0Var = (c0) ((ArrayList) this.f61c).get(size);
            int i4 = c0Var.f3331a;
            if (i4 >= i) {
                c0Var.f3331a = i4 + i2;
            }
        }
    }

    public /* synthetic */ j(Object obj, int i, Object obj2) {
        this.f59a = i;
        this.f60b = obj;
        this.f61c = obj2;
    }

    public j(C0309a c0309a, int i) {
        this.f59a = i;
        switch (i) {
            case 15:
                this.f60b = c0309a;
                this.f61c = new j(c0309a, 14);
                return;
            default:
                this.f60b = c0309a;
                return;
        }
    }

    public j(ConstraintLayout constraintLayout, TextView textView, TextView textView2) {
        this.f59a = 8;
        this.f60b = textView;
        this.f61c = textView2;
    }

    public j(C0318d c0318d) {
        this.f59a = 16;
        this.f61c = c0318d;
    }

    public j(Y.S s2) {
        this.f59a = 7;
        this.f60b = new CopyOnWriteArrayList();
        this.f61c = s2;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [n0.f0, java.lang.Object] */
    public j(F f2) {
        this.f59a = 12;
        this.f60b = f2;
        ?? obj = new Object();
        obj.f3360a = 0;
        this.f61c = obj;
    }

    public j(Animation animation) {
        this.f59a = 6;
        this.f60b = animation;
        this.f61c = null;
    }

    public j(Animator animator) {
        this.f59a = 6;
        this.f60b = null;
        this.f61c = animator;
    }

    public j(ArrayList arrayList, ArrayList arrayList2) {
        this.f59a = 0;
        int size = arrayList.size();
        this.f60b = new int[size];
        this.f61c = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.f60b)[i] = ((Integer) arrayList.get(i)).intValue();
            ((float[]) this.f61c)[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    public j(int i, int i2) {
        this.f59a = 0;
        this.f60b = new int[]{i, i2};
        this.f61c = new float[]{0.0f, 1.0f};
    }

    public j(int i, int i2, int i3) {
        this.f59a = 0;
        this.f60b = new int[]{i, i2, i3};
        this.f61c = new float[]{0.0f, 0.5f, 1.0f};
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [android.text.Editable$Factory, W.a] */
    public j(EditText editText) {
        this.f59a = 5;
        this.f60b = editText;
        W.i iVar = new W.i(editText);
        this.f61c = iVar;
        editText.addTextChangedListener(iVar);
        if (W.a.f818b == null) {
            synchronized (W.a.f817a) {
                try {
                    if (W.a.f818b == null) {
                        ?? factory = new Editable.Factory();
                        try {
                            W.a.f819c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, W.a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        W.a.f818b = factory;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(W.a.f818b);
    }

    public j(int i) {
        this.f59a = i;
        switch (i) {
            case 13:
                this.f60b = new o.j(0);
                this.f61c = new o.h();
                return;
            default:
                this.f60b = new SparseIntArray();
                this.f61c = new SparseIntArray();
                return;
        }
    }

    public j(B b2, v vVar) {
        this.f59a = 9;
        this.f61c = b2;
        this.f60b = vVar;
    }
}
