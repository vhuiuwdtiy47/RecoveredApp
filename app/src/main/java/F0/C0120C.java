package f0;

/* renamed from: f0.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0120C extends C0124G {

    /* renamed from: s, reason: collision with root package name */
    public final Class f2268s;

    public C0120C(Class cls) {
        super(0, cls);
        if (cls.isEnum()) {
            this.f2268s = cls;
            return;
        }
        throw new IllegalArgumentException((cls + " is not an Enum type.").toString());
    }

    @Override // f0.C0124G, f0.H
    public final String b() {
        return this.f2268s.getName();
    }

    @Override // f0.C0124G
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final Enum d(String str) {
        Object obj;
        q1.d.e(str, "value");
        Class cls = this.f2268s;
        Object[] enumConstants = cls.getEnumConstants();
        q1.d.d(enumConstants, "getEnumConstants(...)");
        int length = enumConstants.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                obj = null;
                break;
            }
            obj = enumConstants[i];
            String name = ((Enum) obj).name();
            if (name == null ? false : name.equalsIgnoreCase(str)) {
                break;
            }
            i++;
        }
        Enum r4 = (Enum) obj;
        if (r4 != null) {
            return r4;
        }
        StringBuilder e2 = D.f.e("Enum value ", str, " not found for type ");
        e2.append(cls.getName());
        e2.append('.');
        throw new IllegalArgumentException(e2.toString());
    }
}
