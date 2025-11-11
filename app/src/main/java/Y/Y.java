package Y;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AndroidRuntimeException;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.C0098v;
import androidx.lifecycle.EnumC0091n;
import androidx.lifecycle.EnumC0092o;
import c0.C0110a;
import com.android.music.R;
import e0.C0116a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import o0.C0304a;
import r.AbstractC0319e;

/* loaded from: classes.dex */
public final class Y {

    /* renamed from: a, reason: collision with root package name */
    public final C.j f1050a;

    /* renamed from: b, reason: collision with root package name */
    public final U.v f1051b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractComponentCallbacksC0056x f1052c;
    public boolean d = false;

    /* renamed from: e, reason: collision with root package name */
    public int f1053e = -1;

    public Y(C.j jVar, U.v vVar, AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x) {
        this.f1050a = jVar;
        this.f1051b = vVar;
        this.f1052c = abstractComponentCallbacksC0056x;
    }

    public final void a() {
        boolean H2 = S.H(3);
        AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x = this.f1052c;
        if (H2) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + abstractComponentCallbacksC0056x);
        }
        Bundle bundle = abstractComponentCallbacksC0056x.f1183b;
        if (bundle != null) {
            bundle.getBundle("savedInstanceState");
        }
        abstractComponentCallbacksC0056x.f1199u.O();
        abstractComponentCallbacksC0056x.f1182a = 3;
        abstractComponentCallbacksC0056x.f1165D = false;
        abstractComponentCallbacksC0056x.q();
        if (!abstractComponentCallbacksC0056x.f1165D) {
            throw new AndroidRuntimeException("Fragment " + abstractComponentCallbacksC0056x + " did not call through to super.onActivityCreated()");
        }
        if (S.H(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + abstractComponentCallbacksC0056x);
        }
        if (abstractComponentCallbacksC0056x.f1167F != null) {
            Bundle bundle2 = abstractComponentCallbacksC0056x.f1183b;
            Bundle bundle3 = bundle2 != null ? bundle2.getBundle("savedInstanceState") : null;
            SparseArray<Parcelable> sparseArray = abstractComponentCallbacksC0056x.f1184c;
            if (sparseArray != null) {
                abstractComponentCallbacksC0056x.f1167F.restoreHierarchyState(sparseArray);
                abstractComponentCallbacksC0056x.f1184c = null;
            }
            abstractComponentCallbacksC0056x.f1165D = false;
            abstractComponentCallbacksC0056x.D(bundle3);
            if (!abstractComponentCallbacksC0056x.f1165D) {
                throw new AndroidRuntimeException("Fragment " + abstractComponentCallbacksC0056x + " did not call through to super.onViewStateRestored()");
            }
            if (abstractComponentCallbacksC0056x.f1167F != null) {
                abstractComponentCallbacksC0056x.f1175O.e(EnumC0091n.ON_CREATE);
            }
        }
        abstractComponentCallbacksC0056x.f1183b = null;
        S s2 = abstractComponentCallbacksC0056x.f1199u;
        s2.f996F = false;
        s2.G = false;
        s2.f1002M.f1038g = false;
        s2.t(4);
        this.f1050a.c(false);
    }

    public final void b() {
        AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x;
        View view;
        View view2;
        int i = -1;
        AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x2 = this.f1052c;
        View view3 = abstractComponentCallbacksC0056x2.f1166E;
        while (true) {
            abstractComponentCallbacksC0056x = null;
            if (view3 == null) {
                break;
            }
            Object tag = view3.getTag(R.id.fragment_container_view_tag);
            AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x3 = tag instanceof AbstractComponentCallbacksC0056x ? (AbstractComponentCallbacksC0056x) tag : null;
            if (abstractComponentCallbacksC0056x3 != null) {
                abstractComponentCallbacksC0056x = abstractComponentCallbacksC0056x3;
                break;
            } else {
                Object parent = view3.getParent();
                view3 = parent instanceof View ? (View) parent : null;
            }
        }
        AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x4 = abstractComponentCallbacksC0056x2.f1200v;
        if (abstractComponentCallbacksC0056x != null && !abstractComponentCallbacksC0056x.equals(abstractComponentCallbacksC0056x4)) {
            int i2 = abstractComponentCallbacksC0056x2.f1202x;
            Z.c cVar = Z.d.f1217a;
            Z.d.b(new Z.a(abstractComponentCallbacksC0056x2, "Attempting to nest fragment " + abstractComponentCallbacksC0056x2 + " within the view of parent fragment " + abstractComponentCallbacksC0056x + " via container with ID " + i2 + " without using parent's childFragmentManager"));
            Z.d.a(abstractComponentCallbacksC0056x2).getClass();
        }
        U.v vVar = this.f1051b;
        vVar.getClass();
        ViewGroup viewGroup = abstractComponentCallbacksC0056x2.f1166E;
        if (viewGroup != null) {
            ArrayList arrayList = (ArrayList) vVar.f790a;
            int indexOf = arrayList.indexOf(abstractComponentCallbacksC0056x2);
            int i3 = indexOf - 1;
            while (true) {
                if (i3 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= arrayList.size()) {
                            break;
                        }
                        AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x5 = (AbstractComponentCallbacksC0056x) arrayList.get(indexOf);
                        if (abstractComponentCallbacksC0056x5.f1166E == viewGroup && (view = abstractComponentCallbacksC0056x5.f1167F) != null) {
                            i = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x6 = (AbstractComponentCallbacksC0056x) arrayList.get(i3);
                    if (abstractComponentCallbacksC0056x6.f1166E == viewGroup && (view2 = abstractComponentCallbacksC0056x6.f1167F) != null) {
                        i = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i3--;
                }
            }
        }
        abstractComponentCallbacksC0056x2.f1166E.addView(abstractComponentCallbacksC0056x2.f1167F, i);
    }

    public final void c() {
        boolean H2 = S.H(3);
        AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x = this.f1052c;
        if (H2) {
            Log.d("FragmentManager", "moveto ATTACHED: " + abstractComponentCallbacksC0056x);
        }
        AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x2 = abstractComponentCallbacksC0056x.f1187g;
        Y y2 = null;
        U.v vVar = this.f1051b;
        if (abstractComponentCallbacksC0056x2 != null) {
            Y y3 = (Y) ((HashMap) vVar.f791b).get(abstractComponentCallbacksC0056x2.f1185e);
            if (y3 == null) {
                throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0056x + " declared target fragment " + abstractComponentCallbacksC0056x.f1187g + " that does not belong to this FragmentManager!");
            }
            abstractComponentCallbacksC0056x.h = abstractComponentCallbacksC0056x.f1187g.f1185e;
            abstractComponentCallbacksC0056x.f1187g = null;
            y2 = y3;
        } else {
            String str = abstractComponentCallbacksC0056x.h;
            if (str != null && (y2 = (Y) ((HashMap) vVar.f791b).get(str)) == null) {
                throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0056x + " declared target fragment " + abstractComponentCallbacksC0056x.h + " that does not belong to this FragmentManager!");
            }
        }
        if (y2 != null) {
            y2.k();
        }
        S s2 = abstractComponentCallbacksC0056x.f1197s;
        abstractComponentCallbacksC0056x.f1198t = s2.f1021u;
        abstractComponentCallbacksC0056x.f1200v = s2.f1023w;
        C.j jVar = this.f1050a;
        jVar.j(false);
        ArrayList arrayList = abstractComponentCallbacksC0056x.f1180T;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC0055w) it.next()).a();
        }
        arrayList.clear();
        abstractComponentCallbacksC0056x.f1199u.b(abstractComponentCallbacksC0056x.f1198t, abstractComponentCallbacksC0056x.e(), abstractComponentCallbacksC0056x);
        abstractComponentCallbacksC0056x.f1182a = 0;
        abstractComponentCallbacksC0056x.f1165D = false;
        abstractComponentCallbacksC0056x.s(abstractComponentCallbacksC0056x.f1198t.f959f);
        if (!abstractComponentCallbacksC0056x.f1165D) {
            throw new AndroidRuntimeException("Fragment " + abstractComponentCallbacksC0056x + " did not call through to super.onAttach()");
        }
        S s3 = abstractComponentCallbacksC0056x.f1197s;
        Iterator it2 = s3.f1014n.iterator();
        while (it2.hasNext()) {
            ((W) it2.next()).a(s3, abstractComponentCallbacksC0056x);
        }
        S s4 = abstractComponentCallbacksC0056x.f1199u;
        s4.f996F = false;
        s4.G = false;
        s4.f1002M.f1038g = false;
        s4.t(0);
        jVar.d(false);
    }

    public final int d() {
        Object obj;
        AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x = this.f1052c;
        if (abstractComponentCallbacksC0056x.f1197s == null) {
            return abstractComponentCallbacksC0056x.f1182a;
        }
        int i = this.f1053e;
        int ordinal = abstractComponentCallbacksC0056x.f1173M.ordinal();
        if (ordinal == 1) {
            i = Math.min(i, 0);
        } else if (ordinal == 2) {
            i = Math.min(i, 1);
        } else if (ordinal == 3) {
            i = Math.min(i, 5);
        } else if (ordinal != 4) {
            i = Math.min(i, -1);
        }
        if (abstractComponentCallbacksC0056x.f1192n) {
            if (abstractComponentCallbacksC0056x.f1193o) {
                i = Math.max(this.f1053e, 2);
                View view = abstractComponentCallbacksC0056x.f1167F;
                if (view != null && view.getParent() == null) {
                    i = Math.min(i, 2);
                }
            } else {
                i = this.f1053e < 4 ? Math.min(i, abstractComponentCallbacksC0056x.f1182a) : Math.min(i, 1);
            }
        }
        if (!abstractComponentCallbacksC0056x.f1189k) {
            i = Math.min(i, 1);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC0056x.f1166E;
        if (viewGroup != null) {
            C0044k f2 = C0044k.f(viewGroup, abstractComponentCallbacksC0056x.k());
            f2.getClass();
            d0 d = f2.d(abstractComponentCallbacksC0056x);
            int i2 = d != null ? d.f1102b : 0;
            Iterator it = f2.f1124c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                d0 d0Var = (d0) obj;
                if (q1.d.a(d0Var.f1103c, abstractComponentCallbacksC0056x) && !d0Var.f1105f) {
                    break;
                }
            }
            d0 d0Var2 = (d0) obj;
            r5 = d0Var2 != null ? d0Var2.f1102b : 0;
            int i3 = i2 == 0 ? -1 : e0.f1110a[AbstractC0319e.a(i2)];
            if (i3 != -1 && i3 != 1) {
                r5 = i2;
            }
        }
        if (r5 == 2) {
            i = Math.min(i, 6);
        } else if (r5 == 3) {
            i = Math.max(i, 3);
        } else if (abstractComponentCallbacksC0056x.f1190l) {
            i = abstractComponentCallbacksC0056x.p() ? Math.min(i, 1) : Math.min(i, -1);
        }
        if (abstractComponentCallbacksC0056x.G && abstractComponentCallbacksC0056x.f1182a < 5) {
            i = Math.min(i, 4);
        }
        if (S.H(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i + " for " + abstractComponentCallbacksC0056x);
        }
        return i;
    }

    public final void e() {
        Bundle bundle;
        boolean H2 = S.H(3);
        AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x = this.f1052c;
        if (H2) {
            Log.d("FragmentManager", "moveto CREATED: " + abstractComponentCallbacksC0056x);
        }
        Bundle bundle2 = abstractComponentCallbacksC0056x.f1183b;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle("savedInstanceState") : null;
        if (abstractComponentCallbacksC0056x.f1171K) {
            abstractComponentCallbacksC0056x.f1182a = 1;
            Bundle bundle4 = abstractComponentCallbacksC0056x.f1183b;
            if (bundle4 == null || (bundle = bundle4.getBundle("childFragmentManager")) == null) {
                return;
            }
            abstractComponentCallbacksC0056x.f1199u.U(bundle);
            S s2 = abstractComponentCallbacksC0056x.f1199u;
            s2.f996F = false;
            s2.G = false;
            s2.f1002M.f1038g = false;
            s2.t(1);
            return;
        }
        C.j jVar = this.f1050a;
        jVar.k(false);
        abstractComponentCallbacksC0056x.f1199u.O();
        abstractComponentCallbacksC0056x.f1182a = 1;
        abstractComponentCallbacksC0056x.f1165D = false;
        abstractComponentCallbacksC0056x.f1174N.a(new C0304a(1, abstractComponentCallbacksC0056x));
        abstractComponentCallbacksC0056x.t(bundle3);
        abstractComponentCallbacksC0056x.f1171K = true;
        if (abstractComponentCallbacksC0056x.f1165D) {
            abstractComponentCallbacksC0056x.f1174N.d(EnumC0091n.ON_CREATE);
            jVar.e(false);
        } else {
            throw new AndroidRuntimeException("Fragment " + abstractComponentCallbacksC0056x + " did not call through to super.onCreate()");
        }
    }

    public final void f() {
        String str;
        AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x = this.f1052c;
        if (abstractComponentCallbacksC0056x.f1192n) {
            return;
        }
        if (S.H(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC0056x);
        }
        Bundle bundle = abstractComponentCallbacksC0056x.f1183b;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater x2 = abstractComponentCallbacksC0056x.x(bundle2);
        ViewGroup viewGroup2 = abstractComponentCallbacksC0056x.f1166E;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i = abstractComponentCallbacksC0056x.f1202x;
            if (i != 0) {
                if (i == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + abstractComponentCallbacksC0056x + " for a container view with no id");
                }
                viewGroup = (ViewGroup) abstractComponentCallbacksC0056x.f1197s.f1022v.P(i);
                if (viewGroup == null) {
                    if (!abstractComponentCallbacksC0056x.f1194p) {
                        try {
                            str = abstractComponentCallbacksC0056x.H().getResources().getResourceName(abstractComponentCallbacksC0056x.f1202x);
                        } catch (Resources.NotFoundException unused) {
                            str = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(abstractComponentCallbacksC0056x.f1202x) + " (" + str + ") for fragment " + abstractComponentCallbacksC0056x);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    Z.c cVar = Z.d.f1217a;
                    Z.d.b(new Z.a(abstractComponentCallbacksC0056x, "Attempting to add fragment " + abstractComponentCallbacksC0056x + " to container " + viewGroup + " which is not a FragmentContainerView"));
                    Z.d.a(abstractComponentCallbacksC0056x).getClass();
                }
            }
        }
        abstractComponentCallbacksC0056x.f1166E = viewGroup;
        abstractComponentCallbacksC0056x.E(x2, viewGroup, bundle2);
        if (abstractComponentCallbacksC0056x.f1167F != null) {
            if (S.H(3)) {
                Log.d("FragmentManager", "moveto VIEW_CREATED: " + abstractComponentCallbacksC0056x);
            }
            abstractComponentCallbacksC0056x.f1167F.setSaveFromParentEnabled(false);
            abstractComponentCallbacksC0056x.f1167F.setTag(R.id.fragment_container_view_tag, abstractComponentCallbacksC0056x);
            if (viewGroup != null) {
                b();
            }
            if (abstractComponentCallbacksC0056x.f1204z) {
                abstractComponentCallbacksC0056x.f1167F.setVisibility(8);
            }
            View view = abstractComponentCallbacksC0056x.f1167F;
            WeakHashMap weakHashMap = L.S.f311a;
            if (view.isAttachedToWindow()) {
                L.E.c(abstractComponentCallbacksC0056x.f1167F);
            } else {
                View view2 = abstractComponentCallbacksC0056x.f1167F;
                view2.addOnAttachStateChangeListener(new W0.n(1, view2));
            }
            Bundle bundle3 = abstractComponentCallbacksC0056x.f1183b;
            if (bundle3 != null) {
                bundle3.getBundle("savedInstanceState");
            }
            abstractComponentCallbacksC0056x.C(abstractComponentCallbacksC0056x.f1167F);
            abstractComponentCallbacksC0056x.f1199u.t(2);
            this.f1050a.p(false);
            int visibility = abstractComponentCallbacksC0056x.f1167F.getVisibility();
            abstractComponentCallbacksC0056x.f().f1159j = abstractComponentCallbacksC0056x.f1167F.getAlpha();
            if (abstractComponentCallbacksC0056x.f1166E != null && visibility == 0) {
                View findFocus = abstractComponentCallbacksC0056x.f1167F.findFocus();
                if (findFocus != null) {
                    abstractComponentCallbacksC0056x.f().f1160k = findFocus;
                    if (S.H(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + abstractComponentCallbacksC0056x);
                    }
                }
                abstractComponentCallbacksC0056x.f1167F.setAlpha(0.0f);
            }
        }
        abstractComponentCallbacksC0056x.f1182a = 2;
    }

    public final void g() {
        boolean z2;
        AbstractComponentCallbacksC0056x c2;
        boolean H2 = S.H(3);
        AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x = this.f1052c;
        if (H2) {
            Log.d("FragmentManager", "movefrom CREATED: " + abstractComponentCallbacksC0056x);
        }
        boolean z3 = abstractComponentCallbacksC0056x.f1190l && !abstractComponentCallbacksC0056x.p();
        U.v vVar = this.f1051b;
        if (z3 && !abstractComponentCallbacksC0056x.f1191m) {
            vVar.n(null, abstractComponentCallbacksC0056x.f1185e);
        }
        if (!z3) {
            V v2 = (V) vVar.d;
            if (!((v2.f1034b.containsKey(abstractComponentCallbacksC0056x.f1185e) && v2.f1036e) ? v2.f1037f : true)) {
                String str = abstractComponentCallbacksC0056x.h;
                if (str != null && (c2 = vVar.c(str)) != null && c2.f1163B) {
                    abstractComponentCallbacksC0056x.f1187g = c2;
                }
                abstractComponentCallbacksC0056x.f1182a = 0;
                return;
            }
        }
        B b2 = abstractComponentCallbacksC0056x.f1198t;
        if (b2 != null) {
            z2 = ((V) vVar.d).f1037f;
        } else {
            z2 = b2.f959f != null ? !r6.isChangingConfigurations() : true;
        }
        if ((z3 && !abstractComponentCallbacksC0056x.f1191m) || z2) {
            ((V) vVar.d).c(abstractComponentCallbacksC0056x, false);
        }
        abstractComponentCallbacksC0056x.f1199u.k();
        abstractComponentCallbacksC0056x.f1174N.d(EnumC0091n.ON_DESTROY);
        abstractComponentCallbacksC0056x.f1182a = 0;
        abstractComponentCallbacksC0056x.f1171K = false;
        abstractComponentCallbacksC0056x.f1165D = true;
        this.f1050a.f(false);
        Iterator it = vVar.f().iterator();
        while (it.hasNext()) {
            Y y2 = (Y) it.next();
            if (y2 != null) {
                String str2 = abstractComponentCallbacksC0056x.f1185e;
                AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x2 = y2.f1052c;
                if (str2.equals(abstractComponentCallbacksC0056x2.h)) {
                    abstractComponentCallbacksC0056x2.f1187g = abstractComponentCallbacksC0056x;
                    abstractComponentCallbacksC0056x2.h = null;
                }
            }
        }
        String str3 = abstractComponentCallbacksC0056x.h;
        if (str3 != null) {
            abstractComponentCallbacksC0056x.f1187g = vVar.c(str3);
        }
        vVar.k(this);
    }

    public final void h() {
        View view;
        boolean H2 = S.H(3);
        AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x = this.f1052c;
        if (H2) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + abstractComponentCallbacksC0056x);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC0056x.f1166E;
        if (viewGroup != null && (view = abstractComponentCallbacksC0056x.f1167F) != null) {
            viewGroup.removeView(view);
        }
        abstractComponentCallbacksC0056x.f1199u.t(1);
        if (abstractComponentCallbacksC0056x.f1167F != null) {
            a0 a0Var = abstractComponentCallbacksC0056x.f1175O;
            a0Var.f();
            if (a0Var.d.f1600c.compareTo(EnumC0092o.f1592c) >= 0) {
                abstractComponentCallbacksC0056x.f1175O.e(EnumC0091n.ON_DESTROY);
            }
        }
        abstractComponentCallbacksC0056x.f1182a = 1;
        abstractComponentCallbacksC0056x.f1165D = false;
        abstractComponentCallbacksC0056x.v();
        if (!abstractComponentCallbacksC0056x.f1165D) {
            throw new AndroidRuntimeException("Fragment " + abstractComponentCallbacksC0056x + " did not call through to super.onDestroyView()");
        }
        androidx.lifecycle.V c2 = abstractComponentCallbacksC0056x.c();
        U u2 = C0116a.f2189c;
        q1.d.e(c2, "store");
        C0110a c0110a = C0110a.f1740b;
        q1.d.e(c0110a, "defaultCreationExtras");
        U.v vVar = new U.v(c2, u2, c0110a);
        q1.b a2 = q1.i.a(C0116a.class);
        String s2 = U.t.s(a2);
        if (s2 == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        o.k kVar = ((C0116a) vVar.i(a2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s2))).f2190b;
        if (kVar.e() > 0) {
            kVar.f(0).getClass();
            throw new ClassCastException();
        }
        abstractComponentCallbacksC0056x.f1195q = false;
        this.f1050a.q(false);
        abstractComponentCallbacksC0056x.f1166E = null;
        abstractComponentCallbacksC0056x.f1167F = null;
        abstractComponentCallbacksC0056x.f1175O = null;
        abstractComponentCallbacksC0056x.f1176P.e(null);
        abstractComponentCallbacksC0056x.f1193o = false;
    }

    public final void i() {
        boolean H2 = S.H(3);
        AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x = this.f1052c;
        if (H2) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + abstractComponentCallbacksC0056x);
        }
        abstractComponentCallbacksC0056x.f1182a = -1;
        abstractComponentCallbacksC0056x.f1165D = false;
        abstractComponentCallbacksC0056x.w();
        if (!abstractComponentCallbacksC0056x.f1165D) {
            throw new AndroidRuntimeException("Fragment " + abstractComponentCallbacksC0056x + " did not call through to super.onDetach()");
        }
        S s2 = abstractComponentCallbacksC0056x.f1199u;
        if (!s2.f997H) {
            s2.k();
            abstractComponentCallbacksC0056x.f1199u = new S();
        }
        this.f1050a.g(false);
        abstractComponentCallbacksC0056x.f1182a = -1;
        abstractComponentCallbacksC0056x.f1198t = null;
        abstractComponentCallbacksC0056x.f1200v = null;
        abstractComponentCallbacksC0056x.f1197s = null;
        if (!abstractComponentCallbacksC0056x.f1190l || abstractComponentCallbacksC0056x.p()) {
            V v2 = (V) this.f1051b.d;
            if (!((v2.f1034b.containsKey(abstractComponentCallbacksC0056x.f1185e) && v2.f1036e) ? v2.f1037f : true)) {
                return;
            }
        }
        if (S.H(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + abstractComponentCallbacksC0056x);
        }
        abstractComponentCallbacksC0056x.n();
    }

    public final void j() {
        AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x = this.f1052c;
        if (abstractComponentCallbacksC0056x.f1192n && abstractComponentCallbacksC0056x.f1193o && !abstractComponentCallbacksC0056x.f1195q) {
            if (S.H(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC0056x);
            }
            Bundle bundle = abstractComponentCallbacksC0056x.f1183b;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            abstractComponentCallbacksC0056x.E(abstractComponentCallbacksC0056x.x(bundle2), null, bundle2);
            View view = abstractComponentCallbacksC0056x.f1167F;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                abstractComponentCallbacksC0056x.f1167F.setTag(R.id.fragment_container_view_tag, abstractComponentCallbacksC0056x);
                if (abstractComponentCallbacksC0056x.f1204z) {
                    abstractComponentCallbacksC0056x.f1167F.setVisibility(8);
                }
                Bundle bundle3 = abstractComponentCallbacksC0056x.f1183b;
                if (bundle3 != null) {
                    bundle3.getBundle("savedInstanceState");
                }
                abstractComponentCallbacksC0056x.C(abstractComponentCallbacksC0056x.f1167F);
                abstractComponentCallbacksC0056x.f1199u.t(2);
                this.f1050a.p(false);
                abstractComponentCallbacksC0056x.f1182a = 2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0166, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k() {
        /*
            Method dump skipped, instructions count: 598
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.Y.k():void");
    }

    public final void l() {
        boolean H2 = S.H(3);
        AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x = this.f1052c;
        if (H2) {
            Log.d("FragmentManager", "movefrom RESUMED: " + abstractComponentCallbacksC0056x);
        }
        abstractComponentCallbacksC0056x.f1199u.t(5);
        if (abstractComponentCallbacksC0056x.f1167F != null) {
            abstractComponentCallbacksC0056x.f1175O.e(EnumC0091n.ON_PAUSE);
        }
        abstractComponentCallbacksC0056x.f1174N.d(EnumC0091n.ON_PAUSE);
        abstractComponentCallbacksC0056x.f1182a = 6;
        abstractComponentCallbacksC0056x.f1165D = true;
        this.f1050a.i(false);
    }

    public final void m(ClassLoader classLoader) {
        AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x = this.f1052c;
        Bundle bundle = abstractComponentCallbacksC0056x.f1183b;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (abstractComponentCallbacksC0056x.f1183b.getBundle("savedInstanceState") == null) {
            abstractComponentCallbacksC0056x.f1183b.putBundle("savedInstanceState", new Bundle());
        }
        abstractComponentCallbacksC0056x.f1184c = abstractComponentCallbacksC0056x.f1183b.getSparseParcelableArray("viewState");
        abstractComponentCallbacksC0056x.d = abstractComponentCallbacksC0056x.f1183b.getBundle("viewRegistryState");
        X x2 = (X) abstractComponentCallbacksC0056x.f1183b.getParcelable("state");
        if (x2 != null) {
            abstractComponentCallbacksC0056x.h = x2.f1047l;
            abstractComponentCallbacksC0056x.i = x2.f1048m;
            abstractComponentCallbacksC0056x.f1168H = x2.f1049n;
        }
        if (abstractComponentCallbacksC0056x.f1168H) {
            return;
        }
        abstractComponentCallbacksC0056x.G = true;
    }

    public final void n() {
        boolean H2 = S.H(3);
        AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x = this.f1052c;
        if (H2) {
            Log.d("FragmentManager", "moveto RESUMED: " + abstractComponentCallbacksC0056x);
        }
        C0053u c0053u = abstractComponentCallbacksC0056x.f1169I;
        View view = c0053u == null ? null : c0053u.f1160k;
        if (view != null) {
            if (view != abstractComponentCallbacksC0056x.f1167F) {
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    if (parent != abstractComponentCallbacksC0056x.f1167F) {
                    }
                }
            }
            boolean requestFocus = view.requestFocus();
            if (S.H(2)) {
                StringBuilder sb = new StringBuilder("requestFocus: Restoring focused view ");
                sb.append(view);
                sb.append(" ");
                sb.append(requestFocus ? "succeeded" : "failed");
                sb.append(" on Fragment ");
                sb.append(abstractComponentCallbacksC0056x);
                sb.append(" resulting in focused view ");
                sb.append(abstractComponentCallbacksC0056x.f1167F.findFocus());
                Log.v("FragmentManager", sb.toString());
            }
        }
        abstractComponentCallbacksC0056x.f().f1160k = null;
        abstractComponentCallbacksC0056x.f1199u.O();
        abstractComponentCallbacksC0056x.f1199u.y(true);
        abstractComponentCallbacksC0056x.f1182a = 7;
        abstractComponentCallbacksC0056x.f1165D = true;
        C0098v c0098v = abstractComponentCallbacksC0056x.f1174N;
        EnumC0091n enumC0091n = EnumC0091n.ON_RESUME;
        c0098v.d(enumC0091n);
        if (abstractComponentCallbacksC0056x.f1167F != null) {
            abstractComponentCallbacksC0056x.f1175O.d.d(enumC0091n);
        }
        S s2 = abstractComponentCallbacksC0056x.f1199u;
        s2.f996F = false;
        s2.G = false;
        s2.f1002M.f1038g = false;
        s2.t(7);
        this.f1050a.l(false);
        this.f1051b.n(null, abstractComponentCallbacksC0056x.f1185e);
        abstractComponentCallbacksC0056x.f1183b = null;
        abstractComponentCallbacksC0056x.f1184c = null;
        abstractComponentCallbacksC0056x.d = null;
    }

    public final Bundle o() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x = this.f1052c;
        if (abstractComponentCallbacksC0056x.f1182a == -1 && (bundle = abstractComponentCallbacksC0056x.f1183b) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new X(abstractComponentCallbacksC0056x));
        if (abstractComponentCallbacksC0056x.f1182a > -1) {
            Bundle bundle3 = new Bundle();
            abstractComponentCallbacksC0056x.z(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.f1050a.m(false);
            Bundle bundle4 = new Bundle();
            abstractComponentCallbacksC0056x.f1178R.G(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle V2 = abstractComponentCallbacksC0056x.f1199u.V();
            if (!V2.isEmpty()) {
                bundle2.putBundle("childFragmentManager", V2);
            }
            if (abstractComponentCallbacksC0056x.f1167F != null) {
                p();
            }
            SparseArray<? extends Parcelable> sparseArray = abstractComponentCallbacksC0056x.f1184c;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = abstractComponentCallbacksC0056x.d;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = abstractComponentCallbacksC0056x.f1186f;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    public final void p() {
        AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x = this.f1052c;
        if (abstractComponentCallbacksC0056x.f1167F == null) {
            return;
        }
        if (S.H(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + abstractComponentCallbacksC0056x + " with view " + abstractComponentCallbacksC0056x.f1167F);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        abstractComponentCallbacksC0056x.f1167F.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            abstractComponentCallbacksC0056x.f1184c = sparseArray;
        }
        Bundle bundle = new Bundle();
        abstractComponentCallbacksC0056x.f1175O.f1080e.G(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        abstractComponentCallbacksC0056x.d = bundle;
    }

    public final void q() {
        boolean H2 = S.H(3);
        AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x = this.f1052c;
        if (H2) {
            Log.d("FragmentManager", "moveto STARTED: " + abstractComponentCallbacksC0056x);
        }
        abstractComponentCallbacksC0056x.f1199u.O();
        abstractComponentCallbacksC0056x.f1199u.y(true);
        abstractComponentCallbacksC0056x.f1182a = 5;
        abstractComponentCallbacksC0056x.f1165D = false;
        abstractComponentCallbacksC0056x.A();
        if (!abstractComponentCallbacksC0056x.f1165D) {
            throw new AndroidRuntimeException("Fragment " + abstractComponentCallbacksC0056x + " did not call through to super.onStart()");
        }
        C0098v c0098v = abstractComponentCallbacksC0056x.f1174N;
        EnumC0091n enumC0091n = EnumC0091n.ON_START;
        c0098v.d(enumC0091n);
        if (abstractComponentCallbacksC0056x.f1167F != null) {
            abstractComponentCallbacksC0056x.f1175O.d.d(enumC0091n);
        }
        S s2 = abstractComponentCallbacksC0056x.f1199u;
        s2.f996F = false;
        s2.G = false;
        s2.f1002M.f1038g = false;
        s2.t(5);
        this.f1050a.n(false);
    }

    public final void r() {
        boolean H2 = S.H(3);
        AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x = this.f1052c;
        if (H2) {
            Log.d("FragmentManager", "movefrom STARTED: " + abstractComponentCallbacksC0056x);
        }
        S s2 = abstractComponentCallbacksC0056x.f1199u;
        s2.G = true;
        s2.f1002M.f1038g = true;
        s2.t(4);
        if (abstractComponentCallbacksC0056x.f1167F != null) {
            abstractComponentCallbacksC0056x.f1175O.e(EnumC0091n.ON_STOP);
        }
        abstractComponentCallbacksC0056x.f1174N.d(EnumC0091n.ON_STOP);
        abstractComponentCallbacksC0056x.f1182a = 4;
        abstractComponentCallbacksC0056x.f1165D = false;
        abstractComponentCallbacksC0056x.B();
        if (abstractComponentCallbacksC0056x.f1165D) {
            this.f1050a.o(false);
            return;
        }
        throw new AndroidRuntimeException("Fragment " + abstractComponentCallbacksC0056x + " did not call through to super.onStop()");
    }

    public Y(C.j jVar, U.v vVar, ClassLoader classLoader, K k2, Bundle bundle) {
        this.f1050a = jVar;
        this.f1051b = vVar;
        AbstractComponentCallbacksC0056x a2 = ((X) bundle.getParcelable("state")).a(k2);
        this.f1052c = a2;
        a2.f1183b = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        a2.K(bundle2);
        if (S.H(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a2);
        }
    }

    public Y(C.j jVar, U.v vVar, AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x, Bundle bundle) {
        this.f1050a = jVar;
        this.f1051b = vVar;
        this.f1052c = abstractComponentCallbacksC0056x;
        abstractComponentCallbacksC0056x.f1184c = null;
        abstractComponentCallbacksC0056x.d = null;
        abstractComponentCallbacksC0056x.f1196r = 0;
        abstractComponentCallbacksC0056x.f1193o = false;
        abstractComponentCallbacksC0056x.f1189k = false;
        AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x2 = abstractComponentCallbacksC0056x.f1187g;
        abstractComponentCallbacksC0056x.h = abstractComponentCallbacksC0056x2 != null ? abstractComponentCallbacksC0056x2.f1185e : null;
        abstractComponentCallbacksC0056x.f1187g = null;
        abstractComponentCallbacksC0056x.f1183b = bundle;
        abstractComponentCallbacksC0056x.f1186f = bundle.getBundle("arguments");
    }
}
