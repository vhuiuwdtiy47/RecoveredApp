package com.google.android.material.datepicker;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class n implements Comparable, Parcelable {
    public static final Parcelable.Creator<n> CREATOR = new G0.b(12);

    /* renamed from: a, reason: collision with root package name */
    public final Calendar f1934a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1935b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1936c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1937e;

    /* renamed from: f, reason: collision with root package name */
    public final long f1938f;

    /* renamed from: g, reason: collision with root package name */
    public String f1939g;

    public n(Calendar calendar) {
        calendar.set(5, 1);
        Calendar a2 = v.a(calendar);
        this.f1934a = a2;
        this.f1935b = a2.get(2);
        this.f1936c = a2.get(1);
        this.d = a2.getMaximum(7);
        this.f1937e = a2.getActualMaximum(5);
        this.f1938f = a2.getTimeInMillis();
    }

    public static n a(int i, int i2) {
        Calendar c2 = v.c(null);
        c2.set(1, i);
        c2.set(2, i2);
        return new n(c2);
    }

    public static n b(long j2) {
        Calendar c2 = v.c(null);
        c2.setTimeInMillis(j2);
        return new n(c2);
    }

    public final String c() {
        if (this.f1939g == null) {
            long timeInMillis = this.f1934a.getTimeInMillis();
            Locale locale = Locale.getDefault();
            AtomicReference atomicReference = v.f1951a;
            DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
            instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
            instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
            this.f1939g = instanceForSkeleton.format(new Date(timeInMillis));
        }
        return this.f1939g;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f1934a.compareTo(((n) obj).f1934a);
    }

    public final int d(n nVar) {
        if (!(this.f1934a instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        return (nVar.f1935b - this.f1935b) + ((nVar.f1936c - this.f1936c) * 12);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f1935b == nVar.f1935b && this.f1936c == nVar.f1936c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f1935b), Integer.valueOf(this.f1936c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f1936c);
        parcel.writeInt(this.f1935b);
    }
}
