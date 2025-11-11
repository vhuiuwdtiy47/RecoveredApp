package k;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.android.music.R;
import l.C0180D0;
import l.C0190I0;
import l.C0254q0;

/* loaded from: classes.dex */
public final class D extends u implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: b, reason: collision with root package name */
    public final Context f2762b;

    /* renamed from: c, reason: collision with root package name */
    public final m f2763c;
    public final j d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2764e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2765f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2766g;
    public final C0190I0 h;

    /* renamed from: k, reason: collision with root package name */
    public v f2768k;

    /* renamed from: l, reason: collision with root package name */
    public View f2769l;

    /* renamed from: m, reason: collision with root package name */
    public View f2770m;

    /* renamed from: n, reason: collision with root package name */
    public x f2771n;

    /* renamed from: o, reason: collision with root package name */
    public ViewTreeObserver f2772o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2773p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2774q;

    /* renamed from: r, reason: collision with root package name */
    public int f2775r;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2777t;
    public final ViewTreeObserverOnGlobalLayoutListenerC0170d i = new ViewTreeObserverOnGlobalLayoutListenerC0170d(1, this);

    /* renamed from: j, reason: collision with root package name */
    public final W0.n f2767j = new W0.n(3, this);

    /* renamed from: s, reason: collision with root package name */
    public int f2776s = 0;

    /* JADX WARN: Type inference failed for: r6v1, types: [l.I0, l.D0] */
    public D(int i, Context context, View view, m mVar, boolean z2) {
        this.f2762b = context;
        this.f2763c = mVar;
        this.f2764e = z2;
        this.d = new j(mVar, LayoutInflater.from(context), z2, R.layout.abc_popup_menu_item_layout);
        this.f2766g = i;
        Resources resources = context.getResources();
        this.f2765f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f2769l = view;
        this.h = new C0180D0(context, null, i);
        mVar.b(this, context);
    }

    @Override // k.InterfaceC0166C
    public final boolean a() {
        return !this.f2773p && this.h.f2960z.isShowing();
    }

    @Override // k.y
    public final void b(m mVar, boolean z2) {
        if (mVar != this.f2763c) {
            return;
        }
        dismiss();
        x xVar = this.f2771n;
        if (xVar != null) {
            xVar.b(mVar, z2);
        }
    }

    @Override // k.InterfaceC0166C
    public final void dismiss() {
        if (a()) {
            this.h.dismiss();
        }
    }

    @Override // k.InterfaceC0166C
    public final C0254q0 e() {
        return this.h.f2940c;
    }

    @Override // k.y
    public final boolean f(E e2) {
        if (e2.hasVisibleItems()) {
            View view = this.f2770m;
            w wVar = new w(this.f2766g, this.f2762b, view, e2, this.f2764e);
            x xVar = this.f2771n;
            wVar.h = xVar;
            u uVar = wVar.i;
            if (uVar != null) {
                uVar.g(xVar);
            }
            boolean w2 = u.w(e2);
            wVar.f2904g = w2;
            u uVar2 = wVar.i;
            if (uVar2 != null) {
                uVar2.q(w2);
            }
            wVar.f2905j = this.f2768k;
            this.f2768k = null;
            this.f2763c.c(false);
            C0190I0 c0190i0 = this.h;
            int i = c0190i0.f2942f;
            int i2 = c0190i0.i();
            if ((Gravity.getAbsoluteGravity(this.f2776s, this.f2769l.getLayoutDirection()) & 7) == 5) {
                i += this.f2769l.getWidth();
            }
            if (!wVar.b()) {
                if (wVar.f2902e != null) {
                    wVar.d(i, i2, true, true);
                }
            }
            x xVar2 = this.f2771n;
            if (xVar2 != null) {
                xVar2.g(e2);
            }
            return true;
        }
        return false;
    }

    @Override // k.y
    public final void g(x xVar) {
        this.f2771n = xVar;
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
        this.f2774q = false;
        j jVar = this.d;
        if (jVar != null) {
            jVar.notifyDataSetChanged();
        }
    }

    @Override // k.y
    public final void m(Parcelable parcelable) {
    }

    @Override // k.u
    public final void n(m mVar) {
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f2773p = true;
        this.f2763c.c(true);
        ViewTreeObserver viewTreeObserver = this.f2772o;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f2772o = this.f2770m.getViewTreeObserver();
            }
            this.f2772o.removeGlobalOnLayoutListener(this.i);
            this.f2772o = null;
        }
        this.f2770m.removeOnAttachStateChangeListener(this.f2767j);
        v vVar = this.f2768k;
        if (vVar != null) {
            vVar.onDismiss();
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
        this.f2769l = view;
    }

    @Override // k.u
    public final void q(boolean z2) {
        this.d.f2834c = z2;
    }

    @Override // k.u
    public final void r(int i) {
        this.f2776s = i;
    }

    @Override // k.u
    public final void s(int i) {
        this.h.f2942f = i;
    }

    @Override // k.InterfaceC0166C
    public final void show() {
        View view;
        if (a()) {
            return;
        }
        if (this.f2773p || (view = this.f2769l) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f2770m = view;
        C0190I0 c0190i0 = this.h;
        c0190i0.f2960z.setOnDismissListener(this);
        c0190i0.f2950p = this;
        c0190i0.f2959y = true;
        c0190i0.f2960z.setFocusable(true);
        View view2 = this.f2770m;
        boolean z2 = this.f2772o == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f2772o = viewTreeObserver;
        if (z2) {
            viewTreeObserver.addOnGlobalLayoutListener(this.i);
        }
        view2.addOnAttachStateChangeListener(this.f2767j);
        c0190i0.f2949o = view2;
        c0190i0.f2946l = this.f2776s;
        boolean z3 = this.f2774q;
        Context context = this.f2762b;
        j jVar = this.d;
        if (!z3) {
            this.f2775r = u.o(jVar, context, this.f2765f);
            this.f2774q = true;
        }
        c0190i0.p(this.f2775r);
        c0190i0.f2960z.setInputMethodMode(2);
        Rect rect = this.f2897a;
        c0190i0.f2958x = rect != null ? new Rect(rect) : null;
        c0190i0.show();
        C0254q0 c0254q0 = c0190i0.f2940c;
        c0254q0.setOnKeyListener(this);
        if (this.f2777t) {
            m mVar = this.f2763c;
            if (mVar.f2847m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c0254q0, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(mVar.f2847m);
                }
                frameLayout.setEnabled(false);
                c0254q0.addHeaderView(frameLayout, null, false);
            }
        }
        c0190i0.m(jVar);
        c0190i0.show();
    }

    @Override // k.u
    public final void t(PopupWindow.OnDismissListener onDismissListener) {
        this.f2768k = (v) onDismissListener;
    }

    @Override // k.u
    public final void u(boolean z2) {
        this.f2777t = z2;
    }

    @Override // k.u
    public final void v(int i) {
        this.h.k(i);
    }
}
