package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GuildCategoryChatInfo.class */
public final class GuildCategoryChatInfo {
    public long categoryId;
    public String categoryName;
    public ArrayList<GuildChannelChatInfo> channelList;

    public GuildCategoryChatInfo() {
        this.categoryName = "";
        this.channelList = new ArrayList<>();
    }

    public long getCategoryId() {
        return this.categoryId;
    }

    public String getCategoryName() {
        return this.categoryName;
    }

    public ArrayList<GuildChannelChatInfo> getChannelList() {
        return this.channelList;
    }

    public String toString() {
        return "GuildCategoryChatInfo{categoryId=" + this.categoryId + ",categoryName=" + this.categoryName + ",channelList=" + this.channelList + ",}";
    }

    public GuildCategoryChatInfo(long j, String str, ArrayList<GuildChannelChatInfo> arrayList) {
        this.categoryName = "";
        this.channelList = new ArrayList<>();
        this.categoryId = j;
        this.categoryName = str;
        this.channelList = arrayList;
    }
}
