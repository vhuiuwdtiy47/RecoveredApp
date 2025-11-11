package l;

import android.content.Context;
import android.view.View;
import android.view.Window;
import k.C0167a;

/* loaded from: classes.dex */
public final class a1 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final C0167a f3047a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b1 f3048b;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k.a] */
    public a1(b1 b1Var) {
        this.f3048b = b1Var;
        Context context = b1Var.f3055a.getContext();
        CharSequence charSequence = b1Var.h;
        ?? obj = new Object();
        obj.f2783e = 4096;
        obj.f2785g = 4096;
        obj.f2788l = null;
        obj.f2789m = null;
        obj.f2790n = false;
        obj.f2791o = false;
        obj.f2792p = 16;
        obj.i = context;
        obj.f2780a = charSequence;
        this.f3047a = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        b1 b1Var = this.f3048b;
        Window.Callback callback = b1Var.f3062k;
        if (callback == null || !b1Var.f3063l) {
            return;
        }
        callback.onMenuItemSelected(0, this.f3047a);
    }
}
