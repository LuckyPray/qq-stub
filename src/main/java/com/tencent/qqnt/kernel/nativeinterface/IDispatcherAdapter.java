package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/IDispatcherAdapter.class */
public interface IDispatcherAdapter {
    void dispatchCall(int i, byte[] bArr);

    void dispatchCallWithJson(int i, String str);

    void dispatchRequest(long j, int i, byte[] bArr);
}
