package C;

import android.content.res.Resources;
import java.util.Objects;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final Resources f65a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources.Theme f66b;

    public n(Resources resources, Resources.Theme theme) {
        this.f65a = resources;
        this.f66b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n.class == obj.getClass()) {
            n nVar = (n) obj;
            if (this.f65a.equals(nVar.f65a) && Objects.equals(this.f66b, nVar.f66b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f65a, this.f66b);
    }
}
