package f0;

import android.os.Bundle;
import com.tencent.wechat.Platform;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import l.AbstractC0271z;

/* renamed from: f0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0128d extends H {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f2297r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0128d(int i, boolean z2) {
        super(z2);
        this.f2297r = i;
    }

    public static float[] g(String str) {
        q1.d.e(str, "value");
        return new float[]{((Number) H.i.d(str)).floatValue()};
    }

    public static int[] h(String str) {
        q1.d.e(str, "value");
        return new int[]{((Number) H.f2273b.d(str)).intValue()};
    }

    public static long[] i(String str) {
        q1.d.e(str, "value");
        return new long[]{((Number) H.f2276f.d(str)).longValue()};
    }

    public static boolean[] j(String str) {
        q1.d.e(str, "value");
        return new boolean[]{((Boolean) H.f2280l.d(str)).booleanValue()};
    }

    @Override // f0.H
    public final Object a(Bundle bundle, String str) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        switch (this.f2297r) {
            case 0:
                q1.d.e(bundle, "bundle");
                if (!bundle.containsKey(str) || AbstractC0271z.o(bundle, str)) {
                    return null;
                }
                boolean[] booleanArray = bundle.getBooleanArray(str);
                if (booleanArray != null) {
                    return booleanArray;
                }
                AbstractC0271z.p(str);
                throw null;
            case 1:
                q1.d.e(bundle, "bundle");
                if (!bundle.containsKey(str) || AbstractC0271z.o(bundle, str)) {
                    return null;
                }
                boolean[] booleanArray2 = bundle.getBooleanArray(str);
                if (booleanArray2 == null) {
                    AbstractC0271z.p(str);
                    throw null;
                }
                q1.d.e(booleanArray2, "<this>");
                int length = booleanArray2.length;
                if (length != 0) {
                    if (length != 1) {
                        ArrayList arrayList = new ArrayList(booleanArray2.length);
                        for (boolean z2 : booleanArray2) {
                            arrayList.add(Boolean.valueOf(z2));
                        }
                        return arrayList;
                    }
                    obj = U.t.M(Boolean.valueOf(booleanArray2[0]));
                } else {
                    obj = j1.s.f2755a;
                }
                return obj;
            case 2:
                q1.d.e(bundle, "bundle");
                if (!bundle.containsKey(str) || AbstractC0271z.o(bundle, str)) {
                    return null;
                }
                float[] floatArray = bundle.getFloatArray(str);
                if (floatArray != null) {
                    return floatArray;
                }
                AbstractC0271z.p(str);
                throw null;
            case 3:
                q1.d.e(bundle, "bundle");
                if (!bundle.containsKey(str) || AbstractC0271z.o(bundle, str)) {
                    return null;
                }
                float[] floatArray2 = bundle.getFloatArray(str);
                if (floatArray2 == null) {
                    AbstractC0271z.p(str);
                    throw null;
                }
                q1.d.e(floatArray2, "<this>");
                int length2 = floatArray2.length;
                if (length2 != 0) {
                    if (length2 != 1) {
                        ArrayList arrayList2 = new ArrayList(floatArray2.length);
                        for (float f2 : floatArray2) {
                            arrayList2.add(Float.valueOf(f2));
                        }
                        return arrayList2;
                    }
                    obj2 = U.t.M(Float.valueOf(floatArray2[0]));
                } else {
                    obj2 = j1.s.f2755a;
                }
                return obj2;
            case Platform.INFO /* 4 */:
                q1.d.e(bundle, "bundle");
                if (!bundle.containsKey(str) || AbstractC0271z.o(bundle, str)) {
                    return null;
                }
                int[] intArray = bundle.getIntArray(str);
                if (intArray != null) {
                    return intArray;
                }
                AbstractC0271z.p(str);
                throw null;
            case Platform.WARN /* 5 */:
                q1.d.e(bundle, "bundle");
                if (!bundle.containsKey(str) || AbstractC0271z.o(bundle, str)) {
                    return null;
                }
                int[] intArray2 = bundle.getIntArray(str);
                if (intArray2 == null) {
                    AbstractC0271z.p(str);
                    throw null;
                }
                q1.d.e(intArray2, "<this>");
                int length3 = intArray2.length;
                if (length3 != 0) {
                    if (length3 != 1) {
                        ArrayList arrayList3 = new ArrayList(intArray2.length);
                        for (int i : intArray2) {
                            arrayList3.add(Integer.valueOf(i));
                        }
                        return arrayList3;
                    }
                    obj3 = U.t.M(Integer.valueOf(intArray2[0]));
                } else {
                    obj3 = j1.s.f2755a;
                }
                return obj3;
            case 6:
                q1.d.e(bundle, "bundle");
                if (!bundle.containsKey(str) || AbstractC0271z.o(bundle, str)) {
                    return null;
                }
                long[] longArray = bundle.getLongArray(str);
                if (longArray != null) {
                    return longArray;
                }
                AbstractC0271z.p(str);
                throw null;
            case 7:
                q1.d.e(bundle, "bundle");
                if (!bundle.containsKey(str) || AbstractC0271z.o(bundle, str)) {
                    return null;
                }
                long[] longArray2 = bundle.getLongArray(str);
                if (longArray2 == null) {
                    AbstractC0271z.p(str);
                    throw null;
                }
                q1.d.e(longArray2, "<this>");
                int length4 = longArray2.length;
                if (length4 != 0) {
                    if (length4 != 1) {
                        ArrayList arrayList4 = new ArrayList(longArray2.length);
                        for (long j2 : longArray2) {
                            arrayList4.add(Long.valueOf(j2));
                        }
                        return arrayList4;
                    }
                    obj4 = U.t.M(Long.valueOf(longArray2[0]));
                } else {
                    obj4 = j1.s.f2755a;
                }
                return obj4;
            case 8:
                q1.d.e(bundle, "bundle");
                if (!bundle.containsKey(str) || AbstractC0271z.o(bundle, str)) {
                    return null;
                }
                String[] stringArray = bundle.getStringArray(str);
                if (stringArray != null) {
                    return stringArray;
                }
                AbstractC0271z.p(str);
                throw null;
            default:
                q1.d.e(bundle, "bundle");
                if (!bundle.containsKey(str) || AbstractC0271z.o(bundle, str)) {
                    return null;
                }
                String[] stringArray2 = bundle.getStringArray(str);
                if (stringArray2 != null) {
                    return j1.i.l0(stringArray2);
                }
                AbstractC0271z.p(str);
                throw null;
        }
    }

    @Override // f0.H
    public final String b() {
        switch (this.f2297r) {
            case 0:
                return "boolean[]";
            case 1:
                return "List<Boolean>";
            case 2:
                return "float[]";
            case 3:
                return "List<Float>";
            case Platform.INFO /* 4 */:
                return "integer[]";
            case Platform.WARN /* 5 */:
                return "List<Int>";
            case 6:
                return "long[]";
            case 7:
                return "List<Long>";
            case 8:
                return "string[]";
            default:
                return "List<String>";
        }
    }

    @Override // f0.H
    public final Object c(Object obj, String str) {
        switch (this.f2297r) {
            case 0:
                boolean[] zArr = (boolean[]) obj;
                if (zArr == null) {
                    return j(str);
                }
                boolean[] j2 = j(str);
                int length = zArr.length;
                boolean[] copyOf = Arrays.copyOf(zArr, length + 1);
                System.arraycopy(j2, 0, copyOf, length, 1);
                q1.d.b(copyOf);
                return copyOf;
            case 1:
                List list = (List) obj;
                C0129e c0129e = H.f2280l;
                return list != null ? j1.j.u0(list, U.t.M(c0129e.d(str))) : U.t.M(c0129e.d(str));
            case 2:
                float[] fArr = (float[]) obj;
                if (fArr == null) {
                    return g(str);
                }
                float[] g2 = g(str);
                int length2 = fArr.length;
                float[] copyOf2 = Arrays.copyOf(fArr, length2 + 1);
                System.arraycopy(g2, 0, copyOf2, length2, 1);
                q1.d.b(copyOf2);
                return copyOf2;
            case 3:
                List list2 = (List) obj;
                C0129e c0129e2 = H.i;
                return list2 != null ? j1.j.u0(list2, U.t.M(c0129e2.d(str))) : U.t.M(c0129e2.d(str));
            case Platform.INFO /* 4 */:
                int[] iArr = (int[]) obj;
                if (iArr == null) {
                    return h(str);
                }
                int[] h = h(str);
                int length3 = iArr.length;
                int[] copyOf3 = Arrays.copyOf(iArr, length3 + 1);
                System.arraycopy(h, 0, copyOf3, length3, 1);
                q1.d.b(copyOf3);
                return copyOf3;
            case Platform.WARN /* 5 */:
                List list3 = (List) obj;
                C0129e c0129e3 = H.f2273b;
                return list3 != null ? j1.j.u0(list3, U.t.M(c0129e3.d(str))) : U.t.M(c0129e3.d(str));
            case 6:
                long[] jArr = (long[]) obj;
                if (jArr == null) {
                    return i(str);
                }
                long[] i = i(str);
                int length4 = jArr.length;
                long[] copyOf4 = Arrays.copyOf(jArr, length4 + 1);
                System.arraycopy(i, 0, copyOf4, length4, 1);
                q1.d.b(copyOf4);
                return copyOf4;
            case 7:
                List list4 = (List) obj;
                C0129e c0129e4 = H.f2276f;
                return list4 != null ? j1.j.u0(list4, U.t.M(c0129e4.d(str))) : U.t.M(c0129e4.d(str));
            case 8:
                String[] strArr = (String[]) obj;
                if (strArr == null) {
                    return new String[]{str};
                }
                String[] strArr2 = {str};
                int length5 = strArr.length;
                Object[] copyOf5 = Arrays.copyOf(strArr, length5 + 1);
                System.arraycopy(strArr2, 0, copyOf5, length5, 1);
                q1.d.b(copyOf5);
                return (String[]) copyOf5;
            default:
                List list5 = (List) obj;
                return list5 != null ? j1.j.u0(list5, U.t.M(str)) : U.t.M(str);
        }
    }

    @Override // f0.H
    public final Object d(String str) {
        switch (this.f2297r) {
            case 0:
                return j(str);
            case 1:
                q1.d.e(str, "value");
                return U.t.M(H.f2280l.d(str));
            case 2:
                return g(str);
            case 3:
                q1.d.e(str, "value");
                return U.t.M(H.i.d(str));
            case Platform.INFO /* 4 */:
                return h(str);
            case Platform.WARN /* 5 */:
                q1.d.e(str, "value");
                return U.t.M(H.f2273b.d(str));
            case 6:
                return i(str);
            case 7:
                q1.d.e(str, "value");
                return U.t.M(H.f2276f.d(str));
            case 8:
                q1.d.e(str, "value");
                return new String[]{str};
            default:
                q1.d.e(str, "value");
                return U.t.M(str);
        }
    }

    @Override // f0.H
    public final void e(Bundle bundle, String str, Object obj) {
        switch (this.f2297r) {
            case 0:
                boolean[] zArr = (boolean[]) obj;
                q1.d.e(str, "key");
                if (zArr != null) {
                    bundle.putBooleanArray(str, zArr);
                    return;
                } else {
                    AbstractC0271z.s(bundle, str);
                    return;
                }
            case 1:
                List list = (List) obj;
                q1.d.e(str, "key");
                if (list == null) {
                    AbstractC0271z.s(bundle, str);
                    return;
                }
                q1.d.e(list, "<this>");
                boolean[] zArr2 = new boolean[list.size()];
                Iterator it = list.iterator();
                int i = 0;
                while (it.hasNext()) {
                    zArr2[i] = ((Boolean) it.next()).booleanValue();
                    i++;
                }
                bundle.putBooleanArray(str, zArr2);
                return;
            case 2:
                float[] fArr = (float[]) obj;
                q1.d.e(str, "key");
                if (fArr != null) {
                    bundle.putFloatArray(str, fArr);
                    return;
                } else {
                    AbstractC0271z.s(bundle, str);
                    return;
                }
            case 3:
                List list2 = (List) obj;
                q1.d.e(str, "key");
                if (list2 == null) {
                    AbstractC0271z.s(bundle, str);
                    return;
                }
                float[] fArr2 = new float[list2.size()];
                Iterator it2 = list2.iterator();
                int i2 = 0;
                while (it2.hasNext()) {
                    fArr2[i2] = ((Number) it2.next()).floatValue();
                    i2++;
                }
                bundle.putFloatArray(str, fArr2);
                return;
            case Platform.INFO /* 4 */:
                int[] iArr = (int[]) obj;
                q1.d.e(str, "key");
                if (iArr != null) {
                    bundle.putIntArray(str, iArr);
                    return;
                } else {
                    AbstractC0271z.s(bundle, str);
                    return;
                }
            case Platform.WARN /* 5 */:
                List list3 = (List) obj;
                q1.d.e(str, "key");
                if (list3 != null) {
                    bundle.putIntArray(str, j1.j.x0(list3));
                    return;
                }
                return;
            case 6:
                long[] jArr = (long[]) obj;
                q1.d.e(str, "key");
                if (jArr != null) {
                    bundle.putLongArray(str, jArr);
                    return;
                } else {
                    AbstractC0271z.s(bundle, str);
                    return;
                }
            case 7:
                List list4 = (List) obj;
                q1.d.e(str, "key");
                if (list4 == null) {
                    AbstractC0271z.s(bundle, str);
                    return;
                }
                long[] jArr2 = new long[list4.size()];
                Iterator it3 = list4.iterator();
                int i3 = 0;
                while (it3.hasNext()) {
                    jArr2[i3] = ((Number) it3.next()).longValue();
                    i3++;
                }
                bundle.putLongArray(str, jArr2);
                return;
            case 8:
                String[] strArr = (String[]) obj;
                q1.d.e(str, "key");
                if (strArr != null) {
                    bundle.putStringArray(str, strArr);
                    return;
                } else {
                    AbstractC0271z.s(bundle, str);
                    return;
                }
            default:
                List list5 = (List) obj;
                q1.d.e(str, "key");
                if (list5 == null) {
                    AbstractC0271z.s(bundle, str);
                    return;
                }
                String[] strArr2 = (String[]) list5.toArray(new String[0]);
                q1.d.e(strArr2, "value");
                bundle.putStringArray(str, strArr2);
                return;
        }
    }
}
