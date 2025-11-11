package o;

import java.util.Arrays;
import p.AbstractC0308a;

/* loaded from: classes.dex */
public final class k implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f3499a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ int[] f3500b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object[] f3501c;
    public /* synthetic */ int d;

    public k(int i) {
        int i2;
        int i3 = 4;
        while (true) {
            i2 = 40;
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (40 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 4;
        this.f3500b = new int[i5];
        this.f3501c = new Object[i5];
    }

    public final void a(int i, Object obj) {
        int i2 = this.d;
        if (i2 != 0 && i <= this.f3500b[i2 - 1]) {
            d(i, obj);
            return;
        }
        if (this.f3499a && i2 >= this.f3500b.length) {
            i.a(this);
        }
        int i3 = this.d;
        if (i3 >= this.f3500b.length) {
            int i4 = (i3 + 1) * 4;
            int i5 = 4;
            while (true) {
                if (i5 >= 32) {
                    break;
                }
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                }
                i5++;
            }
            int i7 = i4 / 4;
            int[] copyOf = Arrays.copyOf(this.f3500b, i7);
            q1.d.d(copyOf, "copyOf(this, newSize)");
            this.f3500b = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f3501c, i7);
            q1.d.d(copyOf2, "copyOf(this, newSize)");
            this.f3501c = copyOf2;
        }
        this.f3500b[i3] = i;
        this.f3501c[i3] = obj;
        this.d = i3 + 1;
    }

    public final Object b(int i) {
        Object obj;
        int a2 = AbstractC0308a.a(this.d, i, this.f3500b);
        if (a2 < 0 || (obj = this.f3501c[a2]) == i.f3495b) {
            return null;
        }
        return obj;
    }

    public final int c(int i) {
        if (this.f3499a) {
            i.a(this);
        }
        return this.f3500b[i];
    }

    public final Object clone() {
        Object clone = super.clone();
        q1.d.c(clone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        k kVar = (k) clone;
        kVar.f3500b = (int[]) this.f3500b.clone();
        kVar.f3501c = (Object[]) this.f3501c.clone();
        return kVar;
    }

    public final void d(int i, Object obj) {
        int a2 = AbstractC0308a.a(this.d, i, this.f3500b);
        if (a2 >= 0) {
            this.f3501c[a2] = obj;
            return;
        }
        int i2 = ~a2;
        int i3 = this.d;
        if (i2 < i3) {
            Object[] objArr = this.f3501c;
            if (objArr[i2] == i.f3495b) {
                this.f3500b[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (this.f3499a && i3 >= this.f3500b.length) {
            i.a(this);
            i2 = ~AbstractC0308a.a(this.d, i, this.f3500b);
        }
        int i4 = this.d;
        if (i4 >= this.f3500b.length) {
            int i5 = (i4 + 1) * 4;
            int i6 = 4;
            while (true) {
                if (i6 >= 32) {
                    break;
                }
                int i7 = (1 << i6) - 12;
                if (i5 <= i7) {
                    i5 = i7;
                    break;
                }
                i6++;
            }
            int i8 = i5 / 4;
            int[] copyOf = Arrays.copyOf(this.f3500b, i8);
            q1.d.d(copyOf, "copyOf(this, newSize)");
            this.f3500b = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f3501c, i8);
            q1.d.d(copyOf2, "copyOf(this, newSize)");
            this.f3501c = copyOf2;
        }
        int i9 = this.d;
        if (i9 - i2 != 0) {
            int[] iArr = this.f3500b;
            int i10 = i2 + 1;
            j1.i.i0(i10, i2, i9, iArr, iArr);
            Object[] objArr2 = this.f3501c;
            j1.i.j0(objArr2, objArr2, i10, i2, this.d);
        }
        this.f3500b[i2] = i;
        this.f3501c[i2] = obj;
        this.d++;
    }

    public final int e() {
        if (this.f3499a) {
            i.a(this);
        }
        return this.d;
    }

    public final Object f(int i) {
        if (this.f3499a) {
            i.a(this);
        }
        return this.f3501c[i];
    }

    public final String toString() {
        if (e() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.d * 28);
        sb.append('{');
        int i = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(c(i2));
            sb.append('=');
            Object f2 = f(i2);
            if (f2 != this) {
                sb.append(f2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        q1.d.d(sb2, "buffer.toString()");
        return sb2;
    }
}
