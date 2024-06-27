package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/SearchGuildJump.class */
public final class SearchGuildJump {
    public long guildId;
    public String joinGuildSig = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public int joinStatus;

    public long getGuildId() {
        return this.guildId;
    }

    public String getJoinGuildSig() {
        return this.joinGuildSig;
    }

    public int getJoinStatus() {
        return this.joinStatus;
    }

    public String toString() {
        return "SearchGuildJump{guildId=" + this.guildId + ",joinGuildSig=" + this.joinGuildSig + ",joinStatus=" + this.joinStatus + ",}";
    }
}
