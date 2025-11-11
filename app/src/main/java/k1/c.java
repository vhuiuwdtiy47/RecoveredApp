package k1;

import U.t;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes.dex */
public final class c implements Map, Serializable, r1.c {

    /* renamed from: n, reason: collision with root package name */
    public static final c f2912n;

    /* renamed from: a, reason: collision with root package name */
    public Object[] f2913a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f2914b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f2915c;
    public int[] d;

    /* renamed from: e, reason: collision with root package name */
    public int f2916e;

    /* renamed from: f, reason: collision with root package name */
    public int f2917f;

    /* renamed from: g, reason: collision with root package name */
    public int f2918g;
    public int h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public d f2919j;

    /* renamed from: k, reason: collision with root package name */
    public e f2920k;

    /* renamed from: l, reason: collision with root package name */
    public d f2921l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2922m;

    static {
        c cVar = new c(0);
        cVar.f2922m = true;
        f2912n = cVar;
    }

    public c(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        Object[] objArr = new Object[i];
        int[] iArr = new int[i];
        int highestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.f2913a = objArr;
        this.f2914b = null;
        this.f2915c = iArr;
        this.d = new int[highestOneBit];
        this.f2916e = 2;
        this.f2917f = 0;
        this.f2918g = Integer.numberOfLeadingZeros(highestOneBit) + 1;
    }

    public final int a(Object obj) {
        b();
        while (true) {
            int i = i(obj);
            int i2 = this.f2916e * 2;
            int length = this.d.length / 2;
            if (i2 > length) {
                i2 = length;
            }
            int i3 = 0;
            while (true) {
                int[] iArr = this.d;
                int i4 = iArr[i];
                if (i4 <= 0) {
                    int i5 = this.f2917f;
                    Object[] objArr = this.f2913a;
                    if (i5 < objArr.length) {
                        int i6 = i5 + 1;
                        this.f2917f = i6;
                        objArr[i5] = obj;
                        this.f2915c[i5] = i;
                        iArr[i] = i6;
                        this.i++;
                        this.h++;
                        if (i3 > this.f2916e) {
                            this.f2916e = i3;
                        }
                        return i5;
                    }
                    f(1);
                } else {
                    if (q1.d.a(this.f2913a[i4 - 1], obj)) {
                        return -i4;
                    }
                    i3++;
                    if (i3 > i2) {
                        j(this.d.length * 2);
                        break;
                    }
                    i = i == 0 ? this.d.length - 1 : i - 1;
                }
            }
        }
    }

    public final void b() {
        if (this.f2922m) {
            throw new UnsupportedOperationException();
        }
    }

    public final void c(boolean z2) {
        int i;
        Object[] objArr = this.f2914b;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.f2917f;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.f2915c;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                Object[] objArr2 = this.f2913a;
                objArr2[i3] = objArr2[i2];
                if (objArr != null) {
                    objArr[i3] = objArr[i2];
                }
                if (z2) {
                    iArr[i3] = i4;
                    this.d[i4] = i3 + 1;
                }
                i3++;
            }
            i2++;
        }
        t.W(this.f2913a, i3, i);
        if (objArr != null) {
            t.W(objArr, i3, this.f2917f);
        }
        this.f2917f = i3;
    }

    @Override // java.util.Map
    public final void clear() {
        b();
        int i = this.f2917f - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.f2915c;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.d[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        t.W(this.f2913a, 0, this.f2917f);
        Object[] objArr = this.f2914b;
        if (objArr != null) {
            t.W(objArr, 0, this.f2917f);
        }
        this.i = 0;
        this.f2917f = 0;
        this.h++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return g(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return h(obj) >= 0;
    }

    public final boolean d(Collection collection) {
        q1.d.e(collection, "m");
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    if (!e((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean e(Map.Entry entry) {
        q1.d.e(entry, "entry");
        int g2 = g(entry.getKey());
        if (g2 < 0) {
            return false;
        }
        Object[] objArr = this.f2914b;
        q1.d.b(objArr);
        return q1.d.a(objArr[g2], entry.getValue());
    }

    @Override // java.util.Map
    public final Set entrySet() {
        d dVar = this.f2921l;
        if (dVar != null) {
            return dVar;
        }
        d dVar2 = new d(this, 0);
        this.f2921l = dVar2;
        return dVar2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        return this.i == map.size() && d(map.entrySet());
    }

    public final void f(int i) {
        Object[] objArr;
        Object[] objArr2 = this.f2913a;
        int length = objArr2.length;
        int i2 = this.f2917f;
        int i3 = length - i2;
        int i4 = i2 - this.i;
        if (i3 < i && i3 + i4 >= i && i4 >= objArr2.length / 4) {
            c(true);
            return;
        }
        int i5 = i2 + i;
        if (i5 < 0) {
            throw new OutOfMemoryError();
        }
        if (i5 > objArr2.length) {
            int length2 = objArr2.length;
            int i6 = length2 + (length2 >> 1);
            if (i6 - i5 < 0) {
                i6 = i5;
            }
            if (i6 - 2147483639 > 0) {
                i6 = i5 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            Object[] copyOf = Arrays.copyOf(objArr2, i6);
            q1.d.d(copyOf, "copyOf(...)");
            this.f2913a = copyOf;
            Object[] objArr3 = this.f2914b;
            if (objArr3 != null) {
                objArr = Arrays.copyOf(objArr3, i6);
                q1.d.d(objArr, "copyOf(...)");
            } else {
                objArr = null;
            }
            this.f2914b = objArr;
            int[] copyOf2 = Arrays.copyOf(this.f2915c, i6);
            q1.d.d(copyOf2, "copyOf(...)");
            this.f2915c = copyOf2;
            int highestOneBit = Integer.highestOneBit((i6 >= 1 ? i6 : 1) * 3);
            if (highestOneBit > this.d.length) {
                j(highestOneBit);
            }
        }
    }

    public final int g(Object obj) {
        int i = i(obj);
        int i2 = this.f2916e;
        while (true) {
            int i3 = this.d[i];
            if (i3 == 0) {
                return -1;
            }
            if (i3 > 0) {
                int i4 = i3 - 1;
                if (q1.d.a(this.f2913a[i4], obj)) {
                    return i4;
                }
            }
            i2--;
            if (i2 < 0) {
                return -1;
            }
            i = i == 0 ? this.d.length - 1 : i - 1;
        }
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int g2 = g(obj);
        if (g2 < 0) {
            return null;
        }
        Object[] objArr = this.f2914b;
        q1.d.b(objArr);
        return objArr[g2];
    }

    public final int h(Object obj) {
        int i = this.f2917f;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.f2915c[i] >= 0) {
                Object[] objArr = this.f2914b;
                q1.d.b(objArr);
                if (q1.d.a(objArr[i], obj)) {
                    return i;
                }
            }
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        a aVar = new a(this, 0);
        int i = 0;
        while (aVar.hasNext()) {
            int i2 = aVar.f304a;
            c cVar = (c) aVar.d;
            if (i2 >= cVar.f2917f) {
                throw new NoSuchElementException();
            }
            aVar.f304a = i2 + 1;
            aVar.f305b = i2;
            Object obj = cVar.f2913a[i2];
            int hashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = cVar.f2914b;
            q1.d.b(objArr);
            Object obj2 = objArr[aVar.f305b];
            int hashCode2 = obj2 != null ? obj2.hashCode() : 0;
            aVar.e();
            i += hashCode ^ hashCode2;
        }
        return i;
    }

    public final int i(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.f2918g;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.i == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0032, code lost:
    
        r3[r0] = r6;
        r5.f2915c[r2] = r0;
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(int r6) {
        /*
            r5 = this;
            int r0 = r5.h
            int r0 = r0 + 1
            r5.h = r0
            int r0 = r5.f2917f
            int r1 = r5.i
            r2 = 0
            if (r0 <= r1) goto L10
            r5.c(r2)
        L10:
            int[] r0 = new int[r6]
            r5.d = r0
            int r6 = java.lang.Integer.numberOfLeadingZeros(r6)
            int r6 = r6 + 1
            r5.f2918g = r6
        L1c:
            int r6 = r5.f2917f
            if (r2 >= r6) goto L50
            int r6 = r2 + 1
            java.lang.Object[] r0 = r5.f2913a
            r0 = r0[r2]
            int r0 = r5.i(r0)
            int r1 = r5.f2916e
        L2c:
            int[] r3 = r5.d
            r4 = r3[r0]
            if (r4 != 0) goto L3a
            r3[r0] = r6
            int[] r1 = r5.f2915c
            r1[r2] = r0
            r2 = r6
            goto L1c
        L3a:
            int r1 = r1 + (-1)
            if (r1 < 0) goto L48
            int r4 = r0 + (-1)
            if (r0 != 0) goto L46
            int r0 = r3.length
            int r0 = r0 + (-1)
            goto L2c
        L46:
            r0 = r4
            goto L2c
        L48:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?"
            r5.<init>(r6)
            throw r5
        L50:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.c.j(int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[LOOP:0: B:8:0x0024->B:25:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(int r12) {
        /*
            r11 = this;
            java.lang.Object[] r0 = r11.f2913a
            java.lang.String r1 = "<this>"
            q1.d.e(r0, r1)
            r1 = 0
            r0[r12] = r1
            java.lang.Object[] r0 = r11.f2914b
            if (r0 == 0) goto L10
            r0[r12] = r1
        L10:
            int[] r0 = r11.f2915c
            r0 = r0[r12]
            int r1 = r11.f2916e
            int r1 = r1 * 2
            int[] r2 = r11.d
            int r2 = r2.length
            int r2 = r2 / 2
            if (r1 <= r2) goto L20
            r1 = r2
        L20:
            r2 = 0
            r3 = r1
            r4 = r2
            r1 = r0
        L24:
            int r5 = r0 + (-1)
            if (r0 != 0) goto L2e
            int[] r0 = r11.d
            int r0 = r0.length
            int r0 = r0 + (-1)
            goto L2f
        L2e:
            r0 = r5
        L2f:
            int r4 = r4 + 1
            int r5 = r11.f2916e
            r6 = -1
            if (r4 <= r5) goto L3b
            int[] r0 = r11.d
            r0[r1] = r2
            goto L6c
        L3b:
            int[] r5 = r11.d
            r7 = r5[r0]
            if (r7 != 0) goto L44
            r5[r1] = r2
            goto L6c
        L44:
            if (r7 >= 0) goto L4b
            r5[r1] = r6
        L48:
            r1 = r0
            r4 = r2
            goto L65
        L4b:
            java.lang.Object[] r5 = r11.f2913a
            int r8 = r7 + (-1)
            r5 = r5[r8]
            int r5 = r11.i(r5)
            int r5 = r5 - r0
            int[] r9 = r11.d
            int r10 = r9.length
            int r10 = r10 + (-1)
            r5 = r5 & r10
            if (r5 < r4) goto L65
            r9[r1] = r7
            int[] r4 = r11.f2915c
            r4[r8] = r1
            goto L48
        L65:
            int r3 = r3 + r6
            if (r3 >= 0) goto L24
            int[] r0 = r11.d
            r0[r1] = r6
        L6c:
            int[] r0 = r11.f2915c
            r0[r12] = r6
            int r12 = r11.i
            int r12 = r12 + r6
            r11.i = r12
            int r12 = r11.h
            int r12 = r12 + 1
            r11.h = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.c.k(int):void");
    }

    @Override // java.util.Map
    public final Set keySet() {
        d dVar = this.f2919j;
        if (dVar != null) {
            return dVar;
        }
        d dVar2 = new d(this, 1);
        this.f2919j = dVar2;
        return dVar2;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        b();
        int a2 = a(obj);
        Object[] objArr = this.f2914b;
        if (objArr == null) {
            int length = this.f2913a.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            this.f2914b = objArr;
        }
        if (a2 >= 0) {
            objArr[a2] = obj2;
            return null;
        }
        int i = (-a2) - 1;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        q1.d.e(map, "from");
        b();
        Set<Map.Entry> entrySet = map.entrySet();
        if (entrySet.isEmpty()) {
            return;
        }
        f(entrySet.size());
        for (Map.Entry entry : entrySet) {
            int a2 = a(entry.getKey());
            Object[] objArr = this.f2914b;
            if (objArr == null) {
                int length = this.f2913a.length;
                if (length < 0) {
                    throw new IllegalArgumentException("capacity must be non-negative.");
                }
                objArr = new Object[length];
                this.f2914b = objArr;
            }
            if (a2 >= 0) {
                objArr[a2] = entry.getValue();
            } else {
                int i = (-a2) - 1;
                if (!q1.d.a(entry.getValue(), objArr[i])) {
                    objArr[i] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        b();
        int g2 = g(obj);
        if (g2 < 0) {
            return null;
        }
        Object[] objArr = this.f2914b;
        q1.d.b(objArr);
        Object obj2 = objArr[g2];
        k(g2);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.i * 3) + 2);
        sb.append("{");
        a aVar = new a(this, 0);
        int i = 0;
        while (aVar.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = aVar.f304a;
            c cVar = (c) aVar.d;
            if (i2 >= cVar.f2917f) {
                throw new NoSuchElementException();
            }
            aVar.f304a = i2 + 1;
            aVar.f305b = i2;
            Object obj = cVar.f2913a[i2];
            if (obj == cVar) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = cVar.f2914b;
            q1.d.b(objArr);
            Object obj2 = objArr[aVar.f305b];
            if (obj2 == cVar) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            aVar.e();
            i++;
        }
        sb.append("}");
        String sb2 = sb.toString();
        q1.d.d(sb2, "toString(...)");
        return sb2;
    }

    @Override // java.util.Map
    public final Collection values() {
        e eVar = this.f2920k;
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e(this);
        this.f2920k = eVar2;
        return eVar2;
    }
}
