package s0;

import L.G;
import L.S;
import L.c0;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import l.AbstractC0271z;
import p.AbstractC0308a;

/* loaded from: classes.dex */
public abstract class l implements Cloneable {

    /* renamed from: w, reason: collision with root package name */
    public static final Animator[] f3614w = new Animator[0];

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f3615x = {2, 1, 3, 4};

    /* renamed from: y, reason: collision with root package name */
    public static final Z0.f f3616y = new Object();

    /* renamed from: z, reason: collision with root package name */
    public static final ThreadLocal f3617z = new ThreadLocal();

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f3625k;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f3626l;

    /* renamed from: m, reason: collision with root package name */
    public j[] f3627m;

    /* renamed from: a, reason: collision with root package name */
    public final String f3618a = getClass().getName();

    /* renamed from: b, reason: collision with root package name */
    public long f3619b = -1;

    /* renamed from: c, reason: collision with root package name */
    public long f3620c = -1;
    public TimeInterpolator d = null;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f3621e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f3622f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public U.v f3623g = new U.v(4);
    public U.v h = new U.v(4);
    public C0322a i = null;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f3624j = f3615x;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f3628n = new ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public Animator[] f3629o = f3614w;

    /* renamed from: p, reason: collision with root package name */
    public int f3630p = 0;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3631q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f3632r = false;

    /* renamed from: s, reason: collision with root package name */
    public l f3633s = null;

    /* renamed from: t, reason: collision with root package name */
    public ArrayList f3634t = null;

    /* renamed from: u, reason: collision with root package name */
    public ArrayList f3635u = new ArrayList();

    /* renamed from: v, reason: collision with root package name */
    public Z0.f f3636v = f3616y;

    public static void b(U.v vVar, View view, s sVar) {
        ((o.f) vVar.f790a).put(view, sVar);
        int id = view.getId();
        if (id >= 0) {
            SparseArray sparseArray = (SparseArray) vVar.f791b;
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap weakHashMap = S.f311a;
        String k2 = G.k(view);
        if (k2 != null) {
            o.f fVar = (o.f) vVar.d;
            if (fVar.containsKey(k2)) {
                fVar.put(k2, null);
            } else {
                fVar.put(k2, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                o.h hVar = (o.h) vVar.f792c;
                if (hVar.f3491a) {
                    int i = hVar.d;
                    long[] jArr = hVar.f3492b;
                    Object[] objArr = hVar.f3493c;
                    int i2 = 0;
                    for (int i3 = 0; i3 < i; i3++) {
                        Object obj = objArr[i3];
                        if (obj != o.i.f3494a) {
                            if (i3 != i2) {
                                jArr[i2] = jArr[i3];
                                objArr[i2] = obj;
                                objArr[i3] = null;
                            }
                            i2++;
                        }
                    }
                    hVar.f3491a = false;
                    hVar.d = i2;
                }
                if (AbstractC0308a.b(hVar.f3492b, hVar.d, itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    hVar.d(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) hVar.b(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    hVar.d(itemIdAtPosition, null);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [o.f, o.j, java.lang.Object] */
    public static o.f p() {
        ThreadLocal threadLocal = f3617z;
        o.f fVar = (o.f) threadLocal.get();
        if (fVar != null) {
            return fVar;
        }
        ?? jVar = new o.j(0);
        threadLocal.set(jVar);
        return jVar;
    }

    public static boolean u(s sVar, s sVar2, String str) {
        Object obj = sVar.f3646a.get(str);
        Object obj2 = sVar2.f3646a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public void A(long j2) {
        this.f3620c = j2;
    }

    public void B(AbstractC0271z abstractC0271z) {
    }

    public void C(TimeInterpolator timeInterpolator) {
        this.d = timeInterpolator;
    }

    public void D(Z0.f fVar) {
        if (fVar == null) {
            this.f3636v = f3616y;
        } else {
            this.f3636v = fVar;
        }
    }

    public void E() {
    }

    public void F(long j2) {
        this.f3619b = j2;
    }

    public final void G() {
        if (this.f3630p == 0) {
            v(this, k.f3610a);
            this.f3632r = false;
        }
        this.f3630p++;
    }

    public String H(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.f3620c != -1) {
            sb.append("dur(");
            sb.append(this.f3620c);
            sb.append(") ");
        }
        if (this.f3619b != -1) {
            sb.append("dly(");
            sb.append(this.f3619b);
            sb.append(") ");
        }
        if (this.d != null) {
            sb.append("interp(");
            sb.append(this.d);
            sb.append(") ");
        }
        ArrayList arrayList = this.f3621e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f3622f;
        if (size > 0 || arrayList2.size() > 0) {
            sb.append("tgts(");
            if (arrayList.size() > 0) {
                for (int i = 0; i < arrayList.size(); i++) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList.get(i));
                }
            }
            if (arrayList2.size() > 0) {
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList2.get(i2));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    public void a(j jVar) {
        if (this.f3634t == null) {
            this.f3634t = new ArrayList();
        }
        this.f3634t.add(jVar);
    }

    public void c() {
        ArrayList arrayList = this.f3628n;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f3629o);
        this.f3629o = f3614w;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.cancel();
        }
        this.f3629o = animatorArr;
        v(this, k.f3612c);
    }

    public abstract void d(s sVar);

    public final void e(View view, boolean z2) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            s sVar = new s(view);
            if (z2) {
                g(sVar);
            } else {
                d(sVar);
            }
            sVar.f3648c.add(this);
            f(sVar);
            if (z2) {
                b(this.f3623g, view, sVar);
            } else {
                b(this.h, view, sVar);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                e(viewGroup.getChildAt(i), z2);
            }
        }
    }

    public void f(s sVar) {
    }

    public abstract void g(s sVar);

    public final void h(ViewGroup viewGroup, boolean z2) {
        i(z2);
        ArrayList arrayList = this.f3621e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f3622f;
        if (size <= 0 && arrayList2.size() <= 0) {
            e(viewGroup, z2);
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            View findViewById = viewGroup.findViewById(((Integer) arrayList.get(i)).intValue());
            if (findViewById != null) {
                s sVar = new s(findViewById);
                if (z2) {
                    g(sVar);
                } else {
                    d(sVar);
                }
                sVar.f3648c.add(this);
                f(sVar);
                if (z2) {
                    b(this.f3623g, findViewById, sVar);
                } else {
                    b(this.h, findViewById, sVar);
                }
            }
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            View view = (View) arrayList2.get(i2);
            s sVar2 = new s(view);
            if (z2) {
                g(sVar2);
            } else {
                d(sVar2);
            }
            sVar2.f3648c.add(this);
            f(sVar2);
            if (z2) {
                b(this.f3623g, view, sVar2);
            } else {
                b(this.h, view, sVar2);
            }
        }
    }

    public final void i(boolean z2) {
        if (z2) {
            ((o.f) this.f3623g.f790a).clear();
            ((SparseArray) this.f3623g.f791b).clear();
            ((o.h) this.f3623g.f792c).a();
        } else {
            ((o.f) this.h.f790a).clear();
            ((SparseArray) this.h.f791b).clear();
            ((o.h) this.h.f792c).a();
        }
    }

    @Override // 
    /* renamed from: j */
    public l clone() {
        try {
            l lVar = (l) super.clone();
            lVar.f3635u = new ArrayList();
            lVar.f3623g = new U.v(4);
            lVar.h = new U.v(4);
            lVar.f3625k = null;
            lVar.f3626l = null;
            lVar.f3633s = this;
            lVar.f3634t = null;
            return lVar;
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    public Animator k(ViewGroup viewGroup, s sVar, s sVar2) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, s0.i] */
    public void l(ViewGroup viewGroup, U.v vVar, U.v vVar2, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        int i2;
        View view;
        s sVar;
        Animator animator;
        s sVar2;
        o.f p2 = p();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        o().getClass();
        int i3 = 0;
        while (i3 < size) {
            s sVar3 = (s) arrayList.get(i3);
            s sVar4 = (s) arrayList2.get(i3);
            if (sVar3 != null && !sVar3.f3648c.contains(this)) {
                sVar3 = null;
            }
            if (sVar4 != null && !sVar4.f3648c.contains(this)) {
                sVar4 = null;
            }
            if ((sVar3 != null || sVar4 != null) && (sVar3 == null || sVar4 == null || s(sVar3, sVar4))) {
                Animator k2 = k(viewGroup, sVar3, sVar4);
                if (k2 != null) {
                    String str = this.f3618a;
                    if (sVar4 != null) {
                        String[] q2 = q();
                        view = sVar4.f3647b;
                        if (q2 != null && q2.length > 0) {
                            sVar2 = new s(view);
                            s sVar5 = (s) ((o.f) vVar2.f790a).get(view);
                            i = size;
                            if (sVar5 != null) {
                                int i4 = 0;
                                while (i4 < q2.length) {
                                    HashMap hashMap = sVar2.f3646a;
                                    int i5 = i3;
                                    String str2 = q2[i4];
                                    hashMap.put(str2, sVar5.f3646a.get(str2));
                                    i4++;
                                    i3 = i5;
                                }
                            }
                            i2 = i3;
                            int i6 = p2.f3498c;
                            int i7 = 0;
                            while (true) {
                                if (i7 >= i6) {
                                    animator = k2;
                                    break;
                                }
                                i iVar = (i) p2.get((Animator) p2.f(i7));
                                if (iVar.f3607c != null && iVar.f3605a == view && iVar.f3606b.equals(str) && iVar.f3607c.equals(sVar2)) {
                                    animator = null;
                                    break;
                                }
                                i7++;
                            }
                        } else {
                            i = size;
                            i2 = i3;
                            animator = k2;
                            sVar2 = null;
                        }
                        k2 = animator;
                        sVar = sVar2;
                    } else {
                        i = size;
                        i2 = i3;
                        view = sVar3.f3647b;
                        sVar = null;
                    }
                    if (k2 != null) {
                        WindowId windowId = viewGroup.getWindowId();
                        ?? obj = new Object();
                        obj.f3605a = view;
                        obj.f3606b = str;
                        obj.f3607c = sVar;
                        obj.d = windowId;
                        obj.f3608e = this;
                        obj.f3609f = k2;
                        p2.put(k2, obj);
                        this.f3635u.add(k2);
                    }
                    i3 = i2 + 1;
                    size = i;
                }
            }
            i = size;
            i2 = i3;
            i3 = i2 + 1;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i8 = 0; i8 < sparseIntArray.size(); i8++) {
                i iVar2 = (i) p2.get((Animator) this.f3635u.get(sparseIntArray.keyAt(i8)));
                iVar2.f3609f.setStartDelay(iVar2.f3609f.getStartDelay() + (sparseIntArray.valueAt(i8) - Long.MAX_VALUE));
            }
        }
    }

    public final void m() {
        int i = this.f3630p - 1;
        this.f3630p = i;
        if (i == 0) {
            v(this, k.f3611b);
            for (int i2 = 0; i2 < ((o.h) this.f3623g.f792c).e(); i2++) {
                View view = (View) ((o.h) this.f3623g.f792c).f(i2);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i3 = 0; i3 < ((o.h) this.h.f792c).e(); i3++) {
                View view2 = (View) ((o.h) this.h.f792c).f(i3);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.f3632r = true;
        }
    }

    public final s n(View view, boolean z2) {
        C0322a c0322a = this.i;
        if (c0322a != null) {
            return c0322a.n(view, z2);
        }
        ArrayList arrayList = z2 ? this.f3625k : this.f3626l;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            s sVar = (s) arrayList.get(i);
            if (sVar == null) {
                return null;
            }
            if (sVar.f3647b == view) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return (s) (z2 ? this.f3626l : this.f3625k).get(i);
        }
        return null;
    }

    public final l o() {
        C0322a c0322a = this.i;
        return c0322a != null ? c0322a.o() : this;
    }

    public String[] q() {
        return null;
    }

    public final s r(View view, boolean z2) {
        C0322a c0322a = this.i;
        if (c0322a != null) {
            return c0322a.r(view, z2);
        }
        return (s) ((o.f) (z2 ? this.f3623g : this.h).f790a).get(view);
    }

    public boolean s(s sVar, s sVar2) {
        if (sVar != null && sVar2 != null) {
            String[] q2 = q();
            if (q2 != null) {
                for (String str : q2) {
                    if (u(sVar, sVar2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = sVar.f3646a.keySet().iterator();
                while (it.hasNext()) {
                    if (u(sVar, sVar2, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean t(View view) {
        int id = view.getId();
        ArrayList arrayList = this.f3621e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f3622f;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    public final String toString() {
        return H("");
    }

    public final void v(l lVar, k kVar) {
        l lVar2 = this.f3633s;
        if (lVar2 != null) {
            lVar2.v(lVar, kVar);
        }
        ArrayList arrayList = this.f3634t;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.f3634t.size();
        j[] jVarArr = this.f3627m;
        if (jVarArr == null) {
            jVarArr = new j[size];
        }
        this.f3627m = null;
        j[] jVarArr2 = (j[]) this.f3634t.toArray(jVarArr);
        for (int i = 0; i < size; i++) {
            kVar.a(jVarArr2[i], lVar);
            jVarArr2[i] = null;
        }
        this.f3627m = jVarArr2;
    }

    public void w(ViewGroup viewGroup) {
        if (this.f3632r) {
            return;
        }
        ArrayList arrayList = this.f3628n;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f3629o);
        this.f3629o = f3614w;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.pause();
        }
        this.f3629o = animatorArr;
        v(this, k.d);
        this.f3631q = true;
    }

    public l x(j jVar) {
        l lVar;
        ArrayList arrayList = this.f3634t;
        if (arrayList != null) {
            if (!arrayList.remove(jVar) && (lVar = this.f3633s) != null) {
                lVar.x(jVar);
            }
            if (this.f3634t.size() == 0) {
                this.f3634t = null;
            }
        }
        return this;
    }

    public void y(View view) {
        if (this.f3631q) {
            if (!this.f3632r) {
                ArrayList arrayList = this.f3628n;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f3629o);
                this.f3629o = f3614w;
                for (int i = size - 1; i >= 0; i--) {
                    Animator animator = animatorArr[i];
                    animatorArr[i] = null;
                    animator.resume();
                }
                this.f3629o = animatorArr;
                v(this, k.f3613e);
            }
            this.f3631q = false;
        }
    }

    public void z() {
        G();
        o.f p2 = p();
        Iterator it = this.f3635u.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (p2.containsKey(animator)) {
                G();
                if (animator != null) {
                    animator.addListener(new c0(this, p2));
                    long j2 = this.f3620c;
                    if (j2 >= 0) {
                        animator.setDuration(j2);
                    }
                    long j3 = this.f3619b;
                    if (j3 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j3);
                    }
                    TimeInterpolator timeInterpolator = this.d;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new A0.a(4, this));
                    animator.start();
                }
            }
        }
        this.f3635u.clear();
        m();
    }
}
