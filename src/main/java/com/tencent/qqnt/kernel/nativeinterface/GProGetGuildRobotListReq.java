package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GProGetGuildRobotListReq.class */
public final class GProGetGuildRobotListReq {
    public ArrayList<Long> cardRecommendUins;
    public long channelId;
    public GProGuildRobotClientInfo clientInfo;
    public GProGetGuildRobotListFilter filter;
    public long guildId;
    public int num;
    public int start;

    public GProGetGuildRobotListReq() {
        this.filter = new GProGetGuildRobotListFilter();
        this.clientInfo = new GProGuildRobotClientInfo();
        this.cardRecommendUins = new ArrayList<>();
    }

    public ArrayList<Long> getCardRecommendUins() {
        return this.cardRecommendUins;
    }

    public long getChannelId() {
        return this.channelId;
    }

    public GProGuildRobotClientInfo getClientInfo() {
        return this.clientInfo;
    }

    public GProGetGuildRobotListFilter getFilter() {
        return this.filter;
    }

    public long getGuildId() {
        return this.guildId;
    }

    public int getNum() {
        return this.num;
    }

    public int getStart() {
        return this.start;
    }

    public String toString() {
        return "GProGetGuildRobotListReq{guildId=" + this.guildId + ",start=" + this.start + ",num=" + this.num + ",filter=" + this.filter + ",channelId=" + this.channelId + ",clientInfo=" + this.clientInfo + ",cardRecommendUins=" + this.cardRecommendUins + ",}";
    }

    public GProGetGuildRobotListReq(long j, int i, int i2, GProGetGuildRobotListFilter gProGetGuildRobotListFilter, long j2, GProGuildRobotClientInfo gProGuildRobotClientInfo, ArrayList<Long> arrayList) {
        this.filter = new GProGetGuildRobotListFilter();
        this.clientInfo = new GProGuildRobotClientInfo();
        this.cardRecommendUins = new ArrayList<>();
        this.guildId = j;
        this.start = i;
        this.num = i2;
        this.filter = gProGetGuildRobotListFilter;
        this.channelId = j2;
        this.clientInfo = gProGuildRobotClientInfo;
        this.cardRecommendUins = arrayList;
    }
}
