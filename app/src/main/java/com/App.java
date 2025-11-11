package com;

import adrt.ADRTLogCatReader;
import android.app.Activity;
import android.app.Application;
import android.app.Instrumentation;
import android.content.Context;
import android.os.Process;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class App extends Application {
    private static List<Activity> oList;

    public static void addActivity_(Activity activity) {
        if (oList.contains(activity)) {
            return;
        }
        oList.add(activity);
    }

    public static void removeALLActivity_() {
        Iterator<Activity> it = oList.iterator();
        while (it.hasNext()) {
            it.next().finish();
        }
        Process.killProcess(Process.myPid());
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        try {
            oList = new ArrayList();
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Method declaredMethod = cls.getDeclaredMethod("currentActivityThread", new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke((Object) null, new Object[0]);
            Field declaredField = cls.getDeclaredField("mInstrumentation");
            declaredField.setAccessible(true);
            declaredField.set(invoke, new InstrumentationProxy((Instrumentation) declaredField.get(invoke)));
        } catch (Exception e2) {
            mToast.Show((Context) null, (String) null);
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Application
    public void onCreate() {
        ADRTLogCatReader.onContext(this, "com.aide.ui");
        super.onCreate();
    }
}
