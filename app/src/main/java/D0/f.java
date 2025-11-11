package D0;

import M.t;
import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import g.C0138a;
import g.C0139b;
import g.C0142e;
import g.DialogInterfaceC0143f;
import k.n;

/* loaded from: classes.dex */
public final class f implements t {

    /* renamed from: a, reason: collision with root package name */
    public final int f109a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f110b;

    public f(Context context) {
        int g2 = DialogInterfaceC0143f.g(context, 0);
        this.f110b = new C0139b(new ContextThemeWrapper(context, DialogInterfaceC0143f.g(context, g2)));
        this.f109a = g2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [android.widget.ListAdapter] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    public DialogInterfaceC0143f a() {
        C0139b c0139b = (C0139b) this.f110b;
        DialogInterfaceC0143f dialogInterfaceC0143f = new DialogInterfaceC0143f(c0139b.f2502a, this.f109a);
        View view = c0139b.f2505e;
        C0142e c0142e = dialogInterfaceC0143f.f2531f;
        if (view != null) {
            c0142e.f2520n = view;
        } else {
            CharSequence charSequence = c0139b.d;
            if (charSequence != null) {
                c0142e.d = charSequence;
                TextView textView = c0142e.f2518l;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = c0139b.f2504c;
            if (drawable != null) {
                c0142e.f2516j = drawable;
                ImageView imageView = c0142e.f2517k;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    c0142e.f2517k.setImageDrawable(drawable);
                }
            }
        }
        if (c0139b.f2507g != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) c0139b.f2503b.inflate(c0142e.f2524r, (ViewGroup) null);
            int i = c0139b.i ? c0142e.f2525s : c0142e.f2526t;
            Object obj = c0139b.f2507g;
            ?? r6 = obj;
            if (obj == null) {
                r6 = new ArrayAdapter(c0139b.f2502a, i, R.id.text1, (Object[]) null);
            }
            c0142e.f2521o = r6;
            c0142e.f2522p = c0139b.f2508j;
            if (c0139b.h != null) {
                alertController$RecycleListView.setOnItemClickListener(new C0138a(c0139b, c0142e));
            }
            if (c0139b.i) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            c0142e.f2513e = alertController$RecycleListView;
        }
        dialogInterfaceC0143f.setCancelable(true);
        dialogInterfaceC0143f.setCanceledOnTouchOutside(true);
        dialogInterfaceC0143f.setOnCancelListener(null);
        dialogInterfaceC0143f.setOnDismissListener(null);
        n nVar = c0139b.f2506f;
        if (nVar != null) {
            dialogInterfaceC0143f.setOnKeyListener(nVar);
        }
        return dialogInterfaceC0143f;
    }

    @Override // M.t
    public boolean j(View view) {
        ((BottomSheetBehavior) this.f110b).B(this.f109a);
        return true;
    }

    public f(int i, I.i[] iVarArr) {
        this.f109a = i;
        this.f110b = iVarArr;
    }

    public f(BottomSheetBehavior bottomSheetBehavior, int i) {
        this.f110b = bottomSheetBehavior;
        this.f109a = i;
    }
}
