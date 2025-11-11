package a1;

import android.R;
import android.view.View;
import android.widget.TextView;

/* loaded from: classes.dex */
public interface a {
    static TextView a(View view) {
        if (!(view instanceof TextView)) {
            View findViewById = view.findViewById(R.id.message);
            if (findViewById instanceof TextView) {
                return (TextView) findViewById;
            }
            throw new IllegalArgumentException("You must include a TextView with an ID value of message (xml code: android:id=\"@android:id/message\", java code: view.setId(android.R.id.message))");
        }
        if (view.getId() == -1) {
            view.setId(R.id.message);
        } else if (view.getId() != 16908299) {
            throw new IllegalArgumentException("You must set the ID value of TextView to android.R.id.message");
        }
        return (TextView) view;
    }

    void cancel();

    void setDuration(int i);

    void setGravity(int i, int i2, int i3);

    void setMargin(float f2, float f3);

    void setText(CharSequence charSequence);

    void setView(View view);

    void show();
}
