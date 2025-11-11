package a;

import Y.I;
import java.util.ListIterator;

/* renamed from: a.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0072n extends q1.e implements p1.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1289b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1290c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0072n(int i, Object obj) {
        super(0);
        this.f1289b = i;
        this.f1290c = obj;
    }

    @Override // p1.a
    public final Object a() {
        Object obj;
        switch (this.f1289b) {
            case 0:
                ((v) this.f1290c).a();
                return i1.g.f2679c;
            case 1:
                v vVar = (v) this.f1290c;
                j1.h hVar = vVar.f1308b;
                ListIterator listIterator = hVar.listIterator(hVar.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        obj = listIterator.previous();
                        if (((I) obj).f974a) {
                        }
                    } else {
                        obj = null;
                    }
                }
                vVar.f1309c = null;
                return i1.g.f2679c;
            case 2:
                ((v) this.f1290c).a();
                return i1.g.f2679c;
            default:
                return this.f1290c;
        }
    }
}
