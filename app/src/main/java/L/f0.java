package L;

import android.graphics.Insets;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class f0 extends WindowInsetsAnimation$Callback {

    /* renamed from: a, reason: collision with root package name */
    public final C0008d f339a;

    /* renamed from: b, reason: collision with root package name */
    public List f340b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f341c;
    public final HashMap d;

    public f0(C0008d c0008d) {
        super(0);
        this.d = new HashMap();
        this.f339a = c0008d;
    }

    public final i0 a(WindowInsetsAnimation windowInsetsAnimation) {
        i0 i0Var = (i0) this.d.get(windowInsetsAnimation);
        if (i0Var == null) {
            i0Var = new i0(0, null, 0L);
            if (Build.VERSION.SDK_INT >= 30) {
                i0Var.f353a = new g0(windowInsetsAnimation);
            }
            this.d.put(windowInsetsAnimation, i0Var);
        }
        return i0Var;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        C0008d c0008d = this.f339a;
        a(windowInsetsAnimation);
        ((View) c0008d.f331e).setTranslationY(0.0f);
        this.d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        C0008d c0008d = this.f339a;
        a(windowInsetsAnimation);
        View view = (View) c0008d.f331e;
        int[] iArr = (int[]) c0008d.f332f;
        view.getLocationOnScreen(iArr);
        c0008d.f330c = iArr[1];
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        float fraction;
        ArrayList arrayList = this.f341c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f341c = arrayList2;
            this.f340b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation j2 = K0.b.j(list.get(size));
            i0 a2 = a(j2);
            fraction = j2.getFraction();
            a2.f353a.d(fraction);
            this.f341c.add(a2);
        }
        C0008d c0008d = this.f339a;
        u0 f2 = u0.f(null, windowInsets);
        c0008d.b(f2, this.f340b);
        return f2.e();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        Insets lowerBound;
        Insets upperBound;
        C0008d c0008d = this.f339a;
        a(windowInsetsAnimation);
        lowerBound = bounds.getLowerBound();
        D.c c2 = D.c.c(lowerBound);
        upperBound = bounds.getUpperBound();
        D.c c3 = D.c.c(upperBound);
        View view = (View) c0008d.f331e;
        int[] iArr = (int[]) c0008d.f332f;
        view.getLocationOnScreen(iArr);
        int i = c0008d.f330c - iArr[1];
        c0008d.d = i;
        view.setTranslationY(i);
        K0.b.m();
        return K0.b.h(c2.d(), c3.d());
    }
}
