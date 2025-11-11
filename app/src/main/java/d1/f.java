package d1;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class f implements h {

    /* renamed from: a, reason: collision with root package name */
    public IBinder f2187a;

    public final int a(boolean z2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.xiaomi.vlive.IMyBinderService");
            obtain.writeInt(z2 ? 1 : 0);
            this.f2187a.transact(17, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f2187a;
    }

    public final int b(boolean z2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.xiaomi.vlive.IMyBinderService");
            obtain.writeInt(z2 ? 1 : 0);
            this.f2187a.transact(16, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final int[] c() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.xiaomi.vlive.IMyBinderService");
            this.f2187a.transact(13, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.createIntArray();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final int d(boolean z2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.xiaomi.vlive.IMyBinderService");
            obtain.writeInt(z2 ? 1 : 0);
            this.f2187a.transact(19, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final int e(long j2, long j3) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.xiaomi.vlive.IMyBinderService");
            obtain.writeLong(j2);
            obtain.writeLong(j3);
            this.f2187a.transact(22, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final int f() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.xiaomi.vlive.IMyBinderService");
            this.f2187a.transact(15, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final int g(int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.xiaomi.vlive.IMyBinderService");
            obtain.writeInt(i);
            this.f2187a.transact(18, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final int h(int i, float f2, float f3, float f4, float f5, int i2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.xiaomi.vlive.IMyBinderService");
            obtain.writeInt(i);
            obtain.writeFloat(f2);
            obtain.writeFloat(f3);
            obtain.writeFloat(f4);
            obtain.writeFloat(f5);
            obtain.writeInt(i2);
            this.f2187a.transact(24, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final int i(String str, int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.xiaomi.vlive.IMyBinderService");
            obtain.writeInt(i);
            obtain.writeString(str);
            this.f2187a.transact(14, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final int j(String str, boolean z2, boolean z3) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.xiaomi.vlive.IMyBinderService");
            obtain.writeString(str);
            obtain.writeInt(z2 ? 1 : 0);
            obtain.writeInt(z3 ? 1 : 0);
            this.f2187a.transact(11, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final int k() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.xiaomi.vlive.IMyBinderService");
            this.f2187a.transact(12, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final int l() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.xiaomi.vlive.IMyBinderService");
            this.f2187a.transact(25, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
