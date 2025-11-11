package B0;

import android.graphics.Rect;
import android.view.View;
import android.widget.ImageView;
import z0.C0385a;

/* loaded from: classes.dex */
public final class a implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f38b;

    public /* synthetic */ a(int i, Object obj) {
        this.f37a = i;
        this.f38b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C0385a c0385a;
        switch (this.f37a) {
            case 0:
                throw null;
            default:
                C0.a aVar = (C0.a) this.f38b;
                ImageView imageView = aVar.f523n;
                if (imageView.getVisibility() != 0 || (c0385a = aVar.f512F) == null) {
                    return;
                }
                Rect rect = new Rect();
                imageView.getDrawingRect(rect);
                c0385a.setBounds(rect);
                c0385a.h(imageView, null);
                return;
        }
    }
}
