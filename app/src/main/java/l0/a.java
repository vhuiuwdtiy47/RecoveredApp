package L0;

import Z0.i;
import android.content.Context;
import com.android.music.R;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    public static final int f398f = (int) Math.round(5.1000000000000005d);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f399a;

    /* renamed from: b, reason: collision with root package name */
    public final int f400b;

    /* renamed from: c, reason: collision with root package name */
    public final int f401c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final float f402e;

    public a(Context context) {
        boolean a02 = i.a0(context, R.attr.elevationOverlayEnabled, false);
        int t2 = i.t(context, R.attr.elevationOverlayColor, 0);
        int t3 = i.t(context, R.attr.elevationOverlayAccentColor, 0);
        int t4 = i.t(context, R.attr.colorSurface, 0);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.f399a = a02;
        this.f400b = t2;
        this.f401c = t3;
        this.d = t4;
        this.f402e = f2;
    }
}
