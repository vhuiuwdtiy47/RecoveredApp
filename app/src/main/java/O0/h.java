package O0;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.MenuItem;
import k.E;
import k.o;
import k.y;
import s0.C0322a;
import s0.p;
import z0.C0385a;
import z0.C0386b;

/* loaded from: classes.dex */
public final class h implements y {

    /* renamed from: a, reason: collision with root package name */
    public C0.b f571a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f572b;

    /* renamed from: c, reason: collision with root package name */
    public int f573c;

    @Override // k.y
    public final void b(k.m mVar, boolean z2) {
    }

    @Override // k.y
    public final int c() {
        return this.f573c;
    }

    @Override // k.y
    public final boolean d(o oVar) {
        return false;
    }

    @Override // k.y
    public final boolean f(E e2) {
        return false;
    }

    @Override // k.y
    public final boolean h(o oVar) {
        return false;
    }

    @Override // k.y
    public final void i(Context context, k.m mVar) {
        this.f571a.f545E = mVar;
    }

    @Override // k.y
    public final boolean j() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Parcelable, java.lang.Object, O0.g] */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.util.SparseArray, M0.f] */
    @Override // k.y
    public final Parcelable k() {
        ?? obj = new Object();
        obj.f569a = this.f571a.getSelectedItemId();
        SparseArray<C0385a> badgeDrawables = this.f571a.getBadgeDrawables();
        ?? sparseArray = new SparseArray();
        for (int i = 0; i < badgeDrawables.size(); i++) {
            int keyAt = badgeDrawables.keyAt(i);
            C0385a valueAt = badgeDrawables.valueAt(i);
            sparseArray.put(keyAt, valueAt != null ? valueAt.f4232e.f4266a : null);
        }
        obj.f570b = sparseArray;
        return obj;
    }

    @Override // k.y
    public final void l(boolean z2) {
        C0322a c0322a;
        if (this.f572b) {
            return;
        }
        if (z2) {
            this.f571a.a();
            return;
        }
        C0.b bVar = this.f571a;
        k.m mVar = bVar.f545E;
        if (mVar == null || bVar.f550f == null) {
            return;
        }
        int size = mVar.f2842f.size();
        if (size != bVar.f550f.length) {
            bVar.a();
            return;
        }
        int i = bVar.f551g;
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = bVar.f545E.getItem(i2);
            if (item.isChecked()) {
                bVar.f551g = item.getItemId();
                bVar.h = i2;
            }
        }
        if (i != bVar.f551g && (c0322a = bVar.f546a) != null) {
            p.a(bVar, c0322a);
        }
        int i3 = bVar.f549e;
        boolean z3 = i3 != -1 ? i3 == 0 : bVar.f545E.l().size() > 3;
        for (int i4 = 0; i4 < size; i4++) {
            bVar.f544D.f572b = true;
            bVar.f550f[i4].setLabelVisibilityMode(bVar.f549e);
            bVar.f550f[i4].setShifting(z3);
            bVar.f550f[i4].a((o) bVar.f545E.getItem(i4));
            bVar.f544D.f572b = false;
        }
    }

    @Override // k.y
    public final void m(Parcelable parcelable) {
        SparseArray sparseArray;
        if (parcelable instanceof g) {
            C0.b bVar = this.f571a;
            g gVar = (g) parcelable;
            int i = gVar.f569a;
            int size = bVar.f545E.f2842f.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                MenuItem item = bVar.f545E.getItem(i2);
                if (i == item.getItemId()) {
                    bVar.f551g = i;
                    bVar.h = i2;
                    item.setChecked(true);
                    break;
                }
                i2++;
            }
            Context context = this.f571a.getContext();
            M0.f fVar = gVar.f570b;
            SparseArray sparseArray2 = new SparseArray(fVar.size());
            for (int i3 = 0; i3 < fVar.size(); i3++) {
                int keyAt = fVar.keyAt(i3);
                C0386b c0386b = (C0386b) fVar.valueAt(i3);
                sparseArray2.put(keyAt, c0386b != null ? new C0385a(context, c0386b) : null);
            }
            C0.b bVar2 = this.f571a;
            bVar2.getClass();
            int i4 = 0;
            while (true) {
                int size2 = sparseArray2.size();
                sparseArray = bVar2.f561s;
                if (i4 >= size2) {
                    break;
                }
                int keyAt2 = sparseArray2.keyAt(i4);
                if (sparseArray.indexOfKey(keyAt2) < 0) {
                    sparseArray.append(keyAt2, (C0385a) sparseArray2.get(keyAt2));
                }
                i4++;
            }
            c[] cVarArr = bVar2.f550f;
            if (cVarArr != null) {
                for (c cVar : cVarArr) {
                    C0385a c0385a = (C0385a) sparseArray.get(cVar.getId());
                    if (c0385a != null) {
                        cVar.setBadge(c0385a);
                    }
                }
            }
        }
    }
}
