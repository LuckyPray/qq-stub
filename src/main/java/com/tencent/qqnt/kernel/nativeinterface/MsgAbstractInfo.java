package com.tencent.qqnt.kernel.nativeinterface;

import com.tencent.qqnt.kernelpublic.nativeinterface.MsgAbstract;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/MsgAbstractInfo.class */
public final class MsgAbstractInfo {
    public MsgAbstract msgAbs;
    public long msgId;
    public long msgSeq;
    public long msgTime;

    public MsgAbstractInfo() {
        this.msgAbs = new MsgAbstract();
    }

    public MsgAbstract getMsgAbs() {
        return this.msgAbs;
    }

    public long getMsgId() {
        return this.msgId;
    }

    public long getMsgSeq() {
        return this.msgSeq;
    }

    public long getMsgTime() {
        return this.msgTime;
    }

    public String toString() {
        return "MsgAbstractInfo{msgId=" + this.msgId + ",msgSeq=" + this.msgSeq + ",msgTime=" + this.msgTime + ",msgAbs=" + this.msgAbs + ",}";
    }

    public MsgAbstractInfo(long j, long j2, long j3, MsgAbstract msgAbstract) {
        this.msgAbs = new MsgAbstract();
        this.msgId = j;
        this.msgSeq = j2;
        this.msgTime = j3;
        this.msgAbs = msgAbstract;
    }
}
