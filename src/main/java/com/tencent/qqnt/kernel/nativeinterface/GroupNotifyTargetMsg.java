package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GroupNotifyTargetMsg.class */
public final class GroupNotifyTargetMsg {
    public long groupCode;
    public String postscript;
    public long seq;
    public GroupNotifyMsgType type;

    public GroupNotifyTargetMsg() {
        this.type = GroupNotifyMsgType.values()[0];
        this.postscript = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public long getGroupCode() {
        return this.groupCode;
    }

    public String getPostscript() {
        return this.postscript;
    }

    public long getSeq() {
        return this.seq;
    }

    public GroupNotifyMsgType getType() {
        return this.type;
    }

    public String toString() {
        return "GroupNotifyTargetMsg{seq=" + this.seq + ",type=" + this.type + ",groupCode=" + this.groupCode + ",postscript=" + this.postscript + ",}";
    }

    public GroupNotifyTargetMsg(long j, GroupNotifyMsgType groupNotifyMsgType, long j2, String str) {
        this.type = GroupNotifyMsgType.values()[0];
        this.postscript = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.seq = j;
        this.type = groupNotifyMsgType;
        this.groupCode = j2;
        this.postscript = str;
    }
}
