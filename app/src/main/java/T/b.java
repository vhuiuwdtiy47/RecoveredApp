package T;

import L.C0006b;
import L.S;
import M.k;
import Z0.f;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class b extends C0006b {

    /* renamed from: n, reason: collision with root package name */
    public static final Rect f630n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: o, reason: collision with root package name */
    public static final T0.e f631o = new T0.e(4);

    /* renamed from: p, reason: collision with root package name */
    public static final f f632p = new Object();
    public final AccessibilityManager h;
    public final Chip i;

    /* renamed from: j, reason: collision with root package name */
    public a f636j;
    public final Rect d = new Rect();

    /* renamed from: e, reason: collision with root package name */
    public final Rect f633e = new Rect();

    /* renamed from: f, reason: collision with root package name */
    public final Rect f634f = new Rect();

    /* renamed from: g, reason: collision with root package name */
    public final int[] f635g = new int[2];

    /* renamed from: k, reason: collision with root package name */
    public int f637k = Integer.MIN_VALUE;

    /* renamed from: l, reason: collision with root package name */
    public int f638l = Integer.MIN_VALUE;

    /* renamed from: m, reason: collision with root package name */
    public int f639m = Integer.MIN_VALUE;

    public b(Chip chip) {
        this.i = chip;
        this.h = (AccessibilityManager) chip.getContext().getSystemService("accessibility");
        chip.setFocusable(true);
        WeakHashMap weakHashMap = S.f311a;
        if (chip.getImportantForAccessibility() == 0) {
            chip.setImportantForAccessibility(1);
        }
    }

    @Override // L.C0006b
    public final A0.c b(View view) {
        if (this.f636j == null) {
            this.f636j = new a(this);
        }
        return this.f636j;
    }

    @Override // L.C0006b
    public final void d(View view, k kVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f319a;
        AccessibilityNodeInfo accessibilityNodeInfo = kVar.f417a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        Chip chip = ((H0.c) this).f194q;
        H0.e eVar = chip.f1858e;
        accessibilityNodeInfo.setCheckable(eVar != null && eVar.f213O);
        accessibilityNodeInfo.setClickable(chip.isClickable());
        accessibilityNodeInfo.setClassName(chip.getAccessibilityClassName());
        accessibilityNodeInfo.setText(chip.getText());
    }

    public final boolean j(int i) {
        if (this.f638l != i) {
            return false;
        }
        this.f638l = Integer.MIN_VALUE;
        H0.c cVar = (H0.c) this;
        if (i == 1) {
            Chip chip = cVar.f194q;
            chip.f1864m = false;
            chip.refreshDrawableState();
        }
        q(i, 8);
        return true;
    }

    public final k k(int i) {
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        k kVar = new k(obtain);
        obtain.setEnabled(true);
        obtain.setFocusable(true);
        obtain.setClassName("android.view.View");
        Rect rect = f630n;
        obtain.setBoundsInParent(rect);
        obtain.setBoundsInScreen(rect);
        Chip chip = this.i;
        obtain.setParent(chip);
        o(i, kVar);
        if (kVar.g() == null && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.f633e;
        kVar.f(rect2);
        if (rect2.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int actions = obtain.getActions();
        if ((actions & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((actions & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        obtain.setPackageName(chip.getContext().getPackageName());
        kVar.f418b = i;
        obtain.setSource(chip, i);
        if (this.f637k == i) {
            obtain.setAccessibilityFocused(true);
            kVar.a(128);
        } else {
            obtain.setAccessibilityFocused(false);
            kVar.a(64);
        }
        boolean z2 = this.f638l == i;
        if (z2) {
            kVar.a(2);
        } else if (obtain.isFocusable()) {
            kVar.a(1);
        }
        obtain.setFocused(z2);
        int[] iArr = this.f635g;
        chip.getLocationOnScreen(iArr);
        Rect rect3 = this.d;
        obtain.getBoundsInScreen(rect3);
        if (rect3.equals(rect)) {
            kVar.f(rect3);
            rect3.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
        }
        Rect rect4 = this.f634f;
        if (chip.getLocalVisibleRect(rect4)) {
            rect4.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
            if (rect3.intersect(rect4)) {
                obtain.setBoundsInScreen(rect3);
                if (!rect3.isEmpty() && chip.getWindowVisibility() == 0) {
                    Object parent = chip.getParent();
                    while (true) {
                        if (parent instanceof View) {
                            View view = (View) parent;
                            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                                break;
                            }
                            parent = view.getParent();
                        } else if (parent != null) {
                            obtain.setVisibleToUser(true);
                        }
                    }
                }
            }
        }
        return kVar;
    }

    public abstract void l(ArrayList arrayList);

    /* JADX WARN: Removed duplicated region for block: B:27:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m(int r21, android.graphics.Rect r22) {
        /*
            Method dump skipped, instructions count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: T.b.m(int, android.graphics.Rect):boolean");
    }

    public final k n(int i) {
        if (i != -1) {
            return k(i);
        }
        Chip chip = this.i;
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(chip);
        k kVar = new k(obtain);
        WeakHashMap weakHashMap = S.f311a;
        chip.onInitializeAccessibilityNodeInfo(obtain);
        ArrayList arrayList = new ArrayList();
        l(arrayList);
        if (obtain.getChildCount() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            kVar.f417a.addChild(chip, ((Integer) arrayList.get(i2)).intValue());
        }
        return kVar;
    }

    public abstract void o(int i, k kVar);

    public final boolean p(int i) {
        int i2;
        Chip chip = this.i;
        if ((!chip.isFocused() && !chip.requestFocus()) || (i2 = this.f638l) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            j(i2);
        }
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        this.f638l = i;
        H0.c cVar = (H0.c) this;
        if (i == 1) {
            Chip chip2 = cVar.f194q;
            chip2.f1864m = true;
            chip2.refreshDrawableState();
        }
        q(i, 8);
        return true;
    }

    public final void q(int i, int i2) {
        View view;
        ViewParent parent;
        AccessibilityEvent obtain;
        if (i == Integer.MIN_VALUE || !this.h.isEnabled() || (parent = (view = this.i).getParent()) == null) {
            return;
        }
        if (i != -1) {
            obtain = AccessibilityEvent.obtain(i2);
            k n2 = n(i);
            obtain.getText().add(n2.g());
            AccessibilityNodeInfo accessibilityNodeInfo = n2.f417a;
            obtain.setContentDescription(accessibilityNodeInfo.getContentDescription());
            obtain.setScrollable(accessibilityNodeInfo.isScrollable());
            obtain.setPassword(accessibilityNodeInfo.isPassword());
            obtain.setEnabled(accessibilityNodeInfo.isEnabled());
            obtain.setChecked(accessibilityNodeInfo.isChecked());
            if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            }
            obtain.setClassName(accessibilityNodeInfo.getClassName());
            obtain.setSource(view, i);
            obtain.setPackageName(view.getContext().getPackageName());
        } else {
            obtain = AccessibilityEvent.obtain(i2);
            view.onInitializeAccessibilityEvent(obtain);
        }
        parent.requestSendAccessibilityEvent(view, obtain);
    }
}
