package g;

import Y.AbstractC0040g;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public final class y extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC0040g f2564a;

    public y(AbstractC0040g abstractC0040g) {
        this.f2564a = abstractC0040g;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.f2564a.i();
    }
}
