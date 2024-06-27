package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/ChatInfo.class */
public final class ChatInfo {
    public int chatType;
    public String peerUid;

    public ChatInfo() {
        this.peerUid = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public int getChatType() {
        return this.chatType;
    }

    public String getPeerUid() {
        return this.peerUid;
    }

    public String toString() {
        return "ChatInfo{chatType=" + this.chatType + ",peerUid=" + this.peerUid + ",}";
    }

    public ChatInfo(int i, String str) {
        this.peerUid = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.chatType = i;
        this.peerUid = str;
    }
}
