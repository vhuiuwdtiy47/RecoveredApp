package d1;

import U.t;
import android.os.RemoteException;
import android.view.View;
import com.tencent.wechat.Platform;
import com.xiaomi.vlive.FloatService;
import java.io.File;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2173a;

    public /* synthetic */ b(int i) {
        this.f2173a = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f2173a) {
            case 0:
                int i = FloatService.f2128g;
                Z0.i.k0("播放");
                if (t.T().booleanValue()) {
                    return;
                }
                t.g("播放失败");
                return;
            case 1:
                if (new File("/sdcard/Movies/1.mp4").exists()) {
                    t.a0("/sdcard/Movies/1.mp4", 1);
                    return;
                } else {
                    Z0.i.k0("/sdcard/Movies/1.mp4 不存在");
                    return;
                }
            case 2:
                if (new File("/sdcard/Movies/2.mp4").exists()) {
                    t.a0("/sdcard/Movies/2.mp4", 1);
                    return;
                } else {
                    Z0.i.k0("/sdcard/Movies/2.mp4 不存在");
                    return;
                }
            case 3:
                if (new File("/sdcard/Movies/3.mp4").exists()) {
                    t.a0("/sdcard/Movies/3.mp4", 1);
                    return;
                } else {
                    Z0.i.k0("/sdcard/Movies/3.mp4 不存在");
                    return;
                }
            case Platform.INFO /* 4 */:
                try {
                    ((f) t.E()).l();
                    return;
                } catch (RemoteException | Exception unused) {
                    return;
                }
            default:
                if (t.T().booleanValue()) {
                    return;
                }
                Z0.i.k0("播放失败");
                return;
        }
    }
}
