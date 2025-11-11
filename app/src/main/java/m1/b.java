package m1;

import j1.f;
import java.io.Serializable;
import q1.d;

/* loaded from: classes.dex */
public final class b extends f implements a, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Enum[] f3222a;

    public b(Enum[] enumArr) {
        this.f3222a = enumArr;
    }

    @Override // j1.b
    public final int a() {
        return this.f3222a.length;
    }

    @Override // j1.b, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r3 = (Enum) obj;
        d.e(r3, "element");
        Enum[] enumArr = this.f3222a;
        int ordinal = r3.ordinal();
        return ((ordinal < 0 || ordinal >= enumArr.length) ? null : enumArr[ordinal]) == r3;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Enum[] enumArr = this.f3222a;
        int length = enumArr.length;
        if (i >= 0 && i < length) {
            return enumArr[i];
        }
        throw new IndexOutOfBoundsException("index: " + i + ", size: " + length);
    }

    @Override // j1.f, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r3 = (Enum) obj;
        d.e(r3, "element");
        int ordinal = r3.ordinal();
        Enum[] enumArr = this.f3222a;
        if (((ordinal < 0 || ordinal >= enumArr.length) ? null : enumArr[ordinal]) == r3) {
            return ordinal;
        }
        return -1;
    }

    @Override // j1.f, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r2 = (Enum) obj;
        d.e(r2, "element");
        return indexOf(r2);
    }
}
