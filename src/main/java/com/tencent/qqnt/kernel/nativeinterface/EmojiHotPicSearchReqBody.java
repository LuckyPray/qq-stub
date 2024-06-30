package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/EmojiHotPicSearchReqBody.class */
public final class EmojiHotPicSearchReqBody {
    public int aioType;
    public long channelID;
    public long groupCode;
    public String guestUid;
    public long guildID;
    public boolean isSupportCompose;
    public boolean isSupportMall;
    public int pageIndex;
    public int pageSize;
    public int sceneType;
    public byte[] sessionInfo;
    public long srcUin;
    public String userText;

    public EmojiHotPicSearchReqBody() {
        this.userText = "";
    }

    public int getAioType() {
        return this.aioType;
    }

    public long getChannelID() {
        return this.channelID;
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

    public boolean getIsSupportCompose() {
        return this.isSupportCompose;
    }

    public boolean getIsSupportMall() {
        return this.isSupportMall;
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

    public byte[] getSessionInfo() {
        return this.sessionInfo;
    }

    public long getSrcUin() {
        return this.srcUin;
    }

    public String getUserText() {
        return this.userText;
    }

    public String toString() {
        return "EmojiHotPicSearchReqBody{srcUin=" + this.srcUin + ",userText=" + this.userText + ",pageSize=" + this.pageSize + ",pageIndex=" + this.pageIndex + ",sessionInfo=" + this.sessionInfo + ",sceneType=" + this.sceneType + ",aioType=" + this.aioType + ",guestUid=" + this.guestUid + ",groupCode=" + this.groupCode + ",guildID=" + this.guildID + ",channelID=" + this.channelID + ",isSupportCompose=" + this.isSupportCompose + ",isSupportMall=" + this.isSupportMall + ",}";
    }

    public EmojiHotPicSearchReqBody(long j, String str, int i, int i2, byte[] bArr, int i3, int i4, String str2, long j2, long j3, long j4, boolean z) {
        this.userText = "";
        this.srcUin = j;
        this.userText = str;
        this.pageSize = i;
        this.pageIndex = i2;
        this.sessionInfo = bArr;
        this.sceneType = i3;
        this.aioType = i4;
        this.guestUid = str2;
        this.groupCode = j2;
        this.guildID = j3;
        this.channelID = j4;
        this.isSupportCompose = z;
    }
}
