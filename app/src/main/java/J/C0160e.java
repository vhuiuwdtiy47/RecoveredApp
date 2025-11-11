package j;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import k.MenuC0165B;

/* renamed from: j.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0160e extends ActionMode {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2694a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0156a f2695b;

    public C0160e(Context context, AbstractC0156a abstractC0156a) {
        this.f2694a = context;
        this.f2695b = abstractC0156a;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f2695b.a();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f2695b.b();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new MenuC0165B(this.f2694a, this.f2695b.c());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f2695b.d();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f2695b.e();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f2695b.f2683a;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f2695b.f();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f2695b.f2684b;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f2695b.g();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f2695b.h();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f2695b.i(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f2695b.k(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f2695b.f2683a = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f2695b.m(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z2) {
        this.f2695b.n(z2);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.f2695b.j(i);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.f2695b.l(i);
    }
}
