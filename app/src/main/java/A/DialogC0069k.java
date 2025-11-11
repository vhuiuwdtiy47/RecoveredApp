package a;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.C0098v;
import androidx.lifecycle.EnumC0091n;
import androidx.lifecycle.InterfaceC0096t;
import com.android.music.R;
import o0.InterfaceC0307d;
import p0.C0309a;

/* renamed from: a.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class DialogC0069k extends Dialog implements InterfaceC0096t, InterfaceC0307d {

    /* renamed from: a, reason: collision with root package name */
    public C0098v f1281a;

    /* renamed from: b, reason: collision with root package name */
    public final C.j f1282b;

    /* renamed from: c, reason: collision with root package name */
    public final v f1283c;

    public DialogC0069k(Context context, int i) {
        super(context, i);
        this.f1282b = new C.j(new C0309a(this, new C0062d(4, this)), 15);
        this.f1283c = new v(new F0.b(11, this));
    }

    public static void a(DialogC0069k dialogC0069k) {
        q1.d.e(dialogC0069k, "this$0");
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        q1.d.e(view, "view");
        c();
        super.addContentView(view, layoutParams);
    }

    @Override // o0.InterfaceC0307d
    public final C.j b() {
        return (C.j) this.f1282b.f61c;
    }

    public final void c() {
        Window window = getWindow();
        q1.d.b(window);
        View decorView = window.getDecorView();
        q1.d.d(decorView, "window!!.decorView");
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        Window window2 = getWindow();
        q1.d.b(window2);
        View decorView2 = window2.getDecorView();
        q1.d.d(decorView2, "window!!.decorView");
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        q1.d.b(window3);
        View decorView3 = window3.getDecorView();
        q1.d.d(decorView3, "window!!.decorView");
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // androidx.lifecycle.InterfaceC0096t
    public final C0098v d() {
        C0098v c0098v = this.f1281a;
        if (c0098v != null) {
            return c0098v;
        }
        C0098v c0098v2 = new C0098v(this);
        this.f1281a = c0098v2;
        return c0098v2;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f1283c.a();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            q1.d.d(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            v vVar = this.f1283c;
            vVar.getClass();
            vVar.f1310e = onBackInvokedDispatcher;
            vVar.b(vVar.f1312g);
        }
        this.f1282b.F(bundle);
        C0098v c0098v = this.f1281a;
        if (c0098v == null) {
            c0098v = new C0098v(this);
            this.f1281a = c0098v;
        }
        c0098v.d(EnumC0091n.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        q1.d.d(onSaveInstanceState, "super.onSaveInstanceState()");
        this.f1282b.G(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        C0098v c0098v = this.f1281a;
        if (c0098v == null) {
            c0098v = new C0098v(this);
            this.f1281a = c0098v;
        }
        c0098v.d(EnumC0091n.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        C0098v c0098v = this.f1281a;
        if (c0098v == null) {
            c0098v = new C0098v(this);
            this.f1281a = c0098v;
        }
        c0098v.d(EnumC0091n.ON_DESTROY);
        this.f1281a = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        c();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        q1.d.e(view, "view");
        c();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        q1.d.e(view, "view");
        c();
        super.setContentView(view, layoutParams);
    }
}
