package U;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: j, reason: collision with root package name */
    public static final Object f758j = new Object();

    /* renamed from: k, reason: collision with root package name */
    public static volatile i f759k;

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantReadWriteLock f760a;

    /* renamed from: b, reason: collision with root package name */
    public final o.g f761b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f762c;
    public final Handler d;

    /* renamed from: e, reason: collision with root package name */
    public final e f763e;

    /* renamed from: f, reason: collision with root package name */
    public final h f764f;

    /* renamed from: g, reason: collision with root package name */
    public final T0.e f765g;
    public final int h;
    public final c i;

    public i(s sVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f760a = reentrantReadWriteLock;
        this.f762c = 3;
        h hVar = (h) sVar.f756b;
        this.f764f = hVar;
        int i = sVar.f755a;
        this.h = i;
        this.i = (c) sVar.f757c;
        this.d = new Handler(Looper.getMainLooper());
        this.f761b = new o.g(0);
        this.f765g = new T0.e(5);
        e eVar = new e(this);
        this.f763e = eVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.f762c = 0;
            } catch (Throwable th) {
                this.f760a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                hVar.a(new d(eVar));
            } catch (Throwable th2) {
                d(th2);
            }
        }
    }

    public static i a() {
        i iVar;
        synchronized (f758j) {
            try {
                iVar = f759k;
                if (!(iVar != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return iVar;
    }

    public final int b() {
        this.f760a.readLock().lock();
        try {
            return this.f762c;
        } finally {
            this.f760a.readLock().unlock();
        }
    }

    public final void c() {
        if (!(this.h == 1)) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (b() == 1) {
            return;
        }
        this.f760a.writeLock().lock();
        try {
            if (this.f762c == 0) {
                return;
            }
            this.f762c = 0;
            this.f760a.writeLock().unlock();
            e eVar = this.f763e;
            i iVar = eVar.f752a;
            try {
                iVar.f764f.a(new d(eVar));
            } catch (Throwable th) {
                iVar.d(th);
            }
        } finally {
            this.f760a.writeLock().unlock();
        }
    }

    public final void d(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f760a.writeLock().lock();
        try {
            this.f762c = 2;
            arrayList.addAll(this.f761b);
            this.f761b.clear();
            this.f760a.writeLock().unlock();
            this.d.post(new I.a(arrayList, this.f762c, th));
        } catch (Throwable th2) {
            this.f760a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x009f A[Catch: all -> 0x0082, TryCatch #0 {all -> 0x0082, blocks: (B:28:0x005a, B:31:0x005f, B:33:0x0063, B:35:0x0070, B:37:0x008f, B:39:0x0099, B:41:0x009c, B:43:0x009f, B:45:0x00af, B:46:0x00b2), top: B:27:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v13, types: [U.A, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence e(java.lang.CharSequence r10, int r11, int r12) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: U.i.e(java.lang.CharSequence, int, int):java.lang.CharSequence");
    }

    public final void f(g gVar) {
        Z0.i.i(gVar, "initCallback cannot be null");
        this.f760a.writeLock().lock();
        try {
            if (this.f762c != 1 && this.f762c != 2) {
                this.f761b.add(gVar);
                this.f760a.writeLock().unlock();
            }
            this.d.post(new I.a(Arrays.asList(gVar), this.f762c, (Throwable) null));
            this.f760a.writeLock().unlock();
        } catch (Throwable th) {
            this.f760a.writeLock().unlock();
            throw th;
        }
    }
}
