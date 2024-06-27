package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/QuerySubscribeMsgTemplateStatusReq.class */
public final class QuerySubscribeMsgTemplateStatusReq {
    public long groupId;
    public long guildId;
    public int pageNum;
    public long robotUin;
    public int start;

    public QuerySubscribeMsgTemplateStatusReq() {
    }

    public long getGroupId() {
        return this.groupId;
    }

    public long getGuildId() {
        return this.guildId;
    }

    public int getPageNum() {
        return this.pageNum;
    }

    public long getRobotUin() {
        return this.robotUin;
    }

    public int getStart() {
        return this.start;
    }

    public String toString() {
        return "QuerySubscribeMsgTemplateStatusReq{groupId=" + this.groupId + ",guildId=" + this.guildId + ",robotUin=" + this.robotUin + ",start=" + this.start + ",pageNum=" + this.pageNum + ",}";
    }

    public QuerySubscribeMsgTemplateStatusReq(long j, long j2, long j3, int i, int i2) {
        this.groupId = j;
        this.guildId = j2;
        this.robotUin = j3;
        this.start = i;
        this.pageNum = i2;
    }
}
