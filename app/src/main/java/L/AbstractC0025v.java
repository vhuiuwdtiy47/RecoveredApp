package L;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.PointerIcon;

/* renamed from: L.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0025v {
    public static PointerIcon a(Bitmap bitmap, float f2, float f3) {
        return PointerIcon.create(bitmap, f2, f3);
    }

    public static PointerIcon b(Context context, int i) {
        return PointerIcon.getSystemIcon(context, i);
    }

    public static PointerIcon c(Resources resources, int i) {
        return PointerIcon.load(resources, i);
    }
}
