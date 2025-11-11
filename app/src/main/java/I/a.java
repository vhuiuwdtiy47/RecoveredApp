package I;

import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import n0.H;

/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f253a;

    /* renamed from: b, reason: collision with root package name */
    public final int f254b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f255c;

    public /* synthetic */ a(Object obj, int i, int i2) {
        this.f253a = i2;
        this.f255c = obj;
        this.f254b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f253a) {
            case 0:
                C.b bVar = (C.b) ((A0.c) this.f255c).f33b;
                if (bVar != null) {
                    bVar.g(this.f254b);
                    return;
                }
                return;
            case 1:
                ((O0.c) this.f255c).j(this.f254b);
                return;
            case 2:
                ArrayList arrayList = (ArrayList) this.f255c;
                int size = arrayList.size();
                int i = 0;
                if (this.f254b != 1) {
                    while (i < size) {
                        ((U.g) arrayList.get(i)).getClass();
                        i++;
                    }
                    return;
                } else {
                    while (i < size) {
                        ((U.g) arrayList.get(i)).a();
                        i++;
                    }
                    return;
                }
            default:
                RecyclerView recyclerView = ((com.google.android.material.datepicker.j) this.f255c).f1903d0;
                if (recyclerView.f1695u) {
                    return;
                }
                H h = recyclerView.f1680l;
                if (h == null) {
                    Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                    return;
                } else {
                    h.x0(recyclerView, this.f254b);
                    return;
                }
        }
    }

    public a(List list, int i, Throwable th) {
        this.f253a = 2;
        Z0.i.i(list, "initCallbacks cannot be null");
        this.f255c = new ArrayList(list);
        this.f254b = i;
    }
}
