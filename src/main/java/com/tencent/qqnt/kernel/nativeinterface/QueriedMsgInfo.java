package com.tencent.qqnt.kernel.nativeinterface;

import com.tencent.qqnt.kernelpublic.nativeinterface.MsgAbstract;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/QueriedMsgInfo.class */
public final class QueriedMsgInfo {
    public MsgAbstract msgAbstract;
    public MsgRecord msgRecord;

    public QueriedMsgInfo() {
        this.msgRecord = new MsgRecord();
        this.msgAbstract = new MsgAbstract();
    }

    public MsgAbstract getMsgAbstract() {
        return this.msgAbstract;
    }

    public MsgRecord getMsgRecord() {
        return this.msgRecord;
    }

    public String toString() {
        return "QueriedMsgInfo{msgRecord=" + this.msgRecord + ",msgAbstract=" + this.msgAbstract + ",}";
    }

    public QueriedMsgInfo(MsgRecord msgRecord, MsgAbstract msgAbstract) {
        this.msgRecord = new MsgRecord();
        this.msgAbstract = new MsgAbstract();
        this.msgRecord = msgRecord;
        this.msgAbstract = msgAbstract;
    }
}
