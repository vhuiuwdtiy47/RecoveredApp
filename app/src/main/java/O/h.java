package o;

import java.util.Arrays;
import p.AbstractC0308a;

/* loaded from: classes.dex */
public final class h implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f3491a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ long[] f3492b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object[] f3493c;
    public /* synthetic */ int d;

    public h() {
        int i;
        int i2 = 4;
        while (true) {
            i = 80;
            if (i2 >= 32) {
                break;
            }
            int i3 = (1 << i2) - 12;
            if (80 <= i3) {
                i = i3;
                break;
            }
            i2++;
        }
        int i4 = i / 8;
        this.f3492b = new long[i4];
        this.f3493c = new Object[i4];
    }

    public final void a() {
        int i = this.d;
        Object[] objArr = this.f3493c;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.d = 0;
        this.f3491a = false;
    }

    public final Object b(long j2) {
        Object obj;
        int b2 = AbstractC0308a.b(this.f3492b, this.d, j2);
        if (b2 < 0 || (obj = this.f3493c[b2]) == i.f3494a) {
            return null;
        }
        return obj;
    }

    public final long c(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.d)) {
            throw new IllegalArgumentException(D.f.b("Expected index to be within 0..size()-1, but was ", i).toString());
        }
        if (this.f3491a) {
            long[] jArr = this.f3492b;
            Object[] objArr = this.f3493c;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != i.f3494a) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.f3491a = false;
            this.d = i3;
        }
        return this.f3492b[i];
    }

    public final Object clone() {
        Object clone = super.clone();
        q1.d.c(clone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        h hVar = (h) clone;
        hVar.f3492b = (long[]) this.f3492b.clone();
        hVar.f3493c = (Object[]) this.f3493c.clone();
        return hVar;
    }

    public final void d(long j2, Object obj) {
        int b2 = AbstractC0308a.b(this.f3492b, this.d, j2);
        if (b2 >= 0) {
            this.f3493c[b2] = obj;
            return;
        }
        int i = ~b2;
        int i2 = this.d;
        Object obj2 = i.f3494a;
        if (i < i2) {
            Object[] objArr = this.f3493c;
            if (objArr[i] == obj2) {
                this.f3492b[i] = j2;
                objArr[i] = obj;
                return;
            }
        }
        if (this.f3491a) {
            long[] jArr = this.f3492b;
            if (i2 >= jArr.length) {
                Object[] objArr2 = this.f3493c;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    Object obj3 = objArr2[i4];
                    if (obj3 != obj2) {
                        if (i4 != i3) {
                            jArr[i3] = jArr[i4];
                            objArr2[i3] = obj3;
                            objArr2[i4] = null;
                        }
                        i3++;
                    }
                }
                this.f3491a = false;
                this.d = i3;
                i = ~AbstractC0308a.b(this.f3492b, i3, j2);
            }
        }
        int i5 = this.d;
        if (i5 >= this.f3492b.length) {
            int i6 = (i5 + 1) * 8;
            int i7 = 4;
            while (true) {
                if (i7 >= 32) {
                    break;
                }
                int i8 = (1 << i7) - 12;
                if (i6 <= i8) {
                    i6 = i8;
                    break;
                }
                i7++;
            }
            int i9 = i6 / 8;
            long[] copyOf = Arrays.copyOf(this.f3492b, i9);
            q1.d.d(copyOf, "copyOf(this, newSize)");
            this.f3492b = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f3493c, i9);
            q1.d.d(copyOf2, "copyOf(this, newSize)");
            this.f3493c = copyOf2;
        }
        int i10 = this.d - i;
        if (i10 != 0) {
            long[] jArr2 = this.f3492b;
            int i11 = i + 1;
            q1.d.e(jArr2, "<this>");
            System.arraycopy(jArr2, i, jArr2, i11, i10);
            Object[] objArr3 = this.f3493c;
            j1.i.j0(objArr3, objArr3, i11, i, this.d);
        }
        this.f3492b[i] = j2;
        this.f3493c[i] = obj;
        this.d++;
    }

    public final int e() {
        if (this.f3491a) {
            int i = this.d;
            long[] jArr = this.f3492b;
            Object[] objArr = this.f3493c;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != i.f3494a) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.f3491a = false;
            this.d = i2;
        }
        return this.d;
    }

    public final Object f(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.d)) {
            throw new IllegalArgumentException(D.f.b("Expected index to be within 0..size()-1, but was ", i).toString());
        }
        if (this.f3491a) {
            long[] jArr = this.f3492b;
            Object[] objArr = this.f3493c;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != i.f3494a) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.f3491a = false;
            this.d = i3;
        }
        return this.f3493c[i];
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
            if (f2 != sb) {
                sb.append(f2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        q1.d.d(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }
}
