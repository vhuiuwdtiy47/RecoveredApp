package com;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public interface Dns {
    public static final Dns SYSTEM = new Dns() { // from class: com.Dns.1
        @Override // com.Dns
        public List<InetAddress> lookup(String str) throws UnknownHostException {
            if (str == null) {
                throw new UnknownHostException("hostname == null");
            }
            return Arrays.asList(InetAddress.getAllByName(str));
        }
    };

    List<InetAddress> lookup(String str) throws UnknownHostException;
}
