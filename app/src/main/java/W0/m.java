package W0;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f872a;

    public m(p pVar) {
        this.f872a = pVar;
    }

    public final void a(TextInputLayout textInputLayout) {
        p pVar = this.f872a;
        if (pVar.f893s == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = pVar.f893s;
        l lVar = pVar.f896v;
        if (editText != null) {
            editText.removeTextChangedListener(lVar);
            if (pVar.f893s.getOnFocusChangeListener() == pVar.b().e()) {
                pVar.f893s.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        pVar.f893s = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(lVar);
        }
        pVar.b().m(pVar.f893s);
        pVar.j(pVar.b());
    }
}
