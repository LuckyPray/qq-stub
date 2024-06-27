package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/MsgBoxNecessaryMsgInfo.class */
public final class MsgBoxNecessaryMsgInfo {
    public String highlightDigest;
    public long msgSeq;
    public long msgTime;

    public MsgBoxNecessaryMsgInfo() {
        this.highlightDigest = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public String getHighlightDigest() {
        return this.highlightDigest;
    }

    public long getMsgSeq() {
        return this.msgSeq;
    }

    public long getMsgTime() {
        return this.msgTime;
    }

    public String toString() {
        return "MsgBoxNecessaryMsgInfo{msgSeq=" + this.msgSeq + ",msgTime=" + this.msgTime + ",highlightDigest=" + this.highlightDigest + ",}";
    }

    public MsgBoxNecessaryMsgInfo(long j, long j2, String str) {
        this.highlightDigest = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.msgSeq = j;
        this.msgTime = j2;
        this.highlightDigest = str;
    }
}
