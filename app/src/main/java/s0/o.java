package s0;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class o implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public l f3639a;

    /* renamed from: b, reason: collision with root package name */
    public ViewGroup f3640b;

    /* JADX WARN: Removed duplicated region for block: B:113:0x01dd A[EDGE_INSN: B:113:0x01dd->B:114:0x01dd BREAK  A[LOOP:1: B:17:0x0087->B:29:0x01d6], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008c  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onPreDraw() {
        /*
            Method dump skipped, instructions count: 681
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.o.onPreDraw():boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.f3640b;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        ArrayList arrayList = p.f3643c;
        ViewGroup viewGroup2 = this.f3640b;
        arrayList.remove(viewGroup2);
        ArrayList arrayList2 = (ArrayList) p.b().get(viewGroup2);
        if (arrayList2 != null && arrayList2.size() > 0) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((l) it.next()).y(viewGroup2);
            }
        }
        this.f3639a.i(true);
    }
}
