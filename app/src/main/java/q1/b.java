package q1;

import androidx.lifecycle.Q;
import j0.AbstractC0163a;
import j1.w;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import l.AbstractC0271z;
import p1.l;
import p1.m;
import p1.n;
import p1.o;
import p1.p;
import p1.q;
import p1.r;
import p1.s;
import p1.t;
import p1.u;
import p1.v;

/* loaded from: classes.dex */
public final class b implements v1.a, a {

    /* renamed from: b, reason: collision with root package name */
    public static final Map f3536b;

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f3537c;
    public static final LinkedHashMap d;

    /* renamed from: a, reason: collision with root package name */
    public final Class f3538a;

    static {
        List asList = Arrays.asList(p1.a.class, l.class, p.class, AbstractC0163a.class, q.class, r.class, s.class, t.class, u.class, v.class, p1.b.class, p1.c.class, p1.d.class, p1.e.class, p1.f.class, p1.g.class, p1.h.class, p1.i.class, p1.j.class, p1.k.class, m.class, n.class, o.class);
        d.d(asList, "asList(...)");
        ArrayList arrayList = new ArrayList(j1.l.k0(asList, 10));
        int i = 0;
        for (Object obj : asList) {
            int i2 = i + 1;
            if (i < 0) {
                j1.k.j0();
                throw null;
            }
            arrayList.add(new i1.d((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        f3536b = w.i0(arrayList);
        HashMap hashMap = new HashMap();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        HashMap hashMap3 = new HashMap();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        d.d(values, "<get-values>(...)");
        for (String str : values) {
            StringBuilder sb = new StringBuilder("kotlin.jvm.internal.");
            d.b(str);
            sb.append(x1.k.C(str));
            sb.append("CompanionObject");
            hashMap3.put(sb.toString(), str.concat(".Companion"));
        }
        for (Map.Entry entry : f3536b.entrySet()) {
            Class cls = (Class) entry.getKey();
            int intValue = ((Number) entry.getValue()).intValue();
            hashMap3.put(cls.getName(), "kotlin.Function" + intValue);
        }
        f3537c = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(w.h0(hashMap3.size()));
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            linkedHashMap.put(entry2.getKey(), x1.k.C((String) entry2.getValue()));
        }
        d = linkedHashMap;
    }

    public b(Class cls) {
        d.e(cls, "jClass");
        this.f3538a = cls;
    }

    @Override // q1.a
    public final Class a() {
        return this.f3538a;
    }

    public final String b() {
        String str;
        Class cls = this.f3538a;
        d.e(cls, "jClass");
        String str2 = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            boolean isArray = cls.isArray();
            LinkedHashMap linkedHashMap = d;
            if (!isArray) {
                String str3 = (String) linkedHashMap.get(cls.getName());
                return str3 == null ? cls.getSimpleName() : str3;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (str = (String) linkedHashMap.get(componentType.getName())) != null) {
                str2 = str.concat("Array");
            }
            return str2 == null ? "Array" : str2;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return x1.k.B(simpleName, enclosingMethod.getName() + '$');
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor != null) {
            return x1.k.B(simpleName, enclosingConstructor.getName() + '$');
        }
        int indexOf = simpleName.indexOf(36, 0);
        if (indexOf == -1) {
            return simpleName;
        }
        String substring = simpleName.substring(indexOf + 1, simpleName.length());
        d.d(substring, "substring(...)");
        return substring;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean c(Q q2) {
        Class cls = this.f3538a;
        d.e(cls, "jClass");
        Map map = f3536b;
        d.c(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Integer num = (Integer) map.get(cls);
        if (num == null) {
            if (cls.isPrimitive()) {
                cls = AbstractC0271z.l(i.a(cls));
            }
            return cls.isInstance(q2);
        }
        int intValue = num.intValue();
        if (q2 instanceof i1.a) {
            return (q2 instanceof c ? ((c) q2).b() : q2 instanceof p1.a ? 0 : q2 instanceof l ? 1 : -1) == intValue;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof b) && AbstractC0271z.l(this).equals(AbstractC0271z.l((v1.a) obj));
    }

    public final int hashCode() {
        return AbstractC0271z.l(this).hashCode();
    }

    public final String toString() {
        return this.f3538a.toString() + " (Kotlin reflection is not available)";
    }
}
