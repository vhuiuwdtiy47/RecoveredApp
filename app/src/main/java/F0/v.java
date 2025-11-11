package f0;

import a.C0062d;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import g0.AbstractC0150a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import l.AbstractC0271z;

/* loaded from: classes.dex */
public abstract class v {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f2357f = 0;

    /* renamed from: a, reason: collision with root package name */
    public final String f2358a;

    /* renamed from: b, reason: collision with root package name */
    public final i0.l f2359b;

    /* renamed from: c, reason: collision with root package name */
    public w f2360c;
    public CharSequence d;

    /* renamed from: e, reason: collision with root package name */
    public final o.k f2361e;

    static {
        new LinkedHashMap();
    }

    public v(K k2) {
        LinkedHashMap linkedHashMap = L.f2289b;
        this.f2358a = U.t.B(k2.getClass());
        this.f2359b = new i0.l(this);
        this.f2361e = new o.k(0);
    }

    public final Bundle a(Bundle bundle) {
        Object obj;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f2359b.f2664f;
        if (bundle == null && linkedHashMap.isEmpty()) {
            return null;
        }
        Bundle f2 = Z0.i.f((i1.d[]) Arrays.copyOf(new i1.d[0], 0));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            C0132h c0132h = (C0132h) entry.getValue();
            c0132h.getClass();
            q1.d.e(str, "name");
            if (c0132h.f2304c && (obj = c0132h.d) != null) {
                c0132h.f2302a.e(f2, str, obj);
            }
        }
        if (bundle != null) {
            f2.putAll(bundle);
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                String str2 = (String) entry2.getKey();
                C0132h c0132h2 = (C0132h) entry2.getValue();
                c0132h2.getClass();
                q1.d.e(str2, "name");
                H h = c0132h2.f2302a;
                if (c0132h2.f2303b || !f2.containsKey(str2) || !AbstractC0271z.o(f2, str2)) {
                    try {
                        h.a(f2, str2);
                    } catch (IllegalStateException unused) {
                    }
                }
                StringBuilder e2 = D.f.e("Wrong argument type for '", str2, "' in argument savedState. ");
                e2.append(h.b());
                e2.append(" expected.");
                throw new IllegalArgumentException(e2.toString().toString());
            }
        }
        return f2;
    }

    public final C0131g b(int i) {
        o.k kVar = this.f2361e;
        C0131g c0131g = kVar.e() == 0 ? null : (C0131g) kVar.b(i);
        if (c0131g != null) {
            return c0131g;
        }
        w wVar = this.f2360c;
        if (wVar != null) {
            return wVar.b(i);
        }
        return null;
    }

    public final Map c() {
        return j1.w.j0((LinkedHashMap) this.f2359b.f2664f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0413 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x041b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01dd  */
    /* JADX WARN: Type inference failed for: r2v32, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.lang.Object, i1.b] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public f0.u d(L.C0016l r28) {
        /*
            Method dump skipped, instructions count: 1061
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.v.d(L.l):f0.u");
    }

    public void e(Context context, AttributeSet attributeSet) {
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, AbstractC0150a.f2568e);
        q1.d.d(obtainAttributes, "obtainAttributes(...)");
        String string = obtainAttributes.getString(2);
        i0.l lVar = this.f2359b;
        if (string == null) {
            lVar.f2660a = 0;
            lVar.f2662c = null;
        } else {
            lVar.getClass();
            if (x1.k.z(string)) {
                throw new IllegalArgumentException("Cannot have an empty route");
            }
            String concat = "android-app://androidx.navigation/".concat(string);
            q1.d.e(concat, "uriPattern");
            ArrayList O2 = U.t.O((LinkedHashMap) lVar.f2664f, new i0.k(new t(concat, null, null), 1));
            if (!O2.isEmpty()) {
                StringBuilder e2 = D.f.e("Cannot set route \"", string, "\" for destination ");
                e2.append((v) lVar.f2661b);
                e2.append(". Following required arguments are missing: ");
                e2.append(O2);
                throw new IllegalArgumentException(e2.toString().toString());
            }
            new i1.f(new C0062d(3, concat));
            lVar.f2660a = concat.hashCode();
            lVar.f2662c = null;
        }
        lVar.d = string;
        if (obtainAttributes.hasValue(1)) {
            int resourceId = obtainAttributes.getResourceId(1, 0);
            lVar.f2660a = resourceId;
            lVar.f2662c = null;
            lVar.f2662c = U.t.t(new U.m(context, 1), resourceId);
        }
        this.d = obtainAttributes.getText(0);
        obtainAttributes.recycle();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r11) {
        /*
            r10 = this;
            r0 = 1
            if (r10 != r11) goto L5
            goto Lce
        L5:
            r1 = 0
            if (r11 == 0) goto Lcf
            boolean r2 = r11 instanceof f0.v
            if (r2 != 0) goto Le
            goto Lcf
        Le:
            i0.l r2 = r10.f2359b
            java.lang.Object r3 = r2.f2663e
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            f0.v r11 = (f0.v) r11
            i0.l r4 = r11.f2359b
            java.lang.Object r5 = r4.f2663e
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            boolean r3 = q1.d.a(r3, r5)
            o.k r5 = r10.f2361e
            int r6 = r5.e()
            o.k r7 = r11.f2361e
            int r8 = r7.e()
            if (r6 != r8) goto L5c
            o.l r6 = new o.l
            r6.<init>(r5)
            w1.e r6 = w1.f.x(r6)
            java.util.Iterator r6 = r6.iterator()
        L3b:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L5a
            java.lang.Object r8 = r6.next()
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            java.lang.Object r9 = r5.b(r8)
            java.lang.Object r8 = r7.b(r8)
            boolean r8 = q1.d.a(r9, r8)
            if (r8 != 0) goto L3b
            goto L5c
        L5a:
            r5 = r0
            goto L5d
        L5c:
            r5 = r1
        L5d:
            java.util.Map r6 = r10.c()
            int r6 = r6.size()
            java.util.Map r7 = r11.c()
            int r7 = r7.size()
            if (r6 != r7) goto Lb3
            java.util.Map r10 = r10.c()
            java.util.Set r10 = r10.entrySet()
            java.lang.String r6 = "<this>"
            q1.d.e(r10, r6)
            java.util.Iterator r10 = r10.iterator()
        L80:
            boolean r6 = r10.hasNext()
            if (r6 == 0) goto Lb1
            java.lang.Object r6 = r10.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.util.Map r7 = r11.c()
            java.lang.Object r8 = r6.getKey()
            boolean r7 = r7.containsKey(r8)
            if (r7 == 0) goto Lb3
            java.util.Map r7 = r11.c()
            java.lang.Object r8 = r6.getKey()
            java.lang.Object r7 = r7.get(r8)
            java.lang.Object r6 = r6.getValue()
            boolean r6 = q1.d.a(r7, r6)
            if (r6 == 0) goto Lb3
            goto L80
        Lb1:
            r10 = r0
            goto Lb4
        Lb3:
            r10 = r1
        Lb4:
            int r11 = r2.f2660a
            int r6 = r4.f2660a
            if (r11 != r6) goto Lcf
            java.lang.Object r11 = r2.d
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r2 = r4.d
            java.lang.String r2 = (java.lang.String) r2
            boolean r11 = q1.d.a(r11, r2)
            if (r11 == 0) goto Lcf
            if (r3 == 0) goto Lcf
            if (r5 == 0) goto Lcf
            if (r10 == 0) goto Lcf
        Lce:
            return r0
        Lcf:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.v.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        i0.l lVar = this.f2359b;
        int i = lVar.f2660a * 31;
        String str = (String) lVar.d;
        int hashCode = i + (str != null ? str.hashCode() : 0);
        Iterator it = ((ArrayList) lVar.f2663e).iterator();
        while (it.hasNext()) {
            t tVar = (t) it.next();
            int i2 = hashCode * 31;
            String str2 = tVar.f2339a;
            int hashCode2 = (i2 + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = tVar.f2340b;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = tVar.f2341c;
            hashCode = hashCode3 + (str4 != null ? str4.hashCode() : 0);
        }
        o.k kVar = this.f2361e;
        q1.d.e(kVar, "<this>");
        int i3 = 0;
        while (true) {
            if (!(i3 < kVar.e())) {
                break;
            }
            int i4 = i3 + 1;
            C0131g c0131g = (C0131g) kVar.f(i3);
            int i5 = ((hashCode * 31) + c0131g.f2299a) * 31;
            C0118A c0118a = c0131g.f2300b;
            hashCode = i5 + (c0118a != null ? c0118a.hashCode() : 0);
            Bundle bundle = c0131g.f2301c;
            if (bundle != null) {
                hashCode = AbstractC0271z.h(bundle) + (hashCode * 31);
            }
            i3 = i4;
        }
        for (String str5 : c().keySet()) {
            int hashCode4 = (str5.hashCode() + (hashCode * 31)) * 31;
            Object obj = c().get(str5);
            hashCode = (obj != null ? obj.hashCode() : 0) + hashCode4;
        }
        return hashCode;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        i0.l lVar = this.f2359b;
        String str = (String) lVar.f2662c;
        if (str == null) {
            sb.append("0x");
            sb.append(Integer.toHexString(lVar.f2660a));
        } else {
            sb.append(str);
        }
        sb.append(")");
        String str2 = (String) lVar.d;
        if (str2 != null && !x1.k.z(str2)) {
            sb.append(" route=");
            sb.append((String) lVar.d);
        }
        if (this.d != null) {
            sb.append(" label=");
            sb.append(this.d);
        }
        String sb2 = sb.toString();
        q1.d.d(sb2, "toString(...)");
        return sb2;
    }
}
