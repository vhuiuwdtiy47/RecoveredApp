package M;

import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final AccessibilityNodeInfo.CollectionItemInfo f416a;

    public j(AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo) {
        this.f416a = collectionItemInfo;
    }

    public static j a(boolean z2, int i, int i2, int i3, int i4) {
        return new j(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, false, z2));
    }
}
