package t;

import com.tencent.wechat.Platform;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import r.AbstractC0319e;
import r.C0320f;
import u.AbstractC0351h;
import u.C0357n;

/* renamed from: t.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0325c {

    /* renamed from: b, reason: collision with root package name */
    public int f3684b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3685c;
    public final C0326d d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3686e;

    /* renamed from: f, reason: collision with root package name */
    public C0325c f3687f;
    public C0320f i;

    /* renamed from: a, reason: collision with root package name */
    public HashSet f3683a = null;

    /* renamed from: g, reason: collision with root package name */
    public int f3688g = 0;
    public int h = Integer.MIN_VALUE;

    public C0325c(C0326d c0326d, int i) {
        this.d = c0326d;
        this.f3686e = i;
    }

    public final void a(C0325c c0325c, int i) {
        b(c0325c, i, Integer.MIN_VALUE, false);
    }

    public final boolean b(C0325c c0325c, int i, int i2, boolean z2) {
        if (c0325c == null) {
            j();
            return true;
        }
        if (!z2 && !i(c0325c)) {
            return false;
        }
        this.f3687f = c0325c;
        if (c0325c.f3683a == null) {
            c0325c.f3683a = new HashSet();
        }
        HashSet hashSet = this.f3687f.f3683a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f3688g = i;
        this.h = i2;
        return true;
    }

    public final void c(int i, ArrayList arrayList, C0357n c0357n) {
        HashSet hashSet = this.f3683a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                AbstractC0351h.b(((C0325c) it.next()).d, i, arrayList, c0357n);
            }
        }
    }

    public final int d() {
        if (this.f3685c) {
            return this.f3684b;
        }
        return 0;
    }

    public final int e() {
        C0325c c0325c;
        if (this.d.f3725g0 == 8) {
            return 0;
        }
        int i = this.h;
        return (i == Integer.MIN_VALUE || (c0325c = this.f3687f) == null || c0325c.d.f3725g0 != 8) ? this.f3688g : i;
    }

    public final C0325c f() {
        int i = this.f3686e;
        int a2 = AbstractC0319e.a(i);
        C0326d c0326d = this.d;
        switch (a2) {
            case 0:
            case Platform.WARN /* 5 */:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return c0326d.f3698K;
            case 2:
                return c0326d.f3699L;
            case 3:
                return c0326d.f3696I;
            case Platform.INFO /* 4 */:
                return c0326d.f3697J;
            default:
                throw new AssertionError(D.f.g(i));
        }
    }

    public final boolean g() {
        HashSet hashSet = this.f3683a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((C0325c) it.next()).f().h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        return this.f3687f != null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x0026. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0063 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i(t.C0325c r10) {
        /*
            r9 = this;
            r0 = 0
            if (r10 != 0) goto L5
            goto L65
        L5:
            r1 = 6
            int r2 = r9.f3686e
            r3 = 1
            t.d r4 = r10.d
            int r10 = r10.f3686e
            if (r10 != r2) goto L1c
            if (r2 != r1) goto L63
            boolean r10 = r4.f3693E
            if (r10 == 0) goto L65
            t.d r9 = r9.d
            boolean r9 = r9.f3693E
            if (r9 != 0) goto L63
            goto L65
        L1c:
            int r9 = r.AbstractC0319e.a(r2)
            r5 = 4
            r6 = 2
            r7 = 9
            r8 = 8
            switch(r9) {
                case 0: goto L65;
                case 1: goto L53;
                case 2: goto L3f;
                case 3: goto L53;
                case 4: goto L3f;
                case 5: goto L3a;
                case 6: goto L33;
                case 7: goto L65;
                case 8: goto L65;
                default: goto L29;
            }
        L29:
            java.lang.AssertionError r9 = new java.lang.AssertionError
            java.lang.String r10 = D.f.g(r2)
            r9.<init>(r10)
            throw r9
        L33:
            if (r10 == r1) goto L65
            if (r10 == r8) goto L65
            if (r10 == r7) goto L65
            goto L63
        L3a:
            if (r10 == r6) goto L65
            if (r10 != r5) goto L63
            goto L65
        L3f:
            r9 = 3
            if (r10 == r9) goto L48
            r9 = 5
            if (r10 != r9) goto L46
            goto L48
        L46:
            r9 = r0
            goto L49
        L48:
            r9 = r3
        L49:
            boolean r1 = r4 instanceof t.h
            if (r1 == 0) goto L52
            if (r9 != 0) goto L63
            if (r10 != r7) goto L65
            goto L63
        L52:
            return r9
        L53:
            if (r10 == r6) goto L5a
            if (r10 != r5) goto L58
            goto L5a
        L58:
            r9 = r0
            goto L5b
        L5a:
            r9 = r3
        L5b:
            boolean r1 = r4 instanceof t.h
            if (r1 == 0) goto L64
            if (r9 != 0) goto L63
            if (r10 != r8) goto L65
        L63:
            return r3
        L64:
            return r9
        L65:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t.C0325c.i(t.c):boolean");
    }

    public final void j() {
        HashSet hashSet;
        C0325c c0325c = this.f3687f;
        if (c0325c != null && (hashSet = c0325c.f3683a) != null) {
            hashSet.remove(this);
            if (this.f3687f.f3683a.size() == 0) {
                this.f3687f.f3683a = null;
            }
        }
        this.f3683a = null;
        this.f3687f = null;
        this.f3688g = 0;
        this.h = Integer.MIN_VALUE;
        this.f3685c = false;
        this.f3684b = 0;
    }

    public final void k() {
        C0320f c0320f = this.i;
        if (c0320f == null) {
            this.i = new C0320f(1);
        } else {
            c0320f.c();
        }
    }

    public final void l(int i) {
        this.f3684b = i;
        this.f3685c = true;
    }

    public final String toString() {
        return this.d.f3726h0 + ":" + D.f.g(this.f3686e);
    }
}
