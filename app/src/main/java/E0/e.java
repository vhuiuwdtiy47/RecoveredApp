package E0;

import L.C0006b;
import M.j;
import M.k;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.android.music.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;

/* loaded from: classes.dex */
public final class e extends C0006b {
    public final /* synthetic */ int d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f141e;

    public /* synthetic */ e(int i, Object obj) {
        this.d = i;
        this.f141e = obj;
    }

    @Override // L.C0006b
    public void c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.d) {
            case 1:
                super.c(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.f141e).d);
                return;
            default:
                super.c(view, accessibilityEvent);
                return;
        }
    }

    @Override // L.C0006b
    public final void d(View view, k kVar) {
        int i;
        Object obj = this.f141e;
        View.AccessibilityDelegate accessibilityDelegate = this.f319a;
        switch (this.d) {
            case 0:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, kVar.f417a);
                int i2 = MaterialButtonToggleGroup.f1844k;
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj;
                if (view instanceof MaterialButton) {
                    i = 0;
                    for (int i3 = 0; i3 < materialButtonToggleGroup.getChildCount(); i3++) {
                        if (materialButtonToggleGroup.getChildAt(i3) == view) {
                            kVar.h(j.a(((MaterialButton) view).f1841o, 0, 1, i, 1));
                            return;
                        }
                        if ((materialButtonToggleGroup.getChildAt(i3) instanceof MaterialButton) && materialButtonToggleGroup.c(i3)) {
                            i++;
                        }
                    }
                }
                i = -1;
                kVar.h(j.a(((MaterialButton) view).f1841o, 0, 1, i, 1));
                return;
            case 1:
                AccessibilityNodeInfo accessibilityNodeInfo = kVar.f417a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                accessibilityNodeInfo.setCheckable(checkableImageButton.f1956e);
                accessibilityNodeInfo.setChecked(checkableImageButton.d);
                return;
            case 2:
                AccessibilityNodeInfo accessibilityNodeInfo2 = kVar.f417a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                accessibilityNodeInfo2.setCheckable(((NavigationMenuItemView) obj).f1966x);
                return;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo3 = kVar.f417a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo3);
                com.google.android.material.datepicker.j jVar = (com.google.android.material.datepicker.j) obj;
                accessibilityNodeInfo3.setHintText(jVar.f1907h0.getVisibility() == 0 ? jVar.H().getResources().getString(R.string.mtrl_picker_toggle_to_year_selection) : jVar.H().getResources().getString(R.string.mtrl_picker_toggle_to_day_selection));
                return;
        }
    }
}
