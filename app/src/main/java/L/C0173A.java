package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.ImageView;

/* renamed from: l.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0173A extends ImageButton {

    /* renamed from: a, reason: collision with root package name */
    public final i0.l f2926a;

    /* renamed from: b, reason: collision with root package name */
    public final C.d f2927b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2928c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0173A(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AbstractC0206Q0.a(context);
        this.f2928c = false;
        AbstractC0204P0.a(this, getContext());
        i0.l lVar = new i0.l(this);
        this.f2926a = lVar;
        lVar.d(attributeSet, i);
        C.d dVar = new C.d(this);
        this.f2927b = dVar;
        dVar.d(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        i0.l lVar = this.f2926a;
        if (lVar != null) {
            lVar.a();
        }
        C.d dVar = this.f2927b;
        if (dVar != null) {
            dVar.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        i0.l lVar = this.f2926a;
        if (lVar != null) {
            return lVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        i0.l lVar = this.f2926a;
        if (lVar != null) {
            return lVar.c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C0207R0 c0207r0;
        C.d dVar = this.f2927b;
        if (dVar == null || (c0207r0 = (C0207R0) dVar.f50c) == null) {
            return null;
        }
        return c0207r0.f3012a;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C0207R0 c0207r0;
        C.d dVar = this.f2927b;
        if (dVar == null || (c0207r0 = (C0207R0) dVar.f50c) == null) {
            return null;
        }
        return c0207r0.f3013b;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.f2927b.f49b).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        i0.l lVar = this.f2926a;
        if (lVar != null) {
            lVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        i0.l lVar = this.f2926a;
        if (lVar != null) {
            lVar.f(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C.d dVar = this.f2927b;
        if (dVar != null) {
            dVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        C.d dVar = this.f2927b;
        if (dVar != null && drawable != null && !this.f2928c) {
            dVar.f48a = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (dVar != null) {
            dVar.a();
            if (this.f2928c) {
                return;
            }
            ImageView imageView = (ImageView) dVar.f49b;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(dVar.f48a);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.f2928c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        C.d dVar = this.f2927b;
        ImageView imageView = (ImageView) dVar.f49b;
        if (i != 0) {
            Drawable u2 = U.t.u(imageView.getContext(), i);
            if (u2 != null) {
                AbstractC0242k0.a(u2);
            }
            imageView.setImageDrawable(u2);
        } else {
            imageView.setImageDrawable(null);
        }
        dVar.a();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C.d dVar = this.f2927b;
        if (dVar != null) {
            dVar.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        i0.l lVar = this.f2926a;
        if (lVar != null) {
            lVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        i0.l lVar = this.f2926a;
        if (lVar != null) {
            lVar.i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C.d dVar = this.f2927b;
        if (dVar != null) {
            if (((C0207R0) dVar.f50c) == null) {
                dVar.f50c = new Object();
            }
            C0207R0 c0207r0 = (C0207R0) dVar.f50c;
            c0207r0.f3012a = colorStateList;
            c0207r0.d = true;
            dVar.a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C.d dVar = this.f2927b;
        if (dVar != null) {
            if (((C0207R0) dVar.f50c) == null) {
                dVar.f50c = new Object();
            }
            C0207R0 c0207r0 = (C0207R0) dVar.f50c;
            c0207r0.f3013b = mode;
            c0207r0.f3014c = true;
            dVar.a();
        }
    }
}
