package z0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;

/* renamed from: z0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0386b implements Parcelable {
    public static final Parcelable.Creator<C0386b> CREATOR = new G0.b(19);

    /* renamed from: A, reason: collision with root package name */
    public Integer f4239A;

    /* renamed from: B, reason: collision with root package name */
    public Integer f4240B;

    /* renamed from: C, reason: collision with root package name */
    public Integer f4241C;

    /* renamed from: D, reason: collision with root package name */
    public Boolean f4242D;

    /* renamed from: a, reason: collision with root package name */
    public int f4243a;

    /* renamed from: b, reason: collision with root package name */
    public Integer f4244b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f4245c;
    public Integer d;

    /* renamed from: e, reason: collision with root package name */
    public Integer f4246e;

    /* renamed from: f, reason: collision with root package name */
    public Integer f4247f;

    /* renamed from: g, reason: collision with root package name */
    public Integer f4248g;
    public Integer h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public String f4249j;

    /* renamed from: k, reason: collision with root package name */
    public int f4250k;

    /* renamed from: l, reason: collision with root package name */
    public int f4251l;

    /* renamed from: m, reason: collision with root package name */
    public int f4252m;

    /* renamed from: n, reason: collision with root package name */
    public Locale f4253n;

    /* renamed from: o, reason: collision with root package name */
    public String f4254o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f4255p;

    /* renamed from: q, reason: collision with root package name */
    public int f4256q;

    /* renamed from: r, reason: collision with root package name */
    public int f4257r;

    /* renamed from: s, reason: collision with root package name */
    public Integer f4258s;

    /* renamed from: t, reason: collision with root package name */
    public Boolean f4259t;

    /* renamed from: u, reason: collision with root package name */
    public Integer f4260u;

    /* renamed from: v, reason: collision with root package name */
    public Integer f4261v;

    /* renamed from: w, reason: collision with root package name */
    public Integer f4262w;

    /* renamed from: x, reason: collision with root package name */
    public Integer f4263x;

    /* renamed from: y, reason: collision with root package name */
    public Integer f4264y;

    /* renamed from: z, reason: collision with root package name */
    public Integer f4265z;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f4243a);
        parcel.writeSerializable(this.f4244b);
        parcel.writeSerializable(this.f4245c);
        parcel.writeSerializable(this.d);
        parcel.writeSerializable(this.f4246e);
        parcel.writeSerializable(this.f4247f);
        parcel.writeSerializable(this.f4248g);
        parcel.writeSerializable(this.h);
        parcel.writeInt(this.i);
        parcel.writeString(this.f4249j);
        parcel.writeInt(this.f4250k);
        parcel.writeInt(this.f4251l);
        parcel.writeInt(this.f4252m);
        String str = this.f4254o;
        parcel.writeString(str != null ? str.toString() : null);
        CharSequence charSequence = this.f4255p;
        parcel.writeString(charSequence != null ? charSequence.toString() : null);
        parcel.writeInt(this.f4256q);
        parcel.writeSerializable(this.f4258s);
        parcel.writeSerializable(this.f4260u);
        parcel.writeSerializable(this.f4261v);
        parcel.writeSerializable(this.f4262w);
        parcel.writeSerializable(this.f4263x);
        parcel.writeSerializable(this.f4264y);
        parcel.writeSerializable(this.f4265z);
        parcel.writeSerializable(this.f4241C);
        parcel.writeSerializable(this.f4239A);
        parcel.writeSerializable(this.f4240B);
        parcel.writeSerializable(this.f4259t);
        parcel.writeSerializable(this.f4253n);
        parcel.writeSerializable(this.f4242D);
    }
}
