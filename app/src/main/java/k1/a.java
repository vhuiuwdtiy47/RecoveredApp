package k1;

import L.D;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class a extends D implements Iterator, r1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2909e;

    public a(c cVar, int i) {
        this.f2909e = i;
        q1.d.e(cVar, "map");
        this.d = cVar;
        this.f305b = -1;
        this.f306c = cVar.h;
        e();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f2909e) {
            case 0:
                b();
                int i = this.f304a;
                c cVar = (c) this.d;
                if (i >= cVar.f2917f) {
                    throw new NoSuchElementException();
                }
                this.f304a = i + 1;
                this.f305b = i;
                b bVar = new b(cVar, i);
                e();
                return bVar;
            case 1:
                b();
                int i2 = this.f304a;
                c cVar2 = (c) this.d;
                if (i2 >= cVar2.f2917f) {
                    throw new NoSuchElementException();
                }
                this.f304a = i2 + 1;
                this.f305b = i2;
                Object obj = cVar2.f2913a[i2];
                e();
                return obj;
            default:
                b();
                int i3 = this.f304a;
                c cVar3 = (c) this.d;
                if (i3 >= cVar3.f2917f) {
                    throw new NoSuchElementException();
                }
                this.f304a = i3 + 1;
                this.f305b = i3;
                Object[] objArr = cVar3.f2914b;
                q1.d.b(objArr);
                Object obj2 = objArr[this.f305b];
                e();
                return obj2;
        }
    }
}
