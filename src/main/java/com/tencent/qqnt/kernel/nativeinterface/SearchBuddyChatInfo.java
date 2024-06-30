package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/SearchBuddyChatInfo.class */
public final class SearchBuddyChatInfo {
    public long peerUin;
    public String categoryName = "";
    public String peerUid = "";
    public String peerNick = "";
    public String remark = "";

    public String getCategoryName() {
        return this.categoryName;
    }

    public String getPeerNick() {
        return this.peerNick;
    }

    public String getPeerUid() {
        return this.peerUid;
    }

    public long getPeerUin() {
        return this.peerUin;
    }

    public String getRemark() {
        return this.remark;
    }

    public String toString() {
        return "SearchBuddyChatInfo{categoryName=" + this.categoryName + ",peerUid=" + this.peerUid + ",peerUin=" + this.peerUin + ",peerNick=" + this.peerNick + ",remark=" + this.remark + ",}";
    }
}
