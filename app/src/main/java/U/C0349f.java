package u;

import com.tencent.wechat.Platform;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: u.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0349f implements InterfaceC0347d {
    public final AbstractC0358o d;

    /* renamed from: f, reason: collision with root package name */
    public int f3907f;

    /* renamed from: g, reason: collision with root package name */
    public int f3908g;

    /* renamed from: a, reason: collision with root package name */
    public AbstractC0358o f3903a = null;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3904b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3905c = false;

    /* renamed from: e, reason: collision with root package name */
    public int f3906e = 1;
    public int h = 1;
    public C0350g i = null;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3909j = false;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f3910k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f3911l = new ArrayList();

    public C0349f(AbstractC0358o abstractC0358o) {
        this.d = abstractC0358o;
    }

    @Override // u.InterfaceC0347d
    public final void a(InterfaceC0347d interfaceC0347d) {
        ArrayList arrayList = this.f3911l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((C0349f) it.next()).f3909j) {
                return;
            }
        }
        this.f3905c = true;
        AbstractC0358o abstractC0358o = this.f3903a;
        if (abstractC0358o != null) {
            abstractC0358o.a(this);
        }
        if (this.f3904b) {
            this.d.a(this);
            return;
        }
        Iterator it2 = arrayList.iterator();
        C0349f c0349f = null;
        int i = 0;
        while (it2.hasNext()) {
            C0349f c0349f2 = (C0349f) it2.next();
            if (!(c0349f2 instanceof C0350g)) {
                i++;
                c0349f = c0349f2;
            }
        }
        if (c0349f != null && i == 1 && c0349f.f3909j) {
            C0350g c0350g = this.i;
            if (c0350g != null) {
                if (!c0350g.f3909j) {
                    return;
                } else {
                    this.f3907f = this.h * c0350g.f3908g;
                }
            }
            d(c0349f.f3908g + this.f3907f);
        }
        AbstractC0358o abstractC0358o2 = this.f3903a;
        if (abstractC0358o2 != null) {
            abstractC0358o2.a(this);
        }
    }

    public final void b(AbstractC0358o abstractC0358o) {
        this.f3910k.add(abstractC0358o);
        if (this.f3909j) {
            abstractC0358o.a(abstractC0358o);
        }
    }

    public final void c() {
        this.f3911l.clear();
        this.f3910k.clear();
        this.f3909j = false;
        this.f3908g = 0;
        this.f3905c = false;
        this.f3904b = false;
    }

    public void d(int i) {
        if (this.f3909j) {
            return;
        }
        this.f3909j = true;
        this.f3908g = i;
        Iterator it = this.f3910k.iterator();
        while (it.hasNext()) {
            InterfaceC0347d interfaceC0347d = (InterfaceC0347d) it.next();
            interfaceC0347d.a(interfaceC0347d);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.f3925b.f3726h0);
        sb.append(":");
        switch (this.f3906e) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "HORIZONTAL_DIMENSION";
                break;
            case 3:
                str = "VERTICAL_DIMENSION";
                break;
            case Platform.INFO /* 4 */:
                str = "LEFT";
                break;
            case Platform.WARN /* 5 */:
                str = "RIGHT";
                break;
            case 6:
                str = "TOP";
                break;
            case 7:
                str = "BOTTOM";
                break;
            case 8:
                str = "BASELINE";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append("(");
        sb.append(this.f3909j ? Integer.valueOf(this.f3908g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f3911l.size());
        sb.append(":d=");
        sb.append(this.f3910k.size());
        sb.append(">");
        return sb.toString();
    }
}
