package j1;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class h extends AbstractList implements List, r1.b {
    public static final Object[] d = new Object[0];

    /* renamed from: a, reason: collision with root package name */
    public int f2749a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f2750b;

    /* renamed from: c, reason: collision with root package name */
    public int f2751c;

    public h() {
        this.f2750b = d;
    }

    public final void a(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f2750b.length;
        while (i < length && it.hasNext()) {
            this.f2750b[i] = it.next();
            i++;
        }
        int i2 = this.f2749a;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.f2750b[i3] = it.next();
        }
        this.f2751c = collection.size() + this.f2751c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int i3 = this.f2751c;
        if (i < 0 || i > i3) {
            throw new IndexOutOfBoundsException("index: " + i + ", size: " + i3);
        }
        if (i == i3) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        j();
        b(this.f2751c + 1);
        int i4 = i(this.f2749a + i);
        int i5 = this.f2751c;
        if (i < ((i5 + 1) >> 1)) {
            if (i4 == 0) {
                Object[] objArr = this.f2750b;
                q1.d.e(objArr, "<this>");
                i4 = objArr.length;
            }
            int i6 = i4 - 1;
            int i7 = this.f2749a;
            if (i7 == 0) {
                Object[] objArr2 = this.f2750b;
                q1.d.e(objArr2, "<this>");
                i2 = objArr2.length - 1;
            } else {
                i2 = i7 - 1;
            }
            int i8 = this.f2749a;
            if (i6 >= i8) {
                Object[] objArr3 = this.f2750b;
                objArr3[i2] = objArr3[i8];
                i.j0(objArr3, objArr3, i8, i8 + 1, i6 + 1);
            } else {
                Object[] objArr4 = this.f2750b;
                i.j0(objArr4, objArr4, i8 - 1, i8, objArr4.length);
                Object[] objArr5 = this.f2750b;
                objArr5[objArr5.length - 1] = objArr5[0];
                i.j0(objArr5, objArr5, 0, 1, i6 + 1);
            }
            this.f2750b[i6] = obj;
            this.f2749a = i2;
        } else {
            int i9 = i(this.f2749a + i5);
            if (i4 < i9) {
                Object[] objArr6 = this.f2750b;
                i.j0(objArr6, objArr6, i4 + 1, i4, i9);
            } else {
                Object[] objArr7 = this.f2750b;
                i.j0(objArr7, objArr7, 1, 0, i9);
                Object[] objArr8 = this.f2750b;
                objArr8[0] = objArr8[objArr8.length - 1];
                i.j0(objArr8, objArr8, i4 + 1, i4, objArr8.length - 1);
            }
            this.f2750b[i4] = obj;
        }
        this.f2751c++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        q1.d.e(collection, "elements");
        int i2 = this.f2751c;
        if (i >= 0 && i <= i2) {
            if (collection.isEmpty()) {
                return false;
            }
            if (i == this.f2751c) {
                return addAll(collection);
            }
            j();
            b(collection.size() + this.f2751c);
            int i3 = i(this.f2749a + this.f2751c);
            int i4 = i(this.f2749a + i);
            int size = collection.size();
            if (i < ((this.f2751c + 1) >> 1)) {
                int i5 = this.f2749a;
                int i6 = i5 - size;
                if (i4 < i5) {
                    Object[] objArr = this.f2750b;
                    i.j0(objArr, objArr, i6, i5, objArr.length);
                    if (size >= i4) {
                        Object[] objArr2 = this.f2750b;
                        i.j0(objArr2, objArr2, objArr2.length - size, 0, i4);
                    } else {
                        Object[] objArr3 = this.f2750b;
                        i.j0(objArr3, objArr3, objArr3.length - size, 0, size);
                        Object[] objArr4 = this.f2750b;
                        i.j0(objArr4, objArr4, 0, size, i4);
                    }
                } else if (i6 >= 0) {
                    Object[] objArr5 = this.f2750b;
                    i.j0(objArr5, objArr5, i6, i5, i4);
                } else {
                    Object[] objArr6 = this.f2750b;
                    i6 += objArr6.length;
                    int i7 = i4 - i5;
                    int length = objArr6.length - i6;
                    if (length >= i7) {
                        i.j0(objArr6, objArr6, i6, i5, i4);
                    } else {
                        i.j0(objArr6, objArr6, i6, i5, i5 + length);
                        Object[] objArr7 = this.f2750b;
                        i.j0(objArr7, objArr7, 0, this.f2749a + length, i4);
                    }
                }
                this.f2749a = i6;
                a(g(i4 - size), collection);
                return true;
            }
            int i8 = i4 + size;
            if (i4 < i3) {
                int i9 = size + i3;
                Object[] objArr8 = this.f2750b;
                if (i9 <= objArr8.length) {
                    i.j0(objArr8, objArr8, i8, i4, i3);
                } else if (i8 >= objArr8.length) {
                    i.j0(objArr8, objArr8, i8 - objArr8.length, i4, i3);
                } else {
                    int length2 = i3 - (i9 - objArr8.length);
                    i.j0(objArr8, objArr8, 0, length2, i3);
                    Object[] objArr9 = this.f2750b;
                    i.j0(objArr9, objArr9, i8, i4, length2);
                }
            } else {
                Object[] objArr10 = this.f2750b;
                i.j0(objArr10, objArr10, size, 0, i3);
                Object[] objArr11 = this.f2750b;
                if (i8 >= objArr11.length) {
                    i.j0(objArr11, objArr11, i8 - objArr11.length, i4, objArr11.length);
                } else {
                    i.j0(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f2750b;
                    i.j0(objArr12, objArr12, i8, i4, objArr12.length - size);
                }
            }
            a(i4, collection);
            return true;
        }
        throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
    }

    public final void addFirst(Object obj) {
        j();
        b(this.f2751c + 1);
        int i = this.f2749a;
        if (i == 0) {
            Object[] objArr = this.f2750b;
            q1.d.e(objArr, "<this>");
            i = objArr.length;
        }
        int i2 = i - 1;
        this.f2749a = i2;
        this.f2750b[i2] = obj;
        this.f2751c++;
    }

    public final void addLast(Object obj) {
        j();
        b(this.f2751c + 1);
        this.f2750b[i(this.f2749a + this.f2751c)] = obj;
        this.f2751c++;
    }

    public final void b(int i) {
        if (i < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f2750b;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == d) {
            if (i < 10) {
                i = 10;
            }
            this.f2750b = new Object[i];
            return;
        }
        int length = objArr.length;
        int i2 = length + (length >> 1);
        if (i2 - i < 0) {
            i2 = i;
        }
        if (i2 - 2147483639 > 0) {
            i2 = i > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i2];
        i.j0(objArr, objArr2, 0, this.f2749a, objArr.length);
        Object[] objArr3 = this.f2750b;
        int length2 = objArr3.length;
        int i3 = this.f2749a;
        i.j0(objArr3, objArr2, length2 - i3, 0, i3);
        this.f2749a = 0;
        this.f2750b = objArr2;
    }

    public final Object c() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.f2750b[this.f2749a];
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            j();
            h(this.f2749a, i(this.f2749a + this.f2751c));
        }
        this.f2749a = 0;
        this.f2751c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final int d(int i) {
        q1.d.e(this.f2750b, "<this>");
        if (i == r1.length - 1) {
            return 0;
        }
        return i + 1;
    }

    public final Object e() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.f2750b[i(k.h0(this) + this.f2749a)];
    }

    public final Object f() {
        if (isEmpty()) {
            return null;
        }
        return this.f2750b[i(k.h0(this) + this.f2749a)];
    }

    public final int g(int i) {
        return i < 0 ? i + this.f2750b.length : i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int i2 = this.f2751c;
        if (i >= 0 && i < i2) {
            return this.f2750b[i(this.f2749a + i)];
        }
        throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
    }

    public final void h(int i, int i2) {
        if (i < i2) {
            Object[] objArr = this.f2750b;
            q1.d.e(objArr, "<this>");
            Arrays.fill(objArr, i, i2, (Object) null);
        } else {
            Object[] objArr2 = this.f2750b;
            Arrays.fill(objArr2, i, objArr2.length, (Object) null);
            Object[] objArr3 = this.f2750b;
            q1.d.e(objArr3, "<this>");
            Arrays.fill(objArr3, 0, i2, (Object) null);
        }
    }

    public final int i(int i) {
        Object[] objArr = this.f2750b;
        return i >= objArr.length ? i - objArr.length : i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int i2 = i(this.f2749a + this.f2751c);
        int i3 = this.f2749a;
        if (i3 < i2) {
            while (i3 < i2) {
                if (q1.d.a(obj, this.f2750b[i3])) {
                    i = this.f2749a;
                } else {
                    i3++;
                }
            }
            return -1;
        }
        if (i3 < i2) {
            return -1;
        }
        int length = this.f2750b.length;
        while (true) {
            if (i3 >= length) {
                for (int i4 = 0; i4 < i2; i4++) {
                    if (q1.d.a(obj, this.f2750b[i4])) {
                        i3 = i4 + this.f2750b.length;
                        i = this.f2749a;
                    }
                }
                return -1;
            }
            if (q1.d.a(obj, this.f2750b[i3])) {
                i = this.f2749a;
                break;
            }
            i3++;
        }
        return i3 - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f2751c == 0;
    }

    public final void j() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i;
        int i2 = i(this.f2749a + this.f2751c);
        int i3 = this.f2749a;
        if (i3 < i2) {
            length = i2 - 1;
            if (i3 <= length) {
                while (!q1.d.a(obj, this.f2750b[length])) {
                    if (length != i3) {
                        length--;
                    }
                }
                i = this.f2749a;
                return length - i;
            }
            return -1;
        }
        if (i3 > i2) {
            int i4 = i2 - 1;
            while (true) {
                if (-1 >= i4) {
                    Object[] objArr = this.f2750b;
                    q1.d.e(objArr, "<this>");
                    length = objArr.length - 1;
                    int i5 = this.f2749a;
                    if (i5 <= length) {
                        while (!q1.d.a(obj, this.f2750b[length])) {
                            if (length != i5) {
                                length--;
                            }
                        }
                        i = this.f2749a;
                    }
                } else {
                    if (q1.d.a(obj, this.f2750b[i4])) {
                        length = i4 + this.f2750b.length;
                        i = this.f2749a;
                        break;
                    }
                    i4--;
                }
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        int i2 = this.f2751c;
        if (i >= 0 && i < i2) {
            if (i == k.h0(this)) {
                return removeLast();
            }
            if (i == 0) {
                return removeFirst();
            }
            j();
            int i3 = i(this.f2749a + i);
            Object[] objArr = this.f2750b;
            Object obj = objArr[i3];
            if (i < (this.f2751c >> 1)) {
                int i4 = this.f2749a;
                if (i3 >= i4) {
                    i.j0(objArr, objArr, i4 + 1, i4, i3);
                } else {
                    i.j0(objArr, objArr, 1, 0, i3);
                    Object[] objArr2 = this.f2750b;
                    objArr2[0] = objArr2[objArr2.length - 1];
                    int i5 = this.f2749a;
                    i.j0(objArr2, objArr2, i5 + 1, i5, objArr2.length - 1);
                }
                Object[] objArr3 = this.f2750b;
                int i6 = this.f2749a;
                objArr3[i6] = null;
                this.f2749a = d(i6);
            } else {
                int i7 = i(k.h0(this) + this.f2749a);
                if (i3 <= i7) {
                    Object[] objArr4 = this.f2750b;
                    i.j0(objArr4, objArr4, i3, i3 + 1, i7 + 1);
                } else {
                    Object[] objArr5 = this.f2750b;
                    i.j0(objArr5, objArr5, i3, i3 + 1, objArr5.length);
                    Object[] objArr6 = this.f2750b;
                    objArr6[objArr6.length - 1] = objArr6[0];
                    i.j0(objArr6, objArr6, 0, 1, i7 + 1);
                }
                this.f2750b[i7] = null;
            }
            this.f2751c--;
            return obj;
        }
        throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int i;
        q1.d.e(collection, "elements");
        boolean z2 = false;
        z2 = false;
        z2 = false;
        if (!isEmpty() && this.f2750b.length != 0) {
            int i2 = i(this.f2749a + this.f2751c);
            int i3 = this.f2749a;
            if (i3 < i2) {
                i = i3;
                while (i3 < i2) {
                    Object obj = this.f2750b[i3];
                    if (collection.contains(obj)) {
                        z2 = true;
                    } else {
                        this.f2750b[i] = obj;
                        i++;
                    }
                    i3++;
                }
                Object[] objArr = this.f2750b;
                q1.d.e(objArr, "<this>");
                Arrays.fill(objArr, i, i2, (Object) null);
            } else {
                int length = this.f2750b.length;
                boolean z3 = false;
                int i4 = i3;
                while (i3 < length) {
                    Object[] objArr2 = this.f2750b;
                    Object obj2 = objArr2[i3];
                    objArr2[i3] = null;
                    if (collection.contains(obj2)) {
                        z3 = true;
                    } else {
                        this.f2750b[i4] = obj2;
                        i4++;
                    }
                    i3++;
                }
                i = i(i4);
                for (int i5 = 0; i5 < i2; i5++) {
                    Object[] objArr3 = this.f2750b;
                    Object obj3 = objArr3[i5];
                    objArr3[i5] = null;
                    if (collection.contains(obj3)) {
                        z3 = true;
                    } else {
                        this.f2750b[i] = obj3;
                        i = d(i);
                    }
                }
                z2 = z3;
            }
            if (z2) {
                j();
                this.f2751c = g(i - this.f2749a);
            }
        }
        return z2;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        j();
        Object[] objArr = this.f2750b;
        int i = this.f2749a;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f2749a = d(i);
        this.f2751c--;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        j();
        int i = i(k.h0(this) + this.f2749a);
        Object[] objArr = this.f2750b;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f2751c--;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        U.t.m(i, i2, this.f2751c);
        int i3 = i2 - i;
        if (i3 == 0) {
            return;
        }
        if (i3 == this.f2751c) {
            clear();
            return;
        }
        if (i3 == 1) {
            remove(i);
            return;
        }
        j();
        if (i < this.f2751c - i2) {
            int i4 = i((i - 1) + this.f2749a);
            int i5 = i((i2 - 1) + this.f2749a);
            while (i > 0) {
                int i6 = i4 + 1;
                int min = Math.min(i, Math.min(i6, i5 + 1));
                Object[] objArr = this.f2750b;
                int i7 = i5 - min;
                int i8 = i4 - min;
                i.j0(objArr, objArr, i7 + 1, i8 + 1, i6);
                i4 = g(i8);
                i5 = g(i7);
                i -= min;
            }
            int i9 = i(this.f2749a + i3);
            h(this.f2749a, i9);
            this.f2749a = i9;
        } else {
            int i10 = i(this.f2749a + i2);
            int i11 = i(this.f2749a + i);
            int i12 = this.f2751c;
            while (true) {
                i12 -= i2;
                if (i12 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f2750b;
                i2 = Math.min(i12, Math.min(objArr2.length - i10, objArr2.length - i11));
                Object[] objArr3 = this.f2750b;
                int i13 = i10 + i2;
                i.j0(objArr3, objArr3, i11, i10, i13);
                i10 = i(i13);
                i11 = i(i11 + i2);
            }
            int i14 = i(this.f2749a + this.f2751c);
            h(g(i14 - i3), i14);
        }
        this.f2751c -= i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int i;
        q1.d.e(collection, "elements");
        boolean z2 = false;
        z2 = false;
        z2 = false;
        if (!isEmpty() && this.f2750b.length != 0) {
            int i2 = i(this.f2749a + this.f2751c);
            int i3 = this.f2749a;
            if (i3 < i2) {
                i = i3;
                while (i3 < i2) {
                    Object obj = this.f2750b[i3];
                    if (collection.contains(obj)) {
                        this.f2750b[i] = obj;
                        i++;
                    } else {
                        z2 = true;
                    }
                    i3++;
                }
                Object[] objArr = this.f2750b;
                q1.d.e(objArr, "<this>");
                Arrays.fill(objArr, i, i2, (Object) null);
            } else {
                int length = this.f2750b.length;
                boolean z3 = false;
                int i4 = i3;
                while (i3 < length) {
                    Object[] objArr2 = this.f2750b;
                    Object obj2 = objArr2[i3];
                    objArr2[i3] = null;
                    if (collection.contains(obj2)) {
                        this.f2750b[i4] = obj2;
                        i4++;
                    } else {
                        z3 = true;
                    }
                    i3++;
                }
                i = i(i4);
                for (int i5 = 0; i5 < i2; i5++) {
                    Object[] objArr3 = this.f2750b;
                    Object obj3 = objArr3[i5];
                    objArr3[i5] = null;
                    if (collection.contains(obj3)) {
                        this.f2750b[i] = obj3;
                        i = d(i);
                    } else {
                        z3 = true;
                    }
                }
                z2 = z3;
            }
            if (z2) {
                j();
                this.f2751c = g(i - this.f2749a);
            }
        }
        return z2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int i2 = this.f2751c;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
        }
        int i3 = i(this.f2749a + i);
        Object[] objArr = this.f2750b;
        Object obj2 = objArr[i3];
        objArr[i3] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2751c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[this.f2751c]);
    }

    public h(int i) {
        Object[] objArr;
        if (i == 0) {
            objArr = d;
        } else if (i > 0) {
            objArr = new Object[i];
        } else {
            throw new IllegalArgumentException(D.f.b("Illegal Capacity: ", i));
        }
        this.f2750b = objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        q1.d.e(objArr, "array");
        int length = objArr.length;
        int i = this.f2751c;
        if (length < i) {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), i);
            q1.d.c(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            objArr = (Object[]) newInstance;
        }
        int i2 = i(this.f2749a + this.f2751c);
        int i3 = this.f2749a;
        if (i3 < i2) {
            i.k0(this.f2750b, objArr, i3, i2, 2);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f2750b;
            i.j0(objArr2, objArr, 0, this.f2749a, objArr2.length);
            Object[] objArr3 = this.f2750b;
            i.j0(objArr3, objArr, objArr3.length - this.f2749a, 0, i2);
        }
        int i4 = this.f2751c;
        if (i4 < objArr.length) {
            objArr[i4] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        q1.d.e(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        j();
        b(collection.size() + this.f2751c);
        a(i(this.f2749a + this.f2751c), collection);
        return true;
    }
}
