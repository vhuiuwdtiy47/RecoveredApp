package f0;

import android.app.Activity;
import android.content.Context;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2364a;

    /* renamed from: b, reason: collision with root package name */
    public final i0.j f2365b = new i0.j(this, new C0135k(this, 0));

    /* renamed from: c, reason: collision with root package name */
    public final U.m f2366c;
    public final Activity d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2367e;

    /* renamed from: f, reason: collision with root package name */
    public final Y.I f2368f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f2369g;
    public final i1.f h;

    public y(Context context) {
        Object obj;
        this.f2364a = context;
        this.f2366c = new U.m(context, 1);
        Iterator it = w1.f.y(context, new C0125a(1)).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((Context) obj) instanceof Activity) {
                    break;
                }
            }
        }
        this.d = (Activity) obj;
        this.f2368f = new Y.I(1, this);
        this.f2369g = true;
        L l2 = this.f2365b.f2650r;
        l2.a(new x(l2));
        this.f2365b.f2650r.a(new C0127c(this.f2364a));
        this.h = new i1.f(new C0135k(this, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(int r10, f0.C0118A r11) {
        /*
            r9 = this;
            i0.j r0 = r9.f2365b
            j1.h r1 = r0.f2640f
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto Ld
            f0.w r1 = r0.f2638c
            goto L17
        Ld:
            j1.h r1 = r0.f2640f
            java.lang.Object r1 = r1.e()
            f0.i r1 = (f0.C0133i) r1
            f0.v r1 = r1.f2306b
        L17:
            if (r1 == 0) goto Lae
            f0.g r2 = r1.b(r10)
            r3 = 0
            r4 = 0
            if (r2 == 0) goto L39
            android.os.Bundle r5 = r2.f2301c
            int r6 = r2.f2299a
            if (r5 == 0) goto L37
            i1.d[] r7 = new i1.d[r3]
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r3)
            i1.d[] r7 = (i1.d[]) r7
            android.os.Bundle r7 = Z0.i.f(r7)
            r7.putAll(r5)
            goto L3b
        L37:
            r7 = r4
            goto L3b
        L39:
            r6 = r10
            goto L37
        L3b:
            if (r6 != 0) goto L51
            r5 = -1
            int r8 = r11.f2260c
            if (r8 != r5) goto L43
            goto L51
        L43:
            if (r8 == r5) goto L50
            boolean r9 = r11.d
            boolean r9 = r0.k(r8, r9, r3)
            if (r9 == 0) goto L50
            r0.b()
        L50:
            return
        L51:
            if (r6 == 0) goto La6
            f0.v r3 = r0.c(r6, r4)
            if (r3 != 0) goto La2
            int r11 = f0.v.f2357f
            U.m r9 = r9.f2366c
            java.lang.String r11 = U.t.t(r9, r6)
            java.lang.String r0 = " cannot be found from the current destination "
            if (r2 != 0) goto L7f
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r2 = "Navigation action/destination "
            r10.<init>(r2)
            r10.append(r11)
            r10.append(r0)
            r10.append(r1)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L7f:
            java.lang.String r2 = "Navigation destination "
            java.lang.String r3 = " referenced from action "
            java.lang.StringBuilder r11 = D.f.e(r2, r11, r3)
            java.lang.String r9 = U.t.t(r9, r10)
            r11.append(r9)
            r11.append(r0)
            r11.append(r1)
            java.lang.String r9 = r11.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        La2:
            r0.j(r3, r7, r11)
            return
        La6:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo"
            r9.<init>(r10)
            throw r9
        Lae:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r0 = "No current destination found. Ensure a navigation graph has been set for NavController "
            r11.<init>(r0)
            r11.append(r9)
            r9 = 46
            r11.append(r9)
            java.lang.String r9 = r11.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.y.a(int, f0.A):void");
    }
}
