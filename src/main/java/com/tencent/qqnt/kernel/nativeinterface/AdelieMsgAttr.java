package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/AdelieMsgAttr.class */
public final class AdelieMsgAttr {
    public long msgDirection;
    public long msgPushStatus;

    public AdelieMsgAttr() {
    }

    public long getMsgDirection() {
        return this.msgDirection;
    }

    public long getMsgPushStatus() {
        return this.msgPushStatus;
    }

    public String toString() {
        return "AdelieMsgAttr{msgPushStatus=" + this.msgPushStatus + ",msgDirection=" + this.msgDirection + ",}";
    }

    public AdelieMsgAttr(long j, long j2) {
        this.msgPushStatus = j;
        this.msgDirection = j2;
    }
}
