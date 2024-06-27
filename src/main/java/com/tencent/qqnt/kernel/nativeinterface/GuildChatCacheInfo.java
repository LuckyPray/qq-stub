package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GuildChatCacheInfo.class */
public final class GuildChatCacheInfo {
    public long cacheSize;
    public ArrayList<GuildCategoryChatInfo> categoryList;
    public long chatTime;
    public long guildAvatarSeq;
    public long guildId;
    public String guildName;

    public GuildChatCacheInfo() {
        this.guildName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.categoryList = new ArrayList<>();
    }

    public long getCacheSize() {
        return this.cacheSize;
    }

    public ArrayList<GuildCategoryChatInfo> getCategoryList() {
        return this.categoryList;
    }

    public long getChatTime() {
        return this.chatTime;
    }

    public long getGuildAvatarSeq() {
        return this.guildAvatarSeq;
    }

    public long getGuildId() {
        return this.guildId;
    }

    public String getGuildName() {
        return this.guildName;
    }

    public String toString() {
        return "GuildChatCacheInfo{cacheSize=" + this.cacheSize + ",chatTime=" + this.chatTime + ",guildId=" + this.guildId + ",guildAvatarSeq=" + this.guildAvatarSeq + ",guildName=" + this.guildName + ",categoryList=" + this.categoryList + ",}";
    }

    public GuildChatCacheInfo(long j, long j2, long j3, long j4, String str, ArrayList<GuildCategoryChatInfo> arrayList) {
        this.guildName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.categoryList = new ArrayList<>();
        this.cacheSize = j;
        this.chatTime = j2;
        this.guildId = j3;
        this.guildAvatarSeq = j4;
        this.guildName = str;
        this.categoryList = arrayList;
    }
}
