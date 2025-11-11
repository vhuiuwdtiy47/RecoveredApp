package n0;

import L.C0006b;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class X extends C0006b {
    public final Y d;

    /* renamed from: e, reason: collision with root package name */
    public final WeakHashMap f3312e = new WeakHashMap();

    public X(Y y2) {
        this.d = y2;
    }

    @Override // L.C0006b
    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        C0006b c0006b = (C0006b) this.f3312e.get(view);
        return c0006b != null ? c0006b.a(view, accessibilityEvent) : this.f319a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // L.C0006b
    public final A0.c b(View view) {
        C0006b c0006b = (C0006b) this.f3312e.get(view);
        return c0006b != null ? c0006b.b(view) : super.b(view);
    }

    @Override // L.C0006b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        C0006b c0006b = (C0006b) this.f3312e.get(view);
        if (c0006b != null) {
            c0006b.c(view, accessibilityEvent);
        } else {
            super.c(view, accessibilityEvent);
        }
    }

    @Override // L.C0006b
    public final void d(View view, M.k kVar) {
        Y y2 = this.d;
        boolean K2 = y2.d.K();
        View.AccessibilityDelegate accessibilityDelegate = this.f319a;
        AccessibilityNodeInfo accessibilityNodeInfo = kVar.f417a;
        if (!K2) {
            RecyclerView recyclerView = y2.d;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().U(view, kVar);
                C0006b c0006b = (C0006b) this.f3312e.get(view);
                if (c0006b != null) {
                    c0006b.d(view, kVar);
                    return;
                } else {
                    accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                    return;
                }
            }
        }
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
    }

    @Override // L.C0006b
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        C0006b c0006b = (C0006b) this.f3312e.get(view);
        if (c0006b != null) {
            c0006b.e(view, accessibilityEvent);
        } else {
            super.e(view, accessibilityEvent);
        }
    }

    @Override // L.C0006b
    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        C0006b c0006b = (C0006b) this.f3312e.get(viewGroup);
        return c0006b != null ? c0006b.f(viewGroup, view, accessibilityEvent) : this.f319a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // L.C0006b
    public final boolean g(View view, int i, Bundle bundle) {
        Y y2 = this.d;
        if (!y2.d.K()) {
            RecyclerView recyclerView = y2.d;
            if (recyclerView.getLayoutManager() != null) {
                C0006b c0006b = (C0006b) this.f3312e.get(view);
                if (c0006b != null) {
                    if (c0006b.g(view, i, bundle)) {
                        return true;
                    }
                } else if (super.g(view, i, bundle)) {
                    return true;
                }
                N n2 = recyclerView.getLayoutManager().f3247b.f1664b;
                return false;
            }
        }
        return super.g(view, i, bundle);
    }

    @Override // L.C0006b
    public final void h(View view, int i) {
        C0006b c0006b = (C0006b) this.f3312e.get(view);
        if (c0006b != null) {
            c0006b.h(view, i);
        } else {
            super.h(view, i);
        }
    }

    @Override // L.C0006b
    public final void i(View view, AccessibilityEvent accessibilityEvent) {
        C0006b c0006b = (C0006b) this.f3312e.get(view);
        if (c0006b != null) {
            c0006b.i(view, accessibilityEvent);
        } else {
            super.i(view, accessibilityEvent);
        }
    }
}
