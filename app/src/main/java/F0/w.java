package f0;

import L.C0016l;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import g0.AbstractC0150a;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class w extends v implements Iterable, r1.a {
    public static final /* synthetic */ int h = 0;

    /* renamed from: g, reason: collision with root package name */
    public final i0.e f2362g;

    public w(x xVar) {
        super(xVar);
        this.f2362g = new i0.e(this);
    }

    @Override // f0.v
    public final u d(C0016l c0016l) {
        u d = super.d(c0016l);
        i0.e eVar = this.f2362g;
        eVar.getClass();
        return eVar.b(d, c0016l, false, (w) eVar.f2622c);
    }

    @Override // f0.v
    public final void e(Context context, AttributeSet attributeSet) {
        String valueOf;
        super.e(context, attributeSet);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, AbstractC0150a.d);
        q1.d.d(obtainAttributes, "obtainAttributes(...)");
        int resourceId = obtainAttributes.getResourceId(0, 0);
        i0.e eVar = this.f2362g;
        w wVar = (w) eVar.f2622c;
        if (resourceId == wVar.f2359b.f2660a) {
            throw new IllegalArgumentException(("Start destination " + resourceId + " cannot use the same id as the graph " + wVar).toString());
        }
        eVar.f2620a = resourceId;
        eVar.f2621b = null;
        if (resourceId <= 16777215) {
            valueOf = String.valueOf(resourceId);
        } else {
            try {
                valueOf = context.getResources().getResourceName(resourceId);
                q1.d.b(valueOf);
            } catch (Resources.NotFoundException unused) {
                valueOf = String.valueOf(resourceId);
            }
        }
        eVar.f2621b = valueOf;
        obtainAttributes.recycle();
    }

    @Override // f0.v
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof w) || !super.equals(obj)) {
            return false;
        }
        i0.e eVar = this.f2362g;
        int e2 = ((o.k) eVar.d).e();
        i0.e eVar2 = ((w) obj).f2362g;
        if (e2 != ((o.k) eVar2.d).e() || eVar.f2620a != eVar2.f2620a) {
            return false;
        }
        o.k kVar = (o.k) eVar.d;
        q1.d.e(kVar, "<this>");
        for (v vVar : w1.f.x(new j1.c(1, kVar))) {
            if (!vVar.equals(((o.k) eVar2.d).b(vVar.f2359b.f2660a))) {
                return false;
            }
        }
        return true;
    }

    public final void f(v vVar) {
        q1.d.e(vVar, "node");
        i0.e eVar = this.f2362g;
        eVar.getClass();
        i0.l lVar = vVar.f2359b;
        int i = lVar.f2660a;
        String str = (String) lVar.d;
        if (i == 0 && str == null) {
            throw new IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
        }
        w wVar = (w) eVar.f2622c;
        String str2 = (String) wVar.f2359b.d;
        if (str2 != null && q1.d.a(str, str2)) {
            throw new IllegalArgumentException(("Destination " + vVar + " cannot have the same route as graph " + wVar).toString());
        }
        if (i == wVar.f2359b.f2660a) {
            throw new IllegalArgumentException(("Destination " + vVar + " cannot have the same id as graph " + wVar).toString());
        }
        o.k kVar = (o.k) eVar.d;
        v vVar2 = (v) kVar.b(i);
        if (vVar2 == vVar) {
            return;
        }
        if (vVar.f2360c != null) {
            throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
        }
        if (vVar2 != null) {
            vVar2.f2360c = null;
        }
        vVar.f2360c = wVar;
        kVar.d(lVar.f2660a, vVar);
    }

    public final v g(int i) {
        i0.e eVar = this.f2362g;
        return eVar.a(i, (w) eVar.f2622c, null, false);
    }

    public final u h(C0016l c0016l, v vVar) {
        q1.d.e(vVar, "lastVisited");
        return this.f2362g.b(super.d(c0016l), c0016l, true, vVar);
    }

    @Override // f0.v
    public final int hashCode() {
        i0.e eVar = this.f2362g;
        int i = eVar.f2620a;
        o.k kVar = (o.k) eVar.d;
        int e2 = kVar.e();
        for (int i2 = 0; i2 < e2; i2++) {
            i = (((i * 31) + kVar.c(i2)) * 31) + ((v) kVar.f(i2)).hashCode();
        }
        return i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        i0.e eVar = this.f2362g;
        eVar.getClass();
        return new i0.m(eVar);
    }

    @Override // f0.v
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        i0.e eVar = this.f2362g;
        eVar.getClass();
        eVar.getClass();
        v g2 = g(eVar.f2620a);
        sb.append(" startDestination=");
        if (g2 == null) {
            String str = eVar.f2621b;
            if (str != null) {
                sb.append(str);
            } else {
                sb.append("0x" + Integer.toHexString(eVar.f2620a));
            }
        } else {
            sb.append("{");
            sb.append(g2.toString());
            sb.append("}");
        }
        String sb2 = sb.toString();
        q1.d.d(sb2, "toString(...)");
        return sb2;
    }
}
