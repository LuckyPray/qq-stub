package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/C2cMsgInfo.class */
public final class C2cMsgInfo {
    public Integer msgRandom;
    public Integer msgSeq;
    public Integer msgTime;

    public C2cMsgInfo() {
    }

    public Integer getMsgRandom() {
        return this.msgRandom;
    }

    public Integer getMsgSeq() {
        return this.msgSeq;
    }

    public Integer getMsgTime() {
        return this.msgTime;
    }

    public String toString() {
        return "C2cMsgInfo{msgSeq=" + this.msgSeq + ",msgTime=" + this.msgTime + ",msgRandom=" + this.msgRandom + ",}";
    }

    public C2cMsgInfo(Integer num, Integer num2, Integer num3) {
        this.msgSeq = num;
        this.msgTime = num2;
        this.msgRandom = num3;
    }
}
