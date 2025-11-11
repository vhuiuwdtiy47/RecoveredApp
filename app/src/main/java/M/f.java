package M;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: e, reason: collision with root package name */
    public static final f f407e;

    /* renamed from: f, reason: collision with root package name */
    public static final f f408f;

    /* renamed from: g, reason: collision with root package name */
    public static final f f409g;
    public static final f h;
    public static final f i;

    /* renamed from: j, reason: collision with root package name */
    public static final f f410j;

    /* renamed from: k, reason: collision with root package name */
    public static final f f411k;

    /* renamed from: l, reason: collision with root package name */
    public static final f f412l;

    /* renamed from: a, reason: collision with root package name */
    public final Object f413a;

    /* renamed from: b, reason: collision with root package name */
    public final int f414b;

    /* renamed from: c, reason: collision with root package name */
    public final Class f415c;
    public final t d;

    static {
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction3;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction4;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction5;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction6;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction7;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction8;
        new f(1);
        new f(2);
        new f(4);
        new f(8);
        f407e = new f(16);
        new f(32);
        new f(64);
        new f(128);
        new f(256, m.class);
        new f(512, m.class);
        new f(1024, n.class);
        new f(2048, n.class);
        f408f = new f(4096);
        f409g = new f(8192);
        new f(16384);
        new f(32768);
        new f(65536);
        new f(131072, r.class);
        h = new f(262144);
        i = new f(524288);
        f410j = new f(1048576);
        new f(2097152, s.class);
        int i2 = Build.VERSION.SDK_INT;
        new f(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
        new f(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, p.class);
        f411k = new f(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
        new f(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
        f412l = new f(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
        new f(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
        new f(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP, R.id.accessibilityActionPageUp, null, null, null);
        new f(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN, R.id.accessibilityActionPageDown, null, null, null);
        new f(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT, R.id.accessibilityActionPageLeft, null, null, null);
        new f(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT, R.id.accessibilityActionPageRight, null, null, null);
        new f(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
        new f(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, q.class);
        new f(AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, R.id.accessibilityActionMoveWindow, null, null, o.class);
        new f(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP, R.id.accessibilityActionShowTooltip, null, null, null);
        new f(AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP, R.id.accessibilityActionHideTooltip, null, null, null);
        new f(i2 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
        if (i2 >= 30) {
            accessibilityAction8 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
            accessibilityAction = accessibilityAction8;
        } else {
            accessibilityAction = null;
        }
        new f(accessibilityAction, R.id.accessibilityActionImeEnter, null, null, null);
        new f(i2 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.ALT, null, null, null);
        if (i2 >= 32) {
            accessibilityAction7 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
            accessibilityAction2 = accessibilityAction7;
        } else {
            accessibilityAction2 = null;
        }
        new f(accessibilityAction2, R.id.CTRL, null, null, null);
        if (i2 >= 32) {
            accessibilityAction6 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
            accessibilityAction3 = accessibilityAction6;
        } else {
            accessibilityAction3 = null;
        }
        new f(accessibilityAction3, R.id.FUNCTION, null, null, null);
        if (i2 >= 33) {
            accessibilityAction5 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
            accessibilityAction4 = accessibilityAction5;
        } else {
            accessibilityAction4 = null;
        }
        new f(accessibilityAction4, R.id.KEYCODE_0, null, null, null);
        new f(i2 >= 34 ? i.a() : null, R.id.KEYCODE_3D_MODE, null, null, null);
    }

    public f(int i2) {
        this(null, i2, null, null, null);
    }

    public final int a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.f413a).getId();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof f)) {
            return false;
        }
        Object obj2 = ((f) obj).f413a;
        Object obj3 = this.f413a;
        return obj3 == null ? obj2 == null : obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.f413a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String d = k.d(this.f414b);
        if (d.equals("ACTION_UNKNOWN")) {
            Object obj = this.f413a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                d = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb.append(d);
        return sb.toString();
    }

    public f(int i2, Class cls) {
        this(null, i2, null, null, cls);
    }

    public f(Object obj, int i2, String str, t tVar, Class cls) {
        this.f414b = i2;
        this.d = tVar;
        if (obj == null) {
            this.f413a = new AccessibilityNodeInfo.AccessibilityAction(i2, str);
        } else {
            this.f413a = obj;
        }
        this.f415c = cls;
    }
}
