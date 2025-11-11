package Y;

import a.C0062d;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C0098v;
import androidx.lifecycle.EnumC0092o;
import androidx.lifecycle.InterfaceC0087j;
import androidx.lifecycle.InterfaceC0096t;
import c.InterfaceC0103b;
import com.android.music.R;
import com.xiaomi.vlive.ui.controller.ControllerFragment;
import g.AbstractActivityC0146i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import o0.InterfaceC0307d;
import p0.C0309a;

/* renamed from: Y.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractComponentCallbacksC0056x implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC0096t, androidx.lifecycle.W, InterfaceC0087j, InterfaceC0307d {

    /* renamed from: V, reason: collision with root package name */
    public static final Object f1161V = new Object();

    /* renamed from: A, reason: collision with root package name */
    public boolean f1162A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f1163B;

    /* renamed from: D, reason: collision with root package name */
    public boolean f1165D;

    /* renamed from: E, reason: collision with root package name */
    public ViewGroup f1166E;

    /* renamed from: F, reason: collision with root package name */
    public View f1167F;
    public boolean G;

    /* renamed from: I, reason: collision with root package name */
    public C0053u f1169I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f1170J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f1171K;

    /* renamed from: L, reason: collision with root package name */
    public String f1172L;

    /* renamed from: M, reason: collision with root package name */
    public EnumC0092o f1173M;

    /* renamed from: N, reason: collision with root package name */
    public C0098v f1174N;

    /* renamed from: O, reason: collision with root package name */
    public a0 f1175O;

    /* renamed from: P, reason: collision with root package name */
    public final androidx.lifecycle.A f1176P;

    /* renamed from: Q, reason: collision with root package name */
    public androidx.lifecycle.O f1177Q;

    /* renamed from: R, reason: collision with root package name */
    public C.j f1178R;

    /* renamed from: S, reason: collision with root package name */
    public final AtomicInteger f1179S;

    /* renamed from: T, reason: collision with root package name */
    public final ArrayList f1180T;

    /* renamed from: U, reason: collision with root package name */
    public final r f1181U;

    /* renamed from: b, reason: collision with root package name */
    public Bundle f1183b;

    /* renamed from: c, reason: collision with root package name */
    public SparseArray f1184c;
    public Bundle d;

    /* renamed from: f, reason: collision with root package name */
    public Bundle f1186f;

    /* renamed from: g, reason: collision with root package name */
    public AbstractComponentCallbacksC0056x f1187g;
    public int i;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1189k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1190l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1191m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1192n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1193o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1194p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1195q;

    /* renamed from: r, reason: collision with root package name */
    public int f1196r;

    /* renamed from: s, reason: collision with root package name */
    public S f1197s;

    /* renamed from: t, reason: collision with root package name */
    public B f1198t;

    /* renamed from: v, reason: collision with root package name */
    public AbstractComponentCallbacksC0056x f1200v;

    /* renamed from: w, reason: collision with root package name */
    public int f1201w;

    /* renamed from: x, reason: collision with root package name */
    public int f1202x;

    /* renamed from: y, reason: collision with root package name */
    public String f1203y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f1204z;

    /* renamed from: a, reason: collision with root package name */
    public int f1182a = -1;

    /* renamed from: e, reason: collision with root package name */
    public String f1185e = UUID.randomUUID().toString();
    public String h = null;

    /* renamed from: j, reason: collision with root package name */
    public Boolean f1188j = null;

    /* renamed from: u, reason: collision with root package name */
    public S f1199u = new S();

    /* renamed from: C, reason: collision with root package name */
    public final boolean f1164C = true;

    /* renamed from: H, reason: collision with root package name */
    public boolean f1168H = true;

    public AbstractComponentCallbacksC0056x() {
        new D0.i(5, this);
        this.f1173M = EnumC0092o.f1593e;
        this.f1176P = new androidx.lifecycle.A();
        this.f1179S = new AtomicInteger();
        this.f1180T = new ArrayList();
        this.f1181U = new r(this);
        m();
    }

    public void A() {
        this.f1165D = true;
    }

    public void B() {
        this.f1165D = true;
    }

    public void C(View view) {
    }

    public void D(Bundle bundle) {
        this.f1165D = true;
    }

    public void E(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f1199u.O();
        this.f1195q = true;
        this.f1175O = new a0(this, c(), new F0.b(7, this));
        View u2 = u(layoutInflater, viewGroup);
        this.f1167F = u2;
        if (u2 == null) {
            if (this.f1175O.d != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.f1175O = null;
            return;
        }
        this.f1175O.f();
        if (S.H(3)) {
            Log.d("FragmentManager", "Setting ViewLifecycleOwner on View " + this.f1167F + " for Fragment " + this);
        }
        View view = this.f1167F;
        a0 a0Var = this.f1175O;
        q1.d.e(view, "<this>");
        view.setTag(R.id.view_tree_lifecycle_owner, a0Var);
        View view2 = this.f1167F;
        a0 a0Var2 = this.f1175O;
        q1.d.e(view2, "<this>");
        view2.setTag(R.id.view_tree_view_model_store_owner, a0Var2);
        View view3 = this.f1167F;
        a0 a0Var3 = this.f1175O;
        q1.d.e(view3, "<this>");
        view3.setTag(R.id.view_tree_saved_state_registry_owner, a0Var3);
        this.f1176P.e(this.f1175O);
    }

    public final C0050q F(U.t tVar, InterfaceC0103b interfaceC0103b) {
        ControllerFragment controllerFragment = (ControllerFragment) this;
        A0.c cVar = new A0.c(15, controllerFragment);
        if (this.f1182a > 1) {
            throw new IllegalStateException("Fragment " + this + " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate()).");
        }
        AtomicReference atomicReference = new AtomicReference();
        C0052t c0052t = new C0052t(controllerFragment, cVar, atomicReference, tVar, interfaceC0103b);
        if (this.f1182a >= 0) {
            c0052t.a();
        } else {
            this.f1180T.add(c0052t);
        }
        return new C0050q(atomicReference);
    }

    public final AbstractActivityC0146i G() {
        B b2 = this.f1198t;
        AbstractActivityC0146i abstractActivityC0146i = b2 == null ? null : b2.f958e;
        if (abstractActivityC0146i != null) {
            return abstractActivityC0146i;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public final Context H() {
        Context h = h();
        if (h != null) {
            return h;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public final View I() {
        View view = this.f1167F;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public final void J(int i, int i2, int i3, int i4) {
        if (this.f1169I == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        f().f1154b = i;
        f().f1155c = i2;
        f().d = i3;
        f().f1156e = i4;
    }

    public final void K(Bundle bundle) {
        S s2 = this.f1197s;
        if (s2 != null) {
            if (s2 == null ? false : s2.M()) {
                throw new IllegalStateException("Fragment already added and state has been saved");
            }
        }
        this.f1186f = bundle;
    }

    @Override // androidx.lifecycle.InterfaceC0087j
    public final c0.e a() {
        Application application;
        Context applicationContext = H().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && S.H(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + H().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        c0.e eVar = new c0.e(0);
        LinkedHashMap linkedHashMap = eVar.f1741a;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.S.f1572f, application);
        }
        linkedHashMap.put(androidx.lifecycle.L.f1557a, this);
        linkedHashMap.put(androidx.lifecycle.L.f1558b, this);
        Bundle bundle = this.f1186f;
        if (bundle != null) {
            linkedHashMap.put(androidx.lifecycle.L.f1559c, bundle);
        }
        return eVar;
    }

    @Override // o0.InterfaceC0307d
    public final C.j b() {
        return (C.j) this.f1178R.f61c;
    }

    @Override // androidx.lifecycle.W
    public final androidx.lifecycle.V c() {
        if (this.f1197s == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (j() == 1) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap hashMap = this.f1197s.f1002M.d;
        androidx.lifecycle.V v2 = (androidx.lifecycle.V) hashMap.get(this.f1185e);
        if (v2 != null) {
            return v2;
        }
        androidx.lifecycle.V v3 = new androidx.lifecycle.V();
        hashMap.put(this.f1185e, v3);
        return v3;
    }

    @Override // androidx.lifecycle.InterfaceC0096t
    public final C0098v d() {
        return this.f1174N;
    }

    public U.t e() {
        return new C0051s(this);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Y.u, java.lang.Object] */
    public final C0053u f() {
        if (this.f1169I == null) {
            ?? obj = new Object();
            Object obj2 = f1161V;
            obj.f1158g = obj2;
            obj.h = obj2;
            obj.i = obj2;
            obj.f1159j = 1.0f;
            obj.f1160k = null;
            this.f1169I = obj;
        }
        return this.f1169I;
    }

    public final S g() {
        if (this.f1198t != null) {
            return this.f1199u;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public final Context h() {
        B b2 = this.f1198t;
        if (b2 == null) {
            return null;
        }
        return b2.f959f;
    }

    public final androidx.lifecycle.T i() {
        Application application;
        if (this.f1197s == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.f1177Q == null) {
            Context applicationContext = H().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            if (application == null && S.H(3)) {
                Log.d("FragmentManager", "Could not find Application instance from Context " + H().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
            }
            this.f1177Q = new androidx.lifecycle.O(application, this, this.f1186f);
        }
        return this.f1177Q;
    }

    public final int j() {
        EnumC0092o enumC0092o = this.f1173M;
        return (enumC0092o == EnumC0092o.f1591b || this.f1200v == null) ? enumC0092o.ordinal() : Math.min(enumC0092o.ordinal(), this.f1200v.j());
    }

    public final S k() {
        S s2 = this.f1197s;
        if (s2 != null) {
            return s2;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public final a0 l() {
        a0 a0Var = this.f1175O;
        if (a0Var != null) {
            return a0Var;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner for " + this + " when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    public final void m() {
        this.f1174N = new C0098v(this);
        this.f1178R = new C.j(new C0309a(this, new C0062d(4, this)), 15);
        this.f1177Q = null;
        ArrayList arrayList = this.f1180T;
        r rVar = this.f1181U;
        if (arrayList.contains(rVar)) {
            return;
        }
        if (this.f1182a >= 0) {
            rVar.a();
        } else {
            arrayList.add(rVar);
        }
    }

    public final void n() {
        m();
        this.f1172L = this.f1185e;
        this.f1185e = UUID.randomUUID().toString();
        this.f1189k = false;
        this.f1190l = false;
        this.f1192n = false;
        this.f1193o = false;
        this.f1194p = false;
        this.f1196r = 0;
        this.f1197s = null;
        this.f1199u = new S();
        this.f1198t = null;
        this.f1201w = 0;
        this.f1202x = 0;
        this.f1203y = null;
        this.f1204z = false;
        this.f1162A = false;
    }

    public final boolean o() {
        if (this.f1204z) {
            return true;
        }
        S s2 = this.f1197s;
        if (s2 != null) {
            AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x = this.f1200v;
            s2.getClass();
            if (abstractComponentCallbacksC0056x == null ? false : abstractComponentCallbacksC0056x.o()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.f1165D = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        G().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f1165D = true;
    }

    public final boolean p() {
        return this.f1196r > 0;
    }

    public void q() {
        this.f1165D = true;
    }

    public final void r(int i, int i2, Intent intent) {
        if (S.H(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i2 + " data: " + intent);
        }
    }

    public void s(AbstractActivityC0146i abstractActivityC0146i) {
        this.f1165D = true;
        B b2 = this.f1198t;
        if ((b2 == null ? null : b2.f958e) != null) {
            this.f1165D = true;
        }
    }

    public void t(Bundle bundle) {
        Bundle bundle2;
        this.f1165D = true;
        Bundle bundle3 = this.f1183b;
        if (bundle3 != null && (bundle2 = bundle3.getBundle("childFragmentManager")) != null) {
            this.f1199u.U(bundle2);
            S s2 = this.f1199u;
            s2.f996F = false;
            s2.G = false;
            s2.f1002M.f1038g = false;
            s2.t(1);
        }
        S s3 = this.f1199u;
        if (s3.f1020t >= 1) {
            return;
        }
        s3.f996F = false;
        s3.G = false;
        s3.f1002M.f1038g = false;
        s3.t(1);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.f1185e);
        if (this.f1201w != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f1201w));
        }
        if (this.f1203y != null) {
            sb.append(" tag=");
            sb.append(this.f1203y);
        }
        sb.append(")");
        return sb.toString();
    }

    public View u(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public void v() {
        this.f1165D = true;
    }

    public void w() {
        this.f1165D = true;
    }

    public LayoutInflater x(Bundle bundle) {
        B b2 = this.f1198t;
        if (b2 == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        AbstractActivityC0146i abstractActivityC0146i = b2.i;
        LayoutInflater cloneInContext = abstractActivityC0146i.getLayoutInflater().cloneInContext(abstractActivityC0146i);
        cloneInContext.setFactory2(this.f1199u.f1008f);
        return cloneInContext;
    }

    public void y(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.f1165D = true;
        B b2 = this.f1198t;
        if ((b2 == null ? null : b2.f958e) != null) {
            this.f1165D = true;
        }
    }

    public void z(Bundle bundle) {
    }
}
