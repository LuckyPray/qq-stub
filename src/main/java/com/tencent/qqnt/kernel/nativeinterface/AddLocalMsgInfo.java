package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/AddLocalMsgInfo.class */
public final class AddLocalMsgInfo {
    public long cliSeq;
    public long msgId;
    public long msgRandom;
    public long msgSeq;
    public long msgTime;

    public AddLocalMsgInfo() {
    }

    public long getCliSeq() {
        return this.cliSeq;
    }

    public long getMsgId() {
        return this.msgId;
    }

    public long getMsgRandom() {
        return this.msgRandom;
    }

    public long getMsgSeq() {
        return this.msgSeq;
    }

    public long getMsgTime() {
        return this.msgTime;
    }

    public String toString() {
        return "AddLocalMsgInfo{msgId=" + this.msgId + ",msgSeq=" + this.msgSeq + ",cliSeq=" + this.cliSeq + ",msgTime=" + this.msgTime + ",msgRandom=" + this.msgRandom + ",}";
    }

    public AddLocalMsgInfo(long j, long j2, long j3, long j4, long j5) {
        this.msgId = j;
        this.msgSeq = j2;
        this.cliSeq = j3;
        this.msgTime = j4;
        this.msgRandom = j5;
    }
}
