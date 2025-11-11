package L;

import a0.C0076a;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import com.android.music.R;
import java.util.List;

/* loaded from: classes.dex */
public final class e0 extends h0 {

    /* renamed from: e, reason: collision with root package name */
    public static final PathInterpolator f335e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

    /* renamed from: f, reason: collision with root package name */
    public static final C0076a f336f = new C0076a();

    /* renamed from: g, reason: collision with root package name */
    public static final DecelerateInterpolator f337g = new DecelerateInterpolator();

    public static void e(View view) {
        C0008d j2 = j(view);
        if (j2 != null) {
            ((View) j2.f331e).setTranslationY(0.0f);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                e(viewGroup.getChildAt(i));
            }
        }
    }

    public static void f(View view, WindowInsets windowInsets, boolean z2) {
        C0008d j2 = j(view);
        if (j2 != null) {
            j2.f329b = windowInsets;
            if (!z2) {
                View view2 = (View) j2.f331e;
                int[] iArr = (int[]) j2.f332f;
                view2.getLocationOnScreen(iArr);
                z2 = true;
                j2.f330c = iArr[1];
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                f(viewGroup.getChildAt(i), windowInsets, z2);
            }
        }
    }

    public static void g(View view, u0 u0Var, List list) {
        C0008d j2 = j(view);
        if (j2 != null) {
            j2.b(u0Var, list);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                g(viewGroup.getChildAt(i), u0Var, list);
            }
        }
    }

    public static void h(View view, C.j jVar) {
        C0008d j2 = j(view);
        if (j2 != null) {
            View view2 = (View) j2.f331e;
            int[] iArr = (int[]) j2.f332f;
            view2.getLocationOnScreen(iArr);
            int i = j2.f330c - iArr[1];
            j2.d = i;
            view2.setTranslationY(i);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                h(viewGroup.getChildAt(i2), jVar);
            }
        }
    }

    public static WindowInsets i(View view, WindowInsets windowInsets) {
        return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    public static C0008d j(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof d0) {
            return ((d0) tag).f333a;
        }
        return null;
    }
}
