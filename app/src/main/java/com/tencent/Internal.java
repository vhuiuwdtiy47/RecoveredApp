package com.tencent;

import com.Address;
import com.Call;
import com.ConnectionPool;
import com.ConnectionSpec;
import com.Headers;
import com.HttpUrl;
import com.OkHttpClient;
import com.Request;
import com.Response;
import com.Route;
import com.tencent.wechat.InternalCache;
import com.tencent.wechat.RealConnection;
import com.tencent.wechat.RouteDatabase;
import com.tencent.wechat.StreamAllocation;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.UnknownHostException;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public abstract class Internal {
    public static Internal instance;

    public static void initializeInstanceForTests() {
        new OkHttpClient();
    }

    public abstract void addLenient(Headers.Builder builder, String str);

    public abstract void addLenient(Headers.Builder builder, String str, String str2);

    public abstract void apply(ConnectionSpec connectionSpec, SSLSocket sSLSocket, boolean z2);

    public abstract int code(Response.Builder builder);

    public abstract boolean connectionBecameIdle(ConnectionPool connectionPool, RealConnection realConnection);

    public abstract Socket deduplicate(ConnectionPool connectionPool, Address address, StreamAllocation streamAllocation);

    public abstract boolean equalsNonHost(Address address, Address address2);

    public abstract RealConnection get(ConnectionPool connectionPool, Address address, StreamAllocation streamAllocation, Route route);

    public abstract HttpUrl getHttpUrlChecked(String str) throws MalformedURLException, UnknownHostException;

    public abstract Call newWebSocketCall(OkHttpClient okHttpClient, Request request);

    public abstract void put(ConnectionPool connectionPool, RealConnection realConnection);

    public abstract RouteDatabase routeDatabase(ConnectionPool connectionPool);

    public abstract void setCache(OkHttpClient.Builder builder, InternalCache internalCache);

    public abstract StreamAllocation streamAllocation(Call call);
}
