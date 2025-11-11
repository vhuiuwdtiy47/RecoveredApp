package Y;

import android.util.Log;
import com.tencent.wechat.Platform;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: Y.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0034a implements O {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1060a;

    /* renamed from: b, reason: collision with root package name */
    public int f1061b;

    /* renamed from: c, reason: collision with root package name */
    public int f1062c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f1063e;

    /* renamed from: f, reason: collision with root package name */
    public int f1064f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1065g;
    public boolean h;
    public String i;

    /* renamed from: j, reason: collision with root package name */
    public int f1066j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f1067k;

    /* renamed from: l, reason: collision with root package name */
    public int f1068l;

    /* renamed from: m, reason: collision with root package name */
    public CharSequence f1069m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f1070n;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f1071o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1072p;

    /* renamed from: q, reason: collision with root package name */
    public final S f1073q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f1074r;

    /* renamed from: s, reason: collision with root package name */
    public int f1075s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f1076t;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0034a(S s2) {
        this();
        s2.E();
        B b2 = s2.f1021u;
        if (b2 != null) {
            b2.f959f.getClassLoader();
        }
        this.f1075s = -1;
        this.f1076t = false;
        this.f1073q = s2;
    }

    @Override // Y.O
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (S.H(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f1065g) {
            return true;
        }
        S s2 = this.f1073q;
        if (s2.d == null) {
            s2.d = new ArrayList();
        }
        s2.d.add(this);
        return true;
    }

    public final void b(Z z2) {
        this.f1060a.add(z2);
        z2.d = this.f1061b;
        z2.f1057e = this.f1062c;
        z2.f1058f = this.d;
        z2.f1059g = this.f1063e;
    }

    public final void c(int i) {
        if (this.f1065g) {
            if (S.H(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            ArrayList arrayList = this.f1060a;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                Z z2 = (Z) arrayList.get(i2);
                AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x = z2.f1055b;
                if (abstractComponentCallbacksC0056x != null) {
                    abstractComponentCallbacksC0056x.f1196r += i;
                    if (S.H(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + z2.f1055b + " to " + z2.f1055b.f1196r);
                    }
                }
            }
        }
    }

    public final int d(boolean z2) {
        if (this.f1074r) {
            throw new IllegalStateException("commit already called");
        }
        if (S.H(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new b0());
            f("  ", printWriter, true);
            printWriter.close();
        }
        this.f1074r = true;
        boolean z3 = this.f1065g;
        S s2 = this.f1073q;
        if (z3) {
            this.f1075s = s2.i.getAndIncrement();
        } else {
            this.f1075s = -1;
        }
        s2.w(this, z2);
        return this.f1075s;
    }

    public final void e(int i, AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x, String str, int i2) {
        String str2 = abstractComponentCallbacksC0056x.f1172L;
        if (str2 != null) {
            Z.d.c(abstractComponentCallbacksC0056x, str2);
        }
        Class<?> cls = abstractComponentCallbacksC0056x.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = abstractComponentCallbacksC0056x.f1203y;
            if (str3 != null && !str.equals(str3)) {
                throw new IllegalStateException("Can't change tag of fragment " + abstractComponentCallbacksC0056x + ": was " + abstractComponentCallbacksC0056x.f1203y + " now " + str);
            }
            abstractComponentCallbacksC0056x.f1203y = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + abstractComponentCallbacksC0056x + " with tag " + str + " to container view with no id");
            }
            int i3 = abstractComponentCallbacksC0056x.f1201w;
            if (i3 != 0 && i3 != i) {
                throw new IllegalStateException("Can't change container ID of fragment " + abstractComponentCallbacksC0056x + ": was " + abstractComponentCallbacksC0056x.f1201w + " now " + i);
            }
            abstractComponentCallbacksC0056x.f1201w = i;
            abstractComponentCallbacksC0056x.f1202x = i;
        }
        b(new Z(i2, abstractComponentCallbacksC0056x));
        abstractComponentCallbacksC0056x.f1197s = this.f1073q;
    }

    public final void f(String str, PrintWriter printWriter, boolean z2) {
        String str2;
        if (z2) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.i);
            printWriter.print(" mIndex=");
            printWriter.print(this.f1075s);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f1074r);
            if (this.f1064f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f1064f));
            }
            if (this.f1061b != 0 || this.f1062c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1061b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1062c));
            }
            if (this.d != 0 || this.f1063e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1063e));
            }
            if (this.f1066j != 0 || this.f1067k != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f1066j));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f1067k);
            }
            if (this.f1068l != 0 || this.f1069m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f1068l));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f1069m);
            }
        }
        ArrayList arrayList = this.f1060a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Z z3 = (Z) arrayList.get(i);
            switch (z3.f1054a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case Platform.INFO /* 4 */:
                    str2 = "HIDE";
                    break;
                case Platform.WARN /* 5 */:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + z3.f1054a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(z3.f1055b);
            if (z2) {
                if (z3.d != 0 || z3.f1057e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(z3.d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(z3.f1057e));
                }
                if (z3.f1058f != 0 || z3.f1059g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(z3.f1058f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(z3.f1059g));
                }
            }
        }
    }

    public final void g(AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x) {
        S s2 = abstractComponentCallbacksC0056x.f1197s;
        if (s2 == null || s2 == this.f1073q) {
            b(new Z(8, abstractComponentCallbacksC0056x));
            return;
        }
        throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + abstractComponentCallbacksC0056x.toString() + " is already attached to a FragmentManager.");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f1075s >= 0) {
            sb.append(" #");
            sb.append(this.f1075s);
        }
        if (this.i != null) {
            sb.append(" ");
            sb.append(this.i);
        }
        sb.append("}");
        return sb.toString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v0, types: [Y.Z, java.lang.Object] */
    public C0034a(C0034a c0034a) {
        this();
        c0034a.f1073q.E();
        B b2 = c0034a.f1073q.f1021u;
        if (b2 != null) {
            b2.f959f.getClassLoader();
        }
        Iterator it = c0034a.f1060a.iterator();
        while (it.hasNext()) {
            Z z2 = (Z) it.next();
            ArrayList arrayList = this.f1060a;
            ?? obj = new Object();
            obj.f1054a = z2.f1054a;
            obj.f1055b = z2.f1055b;
            obj.f1056c = z2.f1056c;
            obj.d = z2.d;
            obj.f1057e = z2.f1057e;
            obj.f1058f = z2.f1058f;
            obj.f1059g = z2.f1059g;
            obj.h = z2.h;
            obj.i = z2.i;
            arrayList.add(obj);
        }
        this.f1061b = c0034a.f1061b;
        this.f1062c = c0034a.f1062c;
        this.d = c0034a.d;
        this.f1063e = c0034a.f1063e;
        this.f1064f = c0034a.f1064f;
        this.f1065g = c0034a.f1065g;
        this.h = c0034a.h;
        this.i = c0034a.i;
        this.f1068l = c0034a.f1068l;
        this.f1069m = c0034a.f1069m;
        this.f1066j = c0034a.f1066j;
        this.f1067k = c0034a.f1067k;
        if (c0034a.f1070n != null) {
            ArrayList arrayList2 = new ArrayList();
            this.f1070n = arrayList2;
            arrayList2.addAll(c0034a.f1070n);
        }
        if (c0034a.f1071o != null) {
            ArrayList arrayList3 = new ArrayList();
            this.f1071o = arrayList3;
            arrayList3.addAll(c0034a.f1071o);
        }
        this.f1072p = c0034a.f1072p;
        this.f1075s = -1;
        this.f1076t = false;
        this.f1073q = c0034a.f1073q;
        this.f1074r = c0034a.f1074r;
        this.f1075s = c0034a.f1075s;
        this.f1076t = c0034a.f1076t;
    }

    public C0034a() {
        this.f1060a = new ArrayList();
        this.h = true;
        this.f1072p = false;
    }
}
