package o;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import p.AbstractC0308a;

/* loaded from: classes.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public int[] f3496a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f3497b;

    /* renamed from: c, reason: collision with root package name */
    public int f3498c;

    public j(int i) {
        this.f3496a = i == 0 ? AbstractC0308a.f3506a : new int[i];
        this.f3497b = i == 0 ? AbstractC0308a.f3507b : new Object[i << 1];
    }

    public final int a(Object obj) {
        int i = this.f3498c * 2;
        Object[] objArr = this.f3497b;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public final void b(int i) {
        int i2 = this.f3498c;
        int[] iArr = this.f3496a;
        if (iArr.length < i) {
            int[] copyOf = Arrays.copyOf(iArr, i);
            q1.d.d(copyOf, "copyOf(this, newSize)");
            this.f3496a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f3497b, i * 2);
            q1.d.d(copyOf2, "copyOf(this, newSize)");
            this.f3497b = copyOf2;
        }
        if (this.f3498c != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public final int c(int i, Object obj) {
        int i2 = this.f3498c;
        if (i2 == 0) {
            return -1;
        }
        int a2 = AbstractC0308a.a(i2, i, this.f3496a);
        if (a2 < 0 || q1.d.a(obj, this.f3497b[a2 << 1])) {
            return a2;
        }
        int i3 = a2 + 1;
        while (i3 < i2 && this.f3496a[i3] == i) {
            if (q1.d.a(obj, this.f3497b[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = a2 - 1; i4 >= 0 && this.f3496a[i4] == i; i4--) {
            if (q1.d.a(obj, this.f3497b[i4 << 1])) {
                return i4;
            }
        }
        return ~i3;
    }

    public final void clear() {
        if (this.f3498c > 0) {
            this.f3496a = AbstractC0308a.f3506a;
            this.f3497b = AbstractC0308a.f3507b;
            this.f3498c = 0;
        }
        if (this.f3498c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return d(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return a(obj) >= 0;
    }

    public final int d(Object obj) {
        return obj == null ? e() : c(obj.hashCode(), obj);
    }

    public final int e() {
        int i = this.f3498c;
        if (i == 0) {
            return -1;
        }
        int a2 = AbstractC0308a.a(i, 0, this.f3496a);
        if (a2 < 0 || this.f3497b[a2 << 1] == null) {
            return a2;
        }
        int i2 = a2 + 1;
        while (i2 < i && this.f3496a[i2] == 0) {
            if (this.f3497b[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = a2 - 1; i3 >= 0 && this.f3496a[i3] == 0; i3--) {
            if (this.f3497b[i3 << 1] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof j) {
                int i = this.f3498c;
                if (i != ((j) obj).f3498c) {
                    return false;
                }
                j jVar = (j) obj;
                for (int i2 = 0; i2 < i; i2++) {
                    Object f2 = f(i2);
                    Object i3 = i(i2);
                    Object obj2 = jVar.get(f2);
                    if (i3 == null) {
                        if (obj2 != null || !jVar.containsKey(f2)) {
                            return false;
                        }
                    } else if (!i3.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.f3498c != ((Map) obj).size()) {
                return false;
            }
            int i4 = this.f3498c;
            for (int i5 = 0; i5 < i4; i5++) {
                Object f3 = f(i5);
                Object i6 = i(i5);
                Object obj3 = ((Map) obj).get(f3);
                if (i6 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(f3)) {
                        return false;
                    }
                } else if (!i6.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final Object f(int i) {
        if (i < 0 || i >= this.f3498c) {
            throw new IllegalArgumentException(D.f.b("Expected index to be within 0..size()-1, but was ", i).toString());
        }
        return this.f3497b[i << 1];
    }

    public final Object g(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f3498c)) {
            throw new IllegalArgumentException(D.f.b("Expected index to be within 0..size()-1, but was ", i).toString());
        }
        Object[] objArr = this.f3497b;
        int i3 = i << 1;
        Object obj = objArr[i3 + 1];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i4 = i2 - 1;
        int[] iArr = this.f3496a;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i4) {
                int i5 = i + 1;
                j1.i.i0(i, i5, i2, iArr, iArr);
                Object[] objArr2 = this.f3497b;
                j1.i.j0(objArr2, objArr2, i3, i5 << 1, i2 << 1);
            }
            Object[] objArr3 = this.f3497b;
            int i6 = i4 << 1;
            objArr3[i6] = null;
            objArr3[i6 + 1] = null;
        } else {
            int i7 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            int[] copyOf = Arrays.copyOf(iArr, i7);
            q1.d.d(copyOf, "copyOf(this, newSize)");
            this.f3496a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f3497b, i7 << 1);
            q1.d.d(copyOf2, "copyOf(this, newSize)");
            this.f3497b = copyOf2;
            if (i2 != this.f3498c) {
                throw new ConcurrentModificationException();
            }
            if (i > 0) {
                j1.i.i0(0, 0, i, iArr, this.f3496a);
                j1.i.j0(objArr, this.f3497b, 0, 0, i3);
            }
            if (i < i4) {
                int i8 = i + 1;
                j1.i.i0(i, i8, i2, iArr, this.f3496a);
                j1.i.j0(objArr, this.f3497b, i3, i8 << 1, i2 << 1);
            }
        }
        if (i2 != this.f3498c) {
            throw new ConcurrentModificationException();
        }
        this.f3498c = i4;
        return obj;
    }

    public Object get(Object obj) {
        int d = d(obj);
        if (d >= 0) {
            return this.f3497b[(d << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int d = d(obj);
        return d >= 0 ? this.f3497b[(d << 1) + 1] : obj2;
    }

    public final Object h(int i, Object obj) {
        if (i < 0 || i >= this.f3498c) {
            throw new IllegalArgumentException(D.f.b("Expected index to be within 0..size()-1, but was ", i).toString());
        }
        int i2 = (i << 1) + 1;
        Object[] objArr = this.f3497b;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    public final int hashCode() {
        int[] iArr = this.f3496a;
        Object[] objArr = this.f3497b;
        int i = this.f3498c;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            i4 += (obj != null ? obj.hashCode() : 0) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    public final Object i(int i) {
        if (i < 0 || i >= this.f3498c) {
            throw new IllegalArgumentException(D.f.b("Expected index to be within 0..size()-1, but was ", i).toString());
        }
        return this.f3497b[(i << 1) + 1];
    }

    public final boolean isEmpty() {
        return this.f3498c <= 0;
    }

    public final Object put(Object obj, Object obj2) {
        int i = this.f3498c;
        int hashCode = obj != null ? obj.hashCode() : 0;
        int c2 = obj != null ? c(hashCode, obj) : e();
        if (c2 >= 0) {
            int i2 = (c2 << 1) + 1;
            Object[] objArr = this.f3497b;
            Object obj3 = objArr[i2];
            objArr[i2] = obj2;
            return obj3;
        }
        int i3 = ~c2;
        int[] iArr = this.f3496a;
        if (i >= iArr.length) {
            int i4 = 8;
            if (i >= 8) {
                i4 = (i >> 1) + i;
            } else if (i < 4) {
                i4 = 4;
            }
            int[] copyOf = Arrays.copyOf(iArr, i4);
            q1.d.d(copyOf, "copyOf(this, newSize)");
            this.f3496a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f3497b, i4 << 1);
            q1.d.d(copyOf2, "copyOf(this, newSize)");
            this.f3497b = copyOf2;
            if (i != this.f3498c) {
                throw new ConcurrentModificationException();
            }
        }
        if (i3 < i) {
            int[] iArr2 = this.f3496a;
            int i5 = i3 + 1;
            j1.i.i0(i5, i3, i, iArr2, iArr2);
            Object[] objArr2 = this.f3497b;
            j1.i.j0(objArr2, objArr2, i5 << 1, i3 << 1, this.f3498c << 1);
        }
        int i6 = this.f3498c;
        if (i == i6) {
            int[] iArr3 = this.f3496a;
            if (i3 < iArr3.length) {
                iArr3[i3] = hashCode;
                Object[] objArr3 = this.f3497b;
                int i7 = i3 << 1;
                objArr3[i7] = obj;
                objArr3[i7 + 1] = obj2;
                this.f3498c = i6 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public Object remove(Object obj) {
        int d = d(obj);
        if (d >= 0) {
            return g(d);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int d = d(obj);
        if (d >= 0) {
            return h(d, obj2);
        }
        return null;
    }

    public final int size() {
        return this.f3498c;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f3498c * 28);
        sb.append('{');
        int i = this.f3498c;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object f2 = f(i2);
            if (f2 != sb) {
                sb.append(f2);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object i3 = i(i2);
            if (i3 != sb) {
                sb.append(i3);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        q1.d.d(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    public final boolean remove(Object obj, Object obj2) {
        int d = d(obj);
        if (d < 0 || !q1.d.a(obj2, i(d))) {
            return false;
        }
        g(d);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int d = d(obj);
        if (d < 0 || !q1.d.a(obj2, i(d))) {
            return false;
        }
        h(d, obj3);
        return true;
    }
}
