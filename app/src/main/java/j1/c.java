package j1;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public class c implements Iterator, r1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2741a;

    /* renamed from: b, reason: collision with root package name */
    public int f2742b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2743c;

    public /* synthetic */ c(int i, Object obj) {
        this.f2741a = i;
        this.f2743c = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f2741a) {
            case 0:
                return this.f2742b < ((f) this.f2743c).a();
            case 1:
                return this.f2742b < ((o.k) this.f2743c).e();
            default:
                return this.f2742b < ((Object[]) this.f2743c).length;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f2741a) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i = this.f2742b;
                this.f2742b = i + 1;
                return ((f) this.f2743c).get(i);
            case 1:
                int i2 = this.f2742b;
                this.f2742b = i2 + 1;
                return ((o.k) this.f2743c).f(i2);
            default:
                try {
                    Object[] objArr = (Object[]) this.f2743c;
                    int i3 = this.f2742b;
                    this.f2742b = i3 + 1;
                    return objArr[i3];
                } catch (ArrayIndexOutOfBoundsException e2) {
                    this.f2742b--;
                    throw new NoSuchElementException(e2.getMessage());
                }
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f2741a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public c(Object[] objArr) {
        this.f2741a = 2;
        q1.d.e(objArr, "array");
        this.f2743c = objArr;
    }
}
