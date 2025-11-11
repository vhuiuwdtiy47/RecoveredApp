package l;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import com.android.music.R;
import k.ViewTreeObserverOnGlobalLayoutListenerC0170d;

/* renamed from: l.P, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0203P extends C0180D0 implements InterfaceC0208S {

    /* renamed from: A, reason: collision with root package name */
    public CharSequence f2999A;

    /* renamed from: B, reason: collision with root package name */
    public C0199N f3000B;

    /* renamed from: C, reason: collision with root package name */
    public final Rect f3001C;

    /* renamed from: D, reason: collision with root package name */
    public int f3002D;

    /* renamed from: E, reason: collision with root package name */
    public final /* synthetic */ C0210T f3003E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0203P(C0210T c0210t, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle);
        this.f3003E = c0210t;
        this.f3001C = new Rect();
        this.f2949o = c0210t;
        this.f2959y = true;
        this.f2960z.setFocusable(true);
        this.f2950p = new W0.u(1, this);
    }

    @Override // l.InterfaceC0208S
    public final CharSequence b() {
        return this.f2999A;
    }

    @Override // l.InterfaceC0208S
    public final void g(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        C0179D c0179d = this.f2960z;
        boolean isShowing = c0179d.isShowing();
        q();
        this.f2960z.setInputMethodMode(2);
        show();
        C0254q0 c0254q0 = this.f2940c;
        c0254q0.setChoiceMode(1);
        c0254q0.setTextDirection(i);
        c0254q0.setTextAlignment(i2);
        C0210T c0210t = this.f3003E;
        int selectedItemPosition = c0210t.getSelectedItemPosition();
        C0254q0 c0254q02 = this.f2940c;
        if (c0179d.isShowing() && c0254q02 != null) {
            c0254q02.setListSelectionHidden(false);
            c0254q02.setSelection(selectedItemPosition);
            if (c0254q02.getChoiceMode() != 0) {
                c0254q02.setItemChecked(selectedItemPosition, true);
            }
        }
        if (isShowing || (viewTreeObserver = c0210t.getViewTreeObserver()) == null) {
            return;
        }
        ViewTreeObserverOnGlobalLayoutListenerC0170d viewTreeObserverOnGlobalLayoutListenerC0170d = new ViewTreeObserverOnGlobalLayoutListenerC0170d(3, this);
        viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC0170d);
        this.f2960z.setOnDismissListener(new C0201O(this, viewTreeObserverOnGlobalLayoutListenerC0170d));
    }

    @Override // l.InterfaceC0208S
    public final void h(CharSequence charSequence) {
        this.f2999A = charSequence;
    }

    @Override // l.C0180D0, l.InterfaceC0208S
    public final void m(ListAdapter listAdapter) {
        super.m(listAdapter);
        this.f3000B = (C0199N) listAdapter;
    }

    @Override // l.InterfaceC0208S
    public final void n(int i) {
        this.f3002D = i;
    }

    public final void q() {
        int i;
        C0179D c0179d = this.f2960z;
        Drawable background = c0179d.getBackground();
        C0210T c0210t = this.f3003E;
        if (background != null) {
            background.getPadding(c0210t.h);
            int layoutDirection = c0210t.getLayoutDirection();
            Rect rect = c0210t.h;
            i = layoutDirection == 1 ? rect.right : -rect.left;
        } else {
            Rect rect2 = c0210t.h;
            rect2.right = 0;
            rect2.left = 0;
            i = 0;
        }
        int paddingLeft = c0210t.getPaddingLeft();
        int paddingRight = c0210t.getPaddingRight();
        int width = c0210t.getWidth();
        int i2 = c0210t.f3020g;
        if (i2 == -2) {
            int a2 = c0210t.a(this.f3000B, c0179d.getBackground());
            int i3 = c0210t.getContext().getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = c0210t.h;
            int i4 = (i3 - rect3.left) - rect3.right;
            if (a2 > i4) {
                a2 = i4;
            }
            p(Math.max(a2, (width - paddingLeft) - paddingRight));
        } else if (i2 == -1) {
            p((width - paddingLeft) - paddingRight);
        } else {
            p(i2);
        }
        this.f2942f = c0210t.getLayoutDirection() == 1 ? (((width - paddingRight) - this.f2941e) - this.f3002D) + i : paddingLeft + this.f3002D + i;
    }
}
