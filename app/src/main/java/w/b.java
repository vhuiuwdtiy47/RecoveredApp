package W;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class b extends InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final EditText f820a;

    /* renamed from: b, reason: collision with root package name */
    public final T0.e f821b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        super(inputConnection, false);
        T0.e eVar = new T0.e(7);
        this.f820a = editText;
        this.f821b = eVar;
        if (U.i.f759k != null) {
            U.i a2 = U.i.a();
            if (a2.b() != 1 || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            U.e eVar2 = a2.f763e;
            eVar2.getClass();
            Bundle bundle = editorInfo.extras;
            V.b bVar = (V.b) eVar2.f754c.f790a;
            int a3 = bVar.a(4);
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", a3 != 0 ? ((ByteBuffer) bVar.d).getInt(a3 + bVar.f304a) : 0);
            Bundle bundle2 = editorInfo.extras;
            eVar2.f752a.getClass();
            bundle2.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        Editable editableText = this.f820a.getEditableText();
        this.f821b.getClass();
        return T0.e.c(this, editableText, i, i2, false) || super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        Editable editableText = this.f820a.getEditableText();
        this.f821b.getClass();
        return T0.e.c(this, editableText, i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2);
    }
}
