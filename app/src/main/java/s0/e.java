package s0;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class e extends l {

    /* renamed from: A, reason: collision with root package name */
    public static final String[] f3595A = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: B, reason: collision with root package name */
    public static final c1.a f3596B = new c1.a(PointF.class, "topLeft", 2);

    /* renamed from: C, reason: collision with root package name */
    public static final c1.a f3597C = new c1.a(PointF.class, "bottomRight", 3);

    /* renamed from: D, reason: collision with root package name */
    public static final c1.a f3598D = new c1.a(PointF.class, "bottomRight", 4);

    /* renamed from: E, reason: collision with root package name */
    public static final c1.a f3599E = new c1.a(PointF.class, "topLeft", 5);

    /* renamed from: F, reason: collision with root package name */
    public static final c1.a f3600F = new c1.a(PointF.class, "position", 6);

    public static void I(s sVar) {
        View view = sVar.f3647b;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        HashMap hashMap = sVar.f3646a;
        hashMap.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        hashMap.put("android:changeBounds:parent", sVar.f3647b.getParent());
    }

    @Override // s0.l
    public final void d(s sVar) {
        I(sVar);
    }

    @Override // s0.l
    public final void g(s sVar) {
        I(sVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s0.l
    public final Animator k(ViewGroup viewGroup, s sVar, s sVar2) {
        int i;
        e eVar;
        ObjectAnimator a2;
        if (sVar == null || sVar2 == null) {
            return null;
        }
        HashMap hashMap = sVar.f3646a;
        HashMap hashMap2 = sVar2.f3646a;
        ViewGroup viewGroup2 = (ViewGroup) hashMap.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) hashMap2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        Rect rect = (Rect) hashMap.get("android:changeBounds:bounds");
        Rect rect2 = (Rect) hashMap2.get("android:changeBounds:bounds");
        int i2 = rect.left;
        int i3 = rect2.left;
        int i4 = rect.top;
        int i5 = rect2.top;
        int i6 = rect.right;
        int i7 = rect2.right;
        int i8 = rect.bottom;
        int i9 = rect2.bottom;
        int i10 = i6 - i2;
        int i11 = i8 - i4;
        int i12 = i7 - i3;
        int i13 = i9 - i5;
        Rect rect3 = (Rect) hashMap.get("android:changeBounds:clip");
        Rect rect4 = (Rect) hashMap2.get("android:changeBounds:clip");
        if ((i10 == 0 || i11 == 0) && (i12 == 0 || i13 == 0)) {
            i = 0;
        } else {
            i = (i2 == i3 && i4 == i5) ? 0 : 1;
            if (i6 != i7 || i8 != i9) {
                i++;
            }
        }
        if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
            i++;
        }
        if (i <= 0) {
            return null;
        }
        c1.a aVar = u.f3649a;
        View view = sVar2.f3647b;
        view.setLeftTopRightBottom(i2, i4, i6, i8);
        if (i != 2) {
            eVar = this;
            if (i2 == i3 && i4 == i5) {
                eVar.f3636v.getClass();
                a2 = h.a(view, f3598D, Z0.f.e(i6, i8, i7, i9));
            } else {
                eVar.f3636v.getClass();
                a2 = h.a(view, f3599E, Z0.f.e(i2, i4, i3, i5));
            }
        } else if (i10 == i12 && i11 == i13) {
            eVar = this;
            eVar.f3636v.getClass();
            a2 = h.a(view, f3600F, Z0.f.e(i2, i4, i3, i5));
        } else {
            eVar = this;
            d dVar = new d(view);
            eVar.f3636v.getClass();
            ObjectAnimator a3 = h.a(dVar, f3596B, Z0.f.e(i2, i4, i3, i5));
            eVar.f3636v.getClass();
            ObjectAnimator a4 = h.a(dVar, f3597C, Z0.f.e(i6, i8, i7, i9));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(a3, a4);
            animatorSet.addListener(new b(dVar));
            a2 = animatorSet;
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            t.b(viewGroup4, true);
            eVar.o().a(new c(viewGroup4));
        }
        return a2;
    }

    @Override // s0.l
    public final String[] q() {
        return f3595A;
    }
}
