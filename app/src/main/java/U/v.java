package U;

import Y.AbstractComponentCallbacksC0056x;
import Y.S;
import Y.Y;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import androidx.lifecycle.C0098v;
import androidx.lifecycle.L;
import androidx.lifecycle.O;
import androidx.lifecycle.Q;
import androidx.lifecycle.T;
import androidx.lifecycle.U;
import androidx.lifecycle.V;
import c0.AbstractC0112c;
import com.tencent.wechat.Platform;
import j.AbstractC0156a;
import j.C0160e;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import k.MenuC0165B;
import l.AbstractC0271z;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final Object f790a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f791b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f792c;
    public Object d;

    public v(int i) {
        switch (i) {
            case Platform.INFO /* 4 */:
                this.f790a = new o.j(0);
                this.f791b = new SparseArray();
                this.f792c = new o.h();
                this.d = new o.j(0);
                return;
            case Platform.WARN /* 5 */:
                this.f790a = new K.b(10);
                this.f791b = new o.j(0);
                this.f792c = new ArrayList();
                this.d = new HashSet();
                return;
            default:
                this.f790a = new ArrayList();
                this.f791b = new HashMap();
                this.f792c = new HashMap();
                return;
        }
    }

    public void a(AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x) {
        if (((ArrayList) this.f790a).contains(abstractComponentCallbacksC0056x)) {
            throw new IllegalStateException("Fragment already added: " + abstractComponentCallbacksC0056x);
        }
        synchronized (((ArrayList) this.f790a)) {
            ((ArrayList) this.f790a).add(abstractComponentCallbacksC0056x);
        }
        abstractComponentCallbacksC0056x.f1189k = true;
    }

    public void b(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((o.j) this.f791b).get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                b(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    public AbstractComponentCallbacksC0056x c(String str) {
        Y y2 = (Y) ((HashMap) this.f791b).get(str);
        if (y2 != null) {
            return y2.f1052c;
        }
        return null;
    }

    public AbstractComponentCallbacksC0056x d(String str) {
        for (Y y2 : ((HashMap) this.f791b).values()) {
            if (y2 != null) {
                AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x = y2.f1052c;
                if (!str.equals(abstractComponentCallbacksC0056x.f1185e)) {
                    abstractComponentCallbacksC0056x = abstractComponentCallbacksC0056x.f1199u.f1006c.d(str);
                }
                if (abstractComponentCallbacksC0056x != null) {
                    return abstractComponentCallbacksC0056x;
                }
            }
        }
        return null;
    }

    public C0160e e(AbstractC0156a abstractC0156a) {
        ArrayList arrayList = (ArrayList) this.f792c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0160e c0160e = (C0160e) arrayList.get(i);
            if (c0160e != null && c0160e.f2695b == abstractC0156a) {
                return c0160e;
            }
        }
        C0160e c0160e2 = new C0160e((Context) this.f791b, abstractC0156a);
        arrayList.add(c0160e2);
        return c0160e2;
    }

    public ArrayList f() {
        ArrayList arrayList = new ArrayList();
        for (Y y2 : ((HashMap) this.f791b).values()) {
            if (y2 != null) {
                arrayList.add(y2);
            }
        }
        return arrayList;
    }

    public ArrayList g() {
        ArrayList arrayList = new ArrayList();
        for (Y y2 : ((HashMap) this.f791b).values()) {
            if (y2 != null) {
                arrayList.add(y2.f1052c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public List h() {
        ArrayList arrayList;
        if (((ArrayList) this.f790a).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.f790a)) {
            arrayList = new ArrayList((ArrayList) this.f790a);
        }
        return arrayList;
    }

    public Q i(q1.b bVar, String str) {
        Q q2;
        Q e2;
        q1.d.e(str, "key");
        synchronized (((T0.e) this.d)) {
            try {
                V v2 = (V) this.f790a;
                v2.getClass();
                q2 = (Q) v2.f1575a.get(str);
                if (bVar.c(q2)) {
                    T t2 = (T) this.f791b;
                    if (t2 instanceof O) {
                        O o2 = (O) t2;
                        q1.d.b(q2);
                        o2.getClass();
                        C0098v c0098v = o2.d;
                        if (c0098v != null) {
                            C.j jVar = o2.f1567e;
                            q1.d.b(jVar);
                            L.a(q2, jVar, c0098v);
                        }
                    }
                    q1.d.c(q2, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel");
                } else {
                    c0.e eVar = new c0.e((AbstractC0112c) this.f792c);
                    eVar.f1741a.put(U.f1573b, str);
                    T t3 = (T) this.f791b;
                    q1.d.e(t3, "factory");
                    try {
                        try {
                            e2 = t3.m(bVar, eVar);
                        } catch (AbstractMethodError unused) {
                            e2 = t3.e(AbstractC0271z.k(bVar));
                        }
                    } catch (AbstractMethodError unused2) {
                        e2 = t3.r(AbstractC0271z.k(bVar), eVar);
                    }
                    q2 = e2;
                    V v3 = (V) this.f790a;
                    v3.getClass();
                    q1.d.e(q2, "viewModel");
                    Q q3 = (Q) v3.f1575a.put(str, q2);
                    if (q3 != null) {
                        q3.a();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return q2;
    }

    public void j(Y y2) {
        AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x = y2.f1052c;
        String str = abstractComponentCallbacksC0056x.f1185e;
        HashMap hashMap = (HashMap) this.f791b;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(abstractComponentCallbacksC0056x.f1185e, y2);
        if (S.H(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + abstractComponentCallbacksC0056x);
        }
    }

    public void k(Y y2) {
        AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x = y2.f1052c;
        if (abstractComponentCallbacksC0056x.f1163B) {
            ((Y.V) this.d).f(abstractComponentCallbacksC0056x);
        }
        HashMap hashMap = (HashMap) this.f791b;
        if (hashMap.get(abstractComponentCallbacksC0056x.f1185e) == y2 && ((Y) hashMap.put(abstractComponentCallbacksC0056x.f1185e, null)) != null && S.H(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + abstractComponentCallbacksC0056x);
        }
    }

    public boolean l(AbstractC0156a abstractC0156a, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f790a).onActionItemClicked(e(abstractC0156a), new k.t((Context) this.f791b, (F.a) menuItem));
    }

    public boolean m(AbstractC0156a abstractC0156a, k.m mVar) {
        C0160e e2 = e(abstractC0156a);
        o.j jVar = (o.j) this.d;
        Menu menu = (Menu) jVar.get(mVar);
        if (menu == null) {
            menu = new MenuC0165B((Context) this.f791b, mVar);
            jVar.put(mVar, menu);
        }
        return ((ActionMode.Callback) this.f790a).onCreateActionMode(e2, menu);
    }

    public Bundle n(Bundle bundle, String str) {
        HashMap hashMap = (HashMap) this.f792c;
        return bundle != null ? (Bundle) hashMap.put(str, bundle) : (Bundle) hashMap.remove(str);
    }

    public v(V v2, T t2, AbstractC0112c abstractC0112c) {
        q1.d.e(v2, "store");
        q1.d.e(t2, "factory");
        q1.d.e(abstractC0112c, "defaultExtras");
        this.f790a = v2;
        this.f791b = t2;
        this.f792c = abstractC0112c;
        this.d = new T0.e(13);
    }

    public v(Typeface typeface, V.b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        this.d = typeface;
        this.f790a = bVar;
        this.f792c = new u(1024);
        int a2 = bVar.a(6);
        if (a2 != 0) {
            int i5 = a2 + bVar.f304a;
            i = ((ByteBuffer) bVar.d).getInt(((ByteBuffer) bVar.d).getInt(i5) + i5);
        } else {
            i = 0;
        }
        this.f791b = new char[i * 2];
        int a3 = bVar.a(6);
        if (a3 != 0) {
            int i6 = a3 + bVar.f304a;
            i2 = ((ByteBuffer) bVar.d).getInt(((ByteBuffer) bVar.d).getInt(i6) + i6);
        } else {
            i2 = 0;
        }
        for (int i7 = 0; i7 < i2; i7++) {
            y yVar = new y(this, i7);
            V.a b2 = yVar.b();
            int a4 = b2.a(4);
            Character.toChars(a4 != 0 ? ((ByteBuffer) b2.d).getInt(a4 + b2.f304a) : 0, (char[]) this.f791b, i7 * 2);
            V.a b3 = yVar.b();
            int a5 = b3.a(16);
            if (a5 != 0) {
                int i8 = a5 + b3.f304a;
                i3 = ((ByteBuffer) b3.d).getInt(((ByteBuffer) b3.d).getInt(i8) + i8);
            } else {
                i3 = 0;
            }
            Z0.i.g("invalid metadata codepoint length", i3 > 0);
            V.a b4 = yVar.b();
            int a6 = b4.a(16);
            if (a6 != 0) {
                int i9 = a6 + b4.f304a;
                i4 = ((ByteBuffer) b4.d).getInt(((ByteBuffer) b4.d).getInt(i9) + i9);
            } else {
                i4 = 0;
            }
            ((u) this.f792c).a(yVar, 0, i4 - 1);
        }
    }

    public v(Context context, ActionMode.Callback callback) {
        this.f791b = context;
        this.f790a = callback;
        this.f792c = new ArrayList();
        this.d = new o.j(0);
    }
}
