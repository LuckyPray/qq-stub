package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GroupBulletinListReq.class */
public final class GroupBulletinListReq {
    public int needInstructionsForJoinGroup;
    public int needPublisherInfo;
    public int num;
    public int startIndex;

    public int getNeedInstructionsForJoinGroup() {
        return this.needInstructionsForJoinGroup;
    }

    public int getNeedPublisherInfo() {
        return this.needPublisherInfo;
    }

    public int getNum() {
        return this.num;
    }

    public int getStartIndex() {
        return this.startIndex;
    }

    public String toString() {
        return "GroupBulletinListReq{startIndex=" + this.startIndex + ",num=" + this.num + ",needInstructionsForJoinGroup=" + this.needInstructionsForJoinGroup + ",needPublisherInfo=" + this.needPublisherInfo + ",}";
    }
}
