package R;

import android.widget.PopupWindow;

/* loaded from: classes.dex */
public abstract class l {
    public static boolean a(PopupWindow popupWindow) {
        return popupWindow.getOverlapAnchor();
    }

    public static int b(PopupWindow popupWindow) {
        return popupWindow.getWindowLayoutType();
    }

    public static void c(PopupWindow popupWindow, boolean z2) {
        popupWindow.setOverlapAnchor(z2);
    }

    public static void d(PopupWindow popupWindow, int i) {
        popupWindow.setWindowLayoutType(i);
    }
}
