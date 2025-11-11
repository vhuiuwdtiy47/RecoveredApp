package H0;

import M0.j;
import Z0.i;
import android.graphics.Typeface;
import com.google.android.material.chip.Chip;

/* loaded from: classes.dex */
public final class a extends i {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f191f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f192g;

    public /* synthetic */ a(int i, Object obj) {
        this.f191f = i;
        this.f192g = obj;
    }

    private final void m0(int i) {
    }

    @Override // Z0.i
    public final void R(int i) {
        switch (this.f191f) {
            case 0:
                return;
            default:
                j jVar = (j) this.f192g;
                jVar.f493e = true;
                M0.i iVar = (M0.i) jVar.f494f.get();
                if (iVar != null) {
                    iVar.a();
                    return;
                }
                return;
        }
    }

    @Override // Z0.i
    public final void S(Typeface typeface, boolean z2) {
        switch (this.f191f) {
            case 0:
                Chip chip = (Chip) this.f192g;
                e eVar = chip.f1858e;
                chip.setText(eVar.f198A0 ? eVar.f201C : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                return;
            default:
                if (z2) {
                    return;
                }
                j jVar = (j) this.f192g;
                jVar.f493e = true;
                M0.i iVar = (M0.i) jVar.f494f.get();
                if (iVar != null) {
                    iVar.a();
                    return;
                }
                return;
        }
    }
}
