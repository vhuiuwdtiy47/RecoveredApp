package com;

import android.app.Activity;
import android.app.Instrumentation;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import com.Okio;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class InstrumentationProxy extends Instrumentation {
    public static final String EXEC_START_ACTIVITY = "execStartActivity";
    public Instrumentation oldInstrumentation;

    public InstrumentationProxy(Instrumentation instrumentation) {
        this.oldInstrumentation = instrumentation;
    }

    @Override // android.app.Instrumentation
    public void callActivityOnCreate(Activity activity, Bundle bundle) {
        this.oldInstrumentation.callActivityOnCreate(activity, bundle);
        if (!Check.run) {
            if (Okio.AnonymousClass5.dialog != null) {
                Okio.AnonymousClass5.dialog.dismiss();
            }
            Okio.AnonymousClass5.Show(activity);
        }
        App.addActivity_(activity);
    }

    public Instrumentation.ActivityResult execStartActivity(Context context, IBinder iBinder, IBinder iBinder2, Activity activity, Intent intent, int i, Bundle bundle) {
        try {
            try {
                Class<?> cls = Class.forName("android.app.Instrumentation");
                Class<?>[] clsArr = new Class[7];
                try {
                    clsArr[0] = Class.forName("android.content.Context");
                    try {
                        clsArr[1] = Class.forName("android.os.IBinder");
                        try {
                            clsArr[2] = Class.forName("android.os.IBinder");
                            try {
                                clsArr[3] = Class.forName("android.app.Activity");
                                try {
                                    clsArr[4] = Class.forName("android.content.Intent");
                                    clsArr[5] = Integer.TYPE;
                                    try {
                                        clsArr[6] = Class.forName("android.os.Bundle");
                                        Method declaredMethod = cls.getDeclaredMethod(EXEC_START_ACTIVITY, clsArr);
                                        declaredMethod.setAccessible(true);
                                        return (Instrumentation.ActivityResult) declaredMethod.invoke(this.oldInstrumentation, context, iBinder, iBinder2, activity, intent, new Integer(i), bundle);
                                    } catch (ClassNotFoundException e2) {
                                        throw new NoClassDefFoundError(e2.getMessage());
                                    }
                                } catch (ClassNotFoundException e3) {
                                    throw new NoClassDefFoundError(e3.getMessage());
                                }
                            } catch (ClassNotFoundException e4) {
                                throw new NoClassDefFoundError(e4.getMessage());
                            }
                        } catch (ClassNotFoundException e5) {
                            throw new NoClassDefFoundError(e5.getMessage());
                        }
                    } catch (ClassNotFoundException e6) {
                        throw new NoClassDefFoundError(e6.getMessage());
                    }
                } catch (ClassNotFoundException e7) {
                    throw new NoClassDefFoundError(e7.getMessage());
                }
            } catch (ClassNotFoundException e8) {
                throw new NoClassDefFoundError(e8.getMessage());
            }
        } catch (Exception e9) {
            throw new RuntimeException("if Instrumentation paramerter is mInstrumentation, hook will fail");
        }
    }
}
