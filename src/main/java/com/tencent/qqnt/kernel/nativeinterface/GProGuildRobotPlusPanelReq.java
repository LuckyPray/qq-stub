package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GProGuildRobotPlusPanelReq.class */
public final class GProGuildRobotPlusPanelReq {
    public long channelId;
    public GProGuildRobotClientInfo clientInfo;
    public int filter;
    public long guildId;
    public int page;
    public int pageSize;

    public GProGuildRobotPlusPanelReq() {
        this.clientInfo = new GProGuildRobotClientInfo();
    }

    public long getChannelId() {
        return this.channelId;
    }

    public GProGuildRobotClientInfo getClientInfo() {
        return this.clientInfo;
    }

    public int getFilter() {
        return this.filter;
    }

    public long getGuildId() {
        return this.guildId;
    }

    public int getPage() {
        return this.page;
    }

    public int getPageSize() {
        return this.pageSize;
    }

    public String toString() {
        return "GProGuildRobotPlusPanelReq{guildId=" + this.guildId + ",channelId=" + this.channelId + ",filter=" + this.filter + ",page=" + this.page + ",clientInfo=" + this.clientInfo + ",pageSize=" + this.pageSize + ",}";
    }

    public GProGuildRobotPlusPanelReq(long j, long j2, int i, int i2, GProGuildRobotClientInfo gProGuildRobotClientInfo, int i3) {
        this.clientInfo = new GProGuildRobotClientInfo();
        this.guildId = j;
        this.channelId = j2;
        this.filter = i;
        this.page = i2;
        this.clientInfo = gProGuildRobotClientInfo;
        this.pageSize = i3;
    }
}
