package W0;

import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;

/* renamed from: W0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0031a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f838a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f839b;

    public /* synthetic */ ViewOnClickListenerC0031a(int i, Object obj) {
        this.f838a = i;
        this.f839b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f838a) {
            case 0:
                e eVar = (e) this.f839b;
                EditText editText = eVar.i;
                if (editText == null) {
                    return;
                }
                Editable text = editText.getText();
                if (text != null) {
                    text.clear();
                }
                eVar.q();
                return;
            case 1:
                ((k) this.f839b).u();
                return;
            case 2:
                x xVar = (x) this.f839b;
                EditText editText2 = xVar.f942f;
                if (editText2 == null) {
                    return;
                }
                int selectionEnd = editText2.getSelectionEnd();
                EditText editText3 = xVar.f942f;
                if (editText3 == null || !(editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                    xVar.f942f.setTransformationMethod(PasswordTransformationMethod.getInstance());
                } else {
                    xVar.f942f.setTransformationMethod(null);
                }
                if (selectionEnd >= 0) {
                    xVar.f942f.setSelection(selectionEnd);
                }
                xVar.q();
                return;
            default:
                ((com.google.android.material.datepicker.l) this.f839b).O();
                throw null;
        }
    }
}
