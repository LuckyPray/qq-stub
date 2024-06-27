package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/ITempChatSigListener.class */
public interface ITempChatSigListener {
    byte[] getTempChatSig(int i, String str);

    void onRecvTempChatSig(int i, String str, byte[] bArr);
}
