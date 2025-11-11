package Z0;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.TextView;
import com.xiaomi.vlive.App;

/* loaded from: classes.dex */
public final class b implements a1.a {

    /* renamed from: a, reason: collision with root package name */
    public View f1220a;

    /* renamed from: b, reason: collision with root package name */
    public TextView f1221b;

    /* renamed from: c, reason: collision with root package name */
    public int f1222c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1223e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final e f1224f;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, Z0.j] */
    public b(Activity activity) {
        e eVar = new e(activity, this);
        eVar.f1231e = false;
        ?? obj = new Object();
        obj.f1246a = activity;
        eVar.f1229b = obj;
        this.f1224f = eVar;
    }

    @Override // a1.a
    public final void cancel() {
        switch (this.f1223e) {
            case 0:
                this.f1224f.b();
                return;
            default:
                this.f1224f.b();
                return;
        }
    }

    @Override // a1.a
    public final void setDuration(int i) {
        this.d = i;
    }

    @Override // a1.a
    public final void setGravity(int i, int i2, int i3) {
        this.f1222c = 17;
    }

    @Override // a1.a
    public final void setMargin(float f2, float f3) {
    }

    @Override // a1.a
    public final void setText(CharSequence charSequence) {
        TextView textView = this.f1221b;
        if (textView == null) {
            return;
        }
        textView.setText(charSequence);
    }

    @Override // a1.a
    public final void setView(View view) {
        this.f1220a = view;
        if (view == null) {
            this.f1221b = null;
        } else {
            this.f1221b = a1.a.a(view);
        }
    }

    @Override // a1.a
    public final void show() {
        switch (this.f1223e) {
            case 0:
                e eVar = this.f1224f;
                if (eVar.d) {
                    return;
                }
                boolean z2 = Looper.myLooper() == Looper.getMainLooper();
                d dVar = eVar.f1232f;
                if (z2) {
                    dVar.run();
                    return;
                }
                Handler handler = e.h;
                handler.removeCallbacks(dVar);
                handler.post(dVar);
                return;
            default:
                e eVar2 = this.f1224f;
                if (eVar2.d) {
                    return;
                }
                boolean z3 = Looper.myLooper() == Looper.getMainLooper();
                d dVar2 = eVar2.f1232f;
                if (z3) {
                    dVar2.run();
                    return;
                }
                Handler handler2 = e.h;
                handler2.removeCallbacks(dVar2);
                handler2.post(dVar2);
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, Z0.j] */
    public b(App app) {
        e eVar = new e(app, this);
        eVar.f1231e = true;
        ?? obj = new Object();
        obj.f1247b = app;
        eVar.f1229b = obj;
        this.f1224f = eVar;
    }
}
