package Z0;

import L.S;
import L.u0;
import M0.p;
import M0.q;
import T0.k;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import c0.InterfaceC0111b;
import com.tencent.wechat.Platform;
import java.io.Serializable;
import java.util.WeakHashMap;
import k.m;
import k.x;
import w0.AbstractC0373a;

/* loaded from: classes.dex */
public class f implements p, InterfaceC0111b, x, l0.e {
    public f(View view) {
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [Z0.f, java.lang.Object] */
    public static f d(Context context, int i) {
        i.g("Cannot create a CalendarItemStyle with a styleResId of 0", i != 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, AbstractC0373a.f4161o);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(0, 0), obtainStyledAttributes.getDimensionPixelOffset(2, 0), obtainStyledAttributes.getDimensionPixelOffset(1, 0), obtainStyledAttributes.getDimensionPixelOffset(3, 0));
        i.x(context, obtainStyledAttributes, 4);
        i.x(context, obtainStyledAttributes, 9);
        i.x(context, obtainStyledAttributes, 7);
        obtainStyledAttributes.getDimensionPixelSize(8, 0);
        k.a(context, obtainStyledAttributes.getResourceId(5, 0), obtainStyledAttributes.getResourceId(6, 0), new T0.a(0)).a();
        obtainStyledAttributes.recycle();
        ?? obj = new Object();
        i.h(rect.left);
        i.h(rect.top);
        i.h(rect.right);
        i.h(rect.bottom);
        return obj;
    }

    public static Path e(float f2, float f3, float f4, float f5) {
        Path path = new Path();
        path.moveTo(f2, f3);
        path.lineTo(f4, f5);
        return path;
    }

    @Override // M0.p
    public u0 a(View view, u0 u0Var, q qVar) {
        qVar.d = u0Var.a() + qVar.d;
        WeakHashMap weakHashMap = S.f311a;
        boolean z2 = view.getLayoutDirection() == 1;
        int b2 = u0Var.b();
        int c2 = u0Var.c();
        int i = qVar.f500a + (z2 ? c2 : b2);
        qVar.f500a = i;
        int i2 = qVar.f502c;
        if (!z2) {
            b2 = c2;
        }
        int i3 = i2 + b2;
        qVar.f502c = i3;
        view.setPaddingRelative(i, qVar.f501b, i3, qVar.d);
        return u0Var;
    }

    @Override // k.x
    public void b(m mVar, boolean z2) {
    }

    public float c(float f2, float f3) {
        return 1.0f;
    }

    @Override // k.x
    public boolean g(m mVar) {
        return false;
    }

    @Override // l0.e
    public void l(int i, Serializable serializable) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case Platform.INFO /* 4 */:
                str = "RESULT_NOT_WRITABLE";
                break;
            case Platform.WARN /* 5 */:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) serializable);
        } else {
            Log.d("ProfileInstaller", str);
        }
    }

    @Override // l0.e
    public void o() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }
}
