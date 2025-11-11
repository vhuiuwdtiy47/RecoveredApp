package com;

import android.content.Context;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

/* loaded from: classes.dex */
public class Utis {
    public static String Read(Context context) {
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(context.getCacheDir(), "Card"));
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "utf-8");
            char[] cArr = new char[fileInputStream.available()];
            inputStreamReader.read(cArr);
            inputStreamReader.close();
            fileInputStream.close();
            return new String(cArr);
        } catch (FileNotFoundException e2) {
            e2.printStackTrace();
            return "";
        } catch (UnsupportedEncodingException e3) {
            e3.printStackTrace();
            return "";
        } catch (IOException e4) {
            e4.printStackTrace();
            return "";
        }
    }

    public static void Writer(Context context, String str) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(context.getCacheDir(), "Card"));
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, "utf-8");
            outputStreamWriter.write(str);
            outputStreamWriter.flush();
            fileOutputStream.flush();
            outputStreamWriter.close();
            fileOutputStream.close();
        } catch (FileNotFoundException e2) {
            e2.printStackTrace();
        } catch (UnsupportedEncodingException e3) {
            e3.printStackTrace();
        } catch (IOException e4) {
            e4.printStackTrace();
        }
    }
}
