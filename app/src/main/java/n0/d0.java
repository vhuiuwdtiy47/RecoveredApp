package n0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class d0 implements Parcelable {
    public static final Parcelable.Creator<d0> CREATOR = new G0.b(17);

    /* renamed from: a, reason: collision with root package name */
    public int f3338a;

    /* renamed from: b, reason: collision with root package name */
    public int f3339b;

    /* renamed from: c, reason: collision with root package name */
    public int f3340c;
    public int[] d;

    /* renamed from: e, reason: collision with root package name */
    public int f3341e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f3342f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f3343g;
    public boolean h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3344j;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f3338a);
        parcel.writeInt(this.f3339b);
        parcel.writeInt(this.f3340c);
        if (this.f3340c > 0) {
            parcel.writeIntArray(this.d);
        }
        parcel.writeInt(this.f3341e);
        if (this.f3341e > 0) {
            parcel.writeIntArray(this.f3342f);
        }
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.f3344j ? 1 : 0);
        parcel.writeList(this.f3343g);
    }
}
