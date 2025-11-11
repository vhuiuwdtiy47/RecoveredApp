package com;

import android.os.AsyncTask;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* loaded from: classes.dex */
public class TimeUtils {

    /* loaded from: classes.dex */
    static class MyTask extends AsyncTask<String, Void, Date> {
        @Override // android.os.AsyncTask
        protected /* bridge */ Date doInBackground(String[] strArr) {
            return doInBackground2(strArr);
        }

        /* renamed from: doInBackground, reason: avoid collision after fix types in other method */
        protected Date doInBackground2(String... strArr) {
            try {
                URLConnection openConnection = new URL(strArr[0]).openConnection();
                openConnection.connect();
                return new Date(openConnection.getDate());
            } catch (MalformedURLException e2) {
                e2.printStackTrace();
                return new Date();
            } catch (IOException e3) {
                e3.printStackTrace();
                return new Date();
            }
        }

        @Override // android.os.AsyncTask
        protected /* bridge */ void onPostExecute(Date date) {
            onPostExecute2(date);
        }

        /* renamed from: onPostExecute, reason: avoid collision after fix types in other method */
        protected void onPostExecute2(Date date) {
        }

        @Override // android.os.AsyncTask
        protected void onPreExecute() {
        }
    }

    public static synchronized Date StringOfDate(String str) {
        Date date;
        synchronized (TimeUtils.class) {
            date = (Date) null;
            try {
                date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(str);
            } catch (ParseException e2) {
            }
        }
        return date;
    }

    public static synchronized long dateToStamp(String str) throws ParseException {
        long time;
        synchronized (TimeUtils.class) {
            time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(str).getTime();
        }
        return time;
    }

    public static synchronized long getCurTimeMills() {
        long j2;
        synchronized (TimeUtils.class) {
            try {
                j2 = new MyTask().execute("http://faka.chaoyuevip.cn").get().getTime();
            } catch (Exception e2) {
                e2.printStackTrace();
                j2 = 0;
            }
        }
        return j2;
    }

    public static synchronized String getStringDate(Date date) {
        String format;
        synchronized (TimeUtils.class) {
            format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
        }
        return format;
    }

    public static synchronized String stampToDate(long j2) {
        String format;
        synchronized (TimeUtils.class) {
            format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(j2));
        }
        return format;
    }
}
