package E0;

import D0.g;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class b extends S.b {
    public static final Parcelable.Creator<b> CREATOR = new g(1);

    /* renamed from: c, reason: collision with root package name */
    public boolean f122c;

    public b(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            b.class.getClassLoader();
        }
        this.f122c = parcel.readInt() == 1;
    }

    @Override // S.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f122c ? 1 : 0);
    }
}
