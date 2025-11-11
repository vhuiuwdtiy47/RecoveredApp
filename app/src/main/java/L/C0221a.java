package l;

import androidx.appcompat.widget.ActionBarContextView;

/* renamed from: l.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0221a implements L.Z {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3043a = false;

    /* renamed from: b, reason: collision with root package name */
    public int f3044b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ActionBarContextView f3045c;

    public C0221a(ActionBarContextView actionBarContextView) {
        this.f3045c = actionBarContextView;
    }

    @Override // L.Z
    public final void a() {
        if (this.f3043a) {
            return;
        }
        ActionBarContextView actionBarContextView = this.f3045c;
        actionBarContextView.f1354f = null;
        super/*android.view.View*/.setVisibility(this.f3044b);
    }

    @Override // L.Z
    public final void b() {
        this.f3043a = true;
    }

    @Override // L.Z
    public final void c() {
        super/*android.view.View*/.setVisibility(0);
        this.f3043a = false;
    }
}
