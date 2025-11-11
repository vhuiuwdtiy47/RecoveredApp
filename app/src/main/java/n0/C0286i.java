package n0;

import L.C0021q;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;

/* renamed from: n0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0286i extends D {

    /* renamed from: s, reason: collision with root package name */
    public static TimeInterpolator f3376s;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3377g;
    public ArrayList h;
    public ArrayList i;

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f3378j;

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f3379k;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f3380l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f3381m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f3382n;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f3383o;

    /* renamed from: p, reason: collision with root package name */
    public ArrayList f3384p;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f3385q;

    /* renamed from: r, reason: collision with root package name */
    public ArrayList f3386r;

    public static void h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((W) arrayList.get(size)).f3297a.animate().cancel();
        }
    }

    /* JADX WARN: Type inference failed for: r9v3, types: [n0.g, java.lang.Object] */
    @Override // n0.D
    public final boolean a(W w2, W w3, C0021q c0021q, C0021q c0021q2) {
        int i;
        int i2;
        int i3 = c0021q.f377a;
        int i4 = c0021q.f378b;
        if (w3.o()) {
            int i5 = c0021q.f377a;
            i2 = c0021q.f378b;
            i = i5;
        } else {
            i = c0021q2.f377a;
            i2 = c0021q2.f378b;
        }
        if (w2 == w3) {
            return g(w2, i3, i4, i, i2);
        }
        View view = w2.f3297a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        l(w2);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        l(w3);
        float f2 = -((int) ((i - i3) - translationX));
        View view2 = w3.f3297a;
        view2.setTranslationX(f2);
        view2.setTranslationY(-((int) ((i2 - i4) - translationY)));
        view2.setAlpha(0.0f);
        ArrayList arrayList = this.f3379k;
        ?? obj = new Object();
        obj.f3364a = w2;
        obj.f3365b = w3;
        obj.f3366c = i3;
        obj.d = i4;
        obj.f3367e = i;
        obj.f3368f = i2;
        arrayList.add(obj);
        return true;
    }

    @Override // n0.D
    public final void d(W w2) {
        View view = w2.f3297a;
        view.animate().cancel();
        ArrayList arrayList = this.f3378j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((C0285h) arrayList.get(size)).f3372a == w2) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                c(w2);
                arrayList.remove(size);
            }
        }
        j(this.f3379k, w2);
        if (this.h.remove(w2)) {
            view.setAlpha(1.0f);
            c(w2);
        }
        if (this.i.remove(w2)) {
            view.setAlpha(1.0f);
            c(w2);
        }
        ArrayList arrayList2 = this.f3382n;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            j(arrayList3, w2);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.f3381m;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (((C0285h) arrayList5.get(size4)).f3372a == w2) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    c(w2);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        ArrayList arrayList6 = this.f3380l;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(w2)) {
                view.setAlpha(1.0f);
                c(w2);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.f3385q.remove(w2);
        this.f3383o.remove(w2);
        this.f3386r.remove(w2);
        this.f3384p.remove(w2);
        i();
    }

    @Override // n0.D
    public final void e() {
        ArrayList arrayList = this.f3378j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C0285h c0285h = (C0285h) arrayList.get(size);
            View view = c0285h.f3372a.f3297a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            c(c0285h.f3372a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.h;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            c((W) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.i;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            W w2 = (W) arrayList3.get(size3);
            w2.f3297a.setAlpha(1.0f);
            c(w2);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f3379k;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            C0284g c0284g = (C0284g) arrayList4.get(size4);
            W w3 = c0284g.f3364a;
            if (w3 != null) {
                k(c0284g, w3);
            }
            W w4 = c0284g.f3365b;
            if (w4 != null) {
                k(c0284g, w4);
            }
        }
        arrayList4.clear();
        if (f()) {
            ArrayList arrayList5 = this.f3381m;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
                for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                    C0285h c0285h2 = (C0285h) arrayList6.get(size6);
                    View view2 = c0285h2.f3372a.f3297a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    c(c0285h2.f3372a);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
            ArrayList arrayList7 = this.f3380l;
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
                for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                    W w5 = (W) arrayList8.get(size8);
                    w5.f3297a.setAlpha(1.0f);
                    c(w5);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
            ArrayList arrayList9 = this.f3382n;
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    C0284g c0284g2 = (C0284g) arrayList10.get(size10);
                    W w6 = c0284g2.f3364a;
                    if (w6 != null) {
                        k(c0284g2, w6);
                    }
                    W w7 = c0284g2.f3365b;
                    if (w7 != null) {
                        k(c0284g2, w7);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
            h(this.f3385q);
            h(this.f3384p);
            h(this.f3383o);
            h(this.f3386r);
            ArrayList arrayList11 = this.f3237b;
            if (arrayList11.size() > 0) {
                arrayList11.get(0).getClass();
                throw new ClassCastException();
            }
            arrayList11.clear();
        }
    }

    @Override // n0.D
    public final boolean f() {
        return (this.i.isEmpty() && this.f3379k.isEmpty() && this.f3378j.isEmpty() && this.h.isEmpty() && this.f3384p.isEmpty() && this.f3385q.isEmpty() && this.f3383o.isEmpty() && this.f3386r.isEmpty() && this.f3381m.isEmpty() && this.f3380l.isEmpty() && this.f3382n.isEmpty()) ? false : true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, n0.h] */
    public final boolean g(W w2, int i, int i2, int i3, int i4) {
        View view = w2.f3297a;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) w2.f3297a.getTranslationY());
        l(w2);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            c(w2);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        ArrayList arrayList = this.f3378j;
        ?? obj = new Object();
        obj.f3372a = w2;
        obj.f3373b = translationX;
        obj.f3374c = translationY;
        obj.d = i3;
        obj.f3375e = i4;
        arrayList.add(obj);
        return true;
    }

    public final void i() {
        if (f()) {
            return;
        }
        ArrayList arrayList = this.f3237b;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    public final void j(ArrayList arrayList, W w2) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0284g c0284g = (C0284g) arrayList.get(size);
            if (k(c0284g, w2) && c0284g.f3364a == null && c0284g.f3365b == null) {
                arrayList.remove(c0284g);
            }
        }
    }

    public final boolean k(C0284g c0284g, W w2) {
        if (c0284g.f3365b == w2) {
            c0284g.f3365b = null;
        } else {
            if (c0284g.f3364a != w2) {
                return false;
            }
            c0284g.f3364a = null;
        }
        w2.f3297a.setAlpha(1.0f);
        View view = w2.f3297a;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        c(w2);
        return true;
    }

    public final void l(W w2) {
        if (f3376s == null) {
            f3376s = new ValueAnimator().getInterpolator();
        }
        w2.f3297a.animate().setInterpolator(f3376s);
        d(w2);
    }
}
