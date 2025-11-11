package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import f.AbstractC0117a;
import k.InterfaceC0166C;

/* renamed from: l.D0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0180D0 implements InterfaceC0166C {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2938a;

    /* renamed from: b, reason: collision with root package name */
    public ListAdapter f2939b;

    /* renamed from: c, reason: collision with root package name */
    public C0254q0 f2940c;

    /* renamed from: f, reason: collision with root package name */
    public int f2942f;

    /* renamed from: g, reason: collision with root package name */
    public int f2943g;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2944j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2945k;

    /* renamed from: n, reason: collision with root package name */
    public C0174A0 f2948n;

    /* renamed from: o, reason: collision with root package name */
    public View f2949o;

    /* renamed from: p, reason: collision with root package name */
    public AdapterView.OnItemClickListener f2950p;

    /* renamed from: q, reason: collision with root package name */
    public AdapterView.OnItemSelectedListener f2951q;

    /* renamed from: v, reason: collision with root package name */
    public final Handler f2956v;

    /* renamed from: x, reason: collision with root package name */
    public Rect f2958x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f2959y;

    /* renamed from: z, reason: collision with root package name */
    public final C0179D f2960z;
    public final int d = -2;

    /* renamed from: e, reason: collision with root package name */
    public int f2941e = -2;
    public final int h = 1002;

    /* renamed from: l, reason: collision with root package name */
    public int f2946l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final int f2947m = Integer.MAX_VALUE;

    /* renamed from: r, reason: collision with root package name */
    public final RunnableC0272z0 f2952r = new RunnableC0272z0(this, 1);

    /* renamed from: s, reason: collision with root package name */
    public final ViewOnTouchListenerC0178C0 f2953s = new ViewOnTouchListenerC0178C0(this);

    /* renamed from: t, reason: collision with root package name */
    public final C0176B0 f2954t = new C0176B0(this);

    /* renamed from: u, reason: collision with root package name */
    public final RunnableC0272z0 f2955u = new RunnableC0272z0(this, 0);

    /* renamed from: w, reason: collision with root package name */
    public final Rect f2957w = new Rect();

    /* JADX WARN: Type inference failed for: r1v9, types: [l.D, android.widget.PopupWindow] */
    public C0180D0(Context context, AttributeSet attributeSet, int i) {
        int resourceId;
        this.f2938a = context;
        this.f2956v = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0117a.f2246o, i, 0);
        this.f2942f = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f2943g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.i = true;
        }
        obtainStyledAttributes.recycle();
        ?? popupWindow = new PopupWindow(context, attributeSet, i, 0);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC0117a.f2250s, i, 0);
        if (obtainStyledAttributes2.hasValue(2)) {
            R.l.c(popupWindow, obtainStyledAttributes2.getBoolean(2, false));
        }
        popupWindow.setBackgroundDrawable((!obtainStyledAttributes2.hasValue(0) || (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) == 0) ? obtainStyledAttributes2.getDrawable(0) : U.t.u(context, resourceId));
        obtainStyledAttributes2.recycle();
        this.f2960z = popupWindow;
        popupWindow.setInputMethodMode(1);
    }

    @Override // k.InterfaceC0166C
    public final boolean a() {
        return this.f2960z.isShowing();
    }

    public final void c(int i) {
        this.f2942f = i;
    }

    public final int d() {
        return this.f2942f;
    }

    @Override // k.InterfaceC0166C
    public final void dismiss() {
        C0179D c0179d = this.f2960z;
        c0179d.dismiss();
        c0179d.setContentView(null);
        this.f2940c = null;
        this.f2956v.removeCallbacks(this.f2952r);
    }

    @Override // k.InterfaceC0166C
    public final C0254q0 e() {
        return this.f2940c;
    }

    public final int i() {
        if (this.i) {
            return this.f2943g;
        }
        return 0;
    }

    public final void j(Drawable drawable) {
        this.f2960z.setBackgroundDrawable(drawable);
    }

    public final void k(int i) {
        this.f2943g = i;
        this.i = true;
    }

    public final Drawable l() {
        return this.f2960z.getBackground();
    }

    public void m(ListAdapter listAdapter) {
        C0174A0 c0174a0 = this.f2948n;
        if (c0174a0 == null) {
            this.f2948n = new C0174A0(this);
        } else {
            ListAdapter listAdapter2 = this.f2939b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(c0174a0);
            }
        }
        this.f2939b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f2948n);
        }
        C0254q0 c0254q0 = this.f2940c;
        if (c0254q0 != null) {
            c0254q0.setAdapter(this.f2939b);
        }
    }

    public C0254q0 o(Context context, boolean z2) {
        return new C0254q0(context, z2);
    }

    public final void p(int i) {
        Drawable background = this.f2960z.getBackground();
        if (background == null) {
            this.f2941e = i;
            return;
        }
        Rect rect = this.f2957w;
        background.getPadding(rect);
        this.f2941e = rect.left + rect.right + i;
    }

    @Override // k.InterfaceC0166C
    public final void show() {
        int i;
        int paddingBottom;
        C0254q0 c0254q0;
        C0254q0 c0254q02 = this.f2940c;
        C0179D c0179d = this.f2960z;
        Context context = this.f2938a;
        if (c0254q02 == null) {
            C0254q0 o2 = o(context, !this.f2959y);
            this.f2940c = o2;
            o2.setAdapter(this.f2939b);
            this.f2940c.setOnItemClickListener(this.f2950p);
            this.f2940c.setFocusable(true);
            this.f2940c.setFocusableInTouchMode(true);
            this.f2940c.setOnItemSelectedListener(new C0266w0(this));
            this.f2940c.setOnScrollListener(this.f2954t);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f2951q;
            if (onItemSelectedListener != null) {
                this.f2940c.setOnItemSelectedListener(onItemSelectedListener);
            }
            c0179d.setContentView(this.f2940c);
        }
        Drawable background = c0179d.getBackground();
        Rect rect = this.f2957w;
        if (background != null) {
            background.getPadding(rect);
            int i2 = rect.top;
            i = rect.bottom + i2;
            if (!this.i) {
                this.f2943g = -i2;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        int a2 = AbstractC0268x0.a(c0179d, this.f2949o, this.f2943g, c0179d.getInputMethodMode() == 2);
        int i3 = this.d;
        if (i3 == -1) {
            paddingBottom = a2 + i;
        } else {
            int i4 = this.f2941e;
            int a3 = this.f2940c.a(i4 != -2 ? i4 != -1 ? View.MeasureSpec.makeMeasureSpec(i4, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), a2);
            paddingBottom = a3 + (a3 > 0 ? this.f2940c.getPaddingBottom() + this.f2940c.getPaddingTop() + i : 0);
        }
        boolean z2 = this.f2960z.getInputMethodMode() == 2;
        R.l.d(c0179d, this.h);
        if (c0179d.isShowing()) {
            if (this.f2949o.isAttachedToWindow()) {
                int i5 = this.f2941e;
                if (i5 == -1) {
                    i5 = -1;
                } else if (i5 == -2) {
                    i5 = this.f2949o.getWidth();
                }
                if (i3 == -1) {
                    i3 = z2 ? paddingBottom : -1;
                    if (z2) {
                        c0179d.setWidth(this.f2941e == -1 ? -1 : 0);
                        c0179d.setHeight(0);
                    } else {
                        c0179d.setWidth(this.f2941e == -1 ? -1 : 0);
                        c0179d.setHeight(-1);
                    }
                } else if (i3 == -2) {
                    i3 = paddingBottom;
                }
                c0179d.setOutsideTouchable(true);
                View view = this.f2949o;
                int i6 = this.f2942f;
                int i7 = this.f2943g;
                if (i5 < 0) {
                    i5 = -1;
                }
                c0179d.update(view, i6, i7, i5, i3 < 0 ? -1 : i3);
                return;
            }
            return;
        }
        int i8 = this.f2941e;
        if (i8 == -1) {
            i8 = -1;
        } else if (i8 == -2) {
            i8 = this.f2949o.getWidth();
        }
        if (i3 == -1) {
            i3 = -1;
        } else if (i3 == -2) {
            i3 = paddingBottom;
        }
        c0179d.setWidth(i8);
        c0179d.setHeight(i3);
        AbstractC0270y0.b(c0179d, true);
        c0179d.setOutsideTouchable(true);
        c0179d.setTouchInterceptor(this.f2953s);
        if (this.f2945k) {
            R.l.c(c0179d, this.f2944j);
        }
        AbstractC0270y0.a(c0179d, this.f2958x);
        c0179d.showAsDropDown(this.f2949o, this.f2942f, this.f2943g, this.f2946l);
        this.f2940c.setSelection(-1);
        if ((!this.f2959y || this.f2940c.isInTouchMode()) && (c0254q0 = this.f2940c) != null) {
            c0254q0.setListSelectionHidden(true);
            c0254q0.requestLayout();
        }
        if (this.f2959y) {
            return;
        }
        this.f2956v.post(this.f2955u);
    }
}
