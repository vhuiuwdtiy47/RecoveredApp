package com.xiaomi.vlive;

import A.g;
import android.R;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* loaded from: classes.dex */
public class MediaProjectionForegroundService extends Service {
    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        NotificationChannel notificationChannel = new NotificationChannel("media_projection_channel", "Media Projection Service Channel", 2);
        NotificationManager notificationManager = (NotificationManager) getSystemService(NotificationManager.class);
        if (notificationManager != null) {
            notificationManager.createNotificationChannel(notificationChannel);
        }
        g gVar = new g(this, "media_projection_channel");
        gVar.f17e = g.b("Screen Capture Service");
        gVar.f18f = g.b("Running MediaProjection foreground service");
        gVar.f21k.icon = R.drawable.ic_media_play;
        startForeground(1, gVar.a());
    }
}
