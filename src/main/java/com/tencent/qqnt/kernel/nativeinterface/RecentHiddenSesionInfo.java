package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/RecentHiddenSesionInfo.class */
public final class RecentHiddenSesionInfo {
    public int chatType;
    public boolean isHidden;
    public boolean isPushAVOnlineNotify;
    public boolean isPushOnlineNotify;
    public long msgTime;
    public String peerUid;
    public String peerUin;
    public long version;

    public RecentHiddenSesionInfo() {
        this.peerUid = "";
        this.peerUin = "";
    }

    public int getChatType() {
        return this.chatType;
    }

    public boolean getIsHidden() {
        return this.isHidden;
    }

    public boolean getIsPushAVOnlineNotify() {
        return this.isPushAVOnlineNotify;
    }

    public boolean getIsPushOnlineNotify() {
        return this.isPushOnlineNotify;
    }

    public long getMsgTime() {
        return this.msgTime;
    }

    public String getPeerUid() {
        return this.peerUid;
    }

    public String getPeerUin() {
        return this.peerUin;
    }

    public long getVersion() {
        return this.version;
    }

    public String toString() {
        return "RecentHiddenSesionInfo{peerUid=" + this.peerUid + ",peerUin=" + this.peerUin + ",chatType=" + this.chatType + ",isHidden=" + this.isHidden + ",isPushOnlineNotify=" + this.isPushOnlineNotify + ",isPushAVOnlineNotify=" + this.isPushAVOnlineNotify + ",msgTime=" + this.msgTime + ",version=" + this.version + ",}";
    }

    public RecentHiddenSesionInfo(String str, String str2, int i, boolean z, boolean z2, boolean z3, long j, long j2) {
        this.peerUid = "";
        this.peerUin = "";
        this.peerUid = str;
        this.peerUin = str2;
        this.chatType = i;
        this.isHidden = z;
        this.isPushOnlineNotify = z2;
        this.isPushAVOnlineNotify = z3;
        this.msgTime = j;
        this.version = j2;
    }
}
