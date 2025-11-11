package k;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* loaded from: classes.dex */
public abstract class u implements InterfaceC0166C, y, AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public Rect f2897a;

    public static int o(ListAdapter listAdapter, Context context, int i) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i2 = 0;
        int i3 = 0;
        FrameLayout frameLayout = null;
        View view = null;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, frameLayout);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    public static boolean w(m mVar) {
        int size = mVar.f2842f.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = mVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    @Override // k.y
    public final int c() {
        return 0;
    }

    @Override // k.y
    public final boolean d(o oVar) {
        return false;
    }

    @Override // k.y
    public final boolean h(o oVar) {
        return false;
    }

    @Override // k.y
    public final void i(Context context, m mVar) {
    }

    public abstract void n(m mVar);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j2) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (j) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (j) listAdapter).f2832a.q((MenuItem) listAdapter.getItem(i), this, !(this instanceof g) ? 0 : 4);
    }

    public abstract void p(View view);

    public abstract void q(boolean z2);

    public abstract void r(int i);

    public abstract void s(int i);

    public abstract void t(PopupWindow.OnDismissListener onDismissListener);

    public abstract void u(boolean z2);

    public abstract void v(int i);
}
