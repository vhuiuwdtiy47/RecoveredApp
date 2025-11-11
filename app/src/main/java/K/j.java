package k;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class j extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final m f2832a;

    /* renamed from: b, reason: collision with root package name */
    public int f2833b = -1;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2834c;
    public final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final LayoutInflater f2835e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2836f;

    public j(m mVar, LayoutInflater layoutInflater, boolean z2, int i) {
        this.d = z2;
        this.f2835e = layoutInflater;
        this.f2832a = mVar;
        this.f2836f = i;
        a();
    }

    public final void a() {
        m mVar = this.f2832a;
        o oVar = mVar.f2856v;
        if (oVar != null) {
            mVar.i();
            ArrayList arrayList = mVar.f2844j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((o) arrayList.get(i)) == oVar) {
                    this.f2833b = i;
                    return;
                }
            }
        }
        this.f2833b = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final o getItem(int i) {
        ArrayList l2;
        m mVar = this.f2832a;
        if (this.d) {
            mVar.i();
            l2 = mVar.f2844j;
        } else {
            l2 = mVar.l();
        }
        int i2 = this.f2833b;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (o) l2.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList l2;
        m mVar = this.f2832a;
        if (this.d) {
            mVar.i();
            l2 = mVar.f2844j;
        } else {
            l2 = mVar.l();
        }
        return this.f2833b < 0 ? l2.size() : l2.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z2 = false;
        if (view == null) {
            view = this.f2835e.inflate(this.f2836f, viewGroup, false);
        }
        int i2 = getItem(i).f2866b;
        int i3 = i - 1;
        int i4 = i3 >= 0 ? getItem(i3).f2866b : i2;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f2832a.m() && i2 != i4) {
            z2 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z2);
        z zVar = (z) view;
        if (this.f2834c) {
            listMenuItemView.setForceShowIcon(true);
        }
        zVar.a(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
