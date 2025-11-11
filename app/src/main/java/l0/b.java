package l0;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f3189a;

    /* renamed from: b, reason: collision with root package name */
    public final e f3190b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f3191c;
    public final File d;

    /* renamed from: e, reason: collision with root package name */
    public final String f3192e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3193f = false;

    /* renamed from: g, reason: collision with root package name */
    public c[] f3194g;
    public byte[] h;

    public b(AssetManager assetManager, Executor executor, e eVar, String str, File file) {
        this.f3189a = executor;
        this.f3190b = eVar;
        this.f3192e = str;
        this.d = file;
        int i = Build.VERSION.SDK_INT;
        this.f3191c = i >= 31 ? f.d : (i == 29 || i == 30) ? f.f3204e : null;
    }

    public final FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e2) {
            String message = e2.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            this.f3190b.o();
            return null;
        }
    }

    public final void b(final int i, final Serializable serializable) {
        this.f3189a.execute(new Runnable() { // from class: l0.a
            @Override // java.lang.Runnable
            public final void run() {
                b.this.f3190b.l(i, serializable);
            }
        });
    }
}
