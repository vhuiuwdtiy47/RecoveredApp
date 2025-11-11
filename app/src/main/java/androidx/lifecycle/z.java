package androidx.lifecycle;

/* loaded from: classes.dex */
public abstract class z {

    /* renamed from: a, reason: collision with root package name */
    public final B f1608a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1609b;

    /* renamed from: c, reason: collision with root package name */
    public int f1610c = -1;
    public final /* synthetic */ A d;

    public z(A a2, B b2) {
        this.d = a2;
        this.f1608a = b2;
    }

    public final void b(boolean z2) {
        if (z2 == this.f1609b) {
            return;
        }
        this.f1609b = z2;
        int i = z2 ? 1 : -1;
        A a2 = this.d;
        int i2 = a2.f1542c;
        a2.f1542c = i + i2;
        if (!a2.d) {
            a2.d = true;
            while (true) {
                try {
                    int i3 = a2.f1542c;
                    if (i2 == i3) {
                        break;
                    } else {
                        i2 = i3;
                    }
                } finally {
                    a2.d = false;
                }
            }
        }
        if (this.f1609b) {
            a2.c(this);
        }
    }

    public void c() {
    }

    public boolean d(InterfaceC0096t interfaceC0096t) {
        return false;
    }

    public abstract boolean e();
}
