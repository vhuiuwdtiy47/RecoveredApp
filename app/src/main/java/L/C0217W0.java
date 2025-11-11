package l;

import android.content.Context;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import j.InterfaceC0157b;
import java.util.ArrayList;

/* renamed from: l.W0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0217W0 implements k.y {

    /* renamed from: a, reason: collision with root package name */
    public k.m f3027a;

    /* renamed from: b, reason: collision with root package name */
    public k.o f3028b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Toolbar f3029c;

    public C0217W0(Toolbar toolbar) {
        this.f3029c = toolbar;
    }

    @Override // k.y
    public final void b(k.m mVar, boolean z2) {
    }

    @Override // k.y
    public final int c() {
        return 0;
    }

    @Override // k.y
    public final boolean d(k.o oVar) {
        Toolbar toolbar = this.f3029c;
        toolbar.c();
        ViewParent parent = toolbar.h.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.h);
            }
            toolbar.addView(toolbar.h);
        }
        View actionView = oVar.getActionView();
        toolbar.i = actionView;
        this.f3028b = oVar;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.i);
            }
            X0 h = Toolbar.h();
            h.f3030a = (toolbar.f1445n & 112) | 8388611;
            h.f3031b = 2;
            toolbar.i.setLayoutParams(h);
            toolbar.addView(toolbar.i);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((X0) childAt.getLayoutParams()).f3031b != 2 && childAt != toolbar.f1435a) {
                toolbar.removeViewAt(childCount);
                toolbar.f1423E.add(childAt);
            }
        }
        toolbar.requestLayout();
        oVar.f2864C = true;
        oVar.f2875n.p(false);
        KeyEvent.Callback callback = toolbar.i;
        if (callback instanceof InterfaceC0157b) {
            ((k.q) ((InterfaceC0157b) callback)).f2891a.onActionViewExpanded();
        }
        toolbar.u();
        return true;
    }

    @Override // k.y
    public final boolean f(k.E e2) {
        return false;
    }

    @Override // k.y
    public final boolean h(k.o oVar) {
        Toolbar toolbar = this.f3029c;
        KeyEvent.Callback callback = toolbar.i;
        if (callback instanceof InterfaceC0157b) {
            ((k.q) ((InterfaceC0157b) callback)).f2891a.onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.i);
        toolbar.removeView(toolbar.h);
        toolbar.i = null;
        ArrayList arrayList = toolbar.f1423E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f3028b = null;
        toolbar.requestLayout();
        oVar.f2864C = false;
        oVar.f2875n.p(false);
        toolbar.u();
        return true;
    }

    @Override // k.y
    public final void i(Context context, k.m mVar) {
        k.o oVar;
        k.m mVar2 = this.f3027a;
        if (mVar2 != null && (oVar = this.f3028b) != null) {
            mVar2.d(oVar);
        }
        this.f3027a = mVar;
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
        if (this.f3028b != null) {
            k.m mVar = this.f3027a;
            if (mVar != null) {
                int size = mVar.f2842f.size();
                for (int i = 0; i < size; i++) {
                    if (this.f3027a.getItem(i) == this.f3028b) {
                        return;
                    }
                }
            }
            h(this.f3028b);
        }
    }

    @Override // k.y
    public final void m(Parcelable parcelable) {
    }
}
