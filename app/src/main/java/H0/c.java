package H0;

import M.f;
import M.k;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import com.android.music.R;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class c extends T.b {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Chip f194q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Chip chip, Chip chip2) {
        super(chip2);
        this.f194q = chip;
    }

    @Override // T.b
    public final void l(ArrayList arrayList) {
        e eVar;
        arrayList.add(0);
        Rect rect = Chip.f1855w;
        Chip chip = this.f194q;
        if (!chip.c() || (eVar = chip.f1858e) == null || !eVar.f207I || chip.h == null) {
            return;
        }
        arrayList.add(1);
    }

    @Override // T.b
    public final void o(int i, k kVar) {
        Rect closeIconTouchBoundsInt;
        AccessibilityNodeInfo accessibilityNodeInfo = kVar.f417a;
        if (i != 1) {
            accessibilityNodeInfo.setContentDescription("");
            accessibilityNodeInfo.setBoundsInParent(Chip.f1855w);
            return;
        }
        Chip chip = this.f194q;
        CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
        if (closeIconContentDescription != null) {
            accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
        } else {
            CharSequence text = chip.getText();
            accessibilityNodeInfo.setContentDescription(chip.getContext().getString(R.string.mtrl_chip_close_icon_content_description, TextUtils.isEmpty(text) ? "" : text).trim());
        }
        closeIconTouchBoundsInt = chip.getCloseIconTouchBoundsInt();
        accessibilityNodeInfo.setBoundsInParent(closeIconTouchBoundsInt);
        kVar.b(f.f407e);
        accessibilityNodeInfo.setEnabled(chip.isEnabled());
    }
}
