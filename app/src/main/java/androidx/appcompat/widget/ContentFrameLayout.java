package androidx.appcompat.widget;

import L.Y;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import g.B;
import g.r;
import k.m;
import l.C0233g;
import l.C0243l;
import l.InterfaceC0236h0;
import l.InterfaceC0238i0;
import l.b1;

/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public TypedValue f1410a;

    /* renamed from: b, reason: collision with root package name */
    public TypedValue f1411b;

    /* renamed from: c, reason: collision with root package name */
    public TypedValue f1412c;
    public TypedValue d;

    /* renamed from: e, reason: collision with root package name */
    public TypedValue f1413e;

    /* renamed from: f, reason: collision with root package name */
    public TypedValue f1414f;

    /* renamed from: g, reason: collision with root package name */
    public final Rect f1415g;
    public InterfaceC0236h0 h;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f1415g = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f1413e == null) {
            this.f1413e = new TypedValue();
        }
        return this.f1413e;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f1414f == null) {
            this.f1414f = new TypedValue();
        }
        return this.f1414f;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f1412c == null) {
            this.f1412c = new TypedValue();
        }
        return this.f1412c;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.d == null) {
            this.d = new TypedValue();
        }
        return this.d;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f1410a == null) {
            this.f1410a = new TypedValue();
        }
        return this.f1410a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f1411b == null) {
            this.f1411b = new TypedValue();
        }
        return this.f1411b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC0236h0 interfaceC0236h0 = this.h;
        if (interfaceC0236h0 != null) {
            interfaceC0236h0.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C0243l c0243l;
        super.onDetachedFromWindow();
        InterfaceC0236h0 interfaceC0236h0 = this.h;
        if (interfaceC0236h0 != null) {
            B b2 = ((r) interfaceC0236h0).f2555b;
            InterfaceC0238i0 interfaceC0238i0 = b2.f2447r;
            if (interfaceC0238i0 != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0238i0;
                actionBarOverlayLayout.k();
                ActionMenuView actionMenuView = ((b1) actionBarOverlayLayout.f1375e).f3055a.f1435a;
                if (actionMenuView != null && (c0243l = actionMenuView.f1399t) != null) {
                    c0243l.e();
                    C0233g c0233g = c0243l.f3104u;
                    if (c0233g != null && c0233g.b()) {
                        c0233g.i.dismiss();
                    }
                }
            }
            if (b2.f2452w != null) {
                b2.f2441l.getDecorView().removeCallbacks(b2.f2453x);
                if (b2.f2452w.isShowing()) {
                    try {
                        b2.f2452w.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                b2.f2452w = null;
            }
            Y y2 = b2.f2454y;
            if (y2 != null) {
                y2.b();
            }
            m mVar = b2.y(0).h;
            if (mVar != null) {
                mVar.c(true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ac A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b3  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(InterfaceC0236h0 interfaceC0236h0) {
        this.h = interfaceC0236h0;
    }
}
