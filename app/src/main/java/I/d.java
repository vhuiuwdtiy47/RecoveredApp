package I;

import Y.G;
import android.util.Base64;
import androidx.recyclerview.widget.RecyclerView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import n0.C0278a;
import n0.C0301y;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f257a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f258b;

    /* renamed from: c, reason: collision with root package name */
    public final Serializable f259c;
    public final Serializable d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f260e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f261f;

    public d(Map map) {
        this.f257a = 1;
        q1.d.e(map, "initialState");
        this.f258b = new LinkedHashMap(map);
        this.f259c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.f260e = new LinkedHashMap();
        this.f261f = new G(1, this);
    }

    public boolean a(int i) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0278a c0278a = (C0278a) arrayList.get(i2);
            int i3 = c0278a.f3316a;
            if (i3 != 8) {
                if (i3 == 1) {
                    int i4 = c0278a.f3317b;
                    int i5 = c0278a.f3318c + i4;
                    while (i4 < i5) {
                        if (e(i4, i2 + 1) == i) {
                            return true;
                        }
                        i4++;
                    }
                } else {
                    continue;
                }
            } else {
                if (e(c0278a.f3318c, i2 + 1) == i) {
                    return true;
                }
            }
        }
        return false;
    }

    public void b() {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C0301y) this.f260e).a((C0278a) arrayList.get(i));
        }
        i(arrayList);
        ArrayList arrayList2 = (ArrayList) this.f259c;
        int size2 = arrayList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            C0278a c0278a = (C0278a) arrayList2.get(i2);
            int i3 = c0278a.f3316a;
            C0301y c0301y = (C0301y) this.f260e;
            if (i3 == 1) {
                c0301y.a(c0278a);
                c0301y.d(c0278a.f3317b, c0278a.f3318c);
            } else if (i3 == 2) {
                c0301y.a(c0278a);
                int i4 = c0278a.f3317b;
                int i5 = c0278a.f3318c;
                RecyclerView recyclerView = c0301y.f3472a;
                recyclerView.O(i4, i5, true);
                recyclerView.f1671f0 = true;
                recyclerView.f1666c0.f3281c += i5;
            } else if (i3 == 4) {
                c0301y.a(c0278a);
                c0301y.c(c0278a.f3317b, c0278a.f3318c);
            } else if (i3 == 8) {
                c0301y.a(c0278a);
                c0301y.e(c0278a.f3317b, c0278a.f3318c);
            }
        }
        i(arrayList2);
    }

    public void c(C0278a c0278a) {
        int i;
        K.b bVar;
        int i2 = c0278a.f3316a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int k2 = k(c0278a.f3317b, i2);
        int i3 = c0278a.f3317b;
        int i4 = c0278a.f3316a;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + c0278a);
            }
            i = 1;
        }
        int i5 = 1;
        int i6 = 1;
        while (true) {
            int i7 = c0278a.f3318c;
            bVar = (K.b) this.f258b;
            if (i5 >= i7) {
                break;
            }
            int k3 = k((i * i5) + c0278a.f3317b, c0278a.f3316a);
            int i8 = c0278a.f3316a;
            if (i8 == 2 ? k3 != k2 : !(i8 == 4 && k3 == k2 + 1)) {
                C0278a g2 = g(i8, k2, i6);
                d(g2, i3);
                bVar.c(g2);
                if (c0278a.f3316a == 4) {
                    i3 += i6;
                }
                i6 = 1;
                k2 = k3;
            } else {
                i6++;
            }
            i5++;
        }
        bVar.c(c0278a);
        if (i6 > 0) {
            C0278a g3 = g(c0278a.f3316a, k2, i6);
            d(g3, i3);
            bVar.c(g3);
        }
    }

    public void d(C0278a c0278a, int i) {
        C0301y c0301y = (C0301y) this.f260e;
        c0301y.a(c0278a);
        int i2 = c0278a.f3316a;
        if (i2 != 2) {
            if (i2 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            c0301y.c(i, c0278a.f3318c);
        } else {
            int i3 = c0278a.f3318c;
            RecyclerView recyclerView = c0301y.f3472a;
            recyclerView.O(i, i3, true);
            recyclerView.f1671f0 = true;
            recyclerView.f1666c0.f3281c += i3;
        }
    }

    public int e(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        while (i2 < size) {
            C0278a c0278a = (C0278a) arrayList.get(i2);
            int i3 = c0278a.f3316a;
            if (i3 == 8) {
                int i4 = c0278a.f3317b;
                if (i4 == i) {
                    i = c0278a.f3318c;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (c0278a.f3318c <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = c0278a.f3317b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = c0278a.f3318c;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += c0278a.f3318c;
                }
            }
            i2++;
        }
        return i;
    }

    public boolean f() {
        return ((ArrayList) this.f259c).size() > 0;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [n0.a, java.lang.Object] */
    public C0278a g(int i, int i2, int i3) {
        C0278a c0278a = (C0278a) ((K.b) this.f258b).a();
        if (c0278a != null) {
            c0278a.f3316a = i;
            c0278a.f3317b = i2;
            c0278a.f3318c = i3;
            return c0278a;
        }
        ?? obj = new Object();
        obj.f3316a = i;
        obj.f3317b = i2;
        obj.f3318c = i3;
        return obj;
    }

    public void h(C0278a c0278a) {
        ((ArrayList) this.d).add(c0278a);
        int i = c0278a.f3316a;
        C0301y c0301y = (C0301y) this.f260e;
        if (i == 1) {
            c0301y.d(c0278a.f3317b, c0278a.f3318c);
            return;
        }
        if (i == 2) {
            int i2 = c0278a.f3317b;
            int i3 = c0278a.f3318c;
            RecyclerView recyclerView = c0301y.f3472a;
            recyclerView.O(i2, i3, false);
            recyclerView.f1671f0 = true;
            return;
        }
        if (i == 4) {
            c0301y.c(c0278a.f3317b, c0278a.f3318c);
        } else if (i == 8) {
            c0301y.e(c0278a.f3317b, c0278a.f3318c);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + c0278a);
        }
    }

    public void i(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0278a c0278a = (C0278a) arrayList.get(i);
            c0278a.getClass();
            ((K.b) this.f258b).c(c0278a);
        }
        arrayList.clear();
    }

    public void j(Object obj, String str) {
        q1.d.e(str, "key");
        ((LinkedHashMap) this.f258b).put(str, obj);
        y1.a aVar = (y1.a) ((LinkedHashMap) this.d).get(str);
        if (aVar != null) {
            ((y1.c) aVar).b(obj);
        }
        y1.a aVar2 = (y1.a) ((LinkedHashMap) this.f260e).get(str);
        if (aVar2 != null) {
            ((y1.c) aVar2).b(obj);
        }
    }

    public int k(int i, int i2) {
        int i3;
        int i4;
        ArrayList arrayList = (ArrayList) this.d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0278a c0278a = (C0278a) arrayList.get(size);
            int i5 = c0278a.f3316a;
            if (i5 == 8) {
                int i6 = c0278a.f3317b;
                int i7 = c0278a.f3318c;
                if (i6 < i7) {
                    i4 = i6;
                    i3 = i7;
                } else {
                    i3 = i6;
                    i4 = i7;
                }
                if (i < i4 || i > i3) {
                    if (i < i6) {
                        if (i2 == 1) {
                            c0278a.f3317b = i6 + 1;
                            c0278a.f3318c = i7 + 1;
                        } else if (i2 == 2) {
                            c0278a.f3317b = i6 - 1;
                            c0278a.f3318c = i7 - 1;
                        }
                    }
                } else if (i4 == i6) {
                    if (i2 == 1) {
                        c0278a.f3318c = i7 + 1;
                    } else if (i2 == 2) {
                        c0278a.f3318c = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        c0278a.f3317b = i6 + 1;
                    } else if (i2 == 2) {
                        c0278a.f3317b = i6 - 1;
                    }
                    i--;
                }
            } else {
                int i8 = c0278a.f3317b;
                if (i8 <= i) {
                    if (i5 == 1) {
                        i -= c0278a.f3318c;
                    } else if (i5 == 2) {
                        i += c0278a.f3318c;
                    }
                } else if (i2 == 1) {
                    c0278a.f3317b = i8 + 1;
                } else if (i2 == 2) {
                    c0278a.f3317b = i8 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            C0278a c0278a2 = (C0278a) arrayList.get(size2);
            int i9 = c0278a2.f3316a;
            K.b bVar = (K.b) this.f258b;
            if (i9 == 8) {
                int i10 = c0278a2.f3318c;
                if (i10 == c0278a2.f3317b || i10 < 0) {
                    arrayList.remove(size2);
                    bVar.c(c0278a2);
                }
            } else if (c0278a2.f3318c <= 0) {
                arrayList.remove(size2);
                bVar.c(c0278a2);
            }
        }
        return i;
    }

    public String toString() {
        switch (this.f257a) {
            case 0:
                StringBuilder sb = new StringBuilder();
                sb.append("FontRequest {mProviderAuthority: " + ((String) this.f258b) + ", mProviderPackage: " + ((String) this.f259c) + ", mQuery: " + ((String) this.d) + ", mCertificates:");
                int i = 0;
                while (true) {
                    List list = (List) this.f261f;
                    if (i >= list.size()) {
                        sb.append("}mCertificatesArray: 0");
                        return sb.toString();
                    }
                    sb.append(" [");
                    List list2 = (List) list.get(i);
                    for (int i2 = 0; i2 < list2.size(); i2++) {
                        sb.append(" \"");
                        sb.append(Base64.encodeToString((byte[]) list2.get(i2), 0));
                        sb.append("\"");
                    }
                    sb.append(" ]");
                    i++;
                }
            default:
                return super.toString();
        }
    }

    public d(String str, String str2, String str3, List list) {
        this.f257a = 0;
        str.getClass();
        this.f258b = str;
        str2.getClass();
        this.f259c = str2;
        this.d = str3;
        list.getClass();
        this.f261f = list;
        this.f260e = str + "-" + str2 + "-" + str3;
    }

    public d(C0301y c0301y) {
        this.f257a = 2;
        this.f258b = new K.b(30);
        this.f259c = new ArrayList();
        this.d = new ArrayList();
        this.f260e = c0301y;
        this.f261f = new A0.c(26, this);
    }
}
