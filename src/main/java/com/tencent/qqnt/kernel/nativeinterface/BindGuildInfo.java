package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/BindGuildInfo.class */
public final class BindGuildInfo {
    public long faceSeq;
    public long guildId;
    public String guildName = "";
    public String guildNumber = "";
    public String joinSig = "";

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

    public String getJoinSig() {
        return this.joinSig;
    }

    public String toString() {
        return "BindGuildInfo{guildId=" + this.guildId + ",guildName=" + this.guildName + ",faceSeq=" + this.faceSeq + ",guildNumber=" + this.guildNumber + ",joinSig=" + this.joinSig + ",}";
    }
}
