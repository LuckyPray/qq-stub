package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GProRobotGuildInfo.class */
public final class GProRobotGuildInfo {
    public long guildId;
    public byte[] guildName;
    public byte[] joinGuildSig;
    public String prefixText;

    public GProRobotGuildInfo() {
        this.guildName = new byte[0];
        this.joinGuildSig = new byte[0];
        this.prefixText = "";
    }

    public long getGuildId() {
        return this.guildId;
    }

    public byte[] getGuildName() {
        return this.guildName;
    }

    public byte[] getJoinGuildSig() {
        return this.joinGuildSig;
    }

    public String getPrefixText() {
        return this.prefixText;
    }

    public String toString() {
        return "GProRobotGuildInfo{guildId=" + this.guildId + ",guildName=" + this.guildName + ",joinGuildSig=" + this.joinGuildSig + ",prefixText=" + this.prefixText + ",}";
    }

    public GProRobotGuildInfo(long j, byte[] bArr, byte[] bArr2, String str) {
        this.guildName = new byte[0];
        this.joinGuildSig = new byte[0];
        this.prefixText = "";
        this.guildId = j;
        this.guildName = bArr;
        this.joinGuildSig = bArr2;
        this.prefixText = str;
    }
}
