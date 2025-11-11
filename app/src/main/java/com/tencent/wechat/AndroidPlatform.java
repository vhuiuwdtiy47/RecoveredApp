package com.tencent.wechat;

import android.util.Log;
import com.Protocol;
import com.tencent.Util;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class AndroidPlatform extends Platform {
    private static final int MAX_LOG_LENGTH = 4000;
    private final CloseGuard closeGuard = CloseGuard.get();
    private final OptionalMethod<Socket> getAlpnSelectedProtocol;
    private final OptionalMethod<Socket> setAlpnProtocols;
    private final OptionalMethod<Socket> setHostname;
    private final OptionalMethod<Socket> setUseSessionTickets;
    private final Class<?> sslParametersClass;

    /* loaded from: classes.dex */
    static final class AndroidCertificateChainCleaner extends CertificateChainCleaner {
        private final Method checkServerTrusted;
        private final Object x509TrustManagerExtensions;

        AndroidCertificateChainCleaner(Object obj, Method method) {
            this.x509TrustManagerExtensions = obj;
            this.checkServerTrusted = method;
        }

        @Override // com.tencent.wechat.CertificateChainCleaner
        public List<Certificate> clean(List<Certificate> list, String str) throws SSLPeerUnverifiedException {
            try {
                return (List) this.checkServerTrusted.invoke(this.x509TrustManagerExtensions, (X509Certificate[]) list.toArray(new X509Certificate[list.size()]), "RSA", str);
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            } catch (InvocationTargetException e3) {
                SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e3.getMessage());
                sSLPeerUnverifiedException.initCause(e3);
                throw sSLPeerUnverifiedException;
            }
        }

        public boolean equals(Object obj) {
            return obj instanceof AndroidCertificateChainCleaner;
        }

        public int hashCode() {
            return 0;
        }
    }

    /* loaded from: classes.dex */
    static final class CloseGuard {
        private final Method getMethod;
        private final Method openMethod;
        private final Method warnIfOpenMethod;

        CloseGuard(Method method, Method method2, Method method3) {
            this.getMethod = method;
            this.openMethod = method2;
            this.warnIfOpenMethod = method3;
        }

        static CloseGuard get() {
            Method method;
            Method method2;
            Method method3 = null;
            try {
                Class<?> cls = Class.forName("dalvik.system.CloseGuard");
                method2 = cls.getMethod("get", new Class[0]);
                method = cls.getMethod("open", String.class);
                method3 = cls.getMethod("warnIfOpen", new Class[0]);
            } catch (Exception e2) {
                method = null;
                method2 = null;
            }
            return new CloseGuard(method2, method, method3);
        }

        Object createAndOpen(String str) {
            if (this.getMethod != null) {
                try {
                    Object invoke = this.getMethod.invoke(null, new Object[0]);
                    this.openMethod.invoke(invoke, str);
                    return invoke;
                } catch (Exception e2) {
                }
            }
            return null;
        }

        boolean warnIfOpen(Object obj) {
            if (obj == null) {
                return false;
            }
            try {
                this.warnIfOpenMethod.invoke(obj, new Object[0]);
                return true;
            } catch (Exception e2) {
                return false;
            }
        }
    }

    public AndroidPlatform(Class<?> cls, OptionalMethod<Socket> optionalMethod, OptionalMethod<Socket> optionalMethod2, OptionalMethod<Socket> optionalMethod3, OptionalMethod<Socket> optionalMethod4) {
        this.sslParametersClass = cls;
        this.setUseSessionTickets = optionalMethod;
        this.setHostname = optionalMethod2;
        this.getAlpnSelectedProtocol = optionalMethod3;
        this.setAlpnProtocols = optionalMethod4;
    }

    public static Platform buildIfSupported() {
        Class<?> cls;
        OptionalMethod optionalMethod;
        OptionalMethod optionalMethod2;
        OptionalMethod optionalMethod3;
        try {
            try {
                cls = Class.forName("com.android.org.conscrypt.SSLParametersImpl");
            } catch (ClassNotFoundException e2) {
                cls = Class.forName("org.apache.harmony.xnet.provider.jsse.SSLParametersImpl");
            }
            OptionalMethod optionalMethod4 = new OptionalMethod(null, "setUseSessionTickets", Boolean.TYPE);
            OptionalMethod optionalMethod5 = new OptionalMethod(null, "setHostname", String.class);
            try {
                Class.forName("android.net.Network");
                optionalMethod = new OptionalMethod(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
            } catch (ClassNotFoundException e3) {
                optionalMethod = null;
            }
            try {
                optionalMethod2 = new OptionalMethod(null, "setAlpnProtocols", byte[].class);
                optionalMethod3 = optionalMethod;
            } catch (ClassNotFoundException e4) {
                optionalMethod2 = null;
                optionalMethod3 = optionalMethod;
                return new AndroidPlatform(cls, optionalMethod4, optionalMethod5, optionalMethod3, optionalMethod2);
            }
            return new AndroidPlatform(cls, optionalMethod4, optionalMethod5, optionalMethod3, optionalMethod2);
        } catch (ClassNotFoundException e5) {
            return null;
        }
    }

    @Override // com.tencent.wechat.Platform
    public CertificateChainCleaner buildCertificateChainCleaner(X509TrustManager x509TrustManager) {
        try {
            Class<?> cls = Class.forName("android.net.http.X509TrustManagerExtensions");
            return new AndroidCertificateChainCleaner(cls.getConstructor(X509TrustManager.class).newInstance(x509TrustManager), cls.getMethod("checkServerTrusted", X509Certificate[].class, String.class, String.class));
        } catch (Exception e2) {
            return super.buildCertificateChainCleaner(x509TrustManager);
        }
    }

    @Override // com.tencent.wechat.Platform
    public void configureTlsExtensions(SSLSocket sSLSocket, String str, List<Protocol> list) {
        if (str != null) {
            this.setUseSessionTickets.invokeOptionalWithoutCheckedException(sSLSocket, true);
            this.setHostname.invokeOptionalWithoutCheckedException(sSLSocket, str);
        }
        if (this.setAlpnProtocols == null || !this.setAlpnProtocols.isSupported(sSLSocket)) {
            return;
        }
        this.setAlpnProtocols.invokeWithoutCheckedException(sSLSocket, concatLengthPrefixed(list));
    }

    @Override // com.tencent.wechat.Platform
    public void connectSocket(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        try {
            socket.connect(inetSocketAddress, i);
        } catch (AssertionError e2) {
            if (!Util.isAndroidGetsocknameError(e2)) {
                throw e2;
            }
            throw new IOException(e2);
        } catch (SecurityException e3) {
            IOException iOException = new IOException("Exception in connect");
            iOException.initCause(e3);
            throw iOException;
        }
    }

    @Override // com.tencent.wechat.Platform
    public String getSelectedProtocol(SSLSocket sSLSocket) {
        if (this.getAlpnSelectedProtocol == null || !this.getAlpnSelectedProtocol.isSupported(sSLSocket)) {
            return null;
        }
        byte[] bArr = (byte[]) this.getAlpnSelectedProtocol.invokeWithoutCheckedException(sSLSocket, new Object[0]);
        return bArr != null ? new String(bArr, Util.UTF_8) : null;
    }

    @Override // com.tencent.wechat.Platform
    public Object getStackTraceForCloseable(String str) {
        return this.closeGuard.createAndOpen(str);
    }

    @Override // com.tencent.wechat.Platform
    public boolean isCleartextTrafficPermitted(String str) {
        try {
            Class<?> cls = Class.forName("android.security.NetworkSecurityPolicy");
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", String.class).invoke(cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]), str)).booleanValue();
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            return super.isCleartextTrafficPermitted(str);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e3) {
            throw new AssertionError();
        }
    }

    @Override // com.tencent.wechat.Platform
    public void log(int i, String str, Throwable th) {
        int min;
        int i2 = i == 5 ? 5 : 3;
        if (th != null) {
            str = str + '\n' + Log.getStackTraceString(th);
        }
        int i3 = 0;
        int length = str.length();
        while (i3 < length) {
            int indexOf = str.indexOf(10, i3);
            if (indexOf == -1) {
                indexOf = length;
            }
            while (true) {
                min = Math.min(indexOf, i3 + MAX_LOG_LENGTH);
                Log.println(i2, "OkHttp", str.substring(i3, min));
                if (min >= indexOf) {
                    break;
                } else {
                    i3 = min;
                }
            }
            i3 = min + 1;
        }
    }

    @Override // com.tencent.wechat.Platform
    public void logCloseableLeak(String str, Object obj) {
        if (this.closeGuard.warnIfOpen(obj)) {
            return;
        }
        log(5, str, null);
    }

    @Override // com.tencent.wechat.Platform
    public X509TrustManager trustManager(SSLSocketFactory sSLSocketFactory) {
        Object readFieldOrNull;
        Object readFieldOrNull2 = readFieldOrNull(sSLSocketFactory, this.sslParametersClass, "sslParameters");
        if (readFieldOrNull2 == null) {
            try {
                readFieldOrNull = readFieldOrNull(sSLSocketFactory, Class.forName("com.google.android.gms.org.conscrypt.SSLParametersImpl", false, sSLSocketFactory.getClass().getClassLoader()), "sslParameters");
            } catch (ClassNotFoundException e2) {
                return super.trustManager(sSLSocketFactory);
            }
        } else {
            readFieldOrNull = readFieldOrNull2;
        }
        X509TrustManager x509TrustManager = (X509TrustManager) readFieldOrNull(readFieldOrNull, X509TrustManager.class, "x509TrustManager");
        return x509TrustManager != null ? x509TrustManager : (X509TrustManager) readFieldOrNull(readFieldOrNull, X509TrustManager.class, "trustManager");
    }
}
