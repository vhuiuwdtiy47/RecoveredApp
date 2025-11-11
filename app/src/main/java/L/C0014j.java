package L;

import android.view.DisplayCutout;
import java.util.Objects;

/* renamed from: L.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0014j {

    /* renamed from: a, reason: collision with root package name */
    public final DisplayCutout f354a;

    public C0014j(DisplayCutout displayCutout) {
        this.f354a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0014j.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f354a, ((C0014j) obj).f354a);
    }

    public final int hashCode() {
        DisplayCutout displayCutout = this.f354a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f354a + "}";
    }
}
