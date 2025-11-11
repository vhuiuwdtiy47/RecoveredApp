package O0;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class l extends S.b {
    public static final Parcelable.Creator<l> CREATOR = new D0.g(4);

    /* renamed from: c, reason: collision with root package name */
    public Bundle f575c;

    public l(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f575c = parcel.readBundle(classLoader == null ? l.class.getClassLoader() : classLoader);
    }

    @Override // S.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeBundle(this.f575c);
    }
}
