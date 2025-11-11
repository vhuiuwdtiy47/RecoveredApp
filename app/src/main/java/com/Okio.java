package com;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.CApi;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nullable;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* loaded from: classes.dex */
public final class Okio {
    static final Logger logger = Logger.getLogger(Okio.class.getName());

    /* compiled from: Api.java */
    /* renamed from: com.Okio$5, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass5 {
        static EditText Code;
        static AlertDialog.Builder builder;
        public static AlertDialog dialog;

        public static synchronized void Show(Context context) {
            synchronized (AnonymousClass5.class) {
                Type.Imei = PhoneInfo.md5Password(new StringBuffer().append(new StringBuffer().append(PhoneInfo.getProperty("ro.serialno", "")).append(PhoneInfo.getProperty("ro.product.model", "")).toString()).append(PhoneInfo.getProperty("ro.build.version.sdk", "")).toString());
                if (Type.Imei.isEmpty()) {
                    App.removeALLActivity_();
                }
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                Text text = new Text(context);
                text.setText(Segmenr.Bt);
                text.setTextColor(Color.parseColor(Segmenr.ColorH));
                text.setGravity(17);
                text.setTextSize(18);
                text.setPadding(10, 0, 0, 0);
                Code = new EditText(context);
                Code.setText(Utis.Read(context));
                Code.setHint(Segmenr.EditHint);
                Code.setTextColor(Color.parseColor(Segmenr.ColorH));
                Code.setSingleLine(true);
                linearLayout.addView(text);
                linearLayout.addView(Code);
                linearLayout.setPadding(25, 50, 25, 0);
                builder = new AlertDialog.Builder(context);
                builder.setCancelable(false);
                builder.setView(linearLayout);
                builder.setNeutralButton("粘贴", (DialogInterface.OnClickListener) null);
                builder.setPositiveButton("确定", (DialogInterface.OnClickListener) null);
                dialog = builder.create();
                if (dialog.isShowing()) {
                    App.removeALLActivity_();
                }
                dialog.show();
                if (!dialog.isShowing()) {
                    App.removeALLActivity_();
                }
                dialog.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.Okio.5.10
                    @Override // android.content.DialogInterface.OnKeyListener
                    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                        return i != 67;
                    }
                });
                dialog.setCanceledOnTouchOutside(false);
                dialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.Okio.5.11
                    @Override // android.content.DialogInterface.OnDismissListener
                    public void onDismiss(DialogInterface dialogInterface) {
                        if (Check.run) {
                            return;
                        }
                        AnonymousClass5.dialog.show();
                    }
                });
                dialog.getButton(-3).setTextColor(Color.parseColor(Segmenr.ColorH));
                dialog.getButton(-2).setTextColor(Color.parseColor(Segmenr.ColorH));
                dialog.getButton(-1).setTextColor(Color.parseColor(Segmenr.ColorH));
                dialog.getButton(-3).setOnClickListener(new View.OnClickListener(context) { // from class: com.Okio.5.12
                    private final Context val$thiz;

                    {
                        this.val$thiz = context;
                    }

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        AnonymousClass5.Code.setText(((ClipboardManager) this.val$thiz.getSystemService("clipboard")).getPrimaryClip().getItemAt(0).getText().toString());
                    }
                });
                dialog.getButton(-2).setOnClickListener(new View.OnClickListener() { // from class: com.Okio.5.13
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.wmiyou.cn"));
                        intent.setFlags(268435456);
                        view.getContext().startActivity(intent);
                    }
                });
                dialog.getButton(-1).setOnClickListener(new View.OnClickListener(context) { // from class: com.Okio.5.17
                    private final Context val$thiz;

                    {
                        this.val$thiz = context;
                    }

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        if (AnonymousClass5.Code.getText().toString().isEmpty()) {
                            return;
                        }
                        Loading.show(this.val$thiz);
                        Type.Card = AnonymousClass5.Code.getText().toString();
                        CApi.Login(new CApi.CallBack(this, this.val$thiz) { // from class: com.Okio.5.17.16
                            private final AnonymousClass17 this$0;
                            private final Context val$thiz;

                            {
                                this.this$0 = this;
                                this.val$thiz = r2;
                            }

                            @Override // com.CApi.CallBack
                            public void Error(String str) {
                                ((Activity) this.val$thiz).runOnUiThread(new Runnable(this) { // from class: com.Okio.5.17.16.15
                                    private final AnonymousClass16 this$0;

                                    {
                                        this.this$0 = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public void run() {
                                        Loading.hide();
                                    }
                                });
                            }

                            @Override // com.CApi.CallBack
                            public void Result(String str) {
                                ((Activity) this.val$thiz).runOnUiThread(new Runnable(this, str, this.val$thiz) { // from class: com.Okio.5.17.16.14
                                    private final AnonymousClass16 this$0;
                                    private final String val$msg;
                                    private final Context val$thiz;

                                    {
                                        this.this$0 = this;
                                        this.val$msg = str;
                                        this.val$thiz = r3;
                                    }

                                    @Override // java.lang.Runnable
                                    public void run() {
                                        Loading.hide();
                                        if (!this.val$msg.contains("激活成功")) {
                                            mToast.Show(this.val$thiz, this.val$msg);
                                            return;
                                        }
                                        Utis.Writer(this.val$thiz, Type.Card);
                                        AnonymousClass5.dialog.dismiss();
                                        Check.run = true;
                                        mToast.Show(this.val$thiz, this.val$msg);
                                    }
                                });
                            }
                        }, AnonymousClass5.Code.getText().toString());
                    }
                });
                if (!Code.getText().toString().isEmpty()) {
                    dialog.getButton(-1).performClick();
                }
            }
        }
    }

    private Okio() {
    }

    public static Sink appendingSink(File file) throws FileNotFoundException {
        if (file == null) {
            throw new IllegalArgumentException("file == null");
        }
        return sink(new FileOutputStream(file, true));
    }

    public static Sink blackhole() {
        return new Sink() { // from class: com.Okio.3
            @Override // com.Sink, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
            }

            @Override // com.Sink, java.io.Flushable
            public void flush() throws IOException {
            }

            @Override // com.Sink
            public Timeout timeout() {
                return Timeout.NONE;
            }

            @Override // com.Sink
            public void write(Buffer buffer, long j2) throws IOException {
                buffer.skip(j2);
            }
        };
    }

    public static BufferedSink buffer(Sink sink) {
        return new RealBufferedSink(sink);
    }

    public static BufferedSource buffer(Source source) {
        return new RealBufferedSource(source);
    }

    static boolean isAndroidGetsocknameError(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    public static Sink sink(File file) throws FileNotFoundException {
        if (file == null) {
            throw new IllegalArgumentException("file == null");
        }
        return sink(new FileOutputStream(file));
    }

    public static Sink sink(OutputStream outputStream) {
        return sink(outputStream, new Timeout());
    }

    private static Sink sink(final OutputStream outputStream, final Timeout timeout) {
        if (outputStream == null) {
            throw new IllegalArgumentException("out == null");
        }
        if (timeout == null) {
            throw new IllegalArgumentException("timeout == null");
        }
        return new Sink() { // from class: com.Okio.1
            @Override // com.Sink, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                outputStream.close();
            }

            @Override // com.Sink, java.io.Flushable
            public void flush() throws IOException {
                outputStream.flush();
            }

            @Override // com.Sink
            public Timeout timeout() {
                return Timeout.this;
            }

            public String toString() {
                return "sink(" + outputStream + ")";
            }

            @Override // com.Sink
            public void write(Buffer buffer, long j2) throws IOException {
                Util.checkOffsetAndCount(buffer.size, 0L, j2);
                while (j2 > 0) {
                    Timeout.this.throwIfReached();
                    Segment segment = buffer.head;
                    int min = (int) Math.min(j2, segment.limit - segment.pos);
                    outputStream.write(segment.data, segment.pos, min);
                    segment.pos += min;
                    j2 -= min;
                    buffer.size -= min;
                    if (segment.pos == segment.limit) {
                        buffer.head = segment.pop();
                        SegmentPool.recycle(segment);
                    }
                }
            }
        };
    }

    public static Sink sink(Socket socket) throws IOException {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        }
        if (socket.getOutputStream() == null) {
            throw new IOException("socket's output stream == null");
        }
        AsyncTimeout timeout = timeout(socket);
        return timeout.sink(sink(socket.getOutputStream(), timeout));
    }

    @IgnoreJRERequirement
    public static Sink sink(Path path, OpenOption... openOptionArr) throws IOException {
        if (path == null) {
            throw new IllegalArgumentException("path == null");
        }
        return sink(Files.newOutputStream(path, openOptionArr));
    }

    public static Source source(File file) throws FileNotFoundException {
        if (file == null) {
            throw new IllegalArgumentException("file == null");
        }
        return source(new FileInputStream(file));
    }

    public static Source source(InputStream inputStream) {
        return source(inputStream, new Timeout());
    }

    private static Source source(final InputStream inputStream, final Timeout timeout) {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        }
        if (timeout == null) {
            throw new IllegalArgumentException("timeout == null");
        }
        return new Source() { // from class: com.Okio.2
            @Override // com.Source, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                inputStream.close();
            }

            @Override // com.Source
            public long read(Buffer buffer, long j2) throws IOException {
                if (j2 < 0) {
                    throw new IllegalArgumentException("byteCount < 0: " + j2);
                }
                if (j2 == 0) {
                    return 0L;
                }
                try {
                    Timeout.this.throwIfReached();
                    Segment writableSegment = buffer.writableSegment(1);
                    int read = inputStream.read(writableSegment.data, writableSegment.limit, (int) Math.min(j2, 8192 - writableSegment.limit));
                    if (read == -1) {
                        return -1L;
                    }
                    writableSegment.limit += read;
                    buffer.size += read;
                    return read;
                } catch (AssertionError e2) {
                    if (Okio.isAndroidGetsocknameError(e2)) {
                        throw new IOException(e2);
                    }
                    throw e2;
                }
            }

            @Override // com.Source
            public Timeout timeout() {
                return Timeout.this;
            }

            public String toString() {
                return "source(" + inputStream + ")";
            }
        };
    }

    public static Source source(Socket socket) throws IOException {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        }
        if (socket.getInputStream() == null) {
            throw new IOException("socket's input stream == null");
        }
        AsyncTimeout timeout = timeout(socket);
        return timeout.source(source(socket.getInputStream(), timeout));
    }

    @IgnoreJRERequirement
    public static Source source(Path path, OpenOption... openOptionArr) throws IOException {
        if (path == null) {
            throw new IllegalArgumentException("path == null");
        }
        return source(Files.newInputStream(path, openOptionArr));
    }

    private static AsyncTimeout timeout(final Socket socket) {
        return new AsyncTimeout() { // from class: com.Okio.4
            @Override // com.AsyncTimeout
            protected IOException newTimeoutException(@Nullable IOException iOException) {
                SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
                if (iOException != null) {
                    socketTimeoutException.initCause(iOException);
                }
                return socketTimeoutException;
            }

            @Override // com.AsyncTimeout
            protected void timedOut() {
                try {
                    socket.close();
                } catch (AssertionError e2) {
                    if (!Okio.isAndroidGetsocknameError(e2)) {
                        throw e2;
                    }
                    Okio.logger.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e2);
                } catch (Exception e3) {
                    Okio.logger.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e3);
                }
            }
        };
    }
}
