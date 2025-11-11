package F0;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.google.android.material.carousel.CarouselLayoutManager;
import n0.C0298v;
import n0.C0300x;
import n0.Q;

/* loaded from: classes.dex */
public final class c extends C0298v {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f149q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f150r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj, Context context, int i) {
        super(context);
        this.f149q = i;
        this.f150r = obj;
    }

    @Override // n0.C0298v
    public int b(View view, int i) {
        switch (this.f149q) {
            case 0:
                ((CarouselLayoutManager) this.f150r).getClass();
                return 0;
            default:
                return super.b(view, i);
        }
    }

    @Override // n0.C0298v
    public int c(View view, int i) {
        switch (this.f149q) {
            case 0:
                ((CarouselLayoutManager) this.f150r).getClass();
                return 0;
            default:
                return super.c(view, i);
        }
    }

    @Override // n0.C0298v
    public float d(DisplayMetrics displayMetrics) {
        switch (this.f149q) {
            case 1:
                return 100.0f / displayMetrics.densityDpi;
            default:
                return super.d(displayMetrics);
        }
    }

    @Override // n0.C0298v
    public int e(int i) {
        switch (this.f149q) {
            case 1:
                return Math.min(100, super.e(i));
            default:
                return super.e(i);
        }
    }

    @Override // n0.C0298v
    public PointF f(int i) {
        switch (this.f149q) {
            case 0:
                ((CarouselLayoutManager) this.f150r).getClass();
                return null;
            default:
                return super.f(i);
        }
    }

    @Override // n0.C0298v
    public void h(View view, Q q2) {
        switch (this.f149q) {
            case 1:
                C0300x c0300x = (C0300x) this.f150r;
                int[] a2 = c0300x.a(c0300x.f3469a.getLayoutManager(), view);
                int i = a2[0];
                int i2 = a2[1];
                int ceil = (int) Math.ceil(e(Math.max(Math.abs(i), Math.abs(i2))) / 0.3356d);
                if (ceil > 0) {
                    DecelerateInterpolator decelerateInterpolator = this.f3462j;
                    q2.f3273a = i;
                    q2.f3274b = i2;
                    q2.f3275c = ceil;
                    q2.f3276e = decelerateInterpolator;
                    q2.f3277f = true;
                    return;
                }
                return;
            default:
                super.h(view, q2);
                return;
        }
    }
}
