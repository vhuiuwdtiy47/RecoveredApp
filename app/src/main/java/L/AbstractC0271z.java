package l;

import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import q.C0312c;

/* renamed from: l.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0271z {

    /* renamed from: a, reason: collision with root package name */
    public static long f3182a;

    /* renamed from: b, reason: collision with root package name */
    public static Method f3183b;

    public static int d(n0.T t2, U.f fVar, View view, View view2, n0.H h, boolean z2) {
        if (h.v() == 0 || t2.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z2) {
            return Math.abs(n0.H.H(view) - n0.H.H(view2)) + 1;
        }
        return Math.min(fVar.l(), fVar.b(view2) - fVar.e(view));
    }

    public static int e(n0.T t2, U.f fVar, View view, View view2, n0.H h, boolean z2, boolean z3) {
        if (h.v() == 0 || t2.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z3 ? Math.max(0, (t2.b() - Math.max(n0.H.H(view), n0.H.H(view2))) - 1) : Math.max(0, Math.min(n0.H.H(view), n0.H.H(view2)));
        if (z2) {
            return Math.round((max * (Math.abs(fVar.b(view2) - fVar.e(view)) / (Math.abs(n0.H.H(view) - n0.H.H(view2)) + 1))) + (fVar.k() - fVar.e(view)));
        }
        return max;
    }

    public static int f(n0.T t2, U.f fVar, View view, View view2, n0.H h, boolean z2) {
        if (h.v() == 0 || t2.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z2) {
            return t2.b();
        }
        return (int) (((fVar.b(view2) - fVar.e(view)) / (Math.abs(n0.H.H(view) - n0.H.H(view2)) + 1)) * t2.b());
    }

    public static final boolean g(Bundle bundle, Bundle bundle2) {
        if (bundle == bundle2) {
            return true;
        }
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            Object obj2 = bundle2.get(str);
            if (obj != obj2 && !q1.d.a(obj, obj2)) {
                if (obj != null && obj2 != null) {
                    if ((obj instanceof Bundle) && (obj2 instanceof Bundle)) {
                        if (!g((Bundle) obj, (Bundle) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                        if (!j1.i.h0((Object[]) obj, (Object[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                        if (!Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                        if (!Arrays.equals((short[]) obj, (short[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                        if (!Arrays.equals((int[]) obj, (int[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                        if (!Arrays.equals((long[]) obj, (long[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                        if (!Arrays.equals((float[]) obj, (float[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                        if (!Arrays.equals((double[]) obj, (double[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                        if (!Arrays.equals((char[]) obj, (char[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                        if (!Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                            return false;
                        }
                    } else if (!obj.equals(obj2)) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    public static final int h(Bundle bundle) {
        Iterator<String> it = bundle.keySet().iterator();
        int i = 1;
        while (it.hasNext()) {
            Object obj = bundle.get(it.next());
            i = (i * 31) + (obj instanceof Bundle ? h((Bundle) obj) : obj instanceof Object[] ? Arrays.deepHashCode((Object[]) obj) : obj instanceof byte[] ? Arrays.hashCode((byte[]) obj) : obj instanceof short[] ? Arrays.hashCode((short[]) obj) : obj instanceof int[] ? Arrays.hashCode((int[]) obj) : obj instanceof long[] ? Arrays.hashCode((long[]) obj) : obj instanceof float[] ? Arrays.hashCode((float[]) obj) : obj instanceof double[] ? Arrays.hashCode((double[]) obj) : obj instanceof char[] ? Arrays.hashCode((char[]) obj) : obj instanceof boolean[] ? Arrays.hashCode((boolean[]) obj) : obj != null ? obj.hashCode() : 0);
        }
        return i;
    }

    public static View i(View view, int i) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View findViewById = viewGroup.getChildAt(i2).findViewById(i);
            if (findViewById != null) {
                return findViewById;
            }
        }
        return null;
    }

    public static final int j(Bundle bundle, String str) {
        int i = bundle.getInt(str, Integer.MIN_VALUE);
        if (i != Integer.MIN_VALUE || bundle.getInt(str, Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i;
        }
        p(str);
        throw null;
    }

    public static final Class k(v1.a aVar) {
        q1.d.e(aVar, "<this>");
        Class a2 = ((q1.a) aVar).a();
        q1.d.c(a2, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return a2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x001b. Please report as an issue. */
    public static final Class l(v1.a aVar) {
        q1.d.e(aVar, "<this>");
        Class a2 = ((q1.a) aVar).a();
        if (a2.isPrimitive()) {
            String name = a2.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return a2;
    }

    public static final ArrayList m(Bundle bundle, String str) {
        q1.d.e(str, "key");
        ArrayList c2 = Build.VERSION.SDK_INT >= 34 ? H.b.c(bundle, str, k(q1.i.a(Bundle.class))) : bundle.getParcelableArrayList(str);
        if (c2 != null) {
            return c2;
        }
        p(str);
        throw null;
    }

    public static boolean n() {
        try {
            if (f3183b == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        try {
            if (f3183b == null) {
                f3182a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f3183b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f3183b.invoke(null, Long.valueOf(f3182a))).booleanValue();
        } catch (Exception e2) {
            if (!(e2 instanceof InvocationTargetException)) {
                Log.v("Trace", "Unable to call isTagEnabled via reflection", e2);
                return false;
            }
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static final boolean o(Bundle bundle, String str) {
        q1.d.e(str, "key");
        return bundle.containsKey(str) && bundle.get(str) == null;
    }

    public static final void p(String str) {
        q1.d.e(str, "key");
        throw new IllegalArgumentException(D.f.d("No valid saved state was found for the key '", str, "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
    }

    public static void q(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    public static final void s(Bundle bundle, String str) {
        q1.d.e(str, "key");
        bundle.putString(str, null);
    }

    public static final void t(Bundle bundle, String str, Bundle bundle2) {
        q1.d.e(str, "key");
        q1.d.e(bundle2, "value");
        bundle.putBundle(str, bundle2);
    }

    public static final void u(Bundle bundle, String str, List list) {
        bundle.putStringArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [u1.c, u1.a] */
    public static u1.c w(int i, int i2) {
        if (i2 > Integer.MIN_VALUE) {
            return new u1.a(i, i2 - 1, 1);
        }
        u1.c cVar = u1.c.d;
        return u1.c.d;
    }

    public abstract boolean a(q.g gVar, C0312c c0312c);

    public abstract boolean b(q.g gVar, Object obj, Object obj2);

    public abstract boolean c(q.g gVar, q.f fVar, q.f fVar2);

    public abstract void r(q.f fVar, q.f fVar2);

    public abstract void v(q.f fVar, Thread thread);
}
