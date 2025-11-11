package M0;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.HashMap;
import s0.s;

/* loaded from: classes.dex */
public final class k extends s0.l {
    @Override // s0.l
    public final void d(s sVar) {
        View view = sVar.f3647b;
        if (view instanceof TextView) {
            sVar.f3646a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // s0.l
    public final void g(s sVar) {
        View view = sVar.f3647b;
        if (view instanceof TextView) {
            sVar.f3646a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // s0.l
    public final Animator k(ViewGroup viewGroup, s sVar, s sVar2) {
        if (sVar == null || sVar2 == null || !(sVar.f3647b instanceof TextView)) {
            return null;
        }
        View view = sVar2.f3647b;
        if (!(view instanceof TextView)) {
            return null;
        }
        TextView textView = (TextView) view;
        HashMap hashMap = sVar.f3646a;
        HashMap hashMap2 = sVar2.f3646a;
        float floatValue = hashMap.get("android:textscale:scale") != null ? ((Float) hashMap.get("android:textscale:scale")).floatValue() : 1.0f;
        float floatValue2 = hashMap2.get("android:textscale:scale") != null ? ((Float) hashMap2.get("android:textscale:scale")).floatValue() : 1.0f;
        if (floatValue == floatValue2) {
            return null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(floatValue, floatValue2);
        ofFloat.addUpdateListener(new D0.c(1, textView));
        return ofFloat;
    }
}
