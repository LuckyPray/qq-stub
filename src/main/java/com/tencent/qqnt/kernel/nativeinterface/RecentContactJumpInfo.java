package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/RecentContactJumpInfo.class */
public final class RecentContactJumpInfo {
    public int chatType;
    public String guildId;
    public int jumpType;
    public String peerUid;

    public RecentContactJumpInfo() {
        this.peerUid = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.guildId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public int getChatType() {
        return this.chatType;
    }

    public String getGuildId() {
        return this.guildId;
    }

    public int getJumpType() {
        return this.jumpType;
    }

    public String getPeerUid() {
        return this.peerUid;
    }

    public String toString() {
        return "RecentContactJumpInfo{peerUid=" + this.peerUid + ",guildId=" + this.guildId + ",chatType=" + this.chatType + ",jumpType=" + this.jumpType + ",}";
    }

    public RecentContactJumpInfo(String str, String str2, int i, int i2) {
        this.peerUid = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.guildId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.peerUid = str;
        this.guildId = str2;
        this.chatType = i;
        this.jumpType = i2;
    }
}
