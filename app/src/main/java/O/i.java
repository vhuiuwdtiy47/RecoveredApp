package o;

import java.util.ConcurrentModificationException;
import p.AbstractC0308a;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f3494a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f3495b = new Object();

    public static final void a(k kVar) {
        int i = kVar.d;
        int[] iArr = kVar.f3500b;
        Object[] objArr = kVar.f3501c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f3495b) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        kVar.f3499a = false;
        kVar.d = i2;
    }

    public static final void b(g gVar, int i) {
        q1.d.e(gVar, "<this>");
        gVar.f3488a = new int[i];
        gVar.f3489b = new Object[i];
    }

    public static final int c(g gVar, Object obj, int i) {
        q1.d.e(gVar, "<this>");
        int i2 = gVar.f3490c;
        if (i2 == 0) {
            return -1;
        }
        try {
            int a2 = AbstractC0308a.a(gVar.f3490c, i, gVar.f3488a);
            if (a2 < 0 || q1.d.a(obj, gVar.f3489b[a2])) {
                return a2;
            }
            int i3 = a2 + 1;
            while (i3 < i2 && gVar.f3488a[i3] == i) {
                if (q1.d.a(obj, gVar.f3489b[i3])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = a2 - 1; i4 >= 0 && gVar.f3488a[i4] == i; i4--) {
                if (q1.d.a(obj, gVar.f3489b[i4])) {
                    return i4;
                }
            }
            return ~i3;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }
}
