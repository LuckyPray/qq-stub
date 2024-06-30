package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/BasicChatCacheInfo.class */
public final class BasicChatCacheInfo {
    public long chatSize;
    public long chatTime;
    public String nickName;
    public String remarkName;
    public String uid;
    public long uin;

    public BasicChatCacheInfo() {
        this.uid = "";
        this.remarkName = "";
        this.nickName = "";
    }

    public long getChatSize() {
        return this.chatSize;
    }

    public long getChatTime() {
        return this.chatTime;
    }

    public String getNickName() {
        return this.nickName;
    }

    public String getRemarkName() {
        return this.remarkName;
    }

    public String getUid() {
        return this.uid;
    }

    public long getUin() {
        return this.uin;
    }

    public String toString() {
        return "BasicChatCacheInfo{chatSize=" + this.chatSize + ",chatTime=" + this.chatTime + ",uid=" + this.uid + ",uin=" + this.uin + ",remarkName=" + this.remarkName + ",nickName=" + this.nickName + ",}";
    }

    public BasicChatCacheInfo(long j, long j2, String str, long j3, String str2, String str3) {
        this.uid = "";
        this.remarkName = "";
        this.nickName = "";
        this.chatSize = j;
        this.chatTime = j2;
        this.uid = str;
        this.uin = j3;
        this.remarkName = str2;
        this.nickName = str3;
    }
}
