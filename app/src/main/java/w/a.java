package W;

import U.x;
import android.text.Editable;

/* loaded from: classes.dex */
public final class a extends Editable.Factory {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f817a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static volatile a f818b;

    /* renamed from: c, reason: collision with root package name */
    public static Class f819c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f819c;
        return cls != null ? new x(cls, charSequence) : super.newEditable(charSequence);
    }
}
