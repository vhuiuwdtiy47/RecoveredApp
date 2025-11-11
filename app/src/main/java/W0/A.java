package W0;

import L.C0006b;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import l.C0224b0;

/* loaded from: classes.dex */
public final class A extends C0006b {
    public final TextInputLayout d;

    public A(TextInputLayout textInputLayout) {
        this.d = textInputLayout;
    }

    @Override // L.C0006b
    public final void d(View view, M.k kVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f319a;
        AccessibilityNodeInfo accessibilityNodeInfo = kVar.f417a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        TextInputLayout textInputLayout = this.d;
        EditText editText = textInputLayout.getEditText();
        Editable text = editText != null ? editText.getText() : null;
        CharSequence hint = textInputLayout.getHint();
        CharSequence error = textInputLayout.getError();
        CharSequence placeholderText = textInputLayout.getPlaceholderText();
        int counterMaxLength = textInputLayout.getCounterMaxLength();
        CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
        boolean isEmpty = TextUtils.isEmpty(text);
        boolean isEmpty2 = TextUtils.isEmpty(hint);
        boolean z2 = textInputLayout.f2055u0;
        boolean isEmpty3 = TextUtils.isEmpty(error);
        boolean z3 = (isEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
        String charSequence = !isEmpty2 ? hint.toString() : "";
        y yVar = textInputLayout.f2021b;
        C0224b0 c0224b0 = yVar.f945b;
        if (c0224b0.getVisibility() == 0) {
            accessibilityNodeInfo.setLabelFor(c0224b0);
            accessibilityNodeInfo.setTraversalAfter(c0224b0);
        } else {
            accessibilityNodeInfo.setTraversalAfter(yVar.d);
        }
        if (!isEmpty) {
            accessibilityNodeInfo.setText(text);
        } else if (!TextUtils.isEmpty(charSequence)) {
            accessibilityNodeInfo.setText(charSequence);
            if (!z2 && placeholderText != null) {
                accessibilityNodeInfo.setText(charSequence + ", " + ((Object) placeholderText));
            }
        } else if (placeholderText != null) {
            accessibilityNodeInfo.setText(placeholderText);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            accessibilityNodeInfo.setHintText(charSequence);
            accessibilityNodeInfo.setShowingHintText(isEmpty);
        }
        if (text == null || text.length() != counterMaxLength) {
            counterMaxLength = -1;
        }
        accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
        if (z3) {
            if (isEmpty3) {
                error = counterOverflowDescription;
            }
            accessibilityNodeInfo.setError(error);
        }
        C0224b0 c0224b02 = textInputLayout.f2033j.f928y;
        if (c0224b02 != null) {
            accessibilityNodeInfo.setLabelFor(c0224b02);
        }
        textInputLayout.f2022c.b().n(kVar);
    }

    @Override // L.C0006b
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        super.e(view, accessibilityEvent);
        this.d.f2022c.b().o(accessibilityEvent);
    }
}
