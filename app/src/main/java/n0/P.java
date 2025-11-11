package n0;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class P extends S.b {
    public static final Parcelable.Creator<P> CREATOR = new D0.g(9);

    /* renamed from: c, reason: collision with root package name */
    public Parcelable f3272c;

    public P(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f3272c = parcel.readParcelable(classLoader == null ? H.class.getClassLoader() : classLoader);
    }

    @Override // S.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f3272c, 0);
    }
}
