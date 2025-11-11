package g;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import com.android.music.R;
import f.AbstractC0117a;
import java.lang.ref.WeakReference;

/* renamed from: g.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0142e {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2510a;

    /* renamed from: b, reason: collision with root package name */
    public final DialogInterfaceC0143f f2511b;

    /* renamed from: c, reason: collision with root package name */
    public final Window f2512c;
    public CharSequence d;

    /* renamed from: e, reason: collision with root package name */
    public AlertController$RecycleListView f2513e;

    /* renamed from: f, reason: collision with root package name */
    public Button f2514f;

    /* renamed from: g, reason: collision with root package name */
    public Button f2515g;
    public Button h;
    public NestedScrollView i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f2516j;

    /* renamed from: k, reason: collision with root package name */
    public ImageView f2517k;

    /* renamed from: l, reason: collision with root package name */
    public TextView f2518l;

    /* renamed from: m, reason: collision with root package name */
    public TextView f2519m;

    /* renamed from: n, reason: collision with root package name */
    public View f2520n;

    /* renamed from: o, reason: collision with root package name */
    public ListAdapter f2521o;

    /* renamed from: q, reason: collision with root package name */
    public final int f2523q;

    /* renamed from: r, reason: collision with root package name */
    public final int f2524r;

    /* renamed from: s, reason: collision with root package name */
    public final int f2525s;

    /* renamed from: t, reason: collision with root package name */
    public final int f2526t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f2527u;

    /* renamed from: v, reason: collision with root package name */
    public final HandlerC0140c f2528v;

    /* renamed from: p, reason: collision with root package name */
    public int f2522p = -1;

    /* renamed from: w, reason: collision with root package name */
    public final O0.e f2529w = new O0.e(2, this);

    /* JADX WARN: Type inference failed for: r6v1, types: [android.os.Handler, g.c] */
    public C0142e(Context context, DialogInterfaceC0143f dialogInterfaceC0143f, Window window) {
        this.f2510a = context;
        this.f2511b = dialogInterfaceC0143f;
        this.f2512c = window;
        ?? handler = new Handler();
        handler.f2509a = new WeakReference(dialogInterfaceC0143f);
        this.f2528v = handler;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC0117a.f2238e, R.attr.alertDialogStyle, 0);
        this.f2523q = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.f2524r = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.f2525s = obtainStyledAttributes.getResourceId(7, 0);
        this.f2526t = obtainStyledAttributes.getResourceId(3, 0);
        this.f2527u = obtainStyledAttributes.getBoolean(6, true);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        dialogInterfaceC0143f.e().f(1);
    }

    public static ViewGroup a(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }
}
