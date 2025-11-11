package u;

import java.util.ArrayList;

/* renamed from: u.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0355l {

    /* renamed from: a, reason: collision with root package name */
    public AbstractC0358o f3915a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f3916b;

    public static long a(C0349f c0349f, long j2) {
        AbstractC0358o abstractC0358o = c0349f.d;
        if (abstractC0358o instanceof C0353j) {
            return j2;
        }
        ArrayList arrayList = c0349f.f3910k;
        int size = arrayList.size();
        long j3 = j2;
        for (int i = 0; i < size; i++) {
            InterfaceC0347d interfaceC0347d = (InterfaceC0347d) arrayList.get(i);
            if (interfaceC0347d instanceof C0349f) {
                C0349f c0349f2 = (C0349f) interfaceC0347d;
                if (c0349f2.d != abstractC0358o) {
                    j3 = Math.min(j3, a(c0349f2, c0349f2.f3907f + j2));
                }
            }
        }
        if (c0349f != abstractC0358o.i) {
            return j3;
        }
        long j4 = abstractC0358o.j();
        long j5 = j2 - j4;
        return Math.min(Math.min(j3, a(abstractC0358o.h, j5)), j5 - r9.f3907f);
    }

    public static long b(C0349f c0349f, long j2) {
        AbstractC0358o abstractC0358o = c0349f.d;
        if (abstractC0358o instanceof C0353j) {
            return j2;
        }
        ArrayList arrayList = c0349f.f3910k;
        int size = arrayList.size();
        long j3 = j2;
        for (int i = 0; i < size; i++) {
            InterfaceC0347d interfaceC0347d = (InterfaceC0347d) arrayList.get(i);
            if (interfaceC0347d instanceof C0349f) {
                C0349f c0349f2 = (C0349f) interfaceC0347d;
                if (c0349f2.d != abstractC0358o) {
                    j3 = Math.max(j3, b(c0349f2, c0349f2.f3907f + j2));
                }
            }
        }
        if (c0349f != abstractC0358o.h) {
            return j3;
        }
        long j4 = abstractC0358o.j();
        long j5 = j2 + j4;
        return Math.max(Math.max(j3, b(abstractC0358o.i, j5)), j5 - r9.f3907f);
    }
}
