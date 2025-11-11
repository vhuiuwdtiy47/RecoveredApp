package l;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
import g.C0139b;
import g.DialogInterfaceC0143f;

/* renamed from: l.M, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC0197M implements InterfaceC0208S, DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public DialogInterfaceC0143f f2986a;

    /* renamed from: b, reason: collision with root package name */
    public C0199N f2987b;

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f2988c;
    public final /* synthetic */ C0210T d;

    public DialogInterfaceOnClickListenerC0197M(C0210T c0210t) {
        this.d = c0210t;
    }

    @Override // l.InterfaceC0208S
    public final boolean a() {
        DialogInterfaceC0143f dialogInterfaceC0143f = this.f2986a;
        if (dialogInterfaceC0143f != null) {
            return dialogInterfaceC0143f.isShowing();
        }
        return false;
    }

    @Override // l.InterfaceC0208S
    public final CharSequence b() {
        return this.f2988c;
    }

    @Override // l.InterfaceC0208S
    public final void c(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // l.InterfaceC0208S
    public final int d() {
        return 0;
    }

    @Override // l.InterfaceC0208S
    public final void dismiss() {
        DialogInterfaceC0143f dialogInterfaceC0143f = this.f2986a;
        if (dialogInterfaceC0143f != null) {
            dialogInterfaceC0143f.dismiss();
            this.f2986a = null;
        }
    }

    @Override // l.InterfaceC0208S
    public final void g(int i, int i2) {
        if (this.f2987b == null) {
            return;
        }
        C0210T c0210t = this.d;
        D0.f fVar = new D0.f(c0210t.getPopupContext());
        CharSequence charSequence = this.f2988c;
        C0139b c0139b = (C0139b) fVar.f110b;
        if (charSequence != null) {
            c0139b.d = charSequence;
        }
        C0199N c0199n = this.f2987b;
        int selectedItemPosition = c0210t.getSelectedItemPosition();
        c0139b.f2507g = c0199n;
        c0139b.h = this;
        c0139b.f2508j = selectedItemPosition;
        c0139b.i = true;
        DialogInterfaceC0143f a2 = fVar.a();
        this.f2986a = a2;
        AlertController$RecycleListView alertController$RecycleListView = a2.f2531f.f2513e;
        alertController$RecycleListView.setTextDirection(i);
        alertController$RecycleListView.setTextAlignment(i2);
        this.f2986a.show();
    }

    @Override // l.InterfaceC0208S
    public final void h(CharSequence charSequence) {
        this.f2988c = charSequence;
    }

    @Override // l.InterfaceC0208S
    public final int i() {
        return 0;
    }

    @Override // l.InterfaceC0208S
    public final void j(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // l.InterfaceC0208S
    public final void k(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // l.InterfaceC0208S
    public final Drawable l() {
        return null;
    }

    @Override // l.InterfaceC0208S
    public final void m(ListAdapter listAdapter) {
        this.f2987b = (C0199N) listAdapter;
    }

    @Override // l.InterfaceC0208S
    public final void n(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C0210T c0210t = this.d;
        c0210t.setSelection(i);
        if (c0210t.getOnItemClickListener() != null) {
            c0210t.performItemClick(null, i, this.f2987b.getItemId(i));
        }
        dismiss();
    }
}
