package a;

import android.window.BackEvent;

/* renamed from: a.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0060b {

    /* renamed from: a, reason: collision with root package name */
    public final float f1250a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1251b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1252c;
    public final int d;

    public C0060b(BackEvent backEvent) {
        C0059a c0059a = C0059a.f1249a;
        float d = c0059a.d(backEvent);
        float e2 = c0059a.e(backEvent);
        float b2 = c0059a.b(backEvent);
        int c2 = c0059a.c(backEvent);
        this.f1250a = d;
        this.f1251b = e2;
        this.f1252c = b2;
        this.d = c2;
    }

    public final String toString() {
        return "BackEventCompat{touchX=" + this.f1250a + ", touchY=" + this.f1251b + ", progress=" + this.f1252c + ", swipeEdge=" + this.d + '}';
    }
}
