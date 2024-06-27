package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GroupMsgMaskInfo.class */
public final class GroupMsgMaskInfo {
    public long groupCode;
    public GroupMsgMask msgMask = GroupMsgMask.values()[0];

    public long getGroupCode() {
        return this.groupCode;
    }

    public GroupMsgMask getMsgMask() {
        return this.msgMask;
    }

    public String toString() {
        return "GroupMsgMaskInfo{groupCode=" + this.groupCode + ",msgMask=" + this.msgMask + ",}";
    }
}
