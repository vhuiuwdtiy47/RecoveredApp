package L;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import com.android.music.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* renamed from: L.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0006b {

    /* renamed from: c, reason: collision with root package name */
    public static final View.AccessibilityDelegate f318c = new View.AccessibilityDelegate();

    /* renamed from: a, reason: collision with root package name */
    public final View.AccessibilityDelegate f319a;

    /* renamed from: b, reason: collision with root package name */
    public final C0005a f320b;

    public C0006b() {
        this(f318c);
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f319a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public A0.c b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f319a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new A0.c(5, accessibilityNodeProvider);
        }
        return null;
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.f319a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(View view, M.k kVar) {
        this.f319a.onInitializeAccessibilityNodeInfo(view, kVar.f417a);
    }

    public void e(View view, AccessibilityEvent accessibilityEvent) {
        this.f319a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f319a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean g(View view, int i, Bundle bundle) {
        boolean z2;
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        boolean z3 = false;
        int i2 = 0;
        while (true) {
            if (i2 >= list.size()) {
                break;
            }
            M.f fVar = (M.f) list.get(i2);
            if (fVar.a() == i) {
                M.t tVar = fVar.d;
                if (tVar != null) {
                    Class cls = fVar.f415c;
                    if (cls != null) {
                        try {
                            if (cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]) == null) {
                                throw null;
                            }
                            throw new ClassCastException();
                        } catch (Exception e2) {
                            Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: ".concat(cls.getName()), e2);
                        }
                    }
                    z2 = tVar.j(view);
                }
            } else {
                i2++;
            }
        }
        z2 = false;
        if (!z2) {
            z2 = this.f319a.performAccessibilityAction(view, i, bundle);
        }
        if (z2 || i != R.id.accessibility_action_clickable_span || bundle == null) {
            return z2;
        }
        int i3 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i3)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            int i4 = 0;
            while (true) {
                if (clickableSpanArr == null || i4 >= clickableSpanArr.length) {
                    break;
                }
                if (clickableSpan.equals(clickableSpanArr[i4])) {
                    clickableSpan.onClick(view);
                    z3 = true;
                    break;
                }
                i4++;
            }
        }
        return z3;
    }

    public void h(View view, int i) {
        this.f319a.sendAccessibilityEvent(view, i);
    }

    public void i(View view, AccessibilityEvent accessibilityEvent) {
        this.f319a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public C0006b(View.AccessibilityDelegate accessibilityDelegate) {
        this.f319a = accessibilityDelegate;
        this.f320b = new C0005a(this);
    }
}
