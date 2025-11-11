package o;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import p.AbstractC0308a;

/* loaded from: classes.dex */
public final class g implements Collection, Set, r1.b {

    /* renamed from: a, reason: collision with root package name */
    public int[] f3488a = AbstractC0308a.f3506a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f3489b = AbstractC0308a.f3507b;

    /* renamed from: c, reason: collision with root package name */
    public int f3490c;

    public g(int i) {
        if (i > 0) {
            i.b(this, i);
        }
    }

    public final Object a(int i) {
        int i2 = this.f3490c;
        Object[] objArr = this.f3489b;
        Object obj = objArr[i];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i3 = i2 - 1;
        int[] iArr = this.f3488a;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i3) {
                int i4 = i + 1;
                j1.i.i0(i, i4, i2, iArr, iArr);
                Object[] objArr2 = this.f3489b;
                j1.i.j0(objArr2, objArr2, i, i4, i2);
            }
            this.f3489b[i3] = null;
        } else {
            i.b(this, i2 > 8 ? i2 + (i2 >> 1) : 8);
            if (i > 0) {
                j1.i.i0(0, 0, i, iArr, this.f3488a);
                j1.i.k0(objArr, this.f3489b, 0, i, 6);
            }
            if (i < i3) {
                int i5 = i + 1;
                j1.i.i0(i, i5, i2, iArr, this.f3488a);
                j1.i.j0(objArr, this.f3489b, i, i5, i2);
            }
        }
        if (i2 != this.f3490c) {
            throw new ConcurrentModificationException();
        }
        this.f3490c = i3;
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i;
        int c2;
        int i2 = this.f3490c;
        if (obj == null) {
            c2 = i.c(this, null, 0);
            i = 0;
        } else {
            int hashCode = obj.hashCode();
            i = hashCode;
            c2 = i.c(this, obj, hashCode);
        }
        if (c2 >= 0) {
            return false;
        }
        int i3 = ~c2;
        int[] iArr = this.f3488a;
        if (i2 >= iArr.length) {
            int i4 = 8;
            if (i2 >= 8) {
                i4 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i4 = 4;
            }
            Object[] objArr = this.f3489b;
            i.b(this, i4);
            if (i2 != this.f3490c) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f3488a;
            if (iArr2.length != 0) {
                j1.i.i0(0, 0, iArr.length, iArr, iArr2);
                j1.i.k0(objArr, this.f3489b, 0, objArr.length, 6);
            }
        }
        if (i3 < i2) {
            int[] iArr3 = this.f3488a;
            int i5 = i3 + 1;
            j1.i.i0(i5, i3, i2, iArr3, iArr3);
            Object[] objArr2 = this.f3489b;
            j1.i.j0(objArr2, objArr2, i5, i3, i2);
        }
        int i6 = this.f3490c;
        if (i2 == i6) {
            int[] iArr4 = this.f3488a;
            if (i3 < iArr4.length) {
                iArr4[i3] = i;
                this.f3489b[i3] = obj;
                this.f3490c = i6 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        q1.d.e(collection, "elements");
        int size = collection.size() + this.f3490c;
        int i = this.f3490c;
        int[] iArr = this.f3488a;
        boolean z2 = false;
        if (iArr.length < size) {
            Object[] objArr = this.f3489b;
            i.b(this, size);
            int i2 = this.f3490c;
            if (i2 > 0) {
                j1.i.i0(0, 0, i2, iArr, this.f3488a);
                j1.i.k0(objArr, this.f3489b, 0, this.f3490c, 6);
            }
        }
        if (this.f3490c != i) {
            throw new ConcurrentModificationException();
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            z2 |= add(it.next());
        }
        return z2;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f3490c != 0) {
            this.f3488a = AbstractC0308a.f3506a;
            this.f3489b = AbstractC0308a.f3507b;
            this.f3490c = 0;
        }
        if (this.f3490c != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? i.c(this, null, 0) : i.c(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        q1.d.e(collection, "elements");
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.f3490c != ((Set) obj).size()) {
            return false;
        }
        try {
            int i = this.f3490c;
            for (int i2 = 0; i2 < i; i2++) {
                if (!((Set) obj).contains(this.f3489b[i2])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f3488a;
        int i = this.f3490c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f3490c <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new b(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int c2 = obj == null ? i.c(this, null, 0) : i.c(this, obj, obj.hashCode());
        if (c2 < 0) {
            return false;
        }
        a(c2);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        q1.d.e(collection, "elements");
        Iterator it = collection.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            z2 |= remove(it.next());
        }
        return z2;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        q1.d.e(collection, "elements");
        boolean z2 = false;
        for (int i = this.f3490c - 1; -1 < i; i--) {
            if (!j1.j.n0(collection, this.f3489b[i])) {
                a(i);
                z2 = true;
            }
        }
        return z2;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f3490c;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        Object[] objArr = this.f3489b;
        int i = this.f3490c;
        q1.d.e(objArr, "<this>");
        int length = objArr.length;
        if (i <= length) {
            Object[] copyOfRange = Arrays.copyOfRange(objArr, 0, i);
            q1.d.d(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i + ") is greater than size (" + length + ").");
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f3490c * 14);
        sb.append('{');
        int i = this.f3490c;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = this.f3489b[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        q1.d.d(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        q1.d.e(objArr, "array");
        int i = this.f3490c;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        } else if (objArr.length > i) {
            objArr[i] = null;
        }
        j1.i.j0(this.f3489b, objArr, 0, 0, this.f3490c);
        return objArr;
    }
}
