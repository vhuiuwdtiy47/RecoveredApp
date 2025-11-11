package i0;

import U.t;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.EnumC0092o;
import androidx.lifecycle.InterfaceC0096t;
import androidx.lifecycle.V;
import f0.C0118A;
import f0.C0125a;
import f0.C0133i;
import f0.C0134j;
import f0.C0135k;
import f0.I;
import f0.InterfaceC0130f;
import f0.K;
import f0.L;
import f0.n;
import f0.o;
import f0.v;
import f0.w;
import f0.y;
import h0.C0155e;
import j1.p;
import j1.s;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Set;
import k0.C0172a;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final y f2636a;

    /* renamed from: b, reason: collision with root package name */
    public final C0135k f2637b;

    /* renamed from: c, reason: collision with root package name */
    public w f2638c;
    public Bundle d;

    /* renamed from: e, reason: collision with root package name */
    public Bundle[] f2639e;

    /* renamed from: f, reason: collision with root package name */
    public final j1.h f2640f;

    /* renamed from: g, reason: collision with root package name */
    public final y1.c f2641g;
    public final y1.c h;
    public final LinkedHashMap i;

    /* renamed from: j, reason: collision with root package name */
    public final LinkedHashMap f2642j;

    /* renamed from: k, reason: collision with root package name */
    public final LinkedHashMap f2643k;

    /* renamed from: l, reason: collision with root package name */
    public final LinkedHashMap f2644l;

    /* renamed from: m, reason: collision with root package name */
    public InterfaceC0096t f2645m;

    /* renamed from: n, reason: collision with root package name */
    public o f2646n;

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f2647o;

    /* renamed from: p, reason: collision with root package name */
    public EnumC0092o f2648p;

    /* renamed from: q, reason: collision with root package name */
    public final C0155e f2649q;

    /* renamed from: r, reason: collision with root package name */
    public final L f2650r;

    /* renamed from: s, reason: collision with root package name */
    public final LinkedHashMap f2651s;

    /* renamed from: t, reason: collision with root package name */
    public p1.l f2652t;

    /* renamed from: u, reason: collision with root package name */
    public g f2653u;

    /* renamed from: v, reason: collision with root package name */
    public final LinkedHashMap f2654v;

    /* renamed from: w, reason: collision with root package name */
    public int f2655w;

    /* renamed from: x, reason: collision with root package name */
    public final ArrayList f2656x;

    /* renamed from: y, reason: collision with root package name */
    public final y1.b f2657y;

    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, y1.b] */
    public j(y yVar, C0135k c0135k) {
        q1.d.e(yVar, "navController");
        this.f2636a = yVar;
        this.f2637b = c0135k;
        this.f2640f = new j1.h();
        s sVar = s.f2755a;
        this.f2641g = new y1.c(sVar);
        this.h = new y1.c(sVar);
        this.i = new LinkedHashMap();
        this.f2642j = new LinkedHashMap();
        this.f2643k = new LinkedHashMap();
        this.f2644l = new LinkedHashMap();
        this.f2647o = new ArrayList();
        this.f2648p = EnumC0092o.f1591b;
        this.f2649q = new C0155e(1, this);
        this.f2650r = new L();
        this.f2651s = new LinkedHashMap();
        this.f2654v = new LinkedHashMap();
        this.f2656x = new ArrayList();
        this.f2657y = new Object();
    }

    public static v d(int i, v vVar, v vVar2, boolean z2) {
        if (vVar.f2359b.f2660a == i && (vVar2 == null || (vVar.equals(vVar2) && q1.d.a(vVar.f2360c, vVar2.f2360c)))) {
            return vVar;
        }
        w wVar = vVar instanceof w ? (w) vVar : null;
        if (wVar == null) {
            wVar = vVar.f2360c;
            q1.d.b(wVar);
        }
        return wVar.f2362g.a(i, wVar, vVar2, z2);
    }

    public static /* synthetic */ void m(j jVar, C0133i c0133i) {
        jVar.l(c0133i, false, new j1.h());
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0179, code lost:
    
        if (r15.hasPrevious() == false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x017b, code lost:
    
        r0 = r15.previous();
        r4 = ((f0.C0133i) r0).f2306b;
        r7 = r11.f2638c;
        q1.d.b(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x018d, code lost:
    
        if (q1.d.a(r4, r7) == false) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x018f, code lost:
    
        r5 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0190, code lost:
    
        r5 = (f0.C0133i) r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0192, code lost:
    
        if (r5 != null) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0194, code lost:
    
        r15 = r6.f2366c;
        r0 = r11.f2638c;
        q1.d.b(r0);
        r4 = r11.f2638c;
        q1.d.b(r4);
        r5 = f0.I.b(r15, r0, r4.a(r13), h(), r11.f2646n);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01ae, code lost:
    
        r1.addFirst(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01b1, code lost:
    
        r13 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01b9, code lost:
    
        if (r13.hasNext() == false) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01bb, code lost:
    
        r15 = (f0.C0133i) r13.next();
        r0 = r11.f2651s.get(r11.f2650r.b(r15.f2306b.f2358a));
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01d1, code lost:
    
        if (r0 == null) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01d3, code lost:
    
        ((f0.n) r0).a(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01f7, code lost:
    
        throw new java.lang.IllegalStateException(("NavigatorBackStack for " + r12.f2358a + " should already be created").toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x01f8, code lost:
    
        r3.addAll(r1);
        r3.addLast(r14);
        r12 = new java.util.ArrayList(r1.size() + 1);
        r12.addAll(r1);
        r12.add(r14);
        r12 = r12.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0216, code lost:
    
        if (r12.hasNext() == false) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0218, code lost:
    
        r13 = (f0.C0133i) r12.next();
        r14 = r13.f2306b.f2360c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0222, code lost:
    
        if (r14 == null) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0224, code lost:
    
        i(r13, e(r14.f2359b.f2660a));
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0230, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0164, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0145, code lost:
    
        r0 = r3.f2750b[r3.f2749a];
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0099, code lost:
    
        r4 = ((f0.C0133i) r1.c()).f2306b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
    
        r1 = new j1.h();
        r4 = r12 instanceof f0.w;
        r5 = null;
        r6 = r11.f2636a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        if (r4 == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        r4 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
    
        q1.d.b(r4);
        r4 = r4.f2360c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        if (r4 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0042, code lost:
    
        r7 = r15.listIterator(r15.size());
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004e, code lost:
    
        if (r7.hasPrevious() == false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
    
        r8 = r7.previous();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
    
        if (q1.d.a(((f0.C0133i) r8).f2306b, r4) == false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0061, code lost:
    
        r8 = (f0.C0133i) r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0063, code lost:
    
        if (r8 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0065, code lost:
    
        r8 = f0.I.b(r6.f2366c, r4, r13, h(), r11.f2646n);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0071, code lost:
    
        r1.addFirst(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0078, code lost:
    
        if (r3.isEmpty() != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x0007, code lost:
    
        if (r1 == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0082, code lost:
    
        if (((f0.C0133i) r3.e()).f2306b != r4) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0084, code lost:
    
        m(r11, (f0.C0133i) r3.e());
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0060, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008d, code lost:
    
        if (r4 == null) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008f, code lost:
    
        if (r4 != r12) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0095, code lost:
    
        if (r1.isEmpty() == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0097, code lost:
    
        r4 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a1, code lost:
    
        if (r4 == null) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ab, code lost:
    
        if (c(r4.f2359b.f2660a, r4) == r4) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ad, code lost:
    
        r4 = r4.f2360c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00af, code lost:
    
        if (r4 == null) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000d, code lost:
    
        if (r3.isEmpty() != false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b1, code lost:
    
        if (r13 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b7, code lost:
    
        if (r13.isEmpty() != true) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b9, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00bc, code lost:
    
        r8 = r15.listIterator(r15.size());
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c8, code lost:
    
        if (r8.hasPrevious() == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ca, code lost:
    
        r9 = r8.previous();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00d7, code lost:
    
        if (q1.d.a(((f0.C0133i) r9).f2306b, r4) == false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00db, code lost:
    
        r9 = (f0.C0133i) r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00dd, code lost:
    
        if (r9 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00df, code lost:
    
        r9 = f0.I.b(r6.f2366c, r4, r4.a(r7), h(), r11.f2646n);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00ef, code lost:
    
        r1.addFirst(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00da, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00bb, code lost:
    
        r7 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
    
        if ((((f0.C0133i) r3.e()).f2306b instanceof f0.InterfaceC0130f) == false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00f7, code lost:
    
        if (r1.isEmpty() == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00fa, code lost:
    
        r0 = ((f0.C0133i) r1.c()).f2306b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0106, code lost:
    
        if (r3.isEmpty() != false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0112, code lost:
    
        if ((((f0.C0133i) r3.e()).f2306b instanceof f0.w) == false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0114, code lost:
    
        r4 = ((f0.C0133i) r3.e()).f2306b;
        q1.d.c(r4, "null cannot be cast to non-null type androidx.navigation.NavGraph");
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0131, code lost:
    
        if (((o.k) ((f0.w) r4).f2362g.d).b(r0.f2359b.f2660a) != null) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0133, code lost:
    
        m(r11, (f0.C0133i) r3.e());
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0141, code lost:
    
        if (r3.isEmpty() == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0143, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x014b, code lost:
    
        r0 = (f0.C0133i) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x014d, code lost:
    
        if (r0 != null) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002c, code lost:
    
        if (k(((f0.C0133i) r3.e()).f2306b.f2359b.f2660a, true, false) != false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0153, code lost:
    
        if (r1.isEmpty() == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0155, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x015d, code lost:
    
        r0 = (f0.C0133i) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0157, code lost:
    
        r0 = r1.f2750b[r1.f2749a];
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x015f, code lost:
    
        if (r0 == null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0161, code lost:
    
        r0 = r0.f2306b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x016b, code lost:
    
        if (q1.d.a(r0, r11.f2638c) != false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x016d, code lost:
    
        r15 = r15.listIterator(r15.size());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(f0.v r12, android.os.Bundle r13, f0.C0133i r14, java.util.List r15) {
        /*
            Method dump skipped, instructions count: 561
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.j.a(f0.v, android.os.Bundle, f0.i, java.util.List):void");
    }

    public final boolean b() {
        j1.h hVar;
        l1.a[] aVarArr;
        while (true) {
            hVar = this.f2640f;
            if (hVar.isEmpty() || !(((C0133i) hVar.e()).f2306b instanceof w)) {
                break;
            }
            m(this, (C0133i) hVar.e());
        }
        C0133i c0133i = (C0133i) hVar.f();
        ArrayList arrayList = this.f2656x;
        if (c0133i != null) {
            arrayList.add(c0133i);
        }
        this.f2655w++;
        r();
        int i = this.f2655w - 1;
        this.f2655w = i;
        if (i == 0) {
            ArrayList z02 = j1.j.z0(arrayList);
            arrayList.clear();
            Iterator it = z02.iterator();
            while (it.hasNext()) {
                C0133i c0133i2 = (C0133i) it.next();
                Iterator it2 = this.f2647o.iterator();
                while (it2.hasNext()) {
                    C0172a c0172a = (C0172a) it2.next();
                    v vVar = c0133i2.f2306b;
                    c0133i2.h.a();
                    c0172a.a(this.f2636a, vVar);
                }
                y1.b bVar = this.f2657y;
                l1.a[] aVarArr2 = z1.a.f4274a;
                synchronized (bVar) {
                    try {
                        int i2 = bVar.f4223f;
                        Object[] objArr = bVar.f4221c;
                        if (objArr == null) {
                            objArr = bVar.b(null, 0, 2);
                        } else if (i2 >= objArr.length) {
                            objArr = bVar.b(objArr, i2, objArr.length * 2);
                        }
                        objArr[((int) (bVar.a() + i2)) & (objArr.length - 1)] = c0133i2;
                        int i3 = bVar.f4223f + 1;
                        bVar.f4223f = i3;
                        if (i3 > 1) {
                            Object[] objArr2 = bVar.f4221c;
                            q1.d.b(objArr2);
                            objArr2[((int) bVar.a()) & (objArr2.length - 1)] = null;
                            bVar.f4223f--;
                            long a2 = bVar.a() + 1;
                            if (bVar.d < a2) {
                                bVar.d = a2;
                            }
                            if (bVar.f4222e < a2) {
                                bVar.f4222e = a2;
                            }
                        }
                        bVar.f4222e = bVar.a() + bVar.f4223f;
                        aVarArr = aVarArr2;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                for (l1.a aVar : aVarArr) {
                }
            }
            this.f2641g.b(j1.j.z0(hVar));
            this.h.b(n());
        }
        return c0133i != null;
    }

    public final v c(int i, v vVar) {
        v vVar2;
        w wVar = this.f2638c;
        if (wVar == null) {
            return null;
        }
        if (wVar.f2359b.f2660a == i) {
            if (vVar == null) {
                return wVar;
            }
            if (q1.d.a(wVar, vVar) && vVar.f2360c == null) {
                return this.f2638c;
            }
        }
        C0133i c0133i = (C0133i) this.f2640f.f();
        if (c0133i == null || (vVar2 = c0133i.f2306b) == null) {
            vVar2 = this.f2638c;
            q1.d.b(vVar2);
        }
        return d(i, vVar2, vVar, false);
    }

    public final C0133i e(int i) {
        Object obj;
        j1.h hVar = this.f2640f;
        ListIterator<E> listIterator = hVar.listIterator(hVar.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            if (((C0133i) obj).f2306b.f2359b.f2660a == i) {
                break;
            }
        }
        C0133i c0133i = (C0133i) obj;
        if (c0133i != null) {
            return c0133i;
        }
        throw new IllegalArgumentException(("No destination with ID " + i + " is on the NavController's back stack. The current destination is " + f()).toString());
    }

    public final v f() {
        C0133i c0133i = (C0133i) this.f2640f.f();
        if (c0133i != null) {
            return c0133i.f2306b;
        }
        return null;
    }

    public final w g() {
        w wVar = this.f2638c;
        if (wVar == null) {
            throw new IllegalStateException("You must call setGraph() before calling getGraph()");
        }
        q1.d.c(wVar, "null cannot be cast to non-null type androidx.navigation.NavGraph");
        return wVar;
    }

    public final EnumC0092o h() {
        return this.f2645m == null ? EnumC0092o.f1592c : this.f2648p;
    }

    public final void i(C0133i c0133i, C0133i c0133i2) {
        this.i.put(c0133i, c0133i2);
        LinkedHashMap linkedHashMap = this.f2642j;
        if (linkedHashMap.get(c0133i2) == null) {
            linkedHashMap.put(c0133i2, new a());
        }
        Object obj = linkedHashMap.get(c0133i2);
        q1.d.b(obj);
        ((a) obj).f2610a.incrementAndGet();
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f4, code lost:
    
        if (r13.equals(r6) == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0106, code lost:
    
        r6 = new j1.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x010f, code lost:
    
        if (j1.k.h0(r12) < r14) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0115, code lost:
    
        if (r12.isEmpty() != false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0117, code lost:
    
        r10 = (f0.C0133i) r12.remove(j1.k.h0(r12));
        q(r10);
        r15 = new f0.C0133i(r10.f2305a, r10.f2306b, r10.f2306b.a(r25), r10.d, r10.f2308e, r10.f2309f, r10.f2310g);
        r3 = r15.h;
        r3.getClass();
        r7 = r10.d;
        q1.d.e(r7, "<set-?>");
        r3.d = r7;
        r7 = r10.h.f2619k;
        q1.d.e(r7, "maxState");
        r3.f2619k = r7;
        r3.b();
        r6.addFirst(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0171, code lost:
    
        throw new java.util.NoSuchElementException("List is empty.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0172, code lost:
    
        r3 = r6.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x017a, code lost:
    
        if (r3.hasNext() == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x017c, code lost:
    
        r7 = (f0.C0133i) r3.next();
        r10 = r7.f2306b.f2360c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0186, code lost:
    
        if (r10 == null) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0188, code lost:
    
        i(r7, e(r10.f2359b.f2660a));
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0193, code lost:
    
        r12.addLast(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0197, code lost:
    
        r3 = r6.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x019f, code lost:
    
        if (r3.hasNext() == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01a1, code lost:
    
        r6 = (f0.C0133i) r3.next();
        r11.b(r6.f2306b.f2358a).f(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01b3, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0104, code lost:
    
        if (r10.f2660a == r6.f2359b.f2660a) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01b8  */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, q1.g] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(final f0.v r24, android.os.Bundle r25, f0.C0118A r26) {
        /*
            Method dump skipped, instructions count: 523
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.j.j(f0.v, android.os.Bundle, f0.A):void");
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, q1.g] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, q1.g] */
    public final boolean k(int i, boolean z2, boolean z3) {
        v vVar;
        final j jVar;
        boolean z4;
        e eVar;
        j1.h hVar = this.f2640f;
        final int i2 = 0;
        if (hVar.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = j1.j.v0(hVar).iterator();
        while (true) {
            if (!it.hasNext()) {
                vVar = null;
                break;
            }
            vVar = ((C0133i) it.next()).f2306b;
            K b2 = this.f2650r.b(vVar.f2358a);
            l lVar = vVar.f2359b;
            if (z2 || lVar.f2660a != i) {
                arrayList.add(b2);
            }
            if (lVar.f2660a == i) {
                break;
            }
        }
        if (vVar == null) {
            int i3 = v.f2357f;
            String str = "Ignoring popBackStack to destination " + t.t(this.f2636a.f2366c, i) + " as it was not found on the current back stack";
            q1.d.e(str, "message");
            Log.i("NavController", str);
            return false;
        }
        ?? obj = new Object();
        j1.h hVar2 = new j1.h();
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                jVar = this;
                z4 = z3;
                break;
            }
            K k2 = (K) it2.next();
            ?? obj2 = new Object();
            C0133i c0133i = (C0133i) hVar.e();
            jVar = this;
            z4 = z3;
            g gVar = new g(obj2, obj, jVar, z4, hVar2);
            q1.d.e(k2, "navigator");
            q1.d.e(c0133i, "popUpTo");
            jVar.f2653u = gVar;
            k2.i(c0133i, z4);
            jVar.f2653u = null;
            if (!obj2.f3541a) {
                break;
            }
            this = jVar;
            z3 = z4;
        }
        if (z4) {
            LinkedHashMap linkedHashMap = jVar.f2643k;
            if (!z2) {
                w1.c cVar = new w1.c(new w1.h(w1.f.y(vVar, new C0125a(9)), new p1.l(jVar) { // from class: i0.h

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ j f2631b;

                    {
                        this.f2631b = jVar;
                    }

                    @Override // p1.l
                    public final Object c(Object obj3) {
                        v vVar2 = (v) obj3;
                        switch (i2) {
                            case 0:
                                q1.d.e(vVar2, "destination");
                                return Boolean.valueOf(!this.f2631b.f2643k.containsKey(Integer.valueOf(vVar2.f2359b.f2660a)));
                            default:
                                q1.d.e(vVar2, "destination");
                                return Boolean.valueOf(!this.f2631b.f2643k.containsKey(Integer.valueOf(vVar2.f2359b.f2660a)));
                        }
                    }
                }, 0));
                while (cVar.hasNext()) {
                    Integer valueOf = Integer.valueOf(((v) cVar.next()).f2359b.f2660a);
                    C0134j c0134j = (C0134j) (hVar2.isEmpty() ? null : hVar2.f2750b[hVar2.f2749a]);
                    linkedHashMap.put(valueOf, c0134j != null ? c0134j.f2311a.f2621b : null);
                }
            }
            if (!hVar2.isEmpty()) {
                C0134j c0134j2 = (C0134j) hVar2.c();
                final int i4 = 1;
                w1.c cVar2 = new w1.c(new w1.h(w1.f.y(jVar.c(c0134j2.f2311a.f2620a, null), new C0125a(10)), new p1.l(jVar) { // from class: i0.h

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ j f2631b;

                    {
                        this.f2631b = jVar;
                    }

                    @Override // p1.l
                    public final Object c(Object obj3) {
                        v vVar2 = (v) obj3;
                        switch (i4) {
                            case 0:
                                q1.d.e(vVar2, "destination");
                                return Boolean.valueOf(!this.f2631b.f2643k.containsKey(Integer.valueOf(vVar2.f2359b.f2660a)));
                            default:
                                q1.d.e(vVar2, "destination");
                                return Boolean.valueOf(!this.f2631b.f2643k.containsKey(Integer.valueOf(vVar2.f2359b.f2660a)));
                        }
                    }
                }, 0));
                while (true) {
                    boolean hasNext = cVar2.hasNext();
                    eVar = c0134j2.f2311a;
                    if (!hasNext) {
                        break;
                    }
                    linkedHashMap.put(Integer.valueOf(((v) cVar2.next()).f2359b.f2660a), eVar.f2621b);
                }
                if (linkedHashMap.values().contains(eVar.f2621b)) {
                    jVar.f2644l.put(eVar.f2621b, hVar2);
                }
            }
        }
        jVar.f2637b.a();
        return obj.f3541a;
    }

    public final void l(C0133i c0133i, boolean z2, j1.h hVar) {
        o oVar;
        A0.c cVar;
        Set set;
        q1.d.e(c0133i, "popUpTo");
        j1.h hVar2 = this.f2640f;
        C0133i c0133i2 = (C0133i) hVar2.e();
        if (!q1.d.a(c0133i2, c0133i)) {
            throw new IllegalStateException(("Attempted to pop " + c0133i.f2306b + ", which is not the top of the back stack (" + c0133i2.f2306b + ')').toString());
        }
        if (hVar2.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        hVar2.remove(j1.k.h0(hVar2));
        n nVar = (n) this.f2651s.get(this.f2650r.b(c0133i2.f2306b.f2358a));
        boolean z3 = true;
        if ((nVar == null || (cVar = nVar.f2323f) == null || (set = (Set) ((y1.c) ((y1.a) cVar.f33b)).a()) == null || !set.contains(c0133i2)) && !this.f2642j.containsKey(c0133i2)) {
            z3 = false;
        }
        EnumC0092o enumC0092o = c0133i2.h.f2618j.f1600c;
        EnumC0092o enumC0092o2 = EnumC0092o.f1592c;
        if (enumC0092o.compareTo(enumC0092o2) >= 0) {
            if (z2) {
                c0133i2.e(enumC0092o2);
                hVar.addFirst(new C0134j(c0133i2));
            }
            if (z3) {
                c0133i2.e(enumC0092o2);
            } else {
                c0133i2.e(EnumC0092o.f1590a);
                q(c0133i2);
            }
        }
        if (z2 || z3 || (oVar = this.f2646n) == null) {
            return;
        }
        String str = c0133i2.f2309f;
        q1.d.e(str, "backStackEntryId");
        V v2 = (V) oVar.f2325b.remove(str);
        if (v2 != null) {
            v2.a();
        }
    }

    public final ArrayList n() {
        EnumC0092o enumC0092o;
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f2651s.values().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            enumC0092o = EnumC0092o.d;
            if (!hasNext) {
                break;
            }
            Iterable iterable = (Iterable) ((y1.c) ((y1.a) ((n) it.next()).f2323f.f33b)).a();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : iterable) {
                C0133i c0133i = (C0133i) obj;
                if (!arrayList.contains(c0133i) && c0133i.h.f2619k.compareTo(enumC0092o) < 0) {
                    arrayList2.add(obj);
                }
            }
            p.l0(arrayList2, arrayList);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = this.f2640f.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            C0133i c0133i2 = (C0133i) next;
            if (!arrayList.contains(c0133i2) && c0133i2.h.f2619k.compareTo(enumC0092o) >= 0) {
                arrayList3.add(next);
            }
        }
        p.l0(arrayList3, arrayList);
        ArrayList arrayList4 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            Object next2 = it3.next();
            if (!(((C0133i) next2).f2306b instanceof w)) {
                arrayList4.add(next2);
            }
        }
        return arrayList4;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, q1.g] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, q1.h] */
    public final boolean o(int i, final Bundle bundle, C0118A c0118a) {
        v g2;
        C0133i c0133i;
        v vVar;
        Bundle bundle2;
        LinkedHashMap linkedHashMap = this.f2643k;
        if (!linkedHashMap.containsKey(Integer.valueOf(i))) {
            return false;
        }
        String str = (String) linkedHashMap.get(Integer.valueOf(i));
        Collection values = linkedHashMap.values();
        q1.d.e(values, "<this>");
        Iterator it = values.iterator();
        while (it.hasNext()) {
            if (q1.d.a((String) it.next(), str)) {
                it.remove();
            }
        }
        LinkedHashMap linkedHashMap2 = this.f2644l;
        q1.k.a(linkedHashMap2);
        j1.h hVar = (j1.h) linkedHashMap2.remove(str);
        final ArrayList arrayList = new ArrayList();
        C0133i c0133i2 = (C0133i) this.f2640f.f();
        if (c0133i2 == null || (g2 = c0133i2.f2306b) == null) {
            g2 = g();
        }
        if (hVar != null) {
            Iterator it2 = hVar.iterator();
            while (it2.hasNext()) {
                C0134j c0134j = (C0134j) it2.next();
                v d = d(c0134j.f2311a.f2620a, g2, null, true);
                e eVar = c0134j.f2311a;
                y yVar = this.f2636a;
                if (d == null) {
                    int i2 = v.f2357f;
                    throw new IllegalStateException(("Restore State failed: destination " + t.t(yVar.f2366c, eVar.f2620a) + " cannot be found from the current destination " + g2).toString());
                }
                U.m mVar = yVar.f2366c;
                EnumC0092o h = h();
                o oVar = this.f2646n;
                q1.d.e(mVar, "context");
                q1.d.e(h, "hostLifecycleState");
                Bundle bundle3 = (Bundle) eVar.f2622c;
                if (bundle3 != null) {
                    bundle3.setClassLoader(mVar.f773a.getClassLoader());
                    bundle2 = bundle3;
                } else {
                    bundle2 = null;
                }
                arrayList.add(I.a(mVar, d, bundle2, h, oVar, eVar.f2621b, (Bundle) eVar.d));
                g2 = d;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            Object next = it3.next();
            if (!(((C0133i) next).f2306b instanceof w)) {
                arrayList3.add(next);
            }
        }
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            C0133i c0133i3 = (C0133i) it4.next();
            List list = (List) j1.j.s0(arrayList2);
            if (q1.d.a((list == null || (c0133i = (C0133i) j1.j.r0(list)) == null || (vVar = c0133i.f2306b) == null) ? null : vVar.f2358a, c0133i3.f2306b.f2358a)) {
                list.add(c0133i3);
            } else {
                arrayList2.add(new ArrayList(new j1.g(new C0133i[]{c0133i3}, true)));
            }
        }
        final ?? obj = new Object();
        Iterator it5 = arrayList2.iterator();
        while (it5.hasNext()) {
            List list2 = (List) it5.next();
            K b2 = this.f2650r.b(((C0133i) j1.j.o0(list2)).f2306b.f2358a);
            final ?? obj2 = new Object();
            this.f2652t = new p1.l() { // from class: i0.i
                @Override // p1.l
                public final Object c(Object obj3) {
                    List list3;
                    C0133i c0133i4 = (C0133i) obj3;
                    q1.d.e(c0133i4, "entry");
                    q1.g.this.f3541a = true;
                    ArrayList arrayList4 = arrayList;
                    int indexOf = arrayList4.indexOf(c0133i4);
                    if (indexOf != -1) {
                        q1.h hVar2 = obj2;
                        int i3 = indexOf + 1;
                        list3 = arrayList4.subList(hVar2.f3542a, i3);
                        hVar2.f3542a = i3;
                    } else {
                        list3 = s.f2755a;
                    }
                    this.a(c0133i4.f2306b, bundle, c0133i4, list3);
                    return i1.g.f2679c;
                }
            };
            b2.d(list2, c0118a);
            this.f2652t = null;
        }
        return obj.f3541a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0383 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x025e  */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r12v3, types: [f0.w, f0.v] */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.Object, f0.w] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(f0.w r33, android.os.Bundle r34) {
        /*
            Method dump skipped, instructions count: 1537
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.j.p(f0.w, android.os.Bundle):void");
    }

    public final void q(C0133i c0133i) {
        q1.d.e(c0133i, "child");
        C0133i c0133i2 = (C0133i) this.i.remove(c0133i);
        if (c0133i2 == null) {
            return;
        }
        LinkedHashMap linkedHashMap = this.f2642j;
        a aVar = (a) linkedHashMap.get(c0133i2);
        Integer valueOf = aVar != null ? Integer.valueOf(aVar.f2610a.decrementAndGet()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            n nVar = (n) this.f2651s.get(this.f2650r.b(c0133i2.f2306b.f2358a));
            if (nVar != null) {
                nVar.c(c0133i2);
            }
            linkedHashMap.remove(c0133i2);
        }
    }

    public final void r() {
        a aVar;
        A0.c cVar;
        Set set;
        ArrayList z02 = j1.j.z0(this.f2640f);
        if (z02.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(new j1.g(new v[]{((C0133i) j1.j.r0(z02)).f2306b}, true));
        ArrayList arrayList2 = new ArrayList();
        if (j1.j.r0(arrayList) instanceof InterfaceC0130f) {
            Iterator it = j1.j.v0(z02).iterator();
            while (it.hasNext()) {
                v vVar = ((C0133i) it.next()).f2306b;
                arrayList2.add(vVar);
                if (!(vVar instanceof InterfaceC0130f) && !(vVar instanceof w)) {
                    break;
                }
            }
        }
        HashMap hashMap = new HashMap();
        for (C0133i c0133i : j1.j.v0(z02)) {
            EnumC0092o enumC0092o = c0133i.h.f2619k;
            v vVar2 = c0133i.f2306b;
            v vVar3 = (v) j1.j.p0(arrayList);
            EnumC0092o enumC0092o2 = EnumC0092o.f1593e;
            EnumC0092o enumC0092o3 = EnumC0092o.d;
            if (vVar3 != null && vVar3.f2359b.f2660a == vVar2.f2359b.f2660a) {
                if (enumC0092o != enumC0092o2) {
                    n nVar = (n) this.f2651s.get(this.f2650r.b(c0133i.f2306b.f2358a));
                    if (q1.d.a((nVar == null || (cVar = nVar.f2323f) == null || (set = (Set) ((y1.c) ((y1.a) cVar.f33b)).a()) == null) ? null : Boolean.valueOf(set.contains(c0133i)), Boolean.TRUE) || ((aVar = (a) this.f2642j.get(c0133i)) != null && aVar.f2610a.get() == 0)) {
                        hashMap.put(c0133i, enumC0092o3);
                    } else {
                        hashMap.put(c0133i, enumC0092o2);
                    }
                }
                v vVar4 = (v) j1.j.p0(arrayList2);
                if (vVar4 != null && vVar4.f2359b.f2660a == vVar2.f2359b.f2660a) {
                    p.m0(arrayList2);
                }
                p.m0(arrayList);
                w wVar = vVar2.f2360c;
                if (wVar != null) {
                    arrayList.add(wVar);
                }
            } else if (arrayList2.isEmpty() || vVar2.f2359b.f2660a != ((v) j1.j.o0(arrayList2)).f2359b.f2660a) {
                c0133i.e(EnumC0092o.f1592c);
            } else {
                v vVar5 = (v) p.m0(arrayList2);
                if (enumC0092o == enumC0092o2) {
                    c0133i.e(enumC0092o3);
                } else if (enumC0092o != enumC0092o3) {
                    hashMap.put(c0133i, enumC0092o3);
                }
                w wVar2 = vVar5.f2360c;
                if (wVar2 != null && !arrayList2.contains(wVar2)) {
                    arrayList2.add(wVar2);
                }
            }
        }
        Iterator it2 = z02.iterator();
        while (it2.hasNext()) {
            C0133i c0133i2 = (C0133i) it2.next();
            EnumC0092o enumC0092o4 = (EnumC0092o) hashMap.get(c0133i2);
            if (enumC0092o4 != null) {
                c0133i2.e(enumC0092o4);
            } else {
                c0133i2.h.b();
            }
        }
    }
}
