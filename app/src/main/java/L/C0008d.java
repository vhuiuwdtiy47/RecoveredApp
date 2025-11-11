package L;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import android.view.View;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import x0.AbstractC0375a;

/* renamed from: L.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0008d implements InterfaceC0007c, InterfaceC0009e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f328a;

    /* renamed from: b, reason: collision with root package name */
    public Object f329b;

    /* renamed from: c, reason: collision with root package name */
    public int f330c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public Object f331e;

    /* renamed from: f, reason: collision with root package name */
    public Cloneable f332f;

    public /* synthetic */ C0008d() {
        this.f328a = 0;
    }

    @Override // L.InterfaceC0007c
    public void a(Bundle bundle) {
        this.f332f = bundle;
    }

    public void b(u0 u0Var, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if ((((i0) it.next()).f353a.c() & 8) != 0) {
                ((View) this.f331e).setTranslationY(AbstractC0375a.c(this.d, 0, r3.f353a.b()));
                return;
            }
        }
    }

    @Override // L.InterfaceC0007c
    public void c(Uri uri) {
        this.f331e = uri;
    }

    @Override // L.InterfaceC0009e
    public int d() {
        return this.f330c;
    }

    @Override // L.InterfaceC0009e
    public ClipData i() {
        return (ClipData) this.f329b;
    }

    @Override // L.InterfaceC0007c
    public C0010f k() {
        return new C0010f(new C0008d(this));
    }

    @Override // L.InterfaceC0009e
    public int n() {
        return this.d;
    }

    @Override // L.InterfaceC0009e
    public ContentInfo t() {
        return null;
    }

    public String toString() {
        String str;
        switch (this.f328a) {
            case 1:
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(((ClipData) this.f329b).getDescription());
                sb.append(", source=");
                int i = this.f330c;
                sb.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
                sb.append(", flags=");
                int i2 = this.d;
                sb.append((i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2));
                Uri uri = (Uri) this.f331e;
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                sb.append(((Bundle) this.f332f) != null ? ", hasExtras" : "");
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // L.InterfaceC0007c
    public void w(int i) {
        this.d = i;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Cloneable, int[]] */
    public C0008d(View view) {
        this.f328a = 2;
        this.f332f = new int[2];
        this.f331e = view;
    }

    public C0008d(C0008d c0008d) {
        this.f328a = 1;
        ClipData clipData = (ClipData) c0008d.f329b;
        clipData.getClass();
        this.f329b = clipData;
        int i = c0008d.f330c;
        if (i < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
        }
        if (i <= 5) {
            this.f330c = i;
            int i2 = c0008d.d;
            if ((i2 & 1) == i2) {
                this.d = i2;
                this.f331e = (Uri) c0008d.f331e;
                this.f332f = (Bundle) c0008d.f332f;
                return;
            } else {
                throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i2) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
            }
        }
        Locale locale2 = Locale.US;
        throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
    }
}
