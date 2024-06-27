package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/MsgStatus.class */
public final class MsgStatus {
    public long msgPushStatus;

    public MsgStatus() {
    }

    public long getMsgPushStatus() {
        return this.msgPushStatus;
    }

    public String toString() {
        return "MsgStatus{msgPushStatus=" + this.msgPushStatus + ",}";
    }

    public MsgStatus(long j) {
        this.msgPushStatus = j;
    }
}
