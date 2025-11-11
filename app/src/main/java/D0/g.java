package D0;

import O0.l;
import W0.C;
import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.wechat.Platform;
import l.Z0;
import n0.P;
import y.C0381f;

/* loaded from: classes.dex */
public final class g implements Parcelable.ClassLoaderCreator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f111a;

    public /* synthetic */ g(int i) {
        this.f111a = i;
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f111a) {
            case 0:
                return new h(parcel, classLoader);
            case 1:
                return new E0.b(parcel, classLoader);
            case 2:
                return new M0.a(parcel, classLoader);
            case 3:
                return new M0.f(parcel, classLoader);
            case Platform.INFO /* 4 */:
                return new l(parcel, classLoader);
            case Platform.WARN /* 5 */:
                if (parcel.readParcelable(classLoader) == null) {
                    return S.b.f627b;
                }
                throw new IllegalStateException("superState must be null");
            case 6:
                return new U0.c(parcel, classLoader);
            case 7:
                return new C(parcel, classLoader);
            case 8:
                return new Z0(parcel, classLoader);
            case 9:
                return new P(parcel, classLoader);
            default:
                return new C0381f(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f111a) {
            case 0:
                return new h[i];
            case 1:
                return new E0.b[i];
            case 2:
                return new M0.a[i];
            case 3:
                return new M0.f[i];
            case Platform.INFO /* 4 */:
                return new l[i];
            case Platform.WARN /* 5 */:
                return new S.b[i];
            case 6:
                return new U0.c[i];
            case 7:
                return new C[i];
            case 8:
                return new Z0[i];
            case 9:
                return new P[i];
            default:
                return new C0381f[i];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f111a) {
            case 0:
                return new h(parcel, null);
            case 1:
                return new E0.b(parcel, null);
            case 2:
                return new M0.a(parcel, null);
            case 3:
                return new M0.f(parcel, null);
            case Platform.INFO /* 4 */:
                return new l(parcel, null);
            case Platform.WARN /* 5 */:
                if (parcel.readParcelable(null) == null) {
                    return S.b.f627b;
                }
                throw new IllegalStateException("superState must be null");
            case 6:
                return new U0.c(parcel, null);
            case 7:
                return new C(parcel, null);
            case 8:
                return new Z0(parcel, null);
            case 9:
                return new P(parcel, null);
            default:
                return new C0381f(parcel, null);
        }
    }
}
