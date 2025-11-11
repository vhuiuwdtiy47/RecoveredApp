package g;

import L.C0016l;
import Y.AbstractC0040g;
import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class x extends AbstractC0040g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2562c = 1;
    public final /* synthetic */ B d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f2563e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(B b2, C0016l c0016l) {
        super(b2);
        this.d = b2;
        this.f2563e = c0016l;
    }

    @Override // Y.AbstractC0040g
    public final IntentFilter e() {
        switch (this.f2562c) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    /* JADX WARN: Type inference failed for: r2v13, types: [g.H, java.lang.Object] */
    @Override // Y.AbstractC0040g
    public final int f() {
        Location location;
        boolean z2;
        long j2;
        Location location2;
        switch (this.f2562c) {
            case 0:
                return t.a((PowerManager) this.f2563e) ? 2 : 1;
            default:
                C0016l c0016l = (C0016l) this.f2563e;
                I i = (I) c0016l.d;
                if (i.f2469b > System.currentTimeMillis()) {
                    z2 = i.f2468a;
                } else {
                    Context context = (Context) c0016l.f361b;
                    int k2 = Z0.i.k(context, "android.permission.ACCESS_COARSE_LOCATION");
                    Location location3 = null;
                    LocationManager locationManager = (LocationManager) c0016l.f362c;
                    if (k2 == 0) {
                        try {
                        } catch (Exception e2) {
                            Log.d("TwilightManager", "Failed to get last known location", e2);
                        }
                        if (locationManager.isProviderEnabled("network")) {
                            location2 = locationManager.getLastKnownLocation("network");
                            location = location2;
                        }
                        location2 = null;
                        location = location2;
                    } else {
                        location = null;
                    }
                    if (Z0.i.k(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        try {
                            if (locationManager.isProviderEnabled("gps")) {
                                location3 = locationManager.getLastKnownLocation("gps");
                            }
                        } catch (Exception e3) {
                            Log.d("TwilightManager", "Failed to get last known location", e3);
                        }
                    }
                    if (location3 == null || location == null ? location3 != null : location3.getTime() > location.getTime()) {
                        location = location3;
                    }
                    if (location != null) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (H.d == null) {
                            H.d = new Object();
                        }
                        H h = H.d;
                        h.a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
                        h.a(currentTimeMillis, location.getLatitude(), location.getLongitude());
                        z2 = h.f2467c == 1;
                        long j3 = h.f2466b;
                        long j4 = h.f2465a;
                        h.a(86400000 + currentTimeMillis, location.getLatitude(), location.getLongitude());
                        long j5 = h.f2466b;
                        if (j3 == -1 || j4 == -1) {
                            j2 = currentTimeMillis + 43200000;
                        } else {
                            if (currentTimeMillis <= j4) {
                                j5 = currentTimeMillis > j3 ? j4 : j3;
                            }
                            j2 = j5 + 60000;
                        }
                        i.f2468a = z2;
                        i.f2469b = j2;
                    } else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i2 = Calendar.getInstance().get(11);
                        if (i2 < 6 || i2 >= 22) {
                            z2 = true;
                        }
                    }
                }
                return z2 ? 2 : 1;
        }
    }

    @Override // Y.AbstractC0040g
    public final void i() {
        switch (this.f2562c) {
            case 0:
                this.d.k(true, true);
                return;
            default:
                this.d.k(true, true);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(B b2, Context context) {
        super(b2);
        this.d = b2;
        this.f2563e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
