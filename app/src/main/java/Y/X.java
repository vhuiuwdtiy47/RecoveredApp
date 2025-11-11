package Y;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.EnumC0092o;

/* loaded from: classes.dex */
public final class X implements Parcelable {
    public static final Parcelable.Creator<X> CREATOR = new G0.b(7);

    /* renamed from: a, reason: collision with root package name */
    public final String f1039a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1040b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1041c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1042e;

    /* renamed from: f, reason: collision with root package name */
    public final String f1043f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f1044g;
    public final boolean h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f1045j;

    /* renamed from: k, reason: collision with root package name */
    public final int f1046k;

    /* renamed from: l, reason: collision with root package name */
    public final String f1047l;

    /* renamed from: m, reason: collision with root package name */
    public final int f1048m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f1049n;

    public X(AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x) {
        this.f1039a = abstractComponentCallbacksC0056x.getClass().getName();
        this.f1040b = abstractComponentCallbacksC0056x.f1185e;
        this.f1041c = abstractComponentCallbacksC0056x.f1192n;
        this.d = abstractComponentCallbacksC0056x.f1201w;
        this.f1042e = abstractComponentCallbacksC0056x.f1202x;
        this.f1043f = abstractComponentCallbacksC0056x.f1203y;
        this.f1044g = abstractComponentCallbacksC0056x.f1163B;
        this.h = abstractComponentCallbacksC0056x.f1190l;
        this.i = abstractComponentCallbacksC0056x.f1162A;
        this.f1045j = abstractComponentCallbacksC0056x.f1204z;
        this.f1046k = abstractComponentCallbacksC0056x.f1173M.ordinal();
        this.f1047l = abstractComponentCallbacksC0056x.h;
        this.f1048m = abstractComponentCallbacksC0056x.i;
        this.f1049n = abstractComponentCallbacksC0056x.f1168H;
    }

    public final AbstractComponentCallbacksC0056x a(K k2) {
        AbstractComponentCallbacksC0056x a2 = k2.a(this.f1039a);
        a2.f1185e = this.f1040b;
        a2.f1192n = this.f1041c;
        a2.f1194p = true;
        a2.f1201w = this.d;
        a2.f1202x = this.f1042e;
        a2.f1203y = this.f1043f;
        a2.f1163B = this.f1044g;
        a2.f1190l = this.h;
        a2.f1162A = this.i;
        a2.f1204z = this.f1045j;
        a2.f1173M = EnumC0092o.values()[this.f1046k];
        a2.h = this.f1047l;
        a2.i = this.f1048m;
        a2.f1168H = this.f1049n;
        return a2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f1039a);
        sb.append(" (");
        sb.append(this.f1040b);
        sb.append(")}:");
        if (this.f1041c) {
            sb.append(" fromLayout");
        }
        int i = this.f1042e;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.f1043f;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.f1044g) {
            sb.append(" retainInstance");
        }
        if (this.h) {
            sb.append(" removing");
        }
        if (this.i) {
            sb.append(" detached");
        }
        if (this.f1045j) {
            sb.append(" hidden");
        }
        String str2 = this.f1047l;
        if (str2 != null) {
            sb.append(" targetWho=");
            sb.append(str2);
            sb.append(" targetRequestCode=");
            sb.append(this.f1048m);
        }
        if (this.f1049n) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f1039a);
        parcel.writeString(this.f1040b);
        parcel.writeInt(this.f1041c ? 1 : 0);
        parcel.writeInt(this.d);
        parcel.writeInt(this.f1042e);
        parcel.writeString(this.f1043f);
        parcel.writeInt(this.f1044g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.f1045j ? 1 : 0);
        parcel.writeInt(this.f1046k);
        parcel.writeString(this.f1047l);
        parcel.writeInt(this.f1048m);
        parcel.writeInt(this.f1049n ? 1 : 0);
    }

    public X(Parcel parcel) {
        this.f1039a = parcel.readString();
        this.f1040b = parcel.readString();
        this.f1041c = parcel.readInt() != 0;
        this.d = parcel.readInt();
        this.f1042e = parcel.readInt();
        this.f1043f = parcel.readString();
        this.f1044g = parcel.readInt() != 0;
        this.h = parcel.readInt() != 0;
        this.i = parcel.readInt() != 0;
        this.f1045j = parcel.readInt() != 0;
        this.f1046k = parcel.readInt();
        this.f1047l = parcel.readString();
        this.f1048m = parcel.readInt();
        this.f1049n = parcel.readInt() != 0;
    }
}
