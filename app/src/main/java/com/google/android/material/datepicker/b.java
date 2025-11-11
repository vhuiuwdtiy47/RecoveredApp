package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new G0.b(10);

    /* renamed from: a, reason: collision with root package name */
    public final n f1877a;

    /* renamed from: b, reason: collision with root package name */
    public final n f1878b;

    /* renamed from: c, reason: collision with root package name */
    public final d f1879c;
    public final n d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1880e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1881f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1882g;

    public b(n nVar, n nVar2, d dVar, n nVar3, int i) {
        Objects.requireNonNull(nVar, "start cannot be null");
        Objects.requireNonNull(nVar2, "end cannot be null");
        Objects.requireNonNull(dVar, "validator cannot be null");
        this.f1877a = nVar;
        this.f1878b = nVar2;
        this.d = nVar3;
        this.f1880e = i;
        this.f1879c = dVar;
        if (nVar3 != null && nVar.f1934a.compareTo(nVar3.f1934a) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (nVar3 != null && nVar3.f1934a.compareTo(nVar2.f1934a) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i < 0 || i > v.c(null).getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.f1882g = nVar.d(nVar2) + 1;
        this.f1881f = (nVar2.f1936c - nVar.f1936c) + 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f1877a.equals(bVar.f1877a) && this.f1878b.equals(bVar.f1878b) && Objects.equals(this.d, bVar.d) && this.f1880e == bVar.f1880e && this.f1879c.equals(bVar.f1879c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1877a, this.f1878b, this.d, Integer.valueOf(this.f1880e), this.f1879c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f1877a, 0);
        parcel.writeParcelable(this.f1878b, 0);
        parcel.writeParcelable(this.d, 0);
        parcel.writeParcelable(this.f1879c, 0);
        parcel.writeInt(this.f1880e);
    }
}
