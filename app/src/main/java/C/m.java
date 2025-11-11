package C;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f62a;

    /* renamed from: b, reason: collision with root package name */
    public final Configuration f63b;

    /* renamed from: c, reason: collision with root package name */
    public final int f64c;

    public m(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.f62a = colorStateList;
        this.f63b = configuration;
        this.f64c = theme == null ? 0 : theme.hashCode();
    }
}
