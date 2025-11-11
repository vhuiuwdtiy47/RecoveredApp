package Y;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class D implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Y f965a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ E f966b;

    public D(E e2, Y y2) {
        this.f966b = e2;
        this.f965a = y2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Y y2 = this.f965a;
        y2.k();
        C0044k.f((ViewGroup) y2.f1052c.f1167F.getParent(), this.f966b.f967a).e();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
