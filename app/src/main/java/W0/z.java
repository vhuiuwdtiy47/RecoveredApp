package W0;

import L.S;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class z implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    public int f951a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EditText f952b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TextInputLayout f953c;

    public z(TextInputLayout textInputLayout, EditText editText) {
        this.f953c = textInputLayout;
        this.f952b = editText;
        this.f951a = editText.getLineCount();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.f953c;
        textInputLayout.u(!textInputLayout.f1996A0, false);
        if (textInputLayout.f2035k) {
            textInputLayout.n(editable);
        }
        if (textInputLayout.f2050s) {
            textInputLayout.v(editable);
        }
        EditText editText = this.f952b;
        int lineCount = editText.getLineCount();
        int i = this.f951a;
        if (lineCount != i) {
            if (lineCount < i) {
                WeakHashMap weakHashMap = S.f311a;
                int minimumHeight = editText.getMinimumHeight();
                int i2 = textInputLayout.f2053t0;
                if (minimumHeight != i2) {
                    editText.setMinimumHeight(i2);
                }
            }
            this.f951a = lineCount;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
