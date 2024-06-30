package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/CommonBotInfo.class */
public final class CommonBotInfo {
    public long appid;
    public int inlineSearch;
    public long mark;
    public long tinyid;
    public long uin;
    public String name = "";
    public String uid = "";
    public String avatar = "";

    public long getAppid() {
        return this.appid;
    }

    public String getAvatar() {
        return this.avatar;
    }

    public int getInlineSearch() {
        return this.inlineSearch;
    }

    public long getMark() {
        return this.mark;
    }

    public String getName() {
        return this.name;
    }

    public long getTinyid() {
        return this.tinyid;
    }

    public String getUid() {
        return this.uid;
    }

    public long getUin() {
        return this.uin;
    }

    public String toString() {
        return "CommonBotInfo{tinyid=" + this.tinyid + ",uin=" + this.uin + ",name=" + this.name + ",inlineSearch=" + this.inlineSearch + ",appid=" + this.appid + ",mark=" + this.mark + ",uid=" + this.uid + ",avatar=" + this.avatar + ",}";
    }
}
