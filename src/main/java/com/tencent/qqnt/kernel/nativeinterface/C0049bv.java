package com.tencent.qqnt.kernel.nativeinterface;

import com.tencent.qqnt.kernel.nativeinterface.IQQNTWrapperSession;

/* compiled from: IQQNTWrapperSession.java */
/* renamed from: com.tencent.qqnt.kernel.nativeinterface.bv */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/bv.class */
public final /* synthetic */ class C0049bv {
    public static void $default$close(IQQNTWrapperSession iQQNTWrapperSession, String str) {
    }

    public static void $default$disableIpDirect(IQQNTWrapperSession iQQNTWrapperSession, boolean z) {
    }

    public static void $default$init(IQQNTWrapperSession iQQNTWrapperSession, InitSessionConfig initSessionConfig, IDependsAdapter iDependsAdapter, IDispatcherAdapter iDispatcherAdapter, IKernelSessionListener iKernelSessionListener) {
    }

    public static void $default$offLine(IQQNTWrapperSession iQQNTWrapperSession, UnregisterInfo unregisterInfo, IOperateCallback iOperateCallback) {
    }

    public static void $default$onDispatchPush(IQQNTWrapperSession iQQNTWrapperSession, int i, byte[] bArr) {
    }

    public static void $default$onDispatchPushWithJson(IQQNTWrapperSession iQQNTWrapperSession, int i, String str) {
    }

    public static void $default$onDispatchRequestReply(IQQNTWrapperSession iQQNTWrapperSession, long j, int i, byte[] bArr) {
    }

    public static void $default$onLine(IQQNTWrapperSession iQQNTWrapperSession, RegisterInfo registerInfo) {
    }

    public static void $default$onMsfPush(IQQNTWrapperSession iQQNTWrapperSession, String str, byte[] bArr, PushExtraInfo pushExtraInfo) {
    }

    public static void $default$onNetReply(IQQNTWrapperSession iQQNTWrapperSession, long j, int i, String str, byte[] bArr) {
    }

    public static void $default$onSendOidbReply(IQQNTWrapperSession iQQNTWrapperSession, long j, int i, int i2, String str, MsfRspInfo msfRspInfo) {
    }

    public static void $default$onSendSSOReply(IQQNTWrapperSession iQQNTWrapperSession, long j, String str, int i, String str2, MsfRspInfo msfRspInfo) {
    }

    public static void $default$onUIConfigUpdate(IQQNTWrapperSession iQQNTWrapperSession, UIConfig uIConfig, String str) {
    }

    public static void $default$setOnMsfStatusChanged(IQQNTWrapperSession iQQNTWrapperSession, MsfStatusType msfStatusType, MsfChangeReasonType msfChangeReasonType, int i) {
    }

    public static void $default$setOnNetworkChanged(IQQNTWrapperSession iQQNTWrapperSession, NetStatusType netStatusType) {
    }

    public static void $default$setOnWeakNetChanged(IQQNTWrapperSession iQQNTWrapperSession, boolean z) {
    }

    public static void $default$switchToBackGround(IQQNTWrapperSession iQQNTWrapperSession) {
    }

    public static void $default$switchToFront(IQQNTWrapperSession iQQNTWrapperSession) {
    }

    public static void $default$updateTicket(IQQNTWrapperSession iQQNTWrapperSession, SessionTicket sessionTicket) {
    }

    /* renamed from: a */
    public static IQQNTWrapperSession m3a(String str) {
        return IQQNTWrapperSession.CppProxy.getNTWrapperSession(str);
    }
}
