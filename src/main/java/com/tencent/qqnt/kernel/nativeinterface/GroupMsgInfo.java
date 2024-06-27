package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GroupMsgInfo.class */
public final class GroupMsgInfo {
    public Integer msgSeq;

    public GroupMsgInfo() {
    }

    public Integer getMsgSeq() {
        return this.msgSeq;
    }

    public String toString() {
        return "GroupMsgInfo{msgSeq=" + this.msgSeq + ",}";
    }

    public GroupMsgInfo(Integer num) {
        this.msgSeq = num;
    }
}
