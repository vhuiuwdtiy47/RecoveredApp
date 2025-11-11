package f1;

import Y.AbstractComponentCallbacksC0056x;
import android.widget.RadioGroup;
import com.xiaomi.vlive.ui.controller.ControllerFragment;
import com.xiaomi.vlive.ui.settings.SettingsFragment;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements RadioGroup.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2375a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractComponentCallbacksC0056x f2376b;

    public /* synthetic */ b(int i, AbstractComponentCallbacksC0056x abstractComponentCallbacksC0056x) {
        this.f2375a = i;
        this.f2376b = abstractComponentCallbacksC0056x;
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        switch (this.f2375a) {
            case 0:
                ControllerFragment controllerFragment = (ControllerFragment) this.f2376b;
                if (i != controllerFragment.f2135W.f2197f.getId()) {
                    if (i == controllerFragment.f2135W.f2198g.getId()) {
                        controllerFragment.f2135W.h.setText("rtmp链接:");
                        controllerFragment.f2135W.f2207r.setButtonText("保存链接");
                        controllerFragment.f2135W.f2200k.setText(controllerFragment.f2136X.f2121a.getString("PlayRtmpUrl", "rtmp://ns8.indexforce.com/home/mystream"));
                        controllerFragment.f2136X.f2121a.edit().putInt("PlayFileType", 2).apply();
                        return;
                    }
                    return;
                }
                controllerFragment.f2135W.h.setText("文件路径:");
                controllerFragment.f2135W.f2207r.setButtonText("选择视频");
                String string = controllerFragment.f2136X.f2121a.getString("PlayFileMp4", "");
                if (!string.isEmpty()) {
                    string = "已设置MP4视频文件";
                }
                controllerFragment.f2135W.f2200k.setText(string);
                controllerFragment.f2136X.f2121a.edit().putInt("PlayFileType", 1).apply();
                return;
            case 1:
                ControllerFragment controllerFragment2 = (ControllerFragment) this.f2376b;
                if (i == controllerFragment2.f2135W.f2209t.getId()) {
                    controllerFragment2.f2136X.f2121a.edit().putInt("PlayAutoColor_mode", 1).apply();
                    return;
                } else {
                    if (i == controllerFragment2.f2135W.f2210u.getId()) {
                        controllerFragment2.f2136X.f2121a.edit().putInt("PlayAutoColor_mode", 2).apply();
                        return;
                    }
                    return;
                }
            default:
                SettingsFragment settingsFragment = (SettingsFragment) this.f2376b;
                if (i == settingsFragment.f2162W.f2227o.getId()) {
                    settingsFragment.f2162W.f2234v.setText("当屏幕闪烁红色播放视频第1帧\n当屏幕闪烁绿色播放视频第2帧\n当屏幕闪烁蓝色播放视频第3帧\n当屏幕闪烁黄色播放视频第4帧");
                    return;
                } else if (i == settingsFragment.f2162W.f2228p.getId()) {
                    settingsFragment.f2162W.f2234v.setText("功能开发中..........");
                    return;
                } else {
                    if (i == settingsFragment.f2162W.f2229q.getId()) {
                        settingsFragment.f2162W.f2234v.setText("当前模式会自动根据屏幕颜色给视频注入颜色");
                        return;
                    }
                    return;
                }
        }
    }
}
