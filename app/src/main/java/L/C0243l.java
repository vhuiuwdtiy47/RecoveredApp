package l;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import com.android.music.R;
import java.util.ArrayList;
import k.InterfaceC0164A;

/* renamed from: l.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0243l implements k.y {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3087a;

    /* renamed from: b, reason: collision with root package name */
    public Context f3088b;

    /* renamed from: c, reason: collision with root package name */
    public k.m f3089c;
    public final LayoutInflater d;

    /* renamed from: e, reason: collision with root package name */
    public k.x f3090e;
    public InterfaceC0164A h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public C0239j f3093j;

    /* renamed from: k, reason: collision with root package name */
    public Drawable f3094k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3095l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f3096m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f3097n;

    /* renamed from: o, reason: collision with root package name */
    public int f3098o;

    /* renamed from: p, reason: collision with root package name */
    public int f3099p;

    /* renamed from: q, reason: collision with root package name */
    public int f3100q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f3101r;

    /* renamed from: t, reason: collision with root package name */
    public C0233g f3103t;

    /* renamed from: u, reason: collision with root package name */
    public C0233g f3104u;

    /* renamed from: v, reason: collision with root package name */
    public RunnableC0237i f3105v;

    /* renamed from: w, reason: collision with root package name */
    public C0235h f3106w;

    /* renamed from: y, reason: collision with root package name */
    public int f3108y;

    /* renamed from: f, reason: collision with root package name */
    public final int f3091f = R.layout.abc_action_menu_layout;

    /* renamed from: g, reason: collision with root package name */
    public final int f3092g = R.layout.abc_action_menu_item_layout;

    /* renamed from: s, reason: collision with root package name */
    public final SparseBooleanArray f3102s = new SparseBooleanArray();

    /* renamed from: x, reason: collision with root package name */
    public final A0.c f3107x = new A0.c(23, this);

    public C0243l(Context context) {
        this.f3087a = context;
        this.d = LayoutInflater.from(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [k.z] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    public final View a(k.o oVar, View view, ViewGroup viewGroup) {
        View actionView = oVar.getActionView();
        if (actionView == null || oVar.e()) {
            ActionMenuItemView actionMenuItemView = view instanceof k.z ? (k.z) view : (k.z) this.d.inflate(this.f3092g, viewGroup, false);
            actionMenuItemView.a(oVar);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker((ActionMenuView) this.h);
            if (this.f3106w == null) {
                this.f3106w = new C0235h(this);
            }
            actionMenuItemView2.setPopupCallback(this.f3106w);
            actionView = actionMenuItemView;
        }
        actionView.setVisibility(oVar.f2864C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof C0247n)) {
            actionView.setLayoutParams(ActionMenuView.k(layoutParams));
        }
        return actionView;
    }

    @Override // k.y
    public final void b(k.m mVar, boolean z2) {
        e();
        C0233g c0233g = this.f3104u;
        if (c0233g != null && c0233g.b()) {
            c0233g.i.dismiss();
        }
        k.x xVar = this.f3090e;
        if (xVar != null) {
            xVar.b(mVar, z2);
        }
    }

    @Override // k.y
    public final int c() {
        return this.i;
    }

    @Override // k.y
    public final boolean d(k.o oVar) {
        return false;
    }

    public final boolean e() {
        Object obj;
        RunnableC0237i runnableC0237i = this.f3105v;
        if (runnableC0237i != null && (obj = this.h) != null) {
            ((View) obj).removeCallbacks(runnableC0237i);
            this.f3105v = null;
            return true;
        }
        C0233g c0233g = this.f3103t;
        if (c0233g == null) {
            return false;
        }
        if (c0233g.b()) {
            c0233g.i.dismiss();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // k.y
    public final boolean f(k.E e2) {
        boolean z2;
        if (e2.hasVisibleItems()) {
            k.E e3 = e2;
            while (true) {
                k.m mVar = e3.f2779z;
                if (mVar == this.f3089c) {
                    break;
                }
                e3 = (k.E) mVar;
            }
            ViewGroup viewGroup = (ViewGroup) this.h;
            View view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                int i = 0;
                while (true) {
                    if (i >= childCount) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i);
                    if ((childAt instanceof k.z) && ((k.z) childAt).getItemData() == e3.f2778A) {
                        view = childAt;
                        break;
                    }
                    i++;
                }
            }
            if (view != null) {
                this.f3108y = e2.f2778A.f2865a;
                int size = e2.f2842f.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        z2 = false;
                        break;
                    }
                    MenuItem item = e2.getItem(i2);
                    if (item.isVisible() && item.getIcon() != null) {
                        z2 = true;
                        break;
                    }
                    i2++;
                }
                C0233g c0233g = new C0233g(this, this.f3088b, e2, view);
                this.f3104u = c0233g;
                c0233g.f2904g = z2;
                k.u uVar = c0233g.i;
                if (uVar != null) {
                    uVar.q(z2);
                }
                C0233g c0233g2 = this.f3104u;
                if (!c0233g2.b()) {
                    if (c0233g2.f2902e == null) {
                        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                    }
                    c0233g2.d(0, 0, false, false);
                }
                k.x xVar = this.f3090e;
                if (xVar != null) {
                    xVar.g(e2);
                }
                return true;
            }
        }
        return false;
    }

    @Override // k.y
    public final void g(k.x xVar) {
        throw null;
    }

    @Override // k.y
    public final boolean h(k.o oVar) {
        return false;
    }

    @Override // k.y
    public final void i(Context context, k.m mVar) {
        this.f3088b = context;
        LayoutInflater.from(context);
        this.f3089c = mVar;
        Resources resources = context.getResources();
        if (!this.f3097n) {
            this.f3096m = true;
        }
        int i = 2;
        this.f3098o = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
            i = 5;
        } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
            i = 4;
        } else if (i2 >= 360) {
            i = 3;
        }
        this.f3100q = i;
        int i4 = this.f3098o;
        if (this.f3096m) {
            if (this.f3093j == null) {
                C0239j c0239j = new C0239j(this, this.f3087a);
                this.f3093j = c0239j;
                if (this.f3095l) {
                    c0239j.setImageDrawable(this.f3094k);
                    this.f3094k = null;
                    this.f3095l = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f3093j.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i4 -= this.f3093j.getMeasuredWidth();
        } else {
            this.f3093j = null;
        }
        this.f3099p = i4;
        float f2 = resources.getDisplayMetrics().density;
    }

    @Override // k.y
    public final boolean j() {
        int i;
        ArrayList arrayList;
        int i2;
        boolean z2;
        C0243l c0243l = this;
        k.m mVar = c0243l.f3089c;
        if (mVar != null) {
            arrayList = mVar.l();
            i = arrayList.size();
        } else {
            i = 0;
            arrayList = null;
        }
        int i3 = c0243l.f3100q;
        int i4 = c0243l.f3099p;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) c0243l.h;
        int i5 = 0;
        boolean z3 = false;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i2 = 2;
            z2 = true;
            if (i5 >= i) {
                break;
            }
            k.o oVar = (k.o) arrayList.get(i5);
            int i8 = oVar.f2886y;
            if ((i8 & 2) == 2) {
                i6++;
            } else if ((i8 & 1) == 1) {
                i7++;
            } else {
                z3 = true;
            }
            if (c0243l.f3101r && oVar.f2864C) {
                i3 = 0;
            }
            i5++;
        }
        if (c0243l.f3096m && (z3 || i7 + i6 > i3)) {
            i3--;
        }
        int i9 = i3 - i6;
        SparseBooleanArray sparseBooleanArray = c0243l.f3102s;
        sparseBooleanArray.clear();
        int i10 = 0;
        int i11 = 0;
        while (i10 < i) {
            k.o oVar2 = (k.o) arrayList.get(i10);
            int i12 = oVar2.f2886y;
            boolean z4 = (i12 & 2) == i2 ? z2 : false;
            int i13 = oVar2.f2866b;
            if (z4) {
                View a2 = c0243l.a(oVar2, null, viewGroup);
                a2.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = a2.getMeasuredWidth();
                i4 -= measuredWidth;
                if (i11 == 0) {
                    i11 = measuredWidth;
                }
                if (i13 != 0) {
                    sparseBooleanArray.put(i13, z2);
                }
                oVar2.g(z2);
            } else if ((i12 & 1) == z2) {
                boolean z5 = sparseBooleanArray.get(i13);
                boolean z6 = ((i9 > 0 || z5) && i4 > 0) ? z2 : false;
                if (z6) {
                    View a3 = c0243l.a(oVar2, null, viewGroup);
                    a3.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = a3.getMeasuredWidth();
                    i4 -= measuredWidth2;
                    if (i11 == 0) {
                        i11 = measuredWidth2;
                    }
                    z6 &= i4 + i11 > 0;
                }
                if (z6 && i13 != 0) {
                    sparseBooleanArray.put(i13, true);
                } else if (z5) {
                    sparseBooleanArray.put(i13, false);
                    for (int i14 = 0; i14 < i10; i14++) {
                        k.o oVar3 = (k.o) arrayList.get(i14);
                        if (oVar3.f2866b == i13) {
                            if ((oVar3.f2885x & 32) == 32) {
                                i9++;
                            }
                            oVar3.g(false);
                        }
                    }
                }
                if (z6) {
                    i9--;
                }
                oVar2.g(z6);
            } else {
                oVar2.g(false);
                i10++;
                i2 = 2;
                c0243l = this;
                z2 = true;
            }
            i10++;
            i2 = 2;
            c0243l = this;
            z2 = true;
        }
        return z2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Parcelable, l.k, java.lang.Object] */
    @Override // k.y
    public final Parcelable k() {
        ?? obj = new Object();
        obj.f3084a = this.f3108y;
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // k.y
    public final void l(boolean z2) {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.h;
        ArrayList arrayList = null;
        boolean z3 = false;
        if (viewGroup != null) {
            k.m mVar = this.f3089c;
            if (mVar != null) {
                mVar.i();
                ArrayList l2 = this.f3089c.l();
                int size = l2.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    k.o oVar = (k.o) l2.get(i2);
                    if ((oVar.f2885x & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i);
                        k.o itemData = childAt instanceof k.z ? ((k.z) childAt).getItemData() : null;
                        View a2 = a(oVar, childAt, viewGroup);
                        if (oVar != itemData) {
                            a2.setPressed(false);
                            a2.jumpDrawablesToCurrentState();
                        }
                        if (a2 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) a2.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(a2);
                            }
                            ((ViewGroup) this.h).addView(a2, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.f3093j) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.h).requestLayout();
        k.m mVar2 = this.f3089c;
        if (mVar2 != null) {
            mVar2.i();
            ArrayList arrayList2 = mVar2.i;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                k.p pVar = ((k.o) arrayList2.get(i3)).f2862A;
            }
        }
        k.m mVar3 = this.f3089c;
        if (mVar3 != null) {
            mVar3.i();
            arrayList = mVar3.f2844j;
        }
        if (this.f3096m && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z3 = !((k.o) arrayList.get(0)).f2864C;
            } else if (size3 > 0) {
                z3 = true;
            }
        }
        if (z3) {
            if (this.f3093j == null) {
                this.f3093j = new C0239j(this, this.f3087a);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f3093j.getParent();
            if (viewGroup3 != this.h) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f3093j);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.h;
                C0239j c0239j = this.f3093j;
                actionMenuView.getClass();
                C0247n j2 = ActionMenuView.j();
                j2.f3112a = true;
                actionMenuView.addView(c0239j, j2);
            }
        } else {
            C0239j c0239j2 = this.f3093j;
            if (c0239j2 != null) {
                Object parent = c0239j2.getParent();
                Object obj = this.h;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f3093j);
                }
            }
        }
        ((ActionMenuView) this.h).setOverflowReserved(this.f3096m);
    }

    @Override // k.y
    public final void m(Parcelable parcelable) {
        int i;
        MenuItem findItem;
        if ((parcelable instanceof C0241k) && (i = ((C0241k) parcelable).f3084a) > 0 && (findItem = this.f3089c.findItem(i)) != null) {
            f((k.E) findItem.getSubMenu());
        }
    }

    public final boolean n() {
        C0233g c0233g = this.f3103t;
        return c0233g != null && c0233g.b();
    }

    public final boolean o() {
        k.m mVar;
        if (!this.f3096m || n() || (mVar = this.f3089c) == null || this.h == null || this.f3105v != null) {
            return false;
        }
        mVar.i();
        if (mVar.f2844j.isEmpty()) {
            return false;
        }
        RunnableC0237i runnableC0237i = new RunnableC0237i(this, new C0233g(this, this.f3088b, this.f3089c, this.f3093j));
        this.f3105v = runnableC0237i;
        ((View) this.h).post(runnableC0237i);
        return true;
    }
}
