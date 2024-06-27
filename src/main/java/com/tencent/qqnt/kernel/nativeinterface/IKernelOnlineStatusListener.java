package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/IKernelOnlineStatusListener.class */
public interface IKernelOnlineStatusListener {
    void onRecvLikeStatusResultAfterGetAggregation(int i, String str, OSCheckLikeRsp oSCheckLikeRsp);

    void onRecvOnlineStatusPraisePush(OSGetLikeListRsp oSGetLikeListRsp);
}
