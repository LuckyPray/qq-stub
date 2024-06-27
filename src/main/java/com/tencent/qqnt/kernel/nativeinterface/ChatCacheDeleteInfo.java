package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/ChatCacheDeleteInfo.class */
public final class ChatCacheDeleteInfo {
    public long chatSize;
    public int chatType;
    public String uid;

    public ChatCacheDeleteInfo() {
        this.uid = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public long getChatSize() {
        return this.chatSize;
    }

    public int getChatType() {
        return this.chatType;
    }

    public String getUid() {
        return this.uid;
    }

    public String toString() {
        return "ChatCacheDeleteInfo{chatType=" + this.chatType + ",chatSize=" + this.chatSize + ",uid=" + this.uid + ",}";
    }

    public ChatCacheDeleteInfo(int i, long j, String str) {
        this.uid = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.chatType = i;
        this.chatSize = j;
        this.uid = str;
    }
}
