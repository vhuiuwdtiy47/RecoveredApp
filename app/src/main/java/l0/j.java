package l0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final q.h f3213a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f3214b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static Z0.f f3215c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? h.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [Z0.f, java.lang.Object] */
    public static Z0.f b() {
        ?? obj = new Object();
        f3215c = obj;
        q.h hVar = f3213a;
        hVar.getClass();
        if (q.g.f3527f.b(hVar, null, obj)) {
            q.g.b(hVar);
        }
        return f3215c;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:34|35|36|(2:76|77)(1:38)|39|(9:46|(1:50)|(1:57)|58|(2:66|67)|62|63|64|65)|(1:73)(1:(1:75))|(1:50)|(3:52|55|57)|58|(1:60)|66|67|62|63|64|65) */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00c5, code lost:
    
        r5 = 327680;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(android.content.Context r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.j.c(android.content.Context, boolean):void");
    }
}
