package W0;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f897a;

    /* renamed from: b, reason: collision with root package name */
    public final p f898b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f899c;
    public final CheckableImageButton d;

    public q(p pVar) {
        this.f897a = pVar.f878a;
        this.f898b = pVar;
        this.f899c = pVar.getContext();
        this.d = pVar.f883g;
    }

    public void a() {
    }

    public void b() {
    }

    public int c() {
        return 0;
    }

    public int d() {
        return 0;
    }

    public View.OnFocusChangeListener e() {
        return null;
    }

    public View.OnClickListener f() {
        return null;
    }

    public View.OnFocusChangeListener g() {
        return null;
    }

    public Q.b h() {
        return null;
    }

    public boolean i(int i) {
        return true;
    }

    public boolean j() {
        return false;
    }

    public boolean k() {
        return this instanceof k;
    }

    public boolean l() {
        return false;
    }

    public void m(EditText editText) {
    }

    public void n(M.k kVar) {
    }

    public void o(AccessibilityEvent accessibilityEvent) {
    }

    public void p(boolean z2) {
    }

    public final void q() {
        this.f898b.f(false);
    }

    public void r() {
    }

    public void s() {
    }
}
