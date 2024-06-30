package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/AIOBindGuildInfo.class */
public final class AIOBindGuildInfo {
    public long faceSeq;
    public long guildId;
    public String guildName = "";
    public String guildNumber = "";
    public boolean isOwner;
    public int status;

    public long getFaceSeq() {
        return this.faceSeq;
    }

    public long getGuildId() {
        return this.guildId;
    }

    public String getGuildName() {
        return this.guildName;
    }

    public String getGuildNumber() {
        return this.guildNumber;
    }

    public boolean getIsOwner() {
        return this.isOwner;
    }

    public int getStatus() {
        return this.status;
    }

    public String toString() {
        return "AIOBindGuildInfo{guildId=" + this.guildId + ",guildName=" + this.guildName + ",guildNumber=" + this.guildNumber + ",faceSeq=" + this.faceSeq + ",isOwner=" + this.isOwner + ",status=" + this.status + ",}";
    }
}
