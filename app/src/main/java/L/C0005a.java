package L;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.android.music.R;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: L.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0005a extends View.AccessibilityDelegate {

    /* renamed from: a, reason: collision with root package name */
    public final C0006b f317a;

    public C0005a(C0006b c0006b) {
        this.f317a = c0006b;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.f317a.a(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        A0.c b2 = this.f317a.b(view);
        if (b2 != null) {
            return (AccessibilityNodeProvider) b2.f33b;
        }
        return null;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f317a.c(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        Object tag;
        M.k kVar = new M.k(accessibilityNodeInfo);
        WeakHashMap weakHashMap = S.f311a;
        accessibilityNodeInfo.setScreenReaderFocusable(Boolean.valueOf(L.d(view)).booleanValue());
        accessibilityNodeInfo.setHeading(Boolean.valueOf(L.c(view)).booleanValue());
        accessibilityNodeInfo.setPaneTitle(L.b(view));
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            tag = N.b(view);
        } else {
            tag = view.getTag(R.id.tag_state_description);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        CharSequence charSequence = (CharSequence) tag;
        if (i >= 30) {
            M.g.c(accessibilityNodeInfo, charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
        this.f317a.d(view, kVar);
        accessibilityNodeInfo.getText();
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            kVar.b((M.f) list.get(i2));
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f317a.e(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f317a.f(viewGroup, view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        return this.f317a.g(view, i, bundle);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEvent(View view, int i) {
        this.f317a.h(view, i);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.f317a.i(view, accessibilityEvent);
    }
}
