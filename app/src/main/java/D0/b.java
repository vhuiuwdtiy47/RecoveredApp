package D0;

import a.C0063e;
import android.content.Intent;
import android.content.IntentSender;
import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import c.C0107f;
import c.InterfaceC0103b;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f100a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f101b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f102c;
    public final /* synthetic */ Object d;

    public /* synthetic */ b(C0063e c0063e, int i, Object obj, int i2) {
        this.f100a = i2;
        this.d = c0063e;
        this.f101b = i;
        this.f102c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f100a) {
            case 0:
                ((BottomSheetBehavior) this.d).E((View) this.f102c, this.f101b, false);
                return;
            case 1:
                Serializable serializable = (Serializable) ((A0.c) this.f102c).f33b;
                C0063e c0063e = (C0063e) this.d;
                String str = (String) c0063e.f1255a.get(Integer.valueOf(this.f101b));
                if (str == null) {
                    return;
                }
                C0107f c0107f = (C0107f) c0063e.f1258e.get(str);
                if (c0107f == null) {
                    c0063e.f1260g.remove(str);
                    c0063e.f1259f.put(str, serializable);
                    return;
                } else {
                    InterfaceC0103b interfaceC0103b = c0107f.f1733a;
                    if (c0063e.d.remove(str)) {
                        interfaceC0103b.b(serializable);
                        return;
                    }
                    return;
                }
            case 2:
                ((C0063e) this.d).a(this.f101b, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) this.f102c));
                return;
            default:
                ((TextView) this.f102c).setTypeface((Typeface) this.d, this.f101b);
                return;
        }
    }

    public b(TextView textView, Typeface typeface, int i) {
        this.f100a = 3;
        this.f102c = textView;
        this.d = typeface;
        this.f101b = i;
    }

    public b(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.f100a = 0;
        this.d = bottomSheetBehavior;
        this.f102c = view;
        this.f101b = i;
    }
}
