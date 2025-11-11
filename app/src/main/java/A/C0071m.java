package a;

import Y.I;
import java.util.ListIterator;

/* renamed from: a.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0071m extends q1.e implements p1.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1287b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v f1288c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0071m(v vVar, int i) {
        super(1);
        this.f1287b = i;
        this.f1288c = vVar;
    }

    @Override // p1.l
    public final Object c(Object obj) {
        Object obj2;
        Object obj3;
        switch (this.f1287b) {
            case 0:
                q1.d.e((C0060b) obj, "backEvent");
                v vVar = this.f1288c;
                j1.h hVar = vVar.f1308b;
                ListIterator listIterator = hVar.listIterator(hVar.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        obj2 = listIterator.previous();
                        if (((I) obj2).f974a) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                vVar.f1309c = (I) obj2;
                return i1.g.f2679c;
            default:
                q1.d.e((C0060b) obj, "backEvent");
                j1.h hVar2 = this.f1288c.f1308b;
                ListIterator listIterator2 = hVar2.listIterator(hVar2.size());
                while (true) {
                    if (listIterator2.hasPrevious()) {
                        obj3 = listIterator2.previous();
                        if (((I) obj3).f974a) {
                        }
                    } else {
                        obj3 = null;
                    }
                }
                return i1.g.f2679c;
        }
    }
}
