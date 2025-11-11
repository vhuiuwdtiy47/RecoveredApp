package L;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class D {

    /* renamed from: a, reason: collision with root package name */
    public int f304a;

    /* renamed from: b, reason: collision with root package name */
    public int f305b;

    /* renamed from: c, reason: collision with root package name */
    public int f306c;
    public Object d;

    public D() {
        if (T0.e.f666b == null) {
            T0.e.f666b = new T0.e(6);
        }
    }

    public int a(int i) {
        if (i < this.f306c) {
            return ((ByteBuffer) this.d).getShort(this.f305b + i);
        }
        return 0;
    }

    public void b() {
        if (((k1.c) this.d).h != this.f306c) {
            throw new ConcurrentModificationException();
        }
    }

    public abstract Object c(View view);

    public abstract void d(View view, Object obj);

    public void e() {
        while (true) {
            int i = this.f304a;
            k1.c cVar = (k1.c) this.d;
            if (i >= cVar.f2917f || cVar.f2915c[i] >= 0) {
                return;
            } else {
                this.f304a = i + 1;
            }
        }
    }

    public void f(View view, Object obj) {
        Object tag;
        if (Build.VERSION.SDK_INT >= this.f305b) {
            d(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.f305b) {
            tag = c(view);
        } else {
            tag = view.getTag(this.f304a);
            if (!((Class) this.d).isInstance(tag)) {
                tag = null;
            }
        }
        if (g(tag, obj)) {
            WeakHashMap weakHashMap = S.f311a;
            View.AccessibilityDelegate a2 = M.a(view);
            C0006b c0006b = a2 != null ? a2 instanceof C0005a ? ((C0005a) a2).f317a : new C0006b(a2) : null;
            if (c0006b == null) {
                c0006b = new C0006b();
            }
            S.h(view, c0006b);
            view.setTag(this.f304a, obj);
            S.d(view, this.f306c);
        }
    }

    public abstract boolean g(Object obj, Object obj2);

    public boolean hasNext() {
        return this.f304a < ((k1.c) this.d).f2917f;
    }

    public void remove() {
        b();
        if (this.f305b == -1) {
            throw new IllegalStateException("Call next() before removing element from the iterator.");
        }
        k1.c cVar = (k1.c) this.d;
        cVar.b();
        cVar.k(this.f305b);
        this.f305b = -1;
        this.f306c = cVar.h;
    }
}
