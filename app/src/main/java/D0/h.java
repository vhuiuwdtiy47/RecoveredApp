package D0;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes.dex */
public final class h extends S.b {
    public static final Parcelable.Creator<h> CREATOR = new g(0);

    /* renamed from: c, reason: collision with root package name */
    public final int f112c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f113e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f114f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f115g;

    public h(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f112c = parcel.readInt();
        this.d = parcel.readInt();
        this.f113e = parcel.readInt() == 1;
        this.f114f = parcel.readInt() == 1;
        this.f115g = parcel.readInt() == 1;
    }

    @Override // S.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f112c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.f113e ? 1 : 0);
        parcel.writeInt(this.f114f ? 1 : 0);
        parcel.writeInt(this.f115g ? 1 : 0);
    }

    public h(BottomSheetBehavior bottomSheetBehavior) {
        super(AbsSavedState.EMPTY_STATE);
        this.f112c = bottomSheetBehavior.f1790L;
        this.d = bottomSheetBehavior.f1811e;
        this.f113e = bottomSheetBehavior.f1807b;
        this.f114f = bottomSheetBehavior.f1787I;
        this.f115g = bottomSheetBehavior.f1788J;
    }
}
