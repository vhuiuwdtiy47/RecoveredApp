package l;

import L.C0008d;
import L.C0010f;
import L.InterfaceC0007c;
import L.InterfaceC0023t;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import com.android.music.R;

/* renamed from: l.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0267x extends EditText implements InterfaceC0023t {

    /* renamed from: a, reason: collision with root package name */
    public final i0.l f3176a;

    /* renamed from: b, reason: collision with root package name */
    public final C0219Y f3177b;

    /* renamed from: c, reason: collision with root package name */
    public final R.p f3178c;
    public final C0181E d;

    /* renamed from: e, reason: collision with root package name */
    public C0265w f3179e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r5v4, types: [R.p, java.lang.Object] */
    public C0267x(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
        AbstractC0206Q0.a(context);
        AbstractC0204P0.a(this, getContext());
        i0.l lVar = new i0.l(this);
        this.f3176a = lVar;
        lVar.d(attributeSet, R.attr.editTextStyle);
        C0219Y c0219y = new C0219Y(this);
        this.f3177b = c0219y;
        c0219y.f(attributeSet, R.attr.editTextStyle);
        c0219y.b();
        this.f3178c = new Object();
        C0181E c0181e = new C0181E(this);
        this.d = c0181e;
        c0181e.e(attributeSet, R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean isFocusable = super.isFocusable();
        boolean isClickable = super.isClickable();
        boolean isLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener d = c0181e.d(keyListener);
        if (d == keyListener) {
            return;
        }
        super.setKeyListener(d);
        super.setRawInputType(inputType);
        super.setFocusable(isFocusable);
        super.setClickable(isClickable);
        super.setLongClickable(isLongClickable);
    }

    private C0265w getSuperCaller() {
        if (this.f3179e == null) {
            this.f3179e = new C0265w(this);
        }
        return this.f3179e;
    }

    @Override // L.InterfaceC0023t
    public final C0010f a(C0010f c0010f) {
        return this.f3178c.a(this, c0010f);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        i0.l lVar = this.f3176a;
        if (lVar != null) {
            lVar.a();
        }
        C0219Y c0219y = this.f3177b;
        if (c0219y != null) {
            c0219y.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return super.getCustomSelectionActionModeCallback();
    }

    public ColorStateList getSupportBackgroundTintList() {
        i0.l lVar = this.f3176a;
        if (lVar != null) {
            return lVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        i0.l lVar = this.f3176a;
        if (lVar != null) {
            return lVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f3177b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f3177b.e();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        return super.getTextClassifier();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] c2;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f3177b.getClass();
        C0219Y.h(editorInfo, onCreateInputConnection, this);
        AbstractC0271z.q(editorInfo, onCreateInputConnection, this);
        if (onCreateInputConnection != null && Build.VERSION.SDK_INT <= 30 && (c2 = L.S.c(this)) != null) {
            editorInfo.contentMimeTypes = c2;
            onCreateInputConnection = new Q.c(onCreateInputConnection, new Q.b(this));
        }
        return this.d.f(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        boolean z2 = false;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && L.S.c(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                z2 = AbstractC0187H.a(dragEvent, this, activity);
            }
        }
        if (z2) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        InterfaceC0007c interfaceC0007c;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31 || L.S.c(this) == null || !(i == 16908322 || i == 16908337)) {
            return super.onTextContextMenuItem(i);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i2 >= 31) {
                interfaceC0007c = new A0.c(primaryClip, 1);
            } else {
                C0008d c0008d = new C0008d();
                c0008d.f329b = primaryClip;
                c0008d.f330c = 1;
                interfaceC0007c = c0008d;
            }
            interfaceC0007c.w(i == 16908322 ? 0 : 1);
            L.S.e(this, interfaceC0007c.k());
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        i0.l lVar = this.f3176a;
        if (lVar != null) {
            lVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        i0.l lVar = this.f3176a;
        if (lVar != null) {
            lVar.f(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0219Y c0219y = this.f3177b;
        if (c0219y != null) {
            c0219y.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0219Y c0219y = this.f3177b;
        if (c0219y != null) {
            c0219y.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void setEmojiCompatEnabled(boolean z2) {
        this.d.g(z2);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.d.d(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        i0.l lVar = this.f3176a;
        if (lVar != null) {
            lVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        i0.l lVar = this.f3176a;
        if (lVar != null) {
            lVar.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0219Y c0219y = this.f3177b;
        c0219y.i(colorStateList);
        c0219y.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0219Y c0219y = this.f3177b;
        c0219y.j(mode);
        c0219y.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0219Y c0219y = this.f3177b;
        if (c0219y != null) {
            c0219y.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        super.setTextClassifier(textClassifier);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return super.getText();
    }
}
