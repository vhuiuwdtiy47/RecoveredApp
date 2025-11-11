package u;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import r.C0317c;
import t.C0326d;
import t.C0327e;

/* renamed from: u.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0357n {

    /* renamed from: f, reason: collision with root package name */
    public static int f3919f;

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f3920a;

    /* renamed from: b, reason: collision with root package name */
    public int f3921b;

    /* renamed from: c, reason: collision with root package name */
    public int f3922c;
    public ArrayList d;

    /* renamed from: e, reason: collision with root package name */
    public int f3923e;

    public final void a(ArrayList arrayList) {
        int size = this.f3920a.size();
        if (this.f3923e != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                C0357n c0357n = (C0357n) arrayList.get(i);
                if (this.f3923e == c0357n.f3921b) {
                    c(this.f3922c, c0357n);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(C0317c c0317c, int i) {
        int n2;
        int n3;
        ArrayList arrayList = this.f3920a;
        if (arrayList.size() == 0) {
            return 0;
        }
        C0327e c0327e = (C0327e) ((C0326d) arrayList.get(0)).f3707T;
        c0317c.t();
        c0327e.b(c0317c, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((C0326d) arrayList.get(i2)).b(c0317c, false);
        }
        if (i == 0 && c0327e.f3770z0 > 0) {
            t.j.a(c0327e, c0317c, arrayList, 0);
        }
        if (i == 1 && c0327e.f3752A0 > 0) {
            t.j.a(c0327e, c0317c, arrayList, 1);
        }
        try {
            c0317c.p();
        } catch (Exception e2) {
            System.err.println(e2.toString() + "\n" + Arrays.toString(e2.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
        }
        this.d = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            C0326d c0326d = (C0326d) arrayList.get(i3);
            T0.e eVar = new T0.e(19);
            new WeakReference(c0326d);
            C0317c.n(c0326d.f3696I);
            C0317c.n(c0326d.f3697J);
            C0317c.n(c0326d.f3698K);
            C0317c.n(c0326d.f3699L);
            C0317c.n(c0326d.f3700M);
            this.d.add(eVar);
        }
        if (i == 0) {
            n2 = C0317c.n(c0327e.f3696I);
            n3 = C0317c.n(c0327e.f3698K);
            c0317c.t();
        } else {
            n2 = C0317c.n(c0327e.f3697J);
            n3 = C0317c.n(c0327e.f3699L);
            c0317c.t();
        }
        return n3 - n2;
    }

    public final void c(int i, C0357n c0357n) {
        Iterator it = this.f3920a.iterator();
        while (it.hasNext()) {
            C0326d c0326d = (C0326d) it.next();
            ArrayList arrayList = c0357n.f3920a;
            if (!arrayList.contains(c0326d)) {
                arrayList.add(c0326d);
            }
            int i2 = c0357n.f3921b;
            if (i == 0) {
                c0326d.f3737n0 = i2;
            } else {
                c0326d.f3739o0 = i2;
            }
        }
        this.f3923e = c0357n.f3921b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.f3922c;
        sb.append(i == 0 ? "Horizontal" : i == 1 ? "Vertical" : i == 2 ? "Both" : "Unknown");
        sb.append(" [");
        sb.append(this.f3921b);
        sb.append("] <");
        String sb2 = sb.toString();
        Iterator it = this.f3920a.iterator();
        while (it.hasNext()) {
            sb2 = sb2 + " " + ((C0326d) it.next()).f3726h0;
        }
        return D.f.c(sb2, " >");
    }
}
