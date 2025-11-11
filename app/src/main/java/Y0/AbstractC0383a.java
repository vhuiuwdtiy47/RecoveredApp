package y0;

import L.S;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.datepicker.k;
import java.util.WeakHashMap;
import y.AbstractC0376a;

/* renamed from: y0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0383a extends AbstractC0376a {

    /* renamed from: a, reason: collision with root package name */
    public k f4220a;

    @Override // y.AbstractC0376a
    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        r(coordinatorLayout, view, i);
        if (this.f4220a == null) {
            this.f4220a = new k(view);
        }
        k kVar = this.f4220a;
        View view2 = (View) kVar.f1908a;
        kVar.f1909b = view2.getTop();
        kVar.f1910c = view2.getLeft();
        k kVar2 = this.f4220a;
        View view3 = (View) kVar2.f1908a;
        int top = 0 - (view3.getTop() - kVar2.f1909b);
        WeakHashMap weakHashMap = S.f311a;
        view3.offsetTopAndBottom(top);
        view3.offsetLeftAndRight(0 - (view3.getLeft() - kVar2.f1910c));
        return true;
    }

    public void r(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.q(view, i);
    }
}
