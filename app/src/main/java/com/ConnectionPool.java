package com;

import com.tencent.wechat.Platform;
import com.tencent.wechat.RealConnection;
import com.tencent.wechat.RouteDatabase;
import com.tencent.wechat.StreamAllocation;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class ConnectionPool {
    static final /* synthetic */ boolean $assertionsDisabled;
    private static final Executor executor;
    private final Runnable cleanupRunnable;
    boolean cleanupRunning;
    private final Deque<RealConnection> connections;
    private final long keepAliveDurationNs;
    private final int maxIdleConnections;
    final RouteDatabase routeDatabase;

    static {
        $assertionsDisabled = !ConnectionPool.class.desiredAssertionStatus();
        executor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), com.tencent.Util.threadFactory("OkHttp ConnectionPool", true));
    }

    public ConnectionPool() {
        this(5, 5L, TimeUnit.MINUTES);
    }

    public ConnectionPool(int i, long j2, TimeUnit timeUnit) {
        this.cleanupRunnable = new Runnable() { // from class: com.ConnectionPool.1
            @Override // java.lang.Runnable
            public void run() {
                while (true) {
                    long cleanup = ConnectionPool.this.cleanup(System.nanoTime());
                    if (cleanup == -1) {
                        return;
                    }
                    if (cleanup > 0) {
                        long j3 = cleanup / 1000000;
                        long j4 = cleanup - (j3 * 1000000);
                        synchronized (ConnectionPool.this) {
                            try {
                                ConnectionPool.this.wait(j3, (int) j4);
                            } catch (InterruptedException e2) {
                            }
                        }
                    }
                }
            }
        };
        this.connections = new ArrayDeque();
        this.routeDatabase = new RouteDatabase();
        this.maxIdleConnections = i;
        this.keepAliveDurationNs = timeUnit.toNanos(j2);
        if (j2 <= 0) {
            throw new IllegalArgumentException("keepAliveDuration <= 0: " + j2);
        }
    }

    private int pruneAndGetAllocationCount(RealConnection realConnection, long j2) {
        List<Reference<StreamAllocation>> list = realConnection.allocations;
        int i = 0;
        while (i < list.size()) {
            Reference<StreamAllocation> reference = list.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                Platform.get().logCloseableLeak("A connection to " + realConnection.route().address().url() + " was leaked. Did you forget to close a response body?", ((StreamAllocation.StreamAllocationReference) reference).callStackTrace);
                list.remove(i);
                realConnection.noNewStreams = true;
                if (list.isEmpty()) {
                    realConnection.idleAtNanos = j2 - this.keepAliveDurationNs;
                    return 0;
                }
            }
        }
        return list.size();
    }

    long cleanup(long j2) {
        long j3;
        RealConnection realConnection;
        RealConnection realConnection2 = null;
        long j4 = Long.MIN_VALUE;
        synchronized (this) {
            int i = 0;
            int i2 = 0;
            for (RealConnection realConnection3 : this.connections) {
                if (pruneAndGetAllocationCount(realConnection3, j2) > 0) {
                    i2++;
                } else {
                    int i3 = i + 1;
                    long j5 = j2 - realConnection3.idleAtNanos;
                    if (j5 > j4) {
                        realConnection = realConnection3;
                        j3 = j5;
                    } else {
                        j3 = j4;
                        realConnection = realConnection2;
                    }
                    j4 = j3;
                    realConnection2 = realConnection;
                    i = i3;
                }
            }
            if (j4 >= this.keepAliveDurationNs || i > this.maxIdleConnections) {
                this.connections.remove(realConnection2);
                com.tencent.Util.closeQuietly(realConnection2.socket());
                return 0L;
            }
            if (i > 0) {
                return this.keepAliveDurationNs - j4;
            }
            if (i2 > 0) {
                return this.keepAliveDurationNs;
            }
            this.cleanupRunning = false;
            return -1L;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean connectionBecameIdle(RealConnection realConnection) {
        if (!$assertionsDisabled && !Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        if (realConnection.noNewStreams || this.maxIdleConnections == 0) {
            this.connections.remove(realConnection);
            return true;
        }
        notifyAll();
        return false;
    }

    public synchronized int connectionCount() {
        return this.connections.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Socket deduplicate(Address address, StreamAllocation streamAllocation) {
        if (!$assertionsDisabled && !Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        for (RealConnection realConnection : this.connections) {
            if (realConnection.isEligible(address, null) && realConnection.isMultiplexed() && realConnection != streamAllocation.connection()) {
                return streamAllocation.releaseAndAcquire(realConnection);
            }
        }
        return null;
    }

    public void evictAll() {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator<RealConnection> it = this.connections.iterator();
            while (it.hasNext()) {
                RealConnection next = it.next();
                if (next.allocations.isEmpty()) {
                    next.noNewStreams = true;
                    arrayList.add(next);
                    it.remove();
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            com.tencent.Util.closeQuietly(((RealConnection) it2.next()).socket());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RealConnection get(Address address, StreamAllocation streamAllocation, Route route) {
        if (!$assertionsDisabled && !Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        for (RealConnection realConnection : this.connections) {
            if (realConnection.isEligible(address, route)) {
                streamAllocation.acquire(realConnection);
                return realConnection;
            }
        }
        return null;
    }

    public synchronized int idleConnectionCount() {
        int i;
        i = 0;
        Iterator<RealConnection> it = this.connections.iterator();
        while (it.hasNext()) {
            i = it.next().allocations.isEmpty() ? i + 1 : i;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void put(RealConnection realConnection) {
        if (!$assertionsDisabled && !Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        if (!this.cleanupRunning) {
            this.cleanupRunning = true;
            executor.execute(this.cleanupRunnable);
        }
        this.connections.add(realConnection);
    }
}
