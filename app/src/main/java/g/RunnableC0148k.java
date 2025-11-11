package g;

import android.content.Context;

/* renamed from: g.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0148k implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2541a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f2542b;

    public /* synthetic */ RunnableC0148k(Context context, int i) {
        this.f2541a = i;
        this.f2542b = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x008a, code lost:
    
        if (r2 != null) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0099  */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.util.concurrent.Executor, java.lang.Object] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r10 = this;
            int r0 = r10.f2541a
            switch(r0) {
                case 0: goto L2f;
                case 1: goto L13;
                default: goto L5;
            }
        L5:
            l0.d r0 = new l0.d
            r0.<init>()
            T0.e r1 = l0.f.f3201a
            r2 = 0
            android.content.Context r10 = r10.f2542b
            l0.f.t(r10, r0, r1, r2)
            return
        L13:
            java.util.concurrent.ThreadPoolExecutor r3 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.LinkedBlockingQueue r9 = new java.util.concurrent.LinkedBlockingQueue
            r9.<init>()
            r5 = 1
            r6 = 0
            r4 = 0
            r3.<init>(r4, r5, r6, r8, r9)
            g.k r0 = new g.k
            android.content.Context r10 = r10.f2542b
            r1 = 2
            r0.<init>(r10, r1)
            r3.execute(r0)
            return
        L2f:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 1
            r2 = 33
            if (r0 < r2) goto Lb1
            android.content.ComponentName r3 = new android.content.ComponentName
            android.content.Context r10 = r10.f2542b
            java.lang.String r4 = "androidx.appcompat.app.AppLocalesMetadataHolderService"
            r3.<init>(r10, r4)
            android.content.pm.PackageManager r4 = r10.getPackageManager()
            int r4 = r4.getComponentEnabledSetting(r3)
            if (r4 == r1) goto Lb1
            java.lang.String r4 = "locale"
            if (r0 < r2) goto L88
            o.g r0 = g.p.f2551g
            r0.getClass()
            o.b r2 = new o.b
            r2.<init>(r0)
        L57:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L76
            java.lang.Object r0 = r2.next()
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0
            java.lang.Object r0 = r0.get()
            g.p r0 = (g.p) r0
            if (r0 == 0) goto L57
            g.B r0 = (g.B) r0
            android.content.Context r0 = r0.f2440k
            if (r0 == 0) goto L57
            java.lang.Object r0 = r0.getSystemService(r4)
            goto L77
        L76:
            r0 = 0
        L77:
            if (r0 == 0) goto L8d
            android.os.LocaleList r0 = g.m.a(r0)
            H.g r2 = new H.g
            H.h r5 = new H.h
            r5.<init>(r0)
            r2.<init>(r5)
            goto L8f
        L88:
            H.g r2 = g.p.f2548c
            if (r2 == 0) goto L8d
            goto L8f
        L8d:
            H.g r2 = H.g.f188b
        L8f:
            H.h r0 = r2.f189a
            android.os.LocaleList r0 = r0.f190a
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Laa
            java.lang.String r0 = A.c.e(r10)
            java.lang.Object r2 = r10.getSystemService(r4)
            if (r2 == 0) goto Laa
            android.os.LocaleList r0 = g.AbstractC0149l.a(r0)
            g.m.b(r2, r0)
        Laa:
            android.content.pm.PackageManager r10 = r10.getPackageManager()
            r10.setComponentEnabledSetting(r3, r1, r1)
        Lb1:
            g.p.f2550f = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.RunnableC0148k.run():void");
    }
}
