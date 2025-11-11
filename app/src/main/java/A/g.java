package A;

import android.app.Notification;
import android.app.Service;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final Service f14a;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f17e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f18f;
    public Bundle h;
    public final String i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f20j;

    /* renamed from: k, reason: collision with root package name */
    public final Notification f21k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f22l;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f15b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f16c = new ArrayList();
    public final ArrayList d = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final boolean f19g = true;

    public g(Service service, String str) {
        Notification notification = new Notification();
        this.f21k = notification;
        this.f14a = service;
        this.i = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.f22l = new ArrayList();
        this.f20j = true;
    }

    public static CharSequence b(String str) {
        return str.length() > 5120 ? str.subSequence(0, 5120) : str;
    }

    public final Notification a() {
        new ArrayList();
        Bundle bundle = new Bundle();
        Service service = this.f14a;
        String str = this.i;
        Notification.Builder a2 = l.a(service, str);
        Notification notification = this.f21k;
        a2.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(this.f17e).setContentText(this.f18f).setContentInfo(null).setContentIntent(null).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(0).setProgress(0, 0, false);
        j.b(a2, null);
        a2.setSubText(null).setUsesChronometer(false).setPriority(0);
        Iterator it = this.f15b.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        Bundle bundle2 = this.h;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        a2.setShowWhen(this.f19g);
        h.i(a2, false);
        h.g(a2, null);
        h.j(a2, null);
        h.h(a2, false);
        i.b(a2, null);
        i.c(a2, 0);
        i.f(a2, 0);
        i.d(a2, null);
        i.e(a2, notification.sound, notification.audioAttributes);
        ArrayList arrayList = this.f22l;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                i.a(a2, (String) it2.next());
            }
        }
        ArrayList arrayList2 = this.d;
        if (arrayList2.size() > 0) {
            if (this.h == null) {
                this.h = new Bundle();
            }
            Bundle bundle3 = this.h.getBundle("android.car.EXTENSIONS");
            if (bundle3 == null) {
                bundle3 = new Bundle();
            }
            Bundle bundle4 = new Bundle(bundle3);
            Bundle bundle5 = new Bundle();
            if (arrayList2.size() > 0) {
                Integer.toString(0);
                if (arrayList2.get(0) != null) {
                    throw new ClassCastException();
                }
                new Bundle();
                throw null;
            }
            bundle3.putBundle("invisible_actions", bundle5);
            bundle4.putBundle("invisible_actions", bundle5);
            if (this.h == null) {
                this.h = new Bundle();
            }
            this.h.putBundle("android.car.EXTENSIONS", bundle3);
            bundle.putBundle("android.car.EXTENSIONS", bundle4);
        }
        a2.setExtras(this.h);
        k.e(a2, null);
        l.b(a2, 0);
        l.e(a2, null);
        l.f(a2, null);
        l.g(a2, 0L);
        l.d(a2, 0);
        if (!TextUtils.isEmpty(str)) {
            a2.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
        Iterator it3 = this.f16c.iterator();
        if (it3.hasNext()) {
            it3.next().getClass();
            throw new ClassCastException();
        }
        m.a(a2, this.f20j);
        m.b(a2, null);
        return a2.build();
    }
}
