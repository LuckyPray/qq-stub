package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/EmojiHotPicGetHotWordsReqBody.class */
public final class EmojiHotPicGetHotWordsReqBody {
    public int aioType;
    public long channelID;
    public String composeNick;
    public long groupCode;
    public String guestUid;
    public long guildID;
    public int pageIndex;
    public int pageSize;
    public int sceneType;
    public long srcUin;

    public EmojiHotPicGetHotWordsReqBody() {
    }

    public int getAioType() {
        return this.aioType;
    }

    public long getChannelID() {
        return this.channelID;
    }

    public String getComposeNick() {
        return this.composeNick;
    }

    public long getGroupCode() {
        return this.groupCode;
    }

    public String getGuestUid() {
        return this.guestUid;
    }

    public long getGuildID() {
        return this.guildID;
    }

    public int getPageIndex() {
        return this.pageIndex;
    }

    public int getPageSize() {
        return this.pageSize;
    }

    public int getSceneType() {
        return this.sceneType;
    }

    public long getSrcUin() {
        return this.srcUin;
    }

    public String toString() {
        return "EmojiHotPicGetHotWordsReqBody{srcUin=" + this.srcUin + ",pageSize=" + this.pageSize + ",pageIndex=" + this.pageIndex + ",sceneType=" + this.sceneType + ",aioType=" + this.aioType + ",guestUid=" + this.guestUid + ",groupCode=" + this.groupCode + ",guildID=" + this.guildID + ",channelID=" + this.channelID + ",composeNick=" + this.composeNick + ",}";
    }

    public EmojiHotPicGetHotWordsReqBody(long j, int i, int i2, int i3, int i4, String str, long j2, long j3, long j4, String str2) {
        this.srcUin = j;
        this.pageSize = i;
        this.pageIndex = i2;
        this.sceneType = i3;
        this.aioType = i4;
        this.guestUid = str;
        this.groupCode = j2;
        this.guildID = j3;
        this.channelID = j4;
        this.composeNick = str2;
    }
}
