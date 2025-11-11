package n0;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: n0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0280c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3328a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f3329b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0286i f3330c;

    public /* synthetic */ RunnableC0280c(C0286i c0286i, ArrayList arrayList, int i) {
        this.f3328a = i;
        this.f3330c = c0286i;
        this.f3329b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3328a) {
            case 0:
                ArrayList arrayList = this.f3329b;
                Iterator it = arrayList.iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    C0286i c0286i = this.f3330c;
                    if (!hasNext) {
                        arrayList.clear();
                        c0286i.f3381m.remove(arrayList);
                        return;
                    }
                    C0285h c0285h = (C0285h) it.next();
                    W w2 = c0285h.f3372a;
                    c0286i.getClass();
                    View view = w2.f3297a;
                    int i = c0285h.d - c0285h.f3373b;
                    int i2 = c0285h.f3375e - c0285h.f3374c;
                    if (i != 0) {
                        view.animate().translationX(0.0f);
                    }
                    if (i2 != 0) {
                        view.animate().translationY(0.0f);
                    }
                    ViewPropertyAnimator animate = view.animate();
                    c0286i.f3384p.add(w2);
                    animate.setDuration(c0286i.f3239e).setListener(new C0282e(c0286i, w2, i, view, i2, animate)).start();
                }
            case 1:
                ArrayList arrayList2 = this.f3329b;
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    boolean hasNext2 = it2.hasNext();
                    C0286i c0286i2 = this.f3330c;
                    if (!hasNext2) {
                        arrayList2.clear();
                        c0286i2.f3382n.remove(arrayList2);
                        return;
                    }
                    C0284g c0284g = (C0284g) it2.next();
                    c0286i2.getClass();
                    W w3 = c0284g.f3364a;
                    View view2 = w3 == null ? null : w3.f3297a;
                    W w4 = c0284g.f3365b;
                    View view3 = w4 != null ? w4.f3297a : null;
                    ArrayList arrayList3 = c0286i2.f3386r;
                    long j2 = c0286i2.f3240f;
                    if (view2 != null) {
                        ViewPropertyAnimator duration = view2.animate().setDuration(j2);
                        arrayList3.add(c0284g.f3364a);
                        duration.translationX(c0284g.f3367e - c0284g.f3366c);
                        duration.translationY(c0284g.f3368f - c0284g.d);
                        duration.alpha(0.0f).setListener(new C0283f(c0286i2, c0284g, duration, view2, 0)).start();
                    }
                    if (view3 != null) {
                        ViewPropertyAnimator animate2 = view3.animate();
                        arrayList3.add(c0284g.f3365b);
                        animate2.translationX(0.0f).translationY(0.0f).setDuration(j2).alpha(1.0f).setListener(new C0283f(c0286i2, c0284g, animate2, view3, 1)).start();
                    }
                }
            default:
                ArrayList arrayList4 = this.f3329b;
                Iterator it3 = arrayList4.iterator();
                while (true) {
                    boolean hasNext3 = it3.hasNext();
                    C0286i c0286i3 = this.f3330c;
                    if (!hasNext3) {
                        arrayList4.clear();
                        c0286i3.f3380l.remove(arrayList4);
                        return;
                    }
                    W w5 = (W) it3.next();
                    c0286i3.getClass();
                    View view4 = w5.f3297a;
                    ViewPropertyAnimator animate3 = view4.animate();
                    c0286i3.f3383o.add(w5);
                    animate3.alpha(1.0f).setDuration(c0286i3.f3238c).setListener(new C0281d(c0286i3, w5, view4, animate3)).start();
                }
        }
    }
}
