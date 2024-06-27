package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/ChatCacheInfo.class */
public final class ChatCacheInfo {
    public BasicChatCacheInfo basicChatCacheInfo;
    public int chatType;
    public GuildChatCacheInfo guildChatCacheInfo;

    public ChatCacheInfo() {
        this.basicChatCacheInfo = new BasicChatCacheInfo();
        this.guildChatCacheInfo = new GuildChatCacheInfo();
    }

    public BasicChatCacheInfo getBasicChatCacheInfo() {
        return this.basicChatCacheInfo;
    }

    public int getChatType() {
        return this.chatType;
    }

    public GuildChatCacheInfo getGuildChatCacheInfo() {
        return this.guildChatCacheInfo;
    }

    public String toString() {
        return "ChatCacheInfo{chatType=" + this.chatType + ",basicChatCacheInfo=" + this.basicChatCacheInfo + ",guildChatCacheInfo=" + this.guildChatCacheInfo + ",}";
    }

    public ChatCacheInfo(int i, BasicChatCacheInfo basicChatCacheInfo, GuildChatCacheInfo guildChatCacheInfo) {
        this.basicChatCacheInfo = new BasicChatCacheInfo();
        this.guildChatCacheInfo = new GuildChatCacheInfo();
        this.chatType = i;
        this.basicChatCacheInfo = basicChatCacheInfo;
        this.guildChatCacheInfo = guildChatCacheInfo;
    }
}
