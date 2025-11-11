package V0;

import android.os.Handler;
import android.os.Message;

/* loaded from: classes.dex */
public final class e implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ A0.c f816a;

    public e(A0.c cVar) {
        this.f816a = cVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        A0.c cVar = this.f816a;
        if (message.obj != null) {
            throw new ClassCastException();
        }
        synchronized (cVar.f33b) {
            throw null;
        }
    }
}
