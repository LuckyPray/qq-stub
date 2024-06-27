package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/MultiMsgInfo.class */
public final class MultiMsgInfo {
    public long msgId;
    public String senderShowName;

    public MultiMsgInfo() {
    }

    public long getMsgId() {
        return this.msgId;
    }

    public String getSenderShowName() {
        return this.senderShowName;
    }

    public String toString() {
        return "MultiMsgInfo{msgId=" + this.msgId + ",senderShowName=" + this.senderShowName + ",}";
    }

    public MultiMsgInfo(long j, String str) {
        this.msgId = j;
        this.senderShowName = str;
    }
}
