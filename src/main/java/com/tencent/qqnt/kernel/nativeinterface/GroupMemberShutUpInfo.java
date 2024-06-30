package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GroupMemberShutUpInfo.class */
public final class GroupMemberShutUpInfo {
    public int timeStamp;
    public String uid = "";

    public int getTimeStamp() {
        return this.timeStamp;
    }

    public String getUid() {
        return this.uid;
    }

    public String toString() {
        return "GroupMemberShutUpInfo{uid=" + this.uid + ",timeStamp=" + this.timeStamp + ",}";
    }
}
