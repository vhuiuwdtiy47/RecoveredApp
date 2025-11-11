package Y;

import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import r.AbstractC0319e;

/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public int f1101a;

    /* renamed from: b, reason: collision with root package name */
    public int f1102b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractComponentCallbacksC0056x f1103c;
    public final ArrayList d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f1104e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1105f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1106g;
    public final Y h;

    public d0(int i, int i2, Y y2, H.d dVar) {
        D.f.f("finalState", i);
        D.f.f("lifecycleImpact", i2);
        AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x = y2.f1052c;
        q1.d.d(abstractComponentCallbacksC0056x, "fragmentStateManager.fragment");
        D.f.f("finalState", i);
        D.f.f("lifecycleImpact", i2);
        q1.d.e(abstractComponentCallbacksC0056x, "fragment");
        this.f1101a = i;
        this.f1102b = i2;
        this.f1103c = abstractComponentCallbacksC0056x;
        this.d = new ArrayList();
        this.f1104e = new LinkedHashSet();
        dVar.a(new Q.b(this));
        this.h = y2;
    }

    public final void a() {
        if (this.f1105f) {
            return;
        }
        this.f1105f = true;
        if (this.f1104e.isEmpty()) {
            b();
            return;
        }
        LinkedHashSet linkedHashSet = this.f1104e;
        q1.d.e(linkedHashSet, "<this>");
        for (H.d dVar : new LinkedHashSet(linkedHashSet)) {
            synchronized (dVar) {
                try {
                    if (!dVar.f184a) {
                        dVar.f184a = true;
                        dVar.f186c = true;
                        H.c cVar = dVar.f185b;
                        if (cVar != null) {
                            try {
                                cVar.a();
                            } catch (Throwable th) {
                                synchronized (dVar) {
                                    dVar.f186c = false;
                                    dVar.notifyAll();
                                    throw th;
                                }
                            }
                        }
                        synchronized (dVar) {
                            dVar.f186c = false;
                            dVar.notifyAll();
                        }
                    }
                } finally {
                }
            }
        }
    }

    public final void b() {
        if (!this.f1106g) {
            if (S.H(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f1106g = true;
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        this.h.k();
    }

    public final void c(int i, int i2) {
        D.f.f("finalState", i);
        D.f.f("lifecycleImpact", i2);
        int a2 = AbstractC0319e.a(i2);
        AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x = this.f1103c;
        if (a2 == 0) {
            if (this.f1101a != 1) {
                if (S.H(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0056x + " mFinalState = " + D.f.i(this.f1101a) + " -> " + D.f.i(i) + '.');
                }
                this.f1101a = i;
                return;
            }
            return;
        }
        if (a2 == 1) {
            if (this.f1101a == 1) {
                if (S.H(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0056x + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + D.f.h(this.f1102b) + " to ADDING.");
                }
                this.f1101a = 2;
                this.f1102b = 2;
                return;
            }
            return;
        }
        if (a2 != 2) {
            return;
        }
        if (S.H(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0056x + " mFinalState = " + D.f.i(this.f1101a) + " -> REMOVED. mLifecycleImpact  = " + D.f.h(this.f1102b) + " to REMOVING.");
        }
        this.f1101a = 1;
        this.f1102b = 3;
    }

    public final void d() {
        int i = this.f1102b;
        Y y2 = this.h;
        if (i != 2) {
            if (i == 3) {
                AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x = y2.f1052c;
                q1.d.d(abstractComponentCallbacksC0056x, "fragmentStateManager.fragment");
                View I2 = abstractComponentCallbacksC0056x.I();
                if (S.H(2)) {
                    Log.v("FragmentManager", "Clearing focus " + I2.findFocus() + " on view " + I2 + " for Fragment " + abstractComponentCallbacksC0056x);
                }
                I2.clearFocus();
                return;
            }
            return;
        }
        AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x2 = y2.f1052c;
        q1.d.d(abstractComponentCallbacksC0056x2, "fragmentStateManager.fragment");
        View findFocus = abstractComponentCallbacksC0056x2.f1167F.findFocus();
        if (findFocus != null) {
            abstractComponentCallbacksC0056x2.f().f1160k = findFocus;
            if (S.H(2)) {
                Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + abstractComponentCallbacksC0056x2);
            }
        }
        View I3 = this.f1103c.I();
        if (I3.getParent() == null) {
            y2.b();
            I3.setAlpha(0.0f);
        }
        if (I3.getAlpha() == 0.0f && I3.getVisibility() == 0) {
            I3.setVisibility(4);
        }
        C0053u c0053u = abstractComponentCallbacksC0056x2.f1169I;
        I3.setAlpha(c0053u == null ? 1.0f : c0053u.f1159j);
    }

    public final String toString() {
        StringBuilder e2 = D.f.e("Operation {", Integer.toHexString(System.identityHashCode(this)), "} {finalState = ");
        e2.append(D.f.i(this.f1101a));
        e2.append(" lifecycleImpact = ");
        e2.append(D.f.h(this.f1102b));
        e2.append(" fragment = ");
        e2.append(this.f1103c);
        e2.append('}');
        return e2.toString();
    }
}
