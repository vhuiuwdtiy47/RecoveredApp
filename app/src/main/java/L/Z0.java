package l;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class Z0 extends S.b {
    public static final Parcelable.Creator<Z0> CREATOR = new D0.g(8);

    /* renamed from: c, reason: collision with root package name */
    public int f3042c;
    public boolean d;

    public Z0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f3042c = parcel.readInt();
        this.d = parcel.readInt() != 0;
    }

    @Override // S.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f3042c);
        parcel.writeInt(this.d ? 1 : 0);
    }
}
