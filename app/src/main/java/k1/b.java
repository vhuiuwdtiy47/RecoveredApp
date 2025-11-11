package k1;

import java.util.Map;

/* loaded from: classes.dex */
public final class b implements Map.Entry, r1.a {

    /* renamed from: a, reason: collision with root package name */
    public final c f2910a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2911b;

    public b(c cVar, int i) {
        q1.d.e(cVar, "map");
        this.f2910a = cVar;
        this.f2911b = i;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return q1.d.a(entry.getKey(), getKey()) && q1.d.a(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f2910a.f2913a[this.f2911b];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        Object[] objArr = this.f2910a.f2914b;
        q1.d.b(objArr);
        return objArr[this.f2911b];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        int hashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return hashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        c cVar = this.f2910a;
        cVar.b();
        Object[] objArr = cVar.f2914b;
        if (objArr == null) {
            int length = cVar.f2913a.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            cVar.f2914b = objArr;
        }
        int i = this.f2911b;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
