package f0;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import java.io.Serializable;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: c, reason: collision with root package name */
    public static final ThreadLocal f2370c = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    public final Context f2371a;

    /* renamed from: b, reason: collision with root package name */
    public final L f2372b;

    public z(Context context, L l2) {
        q1.d.e(l2, "navigatorProvider");
        this.f2371a = context;
        this.f2372b = l2;
    }

    public static C0132h c(TypedArray typedArray, Resources resources, int i) {
        boolean z2;
        H h;
        H h2;
        H h3;
        Class cls;
        boolean z3;
        H h4;
        boolean z4;
        Object obj;
        H h5;
        H l2;
        Object valueOf;
        boolean z5;
        boolean z6 = typedArray.getBoolean(3, false);
        ThreadLocal threadLocal = f2370c;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        String string = typedArray.getString(2);
        C0129e c0129e = H.f2274c;
        H h6 = H.f2278j;
        C0128d c0128d = H.f2284p;
        H h7 = H.f2281m;
        H h8 = H.f2277g;
        H h9 = H.d;
        H h10 = H.f2276f;
        H h11 = H.f2280l;
        H h12 = H.f2283o;
        H h13 = H.i;
        H h14 = H.f2273b;
        if (string != null) {
            h = h9;
            String resourcePackageName = resources.getResourcePackageName(i);
            if ("integer".equals(string)) {
                z2 = z6;
                h3 = h14;
            } else {
                z2 = z6;
                h3 = "integer[]".equals(string) ? h : "List<Int>".equals(string) ? H.f2275e : "long".equals(string) ? h10 : "long[]".equals(string) ? h8 : "List<Long>".equals(string) ? H.h : "boolean".equals(string) ? h11 : "boolean[]".equals(string) ? h7 : "List<Boolean>".equals(string) ? H.f2282n : "string".equals(string) ? h12 : "string[]".equals(string) ? c0128d : "List<String>".equals(string) ? H.f2285q : "float".equals(string) ? h13 : "float[]".equals(string) ? h6 : "List<Float>".equals(string) ? H.f2279k : null;
            }
            if (h3 == null) {
                if ("reference".equals(string)) {
                    h3 = c0129e;
                } else if (string.length() == 0) {
                    h2 = h10;
                    h3 = h12;
                } else {
                    try {
                        String concat = (!string.startsWith(".") || resourcePackageName == null) ? string : resourcePackageName.concat(string);
                        boolean endsWith = string.endsWith("[]");
                        if (endsWith) {
                            z5 = endsWith;
                            h2 = h10;
                            concat = concat.substring(0, concat.length() - 2);
                            q1.d.d(concat, "substring(...)");
                        } else {
                            z5 = endsWith;
                            h2 = h10;
                        }
                        Class<?> cls2 = Class.forName(concat);
                        H c0121d = Parcelable.class.isAssignableFrom(cls2) ? z5 ? new C0121D(cls2) : new C0122E(cls2) : (!Enum.class.isAssignableFrom(cls2) || z5) ? Serializable.class.isAssignableFrom(cls2) ? z5 ? new C0123F(cls2) : new C0124G(cls2) : null : new C0120C(cls2);
                        if (c0121d == null) {
                            throw new IllegalArgumentException((concat + " is not Serializable or Parcelable.").toString());
                        }
                        h3 = c0121d;
                    } catch (ClassNotFoundException e2) {
                        throw new RuntimeException(e2);
                    }
                }
            }
            h2 = h10;
        } else {
            z2 = z6;
            h = h9;
            h2 = h10;
            h3 = null;
        }
        if (typedArray.getValue(1, typedValue)) {
            cls = Serializable.class;
            if (h3 == c0129e) {
                int i2 = typedValue.resourceId;
                if (i2 != 0) {
                    obj = Integer.valueOf(i2);
                    z4 = false;
                } else {
                    if (typedValue.type != 16 || typedValue.data != 0) {
                        throw new XmlPullParserException("unsupported value '" + ((Object) typedValue.string) + "' for " + h3.b() + ". Must be a reference to a resource.");
                    }
                    z4 = false;
                    obj = 0;
                }
            } else {
                z4 = false;
                int i3 = typedValue.resourceId;
                if (i3 == 0) {
                    if (h3 == h12) {
                        z3 = true;
                        obj = typedArray.getString(1);
                    } else {
                        z3 = true;
                        int i4 = typedValue.type;
                        if (i4 != 3) {
                            if (i4 == 4) {
                                l2 = U.t.l(typedValue, h3, h13, string, "float");
                                valueOf = Float.valueOf(typedValue.getFloat());
                            } else if (i4 == 5) {
                                l2 = U.t.l(typedValue, h3, h14, string, "dimension");
                                valueOf = Integer.valueOf((int) typedValue.getDimension(resources.getDisplayMetrics()));
                            } else if (i4 == 18) {
                                l2 = U.t.l(typedValue, h3, h11, string, "boolean");
                                valueOf = Boolean.valueOf(typedValue.data != 0);
                            } else {
                                if (i4 < 16 || i4 > 31) {
                                    throw new XmlPullParserException("unsupported argument type " + typedValue.type);
                                }
                                if (h3 == h13) {
                                    l2 = U.t.l(typedValue, h3, h13, string, "float");
                                    valueOf = Float.valueOf(typedValue.data);
                                } else {
                                    l2 = U.t.l(typedValue, h3, h14, string, "integer");
                                    valueOf = Integer.valueOf(typedValue.data);
                                }
                            }
                            h3 = l2;
                            obj = valueOf;
                        } else {
                            String obj2 = typedValue.string.toString();
                            if (h3 == null) {
                                q1.d.e(obj2, "value");
                                try {
                                    h14.d(obj2);
                                    h3 = h14;
                                } catch (IllegalArgumentException unused) {
                                    h4 = h2;
                                    try {
                                        try {
                                            try {
                                                h4.d(obj2);
                                                h3 = h4;
                                            } catch (IllegalArgumentException unused2) {
                                                h13.d(obj2);
                                                h3 = h13;
                                            }
                                        } catch (IllegalArgumentException unused3) {
                                            h3 = h12;
                                        }
                                    } catch (IllegalArgumentException unused4) {
                                        h11.d(obj2);
                                        h3 = h11;
                                    }
                                }
                            }
                            h4 = h2;
                            obj = h3.d(obj2);
                        }
                    }
                    h4 = h2;
                } else {
                    if (h3 != null) {
                        throw new XmlPullParserException("unsupported value '" + ((Object) typedValue.string) + "' for " + h3.b() + ". You must use a \"reference\" type to reference other resources.");
                    }
                    obj = Integer.valueOf(i3);
                    h3 = c0129e;
                }
            }
            h4 = h2;
            z3 = true;
        } else {
            cls = Serializable.class;
            z3 = true;
            h4 = h2;
            z4 = false;
            obj = null;
        }
        if (obj == null) {
            z3 = z4;
            obj = null;
        }
        if (h3 == null) {
            h3 = null;
        }
        if (h3 == null) {
            H h15 = obj instanceof Integer ? h14 : obj instanceof int[] ? h : obj instanceof Long ? h4 : obj instanceof long[] ? h8 : obj instanceof Float ? h13 : obj instanceof float[] ? h6 : obj instanceof Boolean ? h11 : obj instanceof boolean[] ? h7 : ((obj instanceof String) || obj == null) ? h12 : null;
            if (h15 != null) {
                h5 = h15;
            } else if ((obj instanceof Object[]) && (((Object[]) obj) instanceof String[])) {
                h5 = c0128d;
            } else {
                q1.d.b(obj);
                if (obj.getClass().isArray()) {
                    Class<?> componentType = obj.getClass().getComponentType();
                    q1.d.b(componentType);
                    if (Parcelable.class.isAssignableFrom(componentType)) {
                        Class<?> componentType2 = obj.getClass().getComponentType();
                        q1.d.c(componentType2, "null cannot be cast to non-null type java.lang.Class<android.os.Parcelable>");
                        h5 = new C0121D(componentType2);
                    }
                }
                if (obj.getClass().isArray()) {
                    Class<?> componentType3 = obj.getClass().getComponentType();
                    q1.d.b(componentType3);
                    if (cls.isAssignableFrom(componentType3)) {
                        Class<?> componentType4 = obj.getClass().getComponentType();
                        q1.d.c(componentType4, "null cannot be cast to non-null type java.lang.Class<java.io.Serializable>");
                        h5 = new C0123F(componentType4);
                    }
                }
                if (obj instanceof Parcelable) {
                    h5 = new C0122E(obj.getClass());
                } else if (obj instanceof Enum) {
                    h5 = new C0120C(obj.getClass());
                } else {
                    if (!(obj instanceof Serializable)) {
                        throw new IllegalArgumentException("Object of type " + obj.getClass().getName() + " is not supported for navigation arguments.");
                    }
                    h5 = new C0124G(obj.getClass());
                }
            }
            h3 = h5;
        }
        return new C0132h(h3, z2, obj, z3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0147, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("Every <deepLink> must include at least one of app:uri, app:action, or app:mimeType");
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x028d, code lost:
    
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final f0.v a(android.content.res.Resources r28, android.content.res.XmlResourceParser r29, android.util.AttributeSet r30, int r31) {
        /*
            Method dump skipped, instructions count: 654
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.z.a(android.content.res.Resources, android.content.res.XmlResourceParser, android.util.AttributeSet, int):f0.v");
    }

    public final w b(int i) {
        int next;
        Resources resources = this.f2371a.getResources();
        XmlResourceParser xml = resources.getXml(i);
        q1.d.d(xml, "getXml(...)");
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            try {
                try {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } catch (Exception e2) {
                    throw new RuntimeException("Exception inflating " + resources.getResourceName(i) + " line " + xml.getLineNumber(), e2);
                }
            } finally {
                xml.close();
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        q1.d.b(asAttributeSet);
        v a2 = a(resources, xml, asAttributeSet, i);
        if (a2 instanceof w) {
            return (w) a2;
        }
        throw new IllegalArgumentException(("Root element <" + name + "> did not inflate into a NavGraph").toString());
    }
}
