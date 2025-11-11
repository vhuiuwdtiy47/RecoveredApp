package R0;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f624a = {R.attr.state_pressed};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f625b = {R.attr.state_focused};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f626c = {R.attr.state_selected, R.attr.state_pressed};
    public static final int[] d = {R.attr.state_selected};

    public static int a(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return D.a.d(colorForState, Math.min(Color.alpha(colorForState) * 2, 255));
    }

    public static ColorStateList b(ColorStateList colorStateList) {
        return colorStateList != null ? colorStateList : ColorStateList.valueOf(0);
    }
}
