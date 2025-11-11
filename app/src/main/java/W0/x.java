package W0;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.android.music.R;

/* loaded from: classes.dex */
public final class x extends q {

    /* renamed from: e, reason: collision with root package name */
    public final int f941e;

    /* renamed from: f, reason: collision with root package name */
    public EditText f942f;

    /* renamed from: g, reason: collision with root package name */
    public final ViewOnClickListenerC0031a f943g;

    public x(p pVar, int i) {
        super(pVar);
        this.f941e = R.drawable.design_password_eye;
        this.f943g = new ViewOnClickListenerC0031a(2, this);
        if (i != 0) {
            this.f941e = i;
        }
    }

    @Override // W0.q
    public final void b() {
        q();
    }

    @Override // W0.q
    public final int c() {
        return R.string.password_toggle_content_description;
    }

    @Override // W0.q
    public final int d() {
        return this.f941e;
    }

    @Override // W0.q
    public final View.OnClickListener f() {
        return this.f943g;
    }

    @Override // W0.q
    public final boolean k() {
        return true;
    }

    @Override // W0.q
    public final boolean l() {
        EditText editText = this.f942f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // W0.q
    public final void m(EditText editText) {
        this.f942f = editText;
        q();
    }

    @Override // W0.q
    public final void r() {
        EditText editText = this.f942f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f942f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // W0.q
    public final void s() {
        EditText editText = this.f942f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
