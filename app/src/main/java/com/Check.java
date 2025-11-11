package com;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Handler;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.Window;
import java.util.Date;

/* loaded from: classes.dex */
public class Check {
    public static boolean run = false;

    public static void Run(Context context, Date date) {
        run = true;
        show(context, date);
    }

    private static void show(Context context, Date date) {
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        int dimensionPixelSize = identifier > 0 ? context.getResources().getDimensionPixelSize(identifier) : 0;
        Window window = ((Activity) context).getWindow();
        window.addFlags(Integer.MIN_VALUE);
        window.getDecorView().setSystemUiVisibility(0);
        window.setStatusBarColor(Color.parseColor("#FF3F5972"));
        window.setNavigationBarColor(Color.parseColor("#FF3F5972"));
        ViewGroup viewGroup = (ViewGroup) ((Activity) context).getWindow().getDecorView();
        viewGroup.getChildAt(0).setPadding(0, dimensionPixelSize, 0, 0);
        Text text = new Text(context);
        text.setTextColor(Color.parseColor("#00ffff"));
        text.setTextSize(16);
        text.setSingleLine(true);
        text.setMaxLines(10);
        text.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        text.setHorizontallyScrolling(true);
        text.setFocusable(true);
        text.setFocusableInTouchMode(true);
        text.setText(Type.Gg);
        text.setGravity(81);
        text.setLayoutParams(new ViewGroup.LayoutParams(-1, dimensionPixelSize * 2));
        text.setBackgroundColor(Color.parseColor("#FF3F5972"));
        viewGroup.addView(text);
        Handler handler = new Handler();
        handler.post(new Runnable(date, text, handler) { // from class: com.Check.100000000
            private final Date val$a;
            private final Text val$btn_floatView;
            private final Handler val$handler;

            {
                this.val$a = date;
                this.val$btn_floatView = text;
                this.val$handler = handler;
            }

            @Override // java.lang.Runnable
            public void run() {
                Date date2 = new Date(TimeUtils.getCurTimeMills());
                long time = (this.val$a.getTime() - date2.getTime()) / 60000;
                int i = (int) (time / 1440);
                int i2 = (int) (time % 1440);
                if (i >= 365) {
                    this.val$btn_floatView.setText(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(Type.Gg).append(" 你的剩余时间:").toString()).append(i / 365).toString()).append("年").toString());
                } else if (i >= 1) {
                    this.val$btn_floatView.setText(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(Type.Gg).append(" 你的剩余时间:").toString()).append(i).toString()).append("天").toString());
                } else if (i < 1 && i2 > 60) {
                    this.val$btn_floatView.setText(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(Type.Gg).append(" 你的剩余时间:").toString()).append(i2 * 60).toString()).append("小时").toString());
                } else if (i2 > 0) {
                    this.val$btn_floatView.setText(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(Type.Gg).append(" 你的剩余时间:").toString()).append(i2).toString()).append("分钟").toString());
                }
                if (this.val$a.getTime() < date2.getTime()) {
                    mToast.Show((Context) null, "");
                }
                this.val$handler.postDelayed(this, 60000);
            }
        });
    }
}
