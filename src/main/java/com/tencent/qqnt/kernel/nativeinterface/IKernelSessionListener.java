package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/IKernelSessionListener.class */
public interface IKernelSessionListener {
    void onNTSessionCreate(int i, String str);

    void onOpentelemetryInit(OpentelemetryInit opentelemetryInit);

    void onSessionInitComplete(int i, String str, String str2);

    void onUserOnlineResult(int i, String str, RegisterRes registerRes);
}
