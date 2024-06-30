package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GuildChannelChatInfo.class */
public final class GuildChannelChatInfo {
    public long cacheSize;
    public long channelId;
    public String channelName;
    public int channelType;
    public int textChannelSubtypeId;

    public GuildChannelChatInfo() {
        this.channelName = "";
    }

    public long getCacheSize() {
        return this.cacheSize;
    }

    public long getChannelId() {
        return this.channelId;
    }

    public String getChannelName() {
        return this.channelName;
    }

    public int getChannelType() {
        return this.channelType;
    }

    public int getTextChannelSubtypeId() {
        return this.textChannelSubtypeId;
    }

    public String toString() {
        return "GuildChannelChatInfo{channelType=" + this.channelType + ",textChannelSubtypeId=" + this.textChannelSubtypeId + ",channelId=" + this.channelId + ",cacheSize=" + this.cacheSize + ",channelName=" + this.channelName + ",}";
    }

    public GuildChannelChatInfo(int i, int i2, long j, long j2, String str) {
        this.channelName = "";
        this.channelType = i;
        this.textChannelSubtypeId = i2;
        this.channelId = j;
        this.cacheSize = j2;
        this.channelName = str;
    }
}
