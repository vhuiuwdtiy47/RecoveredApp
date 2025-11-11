package u0;

import android.os.Parcel;
import android.util.SparseIntArray;
import o.f;
import o.j;

/* renamed from: u0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0360b extends AbstractC0359a {
    public final SparseIntArray d;

    /* renamed from: e, reason: collision with root package name */
    public final Parcel f3934e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3935f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3936g;
    public final String h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f3937j;

    /* renamed from: k, reason: collision with root package name */
    public int f3938k;

    /* JADX WARN: Type inference failed for: r5v0, types: [o.f, o.j] */
    /* JADX WARN: Type inference failed for: r6v0, types: [o.f, o.j] */
    /* JADX WARN: Type inference failed for: r7v0, types: [o.f, o.j] */
    public C0360b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new j(0), new j(0), new j(0));
    }

    @Override // u0.AbstractC0359a
    public final C0360b a() {
        Parcel parcel = this.f3934e;
        int dataPosition = parcel.dataPosition();
        int i = this.f3937j;
        if (i == this.f3935f) {
            i = this.f3936g;
        }
        return new C0360b(parcel, dataPosition, i, this.h + "  ", this.f3931a, this.f3932b, this.f3933c);
    }

    @Override // u0.AbstractC0359a
    public final boolean e(int i) {
        while (this.f3937j < this.f3936g) {
            int i2 = this.f3938k;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            int i3 = this.f3937j;
            Parcel parcel = this.f3934e;
            parcel.setDataPosition(i3);
            int readInt = parcel.readInt();
            this.f3938k = parcel.readInt();
            this.f3937j += readInt;
        }
        return this.f3938k == i;
    }

    @Override // u0.AbstractC0359a
    public final void h(int i) {
        int i2 = this.i;
        SparseIntArray sparseIntArray = this.d;
        Parcel parcel = this.f3934e;
        if (i2 >= 0) {
            int i3 = sparseIntArray.get(i2);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i3);
            parcel.writeInt(dataPosition - i3);
            parcel.setDataPosition(dataPosition);
        }
        this.i = i;
        sparseIntArray.put(i, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i);
    }

    public C0360b(Parcel parcel, int i, int i2, String str, f fVar, f fVar2, f fVar3) {
        super(fVar, fVar2, fVar3);
        this.d = new SparseIntArray();
        this.i = -1;
        this.f3938k = -1;
        this.f3934e = parcel;
        this.f3935f = i;
        this.f3936g = i2;
        this.f3937j = i;
        this.h = str;
    }
}
