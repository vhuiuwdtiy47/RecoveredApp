package com.google.android.material.internal;

import E0.e;
import L.S;
import M0.a;
import S.b;
import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import l.C0173A;

/* loaded from: classes.dex */
public class CheckableImageButton extends C0173A implements Checkable {

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f1955g = {R.attr.state_checked};
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1956e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1957f;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.android.music.R.attr.imageButtonStyle);
        this.f1956e = true;
        this.f1957f = true;
        S.h(this, new e(1, this));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        return this.d ? View.mergeDrawableStates(super.onCreateDrawableState(i + 1), f1955g) : super.onCreateDrawableState(i);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.f628a);
        setChecked(aVar.f420c);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.os.Parcelable, M0.a, S.b] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? bVar = new b(super.onSaveInstanceState());
        bVar.f420c = this.d;
        return bVar;
    }

    public void setCheckable(boolean z2) {
        if (this.f1956e != z2) {
            this.f1956e = z2;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z2) {
        if (!this.f1956e || this.d == z2) {
            return;
        }
        this.d = z2;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z2) {
        this.f1957f = z2;
    }

    @Override // android.view.View
    public void setPressed(boolean z2) {
        if (this.f1957f) {
            super.setPressed(z2);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.d);
    }
}
