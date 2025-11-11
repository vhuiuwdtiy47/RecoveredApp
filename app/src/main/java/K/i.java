package k;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
import g.C0139b;
import g.DialogInterfaceC0143f;

/* loaded from: classes.dex */
public final class i implements y, AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public Context f2827a;

    /* renamed from: b, reason: collision with root package name */
    public LayoutInflater f2828b;

    /* renamed from: c, reason: collision with root package name */
    public m f2829c;
    public ExpandedMenuView d;

    /* renamed from: e, reason: collision with root package name */
    public x f2830e;

    /* renamed from: f, reason: collision with root package name */
    public h f2831f;

    public i(ContextWrapper contextWrapper) {
        this.f2827a = contextWrapper;
        this.f2828b = LayoutInflater.from(contextWrapper);
    }

    @Override // k.y
    public final void b(m mVar, boolean z2) {
        x xVar = this.f2830e;
        if (xVar != null) {
            xVar.b(mVar, z2);
        }
    }

    @Override // k.y
    public final int c() {
        return 0;
    }

    @Override // k.y
    public final boolean d(o oVar) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.DialogInterface$OnClickListener, k.x, java.lang.Object, k.n, android.content.DialogInterface$OnDismissListener] */
    @Override // k.y
    public final boolean f(E e2) {
        if (!e2.hasVisibleItems()) {
            return false;
        }
        ?? obj = new Object();
        obj.f2859a = e2;
        Context context = e2.f2838a;
        D0.f fVar = new D0.f(context);
        C0139b c0139b = (C0139b) fVar.f110b;
        i iVar = new i(c0139b.f2502a);
        obj.f2861c = iVar;
        iVar.f2830e = obj;
        e2.b(iVar, context);
        i iVar2 = obj.f2861c;
        if (iVar2.f2831f == null) {
            iVar2.f2831f = new h(iVar2);
        }
        c0139b.f2507g = iVar2.f2831f;
        c0139b.h = obj;
        View view = e2.f2849o;
        if (view != null) {
            c0139b.f2505e = view;
        } else {
            c0139b.f2504c = e2.f2848n;
            c0139b.d = e2.f2847m;
        }
        c0139b.f2506f = obj;
        DialogInterfaceC0143f a2 = fVar.a();
        obj.f2860b = a2;
        a2.setOnDismissListener(obj);
        WindowManager.LayoutParams attributes = obj.f2860b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        obj.f2860b.show();
        x xVar = this.f2830e;
        if (xVar == null) {
            return true;
        }
        xVar.g(e2);
        return true;
    }

    @Override // k.y
    public final void g(x xVar) {
        throw null;
    }

    @Override // k.y
    public final boolean h(o oVar) {
        return false;
    }

    @Override // k.y
    public final void i(Context context, m mVar) {
        if (this.f2827a != null) {
            this.f2827a = context;
            if (this.f2828b == null) {
                this.f2828b = LayoutInflater.from(context);
            }
        }
        this.f2829c = mVar;
        h hVar = this.f2831f;
        if (hVar != null) {
            hVar.notifyDataSetChanged();
        }
    }

    @Override // k.y
    public final boolean j() {
        return false;
    }

    @Override // k.y
    public final Parcelable k() {
        if (this.d == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.d;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        return bundle;
    }

    @Override // k.y
    public final void l(boolean z2) {
        h hVar = this.f2831f;
        if (hVar != null) {
            hVar.notifyDataSetChanged();
        }
    }

    @Override // k.y
    public final void m(Parcelable parcelable) {
        SparseArray<Parcelable> sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.d.restoreHierarchyState(sparseParcelableArray);
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j2) {
        this.f2829c.q(this.f2831f.getItem(i), this, 0);
    }
}
