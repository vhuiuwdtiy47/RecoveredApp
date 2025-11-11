package com.xiaomi.vlive.ui.home;

import C.j;
import U.t;
import U.v;
import Y.AbstractComponentCallbacksC0056x;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.B;
import androidx.lifecycle.T;
import androidx.lifecycle.V;
import c0.e;
import com.android.music.R;
import com.xiaomi.vlive.App;
import com.xiaomi.vlive.ui.home.HomeFragment;
import g1.c;
import java.io.File;
import l.AbstractC0271z;
import q1.b;
import q1.d;
import q1.i;

/* loaded from: classes.dex */
public class HomeFragment extends AbstractComponentCallbacksC0056x {

    /* renamed from: W, reason: collision with root package name */
    public j f2161W;

    @Override // Y.AbstractComponentCallbacksC0056x
    public final View u(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        V c2 = c();
        T i = i();
        e a2 = a();
        d.e(i, "factory");
        v vVar = new v(c2, i, a2);
        b a3 = i.a(c.class);
        String s2 = t.s(a3);
        if (s2 == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        View inflate = layoutInflater.inflate(R.layout.fragment_home, viewGroup, false);
        int i2 = R.id.contact;
        TextView textView = (TextView) AbstractC0271z.i(inflate, R.id.contact);
        if (textView != null) {
            i2 = R.id.notice;
            TextView textView2 = (TextView) AbstractC0271z.i(inflate, R.id.notice);
            if (textView2 != null) {
                i2 = R.id.textView;
                if (((TextView) AbstractC0271z.i(inflate, R.id.textView)) != null) {
                    i2 = R.id.textView3;
                    if (((TextView) AbstractC0271z.i(inflate, R.id.textView3)) != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                        this.f2161W = new j(constraintLayout, textView, textView2);
                        App app = (App) G().getApplication();
                        final int i3 = 0;
                        app.h.d(l(), new B(this) { // from class: g1.a

                            /* renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ HomeFragment f2570b;

                            {
                                this.f2570b = this;
                            }

                            @Override // androidx.lifecycle.B
                            public final void a(Object obj) {
                                String str = (String) obj;
                                switch (i3) {
                                    case 0:
                                        HomeFragment homeFragment = this.f2570b;
                                        ((TextView) homeFragment.f2161W.f60b).setText(Html.fromHtml(str, 0));
                                        ((TextView) homeFragment.f2161W.f60b).setMovementMethod(LinkMovementMethod.getInstance());
                                        return;
                                    default:
                                        HomeFragment homeFragment2 = this.f2570b;
                                        ((TextView) homeFragment2.f2161W.f61c).setText(Html.fromHtml(str, 0));
                                        ((TextView) homeFragment2.f2161W.f61c).setMovementMethod(LinkMovementMethod.getInstance());
                                        return;
                                }
                            }
                        });
                        final int i4 = 1;
                        app.i.d(l(), new B(this) { // from class: g1.a

                            /* renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ HomeFragment f2570b;

                            {
                                this.f2570b = this;
                            }

                            @Override // androidx.lifecycle.B
                            public final void a(Object obj) {
                                String str = (String) obj;
                                switch (i4) {
                                    case 0:
                                        HomeFragment homeFragment = this.f2570b;
                                        ((TextView) homeFragment.f2161W.f60b).setText(Html.fromHtml(str, 0));
                                        ((TextView) homeFragment.f2161W.f60b).setMovementMethod(LinkMovementMethod.getInstance());
                                        return;
                                    default:
                                        HomeFragment homeFragment2 = this.f2570b;
                                        ((TextView) homeFragment2.f2161W.f61c).setText(Html.fromHtml(str, 0));
                                        ((TextView) homeFragment2.f2161W.f61c).setMovementMethod(LinkMovementMethod.getInstance());
                                        return;
                                }
                            }
                        });
                        if (!new File("/data/camera/libshadowhook.so").exists() && !new File("/data/samera/libshadowhook.so").exists()) {
                            return constraintLayout;
                        }
                        Y.B b2 = this.f1198t;
                        final int i5 = 0;
                        AlertDialog.Builder positiveButton = new AlertDialog.Builder(b2 == null ? null : b2.f958e).setTitle("警告").setMessage("检测到系统存在其他虚拟相机\n卸载后也会有残留容易触发风控\n是否需要清理残留?").setPositiveButton("确定", new DialogInterface.OnClickListener() { // from class: g1.b
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i6) {
                                switch (i5) {
                                    case 0:
                                        t.q("chattr -i /data/camera");
                                        t.q("rm -r /data/camera");
                                        t.q("rm -r /data/samera");
                                        t.g("已删除");
                                        return;
                                    default:
                                        dialogInterface.dismiss();
                                        return;
                                }
                            }
                        });
                        final int i6 = 1;
                        positiveButton.setNegativeButton("取消", new DialogInterface.OnClickListener() { // from class: g1.b
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i62) {
                                switch (i6) {
                                    case 0:
                                        t.q("chattr -i /data/camera");
                                        t.q("rm -r /data/camera");
                                        t.q("rm -r /data/samera");
                                        t.g("已删除");
                                        return;
                                    default:
                                        dialogInterface.dismiss();
                                        return;
                                }
                            }
                        }).show();
                        return constraintLayout;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
    }

    @Override // Y.AbstractComponentCallbacksC0056x
    public final void v() {
        this.f1165D = true;
        this.f2161W = null;
    }
}
