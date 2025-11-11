package k;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import com.android.music.R;
import java.util.ArrayList;
import java.util.Iterator;
import l.AbstractC0184F0;
import l.C0190I0;
import l.C0254q0;

/* loaded from: classes.dex */
public final class g extends u implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: b, reason: collision with root package name */
    public final Context f2803b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2804c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2805e;

    /* renamed from: f, reason: collision with root package name */
    public final Handler f2806f;

    /* renamed from: n, reason: collision with root package name */
    public View f2812n;

    /* renamed from: o, reason: collision with root package name */
    public View f2813o;

    /* renamed from: p, reason: collision with root package name */
    public int f2814p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2815q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2816r;

    /* renamed from: s, reason: collision with root package name */
    public int f2817s;

    /* renamed from: t, reason: collision with root package name */
    public int f2818t;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2820v;

    /* renamed from: w, reason: collision with root package name */
    public x f2821w;

    /* renamed from: x, reason: collision with root package name */
    public ViewTreeObserver f2822x;

    /* renamed from: y, reason: collision with root package name */
    public v f2823y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f2824z;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f2807g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ViewTreeObserverOnGlobalLayoutListenerC0170d i = new ViewTreeObserverOnGlobalLayoutListenerC0170d(0, this);

    /* renamed from: j, reason: collision with root package name */
    public final W0.n f2808j = new W0.n(2, this);

    /* renamed from: k, reason: collision with root package name */
    public final A0.c f2809k = new A0.c(21, this);

    /* renamed from: l, reason: collision with root package name */
    public int f2810l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f2811m = 0;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2819u = false;

    public g(Context context, View view, int i, boolean z2) {
        this.f2803b = context;
        this.f2812n = view;
        this.d = i;
        this.f2805e = z2;
        this.f2814p = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f2804c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f2806f = new Handler();
    }

    @Override // k.InterfaceC0166C
    public final boolean a() {
        ArrayList arrayList = this.h;
        return arrayList.size() > 0 && ((f) arrayList.get(0)).f2800a.f2960z.isShowing();
    }

    @Override // k.y
    public final void b(m mVar, boolean z2) {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (mVar == ((f) arrayList.get(i)).f2801b) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        int i2 = i + 1;
        if (i2 < arrayList.size()) {
            ((f) arrayList.get(i2)).f2801b.c(false);
        }
        f fVar = (f) arrayList.remove(i);
        fVar.f2801b.r(this);
        boolean z3 = this.f2824z;
        C0190I0 c0190i0 = fVar.f2800a;
        if (z3) {
            AbstractC0184F0.b(c0190i0.f2960z, null);
            c0190i0.f2960z.setAnimationStyle(0);
        }
        c0190i0.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f2814p = ((f) arrayList.get(size2 - 1)).f2802c;
        } else {
            this.f2814p = this.f2812n.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z2) {
                ((f) arrayList.get(0)).f2801b.c(false);
                return;
            }
            return;
        }
        dismiss();
        x xVar = this.f2821w;
        if (xVar != null) {
            xVar.b(mVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.f2822x;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f2822x.removeGlobalOnLayoutListener(this.i);
            }
            this.f2822x = null;
        }
        this.f2813o.removeOnAttachStateChangeListener(this.f2808j);
        this.f2823y.onDismiss();
    }

    @Override // k.InterfaceC0166C
    public final void dismiss() {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        if (size > 0) {
            f[] fVarArr = (f[]) arrayList.toArray(new f[size]);
            for (int i = size - 1; i >= 0; i--) {
                f fVar = fVarArr[i];
                if (fVar.f2800a.f2960z.isShowing()) {
                    fVar.f2800a.dismiss();
                }
            }
        }
    }

    @Override // k.InterfaceC0166C
    public final C0254q0 e() {
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((f) arrayList.get(arrayList.size() - 1)).f2800a.f2940c;
    }

    @Override // k.y
    public final boolean f(E e2) {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            if (e2 == fVar.f2801b) {
                fVar.f2800a.f2940c.requestFocus();
                return true;
            }
        }
        if (!e2.hasVisibleItems()) {
            return false;
        }
        n(e2);
        x xVar = this.f2821w;
        if (xVar != null) {
            xVar.g(e2);
        }
        return true;
    }

    @Override // k.y
    public final void g(x xVar) {
        this.f2821w = xVar;
    }

    @Override // k.y
    public final boolean j() {
        return false;
    }

    @Override // k.y
    public final Parcelable k() {
        return null;
    }

    @Override // k.y
    public final void l(boolean z2) {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((f) it.next()).f2800a.f2940c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((j) adapter).notifyDataSetChanged();
        }
    }

    @Override // k.y
    public final void m(Parcelable parcelable) {
    }

    @Override // k.u
    public final void n(m mVar) {
        mVar.b(this, this.f2803b);
        if (a()) {
            x(mVar);
        } else {
            this.f2807g.add(mVar);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        f fVar;
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                fVar = null;
                break;
            }
            fVar = (f) arrayList.get(i);
            if (!fVar.f2800a.f2960z.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (fVar != null) {
            fVar.f2801b.c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // k.u
    public final void p(View view) {
        if (this.f2812n != view) {
            this.f2812n = view;
            this.f2811m = Gravity.getAbsoluteGravity(this.f2810l, view.getLayoutDirection());
        }
    }

    @Override // k.u
    public final void q(boolean z2) {
        this.f2819u = z2;
    }

    @Override // k.u
    public final void r(int i) {
        if (this.f2810l != i) {
            this.f2810l = i;
            this.f2811m = Gravity.getAbsoluteGravity(i, this.f2812n.getLayoutDirection());
        }
    }

    @Override // k.u
    public final void s(int i) {
        this.f2815q = true;
        this.f2817s = i;
    }

    @Override // k.InterfaceC0166C
    public final void show() {
        if (a()) {
            return;
        }
        ArrayList arrayList = this.f2807g;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            x((m) it.next());
        }
        arrayList.clear();
        View view = this.f2812n;
        this.f2813o = view;
        if (view != null) {
            boolean z2 = this.f2822x == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f2822x = viewTreeObserver;
            if (z2) {
                viewTreeObserver.addOnGlobalLayoutListener(this.i);
            }
            this.f2813o.addOnAttachStateChangeListener(this.f2808j);
        }
    }

    @Override // k.u
    public final void t(PopupWindow.OnDismissListener onDismissListener) {
        this.f2823y = (v) onDismissListener;
    }

    @Override // k.u
    public final void u(boolean z2) {
        this.f2820v = z2;
    }

    @Override // k.u
    public final void v(int i) {
        this.f2816r = true;
        this.f2818t = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x012a, code lost:
    
        if (((r8.getWidth() + r9[0]) + r5) > r11.right) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x012c, code lost:
    
        r13 = 0;
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x012f, code lost:
    
        r8 = 1;
        r13 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0135, code lost:
    
        if ((r9[0] - r5) < 0) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0165  */
    /* JADX WARN: Type inference failed for: r7v0, types: [l.I0, l.D0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x(k.m r18) {
        /*
            Method dump skipped, instructions count: 449
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k.g.x(k.m):void");
    }
}
