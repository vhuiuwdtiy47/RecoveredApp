package W;

import U.t;
import android.text.InputFilter;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class g extends t {

    /* renamed from: e, reason: collision with root package name */
    public final f f831e;

    public g(TextView textView) {
        this.f831e = new f(textView);
    }

    @Override // U.t
    public final void X(boolean z2) {
        if (U.i.f759k != null) {
            this.f831e.X(z2);
        }
    }

    @Override // U.t
    public final void Z(boolean z2) {
        boolean z3 = U.i.f759k != null;
        f fVar = this.f831e;
        if (z3) {
            fVar.Z(z2);
        } else {
            fVar.f830g = z2;
        }
    }

    @Override // U.t
    public final InputFilter[] w(InputFilter[] inputFilterArr) {
        return !(U.i.f759k != null) ? inputFilterArr : this.f831e.w(inputFilterArr);
    }
}
