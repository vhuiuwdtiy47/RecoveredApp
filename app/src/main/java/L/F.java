package L;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class F implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public u0 f307a = null;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f308b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f309c;

    public F(View view, r rVar) {
        this.f308b = view;
        this.f309c = rVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        u0 f2 = u0.f(view, windowInsets);
        int i = Build.VERSION.SDK_INT;
        r rVar = this.f309c;
        if (i < 30) {
            G.a(windowInsets, this.f308b);
            if (f2.equals(this.f307a)) {
                return rVar.v(view, f2).e();
            }
        }
        this.f307a = f2;
        u0 v2 = rVar.v(view, f2);
        if (i >= 30) {
            return v2.e();
        }
        WeakHashMap weakHashMap = S.f311a;
        E.c(view);
        return v2.e();
    }
}
