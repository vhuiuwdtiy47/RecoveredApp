package L;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.net.Uri;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.wechat.Platform;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Matcher;
import l.AbstractC0271z;
import l.C0212U;
import l.C0263v;
import n0.C0279b;
import n0.C0301y;
import t.C0326d;
import t.C0327e;
import u.C0345b;
import w.C0368f;

/* renamed from: L.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0016l {

    /* renamed from: e, reason: collision with root package name */
    public static C0016l f359e;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f360a;

    /* renamed from: b, reason: collision with root package name */
    public Object f361b;

    /* renamed from: c, reason: collision with root package name */
    public Object f362c;
    public Object d;

    public /* synthetic */ C0016l() {
        this.f360a = 6;
    }

    public static boolean c(Editable editable, KeyEvent keyEvent, boolean z2) {
        U.z[] zVarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (zVarArr = (U.z[]) editable.getSpans(selectionStart, selectionEnd, U.z.class)) != null && zVarArr.length > 0) {
                for (U.z zVar : zVarArr) {
                    int spanStart = editable.getSpanStart(zVar);
                    int spanEnd = editable.getSpanEnd(zVar);
                    if ((z2 && spanStart == selectionStart) || ((!z2 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static C0016l s(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        return new C0016l(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
    }

    public void a(View view, int i, boolean z2) {
        RecyclerView recyclerView = ((C0301y) this.f361b).f3472a;
        int childCount = i < 0 ? recyclerView.getChildCount() : k(i);
        ((C0279b) this.f362c).e(childCount, z2);
        if (z2) {
            p(view);
        }
        recyclerView.addView(view, childCount);
        RecyclerView.I(view);
    }

    public void b(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z2) {
        RecyclerView recyclerView = ((C0301y) this.f361b).f3472a;
        int childCount = i < 0 ? recyclerView.getChildCount() : k(i);
        ((C0279b) this.f362c).e(childCount, z2);
        if (z2) {
            p(view);
        }
        n0.W I2 = RecyclerView.I(view);
        if (I2 != null) {
            if (!I2.j() && !I2.o()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + I2 + recyclerView.y());
            }
            I2.f3303j &= -257;
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    public void d(int i) {
        n0.W I2;
        int k2 = k(i);
        ((C0279b) this.f362c).f(k2);
        RecyclerView recyclerView = ((C0301y) this.f361b).f3472a;
        View childAt = recyclerView.getChildAt(k2);
        if (childAt != null && (I2 = RecyclerView.I(childAt)) != null) {
            if (I2.j() && !I2.o()) {
                throw new IllegalArgumentException("called detach on an already detached child " + I2 + recyclerView.y());
            }
            I2.a(256);
        }
        recyclerView.detachViewFromParent(k2);
    }

    public View e(int i) {
        return ((C0301y) this.f361b).f3472a.getChildAt(k(i));
    }

    public int f() {
        return ((C0301y) this.f361b).f3472a.getChildCount() - ((ArrayList) this.d).size();
    }

    public ColorStateList g(int i) {
        int resourceId;
        ColorStateList v2;
        TypedArray typedArray = (TypedArray) this.f362c;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (v2 = Z0.i.v((Context) this.f361b, resourceId)) == null) ? typedArray.getColorStateList(i) : v2;
    }

    public Drawable h(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f362c;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : U.t.u((Context) this.f361b, resourceId);
    }

    public Drawable i(int i) {
        int resourceId;
        Drawable d;
        if (!((TypedArray) this.f362c).hasValue(i) || (resourceId = ((TypedArray) this.f362c).getResourceId(i, 0)) == 0) {
            return null;
        }
        C0263v a2 = C0263v.a();
        Context context = (Context) this.f361b;
        synchronized (a2) {
            d = a2.f3161a.d(context, resourceId, true);
        }
        return d;
    }

    public Typeface j(int i, int i2, C0212U c0212u) {
        int resourceId = ((TypedArray) this.f362c).getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.d) == null) {
            this.d = new TypedValue();
        }
        TypedValue typedValue = (TypedValue) this.d;
        ThreadLocal threadLocal = C.r.f73a;
        Context context = (Context) this.f361b;
        if (context.isRestricted()) {
            return null;
        }
        return C.r.b(context, resourceId, typedValue, i2, c0212u, true, false);
    }

    public int k(int i) {
        if (i < 0) {
            return -1;
        }
        int childCount = ((C0301y) this.f361b).f3472a.getChildCount();
        int i2 = i;
        while (i2 < childCount) {
            C0279b c0279b = (C0279b) this.f362c;
            int b2 = i - (i2 - c0279b.b(i2));
            if (b2 == 0) {
                while (c0279b.d(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += b2;
        }
        return -1;
    }

    public u1.c l() {
        Matcher matcher = (Matcher) this.f361b;
        return AbstractC0271z.w(matcher.start(), matcher.end());
    }

    public View m(int i) {
        return ((C0301y) this.f361b).f3472a.getChildAt(i);
    }

    public int n() {
        return ((C0301y) this.f361b).f3472a.getChildCount();
    }

    public boolean o(CharSequence charSequence, int i, int i2, U.y yVar) {
        if ((yVar.f799c & 3) == 0) {
            U.c cVar = (U.c) this.d;
            V.a b2 = yVar.b();
            int a2 = b2.a(8);
            if (a2 != 0) {
                ((ByteBuffer) b2.d).getShort(a2 + b2.f304a);
            }
            cVar.getClass();
            ThreadLocal threadLocal = U.c.f749b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            TextPaint textPaint = cVar.f750a;
            String sb2 = sb.toString();
            int i3 = D.e.f95a;
            boolean a3 = D.d.a(textPaint, sb2);
            int i4 = yVar.f799c & 4;
            yVar.f799c = a3 ? i4 | 2 : i4 | 1;
        }
        return (yVar.f799c & 3) == 2;
    }

    public void p(View view) {
        ((ArrayList) this.d).add(view);
        C0301y c0301y = (C0301y) this.f361b;
        n0.W I2 = RecyclerView.I(view);
        if (I2 != null) {
            int i = I2.f3310q;
            View view2 = I2.f3297a;
            if (i != -1) {
                I2.f3309p = i;
            } else {
                WeakHashMap weakHashMap = S.f311a;
                I2.f3309p = view2.getImportantForAccessibility();
            }
            RecyclerView recyclerView = c0301y.f3472a;
            if (recyclerView.L()) {
                I2.f3310q = 4;
                recyclerView.f1689p0.add(I2);
            } else {
                WeakHashMap weakHashMap2 = S.f311a;
                view2.setImportantForAccessibility(4);
            }
        }
    }

    public boolean q(int i, C0326d c0326d, C0368f c0368f) {
        int[] iArr = c0326d.f3741p0;
        int i2 = iArr[0];
        C0345b c0345b = (C0345b) this.f362c;
        c0345b.f3888a = i2;
        c0345b.f3889b = iArr[1];
        c0345b.f3890c = c0326d.q();
        c0345b.d = c0326d.k();
        c0345b.i = false;
        c0345b.f3894j = i;
        boolean z2 = c0345b.f3888a == 3;
        boolean z3 = c0345b.f3889b == 3;
        boolean z4 = z2 && c0326d.f3710W > 0.0f;
        boolean z5 = z3 && c0326d.f3710W > 0.0f;
        int[] iArr2 = c0326d.f3745t;
        if (z4 && iArr2[0] == 4) {
            c0345b.f3888a = 1;
        }
        if (z5 && iArr2[1] == 4) {
            c0345b.f3889b = 1;
        }
        c0368f.b(c0326d, c0345b);
        c0326d.O(c0345b.f3891e);
        c0326d.L(c0345b.f3892f);
        c0326d.f3693E = c0345b.h;
        c0326d.I(c0345b.f3893g);
        c0345b.f3894j = 0;
        return c0345b.i;
    }

    public C0016l r() {
        Matcher matcher = (Matcher) this.f361b;
        int end = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        String str = (String) this.f362c;
        if (end > str.length()) {
            return null;
        }
        Matcher matcher2 = matcher.pattern().matcher(str);
        q1.d.d(matcher2, "matcher(...)");
        if (matcher2.find(end)) {
            return new C0016l(matcher2, str);
        }
        return null;
    }

    public Object t(CharSequence charSequence, int i, int i2, int i3, boolean z2, U.p pVar) {
        int i4;
        char c2;
        U.q qVar = new U.q((U.u) ((U.v) this.f362c).f792c);
        int codePointAt = Character.codePointAt(charSequence, i);
        boolean z3 = true;
        int i5 = 0;
        int i6 = i;
        loop0: while (true) {
            i4 = i6;
            while (i6 < i2 && i5 < i3 && z3) {
                SparseArray sparseArray = qVar.f776c.f788a;
                U.u uVar = sparseArray == null ? null : (U.u) sparseArray.get(codePointAt);
                if (qVar.f774a == 2) {
                    if (uVar != null) {
                        qVar.f776c = uVar;
                        qVar.f778f++;
                    } else {
                        if (codePointAt == 65038) {
                            qVar.a();
                        } else if (codePointAt != 65039) {
                            U.u uVar2 = qVar.f776c;
                            if (uVar2.f789b != null) {
                                if (qVar.f778f != 1) {
                                    qVar.d = uVar2;
                                    qVar.a();
                                } else if (qVar.b()) {
                                    qVar.d = qVar.f776c;
                                    qVar.a();
                                } else {
                                    qVar.a();
                                }
                                c2 = 3;
                            } else {
                                qVar.a();
                            }
                        }
                        c2 = 1;
                    }
                    c2 = 2;
                } else if (uVar == null) {
                    qVar.a();
                    c2 = 1;
                } else {
                    qVar.f774a = 2;
                    qVar.f776c = uVar;
                    qVar.f778f = 1;
                    c2 = 2;
                }
                qVar.f777e = codePointAt;
                if (c2 == 1) {
                    i6 = Character.charCount(Character.codePointAt(charSequence, i4)) + i4;
                    if (i6 < i2) {
                        codePointAt = Character.codePointAt(charSequence, i6);
                    }
                } else if (c2 == 2) {
                    int charCount = Character.charCount(codePointAt) + i6;
                    if (charCount < i2) {
                        codePointAt = Character.codePointAt(charSequence, charCount);
                    }
                    i6 = charCount;
                } else if (c2 == 3) {
                    if (z2 || !o(charSequence, i4, i6, qVar.d.f789b)) {
                        z3 = pVar.s(charSequence, i4, i6, qVar.d.f789b);
                        i5++;
                    }
                }
            }
        }
        if (qVar.f774a == 2 && qVar.f776c.f789b != null && ((qVar.f778f > 1 || qVar.b()) && i5 < i3 && z3 && (z2 || !o(charSequence, i4, i6, qVar.f776c.f789b)))) {
            pVar.s(charSequence, i4, i6, qVar.f776c.f789b);
        }
        return pVar.h();
    }

    public String toString() {
        switch (this.f360a) {
            case 2:
                StringBuilder sb = new StringBuilder("NavDeepLinkRequest{");
                Uri uri = (Uri) this.f361b;
                if (uri != null) {
                    sb.append(" uri=");
                    sb.append(String.valueOf(uri));
                }
                String str = (String) this.f362c;
                if (str != null) {
                    sb.append(" action=");
                    sb.append(str);
                }
                String str2 = (String) this.d;
                if (str2 != null) {
                    sb.append(" mimetype=");
                    sb.append(str2);
                }
                sb.append(" }");
                String sb2 = sb.toString();
                q1.d.d(sb2, "toString(...)");
                return sb2;
            case Platform.WARN /* 5 */:
                return ((C0279b) this.f362c).toString() + ", hidden list:" + ((ArrayList) this.d).size();
            default:
                return super.toString();
        }
    }

    public void u() {
        ((TypedArray) this.f362c).recycle();
    }

    public void v(C0327e c0327e, int i, int i2, int i3) {
        c0327e.getClass();
        int i4 = c0327e.b0;
        int i5 = c0327e.f3718c0;
        c0327e.b0 = 0;
        c0327e.f3718c0 = 0;
        c0327e.O(i2);
        c0327e.L(i3);
        if (i4 < 0) {
            c0327e.b0 = 0;
        } else {
            c0327e.b0 = i4;
        }
        if (i5 < 0) {
            c0327e.f3718c0 = 0;
        } else {
            c0327e.f3718c0 = i5;
        }
        C0327e c0327e2 = (C0327e) this.d;
        c0327e2.f3765t0 = i;
        c0327e2.U();
    }

    public void w(View view) {
        if (((ArrayList) this.d).remove(view)) {
            C0301y c0301y = (C0301y) this.f361b;
            n0.W I2 = RecyclerView.I(view);
            if (I2 != null) {
                int i = I2.f3309p;
                RecyclerView recyclerView = c0301y.f3472a;
                if (recyclerView.L()) {
                    I2.f3310q = i;
                    recyclerView.f1689p0.add(I2);
                } else {
                    WeakHashMap weakHashMap = S.f311a;
                    I2.f3297a.setImportantForAccessibility(i);
                }
                I2.f3309p = 0;
            }
        }
    }

    public void x(C0327e c0327e) {
        ArrayList arrayList = (ArrayList) this.f361b;
        arrayList.clear();
        int size = c0327e.f3763q0.size();
        for (int i = 0; i < size; i++) {
            C0326d c0326d = (C0326d) c0327e.f3763q0.get(i);
            int[] iArr = c0326d.f3741p0;
            if (iArr[0] == 3 || iArr[1] == 3) {
                arrayList.add(c0326d);
            }
        }
        c0327e.f3764s0.f3898b = true;
    }

    public C0016l(Uri uri, String str, String str2) {
        this.f360a = 2;
        this.f361b = uri;
        this.f362c = str;
        this.d = str2;
    }

    public C0016l(C0301y c0301y) {
        this.f360a = 5;
        this.f361b = c0301y;
        this.f362c = new C0279b();
        this.d = new ArrayList();
    }

    public C0016l(Runnable runnable) {
        this.f360a = 0;
        this.f362c = new CopyOnWriteArrayList();
        this.d = new HashMap();
        this.f361b = runnable;
    }

    public C0016l(Context context, TypedArray typedArray) {
        this.f360a = 4;
        this.f361b = context;
        this.f362c = typedArray;
    }

    public C0016l(Context context, LocationManager locationManager) {
        this.f360a = 3;
        this.d = new Object();
        this.f361b = context;
        this.f362c = locationManager;
    }

    public C0016l(C0327e c0327e) {
        this.f360a = 7;
        this.f361b = new ArrayList();
        this.f362c = new Object();
        this.d = c0327e;
    }

    public C0016l(U.v vVar, T0.e eVar, U.c cVar, Set set) {
        this.f360a = 1;
        this.f361b = eVar;
        this.f362c = vVar;
        this.d = cVar;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            t(str, 0, str.length(), 1, true, new A0.c(11, str));
        }
    }

    public C0016l(Matcher matcher, String str) {
        this.f360a = 8;
        q1.d.e(str, "input");
        this.f361b = matcher;
        this.f362c = str;
        this.d = new x1.b(this);
    }
}
