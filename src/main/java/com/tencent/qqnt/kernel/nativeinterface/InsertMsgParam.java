package com.tencent.qqnt.kernel.nativeinterface;

import com.tencent.qqnt.kernelpublic.nativeinterface.Contact;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/InsertMsgParam.class */
public final class InsertMsgParam {
    public int batchNums;
    public long msgId;
    public long msgSeq;
    public long msgTime;
    public int numPerTime;
    public Contact peer;
    public int timesPerBatch;

    public InsertMsgParam() {
        this.peer = new Contact();
    }

    public int getBatchNums() {
        return this.batchNums;
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

    public int getNumPerTime() {
        return this.numPerTime;
    }

    public Contact getPeer() {
        return this.peer;
    }

    public int getTimesPerBatch() {
        return this.timesPerBatch;
    }

    public String toString() {
        return "InsertMsgParam{peer=" + this.peer + ",msgTime=" + this.msgTime + ",msgId=" + this.msgId + ",msgSeq=" + this.msgSeq + ",batchNums=" + this.batchNums + ",timesPerBatch=" + this.timesPerBatch + ",numPerTime=" + this.numPerTime + ",}";
    }

    public InsertMsgParam(Contact contact, long j, long j2, long j3, int i, int i2, int i3) {
        this.peer = new Contact();
        this.peer = contact;
        this.msgTime = j;
        this.msgId = j2;
        this.msgSeq = j3;
        this.batchNums = i;
        this.timesPerBatch = i2;
        this.numPerTime = i3;
    }
}
