package com;

import android.content.Context;
import android.widget.TextView;

/* loaded from: classes.dex */
public class Text extends TextView {
    public Text(Context context) {
        super(context);
    }

    @Override // android.view.View
    public boolean isFocused() {
        return true;
    }
}
