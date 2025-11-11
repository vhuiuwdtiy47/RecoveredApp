package com;

import android.content.Context;
import android.widget.Toast;

/* loaded from: classes.dex */
public class mToast {
    public static void Show(Context context, String str) {
        Toast.makeText(context, str, 5000).show();
    }
}
